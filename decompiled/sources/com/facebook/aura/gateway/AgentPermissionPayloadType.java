package com.facebook.aura.gateway;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.acra.constants.ReportField;
import com.facebook.aura.model.InternalLinkActionCardPresentationKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class AgentPermissionPayloadType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AgentPermissionPayloadType[] $VALUES;
    public static final AgentPermissionPayloadType BROWSER_ACTION;
    public static final AgentPermissionPayloadType BROWSER_CHECKOUT;
    public static final AgentPermissionPayloadType BROWSER_TASK_CONFIRMATION;
    public static final AgentPermissionPayloadType CAR_RENTAL_RESERVATION;
    public static final AgentPermissionPayloadType CONNECTOR;
    public static final Companion Companion;
    public static final AgentPermissionPayloadType DELIVERY_CHECKOUT;
    public static final AgentPermissionPayloadType DEVICE;
    public static final AgentPermissionPayloadType FLIGHT_CHECKOUT;
    public static final AgentPermissionPayloadType NETWORK;
    public static final AgentPermissionPayloadType OUTGOING_MEDIA;
    public static final AgentPermissionPayloadType PURCHASE_PREAPPROVAL;
    public static final AgentPermissionPayloadType RESERVATION_CHECKOUT;
    public static final AgentPermissionPayloadType SHOPIFY_CHECKOUT;
    public static final AgentPermissionPayloadType STRIPE_LINK_CHECKOUT;
    public static final AgentPermissionPayloadType UNKNOWN;
    public final String wireValue;

    static {
        AgentPermissionPayloadType agentPermissionPayloadType = new AgentPermissionPayloadType("PURCHASE_PREAPPROVAL", 0, "purchase_preapproval");
        PURCHASE_PREAPPROVAL = agentPermissionPayloadType;
        AgentPermissionPayloadType agentPermissionPayloadType2 = new AgentPermissionPayloadType("BROWSER_TASK_CONFIRMATION", 1, "browser_task_confirmation");
        BROWSER_TASK_CONFIRMATION = agentPermissionPayloadType2;
        AgentPermissionPayloadType agentPermissionPayloadType3 = new AgentPermissionPayloadType("BROWSER_CHECKOUT", 2, "browser_checkout");
        BROWSER_CHECKOUT = agentPermissionPayloadType3;
        AgentPermissionPayloadType agentPermissionPayloadType4 = new AgentPermissionPayloadType("STRIPE_LINK_CHECKOUT", 3, "stripe_link_checkout");
        STRIPE_LINK_CHECKOUT = agentPermissionPayloadType4;
        AgentPermissionPayloadType agentPermissionPayloadType5 = new AgentPermissionPayloadType("SHOPIFY_CHECKOUT", 4, "shopify_checkout");
        SHOPIFY_CHECKOUT = agentPermissionPayloadType5;
        AgentPermissionPayloadType agentPermissionPayloadType6 = new AgentPermissionPayloadType("FLIGHT_CHECKOUT", 5, "flight_checkout");
        FLIGHT_CHECKOUT = agentPermissionPayloadType6;
        AgentPermissionPayloadType agentPermissionPayloadType7 = new AgentPermissionPayloadType("RESERVATION_CHECKOUT", 6, "reservation_checkout");
        RESERVATION_CHECKOUT = agentPermissionPayloadType7;
        AgentPermissionPayloadType agentPermissionPayloadType8 = new AgentPermissionPayloadType("CAR_RENTAL_RESERVATION", 7, "car_rental_reservation");
        CAR_RENTAL_RESERVATION = agentPermissionPayloadType8;
        AgentPermissionPayloadType agentPermissionPayloadType9 = new AgentPermissionPayloadType("DELIVERY_CHECKOUT", 8, "delivery_checkout");
        DELIVERY_CHECKOUT = agentPermissionPayloadType9;
        AgentPermissionPayloadType agentPermissionPayloadType10 = new AgentPermissionPayloadType("OUTGOING_MEDIA", 9, "outgoing_media");
        OUTGOING_MEDIA = agentPermissionPayloadType10;
        AgentPermissionPayloadType agentPermissionPayloadType11 = new AgentPermissionPayloadType("BROWSER_ACTION", 10, "browser_action");
        BROWSER_ACTION = agentPermissionPayloadType11;
        AgentPermissionPayloadType agentPermissionPayloadType12 = new AgentPermissionPayloadType("NETWORK", 11, "network");
        NETWORK = agentPermissionPayloadType12;
        AgentPermissionPayloadType agentPermissionPayloadType13 = new AgentPermissionPayloadType(ReportField.DEVICE, 12, "device");
        DEVICE = agentPermissionPayloadType13;
        AgentPermissionPayloadType agentPermissionPayloadType14 = new AgentPermissionPayloadType("CONNECTOR", 13, InternalLinkActionCardPresentationKt.INTERNAL_LINK_TYPE_CONNECTOR);
        CONNECTOR = agentPermissionPayloadType14;
        AgentPermissionPayloadType agentPermissionPayloadType15 = new AgentPermissionPayloadType("UNKNOWN", 14, null);
        UNKNOWN = agentPermissionPayloadType15;
        AgentPermissionPayloadType[] agentPermissionPayloadTypeArr = {agentPermissionPayloadType, agentPermissionPayloadType2, agentPermissionPayloadType3, agentPermissionPayloadType4, agentPermissionPayloadType5, agentPermissionPayloadType6, agentPermissionPayloadType7, agentPermissionPayloadType8, agentPermissionPayloadType9, agentPermissionPayloadType10, agentPermissionPayloadType11, agentPermissionPayloadType12, agentPermissionPayloadType13, agentPermissionPayloadType14, agentPermissionPayloadType15};
        $VALUES = agentPermissionPayloadTypeArr;
        $ENTRIES = C3cG.A0w(agentPermissionPayloadTypeArr);
        Companion = new Companion();
    }

    public final class Companion {
        public Companion() {
        }

        public final AgentPermissionPayloadType fromWire(String str) {
            for (AgentPermissionPayloadType agentPermissionPayloadType : AgentPermissionPayloadType.values()) {
                if (agentPermissionPayloadType != AgentPermissionPayloadType.UNKNOWN && C7384Etj.areEqual(agentPermissionPayloadType.getWireValue(), str)) {
                    return agentPermissionPayloadType;
                }
            }
            return AgentPermissionPayloadType.UNKNOWN;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static Ey9<AgentPermissionPayloadType> getEntries() {
        return $ENTRIES;
    }

    public static AgentPermissionPayloadType valueOf(String str) {
        return (AgentPermissionPayloadType) Enum.valueOf(AgentPermissionPayloadType.class, str);
    }

    public static AgentPermissionPayloadType[] values() {
        return (AgentPermissionPayloadType[]) $VALUES.clone();
    }

    public final boolean getRendersAsConnectorCard() {
        return this == CONNECTOR || this == CAR_RENTAL_RESERVATION || this == UNKNOWN;
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public AgentPermissionPayloadType(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
