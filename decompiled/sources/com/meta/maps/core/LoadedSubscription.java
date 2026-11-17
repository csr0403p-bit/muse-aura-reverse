package com.meta.maps.core;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.C0881AGi;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class LoadedSubscription implements AutoCloseable {
    public final List<AutoCloseable> children;
    public Thread deliveringThread;
    public CountDownLatch deliveryDone;
    public final Object lock;
    public Function0<Unit> pendingCallback;
    public int remaining;
    public State state;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class State {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ State[] $VALUES;
        public static final State DELIVERING;
        public static final State FINISHED;
        public static final State OPEN;

        static {
            State state = new State("OPEN", 0);
            OPEN = state;
            State state2 = new State("DELIVERING", 1);
            DELIVERING = state2;
            State state3 = new State("FINISHED", 2);
            FINISHED = state3;
            State[] stateArr = {state, state2, state3};
            $VALUES = stateArr;
            $ENTRIES = C3cG.A0w(stateArr);
        }

        public static Ey9<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        public State(String str, int i) {
        }
    }

    public LoadedSubscription(int i, Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 1);
        this.lock = C3cG.A0T();
        this.children = C3cG.A0h();
        this.remaining = i;
        this.pendingCallback = function0;
        this.state = State.OPEN;
    }

    private final void awaitUninterruptibly(CountDownLatch countDownLatch) {
        boolean z = false;
        while (true) {
            try {
                countDownLatch.await();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private final void deliver() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.lock) {
            if (this.state != State.OPEN) {
                return;
            }
            this.state = State.DELIVERING;
            this.deliveringThread = Thread.currentThread();
            this.deliveryDone = countDownLatch;
            Function0<Unit> function0 = this.pendingCallback;
            this.pendingCallback = null;
            List listA0X = AbstractC0878AGe.A0X(this.children);
            this.children.clear();
            try {
                Iterator it = listA0X.iterator();
                while (it.hasNext()) {
                    closeQuietly((AutoCloseable) it.next());
                }
                if (function0 != null) {
                    try {
                        function0.invoke();
                    } catch (Throwable th) {
                        Log.e("MapsSDK", "onLoaded callback threw", th);
                    }
                }
                synchronized (this.lock) {
                    this.state = State.FINISHED;
                    this.deliveringThread = null;
                    this.deliveryDone = null;
                }
                countDownLatch.countDown();
            } catch (Throwable th2) {
                synchronized (this.lock) {
                    this.state = State.FINISHED;
                    this.deliveringThread = null;
                    this.deliveryDone = null;
                    countDownLatch.countDown();
                    throw th2;
                }
            }
        }
    }

    public final void attach(AutoCloseable autoCloseable) {
        boolean zA1Z;
        C7384Etj.A0Y(autoCloseable, 0);
        synchronized (this.lock) {
            State state = this.state;
            State state2 = State.OPEN;
            if (state == state2) {
                this.children.add(autoCloseable);
            }
            zA1Z = AnonymousClass002.A1Z(this.state, state2);
        }
        if (zA1Z) {
            return;
        }
        closeQuietly(autoCloseable);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        CountDownLatch countDownLatch;
        List listA0X = C0881AGi.A00;
        synchronized (this.lock) {
            State state = this.state;
            if (state == State.OPEN) {
                this.state = State.FINISHED;
                countDownLatch = null;
                this.pendingCallback = null;
                listA0X = AbstractC0878AGe.A0X(this.children);
                this.children.clear();
            } else if (state != State.DELIVERING || this.deliveringThread == Thread.currentThread()) {
                return;
            } else {
                countDownLatch = this.deliveryDone;
            }
            Iterator it = listA0X.iterator();
            while (it.hasNext()) {
                closeQuietly((AutoCloseable) it.next());
            }
            if (countDownLatch != null) {
                awaitUninterruptibly(countDownLatch);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void deliverIfReady() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.lock
            monitor-enter(r2)
            com.meta.maps.core.LoadedSubscription$State r1 = r3.state     // Catch: java.lang.Throwable -> L16
            com.meta.maps.core.LoadedSubscription$State r0 = com.meta.maps.core.LoadedSubscription.State.OPEN     // Catch: java.lang.Throwable -> L16
            if (r1 != r0) goto Le
            int r1 = r3.remaining     // Catch: java.lang.Throwable -> L16
            r0 = 1
            if (r1 <= 0) goto Lf
        Le:
            r0 = 0
        Lf:
            monitor-exit(r2)
            if (r0 == 0) goto L15
            r3.deliver()
        L15:
            return
        L16:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.maps.core.LoadedSubscription.deliverIfReady():void");
    }

    public final void onModuleLoaded() {
        synchronized (this.lock) {
            if (this.state != State.OPEN) {
                return;
            }
            int i = this.remaining - 1;
            this.remaining = i;
            boolean z = i <= 0;
            if (z) {
                deliver();
            }
        }
    }

    private final void closeQuietly(AutoCloseable autoCloseable) {
        try {
            autoCloseable.close();
        } catch (Throwable th) {
            Log.e("MapsSDK", "failed to close a module subscription", th);
        }
    }
}
