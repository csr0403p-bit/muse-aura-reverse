package com.facebook.aura.conversation.api;

import X.C3cG;
import X.C7384Etj;
import X.GAt;
import X.InterfaceC10560Hsz;

/* loaded from: classes2.dex */
public final class ConversationWidgetRequest {
    public static final int $stable = 8;
    public final InterfaceC10560Hsz<FoundWidget> answer;
    public final String widgetId;

    public ConversationWidgetRequest(String str) {
        C7384Etj.A0Y(str, 0);
        this.widgetId = str;
        this.answer = new GAt(null);
    }

    public final InterfaceC10560Hsz<FoundWidget> getAnswer$fbandroid_express_aura_java_com_facebook_aura_conversation_api_api() {
        return this.answer;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public final void respond(Object obj, boolean z) {
        C3cG.A1F(this.answer, obj != null ? new FoundWidget(obj, z) : null);
    }
}
