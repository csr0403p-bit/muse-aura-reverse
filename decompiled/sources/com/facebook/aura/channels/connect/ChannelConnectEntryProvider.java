package com.facebook.aura.channels.connect;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.OverlaySceneStrategy;
import com.facebook.aura.navigation.key.ChannelConnectScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ChannelConnectEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final ChannelConnectEntryProvider INSTANCE = new ChannelConnectEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> mapOverlay = OverlaySceneStrategy.Companion.overlay(Integer.MAX_VALUE);
        G0W<ChannelConnectScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$ChannelConnectEntryProviderKt.f15lambda$1734296719;
        c5rn.A00(new G0U<ChannelConnectScreenKey, Object>() { // from class: com.facebook.aura.channels.connect.ChannelConnectEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(ChannelConnectScreenKey channelConnectScreenKey) {
                return channelConnectScreenKey.toString();
            }
        }, new G0U<ChannelConnectScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.channels.connect.ChannelConnectEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ChannelConnectScreenKey channelConnectScreenKey) {
                return mapOverlay;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ChannelConnectScreenKey channelConnectScreenKey) {
                return mapOverlay;
            }
        }, g0w, C3cG.A0x(ChannelConnectScreenKey.class));
    }
}
