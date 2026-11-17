package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.ConversationSearchScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ConversationSearchScreenEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final ConversationSearchScreenEntryProvider INSTANCE = new ConversationSearchScreenEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> map = AuraTransitionsKt.bottomUpTransitionMetadata;
        G0W<ConversationSearchScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$ConversationSearchScreenEntryProviderKt.lambda$403823455;
        c5rn.A00(new G0U<ConversationSearchScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ConversationSearchScreenEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(ConversationSearchScreenKey conversationSearchScreenKey) {
                return conversationSearchScreenKey.toString();
            }
        }, new G0U<ConversationSearchScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ConversationSearchScreenEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConversationSearchScreenKey conversationSearchScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConversationSearchScreenKey conversationSearchScreenKey) {
                return map;
            }
        }, g0w, C3cG.A0x(ConversationSearchScreenKey.class));
    }
}
