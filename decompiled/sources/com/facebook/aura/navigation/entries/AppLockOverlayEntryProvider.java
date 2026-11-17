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
import com.facebook.aura.navigation.key.AppLockOverlayScreenKey;
import com.facebook.aura.overlay.api.OverlayPriority;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class AppLockOverlayEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final AppLockOverlayEntryProvider INSTANCE = new AppLockOverlayEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> mapOverlay = OverlaySceneStrategy.Companion.overlay(OverlayPriority.APP_LOCK.ordinal());
        G0W<AppLockOverlayScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$AppLockOverlayEntryProviderKt.f100lambda$808248526;
        c5rn.A00(new G0U<AppLockOverlayScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.AppLockOverlayEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(AppLockOverlayScreenKey appLockOverlayScreenKey) {
                return appLockOverlayScreenKey.toString();
            }
        }, new G0U<AppLockOverlayScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.AppLockOverlayEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(AppLockOverlayScreenKey appLockOverlayScreenKey) {
                return mapOverlay;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(AppLockOverlayScreenKey appLockOverlayScreenKey) {
                return mapOverlay;
            }
        }, g0w, C3cG.A0x(AppLockOverlayScreenKey.class));
    }
}
