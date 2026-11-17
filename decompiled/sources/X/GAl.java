package X;

import kotlin.Unit;
import kotlinx.coroutines.DispatchException;

/* loaded from: classes6.dex */
public abstract class GAl {
    /* JADX WARN: Incorrect types in method signature: <R:Ljava/lang/Object;T:Ljava/lang/Object;>(LX/G0V<-TR;-LX/HtJ<-TT;>;+Ljava/lang/Object;>;TR;LX/HtJ<-TT;>;)V */
    public static final void A00(Object obj, HtJ htJ, G0V g0v) {
        try {
            GBI.A00(Unit.INSTANCE, C7Bm.A02(C7Bm.A01(obj, htJ, g0v)));
        } catch (Throwable th) {
            th = th;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).cause;
            }
            C7384Etj.A0Y(th, 0);
            htJ.resumeWith(C3cG.A0s(th));
            throw th;
        }
    }

    public static final void A01(HtJ<? super Unit> htJ, HtJ<?> htJ2) throws Throwable {
        try {
            GBI.A00(Unit.INSTANCE, C7Bm.A02(htJ));
        } catch (Throwable th) {
            th = th;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).cause;
            }
            C7384Etj.A0Y(th, 0);
            htJ2.resumeWith(C3cG.A0s(th));
            throw th;
        }
    }
}
