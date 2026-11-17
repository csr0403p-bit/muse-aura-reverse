package com.facebook.aura.pairs;

import X.AnonymousClass003;
import X.C07839ix;
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

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class ConnectionCapabilitiesJson$$serializer implements C9cd<ConnectionCapabilitiesJson> {
    public static final int $stable = 0;
    public static final ConnectionCapabilitiesJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ConnectionCapabilitiesJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0w = null;
        boolean zA8G = false;
        boolean zA8G2 = false;
        boolean zA8G3 = false;
        boolean zA8G4 = false;
        boolean zA8G5 = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ConnectionCapabilitiesJson(i, zA8G, zA8G5, zA8G4, zA8G2, zA8G3, strA0w, (C2hx) null);
                case 0:
                    zA8G = c9j4A55.A8G(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    zA8G5 = c9j4A55.A8G(c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    zA8G4 = c9j4A55.A8G(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    zA8G2 = c9j4A55.A8G(c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    zA8G3 = c9j4A55.A8G(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ConnectionCapabilitiesJson$$serializer connectionCapabilitiesJson$$serializer = new ConnectionCapabilitiesJson$$serializer();
        INSTANCE = connectionCapabilitiesJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.pairs.ConnectionCapabilitiesJson", connectionCapabilitiesJson$$serializer, 6);
        c9iKA1C.A08("conversation_worker", true);
        c9iKA1C.A08("worker_tasks", true);
        c9iKA1C.A08("ordinary_provider_messaging", true);
        c9iKA1C.A08("rules_enforced", true);
        c9iKA1C.A08("typed_shares", true);
        c9iKA1C.A08("disconnect_effect", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07839ix, c07839ix, c07839ix, c07839ix, c07839ix, C3cG.A15()};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ConnectionCapabilitiesJson connectionCapabilitiesJson) {
        AnonymousClass003.A0u(interfaceC07789is, connectionCapabilitiesJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ConnectionCapabilitiesJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(connectionCapabilitiesJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
