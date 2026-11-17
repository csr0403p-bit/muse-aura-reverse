package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.BottomSheetSceneStrategy;
import com.facebook.aura.navigation.key.ConnectionsAddPermissionSheetKey;
import com.facebook.aura.navigation.key.ConnectionsAddSheetKey;
import com.facebook.aura.navigation.key.ConnectionsModalScreenKey;
import com.facebook.aura.navigation.key.ConnectionsReceivedItemSheetKey;
import com.facebook.aura.navigation.key.ConnectionsRuleEditorSheetKey;
import com.facebook.aura.navigation.key.ConnectionsScreenKey;
import com.facebook.aura.navigation.key.ConnectionsShareSheetKey;
import com.facebook.aura.navigation.key.ConnectionsShareStatusSheetKey;
import com.facebook.aura.navigation.key.ConnectionsSheetKey;
import com.facebook.aura.navigation.key.PairsAcceptLinkSheetKey;
import com.facebook.aura.navigation.key.PairsAcceptPreferencesSheetKey;
import com.facebook.aura.navigation.key.PairsHistoryScreenKey;
import com.facebook.aura.navigation.key.PairsStatusSheetKey;
import com.facebook.aura.navigation.key.PeerGoalScreenKey;
import com.facebook.aura.navigation.key.SpaceCollaboratorPickerSheetKey;
import com.facebook.aura.navigation.key.SpaceInviteScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class PairsEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final PairsEntryProvider INSTANCE = new PairsEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        BottomSheetSceneStrategy.Companion companion = BottomSheetSceneStrategy.Companion;
        final Map<String, Object> mapBottomSheet = companion.bottomSheet(true, true, true);
        G0W<PairsAcceptLinkSheetKey, BFM, Integer, Unit> g0w = ComposableSingletons$PairsEntryProviderKt.lambda$897644212;
        c5rn.A00(new G0U<PairsAcceptLinkSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(PairsAcceptLinkSheetKey pairsAcceptLinkSheetKey) {
                return pairsAcceptLinkSheetKey.toString();
            }
        }, new G0U<PairsAcceptLinkSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(PairsAcceptLinkSheetKey pairsAcceptLinkSheetKey) {
                return mapBottomSheet;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(PairsAcceptLinkSheetKey pairsAcceptLinkSheetKey) {
                return mapBottomSheet;
            }
        }, g0w, C3cG.A0x(PairsAcceptLinkSheetKey.class));
        final Map<String, Object> mapBottomSheet2 = companion.bottomSheet(true, true, false);
        G0W<PairsAcceptPreferencesSheetKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$PairsEntryProviderKt.f166lambda$1655617813;
        c5rn.A00(new G0U<PairsAcceptPreferencesSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(PairsAcceptPreferencesSheetKey pairsAcceptPreferencesSheetKey) {
                return pairsAcceptPreferencesSheetKey.toString();
            }
        }, new G0U<PairsAcceptPreferencesSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(PairsAcceptPreferencesSheetKey pairsAcceptPreferencesSheetKey) {
                return mapBottomSheet2;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(PairsAcceptPreferencesSheetKey pairsAcceptPreferencesSheetKey) {
                return mapBottomSheet2;
            }
        }, g0w2, C3cG.A0x(PairsAcceptPreferencesSheetKey.class));
        final Map<String, Object> mapBottomSheet3 = companion.bottomSheet(true, true, false);
        G0W<PairsStatusSheetKey, BFM, Integer, Unit> g0w3 = ComposableSingletons$PairsEntryProviderKt.lambda$1524526828;
        c5rn.A00(new G0U<PairsStatusSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$5
            @Override // X.G0U
            public final Object invoke(PairsStatusSheetKey pairsStatusSheetKey) {
                return pairsStatusSheetKey.toString();
            }
        }, new G0U<PairsStatusSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$6
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(PairsStatusSheetKey pairsStatusSheetKey) {
                return mapBottomSheet3;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(PairsStatusSheetKey pairsStatusSheetKey) {
                return mapBottomSheet3;
            }
        }, g0w3, C3cG.A0x(PairsStatusSheetKey.class));
        final Map<String, Object> map = AuraTransitionsKt.pushTransitionMetadata;
        G0W<PairsHistoryScreenKey, BFM, Integer, Unit> g0w4 = ComposableSingletons$PairsEntryProviderKt.lambda$749601822;
        c5rn.A00(new G0U<PairsHistoryScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$7
            @Override // X.G0U
            public final Object invoke(PairsHistoryScreenKey pairsHistoryScreenKey) {
                return pairsHistoryScreenKey.toString();
            }
        }, new G0U<PairsHistoryScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$8
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(PairsHistoryScreenKey pairsHistoryScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(PairsHistoryScreenKey pairsHistoryScreenKey) {
                return map;
            }
        }, g0w4, C3cG.A0x(PairsHistoryScreenKey.class));
        final Map<String, Object> map2 = AuraTransitionsKt.tabTransitionMetadata;
        G0W<ConnectionsScreenKey, BFM, Integer, Unit> g0w5 = ComposableSingletons$PairsEntryProviderKt.f170lambda$2106203903;
        c5rn.A00(new G0U<ConnectionsScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$9
            @Override // X.G0U
            public final Object invoke(ConnectionsScreenKey connectionsScreenKey) {
                return connectionsScreenKey.toString();
            }
        }, new G0U<ConnectionsScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$10
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConnectionsScreenKey connectionsScreenKey) {
                return map2;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConnectionsScreenKey connectionsScreenKey) {
                return map2;
            }
        }, g0w5, C3cG.A0x(ConnectionsScreenKey.class));
        G0W<ConnectionsModalScreenKey, BFM, Integer, Unit> g0w6 = ComposableSingletons$PairsEntryProviderKt.lambda$306242617;
        c5rn.A00(new G0U<ConnectionsModalScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$11
            @Override // X.G0U
            public final Object invoke(ConnectionsModalScreenKey connectionsModalScreenKey) {
                return connectionsModalScreenKey.toString();
            }
        }, new G0U<ConnectionsModalScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$12
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConnectionsModalScreenKey connectionsModalScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConnectionsModalScreenKey connectionsModalScreenKey) {
                return map;
            }
        }, g0w6, C3cG.A0x(ConnectionsModalScreenKey.class));
        final Map<String, Object> mapBottomSheet4 = companion.bottomSheet(true, true, false);
        G0W<ConnectionsAddSheetKey, BFM, Integer, Unit> g0w7 = ComposableSingletons$PairsEntryProviderKt.f171lambda$818648943;
        c5rn.A00(new G0U<ConnectionsAddSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$13
            @Override // X.G0U
            public final Object invoke(ConnectionsAddSheetKey connectionsAddSheetKey) {
                return connectionsAddSheetKey.toString();
            }
        }, new G0U<ConnectionsAddSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$14
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConnectionsAddSheetKey connectionsAddSheetKey) {
                return mapBottomSheet4;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConnectionsAddSheetKey connectionsAddSheetKey) {
                return mapBottomSheet4;
            }
        }, g0w7, C3cG.A0x(ConnectionsAddSheetKey.class));
        final Map<String, Object> mapBottomSheet5 = companion.bottomSheet(true, true, false);
        G0W<SpaceInviteScreenKey, BFM, Integer, Unit> g0w8 = ComposableSingletons$PairsEntryProviderKt.f165lambda$1563858952;
        c5rn.A00(new G0U<SpaceInviteScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$15
            @Override // X.G0U
            public final Object invoke(SpaceInviteScreenKey spaceInviteScreenKey) {
                return spaceInviteScreenKey.toString();
            }
        }, new G0U<SpaceInviteScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$16
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(SpaceInviteScreenKey spaceInviteScreenKey) {
                return mapBottomSheet5;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(SpaceInviteScreenKey spaceInviteScreenKey) {
                return mapBottomSheet5;
            }
        }, g0w8, C3cG.A0x(SpaceInviteScreenKey.class));
        final Map<String, Object> mapBottomSheet6 = companion.bottomSheet(true, true, false);
        G0W<SpaceCollaboratorPickerSheetKey, BFM, Integer, Unit> g0w9 = ComposableSingletons$PairsEntryProviderKt.f167lambda$1734728937;
        c5rn.A00(new G0U<SpaceCollaboratorPickerSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$17
            @Override // X.G0U
            public final Object invoke(SpaceCollaboratorPickerSheetKey spaceCollaboratorPickerSheetKey) {
                return spaceCollaboratorPickerSheetKey.toString();
            }
        }, new G0U<SpaceCollaboratorPickerSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$18
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(SpaceCollaboratorPickerSheetKey spaceCollaboratorPickerSheetKey) {
                return mapBottomSheet6;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(SpaceCollaboratorPickerSheetKey spaceCollaboratorPickerSheetKey) {
                return mapBottomSheet6;
            }
        }, g0w9, C3cG.A0x(SpaceCollaboratorPickerSheetKey.class));
        final Map<String, Object> mapBottomSheet7 = companion.bottomSheet(true, true, false);
        G0W<ConnectionsSheetKey, BFM, Integer, Unit> g0w10 = ComposableSingletons$PairsEntryProviderKt.lambda$1556410011;
        c5rn.A00(new G0U<ConnectionsSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$19
            @Override // X.G0U
            public final Object invoke(ConnectionsSheetKey connectionsSheetKey) {
                return connectionsSheetKey.toString();
            }
        }, new G0U<ConnectionsSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$20
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConnectionsSheetKey connectionsSheetKey) {
                return mapBottomSheet7;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConnectionsSheetKey connectionsSheetKey) {
                return mapBottomSheet7;
            }
        }, g0w10, C3cG.A0x(ConnectionsSheetKey.class));
        final Map<String, Object> mapBottomSheet8 = companion.bottomSheet(true, true, false);
        G0W<ConnectionsAddPermissionSheetKey, BFM, Integer, Unit> g0w11 = ComposableSingletons$PairsEntryProviderKt.f169lambda$1862129917;
        c5rn.A00(new G0U<ConnectionsAddPermissionSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$21
            @Override // X.G0U
            public final Object invoke(ConnectionsAddPermissionSheetKey connectionsAddPermissionSheetKey) {
                return connectionsAddPermissionSheetKey.toString();
            }
        }, new G0U<ConnectionsAddPermissionSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$22
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConnectionsAddPermissionSheetKey connectionsAddPermissionSheetKey) {
                return mapBottomSheet8;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConnectionsAddPermissionSheetKey connectionsAddPermissionSheetKey) {
                return mapBottomSheet8;
            }
        }, g0w11, C3cG.A0x(ConnectionsAddPermissionSheetKey.class));
        final Map<String, Object> mapBottomSheet9 = companion.bottomSheet(true, true, false);
        G0W<ConnectionsRuleEditorSheetKey, BFM, Integer, Unit> g0w12 = ComposableSingletons$PairsEntryProviderKt.f164lambda$1380061681;
        c5rn.A00(new G0U<ConnectionsRuleEditorSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$23
            @Override // X.G0U
            public final Object invoke(ConnectionsRuleEditorSheetKey connectionsRuleEditorSheetKey) {
                return connectionsRuleEditorSheetKey.toString();
            }
        }, new G0U<ConnectionsRuleEditorSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$24
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConnectionsRuleEditorSheetKey connectionsRuleEditorSheetKey) {
                return mapBottomSheet9;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConnectionsRuleEditorSheetKey connectionsRuleEditorSheetKey) {
                return mapBottomSheet9;
            }
        }, g0w12, C3cG.A0x(ConnectionsRuleEditorSheetKey.class));
        final Map<String, Object> mapBottomSheet10 = companion.bottomSheet(true, true, false);
        G0W<ConnectionsReceivedItemSheetKey, BFM, Integer, Unit> g0w13 = ComposableSingletons$PairsEntryProviderKt.lambda$261713529;
        c5rn.A00(new G0U<ConnectionsReceivedItemSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$25
            @Override // X.G0U
            public final Object invoke(ConnectionsReceivedItemSheetKey connectionsReceivedItemSheetKey) {
                return connectionsReceivedItemSheetKey.toString();
            }
        }, new G0U<ConnectionsReceivedItemSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$26
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConnectionsReceivedItemSheetKey connectionsReceivedItemSheetKey) {
                return mapBottomSheet10;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConnectionsReceivedItemSheetKey connectionsReceivedItemSheetKey) {
                return mapBottomSheet10;
            }
        }, g0w13, C3cG.A0x(ConnectionsReceivedItemSheetKey.class));
        final Map<String, Object> mapBottomSheet11 = companion.bottomSheet(true, true, true);
        G0W<ConnectionsShareStatusSheetKey, BFM, Integer, Unit> g0w14 = ComposableSingletons$PairsEntryProviderKt.f168lambda$1855496831;
        c5rn.A00(new G0U<ConnectionsShareStatusSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$27
            @Override // X.G0U
            public final Object invoke(ConnectionsShareStatusSheetKey connectionsShareStatusSheetKey) {
                return connectionsShareStatusSheetKey.toString();
            }
        }, new G0U<ConnectionsShareStatusSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$28
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConnectionsShareStatusSheetKey connectionsShareStatusSheetKey) {
                return mapBottomSheet11;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConnectionsShareStatusSheetKey connectionsShareStatusSheetKey) {
                return mapBottomSheet11;
            }
        }, g0w14, C3cG.A0x(ConnectionsShareStatusSheetKey.class));
        G0W<PeerGoalScreenKey, BFM, Integer, Unit> g0w15 = ComposableSingletons$PairsEntryProviderKt.lambda$2017492236;
        c5rn.A00(new G0U<PeerGoalScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$29
            @Override // X.G0U
            public final Object invoke(PeerGoalScreenKey peerGoalScreenKey) {
                return peerGoalScreenKey.toString();
            }
        }, new G0U<PeerGoalScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$30
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(PeerGoalScreenKey peerGoalScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(PeerGoalScreenKey peerGoalScreenKey) {
                return map;
            }
        }, g0w15, C3cG.A0x(PeerGoalScreenKey.class));
        final Map<String, Object> mapBottomSheet12 = companion.bottomSheet(true, true, true);
        G0W<ConnectionsShareSheetKey, BFM, Integer, Unit> g0w16 = ComposableSingletons$PairsEntryProviderKt.lambda$2039413997;
        c5rn.A00(new G0U<ConnectionsShareSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$31
            @Override // X.G0U
            public final Object invoke(ConnectionsShareSheetKey connectionsShareSheetKey) {
                return connectionsShareSheetKey.toString();
            }
        }, new G0U<ConnectionsShareSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.PairsEntryProvider$provideEntry$$inlined$entry$default$32
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConnectionsShareSheetKey connectionsShareSheetKey) {
                return mapBottomSheet12;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConnectionsShareSheetKey connectionsShareSheetKey) {
                return mapBottomSheet12;
            }
        }, g0w16, C3cG.A0x(ConnectionsShareSheetKey.class));
    }
}
