package com.facebook.aura.vds.compose.button;

import X.AKH;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.B6A;
import X.BFM;
import X.C06G;
import X.C1DM;
import com.facebook.aura.vds.compose.theme.AuraAdaptiveColorsKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import java.util.List;

/* loaded from: classes.dex */
public final class AuraButtonStyles {
    public static final int $stable = 0;
    public static final AuraButtonStyles INSTANCE = new AuraButtonStyles();

    /* renamed from: toLabelButtonStyle-31qCuKU, reason: not valid java name */
    public final LabelButtonStyle m2416toLabelButtonStyle31qCuKU(long j, long j2, AuraButtonCorner auraButtonCorner, List<? extends AuraButtonSize> list, C1DM c1dm, boolean z, long j3, long j4, long j5, long j6, long j7, float f, B6A b6a) {
        AnonymousClass002.A1B(auraButtonCorner, 2, list);
        return new LabelButtonStyle(j, j3, j4, j5, j2, j6, j7, auraButtonCorner, c1dm, list, z, f, b6a);
    }

    /* renamed from: toLabelButtonStyle-31qCuKU$default, reason: not valid java name */
    public static /* synthetic */ LabelButtonStyle m2415toLabelButtonStyle31qCuKU$default(AuraButtonStyles auraButtonStyles, long j, long j2, AuraButtonCorner auraButtonCorner, List list, C1DM c1dm, boolean z, long j3, long j4, long j5, long j6, long j7, float f, B6A b6a, int i, Object obj) {
        if ((i & 4) != 0) {
            auraButtonCorner = AuraButtonCorner.PILL;
        }
        if ((i & 16) != 0) {
            c1dm = null;
        }
        boolean zA1R = AnonymousClass002.A1R(i, z);
        if ((i & 64) != 0) {
            j3 = B6A.A07;
        }
        if ((i & 128) != 0) {
            j4 = j3;
        }
        if ((i & 256) != 0) {
            j5 = j3;
        }
        if ((i & 512) != 0) {
            j6 = j2;
        }
        if ((i & 1024) != 0) {
            j7 = j2;
        }
        if ((i & 2048) != 0) {
            f = 0.0f;
        }
        if ((i & 4096) != 0) {
            b6a = null;
        }
        return auraButtonStyles.m2416toLabelButtonStyle31qCuKU(j, j2, auraButtonCorner, list, c1dm, zA1R, j3, j4, j5, j6, j7, f, b6a);
    }

    public final AuraLabelButtonStyle destructive(AuraButtonCorner auraButtonCorner, BFM bfm, int i, int i2) {
        AuraButtonCorner auraButtonCorner2 = auraButtonCorner;
        if ((i2 & 1) != 0) {
            auraButtonCorner2 = AuraButtonCorner.PILL;
        }
        AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
        long j = AnonymousClass001.A0f(bfm, akh).destructiveButtonBackground;
        long j2 = AnonymousClass001.A0f(bfm, akh).onMedia;
        List<AuraButtonSize> list = AuraButtonKt.SIZES_REGULAR;
        long j3 = B6A.A07;
        return m2416toLabelButtonStyle31qCuKU(j, j2, auraButtonCorner2, list, null, false, j3, j3, j3, j2, j2, 0.0f, null);
    }

    public final AuraLabelButtonStyle elevated(AuraButtonCorner auraButtonCorner, BFM bfm, int i, int i2) {
        AuraButtonCorner auraButtonCorner2 = auraButtonCorner;
        if ((i2 & 1) != 0) {
            auraButtonCorner2 = AuraButtonCorner.PILL;
        }
        AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
        long j = AnonymousClass001.A0f(bfm, akh).highlight;
        long jA0G = C06G.A0G(bfm, akh);
        List<AuraButtonSize> list = AuraButtonKt.SIZES_REGULAR;
        B6A b6a = new B6A(855638016 << 32);
        long j2 = B6A.A07;
        return m2416toLabelButtonStyle31qCuKU(j, jA0G, auraButtonCorner2, list, null, false, j2, j2, j2, jA0G, jA0G, 8.0f, b6a);
    }

    public final AuraLabelButtonStyle lockedOverlay(AuraButtonCorner auraButtonCorner, BFM bfm, int i, int i2) {
        AuraButtonCorner auraButtonCorner2 = auraButtonCorner;
        if ((i2 & 1) != 0) {
            auraButtonCorner2 = AuraButtonCorner.PILL;
        }
        long j = B6A.A01;
        long j2 = B6A.A08;
        List<AuraButtonSize> list = AuraButtonKt.SIZES_REGULAR;
        long j3 = B6A.A07;
        return m2416toLabelButtonStyle31qCuKU(j, j2, auraButtonCorner2, list, null, false, j3, j3, j3, j2, j2, 0.0f, null);
    }

