package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.LibraryModalScreenKey;
import com.facebook.aura.navigation.key.LibraryScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class LibraryEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final LibraryEntryProvider INSTANCE = new LibraryEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> map = AuraTransitionsKt.tabTransitionMetadata;
        G0W<LibraryScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$LibraryEntryProviderKt.lambda$233145761;
        c5rn.A00(new G0U<LibraryScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.LibraryEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(LibraryScreenKey libraryScreenKey) {
                return libraryScreenKey.toString();
            }
        }, new G0U<LibraryScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.LibraryEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(LibraryScreenKey libraryScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(LibraryScreenKey libraryScreenKey) {
                return map;
            }
        }, g0w, C3cG.A0x(LibraryScreenKey.class));
        final Map<String, Object> map2 = AuraTransitionsKt.pushTransitionMetadata;
        G0W<LibraryModalScreenKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$LibraryEntryProviderKt.f143lambda$1572577065;
        c5rn.A00(new G0U<LibraryModalScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.LibraryEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(LibraryModalScreenKey libraryModalScreenKey) {
                return libraryModalScreenKey.toString();
            }
        }, new G0U<LibraryModalScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.LibraryEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(LibraryModalScreenKey libraryModalScreenKey) {
                return map2;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(LibraryModalScreenKey libraryModalScreenKey) {
                return map2;
            }
        }, g0w2, C3cG.A0x(LibraryModalScreenKey.class));
    }
}
