package com.facebook.aura.vds.compose.typegroup;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AuraHeadlineAndBodyStyle {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraHeadlineAndBodyStyle[] $VALUES;
    public static final AuraHeadlineAndBodyStyle B1_EMPHASIZED_B2;
    public static final AuraHeadlineAndBodyStyle B2_B2;
    public static final AuraHeadlineAndBodyStyle H2_EMPHASIZED_B1;
    public static final AuraHeadlineAndBodyStyle HEADLINE2_BODY1;
    public static final AuraHeadlineAndBodyStyle TITLE1_EMPHASIZED_B1;
    public static final AuraHeadlineAndBodyStyle TITLE1_EMPHASIZED_B2;
    public static final AuraHeadlineAndBodyStyle TITLE2_EMPHASIZED_SUBHEADLINE_REGULAR;
    public static final AuraHeadlineAndBodyStyle TITLE2_MEDIUM_SUBHEADLINE_REGULAR;
    public static final AuraHeadlineAndBodyStyle TITLE3_MEDIUM_SUBHEADLINE_REGULAR;

    static {
        AuraHeadlineAndBodyStyle auraHeadlineAndBodyStyle = new AuraHeadlineAndBodyStyle("HEADLINE2_BODY1", 0);
        HEADLINE2_BODY1 = auraHeadlineAndBodyStyle;
        AuraHeadlineAndBodyStyle auraHeadlineAndBodyStyle2 = new AuraHeadlineAndBodyStyle("H2_EMPHASIZED_B1", 1);
        H2_EMPHASIZED_B1 = auraHeadlineAndBodyStyle2;
        AuraHeadlineAndBodyStyle auraHeadlineAndBodyStyle3 = new AuraHeadlineAndBodyStyle("TITLE1_EMPHASIZED_B1", 2);
        TITLE1_EMPHASIZED_B1 = auraHeadlineAndBodyStyle3;
        AuraHeadlineAndBodyStyle auraHeadlineAndBodyStyle4 = new AuraHeadlineAndBodyStyle("TITLE1_EMPHASIZED_B2", 3);
        TITLE1_EMPHASIZED_B2 = auraHeadlineAndBodyStyle4;
        AuraHeadlineAndBodyStyle auraHeadlineAndBodyStyle5 = new AuraHeadlineAndBodyStyle("B1_EMPHASIZED_B2", 4);
        B1_EMPHASIZED_B2 = auraHeadlineAndBodyStyle5;
        AuraHeadlineAndBodyStyle auraHeadlineAndBodyStyle6 = new AuraHeadlineAndBodyStyle("B2_B2", 5);
        B2_B2 = auraHeadlineAndBodyStyle6;
        AuraHeadlineAndBodyStyle auraHeadlineAndBodyStyle7 = new AuraHeadlineAndBodyStyle("TITLE2_EMPHASIZED_SUBHEADLINE_REGULAR", 6);
        TITLE2_EMPHASIZED_SUBHEADLINE_REGULAR = auraHeadlineAndBodyStyle7;
        AuraHeadlineAndBodyStyle auraHeadlineAndBodyStyle8 = new AuraHeadlineAndBodyStyle("TITLE2_MEDIUM_SUBHEADLINE_REGULAR", 7);
        TITLE2_MEDIUM_SUBHEADLINE_REGULAR = auraHeadlineAndBodyStyle8;
        AuraHeadlineAndBodyStyle auraHeadlineAndBodyStyle9 = new AuraHeadlineAndBodyStyle("TITLE3_MEDIUM_SUBHEADLINE_REGULAR", 8);
        TITLE3_MEDIUM_SUBHEADLINE_REGULAR = auraHeadlineAndBodyStyle9;
        AuraHeadlineAndBodyStyle[] auraHeadlineAndBodyStyleArr = {auraHeadlineAndBodyStyle, auraHeadlineAndBodyStyle2, auraHeadlineAndBodyStyle3, auraHeadlineAndBodyStyle4, auraHeadlineAndBodyStyle5, auraHeadlineAndBodyStyle6, auraHeadlineAndBodyStyle7, auraHeadlineAndBodyStyle8, auraHeadlineAndBodyStyle9};
        $VALUES = auraHeadlineAndBodyStyleArr;
        $ENTRIES = new F3w(auraHeadlineAndBodyStyleArr);
    }

    public static Ey9<AuraHeadlineAndBodyStyle> getEntries() {
        return $ENTRIES;
    }

    public static AuraHeadlineAndBodyStyle valueOf(String str) {
        return (AuraHeadlineAndBodyStyle) Enum.valueOf(AuraHeadlineAndBodyStyle.class, str);
    }

    public static AuraHeadlineAndBodyStyle[] values() {
        return (AuraHeadlineAndBodyStyle[]) $VALUES.clone();
    }

    public AuraHeadlineAndBodyStyle(String str, int i) {
    }
}
