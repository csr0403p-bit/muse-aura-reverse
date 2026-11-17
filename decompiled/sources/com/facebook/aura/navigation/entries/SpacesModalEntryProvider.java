package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C60R;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.BottomSheetSceneStrategy;
import com.facebook.aura.navigation.key.PeerSpaceCollaboratorsSheetKey;
import com.facebook.aura.navigation.key.PeerSpaceMenuSheetKey;
import com.facebook.aura.navigation.key.PeerSpaceScreenKey;
import com.facebook.aura.navigation.key.SpaceTabScreenKey;
import com.facebook.aura.navigation.key.SpacesModalScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SpacesModalEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final SpacesModalEntryProvider INSTANCE = new SpacesModalEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> map = AuraTransitionsKt.tabTransitionMetadata;
        c5rn.A00(AnonymousClass1.INSTANCE, new G0U<SpaceTabScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.SpacesModalEntryProvider$provideEntry$$inlined$entry$1
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(SpaceTabScreenKey spaceTabScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(SpaceTabScreenKey spaceTabScreenKey) {
                return map;
            }
        }, ComposableSingletons$SpacesModalEntryProviderKt.lambda$255383627, C3cG.A0x(SpaceTabScreenKey.class));
        final Map<String, Object> map2 = AuraTransitionsKt.pushTransitionMetadata;
        c5rn.A00(AnonymousClass2.INSTANCE, new G0U<PeerSpaceScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.SpacesModalEntryProvider$provideEntry$$inlined$entry$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(PeerSpaceScreenKey peerSpaceScreenKey) {
                return map2;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(PeerSpaceScreenKey peerSpaceScreenKey) {
                return map2;
            }
        }, ComposableSingletons$SpacesModalEntryProviderKt.f186lambda$1105531213, C3cG.A0x(PeerSpaceScreenKey.class));
        BottomSheetSceneStrategy.Companion companion = BottomSheetSceneStrategy.Companion;
        final Map<String, Object> mapBottomSheet = companion.bottomSheet(true, true, false);
        G0W<PeerSpaceMenuSheetKey, BFM, Integer, Unit> g0w = ComposableSingletons$SpacesModalEntryProviderKt.f187lambda$1320076236;
        c5rn.A00(new G0U<PeerSpaceMenuSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.SpacesModalEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(PeerSpaceMenuSheetKey peerSpaceMenuSheetKey) {
                return peerSpaceMenuSheetKey.toString();
            }
        }, new G0U<PeerSpaceMenuSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.SpacesModalEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(PeerSpaceMenuSheetKey peerSpaceMenuSheetKey) {
                return mapBottomSheet;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(PeerSpaceMenuSheetKey peerSpaceMenuSheetKey) {
                return mapBottomSheet;
            }
        }, g0w, C3cG.A0x(PeerSpaceMenuSheetKey.class));
        final Map<String, Object> mapBottomSheet2 = companion.bottomSheet(true, true, false);
        G0W<PeerSpaceCollaboratorsSheetKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$SpacesModalEntryProviderKt.lambda$631782199;
        c5rn.A00(new G0U<PeerSpaceCollaboratorsSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.SpacesModalEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(PeerSpaceCollaboratorsSheetKey peerSpaceCollaboratorsSheetKey) {
                return peerSpaceCollaboratorsSheetKey.toString();
            }
        }, new G0U<PeerSpaceCollaboratorsSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.SpacesModalEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(PeerSpaceCollaboratorsSheetKey peerSpaceCollaboratorsSheetKey) {
                return mapBottomSheet2;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(PeerSpaceCollaboratorsSheetKey peerSpaceCollaboratorsSheetKey) {
                return mapBottomSheet2;
            }
        }, g0w2, C3cG.A0x(PeerSpaceCollaboratorsSheetKey.class));
        c5rn.A00(AnonymousClass3.INSTANCE, new G0U<SpacesModalScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.SpacesModalEntryProvider$provideEntry$$inlined$entry$3
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(SpacesModalScreenKey spacesModalScreenKey) {
                return map2;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(SpacesModalScreenKey spacesModalScreenKey) {
                return map2;
            }
        }, ComposableSingletons$SpacesModalEntryProviderKt.f188lambda$1329473460, C3cG.A0x(SpacesModalScreenKey.class));
    }

    /* renamed from: com.facebook.aura.navigation.entries.SpacesModalEntryProvider$provideEntry$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<SpaceTabScreenKey, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(SpaceTabScreenKey spaceTabScreenKey) {
            return C60R.A0f(spaceTabScreenKey);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(SpaceTabScreenKey spaceTabScreenKey) {
            return C60R.A0f(spaceTabScreenKey);
        }
    }

    /* renamed from: com.facebook.aura.navigation.entries.SpacesModalEntryProvider$provideEntry$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<PeerSpaceScreenKey, Object> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(PeerSpaceScreenKey peerSpaceScreenKey) {
            return C60R.A0f(peerSpaceScreenKey);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(PeerSpaceScreenKey peerSpaceScreenKey) {
            return C60R.A0f(peerSpaceScreenKey);
        }
    }

    /* renamed from: com.facebook.aura.navigation.entries.SpacesModalEntryProvider$provideEntry$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<SpacesModalScreenKey, Object> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(SpacesModalScreenKey spacesModalScreenKey) {
            return C60R.A0f(spacesModalScreenKey);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(SpacesModalScreenKey spacesModalScreenKey) {
            return C60R.A0f(spacesModalScreenKey);
        }
    }
}
