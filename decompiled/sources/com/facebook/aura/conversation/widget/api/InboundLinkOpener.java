package com.facebook.aura.conversation.widget.api;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggerKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class InboundLinkOpener {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ InboundLinkOpener[] $VALUES;
    public static final InboundLinkOpener FACEBOOK;
    public static final InboundLinkOpener INSTAGRAM;
    public final String value;

    static {
        InboundLinkOpener inboundLinkOpener = new InboundLinkOpener("FACEBOOK", 0, MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_FACEBOOK);
        FACEBOOK = inboundLinkOpener;
        InboundLinkOpener inboundLinkOpener2 = new InboundLinkOpener("INSTAGRAM", 1, MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_INSTAGRAM);
        INSTAGRAM = inboundLinkOpener2;
        InboundLinkOpener[] inboundLinkOpenerArr = {inboundLinkOpener, inboundLinkOpener2};
        $VALUES = inboundLinkOpenerArr;
        $ENTRIES = C3cG.A0w(inboundLinkOpenerArr);
    }

    public static Ey9<InboundLinkOpener> getEntries() {
        return $ENTRIES;
    }

    public static InboundLinkOpener valueOf(String str) {
        return (InboundLinkOpener) Enum.valueOf(InboundLinkOpener.class, str);
    }

    public static InboundLinkOpener[] values() {
        return (InboundLinkOpener[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public InboundLinkOpener(String str, int i, String str2) {
        this.value = str2;
    }
}
