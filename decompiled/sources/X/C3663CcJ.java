package X;

import android.os.Handler;
import android.os.Looper;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;

/* renamed from: X.CcJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3663CcJ {
    public static C3663CcJ A01;
    public static final Object A02 = C3cG.A0T();
    public final Handler A00;

    public static C3663CcJ A00() {
        C3663CcJ c3663CcJ;
        synchronized (A02) {
            c3663CcJ = A01;
            if (c3663CcJ == null) {
                c3663CcJ = new C3663CcJ(BV5.A0C("MLHandler", 9).getLooper());
                A01 = c3663CcJ;
            }
        }
        return c3663CcJ;
    }

    public final <ResultT> CSA<ResultT> A01(final Callable<ResultT> callable) {
        final CSE cse = new CSE();
        EnumC3664CcK.A01.execute(new Runnable() { // from class: X.CRk
            public static final String __redex_internal_original_name = "zzf";

            @Override // java.lang.Runnable
            public final void run() {
                MlKitException e;
                Callable callable2 = callable;
                CSE cse2 = cse;
                try {
                    cse2.A02(callable2.call());
                } catch (MlKitException e2) {
                    e = e2;
                    cse2.A00.A0F(e);
                } catch (Exception e3) {
                    e = new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e3);
                    cse2.A00.A0F(e);
                }
            }
        });
        return cse.A00;
    }

    public C3663CcJ(Looper looper) {
        HandlerC3087Bxq handlerC3087Bxq = new HandlerC3087Bxq(looper);
        Looper.getMainLooper();
        this.A00 = handlerC3087Bxq;
    }
}
