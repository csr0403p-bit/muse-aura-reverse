package com.facebook.aura.browsertask.view;

import X.AbstractC2271BQs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1DP;
import X.C3TQ;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class BrowserStopButtonKt {
    public static final void BrowserStopButton(final Function0<Unit> function0, BRg bRg, boolean z, BFM bfm, final int i, final int i2) {
        boolean z2 = z;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(function0, 0);
        bfm.AgG(1608571767);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0p(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = true;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201b3);
            AuraLabelButtonStyle auraLabelButtonStyleSecondary = AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new Function0() { // from class: com.facebook.aura.browsertask.view.BrowserStopButtonKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BrowserStopButtonKt.BrowserStopButton$lambda$0$0();
                    }
                };
                bfm.Ai0(objAaT);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRg2, auraLabelButtonStyleSecondary, auraButtonSize, null, false, false, z2, false, false, null, null, function0, null, null, null, null, null, null, (Function0) objAaT, null, false, 0, false, 0, bfm, AnonymousClass001.A06(iA0T << 21, ((iA0T << 6) & 7168) | 196608), (iA0T << 12) & 57344, 48, 132103621);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            final boolean z3 = z2;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.browsertask.view.BrowserStopButtonKt$$ExternalSyntheticLambda1
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    Function0 function02 = function0;
                    BRg bRg4 = bRg3;
                    boolean z4 = z3;
                    int i5 = i;
                    BrowserStopButtonKt.BrowserStopButton(function02, bRg4, z4, (BFM) obj, AnonymousClass011.A02(obj2, i5), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final C3TQ BrowserStopButton$lambda$0$0() {
        float f = AuraDimensKt.SpacingMedium;
        float f2 = AuraDimensKt.SpacingSmall;
        return new C1DP(f, f2, f, f2);
    }

    public static final Unit BrowserStopButton$lambda$1(Function0 function0, BRg bRg, boolean z, int i, int i2, BFM bfm, int i3) {
        BrowserStopButton(function0, bRg, z, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }
}
