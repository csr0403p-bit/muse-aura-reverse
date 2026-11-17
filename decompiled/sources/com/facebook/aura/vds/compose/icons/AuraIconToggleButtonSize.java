package com.facebook.aura.vds.compose.icons;

import X.AnonymousClass002;
import X.Ey9;
import X.F3w;
import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AuraIconToggleButtonSize {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraIconToggleButtonSize[] $VALUES;
    public static final AuraIconToggleButtonSize LARGE;
    public static final AuraIconToggleButtonSize MEDIUM;
    public static final AuraIconToggleButtonSize X_LARGE;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuraIconToggleButtonSize.values().length];
            try {
                AnonymousClass002.A13(AuraIconToggleButtonSize.MEDIUM, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AuraIconToggleButtonSize.LARGE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AuraIconToggleButtonSize.X_LARGE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        AuraIconToggleButtonSize auraIconToggleButtonSize = new AuraIconToggleButtonSize("MEDIUM", 0);
        MEDIUM = auraIconToggleButtonSize;
        AuraIconToggleButtonSize auraIconToggleButtonSize2 = new AuraIconToggleButtonSize("LARGE", 1);
        LARGE = auraIconToggleButtonSize2;
        AuraIconToggleButtonSize auraIconToggleButtonSize3 = new AuraIconToggleButtonSize("X_LARGE", 2);
        X_LARGE = auraIconToggleButtonSize3;
        AuraIconToggleButtonSize[] auraIconToggleButtonSizeArr = {auraIconToggleButtonSize, auraIconToggleButtonSize2, auraIconToggleButtonSize3};
        $VALUES = auraIconToggleButtonSizeArr;
        $ENTRIES = new F3w(auraIconToggleButtonSizeArr);
    }

    public static Ey9<AuraIconToggleButtonSize> getEntries() {
        return $ENTRIES;
    }

    public static AuraIconToggleButtonSize valueOf(String str) {
        return (AuraIconToggleButtonSize) Enum.valueOf(AuraIconToggleButtonSize.class, str);
    }

    public static AuraIconToggleButtonSize[] values() {
        return (AuraIconToggleButtonSize[]) $VALUES.clone();
    }

    public AuraIconToggleButtonSize(String str, int i) {
    }

    /* renamed from: toPaddingDp-D9Ej5fM$fbandroid_express_aura_java_com_facebook_aura_vds_compose_icons_icons, reason: not valid java name */
    public final float m2571x1bcb9ba4() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return 8.0f;
        }
        if (iOrdinal == 1) {
            return 10.0f;
        }
        if (iOrdinal == 2) {
            return 16.0f;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: toSizeDp-D9Ej5fM$fbandroid_express_aura_java_com_facebook_aura_vds_compose_icons_icons, reason: not valid java name */
    public final float m2572xe1bb7aa() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return 32.0f;
        }
        if (iOrdinal == 1) {
            return 44.0f;
        }
        if (iOrdinal == 2) {
            return 56.0f;
        }
        throw new NoWhenBranchMatchedException();
    }
}
