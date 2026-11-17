package com.facebook.aura.skills.connect;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import android.net.Uri;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;

/* loaded from: classes.dex */
public final class OAuthDeeplinkHandler {
    public static final int $stable = 0;
    public static final OAuthDeeplinkHandler INSTANCE = new OAuthDeeplinkHandler();

    public final void handleCustomConnectorComplete(Uri uri, AbstractC3358CGz abstractC3358CGz) {
        AnonymousClass003.A0u(uri, abstractC3358CGz);
        HatchConnectorCatalogRepository.Companion.getInstance(abstractC3358CGz).handleCustomConnectorComplete(uri);
    }

    public final void handleOAuthCallback(Uri uri, AbstractC3358CGz abstractC3358CGz) {
        AnonymousClass003.A0u(uri, abstractC3358CGz);
        HatchConnectorCatalogRepository.Companion.getInstance(abstractC3358CGz).handleOAuthCallback(uri);
    }

    public final void handleStripeLinkConnectComplete(Uri uri, AbstractC3358CGz abstractC3358CGz) {
        AnonymousClass003.A0u(uri, abstractC3358CGz);
        HatchConnectorCatalogRepository.Companion.getInstance(abstractC3358CGz).handleStripeLinkConnectComplete(uri);
    }
}
