package com.facebook.aura.navigation.entries;

import X.AGH;
import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.ModalFlowSceneStrategy;
import com.facebook.aura.navigation.key.ConversationScreenKey;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ConversationEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final ConversationEntryProvider INSTANCE = new ConversationEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> map = ConversationEntryProviderKt.conversationTabTransitionMetadata;
        G0W<ConversationTabScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$ConversationEntryProviderKt.lambda$638731560;
        c5rn.A00(new G0U<ConversationTabScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ConversationEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(ConversationTabScreenKey conversationTabScreenKey) {
                return conversationTabScreenKey.toString();
            }
        }, new G0U<ConversationTabScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ConversationEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConversationTabScreenKey conversationTabScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConversationTabScreenKey conversationTabScreenKey) {
                return map;
            }
        }, g0w, C3cG.A0x(ConversationTabScreenKey.class));
        final LinkedHashMap linkedHashMapA02 = AGH.A02(AuraTransitionsKt.tabTransitionMetadata, ModalFlowSceneStrategy.Companion.immersive());
        G0W<ConversationScreenKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$ConversationEntryProviderKt.f124lambda$2146003176;
        c5rn.A00(new G0U<ConversationScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ConversationEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(ConversationScreenKey conversationScreenKey) {
                return conversationScreenKey.toString();
            }
        }, new G0U<ConversationScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ConversationEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConversationScreenKey conversationScreenKey) {
                return linkedHashMapA02;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConversationScreenKey conversationScreenKey) {
                return linkedHashMapA02;
            }
        }, g0w2, C3cG.A0x(ConversationScreenKey.class));
    }
}
