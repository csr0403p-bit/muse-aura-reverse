package com.facebook.aura.gateway;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class ApprovalSnapshotPayloadJson$$serializer implements C9cd<ApprovalSnapshotPayloadJson> {
    public static final int $stable = 0;
    public static final ApprovalSnapshotPayloadJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ApprovalSnapshotPayloadJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        ApprovalPayloadPreviewJson approvalPayloadPreviewJson = null;
        JsonElement jsonElement = null;
        OutgoingMediaApprovalJson outgoingMediaApprovalJson = null;
        JsonElement jsonElement2 = null;
        FlightCheckoutApprovalJson flightCheckoutApprovalJson = null;
        ShopifyCheckoutApprovalJson shopifyCheckoutApprovalJson = null;
        StripeLinkCheckoutApprovalJson stripeLinkCheckoutApprovalJson = null;
        BrowserTaskConfirmationApprovalJson browserTaskConfirmationApprovalJson = null;
        ReservationCheckoutApprovalJson reservationCheckoutApprovalJson = null;
        BrowserCheckoutApprovalJson browserCheckoutApprovalJson = null;
        ApprovalPayloadPreviewJson approvalPayloadPreviewJson2 = null;
        ApprovalPayloadPreviewJson approvalPayloadPreviewJson3 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ApprovalSnapshotPayloadJson(i, strA8f, approvalPayloadPreviewJson3, approvalPayloadPreviewJson, approvalPayloadPreviewJson2, browserTaskConfirmationApprovalJson, browserCheckoutApprovalJson, stripeLinkCheckoutApprovalJson, shopifyCheckoutApprovalJson, flightCheckoutApprovalJson, reservationCheckoutApprovalJson, jsonElement2, outgoingMediaApprovalJson, jsonElement, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    approvalPayloadPreviewJson3 = (ApprovalPayloadPreviewJson) c9j4A55.A8Z(ApprovalPayloadPreviewJson$$serializer.INSTANCE, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    approvalPayloadPreviewJson = (ApprovalPayloadPreviewJson) c9j4A55.A8Z(ApprovalPayloadPreviewJson$$serializer.INSTANCE, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    approvalPayloadPreviewJson2 = (ApprovalPayloadPreviewJson) c9j4A55.A8Z(ApprovalPayloadPreviewJson$$serializer.INSTANCE, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    browserTaskConfirmationApprovalJson = (BrowserTaskConfirmationApprovalJson) c9j4A55.A8Z(BrowserTaskConfirmationApprovalJson$$serializer.INSTANCE, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    browserCheckoutApprovalJson = (BrowserCheckoutApprovalJson) c9j4A55.A8Z(BrowserCheckoutApprovalJson$$serializer.INSTANCE, c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    stripeLinkCheckoutApprovalJson = (StripeLinkCheckoutApprovalJson) c9j4A55.A8Z(StripeLinkCheckoutApprovalJson$$serializer.INSTANCE, c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    shopifyCheckoutApprovalJson = (ShopifyCheckoutApprovalJson) c9j4A55.A8Z(ShopifyCheckoutApprovalJson$$serializer.INSTANCE, c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    flightCheckoutApprovalJson = (FlightCheckoutApprovalJson) c9j4A55.A8Z(FlightCheckoutApprovalJson$$serializer.INSTANCE, c9iZ, 8);
                    i |= 256;
                    break;
                case 9:
                    reservationCheckoutApprovalJson = (ReservationCheckoutApprovalJson) c9j4A55.A8Z(ReservationCheckoutApprovalJson$$serializer.INSTANCE, c9iZ, 9);
                    i |= 512;
                    break;
                case 10:
                    jsonElement2 = (JsonElement) c9j4A55.A8Z(JsonElementSerializer.A00, c9iZ, 10);
                    i |= 1024;
                    break;
                case 11:
                    outgoingMediaApprovalJson = (OutgoingMediaApprovalJson) c9j4A55.A8Z(OutgoingMediaApprovalJson$$serializer.INSTANCE, c9iZ, 11);
                    i |= 2048;
                    break;
                case 12:
                    jsonElement = (JsonElement) c9j4A55.A8Z(JsonElementSerializer.A00, c9iZ, 12);
                    i |= 4096;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ApprovalSnapshotPayloadJson$$serializer approvalSnapshotPayloadJson$$serializer = new ApprovalSnapshotPayloadJson$$serializer();
        INSTANCE = approvalSnapshotPayloadJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.ApprovalSnapshotPayloadJson", approvalSnapshotPayloadJson$$serializer, 13);
        c9iKA1C.A08("type", true);
        c9iKA1C.A08("connector_payload", true);
        c9iKA1C.A08("network_payload", true);
        c9iKA1C.A08("device_payload", true);
        c9iKA1C.A08("browser_task_confirmation_payload", true);
        c9iKA1C.A08("browser_checkout_payload", true);
        c9iKA1C.A08("stripe_link_checkout_payload", true);
        c9iKA1C.A08("shopify_checkout_payload", true);
        c9iKA1C.A08("flight_checkout_payload", true);
        c9iKA1C.A08("reservation_checkout_payload", true);
        c9iKA1C.A08("car_rental_reservation_payload", true);
        c9iKA1C.A08("outgoing_media_payload", true);
        c9iKA1C.A08("delivery_checkout_payload", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        ApprovalPayloadPreviewJson$$serializer approvalPayloadPreviewJson$$serializer = ApprovalPayloadPreviewJson$$serializer.INSTANCE;
        C9hr c9hrA00 = AbstractC07749im.A00(approvalPayloadPreviewJson$$serializer);
        C9hr c9hrA002 = AbstractC07749im.A00(approvalPayloadPreviewJson$$serializer);
        C9hr c9hrA003 = AbstractC07749im.A00(approvalPayloadPreviewJson$$serializer);
        C9hr c9hrA004 = AbstractC07749im.A00(BrowserTaskConfirmationApprovalJson$$serializer.INSTANCE);
        C9hr c9hrA005 = AbstractC07749im.A00(BrowserCheckoutApprovalJson$$serializer.INSTANCE);
        C9hr c9hrA006 = AbstractC07749im.A00(StripeLinkCheckoutApprovalJson$$serializer.INSTANCE);
        C9hr c9hrA007 = AbstractC07749im.A00(ShopifyCheckoutApprovalJson$$serializer.INSTANCE);
        C9hr c9hrA008 = AbstractC07749im.A00(FlightCheckoutApprovalJson$$serializer.INSTANCE);
        C9hr c9hrA009 = AbstractC07749im.A00(ReservationCheckoutApprovalJson$$serializer.INSTANCE);
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
        return new C9hr[]{c07779iq, c9hrA00, c9hrA002, c9hrA003, c9hrA004, c9hrA005, c9hrA006, c9hrA007, c9hrA008, c9hrA009, AbstractC07749im.A00(jsonElementSerializer), AbstractC07749im.A00(OutgoingMediaApprovalJson$$serializer.INSTANCE), AbstractC07749im.A00(jsonElementSerializer)};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9cd
    public /* bridge */ C9hr<?>[] typeParametersSerializers() {
        return C5hV.A00;
    }

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, ApprovalSnapshotPayloadJson approvalSnapshotPayloadJson) {
        AnonymousClass003.A0u(interfaceC07789is, approvalSnapshotPayloadJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ApprovalSnapshotPayloadJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(approvalSnapshotPayloadJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
