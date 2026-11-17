package X;

import androidx.compose.runtime.LaunchedEffectImpl;
import java.util.Arrays;

/* renamed from: X.78e, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C78e {
    public static final C0Yr A00 = new C0Yr();

    public static final void A02(BFM bfm, Object obj, Object obj2, Object obj3, G0V g0v) {
        C78T c78t = ((BBI) bfm).A0g;
        boolean zA1R = AnonymousClass005.A1R(bfm, obj, obj2, obj3);
        Object objAaT = bfm.AaT();
        if (zA1R || objAaT == C78N.A00) {
            bfm.Ai0(new LaunchedEffectImpl(c78t, g0v));
        }
    }

    public static final void A04(BFM bfm, Object obj, Object obj2, G0V g0v) {
        C78T c78t = ((BBI) bfm).A0g;
        boolean zA65 = bfm.A65(obj) | bfm.A65(obj2);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            bfm.Ai0(new LaunchedEffectImpl(c78t, g0v));
        }
    }

    public static final void A06(BFM bfm, Object obj, G0V g0v) {
        C78T c78t = ((BBI) bfm).A0g;
        boolean zA65 = bfm.A65(obj);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            bfm.Ai0(new LaunchedEffectImpl(c78t, g0v));
        }
    }

    public static final void A07(BFM bfm, G0U g0u, Object[] objArr) {
        boolean zA65 = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zA65 |= bfm.A65(obj);
        }
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            bfm.Ai0(new C78f(g0u));
        }
    }

    public static final void A08(BFM bfm, G0V g0v, Object[] objArr) {
        C78T c78t = ((BBI) bfm).A0g;
        boolean zA65 = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zA65 |= bfm.A65(obj);
        }
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            bfm.Ai0(new LaunchedEffectImpl(c78t, g0v));
        }
    }

    public static final C3UX A00(BFM bfm, C78T c78t) {
        if (c78t.get(HoC.A00) == null) {
            return new C067078j(((BBI) bfm).A0g, c78t);
        }
        C9250GBd c9250GBd = new C9250GBd(null);
        c9250GBd.A0R(new C10474Hkl(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"), false));
        return Hxb.A02(c9250GBd);
    }

    public static final void A01(BFM bfm, Object obj, Object obj2, Object obj3, G0U g0u) {
        boolean zA65 = bfm.A65(obj) | bfm.A65(obj2) | bfm.A65(obj3);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            bfm.Ai0(new C78f(g0u));
        }
    }

    public static final void A03(BFM bfm, Object obj, Object obj2, G0U g0u) {
        boolean zA65 = bfm.A65(obj) | bfm.A65(obj2);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            bfm.Ai0(new C78f(g0u));
        }
    }

    public static final void A05(BFM bfm, Object obj, G0U g0u) {
        boolean zA65 = bfm.A65(obj);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            bfm.Ai0(new C78f(g0u));
        }
    }
}
