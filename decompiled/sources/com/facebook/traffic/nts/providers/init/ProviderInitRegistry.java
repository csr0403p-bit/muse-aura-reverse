package com.facebook.traffic.nts.providers.init;

import X.AnonymousClass005;
import X.C3cG;
import X.C7384Etj;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ProviderInitRegistry {
    public final Map<InitOption, List<ProviderInitEntry>> registry = C3cG.A0j();
    public final Set<ProviderId> initializedProviders = C3cG.A0k();

    public final synchronized void initProviders(InitOption initOption) {
        C7384Etj.A0Y(initOption, 0);
        List<ProviderInitEntry> list = this.registry.get(initOption);
        if (list != null) {
            for (ProviderInitEntry providerInitEntry : list) {
                if (this.initializedProviders.add(providerInitEntry.providerId)) {
                    providerInitEntry.action.invoke();
                }
            }
        }
    }

    public final synchronized void register(InitOption initOption, ProviderId providerId, Function0<Unit> function0) {
        AnonymousClass005.A0x(initOption, providerId, function0);
        Map<InitOption, List<ProviderInitEntry>> map = this.registry;
        List<ProviderInitEntry> listA0h = map.get(initOption);
        if (listA0h == null) {
            listA0h = C3cG.A0h();
            map.put(initOption, listA0h);
        }
        listA0h.add(new ProviderInitEntry(providerId, function0));
    }
}
