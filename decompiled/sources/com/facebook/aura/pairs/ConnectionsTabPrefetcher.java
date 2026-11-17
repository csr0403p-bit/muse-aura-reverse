package com.facebook.aura.pairs;

import X.AbstractC3358CGz;
import X.EnumC10460Hji;
import X.HtJ;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import com.facebook.aura.navigation.key.ConnectionsScreenKey;
import com.facebook.aura.tabs.api.TabPrefetcher;
import com.facebook.aura.utils.HatchUtil;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ConnectionsTabPrefetcher implements TabPrefetcher {
    public static final ConnectionsTabPrefetcher INSTANCE = new ConnectionsTabPrefetcher();
    public static final AuraTabRootNavKey tabRoot = ConnectionsScreenKey.INSTANCE;

    @Override // com.facebook.aura.tabs.api.TabPrefetcher
    public AuraTabRootNavKey getTabRoot() {
        return tabRoot;
    }

    @Override // com.facebook.aura.tabs.api.TabPrefetcher
    public Object prefetch(AbstractC3358CGz abstractC3358CGz, HtJ<? super Unit> htJ) {
        Object objLoadIfNeeded;
        return (HatchUtil.INSTANCE.isConnectionsTabEnabled() && (objLoadIfNeeded = ConnectionsTabStore.Companion.getInstance(abstractC3358CGz).loadIfNeeded(htJ)) == EnumC10460Hji.A02) ? objLoadIfNeeded : Unit.INSTANCE;
    }
}
