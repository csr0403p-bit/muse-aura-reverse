package com.facebook.aura.pairs;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j1;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.conversation.offline.HatchOfflineConversationRepository;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class ConnectionDirectoryEntryJson$$serializer implements C9cd<ConnectionDirectoryEntryJson> {
    public static final int $stable = 0;
    public static final ConnectionDirectoryEntryJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ConnectionDirectoryEntryJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        String strA0g = null;
        ConnectionContactJson connectionContactJson = null;
        ConnectionCapabilitiesJson connectionCapabilitiesJson = null;
        String str = null;
        Long lA0Q = null;
        String strA0m = null;
        String strA0k = null;
        String strA0h = null;
        String strA0i = null;
        String strA8f2 = null;
        int i = 0;
        boolean zA8G = false;
        boolean zA8G2 = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ConnectionDirectoryEntryJson(i, strA8f, strA0h, strA0i, strA0k, strA0g, strA0m, strA8f2, zA8G2, str, lA0Q, connectionCapabilitiesJson, zA8G, connectionContactJson, (C2hx) null);
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
                    strA0k = C3cI.A0k(c9iZ, c9j4A55);
                    i |= 8;
                    break;
                case 4:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    strA0m = C3cI.A0m(c9iZ, c9j4A55);
                    i |= 32;
                    break;
                case 6:
                    strA8f2 = c9j4A55.A8f(c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    zA8G2 = c9j4A55.A8G(c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    str = (String) C3cI.A0U(c9iZ, c9j4A55);
                    i |= 256;
                    break;
                case 9:
                    lA0Q = C3cI.A0Q(c9iZ, c9j4A55, 9);
                    i |= 512;
                    break;
                case 10:
                    connectionCapabilitiesJson = (ConnectionCapabilitiesJson) c9j4A55.A8a(ConnectionCapabilitiesJson$$serializer.INSTANCE, c9iZ, 10);
                    i |= 1024;
                    break;
                case 11:
                    zA8G = c9j4A55.A8G(c9iZ, 11);
                    i |= 2048;
                    break;
                case 12:
                    connectionContactJson = (ConnectionContactJson) c9j4A55.A8Z(ConnectionContactJson$$serializer.INSTANCE, c9iZ, 12);
                    i |= 4096;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ConnectionDirectoryEntryJson$$serializer connectionDirectoryEntryJson$$serializer = new ConnectionDirectoryEntryJson$$serializer();
        INSTANCE = connectionDirectoryEntryJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.pairs.ConnectionDirectoryEntryJson", connectionDirectoryEntryJson$$serializer, 13);
        C3cH.A1I("connection_id", c9iKA1C, true);
        c9iKA1C.A08("provider", true);
        c9iKA1C.A08("address", true);
        c9iKA1C.A08("muse_id", true);
        c9iKA1C.A08("agent_name", true);
        c9iKA1C.A08("audience", true);
        c9iKA1C.A08(HatchOfflineConversationRepository.THREAD_STATUS_ACTIVE, true);
        c9iKA1C.A08("chat_session_id", true);
        c9iKA1C.A08("rules_revision", true);
        c9iKA1C.A08("capabilities", true);
        c9iKA1C.A08(PairsRepositoryKt.SPACE_ONLY_PRESET, true);
        c9iKA1C.A08("contact", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA003 = AbstractC07749im.A00(c07779iq);
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, c9hrA00, c9hrA002, c9hrA003, c07779iq, c07839ix, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(C9j1.A00), ConnectionCapabilitiesJson$$serializer.INSTANCE, c07839ix, AbstractC07749im.A00(ConnectionContactJson$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ConnectionDirectoryEntryJson connectionDirectoryEntryJson) {
        AnonymousClass003.A0u(interfaceC07789is, connectionDirectoryEntryJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ConnectionDirectoryEntryJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(connectionDirectoryEntryJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
