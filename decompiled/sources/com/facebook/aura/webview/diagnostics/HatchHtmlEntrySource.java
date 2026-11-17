package com.facebook.aura.webview.diagnostics;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchHtmlEntrySource {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchHtmlEntrySource[] $VALUES;
    public static final HatchHtmlEntrySource CHAT_CHIP;
    public static final HatchHtmlEntrySource CHAT_INLINE;
    public static final HatchHtmlEntrySource DEEPLINK;
    public static final HatchHtmlEntrySource LIBRARY;
    public static final HatchHtmlEntrySource MARKDOWN_LINK;
    public static final HatchHtmlEntrySource PREFETCH;
    public final String wireName;

    static {
        HatchHtmlEntrySource hatchHtmlEntrySource = new HatchHtmlEntrySource("CHAT_CHIP", 0, "chat_chip");
        CHAT_CHIP = hatchHtmlEntrySource;
        HatchHtmlEntrySource hatchHtmlEntrySource2 = new HatchHtmlEntrySource("CHAT_INLINE", 1, "chat_inline");
        CHAT_INLINE = hatchHtmlEntrySource2;
        HatchHtmlEntrySource hatchHtmlEntrySource3 = new HatchHtmlEntrySource("LIBRARY", 2, "library");
        LIBRARY = hatchHtmlEntrySource3;
        HatchHtmlEntrySource hatchHtmlEntrySource4 = new HatchHtmlEntrySource("DEEPLINK", 3, "deeplink");
        DEEPLINK = hatchHtmlEntrySource4;
        HatchHtmlEntrySource hatchHtmlEntrySource5 = new HatchHtmlEntrySource("MARKDOWN_LINK", 4, "markdown_link");
        MARKDOWN_LINK = hatchHtmlEntrySource5;
        HatchHtmlEntrySource hatchHtmlEntrySource6 = new HatchHtmlEntrySource("PREFETCH", 5, "prefetch");
        PREFETCH = hatchHtmlEntrySource6;
        HatchHtmlEntrySource[] hatchHtmlEntrySourceArr = {hatchHtmlEntrySource, hatchHtmlEntrySource2, hatchHtmlEntrySource3, hatchHtmlEntrySource4, hatchHtmlEntrySource5, hatchHtmlEntrySource6};
        $VALUES = hatchHtmlEntrySourceArr;
        $ENTRIES = C3cG.A0w(hatchHtmlEntrySourceArr);
    }

    public static Ey9<HatchHtmlEntrySource> getEntries() {
        return $ENTRIES;
    }

    public static HatchHtmlEntrySource valueOf(String str) {
        return (HatchHtmlEntrySource) Enum.valueOf(HatchHtmlEntrySource.class, str);
    }

    public static HatchHtmlEntrySource[] values() {
        return (HatchHtmlEntrySource[]) $VALUES.clone();
    }

    public final String getWireName() {
        return this.wireName;
    }

    public HatchHtmlEntrySource(String str, int i, String str2) {
        this.wireName = str2;
    }
}
