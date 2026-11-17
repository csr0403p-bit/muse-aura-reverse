package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.ArtifactsDetailScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ArtifactsDetailEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final ArtifactsDetailEntryProvider INSTANCE = new ArtifactsDetailEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA0o = C3cG.A0o(c5rn);
        G0W<ArtifactsDetailScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$ArtifactsDetailEntryProviderKt.lambda$69977432;
        c5rn.A00(new G0U<ArtifactsDetailScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ArtifactsDetailEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(ArtifactsDetailScreenKey artifactsDetailScreenKey) {
                return artifactsDetailScreenKey.toString();
            }
        }, new G0U<ArtifactsDetailScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ArtifactsDetailEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ArtifactsDetailScreenKey artifactsDetailScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ArtifactsDetailScreenKey artifactsDetailScreenKey) {
                return mapA0o;
            }
        }, g0w, C3cG.A0x(ArtifactsDetailScreenKey.class));
    }
}
