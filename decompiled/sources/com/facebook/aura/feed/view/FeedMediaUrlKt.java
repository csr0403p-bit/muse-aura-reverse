package com.facebook.aura.feed.view;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass003;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.model.ExternalLinkPresentationJsonKt;

/* loaded from: classes.dex */
public abstract class FeedMediaUrlKt {
    public static final String resolveFeedMediaUrl(String str, AbstractC3358CGz abstractC3358CGz) {
        AnonymousClass003.A0u(str, abstractC3358CGz);
        String strA0l = AnonymousClass002.A0l(str);
        if (strA0l.length() <= 0) {
            return null;
        }
        if (strA0l.startsWith(ExternalLinkPresentationJsonKt.HTTP_SCHEME_PREFIX) || strA0l.startsWith("https://")) {
            return strA0l;
        }
        WorkspaceUriResolver workspaceUriResolver = WorkspaceUriResolver.INSTANCE;
        return workspaceUriResolver.isDaemonApiReference(strA0l) ? workspaceUriResolver.resolveDaemonApiUrl(strA0l, abstractC3358CGz) : strA0l;
    }
}
