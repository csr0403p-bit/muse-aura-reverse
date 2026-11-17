package com.facebook.aura.nodes.json;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C07839ix;
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
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class ClientDataSourcePublishParamsJson$$serializer implements C9cd<ClientDataSourcePublishParamsJson> {
    public static final ClientDataSourcePublishParamsJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ClientDataSourcePublishParamsJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        Boolean boolA0M = null;
        Integer numA0X = null;
        Integer numA0X2 = null;
        String strA0w = null;
        String strA0m = null;
        String strA0h = null;
        String strA0i = null;
        String strA0o = null;
        String strA8f2 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ClientDataSourcePublishParamsJson(i, strA8f, strA0h, strA0i, strA0o, strA8f2, strA0m, strA0w, numA0X2, boolA0M, numA0X, (C2hx) null);
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
                    strA8f2 = c9j4A55.A8f(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    strA0m = C3cI.A0m(c9iZ, c9j4A55);
                    i |= 32;
                    break;
                case 6:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 6);
                    i |= 64;
                    break;
                case 7:
                    numA0X2 = C60Q.A0X(c9iZ, c9j4A55, 7);
                    i |= 128;
                    break;
                case 8:
                    boolA0M = C3cI.A0M(c9iZ, c9j4A55, 8);
                    i |= 256;
                    break;
                case 9:
                    numA0X = C60Q.A0X(c9iZ, c9j4A55, 9);
                    i |= 512;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ClientDataSourcePublishParamsJson$$serializer clientDataSourcePublishParamsJson$$serializer = new ClientDataSourcePublishParamsJson$$serializer();
        INSTANCE = clientDataSourcePublishParamsJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.nodes.json.ClientDataSourcePublishParamsJson", clientDataSourcePublishParamsJson$$serializer, 10);
        c9iKA1C.A08("producer_id", false);
        c9iKA1C.A08(PhotosSearchHandlerKt.PARAM_SOURCE, false);
        c9iKA1C.A08("operation", false);
        c9iKA1C.A08("payload_json", false);
        c9iKA1C.A08("occurred_at", false);
        c9iKA1C.A08("event_id", true);
        c9iKA1C.A08("reconciliation_id", true);
        c9iKA1C.A08("chunk_index", true);
        c9iKA1C.A08("is_final", true);
        c9iKA1C.A08("chunk_count", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C07729ii c07729ii = C07729ii.A00;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c9hrA00, c9hrA002, AbstractC07749im.A00(c07729ii), AbstractC07749im.A00(C07839ix.A00), AbstractC07749im.A00(c07729ii)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ClientDataSourcePublishParamsJson clientDataSourcePublishParamsJson) {
        AnonymousClass003.A0u(interfaceC07789is, clientDataSourcePublishParamsJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ClientDataSourcePublishParamsJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_json_json(clientDataSourcePublishParamsJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
