package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DispatchException;

/* loaded from: classes6.dex */
public abstract class GBN<T> extends GCH {
    public static final String __redex_internal_original_name = "DispatchedTask";
    public int A00;

    public abstract Object A0B();

    public abstract HtJ<T> A0E();

    public final void A09(Throwable th) {
        if (!(this instanceof GBL)) {
            return;
        }
        GBL gbl = (GBL) this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GBL.A04;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(gbl);
            if (obj instanceof G6I) {
                throw C3cG.A0Q("Not completed");
            }
            if (obj instanceof C10474Hkl) {
                return;
            }
            if (obj instanceof GBW) {
                GBW gbw = (GBW) obj;
                if (gbw.A02 != null) {
                    throw C3cG.A0Q("Must be called at most once");
                }
                Object obj2 = gbw.A01;
                HpO hpO = gbw.A04;
                G0W g0w = gbw.A03;
                if (AbstractC5217DdT.A00(gbl, obj, new GBW(obj2, gbw.A00, th, g0w, hpO), atomicReferenceFieldUpdater)) {
                    if (hpO != null) {
                        gbl.A0L(th, hpO);
                    }
                    if (g0w != null) {
                        gbl.A0K(obj2, th, g0w);
                        return;
                    }
                    return;
                }
            } else if (AbstractC5217DdT.A00(gbl, obj, new GBW(obj, null, th, null, null), atomicReferenceFieldUpdater)) {
                return;
            }
        }
    }

    public final void A0A(Throwable th) {
        HwS.A00(A0E().getContext(), new GC6(AnonymousClass001.A0v(". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", C3cG.A0f(this, "Fatal exception in coroutines machinery for ")), th));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T A0C(Object obj) {
        return obj;
    }

    public Throwable A0D(Object obj) {
        C10474Hkl c10474Hkl;
        if (!(obj instanceof C10474Hkl) || (c10474Hkl = (C10474Hkl) obj) == null) {
            return null;
        }
        return c10474Hkl.A00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HoC hoC;
        try {
            HtJ<T> htJA0E = A0E();
            C7384Etj.A0Z(htJA0E, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            GBJ gbj = (GBJ) htJA0E;
            HtJ<T> htJ = gbj.A02;
            Object obj = gbj.A01;
            C78T context = htJ.getContext();
            Object objA00 = GCA.A00(obj, context);
            GAp gApA03 = objA00 != GCA.A00 ? GAr.A03(objA00, htJ, context) : null;
            try {
                C78T context2 = htJ.getContext();
                Object objA0B = A0B();
                Throwable thA0D = A0D(objA0B);
                if (thA0D == null) {
                    int i = this.A00;
                    if ((i != 1 && i != 2) || (hoC = (HoC) context2.get(HoC.A00)) == null || hoC.isActive()) {
                        htJ.resumeWith(A0C(objA0B));
                    } else {
                        CancellationException cancellationExceptionADQ = hoC.ADQ();
                        A09(cancellationExceptionADQ);
                        C7384Etj.A0Y(cancellationExceptionADQ, 0);
                        htJ.resumeWith(C3cG.A0s(cancellationExceptionADQ));
                    }
                } else {
                    htJ.resumeWith(new C10571Hud(thA0D));
                }
            } finally {
                if (gApA03 == null || gApA03.A0Y()) {
                    GCA.A02(objA00, context);
                }
            }
        } catch (DispatchException e) {
            HwS.A00(A0E().getContext(), e.cause);
        } catch (Throwable th) {
            A0A(th);
        }
    }
}
