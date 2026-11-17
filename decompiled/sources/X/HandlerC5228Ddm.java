package X;

import X.InterfaceC5231Ddp;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import java.io.IOException;

/* renamed from: X.Ddm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class HandlerC5228Ddm<T extends InterfaceC5231Ddp> extends Handler implements Runnable {
    public static final String __redex_internal_original_name = "Loader$LoadTask";
    public int A00;
    public IOException A01;
    public InterfaceC5229Ddn<T> A02;
    public Thread A03;
    public boolean A04;
    public final int A05;
    public final long A06;
    public final T A07;
    public volatile boolean A08;
    public final /* synthetic */ C5342Dgl A09;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        if (this.A08) {
            return;
        }
        int i = message.what;
        if (i != 1) {
            if (i == 4) {
                throw ((Throwable) message.obj);
            }
            C5342Dgl c5342Dgl = this.A09;
            c5342Dgl.A00 = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.A06;
            InterfaceC5229Ddn<T> interfaceC5229Ddn = this.A02;
            interfaceC5229Ddn.getClass();
            if (this.A04) {
                interfaceC5229Ddn.ATt(this.A07, jElapsedRealtime, false);
                return;
            }
            int i2 = message.what;
            if (i2 == 2) {
                try {
                    interfaceC5229Ddn.ATu(this.A07, jElapsedRealtime, j);
                    return;
                } catch (RuntimeException e) {
                    CNC.A05("LoadTask", "Unexpected exception handling load completed", e);
                    c5342Dgl.A01 = new Loader$UnexpectedLoaderException(e);
                    return;
                }
            }
            if (i2 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.A01 = iOException;
            int i3 = this.A00 + 1;
            this.A00 = i3;
            C5230Ddo c5230DdoATv = interfaceC5229Ddn.ATv(this.A07, iOException, i3, jElapsedRealtime, j);
            int i4 = c5230DdoATv.A00;
            if (i4 == 3) {
                c5342Dgl.A01 = this.A01;
                return;
            }
            if (i4 == 2) {
                return;
            }
            if (i4 == 1) {
                this.A00 = 1;
            }
            long jMin = c5230DdoATv.A01;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.A00 - 1) * 1000, 5000);
            }
            C1G.A08(AnonymousClass002.A1Y(c5342Dgl.A00));
            c5342Dgl.A00 = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(1, jMin);
                return;
            }
        }
        A00(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HandlerC5228Ddm(Looper looper, Looper looper2, T t, InterfaceC5229Ddn<T> interfaceC5229Ddn, int i, long j) {
        super(looper);
        this.A09 = interfaceC5229Ddn;
        this.A07 = t;
        this.A02 = looper2;
        this.A05 = i;
        this.A06 = j;
    }

    public final void A01(boolean z) {
        this.A08 = z;
        this.A01 = null;
        if (hasMessages(1)) {
            this.A04 = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
                return;
            }
        } else {
            synchronized (this) {
                this.A04 = true;
                this.A07.A5z();
                Thread thread = this.A03;
                if (thread != null) {
                    thread.interrupt();
                }
            }
            if (!z) {
                return;
            }
        }
        this.A09.A00 = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InterfaceC5229Ddn<T> interfaceC5229Ddn = this.A02;
        interfaceC5229Ddn.getClass();
        interfaceC5229Ddn.ATt(this.A07, jElapsedRealtime, true);
        this.A02 = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                try {
                    z = this.A04;
                    this.A03 = Thread.currentThread();
                } finally {
                }
            }
            if (!z) {
                T t = this.A07;
                C0Q.A01(FGI.A0M("load:", C3cI.A0Y(t)));
                try {
                    t.APf();
                    C0Q.A00();
                } catch (Throwable th) {
                    C0Q.A00();
                    throw th;
                }
            }
            synchronized (this) {
                try {
                    this.A03 = null;
                    Thread.interrupted();
                } finally {
                }
            }
            if (this.A08) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.A08) {
                return;
            }
            BV6.A10(this, e, 3);
        } catch (OutOfMemoryError e2) {
            if (this.A08) {
                return;
            }
            CNC.A05("LoadTask", "OutOfMemory error loading stream", e2);
            BV6.A10(this, new Loader$UnexpectedLoaderException(e2), 3);
        } catch (Error e3) {
            if (!this.A08) {
                CNC.A05("LoadTask", "Unexpected error loading stream", e3);
                BV6.A10(this, e3, 4);
            }
            throw e3;
        } catch (Exception e4) {
            if (this.A08) {
                return;
            }
            CNC.A05("LoadTask", "Unexpected exception loading stream", e4);
            BV6.A10(this, new Loader$UnexpectedLoaderException(e4), 3);
        }
    }

    public static void A00(HandlerC5228Ddm handlerC5228Ddm) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InterfaceC5229Ddn<T> interfaceC5229Ddn = handlerC5228Ddm.A02;
        interfaceC5229Ddn.getClass();
        interfaceC5229Ddn.ATx(handlerC5228Ddm.A07, handlerC5228Ddm.A00, jElapsedRealtime);
        handlerC5228Ddm.A01 = null;
        C5342Dgl c5342Dgl = handlerC5228Ddm.A09;
        InterfaceExecutorC5232Ddq interfaceExecutorC5232Ddq = c5342Dgl.A02;
        HandlerC5228Ddm<? extends InterfaceC5231Ddp> handlerC5228Ddm2 = c5342Dgl.A00;
        handlerC5228Ddm2.getClass();
        interfaceExecutorC5232Ddq.execute(handlerC5228Ddm2);
    }
}
