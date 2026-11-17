package X;

import com.facebook.aura.localbrowser.LocalBrowserCapacityKt;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.DispatchException;

/* loaded from: classes6.dex */
public abstract class GBI {
    public static final HrH A01 = HrH.A00("UNDEFINED");
    public static final HrH A00 = HrH.A00("REUSABLE_CLAIMED");

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void A00(HtJ<? super T> htJ, Object obj) {
        if (!(obj instanceof GBJ)) {
            obj.resumeWith(htJ);
            return;
        }
        GBJ gbj = (GBJ) obj;
        Object c10474Hkl = htJ;
        Throwable thA00 = HsJ.A00(htJ);
        if (thA00 != null) {
            c10474Hkl = new C10474Hkl(thA00, false);
        }
        GBK gbk = gbj.A03;
        HtJ<T> htJ2 = gbj.A02;
        if (A02(htJ2.getContext(), gbk)) {
            gbj.A00 = c10474Hkl;
            ((GBN) gbj).A00 = 1;
            A01(gbj, htJ2.getContext(), gbk);
            return;
        }
        GB7 gb7A00 = AbstractC9246GAy.A00();
        long j = gb7A00.A00;
        if (j >= LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES) {
            gbj.A00 = c10474Hkl;
            ((GBN) gbj).A00 = 1;
            gb7A00.A03(gbj);
            return;
        }
        gb7A00.A00 = j + LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES;
        try {
            HoC hoC = (HoC) htJ2.getContext().get(HoC.A00);
            if (hoC == null || hoC.isActive()) {
                Object obj2 = gbj.A01;
                C78T context = htJ2.getContext();
                Object objA00 = GCA.A00(obj2, context);
                GAp gApA03 = objA00 != GCA.A00 ? GAr.A03(objA00, htJ2, context) : null;
                try {
                    htJ2.resumeWith(htJ);
                    if (gApA03 == null || gApA03.A0Y()) {
                        GCA.A02(objA00, context);
                    }
                } catch (Throwable th) {
                    if (gApA03 == null || gApA03.A0Y()) {
                        GCA.A02(objA00, context);
                    }
                    throw th;
                }
            } else {
                CancellationException cancellationExceptionADQ = hoC.ADQ();
                gbj.A09(cancellationExceptionADQ);
                C7384Etj.A0Y(cancellationExceptionADQ, 0);
                gbj.resumeWith(C3cG.A0s(cancellationExceptionADQ));
            }
            while (gb7A00.A05()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void A01(Runnable runnable, C78T c78t, GBK gbk) throws DispatchException {
        try {
            gbk.dispatch(c78t, runnable);
        } catch (Throwable th) {
            throw new DispatchException(th, c78t, gbk);
        }
    }

    public static final boolean A02(C78T c78t, GBK gbk) throws DispatchException {
        try {
            return gbk.isDispatchNeeded(c78t);
        } catch (Throwable th) {
            throw new DispatchException(th, c78t, gbk);
        }
    }
}
