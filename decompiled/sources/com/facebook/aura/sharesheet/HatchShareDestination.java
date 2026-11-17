package com.facebook.aura.sharesheet;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchShareDestination {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchShareDestination[] $VALUES;
    public static final HatchShareDestination COPY_LINK;
    public static final HatchShareDestination FACEBOOK_FEED;
    public static final HatchShareDestination FACEBOOK_STORIES;
    public static final HatchShareDestination INSTAGRAM_DIRECT;
    public static final HatchShareDestination INSTAGRAM_STORIES;
    public static final HatchShareDestination MESSENGER;
    public static final HatchShareDestination OS_MESSAGES;
    public static final HatchShareDestination OS_SHARE_TO;
    public static final HatchShareDestination SAVE;
    public static final HatchShareDestination THREADS;
    public static final HatchShareDestination WHATSAPP;

    /* renamed from: X, reason: collision with root package name */
    public static final HatchShareDestination f315X;
    public final boolean isMetaProperty;

    static {
        HatchShareDestination hatchShareDestination = new HatchShareDestination("INSTAGRAM_DIRECT", 0, true);
        INSTAGRAM_DIRECT = hatchShareDestination;
        HatchShareDestination hatchShareDestination2 = new HatchShareDestination("INSTAGRAM_STORIES", 1, true);
        INSTAGRAM_STORIES = hatchShareDestination2;
        HatchShareDestination hatchShareDestination3 = new HatchShareDestination("FACEBOOK_STORIES", 2, true);
        FACEBOOK_STORIES = hatchShareDestination3;
        HatchShareDestination hatchShareDestination4 = new HatchShareDestination("FACEBOOK_FEED", 3, true);
        FACEBOOK_FEED = hatchShareDestination4;
        HatchShareDestination hatchShareDestination5 = new HatchShareDestination("WHATSAPP", 4, true);
        WHATSAPP = hatchShareDestination5;
        HatchShareDestination hatchShareDestination6 = new HatchShareDestination("OS_SHARE_TO", 5, false);
        OS_SHARE_TO = hatchShareDestination6;
        HatchShareDestination hatchShareDestination7 = new HatchShareDestination("MESSENGER", 6, true);
        MESSENGER = hatchShareDestination7;
        HatchShareDestination hatchShareDestination8 = new HatchShareDestination("THREADS", 7, true);
        THREADS = hatchShareDestination8;
        HatchShareDestination hatchShareDestination9 = new HatchShareDestination("X", 8, false);
        f315X = hatchShareDestination9;
        HatchShareDestination hatchShareDestination10 = new HatchShareDestination("OS_MESSAGES", 9, false);
        OS_MESSAGES = hatchShareDestination10;
        HatchShareDestination hatchShareDestination11 = new HatchShareDestination("COPY_LINK", 10, false);
        COPY_LINK = hatchShareDestination11;
        HatchShareDestination hatchShareDestination12 = new HatchShareDestination("SAVE", 11, true);
        SAVE = hatchShareDestination12;
        HatchShareDestination[] hatchShareDestinationArr = {hatchShareDestination, hatchShareDestination2, hatchShareDestination3, hatchShareDestination4, hatchShareDestination5, hatchShareDestination6, hatchShareDestination7, hatchShareDestination8, hatchShareDestination9, hatchShareDestination10, hatchShareDestination11, hatchShareDestination12};
        $VALUES = hatchShareDestinationArr;
        $ENTRIES = new F3w(hatchShareDestinationArr);
    }

    public static Ey9<HatchShareDestination> getEntries() {
        return $ENTRIES;
    }

    public static HatchShareDestination valueOf(String str) {
        return (HatchShareDestination) Enum.valueOf(HatchShareDestination.class, str);
    }

    public static HatchShareDestination[] values() {
        return (HatchShareDestination[]) $VALUES.clone();
    }

    public final boolean isMetaProperty() {
        return this.isMetaProperty;
    }

    public HatchShareDestination(String str, int i, boolean z) {
        this.isMetaProperty = z;
    }
}
