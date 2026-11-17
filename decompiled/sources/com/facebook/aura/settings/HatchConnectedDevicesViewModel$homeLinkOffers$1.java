package com.facebook.aura.settings;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.devices.intf.SubscriptionAddOn;
import com.facebook.aura.devices.intf.SubscriptionAddOnEntry;
import com.facebook.aura.devices.intf.SubscriptionAddOnIntegration;
import com.facebook.aura.devices.intf.SubscriptionAddOnManagementAction;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.subscription.model.AuraSubscriptionActionsKt;
import com.facebook.aura.subscription.repo.SubscriptionDetails;
import com.facebook.aura.subscription.repo.SubscriptionDetailsState;
import com.facebook.aura.subscription.repo.SubscriptionManagementAction;
import com.facebook.aura.subscription.repo.SubscriptionManagementCta;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.settings.HatchConnectedDevicesViewModel$homeLinkOffers$1", f = "HatchConnectedDevicesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConnectedDevicesViewModel$homeLinkOffers$1 extends AbstractC07127nr implements G0W<SubscriptionDetailsState, Boolean, HtJ<? super HomeLinkOffer>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ boolean Z$0;
    public int label;

    public HatchConnectedDevicesViewModel$homeLinkOffers$1(HtJ<? super HatchConnectedDevicesViewModel$homeLinkOffers$1> htJ) {
        super(3, htJ);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Object invoke(SubscriptionDetailsState subscriptionDetailsState, Boolean bool, HtJ<? super HomeLinkOffer> htJ) {
        return invoke(subscriptionDetailsState, AnonymousClass001.A1X(bool), htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        SubscriptionDetailsState.Success success;
        SubscriptionDetails subscriptionDetails;
        boolean z;
        Object next;
        SubscriptionAddOnManagementAction subscriptionAddOnManagementActionManagementAction;
        SubscriptionDetailsState subscriptionDetailsState = (SubscriptionDetailsState) this.L$0;
        boolean z2 = this.Z$0;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        AuraNavKey auraNavKey = null;
        if (!(subscriptionDetailsState instanceof SubscriptionDetailsState.Success) || (success = (SubscriptionDetailsState.Success) subscriptionDetailsState) == null || (subscriptionDetails = success.details) == null || z2 || !(z = subscriptionDetails.isPaidTier)) {
            return null;
        }
        Iterator it = AuraSubscriptionActionsKt.resolveSubscriptionActions(subscriptionDetails.managementActions, z, subscriptionDetails.topupEligible).rows.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((SubscriptionManagementCta) next).action == SubscriptionManagementAction.CLAIM_META_HOME_LINK) {
                break;
            }
        }
        SubscriptionManagementCta subscriptionManagementCta = (SubscriptionManagementCta) next;
        SubscriptionAddOnIntegration subscriptionAddOnIntegrationResolveIntegration = SubscriptionAddOn.INSTANCE.resolveIntegration();
        if (subscriptionAddOnIntegrationResolveIntegration != null && (subscriptionAddOnManagementActionManagementAction = subscriptionAddOnIntegrationResolveIntegration.managementAction(SubscriptionAddOnEntry.DEVICE_SETTINGS)) != null) {
            auraNavKey = subscriptionAddOnManagementActionManagementAction.destination;
        }
        return HatchConnectedDeviceSectionsKt.homeLinkOffer(subscriptionManagementCta, auraNavKey);
    }

    public final Object invoke(SubscriptionDetailsState subscriptionDetailsState, boolean z, HtJ<? super HomeLinkOffer> htJ) {
        HatchConnectedDevicesViewModel$homeLinkOffers$1 hatchConnectedDevicesViewModel$homeLinkOffers$1 = new HatchConnectedDevicesViewModel$homeLinkOffers$1(htJ);
        hatchConnectedDevicesViewModel$homeLinkOffers$1.L$0 = subscriptionDetailsState;
        hatchConnectedDevicesViewModel$homeLinkOffers$1.Z$0 = z;
        return hatchConnectedDevicesViewModel$homeLinkOffers$1.invokeSuspend(Unit.INSTANCE);
    }
}
