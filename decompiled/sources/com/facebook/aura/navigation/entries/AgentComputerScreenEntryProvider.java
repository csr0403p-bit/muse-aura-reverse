package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.AgentComputerScreenKey;
import com.facebook.aura.navigation.key.AgentComputerTakeOverScreenKey;
import com.facebook.aura.navigation.key.RemoteBrowserScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class AgentComputerScreenEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final AgentComputerScreenEntryProvider INSTANCE = new AgentComputerScreenEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> map = AgentComputerScreenEntryProviderKt.agentComputerMetadata;
        G0W<AgentComputerScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$AgentComputerScreenEntryProviderKt.f88lambda$624479482;
        c5rn.A00(new G0U<AgentComputerScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.AgentComputerScreenEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(AgentComputerScreenKey agentComputerScreenKey) {
                return agentComputerScreenKey.toString();
            }
        }, new G0U<AgentComputerScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.AgentComputerScreenEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(AgentComputerScreenKey agentComputerScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(AgentComputerScreenKey agentComputerScreenKey) {
                return map;
            }
        }, g0w, C3cG.A0x(AgentComputerScreenKey.class));
        G0W<AgentComputerTakeOverScreenKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$AgentComputerScreenEntryProviderKt.f89lambda$920456758;
        c5rn.A00(new G0U<AgentComputerTakeOverScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.AgentComputerScreenEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(AgentComputerTakeOverScreenKey agentComputerTakeOverScreenKey) {
                return agentComputerTakeOverScreenKey.toString();
            }
        }, new G0U<AgentComputerTakeOverScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.AgentComputerScreenEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(AgentComputerTakeOverScreenKey agentComputerTakeOverScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(AgentComputerTakeOverScreenKey agentComputerTakeOverScreenKey) {
                return map;
            }
        }, g0w2, C3cG.A0x(AgentComputerTakeOverScreenKey.class));
        G0W<RemoteBrowserScreenKey, BFM, Integer, Unit> g0w3 = ComposableSingletons$AgentComputerScreenEntryProviderKt.lambda$1813589072;
        c5rn.A00(new G0U<RemoteBrowserScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.AgentComputerScreenEntryProvider$provideEntry$$inlined$entry$default$5
            @Override // X.G0U
            public final Object invoke(RemoteBrowserScreenKey remoteBrowserScreenKey) {
                return remoteBrowserScreenKey.toString();
            }
        }, new G0U<RemoteBrowserScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.AgentComputerScreenEntryProvider$provideEntry$$inlined$entry$default$6
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(RemoteBrowserScreenKey remoteBrowserScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(RemoteBrowserScreenKey remoteBrowserScreenKey) {
                return map;
            }
        }, g0w3, C3cG.A0x(RemoteBrowserScreenKey.class));
    }
}
