package com.facebook.aura.vds.compose.icons;

import X.AKH;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFM;
import X.Ey9;
import X.F3w;
import com.facebook.aura.vds.compose.theme.AuraAdaptiveColorsKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsIconTint;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AuraIconButtonStyle {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraIconButtonStyle[] $VALUES;
    public static final AuraIconButtonStyle ELEVATED_V2;
    public static final AuraIconButtonStyle FLAT;
    public static final AuraIconButtonStyle PRIMARY;
    public static final AuraIconButtonStyle SECONDARY;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuraIconButtonStyle.values().length];
            try {
                AnonymousClass002.A13(AuraIconButtonStyle.FLAT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AuraIconButtonStyle.ELEVATED_V2, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AuraIconButtonStyle.PRIMARY, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AuraIconButtonStyle.SECONDARY, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        AuraIconButtonStyle auraIconButtonStyle = new AuraIconButtonStyle("PRIMARY", 0);
        PRIMARY = auraIconButtonStyle;
        AuraIconButtonStyle auraIconButtonStyle2 = new AuraIconButtonStyle("SECONDARY", 1);
        SECONDARY = auraIconButtonStyle2;
        AuraIconButtonStyle auraIconButtonStyle3 = new AuraIconButtonStyle("FLAT", 2);
        FLAT = auraIconButtonStyle3;
        AuraIconButtonStyle auraIconButtonStyle4 = new AuraIconButtonStyle("ELEVATED_V2", 3);
        ELEVATED_V2 = auraIconButtonStyle4;
        AuraIconButtonStyle[] auraIconButtonStyleArr = {auraIconButtonStyle, auraIconButtonStyle2, auraIconButtonStyle3, auraIconButtonStyle4};
        $VALUES = auraIconButtonStyleArr;
        $ENTRIES = new F3w(auraIconButtonStyleArr);
    }

    public static Ey9<AuraIconButtonStyle> getEntries() {
        return $ENTRIES;
    }

    public static AuraIconButtonStyle valueOf(String str) {
        return (AuraIconButtonStyle) Enum.valueOf(AuraIconButtonStyle.class, str);
    }

    public static AuraIconButtonStyle[] values() {
        return (AuraIconButtonStyle[]) $VALUES.clone();
    }

    public AuraIconButtonStyle(String str, int i) {
    }

    /* renamed from: backgroundColor-WaAFU9c, reason: not valid java name */
    public final long m2556backgroundColorWaAFU9c(BFM bfm, int i) {
        int i2;
        long jAdaptiveFill;
        int i3;
        int iOrdinal = ordinal();
        if (iOrdinal == 2) {
            i2 = 121836979;
        } else {
            if (iOrdinal != 3) {
                if (iOrdinal != 0) {
                    i3 = 121833598;
                    if (iOrdinal != 1) {
                        throw AnonymousClass005.A0k(bfm, 121830342);
                    }
                } else {
                    i3 = 121831614;
                }
                jAdaptiveFill = AnonymousClass003.A0c(bfm, i3).secondaryButtonBackground;
                AnonymousClass002.A19(bfm);
                return jAdaptiveFill;
            }
            i2 = 121838675;
        }
        jAdaptiveFill = AuraAdaptiveColorsKt.adaptiveFill(AnonymousClass003.A0c(bfm, i2), bfm, AuraColors.$stable);
        AnonymousClass002.A19(bfm);
        return jAdaptiveFill;
    }

    /* renamed from: iconColor-WaAFU9c, reason: not valid java name */
    public final long m2557iconColorWaAFU9c(BFM bfm, int i) {
        long j;
        int i2;
        AuraColorsIconTint auraColorsIconTint;
        int iOrdinal = ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                i2 = 1955874999;
            } else if (iOrdinal == 0) {
                i2 = 1955868343;
            } else {
                if (iOrdinal != 1) {
                    throw AnonymousClass005.A0k(bfm, 1955866697);
                }
                auraColorsIconTint = AnonymousClass003.A0c(bfm, 1955870199).secondaryIcon;
                j = auraColorsIconTint.enabled;
            }
            auraColorsIconTint = AnonymousClass003.A0c(bfm, i2).primaryIcon;
            j = auraColorsIconTint.enabled;
        } else {
            j = AnonymousClass003.A0c(bfm, 1955873019).primaryText;
        }
        AnonymousClass002.A19(bfm);
        return j;
    }

    public final boolean isV2Style() {
        int iOrdinal = ordinal();
        return iOrdinal == 2 || iOrdinal == 3;
    }

    public final AuraIconButtonStyleConfig toConfig(BFM bfm, int i) {
        AuraIconButtonStyleConfig auraIconButtonStyleConfigFlat;
        AKH<AuraColors> akh;
        AuraColorsIconTint auraColorsIconTint;
        int iOrdinal = ordinal();
        if (iOrdinal == 2) {
            bfm.AgE(116283465);
            auraIconButtonStyleConfigFlat = AuraIconButtonStyles.INSTANCE.flat(bfm, 6);
        } else if (iOrdinal != 3) {
            if (iOrdinal == 0) {
                bfm.AgE(116268053);
                akh = AuraColorsKt.LocalAuraColors;
                auraColorsIconTint = AnonymousClass001.A0f(bfm, akh).primaryIcon;
            } else {
                if (iOrdinal != 1) {
                    throw AnonymousClass005.A0k(bfm, 116266445);
                }
                bfm.AgE(116274711);
                akh = AuraColorsKt.LocalAuraColors;
                auraColorsIconTint = AnonymousClass001.A0f(bfm, akh).secondaryIcon;
            }
            auraIconButtonStyleConfigFlat = new AuraIconButtonStyleConfig(auraColorsIconTint.enabled, AnonymousClass001.A0f(bfm, akh).secondaryButtonBackground, null, false, 0.0f);
        } else {
            bfm.AgE(116285039);
            auraIconButtonStyleConfigFlat = AuraIconButtonStyles.INSTANCE.elevatedV2(bfm, 6);
        }
        AnonymousClass002.A19(bfm);
        return auraIconButtonStyleConfigFlat;
    }
}
