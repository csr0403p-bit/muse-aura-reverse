package com.facebook.aura.widgets;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class WidgetTextStyle {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ WidgetTextStyle[] $VALUES;
    public static final WidgetTextStyle HEADLINE;
    public static final WidgetTextStyle SUBTITLE;
    public static final WidgetTextStyle TITLE;
    public final float letterSpacing;
    public final float sizeSp;
    public final int weight;

    static {
        WidgetTextStyle widgetTextStyle = new WidgetTextStyle("TITLE", 0, 15.0f, 600, 0.015f);
        TITLE = widgetTextStyle;
        WidgetTextStyle widgetTextStyle2 = new WidgetTextStyle("SUBTITLE", 1, 13.0f, 400, 0.01f);
        SUBTITLE = widgetTextStyle2;
        WidgetTextStyle widgetTextStyle3 = new WidgetTextStyle("HEADLINE", 2, 20.0f, 500, 0.0f);
        HEADLINE = widgetTextStyle3;
        WidgetTextStyle[] widgetTextStyleArr = {widgetTextStyle, widgetTextStyle2, widgetTextStyle3};
        $VALUES = widgetTextStyleArr;
        $ENTRIES = C3cG.A0w(widgetTextStyleArr);
    }

    public static Ey9<WidgetTextStyle> getEntries() {
        return $ENTRIES;
    }

    public static WidgetTextStyle valueOf(String str) {
        return (WidgetTextStyle) Enum.valueOf(WidgetTextStyle.class, str);
    }

    public static WidgetTextStyle[] values() {
        return (WidgetTextStyle[]) $VALUES.clone();
    }

    public final float getLetterSpacing() {
        return this.letterSpacing;
    }

    public final float getSizeSp() {
        return this.sizeSp;
    }

    public final int getWeight() {
        return this.weight;
    }

    public WidgetTextStyle(String str, int i, float f, int i2, float f2) {
        this.sizeSp = f;
        this.weight = i2;
        this.letterSpacing = f2;
    }
}
