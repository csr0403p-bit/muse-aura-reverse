package com.facebook.aura.vds.compose.icons;

import X.AnonymousClass002;
import X.Ey9;
import X.F3w;
import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AuraIconButtonSizeV2 {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraIconButtonSizeV2[] $VALUES;
    public static final AuraIconButtonSizeV2 LARGE;
    public static final AuraIconButtonSizeV2 MEDIUM;
    public static final AuraIconButtonSizeV2 SMALL;
    public static final AuraIconButtonSizeV2 XM_LARGE;
    public static final AuraIconButtonSizeV2 X_LARGE;
    public static final AuraIconButtonSizeV2 X_SMALL;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuraIconButtonSizeV2.values().length];
            try {
                AnonymousClass002.A13(AuraIconButtonSizeV2.X_SMALL, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AuraIconButtonSizeV2.SMALL, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AuraIconButtonSizeV2.MEDIUM, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AuraIconButtonSizeV2.LARGE, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(AuraIconButtonSizeV2.XM_LARGE, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(AuraIconButtonSizeV2.X_LARGE, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        AuraIconButtonSizeV2 auraIconButtonSizeV2 = new AuraIconButtonSizeV2("X_SMALL", 0);
        X_SMALL = auraIconButtonSizeV2;
        AuraIconButtonSizeV2 auraIconButtonSizeV22 = new AuraIconButtonSizeV2("SMALL", 1);
        SMALL = auraIconButtonSizeV22;
        AuraIconButtonSizeV2 auraIconButtonSizeV23 = new AuraIconButtonSizeV2("MEDIUM", 2);
        MEDIUM = auraIconButtonSizeV23;
        AuraIconButtonSizeV2 auraIconButtonSizeV24 = new AuraIconButtonSizeV2("LARGE", 3);
        LARGE = auraIconButtonSizeV24;
        AuraIconButtonSizeV2 auraIconButtonSizeV25 = new AuraIconButtonSizeV2("XM_LARGE", 4);
        XM_LARGE = auraIconButtonSizeV25;
        AuraIconButtonSizeV2 auraIconButtonSizeV26 = new AuraIconButtonSizeV2("X_LARGE", 5);
        X_LARGE = auraIconButtonSizeV26;
        AuraIconButtonSizeV2[] auraIconButtonSizeV2Arr = {auraIconButtonSizeV2, auraIconButtonSizeV22, auraIconButtonSizeV23, auraIconButtonSizeV24, auraIconButtonSizeV25, auraIconButtonSizeV26};
        $VALUES = auraIconButtonSizeV2Arr;
        $ENTRIES = new F3w(auraIconButtonSizeV2Arr);
    }

    public static Ey9<AuraIconButtonSizeV2> getEntries() {
        return $ENTRIES;
    }

    public static AuraIconButtonSizeV2 valueOf(String str) {
        return (AuraIconButtonSizeV2) Enum.valueOf(AuraIconButtonSizeV2.class, str);
    }

    public static AuraIconButtonSizeV2[] values() {
        return (AuraIconButtonSizeV2[]) $VALUES.clone();
    }

    public AuraIconButtonSizeV2(String str, int i) {
    }

    /* renamed from: buttonSize-D9Ej5fM, reason: not valid java name */
    public final float m2554buttonSizeD9Ej5fM() {
        switch (ordinal()) {
            case 0:
                return 20.0f;
            case 1:
                return 24.0f;
            case 2:
                return 36.0f;
            case 3:
                return 44.0f;
            case 4:
                return 48.0f;
            case 5:
                return 56.0f;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: iconSize-D9Ej5fM, reason: not valid java name */
    public final float m2555iconSizeD9Ej5fM() {
        switch (ordinal()) {
            case 0:
                return 12.0f;
            case 1:
                return 16.0f;
            case 2:
                return 20.0f;
            case 3:
            case 4:
            case 5:
                return 24.0f;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
