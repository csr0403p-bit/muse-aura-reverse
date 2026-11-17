package com.facebook.aura.conversation.api.links;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import android.content.Context;
import com.facebook.aura.navigation.AuraNavigator;

/* loaded from: classes3.dex */
public final class ConversationLinkTap {
    public final Context context;
    public final AuraNavigator navigator;
    public final String sourceSessionId;
    public final String url;
    public final AbstractC3358CGz userSession;

    public final Context getContext() {
        return this.context;
    }

    public final AuraNavigator getNavigator() {
        return this.navigator;
    }

    public final String getSourceSessionId() {
        return this.sourceSessionId;
    }

    public final String getUrl() {
        return this.url;
    }

    public final AbstractC3358CGz getUserSession() {
        return this.userSession;
    }

    public ConversationLinkTap(AbstractC3358CGz abstractC3358CGz, String str, Context context, AuraNavigator auraNavigator, String str2) {
        AnonymousClass005.A14(abstractC3358CGz, str, context, auraNavigator);
        this.userSession = abstractC3358CGz;
        this.url = str;
        this.context = context;
        this.navigator = auraNavigator;
        this.sourceSessionId = str2;
    }
}
