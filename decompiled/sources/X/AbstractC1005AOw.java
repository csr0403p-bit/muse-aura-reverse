package X;

import java.util.Map;

/* renamed from: X.AOw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1005AOw {
    public static final AaC A00;
    public static final Map<C31w<?, ?>, Float> A01;

    static {
        Float fValueOf = Float.valueOf(1.0f);
        A00 = new AaC(1.0f, 1.0f, 1.0f, 1.0f);
        HxE hxEA0r = C3cG.A0r(AVd.A05, fValueOf);
        HxE hxEA0r2 = C3cG.A0r(AVd.A04, fValueOf);
        HxE hxEA0r3 = C3cG.A0r(AVd.A03, fValueOf);
        HxE hxEA0r4 = C3cG.A0r(AVd.A02, Float.valueOf(0.01f));
        HxE hxEA0r5 = C3cG.A0r(AVd.A07, fValueOf);
        HxE hxEA0r6 = C3cG.A0r(AVd.A08, fValueOf);
        HxE hxEA0r7 = C3cG.A0r(AVd.A06, fValueOf);
        C31w<C1DG, AOW> c31w = AVd.A01;
        Float fValueOf2 = Float.valueOf(0.4f);
        A01 = AGH.A0D(hxEA0r, hxEA0r2, hxEA0r3, hxEA0r4, hxEA0r5, hxEA0r6, hxEA0r7, C3cG.A0r(c31w, fValueOf2), C3cG.A0r(AVd.A00, fValueOf2));
    }
}
