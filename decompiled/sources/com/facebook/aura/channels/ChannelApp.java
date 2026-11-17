package com.facebook.aura.channels;

import X.AnonymousClass006;
import X.C06H;
import X.Ey9;
import X.F3w;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ChannelApp {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ChannelApp[] $VALUES;
    public static final ChannelApp INSTAGRAM;
    public static final ChannelApp MESSENGER;
    public static final ChannelApp TELEGRAM;
    public static final ChannelApp THREADS;
    public static final ChannelApp WHATSAPP = new ChannelApp("WHATSAPP", 0, Arrays.asList("com.whatsapp", "com.whatsapp.w4b"), "https://www.whatsapp.com", "https://wa.me/hatch/link");
    public final String handoffUrl;
    public final List<String> packageNames;
    public final String webUrl;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 4;
        MESSENGER = new ChannelApp("MESSENGER", 1, Arrays.asList("com.facebook.orca", "com.facebook.orca.debug"), "https://www.messenger.com", null, i, 0 == true ? 1 : 0);
        TELEGRAM = new ChannelApp("TELEGRAM", 2, Collections.singletonList("org.telegram.messenger"), "https://telegram.org", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        INSTAGRAM = new ChannelApp("INSTAGRAM", 3, Collections.singletonList("com.instagram.android"), "https://www.instagram.com", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        ChannelApp channelApp = new ChannelApp("THREADS", 4, Collections.singletonList("com.instagram.barcelona"), "https://www.threads.com", "barcelona://hatch");
        THREADS = channelApp;
        ChannelApp[] channelAppArr = {WHATSAPP, MESSENGER, TELEGRAM, INSTAGRAM, channelApp};
        $VALUES = channelAppArr;
        $ENTRIES = new F3w(channelAppArr);
    }

    public static Ey9<ChannelApp> getEntries() {
        return $ENTRIES;
    }

    public static ChannelApp valueOf(String str) {
        return (ChannelApp) Enum.valueOf(ChannelApp.class, str);
    }

    public static ChannelApp[] values() {
        return (ChannelApp[]) $VALUES.clone();
    }

    public final String getHandoffUrl() {
        return this.handoffUrl;
    }

    public final List<String> getPackageNames() {
        return this.packageNames;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public ChannelApp(String str, int i, List list, String str2, String str3) {
        this.packageNames = list;
        this.webUrl = str2;
        this.handoffUrl = str3;
    }

    public /* synthetic */ ChannelApp(String str, int i, List list, String str2, String str3, int i2, C06H c06h) {
        this(str, i, list, str2, AnonymousClass006.A0t(i2, str3));
    }
}
