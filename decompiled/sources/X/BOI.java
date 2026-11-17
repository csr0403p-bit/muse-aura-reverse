package X;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class BOI {
    public static final BO4 A01(BFM bfm, Function0 function0, float f, int i, long j, long j2) {
        float f2 = f;
        Function0 function02 = function0;
        Float fValueOf = Float.valueOf(0.3f);
        Float fValueOf2 = Float.valueOf(0.6f);
        Float fA0s = C8j3.A0s();
        AHH ahhA0E = AGI.A0E(fValueOf, fValueOf2, fA0s, C8j3.A0t(), fA0s, fValueOf2, fValueOf);
        if ((i & 32) != 0) {
            f2 = 0.0f;
        }
        if ((i & 128) != 0) {
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new BUV(10);
                bfm.Ai0(objAaT);
            }
            function02 = (Function0) objAaT;
        }
        boolean zA1S = C8j3.A1S(bfm.A65(ahhA0E) ? 1 : 0) | C8j3.A1S(bfm.A64(j) ? 1 : 0) | C8j3.A1S(bfm.A64(j2) ? 1 : 0);
        Object objAaT2 = bfm.AaT();
        if (zA1S || objAaT2 == C78N.A00) {
            ArrayList arrayListA0i = AnonymousClass003.A0i(ahhA0E);
            Iterator it = ahhA0E.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(new B6A(HxS.A02(HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), ((Number) it.next()).floatValue()), j2)));
            }
            objAaT2 = AGI.A07(arrayListA0i);
            bfm.Ai0(objAaT2);
        }
        AHD<B6A> ahd = (AHD) objAaT2;
        C7384Etj.A0Y(ahd, 0);
        Object objAaT3 = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT3 == obj) {
            objAaT3 = AbstractC1798ArH.A07(AnonymousClass005.A0a(), bfm);
        }
        Unit unit = Unit.INSTANCE;
        boolean zA1S2 = C8j3.A1S(bfm.A65(function02) ? 1 : 0) | (bfm.A64(1500L));
        Object objAaT4 = bfm.AaT();
        if (zA1S2 || objAaT4 == obj) {
            objAaT4 = new BUD(objAaT3, function02, null, 7, 1500L);
            bfm.Ai0(objAaT4);
        }
        AnonymousClass001.A18(bfm, objAaT4, unit);
        Object objAaT5 = bfm.AaT();
        if (objAaT5 == obj) {
            objAaT5 = new BO4(new C2327BUb(objAaT3, 6), function02, ahd, f2);
            BBI.A0T(bfm, objAaT5);
        }
        BO4 bo4 = (BO4) objAaT5;
        bo4.A02 = ahd;
        bo4.A00 = f2;
        C7384Etj.A0Y(function02, 0);
        bo4.A01 = function02;
        return bo4;
    }

    public static final BRg A00(BRg bRg, C1DM c1dm, BO4 bo4) {
        AnonymousClass005.A0x(bRg, bo4, c1dm);
        return AEk.A02(bRg.then(C11U.A03(BRg.A00, c1dm)), new AEc(c1dm, bo4));
    }

    public static void A02(BFM bfm, BRg bRg, C1DM c1dm, BO4 bo4) {
        C01N.A07(bfm, A00(bRg, c1dm, bo4));
    }
}