    public final AuraLabelButtonStyle primary(AuraButtonCorner auraButtonCorner, BFM bfm, int i, int i2) {
        AuraButtonCorner auraButtonCorner2 = auraButtonCorner;
        if ((i2 & 1) != 0) {
            auraButtonCorner2 = AuraButtonCorner.PILL;
        }
        AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
        long j = AnonymousClass001.A0f(bfm, akh).primaryButtonBackground;
        List<AuraButtonSize> list = AuraButtonKt.SIZES_REGULAR;
        long j2 = AnonymousClass001.A0f(bfm, akh).onMedia;
        long j3 = AnonymousClass001.A0f(bfm, akh).onMedia;
        long j4 = AnonymousClass001.A0f(bfm, akh).onMedia;
        long j5 = B6A.A07;
        return m2416toLabelButtonStyle31qCuKU(j, j2, auraButtonCorner2, list, null, false, j5, j5, j5, j3, j4, 0.0f, null);
    }

    public final AuraLabelButtonStyle primaryAlt(AuraButtonCorner auraButtonCorner, BFM bfm, int i, int i2) {
        AuraButtonCorner auraButtonCorner2 = auraButtonCorner;
        if ((i2 & 1) != 0) {
            auraButtonCorner2 = AuraButtonCorner.PILL;
        }
        AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
        long j = AnonymousClass001.A0f(bfm, akh).invertedButtonBackground;
        long j2 = AnonymousClass001.A0f(bfm, akh).invertedButtonContent;
        List<AuraButtonSize> list = AuraButtonKt.SIZES_REGULAR;
        long j3 = B6A.A07;
        return m2416toLabelButtonStyle31qCuKU(j, j2, auraButtonCorner2, list, null, false, j3, j3, j3, j2, j2, 0.0f, null);
    }

    public final AuraLabelButtonStyle secondary(AuraButtonCorner auraButtonCorner, BFM bfm, int i, int i2) {
        AuraButtonCorner auraButtonCorner2 = auraButtonCorner;
        if ((i2 & 1) != 0) {
            auraButtonCorner2 = AuraButtonCorner.PILL;
        }
        AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
        long jAdaptiveSecondaryFill = AuraAdaptiveColorsKt.adaptiveSecondaryFill(AnonymousClass001.A0f(bfm, akh), bfm, AuraColors.$stable);
        long jA0L = C06G.A0L(bfm, akh);
        List<AuraButtonSize> list = AuraButtonKt.SIZES_REGULAR;
        long j = B6A.A07;
        return m2416toLabelButtonStyle31qCuKU(jAdaptiveSecondaryFill, jA0L, auraButtonCorner2, list, null, false, j, j, j, jA0L, jA0L, 0.0f, null);
    }

    public final AuraLabelButtonStyle secondaryOutlined(AuraButtonCorner auraButtonCorner, BFM bfm, int i, int i2) {
        AuraButtonCorner auraButtonCorner2 = auraButtonCorner;
        if ((i2 & 1) != 0) {
            auraButtonCorner2 = AuraButtonCorner.PILL;
        }
        AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
        long j = AnonymousClass001.A0f(bfm, akh).secondaryButtonBackground;
        long jA0L = C06G.A0L(bfm, akh);
        long j2 = AnonymousClass001.A0f(bfm, akh).fillDivider;
        return m2416toLabelButtonStyle31qCuKU(j, jA0L, auraButtonCorner2, AuraButtonKt.SIZES_REGULAR, null, false, j2, j2, j2, jA0L, jA0L, 0.0f, null);
    }

    public final AuraLabelButtonStyle tertiary(AuraButtonCorner auraButtonCorner, BFM bfm, int i, int i2) {
        AuraButtonCorner auraButtonCorner2 = auraButtonCorner;
        if ((i2 & 1) != 0) {
            auraButtonCorner2 = AuraButtonCorner.PILL;
        }
        long j = B6A.A07;
        long jA0C = C06G.A0C(bfm);
        return m2416toLabelButtonStyle31qCuKU(j, jA0C, auraButtonCorner2, AuraButtonKt.SIZES_REGULAR, null, false, j, j, j, jA0C, jA0C, 0.0f, null);
    }
}
