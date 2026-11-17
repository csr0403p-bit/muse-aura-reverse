package com.facebook.aura.avatarsize;

import X.ATD;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C1DG;
import X.C7384Etj;
import X.C78N;
import com.facebook.aura.ui.adaptive.AuraLayoutSizeKt;

/* loaded from: classes.dex */
public abstract class HatchAvatarSizeKt {
    public static final float AVATAR_MILESTONE_SCALE = 2.5f;
    public static final float AVATAR_SCALE_BASELINE_HEIGHT_DP = 800.0f;
    public static final float AVATAR_SHEET_SCALE = 1.5f;
    public static final float MAX_AVATAR_SCALE = 1.25f;
    public static final float MaxAvatarRenderSize = (HatchAvatarSize.XLARGE.m278getBaseSizeDpD9Ej5fM() * 1.25f) * 2.5f;
    public static final float PillAvatarOverlap = 8.0f;
    public static final float PillChromeHeight = 40.0f;

    public static final float hatchAvatarScaleFor(int i) {
        return ATD.A03(i / 800.0f, 1.0f, 1.25f);
    }

    public static final float rememberAvatarSizeDp(HatchAvatarSize hatchAvatarSize, BFM bfm, int i) {
        C7384Etj.A0Y(hatchAvatarSize, 0);
        float fRememberHatchAvatarScale = rememberHatchAvatarScale(bfm, 0);
        boolean zA62 = bfm.A62(fRememberHatchAvatarScale) | ((((i & 14) ^ 6) > 4 && AnonymousClass002.A1U(bfm, hatchAvatarSize)) || (i & 6) == 4);
        Object objAaT = bfm.AaT();
        if (zA62 || objAaT == C78N.A00) {
            objAaT = new C1DG(hatchAvatarSize.m278getBaseSizeDpD9Ej5fM() * fRememberHatchAvatarScale);
            bfm.Ai0(objAaT);
        }
        return ((C1DG) objAaT).A00;
    }

    public static final float rememberHatchAvatarScale(BFM bfm, int i) {
        int iAuraLayoutHeight = (int) AuraLayoutSizeKt.auraLayoutHeight(bfm, 0);
        boolean zA63 = bfm.A63(iAuraLayoutHeight);
        Object objAaT = bfm.AaT();
        if (zA63 || objAaT == C78N.A00) {
            objAaT = Float.valueOf(hatchAvatarScaleFor(iAuraLayoutHeight));
            bfm.Ai0(objAaT);
        }
        return AnonymousClass001.A02(objAaT);
    }

    public static final float rememberStatusSheetAvatarSizeDp(HatchAvatarSize hatchAvatarSize, BFM bfm, int i) {
        C7384Etj.A0Y(hatchAvatarSize, 0);
        C1DG c1dg = new C1DG(rememberAvatarSizeDp(HatchAvatarSize.SMALL, bfm, 6) * 1.5f);
        C1DG c1dg2 = new C1DG(rememberAvatarSizeDp(hatchAvatarSize, bfm, i & 14));
        if (c1dg.compareTo(c1dg2) >= 0) {
            c1dg2 = c1dg;
        }
        return c1dg2.A00;
    }

    public static final float getMaxAvatarRenderSize() {
        return MaxAvatarRenderSize;
    }

    public static final float getPillAvatarOverlap() {
        return PillAvatarOverlap;
    }

    public static final float getPillChromeHeight() {
        return PillChromeHeight;
    }

    /* renamed from: pillBlockHeight-0680j_4, reason: not valid java name */
    public static final float m279pillBlockHeight0680j_4(float f) {
        return (f - PillAvatarOverlap) + PillChromeHeight;
    }

    /* renamed from: sheetAvatarSize-0680j_4, reason: not valid java name */
    public static final float m280sheetAvatarSize0680j_4(float f) {
        return f * 1.5f;
    }
}
