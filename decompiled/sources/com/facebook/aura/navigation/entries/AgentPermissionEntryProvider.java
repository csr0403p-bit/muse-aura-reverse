package com.facebook.aura.navigation.entries;

import X.AGH;
import X.AnonymousClass006;
import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.BottomSheetSceneStrategy;
import com.facebook.aura.navigation.ModalFlowSceneStrategy;
import com.facebook.aura.navigation.SharedViewModelStoreNavEntryDecorator;
import com.facebook.aura.navigation.key.AgentPermissionDecisionSheetKey;
import com.facebook.aura.navigation.key.AgentPermissionHistoryDetailsSheetKey;
import com.facebook.aura.navigation.key.AgentPermissionMessageEditorScreenKey;
import com.facebook.aura.navigation.key.AgentPermissionTaskDetailsSheetKey;
import com.facebook.aura.navigation.key.CheckoutInfoSheetKey;
import com.facebook.aura.navigation.key.CheckoutLodgingPolicySheetKey;
import com.facebook.aura.navigation.key.CheckoutPayWithLinkSheetKey;
import com.facebook.aura.navigation.key.CheckoutWalletCardSelectionSheetKey;
import com.facebook.aura.navigation.key.CheckoutWalletSheetKey;
import com.facebook.aura.navigation.key.DeliveryCheckoutStopSheetKey;
import com.facebook.aura.navigation.key.FlightCheckoutLegSheetKey;
import com.facebook.aura.navigation.key.FlightCheckoutPassengerSheetKey;
import com.facebook.aura.navigation.key.FlightCheckoutPassengersSheetKey;
import com.facebook.aura.navigation.key.FlightCheckoutSummarySheetKey;
import com.facebook.aura.navigation.key.ReservationCheckoutDetailsSheetKey;
import com.facebook.aura.navigation.key.ShopifyCheckoutCartSheetKey;
import com.facebook.aura.navigation.key.ShopifyCheckoutSummarySheetKey;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class AgentPermissionEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final AgentPermissionEntryProvider INSTANCE = new AgentPermissionEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final LinkedHashMap linkedHashMapA02 = AGH.A02(AuraTransitionsKt.pushTransitionMetadata, ModalFlowSceneStrategy.Companion.immersive());
        G0W<AgentPermissionMessageEditorScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$AgentPermissionEntryProviderKt.lambda$1009565916;
        c5rn.A00(new G0U<AgentPermissionMessageEditorScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(AgentPermissionMessageEditorScreenKey agentPermissionMessageEditorScreenKey) {
                return agentPermissionMessageEditorScreenKey.toString();
            }
        }, new G0U<AgentPermissionMessageEditorScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(AgentPermissionMessageEditorScreenKey agentPermissionMessageEditorScreenKey) {
                return linkedHashMapA02;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(AgentPermissionMessageEditorScreenKey agentPermissionMessageEditorScreenKey) {
                return linkedHashMapA02;
            }
        }, g0w, C3cG.A0x(AgentPermissionMessageEditorScreenKey.class));
        BottomSheetSceneStrategy.Companion companion = BottomSheetSceneStrategy.Companion;
        final LinkedHashMap linkedHashMapA022 = AGH.A02(companion.bottomSheet(true, true, false), AnonymousClass006.A10(SharedViewModelStoreNavEntryDecorator.PARENT_CONTENT_KEY, HatchStatusEntryProviderKt.HATCH_STATUS_CONTENT_KEY));
        G0W<AgentPermissionHistoryDetailsSheetKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$AgentPermissionEntryProviderKt.f94lambda$450417194;
        c5rn.A00(new G0U<AgentPermissionHistoryDetailsSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(AgentPermissionHistoryDetailsSheetKey agentPermissionHistoryDetailsSheetKey) {
                return agentPermissionHistoryDetailsSheetKey.toString();
            }
        }, new G0U<AgentPermissionHistoryDetailsSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(AgentPermissionHistoryDetailsSheetKey agentPermissionHistoryDetailsSheetKey) {
                return linkedHashMapA022;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(AgentPermissionHistoryDetailsSheetKey agentPermissionHistoryDetailsSheetKey) {
                return linkedHashMapA022;
            }
        }, g0w2, C3cG.A0x(AgentPermissionHistoryDetailsSheetKey.class));
        final Map<String, Object> mapBottomSheet = companion.bottomSheet(true, true, true);
        G0W<AgentPermissionTaskDetailsSheetKey, BFM, Integer, Unit> g0w3 = ComposableSingletons$AgentPermissionEntryProviderKt.lambda$1244999800;
        c5rn.A00(new G0U<AgentPermissionTaskDetailsSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$5
            @Override // X.G0U
            public final Object invoke(AgentPermissionTaskDetailsSheetKey agentPermissionTaskDetailsSheetKey) {
                return agentPermissionTaskDetailsSheetKey.toString();
            }
        }, new G0U<AgentPermissionTaskDetailsSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$6
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(AgentPermissionTaskDetailsSheetKey agentPermissionTaskDetailsSheetKey) {
                return mapBottomSheet;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(AgentPermissionTaskDetailsSheetKey agentPermissionTaskDetailsSheetKey) {
                return mapBottomSheet;
            }
        }, g0w3, C3cG.A0x(AgentPermissionTaskDetailsSheetKey.class));
        final Map<String, Object> mapBottomSheet2 = companion.bottomSheet(true, true, false);
        G0W<AgentPermissionDecisionSheetKey, BFM, Integer, Unit> g0w4 = ComposableSingletons$AgentPermissionEntryProviderKt.f95lambda$778296250;
        c5rn.A00(new G0U<AgentPermissionDecisionSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$7
            @Override // X.G0U
            public final Object invoke(AgentPermissionDecisionSheetKey agentPermissionDecisionSheetKey) {
                return agentPermissionDecisionSheetKey.toString();
            }
        }, new G0U<AgentPermissionDecisionSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$8
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(AgentPermissionDecisionSheetKey agentPermissionDecisionSheetKey) {
                return mapBottomSheet2;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(AgentPermissionDecisionSheetKey agentPermissionDecisionSheetKey) {
                return mapBottomSheet2;
            }
        }, g0w4, C3cG.A0x(AgentPermissionDecisionSheetKey.class));
        final Map<String, Object> mapBottomSheet3 = companion.bottomSheet(true, true, true);
        G0W<CheckoutInfoSheetKey, BFM, Integer, Unit> g0w5 = ComposableSingletons$AgentPermissionEntryProviderKt.lambda$1717035947;
        c5rn.A00(new G0U<CheckoutInfoSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$9
            @Override // X.G0U
            public final Object invoke(CheckoutInfoSheetKey checkoutInfoSheetKey) {
                return checkoutInfoSheetKey.toString();
            }
        }, new G0U<CheckoutInfoSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$10
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(CheckoutInfoSheetKey checkoutInfoSheetKey) {
                return mapBottomSheet3;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(CheckoutInfoSheetKey checkoutInfoSheetKey) {
                return mapBottomSheet3;
            }
        }, g0w5, C3cG.A0x(CheckoutInfoSheetKey.class));
        final Map<String, Object> mapBottomSheet4 = companion.bottomSheet(true, true, false);
        G0W<CheckoutPayWithLinkSheetKey, BFM, Integer, Unit> g0w6 = ComposableSingletons$AgentPermissionEntryProviderKt.lambda$1950326386;
        c5rn.A00(new G0U<CheckoutPayWithLinkSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$11
            @Override // X.G0U
            public final Object invoke(CheckoutPayWithLinkSheetKey checkoutPayWithLinkSheetKey) {
                return checkoutPayWithLinkSheetKey.toString();
            }
        }, new G0U<CheckoutPayWithLinkSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$12
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(CheckoutPayWithLinkSheetKey checkoutPayWithLinkSheetKey) {
                return mapBottomSheet4;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(CheckoutPayWithLinkSheetKey checkoutPayWithLinkSheetKey) {
                return mapBottomSheet4;
            }
        }, g0w6, C3cG.A0x(CheckoutPayWithLinkSheetKey.class));
        final Map<String, Object> mapBottomSheet5 = companion.bottomSheet(true, true, false);
        G0W<CheckoutWalletSheetKey, BFM, Integer, Unit> g0w7 = ComposableSingletons$AgentPermissionEntryProviderKt.lambda$555078782;
        c5rn.A00(new G0U<CheckoutWalletSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$13
            @Override // X.G0U
            public final Object invoke(CheckoutWalletSheetKey checkoutWalletSheetKey) {
                return checkoutWalletSheetKey.toString();
            }
        }, new G0U<CheckoutWalletSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$14
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(CheckoutWalletSheetKey checkoutWalletSheetKey) {
                return mapBottomSheet5;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(CheckoutWalletSheetKey checkoutWalletSheetKey) {
                return mapBottomSheet5;
            }
        }, g0w7, C3cG.A0x(CheckoutWalletSheetKey.class));
        final Map<String, Object> mapBottomSheet6 = companion.bottomSheet(true, true, false);
        G0W<CheckoutWalletCardSelectionSheetKey, BFM, Integer, Unit> g0w8 = ComposableSingletons$AgentPermissionEntryProviderKt.f96lambda$829310699;
        c5rn.A00(new G0U<CheckoutWalletCardSelectionSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$15
            @Override // X.G0U
            public final Object invoke(CheckoutWalletCardSelectionSheetKey checkoutWalletCardSelectionSheetKey) {
                return checkoutWalletCardSelectionSheetKey.toString();
            }
        }, new G0U<CheckoutWalletCardSelectionSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$16
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(CheckoutWalletCardSelectionSheetKey checkoutWalletCardSelectionSheetKey) {
                return mapBottomSheet6;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(CheckoutWalletCardSelectionSheetKey checkoutWalletCardSelectionSheetKey) {
                return mapBottomSheet6;
            }
        }, g0w8, C3cG.A0x(CheckoutWalletCardSelectionSheetKey.class));
        final Map<String, Object> mapBottomSheet7 = companion.bottomSheet(true, true, false);
        G0W<ReservationCheckoutDetailsSheetKey, BFM, Integer, Unit> g0w9 = ComposableSingletons$AgentPermissionEntryProviderKt.lambda$1324493131;
        c5rn.A00(new G0U<ReservationCheckoutDetailsSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$17
            @Override // X.G0U
            public final Object invoke(ReservationCheckoutDetailsSheetKey reservationCheckoutDetailsSheetKey) {
                return reservationCheckoutDetailsSheetKey.toString();
            }
        }, new G0U<ReservationCheckoutDetailsSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$18
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ReservationCheckoutDetailsSheetKey reservationCheckoutDetailsSheetKey) {
                return mapBottomSheet7;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ReservationCheckoutDetailsSheetKey reservationCheckoutDetailsSheetKey) {
                return mapBottomSheet7;
            }
        }, g0w9, C3cG.A0x(ReservationCheckoutDetailsSheetKey.class));
        final Map<String, Object> mapBottomSheet8 = companion.bottomSheet(true, true, false);
        G0W<ShopifyCheckoutCartSheetKey, BFM, Integer, Unit> g0w10 = ComposableSingletons$AgentPermissionEntryProviderKt.lambda$1323679300;
        c5rn.A00(new G0U<ShopifyCheckoutCartSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$19
            @Override // X.G0U
            public final Object invoke(ShopifyCheckoutCartSheetKey shopifyCheckoutCartSheetKey) {
                return shopifyCheckoutCartSheetKey.toString();
            }
        }, new G0U<ShopifyCheckoutCartSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$20
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ShopifyCheckoutCartSheetKey shopifyCheckoutCartSheetKey) {
                return mapBottomSheet8;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ShopifyCheckoutCartSheetKey shopifyCheckoutCartSheetKey) {
                return mapBottomSheet8;
            }
        }, g0w10, C3cG.A0x(ShopifyCheckoutCartSheetKey.class));
        final Map<String, Object> mapBottomSheet9 = companion.bottomSheet(true, true, false);
        G0W<ShopifyCheckoutSummarySheetKey, BFM, Integer, Unit> g0w11 = ComposableSingletons$AgentPermissionEntryProviderKt.f92lambda$1760263614;
        c5rn.A00(new G0U<ShopifyCheckoutSummarySheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$21
            @Override // X.G0U
            public final Object invoke(ShopifyCheckoutSummarySheetKey shopifyCheckoutSummarySheetKey) {
                return shopifyCheckoutSummarySheetKey.toString();
            }
        }, new G0U<ShopifyCheckoutSummarySheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$22
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ShopifyCheckoutSummarySheetKey shopifyCheckoutSummarySheetKey) {
                return mapBottomSheet9;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ShopifyCheckoutSummarySheetKey shopifyCheckoutSummarySheetKey) {
                return mapBottomSheet9;
            }
        }, g0w11, C3cG.A0x(ShopifyCheckoutSummarySheetKey.class));
        final Map<String, Object> mapBottomSheet10 = companion.bottomSheet(true, true, false);
        G0W<CheckoutLodgingPolicySheetKey, BFM, Integer, Unit> g0w12 = ComposableSingletons$AgentPermissionEntryProviderKt.f93lambda$1820477319;
        c5rn.A00(new G0U<CheckoutLodgingPolicySheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$23
            @Override // X.G0U
            public final Object invoke(CheckoutLodgingPolicySheetKey checkoutLodgingPolicySheetKey) {
                return checkoutLodgingPolicySheetKey.toString();
            }
        }, new G0U<CheckoutLodgingPolicySheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$24
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(CheckoutLodgingPolicySheetKey checkoutLodgingPolicySheetKey) {
                return mapBottomSheet10;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(CheckoutLodgingPolicySheetKey checkoutLodgingPolicySheetKey) {
                return mapBottomSheet10;
            }
        }, g0w12, C3cG.A0x(CheckoutLodgingPolicySheetKey.class));
        final Map<String, Object> mapBottomSheet11 = companion.bottomSheet(true, true, false);
        G0W<FlightCheckoutSummarySheetKey, BFM, Integer, Unit> g0w13 = ComposableSingletons$AgentPermissionEntryProviderKt.lambda$424295232;
        c5rn.A00(new G0U<FlightCheckoutSummarySheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$25
            @Override // X.G0U
            public final Object invoke(FlightCheckoutSummarySheetKey flightCheckoutSummarySheetKey) {
                return flightCheckoutSummarySheetKey.toString();
            }
        }, new G0U<FlightCheckoutSummarySheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$26
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(FlightCheckoutSummarySheetKey flightCheckoutSummarySheetKey) {
                return mapBottomSheet11;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(FlightCheckoutSummarySheetKey flightCheckoutSummarySheetKey) {
                return mapBottomSheet11;
            }
        }, g0w13, C3cG.A0x(FlightCheckoutSummarySheetKey.class));
        final Map<String, Object> mapBottomSheet12 = companion.bottomSheet(true, true, false);
        G0W<FlightCheckoutLegSheetKey, BFM, Integer, Unit> g0w14 = ComposableSingletons$AgentPermissionEntryProviderKt.f91lambda$1369321337;
        c5rn.A00(new G0U<FlightCheckoutLegSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$27
            @Override // X.G0U
            public final Object invoke(FlightCheckoutLegSheetKey flightCheckoutLegSheetKey) {
                return flightCheckoutLegSheetKey.toString();
            }
        }, new G0U<FlightCheckoutLegSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$28
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(FlightCheckoutLegSheetKey flightCheckoutLegSheetKey) {
                return mapBottomSheet12;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(FlightCheckoutLegSheetKey flightCheckoutLegSheetKey) {
                return mapBottomSheet12;
            }
        }, g0w14, C3cG.A0x(FlightCheckoutLegSheetKey.class));
        final Map<String, Object> mapBottomSheet13 = companion.bottomSheet(true, true, false);
        G0W<DeliveryCheckoutStopSheetKey, BFM, Integer, Unit> g0w15 = ComposableSingletons$AgentPermissionEntryProviderKt.lambda$2043609504;
        c5rn.A00(new G0U<DeliveryCheckoutStopSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$29
            @Override // X.G0U
            public final Object invoke(DeliveryCheckoutStopSheetKey deliveryCheckoutStopSheetKey) {
                return deliveryCheckoutStopSheetKey.toString();
            }
        }, new G0U<DeliveryCheckoutStopSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$30
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(DeliveryCheckoutStopSheetKey deliveryCheckoutStopSheetKey) {
                return mapBottomSheet13;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(DeliveryCheckoutStopSheetKey deliveryCheckoutStopSheetKey) {
                return mapBottomSheet13;
            }
        }, g0w15, C3cG.A0x(DeliveryCheckoutStopSheetKey.class));
        final Map<String, Object> mapBottomSheet14 = companion.bottomSheet(true, true, false);
        G0W<FlightCheckoutPassengersSheetKey, BFM, Integer, Unit> g0w16 = ComposableSingletons$AgentPermissionEntryProviderKt.f97lambda$922766830;
        c5rn.A00(new G0U<FlightCheckoutPassengersSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$31
            @Override // X.G0U
            public final Object invoke(FlightCheckoutPassengersSheetKey flightCheckoutPassengersSheetKey) {
                return flightCheckoutPassengersSheetKey.toString();
            }
        }, new G0U<FlightCheckoutPassengersSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$32
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(FlightCheckoutPassengersSheetKey flightCheckoutPassengersSheetKey) {
                return mapBottomSheet14;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(FlightCheckoutPassengersSheetKey flightCheckoutPassengersSheetKey) {
                return mapBottomSheet14;
            }
        }, g0w16, C3cG.A0x(FlightCheckoutPassengersSheetKey.class));
        final Map<String, Object> mapBottomSheet15 = companion.bottomSheet(true, true, false);
        G0W<FlightCheckoutPassengerSheetKey, BFM, Integer, Unit> g0w17 = ComposableSingletons$AgentPermissionEntryProviderKt.f90lambda$1000865808;
        c5rn.A00(new G0U<FlightCheckoutPassengerSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$33
            @Override // X.G0U
            public final Object invoke(FlightCheckoutPassengerSheetKey flightCheckoutPassengerSheetKey) {
                return flightCheckoutPassengerSheetKey.toString();
            }
        }, new G0U<FlightCheckoutPassengerSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.AgentPermissionEntryProvider$provideEntry$$inlined$entry$default$34
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(FlightCheckoutPassengerSheetKey flightCheckoutPassengerSheetKey) {
                return mapBottomSheet15;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(FlightCheckoutPassengerSheetKey flightCheckoutPassengerSheetKey) {
                return mapBottomSheet15;
            }
        }, g0w17, C3cG.A0x(FlightCheckoutPassengerSheetKey.class));
    }
}
