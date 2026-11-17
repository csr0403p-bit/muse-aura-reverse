package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.OverlaySceneStrategy;
import com.facebook.aura.navigation.key.StorageRecoveryOverlayScreenKey;
import com.facebook.aura.overlay.api.OverlayPriority;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class StorageRecoveryEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final StorageRecoveryEntryProvider INSTANCE = new StorageRecoveryEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> mapOverlay = OverlaySceneStrategy.Companion.overlay(OverlayPriority.STORAGE_RECOVERY.ordinal());
        G0W<StorageRecoveryOverlayScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$StorageRecoveryEntryProviderKt.f189lambda$2069438308;
        c5rn.A00(new G0U<StorageRecoveryOverlayScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.StorageRecoveryEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(StorageRecoveryOverlayScreenKey storageRecoveryOverlayScreenKey) {
                return storageRecoveryOverlayScreenKey.toString();
            }
        }, new G0U<StorageRecoveryOverlayScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.StorageRecoveryEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(StorageRecoveryOverlayScreenKey storageRecoveryOverlayScreenKey) {
                return mapOverlay;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(StorageRecoveryOverlayScreenKey storageRecoveryOverlayScreenKey) {
                return mapOverlay;
            }
        }, g0w, C3cG.A0x(StorageRecoveryOverlayScreenKey.class));
    }
}
