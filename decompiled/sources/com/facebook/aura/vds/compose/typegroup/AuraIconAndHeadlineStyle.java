package com.facebook.aura.vds.compose.typegroup;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AuraIconAndHeadlineStyle {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraIconAndHeadlineStyle[] $VALUES;
    public static final AuraIconAndHeadlineStyle B1;
    public static final AuraIconAndHeadlineStyle B1_EMPHASIZED;
    public static final AuraIconAndHeadlineStyle B2;
    public static final AuraIconAndHeadlineStyle B2_EMPHASIZED;
    public static final AuraIconAndHeadlineStyle BODY_EMPHASIZED;
    public static final AuraIconAndHeadlineStyle BODY_REGULAR;
    public static final AuraIconAndHeadlineStyle FOOTNOTE_MEDIUM;
    public static final AuraIconAndHeadlineStyle HEADLINE2;
    public static final AuraIconAndHeadlineStyle HEADLINE2_EMPHASIZED;
    public static final AuraIconAndHeadlineStyle SUBTITLE;
    public static final AuraIconAndHeadlineStyle TITLE1_EMPHASIZED;
    public static final AuraIconAndHeadlineStyle TITLE2_EMPHASIZED;
    public static final AuraIconAndHeadlineStyle TITLE2_MEDIUM;
    public static final AuraIconAndHeadlineStyle TITLE3_MEDIUM;

    static {
        AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = new AuraIconAndHeadlineStyle("HEADLINE2", 0);
        HEADLINE2 = auraIconAndHeadlineStyle;
        AuraIconAndHeadlineStyle auraIconAndHeadlineStyle2 = new AuraIconAndHeadlineStyle("HEADLINE2_EMPHASIZED", 1);
        HEADLINE2_EMPHASIZED = auraIconAndHeadlineStyle2;
        AuraIconAndHeadlineStyle auraIconAndHeadlineStyle3 = new AuraIconAndHeadlineStyle("TITLE1_EMPHASIZED", 2);
        TITLE1_EMPHASIZED = auraIconAndHeadlineStyle3;
        AuraIconAndHeadlineStyle auraIconAndHeadlineStyle4 = new AuraIconAndHeadlineStyle("B1_EMPHASIZED", 3);
        B1_EMPHASIZED = auraIconAndHeadlineStyle4;
        AuraIconAndHeadlineStyle auraIconAndHeadlineStyle5 = new AuraIconAndHeadlineStyle("B1", 4);
        B1 = auraIconAndHeadlineStyle5;
        AuraIconAndHeadlineStyle auraIconAndHeadlineStyle6 = new AuraIconAndHeadlineStyle("B2_EMPHASIZED", 5);
        B2_EMPHASIZED = auraIconAndHeadlineStyle6;
        AuraIconAndHeadlineStyle auraIconAndHeadlineStyle7 = new AuraIconAndHeadlineStyle("B2", 6);
        B2 = auraIconAndHeadlineStyle7;
        AuraIconAndHeadlineStyle auraIconAndHeadlineStyle8 = new AuraIconAndHeadlineStyle("SUBTITLE", 7);
        SUBTITLE = auraIconAndHeadlineStyle8;
        AuraIconAndHeadlineStyle auraIconAndHeadlineStyle9 = new AuraIconAndHeadlineStyle("BODY_REGULAR", 8);
        BODY_REGULAR = auraIconAndHeadlineStyle9;
        AuraIconAndHeadlineStyle auraIconAndHeadlineStyle10 = new AuraIconAndHeadlineStyle("BODY_EMPHASIZED", 9);
        BODY_EMPHASIZED = auraIconAndHeadlineStyle10;
        AuraIconAndHeadlineStyle auraIconAndHeadlineStyle11 = new AuraIconAndHeadlineStyle("TITLE2_EMPHASIZED", 10);
        TITLE2_EMPHASIZED = auraIconAndHeadlineStyle11;
        AuraIconAndHeadlineStyle auraIconAndHeadlineStyle12 = new AuraIconAndHeadlineStyle("TITLE2_MEDIUM", 11);
        TITLE2_MEDIUM = auraIconAndHeadlineStyle12;
        AuraIconAndHeadlineStyle auraIconAndHeadlineStyle13 = new AuraIconAndHeadlineStyle("TITLE3_MEDIUM", 12);
        TITLE3_MEDIUM = auraIconAndHeadlineStyle13;
        AuraIconAndHeadlineStyle auraIconAndHeadlineStyle14 = new AuraIconAndHeadlineStyle("FOOTNOTE_MEDIUM", 13);
        FOOTNOTE_MEDIUM = auraIconAndHeadlineStyle14;
        AuraIconAndHeadlineStyle[] auraIconAndHeadlineStyleArr = {auraIconAndHeadlineStyle, auraIconAndHeadlineStyle2, auraIconAndHeadlineStyle3, auraIconAndHeadlineStyle4, auraIconAndHeadlineStyle5, auraIconAndHeadlineStyle6, auraIconAndHeadlineStyle7, auraIconAndHeadlineStyle8, auraIconAndHeadlineStyle9, auraIconAndHeadlineStyle10, auraIconAndHeadlineStyle11, auraIconAndHeadlineStyle12, auraIconAndHeadlineStyle13, auraIconAndHeadlineStyle14};
        $VALUES = auraIconAndHeadlineStyleArr;
        $ENTRIES = new F3w(auraIconAndHeadlineStyleArr);
    }

    public static Ey9<AuraIconAndHeadlineStyle> getEntries() {
        return $ENTRIES;
    }

    public static AuraIconAndHeadlineStyle valueOf(String str) {
        return (AuraIconAndHeadlineStyle) Enum.valueOf(AuraIconAndHeadlineStyle.class, str);
    }

    public static AuraIconAndHeadlineStyle[] values() {
        return (AuraIconAndHeadlineStyle[]) $VALUES.clone();
    }

    public AuraIconAndHeadlineStyle(String str, int i) {
    }
}
