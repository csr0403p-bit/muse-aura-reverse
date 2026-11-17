package com.facebook.aura.tryon;

import X.AKH;
import X.AVy;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C01N;
import X.C06G;
import X.C1822Arm;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class TryOnMediaActionKt {
    /* renamed from: TryOnButton-_2Pl_rw, reason: not valid java name */
    public static final void m2310TryOnButton_2Pl_rw(final String str, final float f, final C1822Arm c1822Arm, final float f2, final float f3, final Function0<Unit> function0, BRg bRg, BFM bfm, final int i, final int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2124979536);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A05(bfm, f);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, c1822Arm);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A07(bfm, f2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A08(bfm, f3);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, function0);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA0d |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0d |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int i4 = iA0d >> 15;
            AuraElevatedButtonKt.m2420AuraPillButtonq88KkHs(function0, bRg2, false, f2, f3, 0.0f, false, B1V.A00(bfm, new G0V() { // from class: com.facebook.aura.tryon.TryOnMediaActionKt$$ExternalSyntheticLambda0
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    return TryOnMediaActionKt.TryOnButton__2Pl_rw$lambda$0(f, str, c1822Arm, (BFM) obj, AnonymousClass001.A0F(obj2));
                }
            }, -1301679506), bfm, AnonymousClass003.A07(iA0d, (i4 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (i4 & 14) | 12583296), 96);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.tryon.TryOnMediaActionKt$$ExternalSyntheticLambda1
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    String str2 = str;
                    float f4 = f;
                    C1822Arm c1822Arm2 = c1822Arm;
                    float f5 = f2;
                    float f6 = f3;
                    Function0 function02 = function0;
                    BRg bRg4 = bRg3;
                    int i5 = i;
                    TryOnMediaActionKt.m2310TryOnButton_2Pl_rw(str2, f4, c1822Arm2, f5, f6, function02, bRg4, (BFM) obj, AnonymousClass011.A02(obj2, i5), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit TryOnButton__2Pl_rw$lambda$0(float f, String str, C1822Arm c1822Arm, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
            AVy aVyA00 = BOf.A00(bfm, R.drawable.emojismilebadgeai_outline_24_wght500, 0);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            AuraIconKt.m2568AuraIconFyETyZw(null, aVyA00, f, null, C06G.A0G(bfm, akh), null, bfm, AVy.$stable << 3, 41);
            C01N.A09(bfm, BRg.A00, AuraDimensKt.SpacingMicroPlusNano);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A0L(bfm, akh), c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final Unit TryOnButton__2Pl_rw$lambda$1(String str, float f, C1822Arm c1822Arm, float f2, float f3, Function0 function0, BRg bRg, int i, int i2, BFM bfm, int i3) {
        m2310TryOnButton_2Pl_rw(str, f, c1822Arm, f2, f3, function0, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }
}
