package com.facebook.aura.pairs;

import X.AbstractC3358CGz;
import X.C20Q;
import X.C7384Etj;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import com.facebook.aura.tabs.api.TabAttentionProvider;
import com.facebook.aura.tabs.api.TabAttentionSource;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class ConnectionsTabAttentionProvider implements TabAttentionProvider {
    public static final int $stable = 0;
    public static final ConnectionsTabAttentionProvider INSTANCE = new ConnectionsTabAttentionProvider();

    @Override // com.facebook.aura.tabs.api.TabAttentionProvider
    public TabAttentionSource source() {
        return new TabAttentionSource() { // from class: com.facebook.aura.pairs.ConnectionsTabAttentionProvider.source.1
            @Override // com.facebook.aura.tabs.api.TabAttentionSource
            public final C20Q<Map<AuraTabRootNavKey, Set<String>>> attention(AbstractC3358CGz abstractC3358CGz) {
                C7384Etj.A0Y(abstractC3358CGz, 0);
                return new ConnectionsTabAttentionProvider$source$1$attention$$inlined$map$1(ConnectionsActivityEvents.Companion.getInstance(abstractC3358CGz).ids);
            }
        };
    }
}
