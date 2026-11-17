package X;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes5.dex */
public final class Dd5<T> {
    public static Executor A04 = Executors.newCachedThreadPool(new CVK());
    public final Set<InterfaceC5174DbF<T>> A02 = new LinkedHashSet(1);
    public final Set<InterfaceC5174DbF<Throwable>> A01 = new LinkedHashSet(1);
    public final Handler A00 = C60O.A02();
    public volatile C5195Dd7<T> A03 = null;

    /* JADX WARN: Incorrect return type in method signature: (LX/DbF<Ljava/lang/Throwable;>;)LX/Dd5<TT;>; */
    public final synchronized void A02(InterfaceC5174DbF interfaceC5174DbF) {
        Throwable th;
        C5195Dd7<T> c5195Dd7 = this.A03;
        if (c5195Dd7 != null && (th = c5195Dd7.A01) != null) {
            interfaceC5174DbF.onResult(th);
        }
        this.A01.add(interfaceC5174DbF);
    }

    /* JADX WARN: Incorrect return type in method signature: (LX/DbF<TT;>;)LX/Dd5<TT;>; */
    public final synchronized void A03(InterfaceC5174DbF interfaceC5174DbF) {
        T t;
        C5195Dd7<T> c5195Dd7 = this.A03;
        if (c5195Dd7 != null && (t = c5195Dd7.A00) != null) {
            interfaceC5174DbF.onResult(t);
        }
        this.A02.add(interfaceC5174DbF);
    }

    public static void A00(C5195Dd7 c5195Dd7, final Dd5 dd5) {
        if (dd5.A03 != null) {
            throw C3cG.A0Q("A task may only be set once.");
        }
        dd5.A03 = c5195Dd7;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            A01(dd5);
        } else {
            dd5.A00.post(new Runnable() { // from class: X.Dd8
                public static final String __redex_internal_original_name = "LottieTask$$ExternalSyntheticLambda0";

                @Override // java.lang.Runnable
                public final void run() {
                    Dd5.A01(this.A00);
                }
            });
        }
    }

    public static void A01(Dd5 dd5) {
        C5195Dd7<T> c5195Dd7 = dd5.A03;
        if (c5195Dd7 != null) {
            T t = c5195Dd7.A00;
            if (t != null) {
                synchronized (dd5) {
                    Iterator itA0z = BV5.A0z(dd5.A02);
                    while (itA0z.hasNext()) {
                        ((InterfaceC5174DbF) itA0z.next()).onResult(t);
                    }
                }
            }
            Throwable th = c5195Dd7.A01;
            synchronized (dd5) {
                ArrayList arrayListA0t = BV4.A0t(dd5.A01);
                if (arrayListA0t.isEmpty()) {
                    BXP.A01("Lottie encountered an error but no failure listener was added:", th);
                } else {
                    Iterator it = arrayListA0t.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC5174DbF) it.next()).onResult(th);
                    }
                }
            }
        }
    }

    public Dd5(Callable<C5195Dd7<T>> callable) {
        Executor executor = A04;
        C5194Dd6 c5194Dd6 = new C5194Dd6(callable);
        c5194Dd6.A00 = this;
        executor.execute(c5194Dd6);
    }

    public Dd5(T t) {
        A00(new C5195Dd7(t), this);
    }
}
