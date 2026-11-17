package com.facebook.aura.vds.compose.contextmenu;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AuraContextMenuStyle {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraContextMenuStyle[] $VALUES;
    public static final AuraContextMenuStyle Default;
    public static final AuraContextMenuStyle OnMedia;
    public static final AuraContextMenuStyle OnMediaTranslucent;

    static {
        AuraContextMenuStyle auraContextMenuStyle = new AuraContextMenuStyle("Default", 0);
        Default = auraContextMenuStyle;
        AuraContextMenuStyle auraContextMenuStyle2 = new AuraContextMenuStyle("OnMedia", 1);
        OnMedia = auraContextMenuStyle2;
        AuraContextMenuStyle auraContextMenuStyle3 = new AuraContextMenuStyle("OnMediaTranslucent", 2);
        OnMediaTranslucent = auraContextMenuStyle3;
        AuraContextMenuStyle[] auraContextMenuStyleArr = {auraContextMenuStyle, auraContextMenuStyle2, auraContextMenuStyle3};
        $VALUES = auraContextMenuStyleArr;
        $ENTRIES = new F3w(auraContextMenuStyleArr);
    }

    public static Ey9<AuraContextMenuStyle> getEntries() {
        return $ENTRIES;
    }

    public static AuraContextMenuStyle valueOf(String str) {
        return (AuraContextMenuStyle) Enum.valueOf(AuraContextMenuStyle.class, str);
    }

    public static AuraContextMenuStyle[] values() {
        return (AuraContextMenuStyle[]) $VALUES.clone();
    }

    public AuraContextMenuStyle(String str, int i) {
    }
}
