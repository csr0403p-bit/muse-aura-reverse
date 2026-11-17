package com.facebook.aura.spaces.view.cards;

import X.AnonymousClass005;
import X.C7438Evz;
import X.G0W;
import com.facebook.aura.spaces.preload.SpacesShareBridge;

/* loaded from: classes3.dex */
public final /* synthetic */ class HtmlSpacesWebViewKt$SpacesShareBridgeEffect$2$1$shareHost$1 extends C7438Evz implements G0W<String, String, String, String> {
    public HtmlSpacesWebViewKt$SpacesShareBridgeEffect$2$1$shareHost$1(Object obj) {
        super(3, obj, SpacesShareBridge.class, "share", "share(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    @Override // X.G0W
    public final String invoke(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return ((SpacesShareBridge) this.receiver).share(str, str2, str3);
    }
}
