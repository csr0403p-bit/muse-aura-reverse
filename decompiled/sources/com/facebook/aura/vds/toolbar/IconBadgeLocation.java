package com.facebook.aura.vds.toolbar;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class IconBadgeLocation {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ IconBadgeLocation[] $VALUES;
    public static final IconBadgeLocation BELOW_ICON_INSIDE_BACKGROUND;
    public static final IconBadgeLocation TOP_RIGHT_OF_BACKGROUND;
    public static final IconBadgeLocation TOP_RIGHT_OF_ICON;
    public final int badgeSizeDp;

    static {
        IconBadgeLocation iconBadgeLocation = new IconBadgeLocation("TOP_RIGHT_OF_ICON", 0, 6);
        TOP_RIGHT_OF_ICON = iconBadgeLocation;
        IconBadgeLocation iconBadgeLocation2 = new IconBadgeLocation("TOP_RIGHT_OF_BACKGROUND", 1, 9);
        TOP_RIGHT_OF_BACKGROUND = iconBadgeLocation2;
        IconBadgeLocation iconBadgeLocation3 = new IconBadgeLocation("BELOW_ICON_INSIDE_BACKGROUND", 2, 4);
        BELOW_ICON_INSIDE_BACKGROUND = iconBadgeLocation3;
        IconBadgeLocation[] iconBadgeLocationArr = {iconBadgeLocation, iconBadgeLocation2, iconBadgeLocation3};
        $VALUES = iconBadgeLocationArr;
        $ENTRIES = new F3w(iconBadgeLocationArr);
    }

    public static Ey9<IconBadgeLocation> getEntries() {
        return $ENTRIES;
    }

    public static IconBadgeLocation valueOf(String str) {
        return (IconBadgeLocation) Enum.valueOf(IconBadgeLocation.class, str);
    }

    public static IconBadgeLocation[] values() {
        return (IconBadgeLocation[]) $VALUES.clone();
    }

    public final int getBadgeSizeDp() {
        return this.badgeSizeDp;
    }

    public IconBadgeLocation(String str, int i, int i2) {
        this.badgeSizeDp = i2;
    }
}
