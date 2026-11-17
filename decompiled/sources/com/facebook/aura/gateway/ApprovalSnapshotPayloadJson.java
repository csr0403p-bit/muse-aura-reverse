package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes2.dex */
public final class ApprovalSnapshotPayloadJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final BrowserCheckoutApprovalJson browser_checkout_payload;
    public final BrowserTaskConfirmationApprovalJson browser_task_confirmation_payload;
    public final JsonElement car_rental_reservation_payload;
    public final ApprovalPayloadPreviewJson connector_payload;
    public final JsonElement delivery_checkout_payload;
    public final ApprovalPayloadPreviewJson device_payload;
    public final FlightCheckoutApprovalJson flight_checkout_payload;
    public final ApprovalPayloadPreviewJson network_payload;
    public final OutgoingMediaApprovalJson outgoing_media_payload;
    public final ReservationCheckoutApprovalJson reservation_checkout_payload;
    public final ShopifyCheckoutApprovalJson shopify_checkout_payload;
    public final StripeLinkCheckoutApprovalJson stripe_link_checkout_payload;
    public final String type;

    public final class Companion {
        public final C9hr<ApprovalSnapshotPayloadJson> serializer() {
            return ApprovalSnapshotPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ApprovalSnapshotPayloadJson() {
        this("", null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ApprovalSnapshotPayloadJson approvalSnapshotPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(approvalSnapshotPayloadJson.type)) {
            c9j5.AAV(approvalSnapshotPayloadJson.type, c9iZ, 0);
        }
        if (zAfR || approvalSnapshotPayloadJson.connector_payload != null) {
            c9j5.AAP(approvalSnapshotPayloadJson.connector_payload, ApprovalPayloadPreviewJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || approvalSnapshotPayloadJson.network_payload != null) {
            c9j5.AAP(approvalSnapshotPayloadJson.network_payload, ApprovalPayloadPreviewJson$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || approvalSnapshotPayloadJson.device_payload != null) {
            c9j5.AAP(approvalSnapshotPayloadJson.device_payload, ApprovalPayloadPreviewJson$$serializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || approvalSnapshotPayloadJson.browser_task_confirmation_payload != null) {
            c9j5.AAP(approvalSnapshotPayloadJson.browser_task_confirmation_payload, BrowserTaskConfirmationApprovalJson$$serializer.INSTANCE, c9iZ, 4);
        }
        if (zAfR || approvalSnapshotPayloadJson.browser_checkout_payload != null) {
            c9j5.AAP(approvalSnapshotPayloadJson.browser_checkout_payload, BrowserCheckoutApprovalJson$$serializer.INSTANCE, c9iZ, 5);
        }
        if (zAfR || approvalSnapshotPayloadJson.stripe_link_checkout_payload != null) {
            c9j5.AAP(approvalSnapshotPayloadJson.stripe_link_checkout_payload, StripeLinkCheckoutApprovalJson$$serializer.INSTANCE, c9iZ, 6);
        }
        if (zAfR || approvalSnapshotPayloadJson.shopify_checkout_payload != null) {
            c9j5.AAP(approvalSnapshotPayloadJson.shopify_checkout_payload, ShopifyCheckoutApprovalJson$$serializer.INSTANCE, c9iZ, 7);
        }
        if (zAfR || approvalSnapshotPayloadJson.flight_checkout_payload != null) {
            c9j5.AAP(approvalSnapshotPayloadJson.flight_checkout_payload, FlightCheckoutApprovalJson$$serializer.INSTANCE, c9iZ, 8);
        }
        if (zAfR || approvalSnapshotPayloadJson.reservation_checkout_payload != null) {
            c9j5.AAP(approvalSnapshotPayloadJson.reservation_checkout_payload, ReservationCheckoutApprovalJson$$serializer.INSTANCE, c9iZ, 9);
        }
        if (zAfR || approvalSnapshotPayloadJson.car_rental_reservation_payload != null) {
            c9j5.AAP(approvalSnapshotPayloadJson.car_rental_reservation_payload, JsonElementSerializer.A00, c9iZ, 10);
        }
        if (zAfR || approvalSnapshotPayloadJson.outgoing_media_payload != null) {
            c9j5.AAP(approvalSnapshotPayloadJson.outgoing_media_payload, OutgoingMediaApprovalJson$$serializer.INSTANCE, c9iZ, 11);
        }
        if (zAfR || approvalSnapshotPayloadJson.delivery_checkout_payload != null) {
            c9j5.AAP(approvalSnapshotPayloadJson.delivery_checkout_payload, JsonElementSerializer.A00, c9iZ, 12);
        }
    }

    public final ApprovalSnapshotPayloadJson copy(String str, ApprovalPayloadPreviewJson approvalPayloadPreviewJson, ApprovalPayloadPreviewJson approvalPayloadPreviewJson2, ApprovalPayloadPreviewJson approvalPayloadPreviewJson3, BrowserTaskConfirmationApprovalJson browserTaskConfirmationApprovalJson, BrowserCheckoutApprovalJson browserCheckoutApprovalJson, StripeLinkCheckoutApprovalJson stripeLinkCheckoutApprovalJson, ShopifyCheckoutApprovalJson shopifyCheckoutApprovalJson, FlightCheckoutApprovalJson flightCheckoutApprovalJson, ReservationCheckoutApprovalJson reservationCheckoutApprovalJson, JsonElement jsonElement, OutgoingMediaApprovalJson outgoingMediaApprovalJson, JsonElement jsonElement2) {
        C7384Etj.A0Y(str, 0);
        return new ApprovalSnapshotPayloadJson(str, approvalPayloadPreviewJson, approvalPayloadPreviewJson2, approvalPayloadPreviewJson3, browserTaskConfirmationApprovalJson, browserCheckoutApprovalJson, stripeLinkCheckoutApprovalJson, shopifyCheckoutApprovalJson, flightCheckoutApprovalJson, reservationCheckoutApprovalJson, jsonElement, outgoingMediaApprovalJson, jsonElement2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApprovalSnapshotPayloadJson) {
                ApprovalSnapshotPayloadJson approvalSnapshotPayloadJson = (ApprovalSnapshotPayloadJson) obj;
                if (!C7384Etj.areEqual(this.type, approvalSnapshotPayloadJson.type) || !C7384Etj.areEqual(this.connector_payload, approvalSnapshotPayloadJson.connector_payload) || !C7384Etj.areEqual(this.network_payload, approvalSnapshotPayloadJson.network_payload) || !C7384Etj.areEqual(this.device_payload, approvalSnapshotPayloadJson.device_payload) || !C7384Etj.areEqual(this.browser_task_confirmation_payload, approvalSnapshotPayloadJson.browser_task_confirmation_payload) || !C7384Etj.areEqual(this.browser_checkout_payload, approvalSnapshotPayloadJson.browser_checkout_payload) || !C7384Etj.areEqual(this.stripe_link_checkout_payload, approvalSnapshotPayloadJson.stripe_link_checkout_payload) || !C7384Etj.areEqual(this.shopify_checkout_payload, approvalSnapshotPayloadJson.shopify_checkout_payload) || !C7384Etj.areEqual(this.flight_checkout_payload, approvalSnapshotPayloadJson.flight_checkout_payload) || !C7384Etj.areEqual(this.reservation_checkout_payload, approvalSnapshotPayloadJson.reservation_checkout_payload) || !C7384Etj.areEqual(this.car_rental_reservation_payload, approvalSnapshotPayloadJson.car_rental_reservation_payload) || !C7384Etj.areEqual(this.outgoing_media_payload, approvalSnapshotPayloadJson.outgoing_media_payload) || !C7384Etj.areEqual(this.delivery_checkout_payload, approvalSnapshotPayloadJson.delivery_checkout_payload)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ApprovalSnapshotPayloadJson copy$default(ApprovalSnapshotPayloadJson approvalSnapshotPayloadJson, String str, ApprovalPayloadPreviewJson approvalPayloadPreviewJson, ApprovalPayloadPreviewJson approvalPayloadPreviewJson2, ApprovalPayloadPreviewJson approvalPayloadPreviewJson3, BrowserTaskConfirmationApprovalJson browserTaskConfirmationApprovalJson, BrowserCheckoutApprovalJson browserCheckoutApprovalJson, StripeLinkCheckoutApprovalJson stripeLinkCheckoutApprovalJson, ShopifyCheckoutApprovalJson shopifyCheckoutApprovalJson, FlightCheckoutApprovalJson flightCheckoutApprovalJson, ReservationCheckoutApprovalJson reservationCheckoutApprovalJson, JsonElement jsonElement, OutgoingMediaApprovalJson outgoingMediaApprovalJson, JsonElement jsonElement2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = approvalSnapshotPayloadJson.type;
        }
        if ((i & 2) != 0) {
            approvalPayloadPreviewJson = approvalSnapshotPayloadJson.connector_payload;
        }
        if ((i & 4) != 0) {
            approvalPayloadPreviewJson2 = approvalSnapshotPayloadJson.network_payload;
        }
        if ((i & 8) != 0) {
            approvalPayloadPreviewJson3 = approvalSnapshotPayloadJson.device_payload;
        }
        if ((i & 16) != 0) {
            browserTaskConfirmationApprovalJson = approvalSnapshotPayloadJson.browser_task_confirmation_payload;
        }
        if ((i & 32) != 0) {
            browserCheckoutApprovalJson = approvalSnapshotPayloadJson.browser_checkout_payload;
        }
        if ((i & 64) != 0) {
            stripeLinkCheckoutApprovalJson = approvalSnapshotPayloadJson.stripe_link_checkout_payload;
        }
        if ((i & 128) != 0) {
            shopifyCheckoutApprovalJson = approvalSnapshotPayloadJson.shopify_checkout_payload;
        }
        if ((i & 256) != 0) {
            flightCheckoutApprovalJson = approvalSnapshotPayloadJson.flight_checkout_payload;
        }
        if ((i & 512) != 0) {
            reservationCheckoutApprovalJson = approvalSnapshotPayloadJson.reservation_checkout_payload;
        }
        if ((i & 1024) != 0) {
            jsonElement = approvalSnapshotPayloadJson.car_rental_reservation_payload;
        }
        if ((i & 2048) != 0) {
            outgoingMediaApprovalJson = approvalSnapshotPayloadJson.outgoing_media_payload;
        }
        if ((i & 4096) != 0) {
            jsonElement2 = approvalSnapshotPayloadJson.delivery_checkout_payload;
        }
        return approvalSnapshotPayloadJson.copy(str, approvalPayloadPreviewJson, approvalPayloadPreviewJson2, approvalPayloadPreviewJson3, browserTaskConfirmationApprovalJson, browserCheckoutApprovalJson, stripeLinkCheckoutApprovalJson, shopifyCheckoutApprovalJson, flightCheckoutApprovalJson, reservationCheckoutApprovalJson, jsonElement, outgoingMediaApprovalJson, jsonElement2);
    }

    public final String component1() {
        return this.type;
    }

    public final ReservationCheckoutApprovalJson component10() {
        return this.reservation_checkout_payload;
    }

    public final JsonElement component11() {
        return this.car_rental_reservation_payload;
    }

    public final OutgoingMediaApprovalJson component12() {
        return this.outgoing_media_payload;
    }

    public final JsonElement component13() {
        return this.delivery_checkout_payload;
    }

    public final ApprovalPayloadPreviewJson component2() {
        return this.connector_payload;
    }

    public final ApprovalPayloadPreviewJson component3() {
        return this.network_payload;
    }

    public final ApprovalPayloadPreviewJson component4() {
        return this.device_payload;
    }

    public final BrowserTaskConfirmationApprovalJson component5() {
        return this.browser_task_confirmation_payload;
    }

    public final BrowserCheckoutApprovalJson component6() {
        return this.browser_checkout_payload;
    }

    public final StripeLinkCheckoutApprovalJson component7() {
        return this.stripe_link_checkout_payload;
    }

    public final ShopifyCheckoutApprovalJson component8() {
        return this.shopify_checkout_payload;
    }

    public final FlightCheckoutApprovalJson component9() {
        return this.flight_checkout_payload;
    }

    public final BrowserCheckoutApprovalJson getBrowser_checkout_payload() {
        return this.browser_checkout_payload;
    }

    public final BrowserTaskConfirmationApprovalJson getBrowser_task_confirmation_payload() {
        return this.browser_task_confirmation_payload;
    }

    public final JsonElement getCar_rental_reservation_payload() {
        return this.car_rental_reservation_payload;
    }

    public final ApprovalPayloadPreviewJson getConnector_payload() {
        return this.connector_payload;
    }

    public final JsonElement getDelivery_checkout_payload() {
        return this.delivery_checkout_payload;
    }

    public final ApprovalPayloadPreviewJson getDevice_payload() {
        return this.device_payload;
    }

    public final FlightCheckoutApprovalJson getFlight_checkout_payload() {
        return this.flight_checkout_payload;
    }

    public final ApprovalPayloadPreviewJson getNetwork_payload() {
        return this.network_payload;
    }

    public final OutgoingMediaApprovalJson getOutgoing_media_payload() {
        return this.outgoing_media_payload;
    }

    public final ReservationCheckoutApprovalJson getReservation_checkout_payload() {
        return this.reservation_checkout_payload;
    }

    public final ShopifyCheckoutApprovalJson getShopify_checkout_payload() {
        return this.shopify_checkout_payload;
    }

    public final StripeLinkCheckoutApprovalJson getStripe_link_checkout_payload() {
        return this.stripe_link_checkout_payload;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return ((((((((((((((((((((((AnonymousClass001.A0G(this.type) + AnonymousClass006.A0D(this.connector_payload)) * 31) + AnonymousClass006.A0D(this.network_payload)) * 31) + AnonymousClass006.A0D(this.device_payload)) * 31) + AnonymousClass006.A0D(this.browser_task_confirmation_payload)) * 31) + AnonymousClass006.A0D(this.browser_checkout_payload)) * 31) + AnonymousClass006.A0D(this.stripe_link_checkout_payload)) * 31) + AnonymousClass006.A0D(this.shopify_checkout_payload)) * 31) + AnonymousClass006.A0D(this.flight_checkout_payload)) * 31) + AnonymousClass006.A0D(this.reservation_checkout_payload)) * 31) + AnonymousClass006.A0D(this.car_rental_reservation_payload)) * 31) + AnonymousClass006.A0D(this.outgoing_media_payload)) * 31) + C3cH.A02(this.delivery_checkout_payload);
    }

    public final String resolvedRequestPreview() {
        String str;
        String str2;
        String strTrimToNonEmpty;
        String str3;
        String strTrimToNonEmpty2;
        ApprovalPayloadPreviewJson approvalPayloadPreviewJson = this.connector_payload;
        if (approvalPayloadPreviewJson != null && (str3 = approvalPayloadPreviewJson.payload_preview) != null && (strTrimToNonEmpty2 = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str3)) != null) {
            return strTrimToNonEmpty2;
        }
        ApprovalPayloadPreviewJson approvalPayloadPreviewJson2 = this.network_payload;
        if (approvalPayloadPreviewJson2 != null && (str2 = approvalPayloadPreviewJson2.payload_preview) != null && (strTrimToNonEmpty = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str2)) != null) {
            return strTrimToNonEmpty;
        }
        ApprovalPayloadPreviewJson approvalPayloadPreviewJson3 = this.device_payload;
        if (approvalPayloadPreviewJson3 == null || (str = approvalPayloadPreviewJson3.payload_preview) == null) {
            return null;
        }
        return HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str);
    }

    public String toString() {
        return super.toString();
    }

    public ApprovalSnapshotPayloadJson(String str, ApprovalPayloadPreviewJson approvalPayloadPreviewJson, ApprovalPayloadPreviewJson approvalPayloadPreviewJson2, ApprovalPayloadPreviewJson approvalPayloadPreviewJson3, BrowserTaskConfirmationApprovalJson browserTaskConfirmationApprovalJson, BrowserCheckoutApprovalJson browserCheckoutApprovalJson, StripeLinkCheckoutApprovalJson stripeLinkCheckoutApprovalJson, ShopifyCheckoutApprovalJson shopifyCheckoutApprovalJson, FlightCheckoutApprovalJson flightCheckoutApprovalJson, ReservationCheckoutApprovalJson reservationCheckoutApprovalJson, JsonElement jsonElement, OutgoingMediaApprovalJson outgoingMediaApprovalJson, JsonElement jsonElement2) {
        C7384Etj.A0Y(str, 0);
        this.type = str;
        this.connector_payload = approvalPayloadPreviewJson;
        this.network_payload = approvalPayloadPreviewJson2;
        this.device_payload = approvalPayloadPreviewJson3;
        this.browser_task_confirmation_payload = browserTaskConfirmationApprovalJson;
        this.browser_checkout_payload = browserCheckoutApprovalJson;
        this.stripe_link_checkout_payload = stripeLinkCheckoutApprovalJson;
        this.shopify_checkout_payload = shopifyCheckoutApprovalJson;
        this.flight_checkout_payload = flightCheckoutApprovalJson;
        this.reservation_checkout_payload = reservationCheckoutApprovalJson;
        this.car_rental_reservation_payload = jsonElement;
        this.outgoing_media_payload = outgoingMediaApprovalJson;
        this.delivery_checkout_payload = jsonElement2;
    }

    public /* synthetic */ ApprovalSnapshotPayloadJson(int i, String str, ApprovalPayloadPreviewJson approvalPayloadPreviewJson, ApprovalPayloadPreviewJson approvalPayloadPreviewJson2, ApprovalPayloadPreviewJson approvalPayloadPreviewJson3, BrowserTaskConfirmationApprovalJson browserTaskConfirmationApprovalJson, BrowserCheckoutApprovalJson browserCheckoutApprovalJson, StripeLinkCheckoutApprovalJson stripeLinkCheckoutApprovalJson, ShopifyCheckoutApprovalJson shopifyCheckoutApprovalJson, FlightCheckoutApprovalJson flightCheckoutApprovalJson, ReservationCheckoutApprovalJson reservationCheckoutApprovalJson, JsonElement jsonElement, OutgoingMediaApprovalJson outgoingMediaApprovalJson, JsonElement jsonElement2, C2hx c2hx) {
        this.type = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.connector_payload = null;
        } else {
            this.connector_payload = approvalPayloadPreviewJson;
        }
        if ((i & 4) == 0) {
            this.network_payload = null;
        } else {
            this.network_payload = approvalPayloadPreviewJson2;
        }
        if ((i & 8) == 0) {
            this.device_payload = null;
        } else {
            this.device_payload = approvalPayloadPreviewJson3;
        }
        if ((i & 16) == 0) {
            this.browser_task_confirmation_payload = null;
        } else {
            this.browser_task_confirmation_payload = browserTaskConfirmationApprovalJson;
        }
        if ((i & 32) == 0) {
            this.browser_checkout_payload = null;
        } else {
            this.browser_checkout_payload = browserCheckoutApprovalJson;
        }
        if ((i & 64) == 0) {
            this.stripe_link_checkout_payload = null;
        } else {
            this.stripe_link_checkout_payload = stripeLinkCheckoutApprovalJson;
        }
        if ((i & 128) == 0) {
            this.shopify_checkout_payload = null;
        } else {
            this.shopify_checkout_payload = shopifyCheckoutApprovalJson;
        }
        if ((i & 256) == 0) {
            this.flight_checkout_payload = null;
        } else {
            this.flight_checkout_payload = flightCheckoutApprovalJson;
        }
        if ((i & 512) == 0) {
            this.reservation_checkout_payload = null;
        } else {
            this.reservation_checkout_payload = reservationCheckoutApprovalJson;
        }
        if ((i & 1024) == 0) {
            this.car_rental_reservation_payload = null;
        } else {
            this.car_rental_reservation_payload = jsonElement;
        }
        if ((i & 2048) == 0) {
            this.outgoing_media_payload = null;
        } else {
            this.outgoing_media_payload = outgoingMediaApprovalJson;
        }
        if ((i & 4096) == 0) {
            this.delivery_checkout_payload = null;
        } else {
            this.delivery_checkout_payload = jsonElement2;
        }
    }

    public /* synthetic */ ApprovalSnapshotPayloadJson(String str, ApprovalPayloadPreviewJson approvalPayloadPreviewJson, ApprovalPayloadPreviewJson approvalPayloadPreviewJson2, ApprovalPayloadPreviewJson approvalPayloadPreviewJson3, BrowserTaskConfirmationApprovalJson browserTaskConfirmationApprovalJson, BrowserCheckoutApprovalJson browserCheckoutApprovalJson, StripeLinkCheckoutApprovalJson stripeLinkCheckoutApprovalJson, ShopifyCheckoutApprovalJson shopifyCheckoutApprovalJson, FlightCheckoutApprovalJson flightCheckoutApprovalJson, ReservationCheckoutApprovalJson reservationCheckoutApprovalJson, JsonElement jsonElement, OutgoingMediaApprovalJson outgoingMediaApprovalJson, JsonElement jsonElement2, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : approvalPayloadPreviewJson, (i & 4) != 0 ? null : approvalPayloadPreviewJson2, (i & 8) != 0 ? null : approvalPayloadPreviewJson3, (i & 16) != 0 ? null : browserTaskConfirmationApprovalJson, (i & 32) != 0 ? null : browserCheckoutApprovalJson, (i & 64) != 0 ? null : stripeLinkCheckoutApprovalJson, (i & 128) != 0 ? null : shopifyCheckoutApprovalJson, (i & 256) != 0 ? null : flightCheckoutApprovalJson, (i & 512) != 0 ? null : reservationCheckoutApprovalJson, (i & 1024) != 0 ? null : jsonElement, (i & 2048) != 0 ? null : outgoingMediaApprovalJson, (i & 4096) != 0 ? null : jsonElement2);
    }
}
