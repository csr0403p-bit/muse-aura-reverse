package com.facebook.aura.nodes.json;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C5hV;
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
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class NodeListEntryJson$$serializer implements C9cd<NodeListEntryJson> {
    public static final NodeListEntryJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final NodeListEntryJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        JsonElement jsonElementA16 = null;
        JsonElement jsonElementA162 = null;
        String strA0v = null;
        String strA0g = null;
        String str = null;
        JsonElement jsonElement = null;
        String strA0m = null;
        String strA0l = null;
        String strA0h = null;
        String strA0i = null;
        String strA0o = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new NodeListEntryJson(i, strA8f, strA0h, strA0i, strA0o, strA0l, strA0m, jsonElement, strA0g, str, strA0v, jsonElementA162, jsonElementA16, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0i = C3cH.A0i(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    strA0o = C60Q.A0o(c9iZ, c9j4A55);
                    i |= 8;
                    break;
                case 4:
                    strA0l = C3cI.A0l(c9iZ, c9j4A55);
                    i |= 16;
                    break;
                case 5:
                    strA0m = C3cI.A0m(c9iZ, c9j4A55);
                    i |= 32;
                    break;
                case 6:
                    jsonElement = (JsonElement) c9j4A55.A8Z(JsonElementSerializer.A00, c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 7);
                    i |= 128;
                    break;
                case 8:
                    str = (String) C3cI.A0U(c9iZ, c9j4A55);
                    i |= 256;
                    break;
                case 9:
                    strA0v = C3cI.A0v(c9iZ, c9j4A55, 9);
                    i |= 512;
                    break;
                case 10:
                    jsonElementA162 = C3cI.A16(c9iZ, c9j4A55, 10);
                    i |= 1024;
                    break;
                case 11:
                    jsonElementA16 = C3cI.A16(c9iZ, c9j4A55, 11);
                    i |= 2048;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        NodeListEntryJson$$serializer nodeListEntryJson$$serializer = new NodeListEntryJson$$serializer();
        INSTANCE = nodeListEntryJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.nodes.json.NodeListEntryJson", nodeListEntryJson$$serializer, 12);
        C3cH.A1I("node_id", c9iKA1C, true);
        c9iKA1C.A08("platform", true);
        c9iKA1C.A08("version", true);
        c9iKA1C.A08("last_seen_at", true);
        c9iKA1C.A08("paired_at", true);
        c9iKA1C.A08("online", true);
        c9iKA1C.A08("connection_state", true);
        c9iKA1C.A08("device_family", true);
        c9iKA1C.A08("pairing_status", true);
        c9iKA1C.A08("commands_v2", true);
        c9iKA1C.A08("metadata", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, c07779iq, c9hrA00, c9hrA002, AbstractC07749im.A00(jsonElementSerializer), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(jsonElementSerializer), AbstractC07749im.A00(jsonElementSerializer)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, NodeListEntryJson nodeListEntryJson) {
        AnonymousClass003.A0u(interfaceC07789is, nodeListEntryJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        NodeListEntryJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_json_json(nodeListEntryJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
