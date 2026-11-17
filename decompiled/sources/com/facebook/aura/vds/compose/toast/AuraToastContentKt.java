package com.facebook.aura.vds.compose.toast;

import X.AKH;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.B1V;
import X.B6A;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C0er;
import X.C1416Ail;
import X.C7384Etj;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.AuraModeOverriderKt;
import com.facebook.aura.vds.compose.theme.AuraShapes;
import com.facebook.aura.vds.compose.theme.AuraShapesKt;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraToastContentKt {
    /* renamed from: AuraToastContent-AAXhOkM, reason: not valid java name */
    public static final void m3084AuraToastContentAAXhOkM(String str, BRg bRg, String str2, Integer num, Function0<Unit> function0, AuraToastOption auraToastOption, AuraIconSize auraIconSize, B6A b6a, BFM bfm, int i, int i2) {
        B6A b6a2;
        Integer num2 = num;
        Function0<Unit> function02 = function0;
        BRg bRg2 = bRg;
        AuraToastOption auraToastOption2 = auraToastOption;
        AuraIconSize auraIconSize2 = auraIconSize;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-589674459);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str2);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, num2);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function02);
        }
        int i7 = i2 & 32;
        int iA02 = 196608;
        if (i7 != 0) {
            iA0d |= iA02;
        } else if ((i & 196608) == 0) {
            iA02 = AnonymousClass002.A02(AnonymousClass004.A1R(bfm, auraToastOption2, i, 262144) ? 1 : 0);
            iA0d |= iA02;
        }
        int i8 = i2 & 64;
        int iA0I = 1572864;
        if (i8 != 0) {
            iA0d |= iA0I;
        } else if ((i & 1572864) == 0) {
            iA0I = AnonymousClass004.A0I(bfm, AnonymousClass003.A0M(auraIconSize2));
            iA0d |= iA0I;
        }
        int i9 = i2 & 128;
        int iA0k = 12582912;
        if (i9 != 0) {
            iA0d |= iA0k;
        } else if ((i & 12582912) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, b6a);
            iA0d |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1E(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                str2 = null;
            }
            if (i5 != 0) {
                num2 = null;
            }
            if (i6 != 0) {
                function02 = null;
            }
            if (i7 != 0) {
                auraToastOption2 = AuraToastOption.None.INSTANCE;
            }
            if (i8 != 0) {
                auraIconSize2 = AuraIconSize.MEDIUM;
            }
            b6a2 = i9 == 0 ? b6a : null;
            AuraToastStyle auraToastStyle = AuraToastStyle.INSTANCE;
            B6A b6aM3086backgroundColor6MYuD4A = auraToastStyle.m3086backgroundColor6MYuD4A(bfm, 6);
            long j = b6aM3086backgroundColor6MYuD4A != null ? b6aM3086backgroundColor6MYuD4A.A00 : B6A.A06;
            AKH<AuraShapes> akh = AuraShapesKt.LocalAuraShapes;
            AuraModeOverriderKt.AuraModeOverrider(auraToastStyle.isLight(bfm, 6), null, B1V.A00(bfm, new AuraToastContentKt$AuraToastContent$1(auraToastOption2, function02, bRg2.then(new C1416Ail(((AuraShapes) bfm.A6v(akh)).toast, 12.0f, C0er.A00, AnonymousClass002.A0c(bfm).toastShadow, true)), ((AuraShapes) bfm.A6v(akh)).toast, j, AnonymousClass002.A1X(num2), num2, !(auraToastOption2 instanceof AuraToastOption.None), auraIconSize2, b6a2, str, str2), -1934467438), bfm, 384, 2);
        } else {
            bfm.Afo();
            b6a2 = b6a;
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AuraToastContentKt$AuraToastContent$2(str, bRg2, str2, num2, function02, auraToastOption2, auraIconSize2, b6a2, i, i2);
        }
    }

    public static final InteractionType toInteractionType(AuraToastOption auraToastOption) {
        if ((auraToastOption instanceof AuraToastOption.None) || (auraToastOption instanceof AuraToastOption.Button)) {
            return InteractionType.NONE;
        }
        if ((auraToastOption instanceof AuraToastOption.ChevronNavigation) || (auraToastOption instanceof AuraToastOption.Close)) {
            return InteractionType.CLICKABLE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
