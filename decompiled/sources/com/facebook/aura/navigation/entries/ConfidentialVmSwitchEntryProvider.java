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
import com.facebook.aura.navigation.OverlaySceneStrategy;
import com.facebook.aura.navigation.key.ConfidentialVmChipBudgetOverlayScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmDataChoiceScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmDataTransferConfirmScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmDataTransferProgressScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmDataTransferResumeOverlayScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmDeleteDataSheetKey;
import com.facebook.aura.navigation.key.ConfidentialVmMigrationDoneOverlayScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmOffWaitlistSheetKey;
import com.facebook.aura.navigation.key.ConfidentialVmReviewArtifactsScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmSubscriptionEndedScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchIntroScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchPlansScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchProgressScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchResumeOverlayScreenKey;
import com.facebook.aura.overlay.api.OverlayPriority;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class ConfidentialVmSwitchEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final ConfidentialVmSwitchEntryProvider INSTANCE = new ConfidentialVmSwitchEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> map = AuraTransitionsKt.pushTransitionMetadata;
        G0W<ConfidentialVmSwitchIntroScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$ConfidentialVmSwitchEntryProviderKt.f116lambda$25074449;
        c5rn.A00(new G0U<ConfidentialVmSwitchIntroScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmSwitchEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(ConfidentialVmSwitchIntroScreenKey confidentialVmSwitchIntroScreenKey) {
                return confidentialVmSwitchIntroScreenKey.toString();
            }
        }, new G0U<ConfidentialVmSwitchIntroScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmSwitchEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConfidentialVmSwitchIntroScreenKey confidentialVmSwitchIntroScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConfidentialVmSwitchIntroScreenKey confidentialVmSwitchIntroScreenKey) {
                return map;
            }
        }, g0w, C3cG.A0x(ConfidentialVmSwitchIntroScreenKey.class));
        OverlaySceneStrategy.Companion companion = OverlaySceneStrategy.Companion;
        final Map<String, Object> mapOverlay = companion.overlay(OverlayPriority.CVM_SUBSCRIPTION_ENDED.ordinal());
        G0W<ConfidentialVmSubscriptionEndedScreenKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$ConfidentialVmSwitchEntryProviderKt.f113lambda$1744795811;
        c5rn.A00(new G0U<ConfidentialVmSubscriptionEndedScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmSwitchEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(ConfidentialVmSubscriptionEndedScreenKey confidentialVmSubscriptionEndedScreenKey) {
                return confidentialVmSubscriptionEndedScreenKey.toString();
            }
        }, new G0U<ConfidentialVmSubscriptionEndedScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmSwitchEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConfidentialVmSubscriptionEndedScreenKey confidentialVmSubscriptionEndedScreenKey) {
                return mapOverlay;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConfidentialVmSubscriptionEndedScreenKey confidentialVmSubscriptionEndedScreenKey) {
                return mapOverlay;
            }
        }, g0w2, C3cG.A0x(ConfidentialVmSubscriptionEndedScreenKey.class));
        G0W<ConfidentialVmSwitchPlansScreenKey, BFM, Integer, Unit> g0w3 = ComposableSingletons$ConfidentialVmSwitchEntryProviderKt.f112lambda$1511738955;
        c5rn.A00(new G0U<ConfidentialVmSwitchPlansScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmSwitchEntryProvider$provideEntry$$inlined$entry$default$5
            @Override // X.G0U
            public final Object invoke(ConfidentialVmSwitchPlansScreenKey confidentialVmSwitchPlansScreenKey) {
                return confidentialVmSwitchPlansScreenKey.toString();
            }
        }, new G0U<ConfidentialVmSwitchPlansScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmSwitchEntryProvider$provideEntry$$inlined$entry$default$6
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConfidentialVmSwitchPlansScreenKey confidentialVmSwitchPlansScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConfidentialVmSwitchPlansScreenKey confidentialVmSwitchPlansScreenKey) {
                return map;
            }
        }, g0w3, C3cG.A0x(ConfidentialVmSwitchPlansScreenKey.class));
        G0W<ConfidentialVmDataChoiceScreenKey, BFM, Integer, Unit> g0w4 = ComposableSingletons$ConfidentialVmSwitchEntryProviderKt.lambda$1933408669;
        c5rn.A00(new G0U<ConfidentialVmDataChoiceScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmSwitchEntryProvider$provideEntry$$inlined$entry$default$7
            @Override // X.G0U
            public final Object invoke(ConfidentialVmDataChoiceScreenKey confidentialVmDataChoiceScreenKey) {
                return confidentialVmDataChoiceScreenKey.toString();
            }
        }, new G0U<ConfidentialVmDataChoiceScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmSwitchEntryProvider$provideEntry$$inlined$entry$default$8
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConfidentialVmDataChoiceScreenKey confidentialVmDataChoiceScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConfidentialVmDataChoiceScreenKey confidentialVmDataChoiceScreenKey) {
                return map;
            }
        }, g0w4, C3cG.A0x(ConfidentialVmDataChoiceScreenKey.class));
        G0W<ConfidentialVmReviewArtifactsScreenKey, BFM, Integer, Unit> g0w5 = ComposableSingletons$ConfidentialVmSwitchEntryProviderKt.f118lambda$79261050;
        c5rn.A00(new G0U<ConfidentialVmReviewArtifactsScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmSwitchEntryProvider$provideEntry$$inlined$entry$default$9
            @Override // X.G0U
            public final Object invoke(ConfidentialVmReviewArtifactsScreenKey confidentialVmReviewArtifactsScreenKey) {
                return confidentialVmReviewArtifactsScreenKey.toString();
            }
        }, new G0U<ConfidentialVmReviewArtifactsScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmSwitchEntryProvider$provideEntry$$inlined$entry$default$10
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConfidentialVmReviewArtifactsScreenKey confidentialVmReviewArtifactsScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConfidentialVmReviewArtifactsScreenKey confidentialVmReviewArtifactsScreenKey) {
                return map;
            }
        }, g0w5, C3cG.A0x(ConfidentialVmReviewArtifactsScreenKey.class));
        BottomSheetSceneStrategy.Companion companion2 = BottomSheetSceneStrategy.Companion;
        final Map<String, Object> mapBottomSheet = companion2.bottomSheet(true, true, false);
        G0W<ConfidentialVmDeleteDataSheetKey, BFM, Integer, Unit> g0w6 = ComposableSingletons$ConfidentialVmSwitchEntryProviderKt.lambda$920509402;
        c5rn.A00(new G0U<ConfidentialVmDeleteDataSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmSwitchEntryProvider$provideEntry$$inlined$entry$default$11
            @Override // X.G0U
            public final Object invoke(ConfidentialVmDeleteDataSheetKey confidentialVmDeleteDataSheetKey) {
                return confidentialVmDeleteDataSheetKey.toString();
            }
        }, new G0U<ConfidentialVmDeleteDataSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmSwitchEntryProvider$provideEntry$$inlined$entry$default$12
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConfidentialVmDeleteDataSheetKey confidentialVmDeleteDataSheetKey) {
                return mapBottomSheet;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConfidentialVmDeleteDataSheetKey confidentialVmDeleteDataSheetKey) {
                return mapBottomSheet;
            }
        }, g0w6, C3cG.A0x(ConfidentialVmDeleteDataSheetKey.class));
        final Map<String, Object> mapBottomSheet2 = companion2.bottomSheet(true, true, false);
        G0W<ConfidentialVmOffWaitlistSheetKey, BFM, Integer, Unit> g0w7 = ComposableSingletons$ConfidentialVmSwitchEntryProviderKt.lambda$892800416;
        c5rn.A00(new G0U<ConfidentialVmOffWaitlistSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmSwitchEntryProvider$provideEntry$$inlined$entry$default$13
            @Override // X.G0U
            public final Object invoke(ConfidentialVmOffWaitlistSheetKey confidentialVmOffWaitlistSheetKey) {
                return confidentialVmOffWaitlistSheetKey.toString();
            }
        }, new G0U<ConfidentialVmOffWaitlistSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmSwitchEntryProvider$provideEntry$$inlined$entry$default$14
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConfidentialVmOffWaitlistSheetKey confidentialVmOffWaitlistSheetKey) {
                return mapBottomSheet2;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConfidentialVmOffWaitlistSheetKey confidentialVmOffWaitlistSheetKey) {
                return mapBottomSheet2;
            }
        }, g0w7, C3cG.A0x(ConfidentialVmOffWaitlistSheetKey.class));
        final Map<String, Object> map2 = ActivationEntryProviderKt.activationTransitionMetadata;
        G0W<ConfidentialVmSwitchProgressScreenKey, BFM, Integer, Unit> g0w8 = ComposableSingletons$ConfidentialVmSwitchEntryProviderKt.lambda$475602479;
        c5rn.A00(new G0U<ConfidentialVmSwitchProgressScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmSwitchEntryProvider$provideEntry$$inlined$entry$default$15
            @Override // X.G0U
            public final Object invoke(ConfidentialVmSwitchProgressScreenKey confidentialVmSwitchProgressScreenKey) {
                return confidentialVmSwitchProgressScreenKey.toString();
            }
        }, new G0U<ConfidentialVmSwitchProgressScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmSwitchEntryProvider$provideEntry$$inlined$entry$default$16
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConfidentialVmSwitchProgressScreenKey confidentialVmSwitchProgressScreenKey) {
                return map2;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConfidentialVmSwitchProgressScreenKey confidentialVmSwitchProgressScreenKey) {
                return map2;
            }
        }, g0w8, C3cG.A0x(ConfidentialVmSwitchProgressScreenKey.class));
        G0W<ConfidentialVmDataTransferConfirmScreenKey, BFM, Integer, Unit> g0w9 = ComposableSingletons$ConfidentialVmSwitchEntryProviderKt.lambda$702482276;
        c5rn.A00(new G0U<ConfidentialVmDataTransferConfirmScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmSwitchEntryProvider$provideEntry$$inlined$entry$default$17
            @Override // X.G0U
            public final Object invoke(ConfidentialVmDataTransferConfirmScreenKey confidentialVmDataTransferConfirmScreenKey) {
                return confidentialVmDataTransferConfirmScreenKey.toString();
            }
        }, new G0U<ConfidentialVmDataTransferConfirmScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmSwitchEntryProvider$provideEntry$$inlined$entry$default$18
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConfidentialVmDataTransferConfirmScreenKey confidentialVmDataTransferConfirmScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConfidentialVmDataTransferConfirmScreenKey confidentialVmDataTransferConfirmScreenKey) {
                return map;
            }
        }, g0w9, C3cG.A0x(ConfidentialVmDataTransferConfirmScreenKey.class));
        G0W<ConfidentialVmDataTransferProgressScreenKey, BFM, Integer, Unit> g0w10 = ComposableSingletons$ConfidentialVmSwitchEntryProviderKt.f114lambda$2046668626;
        c5rn.A00(new G0U<ConfidentialVmDataTransferProgressScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmSwitchEntryProvider$provideEntry$$inlined$entry$default$19
            @Override // X.G0U
            public final Object invoke(ConfidentialVmDataTransferProgressScreenKey confidentialVmDataTransferProgressScreenKey) {
                return confidentialVmDataTransferProgressScreenKey.toString();
            }
        }, new G0U<ConfidentialVmDataTransferProgressScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmSwitchEntryProvider$provideEntry$$inlined$entry$default$20
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConfidentialVmDataTransferProgressScreenKey confidentialVmDataTransferProgressScreenKey) {
                return map2;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConfidentialVmDataTransferProgressScreenKey confidentialVmDataTransferProgressScreenKey) {
                return map2;
            }
        }, g0w10, C3cG.A0x(ConfidentialVmDataTransferProgressScreenKey.class));
        final Map<String, Object> mapOverlay2 = companion.overlay(OverlayPriority.CVM_CHIP_BUDGET.ordinal());
        G0W<ConfidentialVmChipBudgetOverlayScreenKey, BFM, Integer, Unit> g0w11 = ComposableSingletons$ConfidentialVmSwitchEntryProviderKt.f111lambda$1239716053;
        c5rn.A00(new G0U<ConfidentialVmChipBudgetOverlayScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmSwitchEntryProvider$provideEntry$$inlined$entry$default$21
            @Override // X.G0U
            public final Object invoke(ConfidentialVmChipBudgetOverlayScreenKey confidentialVmChipBudgetOverlayScreenKey) {
                return confidentialVmChipBudgetOverlayScreenKey.toString();
            }
        }, new G0U<ConfidentialVmChipBudgetOverlayScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmSwitchEntryProvider$provideEntry$$inlined$entry$default$22
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConfidentialVmChipBudgetOverlayScreenKey confidentialVmChipBudgetOverlayScreenKey) {
                return mapOverlay2;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConfidentialVmChipBudgetOverlayScreenKey confidentialVmChipBudgetOverlayScreenKey) {
                return mapOverlay2;
            }
        }, g0w11, C3cG.A0x(ConfidentialVmChipBudgetOverlayScreenKey.class));
        OverlayPriority overlayPriority = OverlayPriority.VM_TYPE_SWITCH;
        final Map<String, Object> mapOverlay3 = companion.overlay(overlayPriority.ordinal());
        G0W<ConfidentialVmSwitchResumeOverlayScreenKey, BFM, Integer, Unit> g0w12 = ComposableSingletons$ConfidentialVmSwitchEntryProviderKt.f115lambda$2062350566;
        c5rn.A00(new G0U<ConfidentialVmSwitchResumeOverlayScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmSwitchEntryProvider$provideEntry$$inlined$entry$default$23
            @Override // X.G0U
            public final Object invoke(ConfidentialVmSwitchResumeOverlayScreenKey confidentialVmSwitchResumeOverlayScreenKey) {
                return confidentialVmSwitchResumeOverlayScreenKey.toString();
            }
        }, new G0U<ConfidentialVmSwitchResumeOverlayScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmSwitchEntryProvider$provideEntry$$inlined$entry$default$24
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConfidentialVmSwitchResumeOverlayScreenKey confidentialVmSwitchResumeOverlayScreenKey) {
                return mapOverlay3;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConfidentialVmSwitchResumeOverlayScreenKey confidentialVmSwitchResumeOverlayScreenKey) {
                return mapOverlay3;
            }
        }, g0w12, C3cG.A0x(ConfidentialVmSwitchResumeOverlayScreenKey.class));
        final Map<String, Object> mapOverlay4 = companion.overlay(overlayPriority.ordinal());
        G0W<ConfidentialVmDataTransferResumeOverlayScreenKey, BFM, Integer, Unit> g0w13 = ComposableSingletons$ConfidentialVmSwitchEntryProviderKt.f117lambda$494872518;
        c5rn.A00(new G0U<ConfidentialVmDataTransferResumeOverlayScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmSwitchEntryProvider$provideEntry$$inlined$entry$default$25
            @Override // X.G0U
            public final Object invoke(ConfidentialVmDataTransferResumeOverlayScreenKey confidentialVmDataTransferResumeOverlayScreenKey) {
                return confidentialVmDataTransferResumeOverlayScreenKey.toString();
            }
        }, new G0U<ConfidentialVmDataTransferResumeOverlayScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmSwitchEntryProvider$provideEntry$$inlined$entry$default$26
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConfidentialVmDataTransferResumeOverlayScreenKey confidentialVmDataTransferResumeOverlayScreenKey) {
                return mapOverlay4;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConfidentialVmDataTransferResumeOverlayScreenKey confidentialVmDataTransferResumeOverlayScreenKey) {
                return mapOverlay4;
            }
        }, g0w13, C3cG.A0x(ConfidentialVmDataTransferResumeOverlayScreenKey.class));
        final Map<String, Object> mapOverlay5 = companion.overlay(Integer.MAX_VALUE);
        G0W<ConfidentialVmMigrationDoneOverlayScreenKey, BFM, Integer, Unit> g0w14 = ComposableSingletons$ConfidentialVmSwitchEntryProviderKt.lambda$1502089811;
        c5rn.A00(new G0U<ConfidentialVmMigrationDoneOverlayScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmSwitchEntryProvider$provideEntry$$inlined$entry$default$27
            @Override // X.G0U
            public final Object invoke(ConfidentialVmMigrationDoneOverlayScreenKey confidentialVmMigrationDoneOverlayScreenKey) {
                return confidentialVmMigrationDoneOverlayScreenKey.toString();
            }
        }, new G0U<ConfidentialVmMigrationDoneOverlayScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmSwitchEntryProvider$provideEntry$$inlined$entry$default$28
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConfidentialVmMigrationDoneOverlayScreenKey confidentialVmMigrationDoneOverlayScreenKey) {
                return mapOverlay5;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConfidentialVmMigrationDoneOverlayScreenKey confidentialVmMigrationDoneOverlayScreenKey) {
                return mapOverlay5;
            }
        }, g0w14, C3cG.A0x(ConfidentialVmMigrationDoneOverlayScreenKey.class));
    }
}
