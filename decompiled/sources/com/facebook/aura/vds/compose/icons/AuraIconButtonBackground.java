package com.facebook.aura.vds.compose.icons;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C1D8;
import X.C1DM;
import X.C1OM;
import X.C7384Etj;
import X.Ey9;
import X.F3w;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AuraIconButtonBackground {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraIconButtonBackground[] $VALUES;
    public static final AuraIconButtonBackground NO_BACKGROUND;
    public static final AuraIconButtonBackground WITH_CIRCLE_BACKGROUND;

    public final boolean compatibleWithStyle(AuraIconButtonStyle auraIconButtonStyle) {
        AuraIconButtonStyle[] auraIconButtonStyleArr;
        C7384Etj.A0Y(auraIconButtonStyle, 0);
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            auraIconButtonStyleArr = new AuraIconButtonStyle[]{AuraIconButtonStyle.PRIMARY, AuraIconButtonStyle.SECONDARY};
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            auraIconButtonStyleArr = new AuraIconButtonStyle[]{AuraIconButtonStyle.PRIMARY, AuraIconButtonStyle.SECONDARY, AuraIconButtonStyle.FLAT, AuraIconButtonStyle.ELEVATED_V2};
        }
        return Arrays.asList(auraIconButtonStyleArr).contains(auraIconButtonStyle);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuraIconButtonBackground.values().length];
            try {
                AnonymousClass002.A13(AuraIconButtonBackground.NO_BACKGROUND, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AuraIconButtonBackground.WITH_CIRCLE_BACKGROUND, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        AuraIconButtonBackground auraIconButtonBackground = new AuraIconButtonBackground("NO_BACKGROUND", 0);
        NO_BACKGROUND = auraIconButtonBackground;
        AuraIconButtonBackground auraIconButtonBackground2 = new AuraIconButtonBackground("WITH_CIRCLE_BACKGROUND", 1);
        WITH_CIRCLE_BACKGROUND = auraIconButtonBackground2;
        AuraIconButtonBackground[] auraIconButtonBackgroundArr = {auraIconButtonBackground, auraIconButtonBackground2};
        $VALUES = auraIconButtonBackgroundArr;
        $ENTRIES = new F3w(auraIconButtonBackgroundArr);
    }

    public static Ey9<AuraIconButtonBackground> getEntries() {
        return $ENTRIES;
    }

    public static AuraIconButtonBackground valueOf(String str) {
        return (AuraIconButtonBackground) Enum.valueOf(AuraIconButtonBackground.class, str);
    }

    public static AuraIconButtonBackground[] values() {
        return (AuraIconButtonBackground[]) $VALUES.clone();
    }

    public final boolean hasBackground() {
        return AnonymousClass006.A1Z(this, NO_BACKGROUND);
    }

    public AuraIconButtonBackground(String str, int i) {
    }

    public final C1DM shape() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return C1OM.A00;
        }
        if (iOrdinal == 1) {
            return C1D8.A00;
        }
        throw new NoWhenBranchMatchedException();
    }
}
