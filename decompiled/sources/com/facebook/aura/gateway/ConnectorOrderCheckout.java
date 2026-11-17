package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.List;

/* loaded from: classes2.dex */
public final class ConnectorOrderCheckout extends C06G implements HatchAgentPermissionsRepository.AgentPermissionRichPayload {
    public static final int $stable;
    public final HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField address;
    public final List<HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField> arrivals;
    public final String chargeNotice;
    public final HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField fulfillment;
    public final List<ConnectorOrderItem> items;
    public final List<HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField> priceDetails;
    public final HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField total;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectorOrderCheckout) {
                ConnectorOrderCheckout connectorOrderCheckout = (ConnectorOrderCheckout) obj;
                if (!C7384Etj.areEqual(this.items, connectorOrderCheckout.items) || !C7384Etj.areEqual(this.total, connectorOrderCheckout.total) || !C7384Etj.areEqual(this.priceDetails, connectorOrderCheckout.priceDetails) || !C7384Etj.areEqual(this.fulfillment, connectorOrderCheckout.fulfillment) || !C7384Etj.areEqual(this.address, connectorOrderCheckout.address) || !C7384Etj.areEqual(this.arrivals, connectorOrderCheckout.arrivals) || !C7384Etj.areEqual(this.chargeNotice, connectorOrderCheckout.chargeNotice)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        int i = HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField.$stable;
        $stable = i | i | i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConnectorOrderCheckout copy$default(ConnectorOrderCheckout connectorOrderCheckout, List list, HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField agentPermissionRequestPreviewField, List list2, HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField agentPermissionRequestPreviewField2, HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField agentPermissionRequestPreviewField3, List list3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = connectorOrderCheckout.items;
        }
        if ((i & 2) != 0) {
            agentPermissionRequestPreviewField = connectorOrderCheckout.total;
        }
        if ((i & 4) != 0) {
            list2 = connectorOrderCheckout.priceDetails;
        }
        if ((i & 8) != 0) {
            agentPermissionRequestPreviewField2 = connectorOrderCheckout.fulfillment;
        }
        if ((i & 16) != 0) {
            agentPermissionRequestPreviewField3 = connectorOrderCheckout.address;
        }
        if ((i & 32) != 0) {
            list3 = connectorOrderCheckout.arrivals;
        }
        if ((i & 64) != 0) {
            str = connectorOrderCheckout.chargeNotice;
        }
        return connectorOrderCheckout.copy(list, agentPermissionRequestPreviewField, list2, agentPermissionRequestPreviewField2, agentPermissionRequestPreviewField3, list3, str);
    }

    public final List<ConnectorOrderItem> component1() {
        return this.items;
    }

    public final HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField component2() {
        return this.total;
    }

    public final List<HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField> component3() {
        return this.priceDetails;
    }

    public final HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField component4() {
        return this.fulfillment;
    }

    public final HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField component5() {
        return this.address;
    }

    public final List<HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField> component6() {
        return this.arrivals;
    }

    public final String component7() {
        return this.chargeNotice;
    }

    public final HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField getAddress() {
        return this.address;
    }

    public final List<HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField> getArrivals() {
        return this.arrivals;
    }

    public final String getChargeNotice() {
        return this.chargeNotice;
    }

    public final HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField getFulfillment() {
        return this.fulfillment;
    }

    public final List<ConnectorOrderItem> getItems() {
        return this.items;
    }

    public final List<HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField> getPriceDetails() {
        return this.priceDetails;
    }

    public final HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField getTotal() {
        return this.total;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.arrivals, (((AnonymousClass005.A0F(this.priceDetails, AnonymousClass005.A0F(this.total, AnonymousClass005.A0E(this.items))) + AnonymousClass006.A0D(this.fulfillment)) * 31) + AnonymousClass006.A0D(this.address)) * 31) + AnonymousClass005.A0H(this.chargeNotice);
    }

    public ConnectorOrderCheckout(List<ConnectorOrderItem> list, HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField agentPermissionRequestPreviewField, List<HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField> list2, HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField agentPermissionRequestPreviewField2, HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField agentPermissionRequestPreviewField3, List<HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField> list3, String str) {
        AnonymousClass005.A0x(list, agentPermissionRequestPreviewField, list2);
        C7384Etj.A0Y(list3, 5);
        this.items = list;
        this.total = agentPermissionRequestPreviewField;
        this.priceDetails = list2;
        this.fulfillment = agentPermissionRequestPreviewField2;
        this.address = agentPermissionRequestPreviewField3;
        this.arrivals = list3;
        this.chargeNotice = str;
    }

    public final ConnectorOrderCheckout copy(List<ConnectorOrderItem> list, HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField agentPermissionRequestPreviewField, List<HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField> list2, HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField agentPermissionRequestPreviewField2, HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField agentPermissionRequestPreviewField3, List<HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField> list3, String str) {
        AnonymousClass005.A0x(list, agentPermissionRequestPreviewField, list2);
        C7384Etj.A0Y(list3, 5);
        return new ConnectorOrderCheckout(list, agentPermissionRequestPreviewField, list2, agentPermissionRequestPreviewField2, agentPermissionRequestPreviewField3, list3, str);
    }

    public String toString() {
        return super.toString();
    }
}
