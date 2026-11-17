package com.facebook.aura.hotels.policy;

import X.AGI;
import X.AVy;
import X.AbstractC2271BQs;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.ApQ;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BOf;
import X.BRg;
import X.C06G;
import X.C0dm;
import X.C0v5;
import X.C10G;
import X.C14P;
import X.C1731ApS;
import X.C1821Arl;
import X.C1822Arm;
import X.C19U;
import X.C1Ls;
import X.C1YD;
import X.C2VU;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import X.G0W;
import X.HxE;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HotelTaxesInfoLabelKt {
    public static final String INFO_ICON = "taxes_info";

    /* renamed from: HotelTaxesInfoLabel-T042LqI, reason: not valid java name */
    public static final void m1099HotelTaxesInfoLabelT042LqI(final String str, final C1822Arm c1822Arm, final long j, final Function0<Unit> function0, BRg bRg, BFM bfm, final int i, final int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        AnonymousClass002.A1B(c1822Arm, 1, function0);
        bfm.AgG(-1083545052);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, c1822Arm);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0O(bfm, j);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            final long jA09 = C06G.A09(bfm);
            final float fAgw = ((C0dm) bfm.A6v(Am0.A04)).Agw(c1822Arm.A02.A01);
            boolean zA64 = bfm.A64(jA09) | bfm.A62(fAgw);
            Object objAaT = bfm.AaT();
            if (zA64 || objAaT == C78N.A00) {
                objAaT = AGI.A0G(new HxE(INFO_ICON, new C14P(new C1821Arl(C19U.A04(8589934592L, 1.0f), C19U.A04(8589934592L, 1.0f), 7), B1V.A01(new G0W() { // from class: com.facebook.aura.hotels.policy.HotelTaxesInfoLabelKt$$ExternalSyntheticLambda0
                    @Override // X.G0W
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return HotelTaxesInfoLabelKt.HotelTaxesInfoLabel_T042LqI$lambda$1$0(fAgw, jA09, (String) obj, (BFM) obj2, AnonymousClass001.A0F(obj3));
                    }
                }, 94143109, true))));
                bfm.Ai0(objAaT);
            }
            BO6 bo6 = (BO6) objAaT;
            boolean zA1F = AnonymousClass004.A1F(iA0d);
            Object objAaT2 = bfm.AaT();
            if (zA1F || objAaT2 == C78N.A00) {
                C1731ApS c1731ApSA0X = AnonymousClass006.A0X(str);
                c1731ApSA0X.A00.append('\u00a0');
                C1Ls.A00(c1731ApSA0X, INFO_ICON, "\ufffd");
                objAaT2 = c1731ApSA0X.A04();
                bfm.Ai0(objAaT2);
            }
            AuraTextKt.m2640AuraTextVmYn7U0((ApQ) objAaT2, C0v5.A04(C10G.A00(C2VU.A02, bRg2, false), new C1YD(0), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12035a), function0, true), j, c1822Arm, null, null, null, 0L, false, 0, 0, 0, null, null, bo6, bfm, (iA0d & 896) | ((iA0d << 6) & 7168), 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.hotels.policy.HotelTaxesInfoLabelKt$$ExternalSyntheticLambda1
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    String str2 = str;
                    C1822Arm c1822Arm2 = c1822Arm;
                    long j2 = j;
                    Function0 function02 = function0;
                    BRg bRg4 = bRg3;
                    int i4 = i;
                    HotelTaxesInfoLabelKt.m1099HotelTaxesInfoLabelT042LqI(str2, c1822Arm2, j2, function02, bRg4, (BFM) obj, AnonymousClass011.A02(obj2, i4), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit HotelTaxesInfoLabel_T042LqI$lambda$1$0(float f, long j, String str, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            AuraIconKt.m2568AuraIconFyETyZw(null, BOf.A00(bfm, R.drawable.circle_info_wght400_outline_24, 0), f, null, j, null, bfm, AVy.$stable << 3, 41);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final Unit HotelTaxesInfoLabel_T042LqI$lambda$3(String str, C1822Arm c1822Arm, long j, Function0 function0, BRg bRg, int i, int i2, BFM bfm, int i3) {
        m1099HotelTaxesInfoLabelT042LqI(str, c1822Arm, j, function0, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }
}
