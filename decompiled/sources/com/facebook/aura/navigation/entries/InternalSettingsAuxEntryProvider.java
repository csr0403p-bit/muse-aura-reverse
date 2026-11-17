package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.ColorsScreenKey;
import com.facebook.aura.navigation.key.ModelSelectionScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class InternalSettingsAuxEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final InternalSettingsAuxEntryProvider INSTANCE = new InternalSettingsAuxEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA0o = C3cG.A0o(c5rn);
        G0W<ModelSelectionScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$InternalSettingsEntryProviderKt.lambda$2082858605;
        c5rn.A00(new G0U<ModelSelectionScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.InternalSettingsAuxEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(ModelSelectionScreenKey modelSelectionScreenKey) {
                return modelSelectionScreenKey.toString();
            }
        }, new G0U<ModelSelectionScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.InternalSettingsAuxEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ModelSelectionScreenKey modelSelectionScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ModelSelectionScreenKey modelSelectionScreenKey) {
                return mapA0o;
            }
        }, g0w, C3cG.A0x(ModelSelectionScreenKey.class));
        G0W<ColorsScreenKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$InternalSettingsEntryProviderKt.lambda$1482765239;
        c5rn.A00(new G0U<ColorsScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.InternalSettingsAuxEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(ColorsScreenKey colorsScreenKey) {
                return colorsScreenKey.toString();
            }
        }, new G0U<ColorsScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.InternalSettingsAuxEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ColorsScreenKey colorsScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ColorsScreenKey colorsScreenKey) {
                return mapA0o;
            }
        }, g0w2, C3cG.A0x(ColorsScreenKey.class));
    }
}
