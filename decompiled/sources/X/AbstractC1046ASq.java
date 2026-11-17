package X;

/* renamed from: X.ASq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1046ASq {
    public static final C1050ASu A00(C1041ASi c1041ASi, C1049ASt c1049ASt, BFM bfm, float f, float f2) {
        Float fValueOf = Float.valueOf(f);
        Float fValueOf2 = Float.valueOf(f2);
        C31w<Float, AOW> c31w = AVd.A02;
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT == obj) {
            objAaT = new C1050ASu(c1041ASi, c1049ASt, c31w, fValueOf, fValueOf2);
            BBI.A0T(bfm, objAaT);
        }
        C1050ASu c1050ASu = (C1050ASu) objAaT;
        boolean z = bfm.A67(c1041ASi);
        Object objAaT2 = bfm.AaT();
        if (z || objAaT2 == obj) {
            objAaT2 = new BTW(c1041ASi, c1050ASu, fValueOf, fValueOf2, 0);
            bfm.Ai0(objAaT2);
        }
        AnonymousClass001.A15(bfm, objAaT2);
        boolean zA67 = bfm.A67(c1049ASt);
        Object objAaT3 = bfm.AaT();
        if (zA67 || objAaT3 == obj) {
            objAaT3 = BTA.A00(bfm, c1050ASu, c1049ASt, 2);
        }
        AnonymousClass001.A17(bfm, objAaT3, c1050ASu);
        return c1050ASu;
    }

    public static final C1049ASt A01(BFM bfm) {
        Object objAaT = bfm.AaT();
        if (objAaT == C78N.A00) {
            objAaT = new C1049ASt();
            BBI.A0T(bfm, objAaT);
        }
        C1049ASt c1049ASt = (C1049ASt) objAaT;
        c1049ASt.A00(bfm, 0);
        return c1049ASt;
    }
}
