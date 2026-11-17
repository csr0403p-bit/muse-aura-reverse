package com.facebook.aura.nodes.json;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C5hV;
import X.C60O;
import X.C60Q;
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
import com.facebook.aura.pairs.PairsInviteMailboxKt;
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class ClientInvokeResultParamsJson$$serializer implements C9cd<ClientInvokeResultParamsJson> {
    public static final ClientInvokeResultParamsJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ClientInvokeResultParamsJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0w = null;
        String strA0w2 = null;
        ClientInvokeErrorJson clientInvokeErrorJson = null;
        String strA0w3 = null;
        String strA0h = null;
        String strA0k = null;
        JsonArray jsonArray = null;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ClientInvokeResultParamsJson(i, strA0w3, strA0h, zA8G, strA0k, jsonArray, clientInvokeErrorJson, strA0w2, strA0w, (C2hx) null);
                case 0:
                    strA0w3 = C3cI.A0w(c9iZ, c9j4A55, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    zA8G = c9j4A55.A8G(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    strA0k = C3cI.A0k(c9iZ, c9j4A55);
                    i |= 8;
                    break;
                case 4:
                    jsonArray = (JsonArray) c9j4A55.A8Z(JsonArraySerializer.A01, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    clientInvokeErrorJson = (ClientInvokeErrorJson) c9j4A55.A8Z(ClientInvokeErrorJson$$serializer.INSTANCE, c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 6);
                    i |= 64;
                    break;
                case 7:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 7);
                    i |= 128;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ClientInvokeResultParamsJson$$serializer clientInvokeResultParamsJson$$serializer = new ClientInvokeResultParamsJson$$serializer();
        INSTANCE = clientInvokeResultParamsJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.nodes.json.ClientInvokeResultParamsJson", clientInvokeResultParamsJson$$serializer, 8);
        c9iKA1C.A08("client_id", true);
        c9iKA1C.A08("invoke_id", false);
        c9iKA1C.A08(PairsInviteMailboxKt.OUTCOME_OK, false);
        c9iKA1C.A08("payload_json", true);
        C60Q.A1N("files", c9iKA1C, true);
        C60O.A1V("card_json", c9iKA1C, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{AbstractC07749im.A00(c07779iq), c07779iq, C07839ix.A00, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(JsonArraySerializer.A01), AbstractC07749im.A00(ClientInvokeErrorJson$$serializer.INSTANCE), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ClientInvokeResultParamsJson clientInvokeResultParamsJson) {
        AnonymousClass003.A0u(interfaceC07789is, clientInvokeResultParamsJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ClientInvokeResultParamsJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_json_json(clientInvokeResultParamsJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
