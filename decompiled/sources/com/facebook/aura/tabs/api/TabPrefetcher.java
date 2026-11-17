package com.facebook.aura.tabs.api;

import X.AbstractC3358CGz;
import X.HtJ;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import kotlin.Unit;

/* loaded from: classes3.dex */
public interface TabPrefetcher {
    AuraTabRootNavKey getTabRoot();

    Object prefetch(AbstractC3358CGz abstractC3358CGz, HtJ<? super Unit> htJ);
}
