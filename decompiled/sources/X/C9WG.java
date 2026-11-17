package X;

import com.facebook.aura.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* renamed from: X.9WG, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9WG {
    public static final C0920AHw<Boolean> A00 = C0920AHw.A00("PlaceFeatureIsAvailable");

    public static final String A00(BFM bfm, C9Vc c9Vc) {
        String strA0e = c9Vc.A00;
        if (strA0e == null) {
            bfm.AgE(-2112583352);
            Integer num = HZx.A01.get(c9Vc.A01);
            if (num == null) {
                AnonymousClass004.A1A(bfm, -2112583353);
                strA0e = null;
            } else {
                bfm.AgE(-2112583352);
                strA0e = AnonymousClass003.A0e(bfm, num.intValue());
            }
        } else {
            bfm.AgE(70397312);
        }
        AnonymousClass002.A19(bfm);
        return strA0e == null ? c9Vc.A01 : strA0e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A01(BFM bfm, BRg bRg, C9Va c9Va, C9WH c9wh, int i, int i2) {
        BBb bBbAAc;
        int i3;
        BRg bRg2 = bRg;
        C9WH c9wh2 = c9wh;
        C7384Etj.A0Y(c9Va, 0);
        bfm.AgG(-841957970);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c9Va) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, c9wh2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (i5 != 0) {
                C1822Arm c1822Arm = null;
                float f = 0.0f;
                c9wh2 = new C9WH(c1822Arm, c1822Arm, c1822Arm, f, f, f, 32767, 0L);
            }
            List<C9Vc> list = c9Va.A00;
            LinkedHashMap linkedHashMapA0j = C3cG.A0j();
            for (C9Vc c9Vc : list) {
                ((List) C60R.A0Z(HZx.A00.get(c9Vc.A01), linkedHashMapA0j)).add(c9Vc);
            }
            Ey9 ey9 = HkU.A00;
            ArrayList arrayListA0h = C3cG.A0h();
            for (Object obj : ey9) {
                Object obj2 = linkedHashMapA0j.get(obj);
                if (obj2 != null) {
                    AnonymousClass002.A1J(obj, obj2, arrayListA0h);
                }
            }
            if (arrayListA0h.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    i3 = 1;
                    bBbAAc.A06 = new C2341BUp(bRg2, c9wh2, c9Va, i, i2, i3);
                }
                return;
            }
            BRg bRgA00 = AbstractC07539Wl.A00(AnonymousClass001.A0R(bRg2), "place_features_section");
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                C8sU.A00(bfm, c9wh2.A0D, AbstractC2271BQs.A01(bfm, R.string.place_features_header), "place_features_header", c9wh2.A03, c9wh2.A04, c9wh2.A02, 3072, 0);
                Iterator itA0w = AnonymousClass001.A0w(bfm, arrayListA0h, 1596076255);
                int i6 = 0;
                while (itA0w.hasNext()) {
                    Object next = itA0w.next();
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        AbstractC0885AGm.A14();
                    } else {
                        HxE hxE = (HxE) next;
                        HkU hkU = (HkU) hxE.first;
                        List list2 = (List) hxE.second;
                        float f2 = i6 == 0 ? 0.0f : c9wh2.A00;
                        int i8 = iA0d & 896;
                        A03(bfm, hkU, c9wh2, f2, i8);
                        Iterator itA0w2 = AnonymousClass001.A0w(bfm, list2, 1596080899);
                        while (itA0w2.hasNext()) {
                            C9Vc c9Vc2 = (C9Vc) itA0w2.next();
                            A05(bfm, c9wh2, A00(bfm, c9Vc2), i8, c9Vc2.A02);
                        }
                        BBI.A0R(bbi, false);
                        i6 = i7;
                    }
                }
                AnonymousClass003.A0q(bbi);
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            i3 = 2;
            bBbAAc.A06 = new C2341BUp(bRg2, c9wh2, c9Va, i, i2, i3);
        }
    }

    public static final void A02(BFM bfm, BRg bRg, C9Va c9Va, C9WH c9wh, int i, int i2) {
        BBb bBbAAc;
        int i3;
        BRg bRg2 = bRg;
        C9WH c9wh2 = c9wh;
        C7384Etj.A0Y(c9Va, 0);
        bfm.AgG(486951721);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c9Va) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, c9wh2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (i5 != 0) {
                C1822Arm c1822Arm = null;
                float f = 0.0f;
                c9wh2 = new C9WH(c1822Arm, c1822Arm, c1822Arm, f, f, f, 32767, 0L);
            }
            List<C9Vc> list = c9Va.A00;
            if (list.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    i3 = 3;
                    bBbAAc.A06 = new C2341BUp(bRg2, c9wh2, c9Va, i, i2, i3);
                }
                return;
            }
            BRg bRgA00 = AbstractC07539Wl.A00(AnonymousClass001.A0R(bRg2), "place_features_section");
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C8sU.A00(bfm, c9wh2.A0D, AbstractC2271BQs.A01(bfm, R.string.place_features_header), "place_features_header", c9wh2.A03, c9wh2.A04, c9wh2.A02, 3072, 0);
            Iterator itA0w = AnonymousClass001.A0w(bfm, list, 1215745949);
            while (itA0w.hasNext()) {
                C9Vc c9Vc = (C9Vc) itA0w.next();
                A05(bfm, c9wh2, A00(bfm, c9Vc), iA0d & 896, c9Vc.A02);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            i3 = 4;
            bBbAAc.A06 = new C2341BUp(bRg2, c9wh2, c9Va, i, i2, i3);
        }
    }

    public static final void A03(BFM bfm, HkU hkU, C9WH c9wh, float f, int i) {
        int i2;
        bfm.AgG(1517473467);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, hkU) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A05(bfm, f);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, c9wh);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 147, 146), bfm, iA08)) {
            int iOrdinal = hkU.ordinal();
            if (iOrdinal == 0) {
                i2 = R.string._name_removed__res_0x7f120e18;
            } else if (iOrdinal == 1) {
                i2 = R.string._name_removed__res_0x7f120e19;
            } else {
                if (iOrdinal != 2) {
                    throw C3cG.A0q();
                }
                i2 = R.string._name_removed__res_0x7f120e17;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i2);
            BRg bRgA00 = AbstractC07539Wl.A00(C3U4.A04(BRg.A00, f), "place_features_category_header");
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = BUU.A00(bfm, 30);
            }
            AbstractC1727ApL.A02(null, bfm, AnonymousClass001.A0Y(bRgA00, objAaT, false), null, c9wh.A0C, strA01, null, 0, 0, 0, 0, 1016, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C9WI(hkU, c9wh, f, i);
        }
    }

    public static final void A04(BFM bfm, C9WH c9wh, int i, boolean z) {
        bfm.AgG(-1780706029);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, c9wh);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 19, 18), bfm, iA0n)) {
            BS0 bs0 = BRg.A00;
            float f = c9wh.A05;
            if (Float.isNaN(f)) {
                f = c9wh.A06;
            }
            float f2 = c9wh.A06;
            if (f < f2) {
                f = f2;
            }
            BRg bRgA00 = AbstractC07539Wl.A00(C10G.A07(bs0, f), "place_features_icon");
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0D);
            BRg bRgA07 = C10G.A07(bs0, f2);
            boolean zA1B = AnonymousClass003.A1B(iA0n) | AnonymousClass001.A1N(iA0n);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new C2332BUg(c9wh, 1, z);
                bfm.Ai0(objAaT);
            }
            C3Ue.A04(AEk.A02(bRgA07, (G0U) objAaT), bfm, 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C9WK(c9wh, i, z);
        }
    }

    public static final void A05(BFM bfm, C9WH c9wh, String str, int i, boolean z) {
        String strA01;
        BBI bbiA07;
        bfm.AgG(-1556350764);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, c9wh);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (z) {
                bbiA07 = AnonymousClass002.A0M(bfm, -1073526871);
                strA01 = null;
            } else {
                bfm.AgE(-1004460854);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e53);
                bbiA07 = C3cG.A07(bfm);
            }
            BS0 bs0 = BRg.A00;
            BRg bRgA00 = AbstractC07539Wl.A00(C10G.A02, "place_features_row");
            boolean zA1R = AnonymousClass001.A1R(bfm, strA01, AnonymousClass003.A1C(iA0d));
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new C9WJ(z, strA01);
                BBI.A0O(bbiA07, objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA00, objAaT, true);
            float f = c9wh.A09;
            BRg bRgA0C = C3U4.A0C(bRgA0Y, 0.0f, f, c9wh.A08, f);
            InterfaceC1380AiA interfaceC1380AiAA0b = C8j4.A0b(AcQ.A00(c9wh.A07), bfm, C2VU.A05);
            int iA0D = AnonymousClass001.A0D(bbiA07);
            AKQ akqA04 = BBI.A04(bbiA07);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA07.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA07, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0b, akqA04, bRgA01, iA0D);
            A04(bfm, c9wh, (iA0d >> 3) & 126, z);
            AbstractC1727ApL.A02(null, bfm, AbstractC07539Wl.A00(bs0, "place_features_label"), null, c9wh.A0E, str, null, 0, 0, 0, (iA0d & 14) | 48, 1016, false);
            BBI.A0R(bbiA07, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C9WL(c9wh, str, i, z);
        }
    }
}
