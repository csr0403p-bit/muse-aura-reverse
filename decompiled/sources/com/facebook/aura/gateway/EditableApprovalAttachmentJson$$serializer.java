package com.facebook.aura.gateway;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cI;
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
public final /* synthetic */ class EditableApprovalAttachmentJson$$serializer implements C9cd<EditableApprovalAttachmentJson> {
    public static final int $stable = 0;
    public static final EditableApprovalAttachmentJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final EditableApprovalAttachmentJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        String strA8f2 = null;
        JsonElement jsonElementA16 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new EditableApprovalAttachmentJson(i, strA8f, strA8f2, jsonElementA16, (C2hx) null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA8f2 = c9j4A55.A8f(c9iZ, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                jsonElementA16 = C3cI.A16(c9iZ, c9j4A55, 2);
                i |= 4;
            }
        }
    }

    static {
        EditableApprovalAttachmentJson$$serializer editableApprovalAttachmentJson$$serializer = new EditableApprovalAttachmentJson$$serializer();
        INSTANCE = editableApprovalAttachmentJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.EditableApprovalAttachmentJson", editableApprovalAttachmentJson$$serializer, 3);
        c9iKA1C.A08("id", false);
        c9iKA1C.A08("name", false);
        c9iKA1C.A08("preview", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, AbstractC07749im.A00(JsonElementSerializer.A00)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, EditableApprovalAttachmentJson editableApprovalAttachmentJson) {
        AnonymousClass003.A0u(interfaceC07789is, editableApprovalAttachmentJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        EditableApprovalAttachmentJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(editableApprovalAttachmentJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
