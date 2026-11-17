package com.facebook.aura.agentpermission;

import X.AEs;
import X.AEu;
import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.AnonymousClass441;
import X.C1BN;
import X.C3Ek;
import X.C3cI;
import X.C7384Etj;
import com.facebook.aura.agentpermission.CheckoutPriceDetailsUiState;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.gateway.ConnectorOrderCheckout;
import com.facebook.aura.gateway.DeliveryCheckoutApproval;
import com.facebook.aura.gateway.DeliveryCheckoutPriceItem;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class CheckoutPriceDetailsViewModel extends AEs {
    public static final int $stable = 8;
    public final String approvalId;
    public final HatchAgentPermissionsRepository repository;
    public final C1BN<CheckoutPriceDetailsUiState> uiState;

    public final class Factory extends AuraViewModelFactory<CheckoutPriceDetailsViewModel> {
        public static final int $stable = 8;
        public final String approvalId;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public CheckoutPriceDetailsViewModel create() {
            return new CheckoutPriceDetailsViewModel(this.userSession, this.approvalId);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.userSession = abstractC3358CGz;
            this.approvalId = str;
        }
    }

    public final C1BN<CheckoutPriceDetailsUiState> getUiState() {
        return this.uiState;
    }

    public final void onCloseTapped() {
        Object next;
        Iterator itA0z = C3cI.A0z(this.repository.pendingApprovals);
        do {
            next = null;
            if (!itA0z.hasNext()) {
                break;
            } else {
                next = itA0z.next();
            }
        } while (!C7384Etj.areEqual(((HatchAgentPermissionsRepository.AgentPermissionApproval) next).approvalId, this.approvalId));
        AgentPermissionTelemetryKt.logAgentPermissionSheetCloseClick((HatchAgentPermissionsRepository.AgentPermissionApproval) next, HatchScreen.AGENT_PERMISSION_SINGLE_APPROVAL_SHEET);
    }

    public CheckoutPriceDetailsViewModel(AbstractC3358CGz abstractC3358CGz, String str) {
        AnonymousClass003.A0u(abstractC3358CGz, str);
        this.approvalId = str;
        HatchAgentPermissionsRepository companion = HatchAgentPermissionsRepository.Companion.getInstance(abstractC3358CGz);
        this.repository = companion;
        CheckoutPriceDetailsViewModel$special$$inlined$map$1 checkoutPriceDetailsViewModel$special$$inlined$map$1 = new CheckoutPriceDetailsViewModel$special$$inlined$map$1(companion.pendingApprovals, this);
        this.uiState = AnonymousClass441.A00(priceDetailsUiState(companion.pendingApprovals.getValue()), AEu.A00(this), checkoutPriceDetailsViewModel$special$$inlined$map$1, C3Ek.A00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CheckoutPriceDetailsUiState priceDetailsUiState(List<HatchAgentPermissionsRepository.AgentPermissionApproval> list) {
        HatchAgentPermissionsRepository.AgentPermissionApproval next;
        CheckoutPriceDetailsUiState connectorOrder;
        Iterator<HatchAgentPermissionsRepository.AgentPermissionApproval> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(next.approvalId, this.approvalId)) {
                break;
            }
        }
        HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval = next;
        HatchAgentPermissionsRepository.AgentPermissionRichPayload agentPermissionRichPayload = agentPermissionApproval != null ? agentPermissionApproval.richPayload : null;
        if (agentPermissionRichPayload instanceof HatchAgentPermissionsRepository.FlightCheckoutApproval) {
            connectorOrder = new CheckoutPriceDetailsUiState.Flight(((HatchAgentPermissionsRepository.FlightCheckoutApproval) agentPermissionRichPayload).totals);
        } else {
            if (agentPermissionRichPayload instanceof DeliveryCheckoutApproval) {
                DeliveryCheckoutApproval deliveryCheckoutApproval = (DeliveryCheckoutApproval) agentPermissionRichPayload;
                List<DeliveryCheckoutPriceItem> list2 = deliveryCheckoutApproval.priceDetails;
                if (list2 != null) {
                    return new CheckoutPriceDetailsUiState.Delivery(list2, deliveryCheckoutApproval.total);
                }
            } else if (agentPermissionRichPayload instanceof ConnectorOrderCheckout) {
                ConnectorOrderCheckout connectorOrderCheckout = (ConnectorOrderCheckout) agentPermissionRichPayload;
                if (!connectorOrderCheckout.priceDetails.isEmpty()) {
                    connectorOrder = new CheckoutPriceDetailsUiState.ConnectorOrder(connectorOrderCheckout);
                }
            }
            connectorOrder = CheckoutPriceDetailsUiState.Dismissed.INSTANCE;
        }
        return connectorOrder;
    }
}
