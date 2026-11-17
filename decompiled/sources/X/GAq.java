package X;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlinx.coroutines.DispatchException;

/* loaded from: classes6.dex */
public abstract class GAq<T> extends GBM implements HoC, HtJ<T>, C3UX {
    public final C78T A00;

    @Override // X.GBM
    public final void A0K(Object obj) {
        if (!(obj instanceof C10474Hkl)) {
            A0T();
        } else {
            C10474Hkl c10474Hkl = (C10474Hkl) obj;
            A0W(c10474Hkl.A00, C10474Hkl.A01.get(c10474Hkl) == 1);
        }
    }

    public void A0T() {
    }

    @Override // X.C3UX
    public final C78T AEA() {
        return this.A00;
    }

    @Override // X.HtJ
    public final C78T getContext() {
        return this.A00;
    }

    public GAq(C78T c78t, boolean z) {
        this._state$volatile = z ? AbstractC9251GBe.A00 : AbstractC9251GBe.A01;
        A0M((HoC) c78t.get(HoC.A00));
        this.A00 = c78t.plus(this);
    }

    @Override // X.GBM
    public final String A0F() {
        return FGI.A0M(C3cI.A0Y(this), " was cancelled");
    }

    public final void A0U(Integer num, Object obj, G0V g0v) {
        Object objA0s;
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            GAl.A00(obj, this, g0v);
            return;
        }
        if (iIntValue == 2) {
            C7384Etj.A0Y(g0v, 0);
            C7Bm.A02(C7Bm.A01(obj, this, g0v)).resumeWith(Unit.INSTANCE);
            return;
        }
        if (iIntValue != 3) {
            if (iIntValue != 1) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        try {
            C78T c78t = this.A00;
            Object objA00 = GCA.A00(null, c78t);
            try {
                if (g0v instanceof AbstractC8884Fsp) {
                    C0862A6j.A02(g0v, 2);
                    objA0s = g0v.invoke(obj, this);
                } else {
                    objA0s = C7Bm.A00(obj, this, g0v);
                }
                if (objA0s == EnumC10460Hji.A02) {
                    return;
                }
            } finally {
                GCA.A02(objA00, c78t);
            }
        } catch (Throwable th) {
            th = th;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).cause;
            }
            C7384Etj.A0Y(th, 0);
            objA0s = C3cG.A0s(th);
        }
        resumeWith(objA0s);
    }

    @Override // X.HtJ
    public final void resumeWith(Object obj) {
        Throwable thA00 = HsJ.A00(obj);
        if (thA00 != null) {
            obj = new C10474Hkl(thA00, false);
        }
        Object objA0D = A0D(obj);
        if (objA0D != AbstractC9251GBe.A04) {
            A0V(objA0D);
        }
    }

    public void A0V(Object obj) {
        A0J(obj);
    }

    public void A0W(Throwable th, boolean z) {
    }
}
