package X;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.R;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.9WM, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9WM {
    public static final C0920AHw<Boolean> A00 = C0920AHw.A00("PlaceHoursIsToday");

    public static final void A02(BFM bfm, BRg bRg, C9WF c9wf, C9WN c9wn, int i, int i2) {
        BBb bBbAAc;
        int i3;
        C9WN c9wn2 = c9wn;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(c9wf, 0);
        bfm.AgG(-546034981);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c9wf) | i : i;
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
            iA0d |= AnonymousClass004.A0f(bfm, c9wn2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (i5 != 0) {
                C1822Arm c1822Arm = null;
                float f = 0.0f;
                c9wn2 = new C9WN(c1822Arm, c1822Arm, c1822Arm, c1822Arm, c1822Arm, f, f, f, f, f, 131071, 0L);
            }
            if (c9wf.A01.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    i3 = 6;
                    bBbAAc.A06 = new C2341BUp(bRg2, c9wn2, c9wf, i, i2, i3);
                }
                return;
            }
            A01(bfm, bRg2, BRg.A00, c9wf, c9wn2, AnonymousClass002.A07(iA0d, (iA0d & 14) | 3072));
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            i3 = 7;
            bBbAAc.A06 = new C2341BUp(bRg2, c9wn2, c9wf, i, i2, i3);
        }
    }

    public static final void A03(BFM bfm, BRg bRg, C9WF c9wf, C9WN c9wn, int i, int i2) {
        BBb bBbAAc;
        int i3;
        BRg bRgA04;
        BRg bRg2 = bRg;
        C9WN c9wn2 = c9wn;
        C7384Etj.A0Y(c9wf, 0);
        bfm.AgG(-266312675);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c9wf) | i : i;
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
            iA0d |= AnonymousClass004.A0f(bfm, c9wn2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (i5 != 0) {
                C1822Arm c1822Arm = null;
                float f = 0.0f;
                c9wn2 = new C9WN(c1822Arm, c1822Arm, c1822Arm, c1822Arm, c1822Arm, f, f, f, f, f, 131071, 0L);
            }
            List<C9VX> listSingletonList = c9wf.A01;
            if (listSingletonList.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    i3 = 8;
                    bBbAAc.A06 = new C2341BUp(bRg2, c9wn2, c9wf, i, i2, i3);
                }
                return;
            }
            Object[] objArr = {listSingletonList};
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new C05443bq(16);
                bfm.Ai0(objAaT);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT, objArr);
            boolean z = listSingletonList.size() > 1;
            if (!MutableState.A0A(mutableStateA0N)) {
                int i6 = c9wf.A00;
                listSingletonList = Collections.singletonList((i6 < 0 || i6 >= listSingletonList.size()) ? listSingletonList.get(0) : listSingletonList.get(i6));
            }
            C9WF c9wf2 = new C9WF(listSingletonList, -1);
            if (z) {
                BS0 bs0A09 = C3cG.A09(bfm, 1771573203);
                C1YD c1ydA0A = C3cG.A0A(0);
                boolean zA65 = bfm.A65(mutableStateA0N);
                Object objAaT2 = bfm.AaT();
                if (zA65 || objAaT2 == obj) {
                    objAaT2 = new C2327BUb(mutableStateA0N, 4);
                    bfm.Ai0(objAaT2);
                }
                bRgA04 = C0v5.A04(bs0A09, c1ydA0A, null, (Function0) objAaT2, true);
                AnonymousClass001.A1D(bfm);
            } else {
                AnonymousClass003.A0l(bfm, 1771575077);
                bRgA04 = BRg.A00;
            }
            A01(bfm, bRg2, bRgA04, c9wf2, c9wn2, iA0d & 1008);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            i3 = 9;
            bBbAAc.A06 = new C2341BUp(bRg2, c9wn2, c9wf, i, i2, i3);
        }
    }

    public static final int A00(C9WR c9wr) {
        switch (c9wr.ordinal()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                throw C3cG.A0q();
        }
    }

    public static final void A01(BFM bfm, BRg bRg, BRg bRg2, C9WF c9wf, C9WN c9wn, int i) {
        bfm.AgG(1174800065);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c9wf) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, c9wn);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA00 = AbstractC07539Wl.A00(bRg.then(c1062ATq), "place_hours_section");
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function0);
                G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                int i2 = 0;
                C8sU.A00(bfm, c9wn.A0D, AbstractC2271BQs.A01(bfm, R.string.place_hours_header), "place_hours_header", c9wn.A01, c9wn.A02, c9wn.A00, 3072, 0);
                BRg bRgThen = c1062ATq.then(bRg2);
                InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgThen);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
                BPg.A02(bfm, akqA042, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                bfm.AgE(-51091229);
                List<C9VX> list = c9wf.A01;
                int i3 = 0;
                for (C9VX c9vx : list) {
                    i2++;
                    if (i3 < 0) {
                        AbstractC0885AGm.A14();
                    } else {
                        A04(bfm, c9vx, c9wn, (iA0d << 3) & 7168, AnonymousClass002.A1M(i3), AnonymousClass002.A1Q(i3, C60O.A00(list)));
                        i3 = i2;
                    }
                }
                BBI.A0R(bbi, false);
                AnonymousClass002.A0y(bbi);
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C9WO(bRg, bRg2, c9wf, c9wn, i);
        }
    }

    public static final void A04(BFM bfm, C9VX c9vx, C9WN c9wn, int i, boolean z, boolean z2) {
        float f;
        float f2;
        String strA0w;
        String strA0L;
        int i2;
        Object[] objArr;
        bfm.AgG(-736185734);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c9vx) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, c9wn);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            float f3 = c9wn.A08;
            if (Float.isNaN(f3)) {
                f3 = c9wn.A0A * 2.0f;
            }
            float f4 = f3 / 2.0f;
            BS0 bs0 = BRg.A00;
            BRg bRgA00 = AbstractC07539Wl.A00(C10G.A02, "place_hours_row");
            boolean zA1B = AnonymousClass003.A1B(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new C2326BUa(c9vx, 24);
                bfm.Ai0(objAaT);
            }
            BRg bRgA01 = ARD.A01(bRgA00, (G0U) objAaT, false);
            if (z) {
                f = 0.0f;
                f2 = c9wn.A0A;
            } else {
                float f5 = c9wn.A03;
                if (Float.isNaN(f5)) {
                    f5 = c9wn.A04;
                }
                float f6 = c9wn.A04;
                if (f5 < f6) {
                    f5 = f6;
                }
                f = f5 + c9wn.A05;
                f2 = f4;
            }
            float f7 = c9wn.A09;
            if (z2) {
                f4 = c9wn.A0A;
            }
            BRg bRgA0C = C3U4.A0C(bRgA01, f, f2, f7, f4);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(c9wn.A05), bfm, C2VU.A05, 48);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u);
            if (z) {
                bfm.AgE(-1151620807);
                C9WZ c9wz = C9WZ.A04;
                float f8 = c9wn.A04;
                long j = c9wn.A0B;
                float f9 = c9wn.A07;
                float f10 = c9wn.A06;
                BRg bRgA002 = AbstractC07539Wl.A00(bs0, "place_hours_icon");
                float f11 = c9wn.A03;
                if (Float.isNaN(f11)) {
                    f11 = f8;
                }
                if (f11 < f8) {
                    f11 = f8;
                }
                C9WU.A00(bfm, bRgA002, c9wz, f8, f9, f10, f11, 196614, 0, j);
            } else {
                bfm.AgE(-1151333468);
            }
            BBI.A0R(bbi, false);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA013, g0vA0u);
            Locale locale = AKO.A02(AndroidCompositionLocals_androidKt.A00, bbi).get(0);
            C7384Etj.A0U(locale);
            DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(locale);
            C9WR c9wr = c9vx.A00;
            C9WR c9wr2 = c9vx.A01;
            strA0w = "";
            if (c9wr == c9wr2) {
                String[] weekdays = dateFormatSymbols.getWeekdays();
                C7384Etj.A0U(weekdays);
                int iA00 = A00(c9wr);
                if (iA00 < weekdays.length) {
                    strA0w = weekdays[iA00];
                }
            } else if (c9wr == C9WR.A03 && c9wr2 == C9WR.A02) {
                bfm.AgE(491522183);
                strA0w = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f120e68);
            } else {
                bfm.AgE(491585609);
                BBI.A0R(bbi, false);
                String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
                C7384Etj.A0X(shortWeekdays);
                int iA002 = A00(c9wr);
                int length = shortWeekdays.length;
                String str = iA002 < length ? shortWeekdays[iA002] : "";
                C7384Etj.A0W(str);
                int iA003 = A00(c9wr2);
                strA0w = iA003 < length ? shortWeekdays[iA003] : "";
                C7384Etj.A0W(strA0w);
                strA0w = AnonymousClass006.A0w(bfm, str, strA0w, R.string._name_removed__res_0x7f120e63);
            }
            BRg bRgA003 = AbstractC07539Wl.A00(bs0, "place_hours_title");
            boolean z3 = c9vx.A03;
            AbstractC1727ApL.A02(null, bfm, bRgA003, null, z3 ? c9wn.A0G : c9wn.A0E, strA0w, null, 0, 0, 0, 48, 1016, false);
            List<C9Vk> list = c9vx.A02;
            if (list.isEmpty()) {
                bfm.AgE(-82857830);
                strA0L = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f120e62);
            } else {
                bfm.AgE(-82796326);
                BBI.A0R(bbi, false);
                Context contextA01 = AKO.A01(bbi);
                ArrayList arrayListA0t = C60Q.A0t(list);
                Iterator itA0w = AnonymousClass001.A0w(bfm, list, 1382805850);
                while (itA0w.hasNext()) {
                    C9Vk c9Vk = (C9Vk) itA0w.next();
                    int i3 = c9Vk.A00;
                    DateFormat timeFormat = android.text.format.DateFormat.getTimeFormat(contextA01);
                    Date time = C8j5.A0Y(i3).getTime();
                    C7384Etj.A0U(time);
                    String str2 = timeFormat.format(time);
                    C7384Etj.A0U(str2);
                    Integer num = c9Vk.A01;
                    if (num == null) {
                        bfm.AgE(-82527060);
                        i2 = R.string._name_removed__res_0x7f120e66;
                        objArr = new Object[]{str2};
                    } else {
                        bfm.AgE(-82440911);
                        i2 = R.string._name_removed__res_0x7f120e67;
                        int iIntValue = num.intValue();
                        DateFormat timeFormat2 = android.text.format.DateFormat.getTimeFormat(contextA01);
                        Date time2 = C8j5.A0Y(iIntValue).getTime();
                        C7384Etj.A0U(time2);
                        String str3 = timeFormat2.format(time2);
                        C7384Etj.A0U(str3);
                        objArr = new Object[]{str2, str3};
                    }
                    String strA02 = AbstractC2271BQs.A02(bfm, objArr, i2);
                    BBI.A0R(bbi, false);
                    arrayListA0t.add(strA02);
                }
                BBI.A0R(bbi, false);
                strA0L = AbstractC0878AGe.A0L(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e65), "", "", arrayListA0t, null);
            }
            AbstractC1727ApL.A02(null, bfm, AbstractC07539Wl.A00(bs0, "place_hours_detail"), null, z3 ? c9wn.A0F : c9wn.A0C, strA0L, null, 0, 0, 0, 48, 1016, false);
            AnonymousClass002.A0y(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C9WP(c9vx, c9wn, i, z, z2);
        }
    }
}
