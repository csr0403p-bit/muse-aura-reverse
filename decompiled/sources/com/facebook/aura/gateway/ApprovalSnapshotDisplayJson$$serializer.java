package com.facebook.aura.gateway;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j4;
import X.C9j5;
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.model.InternalLinkActionCardPresentationKt;
import java.util.List;
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class ApprovalSnapshotDisplayJson$$serializer implements C9cd<ApprovalSnapshotDisplayJson> {
    public static final int $stable = 0;
    public static final ApprovalSnapshotDisplayJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ApprovalSnapshotDisplayJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        int i2;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = ApprovalSnapshotDisplayJson.$childSerializers;
        C2hx c2hx = null;
        String strA0f = null;
        List listA0Q = null;
        String strA0n = null;
        String strA0l = null;
        String strA0p = null;
        String strA0m = null;
        String strA0k = null;
        String strA0j = null;
        String strA0r = null;
        String strA0q = null;
        String str = null;
        String strA0o = null;
        String strA0s = null;
        String strA0t = null;
        ApprovalConnectorDisplayJson approvalConnectorDisplayJson = null;
        String strA0u = null;
        String strA0f2 = null;
        String strA0f3 = null;
        String strA0f4 = null;
        JsonElement jsonElement = null;
        ApprovalPermissionQuestionJson approvalPermissionQuestionJson = null;
        PurchasePreapprovalJson purchasePreapprovalJson = null;
        int i3 = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ApprovalSnapshotDisplayJson(i3, purchasePreapprovalJson, strA0f, strA0j, strA0k, strA0l, strA0m, strA0n, strA0o, str, strA0p, strA0q, strA0r, strA0s, strA0t, approvalConnectorDisplayJson, strA0u, strA0f2, strA0f3, strA0f4, jsonElement, approvalPermissionQuestionJson, listA0Q, c2hx);
                case 0:
                    purchasePreapprovalJson = (PurchasePreapprovalJson) c9j4A55.A8Z(PurchasePreapprovalJson$$serializer.INSTANCE, c9iZ, 0);
                    i3 |= 1;
                case 1:
                    strA0f = C3cI.A0f(c9iZ, c9j4A55);
                    i3 |= 2;
                case 2:
                    strA0j = C3cI.A0j(c9iZ, c9j4A55);
                    i3 |= 4;
                case 3:
                    strA0k = C3cI.A0k(c9iZ, c9j4A55);
                    i3 |= 8;
                case 4:
                    strA0l = C3cI.A0l(c9iZ, c9j4A55);
                    i3 |= 16;
                case 5:
                    strA0m = C3cI.A0m(c9iZ, c9j4A55);
                    i3 |= 32;
                case 6:
                    strA0n = C3cI.A0n(c9iZ, c9j4A55);
                    i3 |= 64;
                case 7:
                    strA0o = C3cI.A0o(c9iZ, c9j4A55);
                    i3 |= 128;
                case 8:
                    str = (String) C3cI.A0U(c9iZ, c9j4A55);
                    i3 |= 256;
                case 9:
                    strA0p = C3cI.A0p(c9iZ, c9j4A55);
                    i3 |= 512;
                case 10:
                    strA0q = C3cI.A0q(c9iZ, c9j4A55);
                    i3 |= 1024;
                case 11:
                    strA0r = C3cI.A0r(c9iZ, c9j4A55);
                    i3 |= 2048;
                case 12:
                    strA0s = C3cI.A0s(c9iZ, c9j4A55);
                    i3 |= 4096;
                case 13:
                    strA0t = C3cI.A0t(c9iZ, c9j4A55);
                    i3 |= 8192;
                case 14:
                    approvalConnectorDisplayJson = (ApprovalConnectorDisplayJson) c9j4A55.A8Z(ApprovalConnectorDisplayJson$$serializer.INSTANCE, c9iZ, 14);
                    i3 |= 16384;
                case 15:
                    strA0u = C3cI.A0u(c9iZ, c9j4A55);
                    i2 = 32768;
                    i3 |= i2;
                case 16:
                    strA0f2 = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 16);
                    i2 = 65536;
                    i3 |= i2;
                case 17:
                    strA0f3 = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 17);
                    i2 = 131072;
                    i3 |= i2;
                case 18:
                    strA0f4 = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 18);
                    i2 = 262144;
                    i3 |= i2;
                case 19:
                    jsonElement = (JsonElement) c9j4A55.A8Z(JsonElementSerializer.A00, c9iZ, 19);
                    i3 |= 524288;
                case 20:
                    approvalPermissionQuestionJson = (ApprovalPermissionQuestionJson) c9j4A55.A8Z(ApprovalPermissionQuestionJson$$serializer.INSTANCE, c9iZ, 20);
                    i = 1048576;
                    i3 |= i;
                case 21:
                    listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 21);
                    i = 2097152;
                    i3 |= i;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ApprovalSnapshotDisplayJson$$serializer approvalSnapshotDisplayJson$$serializer = new ApprovalSnapshotDisplayJson$$serializer();
        INSTANCE = approvalSnapshotDisplayJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.ApprovalSnapshotDisplayJson", approvalSnapshotDisplayJson$$serializer, 22);
        c9iKA1C.A08("purchase_preapproval", true);
        c9iKA1C.A08("card_title", true);
        c9iKA1C.A08("summary_title", true);
        c9iKA1C.A08("review_text", true);
        c9iKA1C.A08("icon_key", true);
        c9iKA1C.A08("icon_url", true);
        c9iKA1C.A08("attention_label", true);
        c9iKA1C.A08("attention_mode", true);
        c9iKA1C.A08("permission_caption", true);
        c9iKA1C.A08("outcome_label", true);
        C3cH.A1I("total_promo_caption", c9iKA1C, true);
        c9iKA1C.A08("connector_display_name", true);
        c9iKA1C.A08("connector_icon_url", true);
        c9iKA1C.A08(InternalLinkActionCardPresentationKt.INTERNAL_LINK_TYPE_CONNECTOR, true);
        c9iKA1C.A08("scope_summary", true);
        c9iKA1C.A08("purpose_summary", true);
        c9iKA1C.A08("presentation_kind", true);
        c9iKA1C.A08("request_presentation", true);
        c9iKA1C.A08("request_preview_document", true);
        c9iKA1C.A08("permission_question", true);
        c9iKA1C.A08("detail_rows", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = ApprovalSnapshotDisplayJson.$childSerializers;
        C9hr c9hrA00 = AbstractC07749im.A00(PurchasePreapprovalJson$$serializer.INSTANCE);
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c9hrA00, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(ApprovalConnectorDisplayJson$$serializer.INSTANCE), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(JsonElementSerializer.A00), AbstractC07749im.A00(ApprovalPermissionQuestionJson$$serializer.INSTANCE), C3cG.A16(f0cArr, 21)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ApprovalSnapshotDisplayJson approvalSnapshotDisplayJson) {
        AnonymousClass003.A0u(interfaceC07789is, approvalSnapshotDisplayJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ApprovalSnapshotDisplayJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(approvalSnapshotDisplayJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
