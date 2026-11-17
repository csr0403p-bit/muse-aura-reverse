package X;

import com.meta.mfa.credentials.AuthDataFlags;
import com.meta.mfa.credentials.ClientData;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9lr, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9lr implements C9cd<ClientData> {
    public static final C9lr A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        String strA0v = null;
        AuthDataFlags authDataFlags = null;
        Integer numA0N = null;
        String strA0g = null;
        String str = null;
        String strA0m = null;
        String strA0l = null;
        Boolean bool = null;
        String strA0h = null;
        String strA0i = null;
        String strA8f2 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ClientData(i, strA8f, strA0h, strA0i, bool, strA0l, strA0m, strA8f2, strA0g, str, numA0N, authDataFlags, strA0v, (C2hx) null);
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
                    bool = (Boolean) c9j4A55.A8Z(C07839ix.A00, c9iZ, 3);
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
                    strA8f2 = c9j4A55.A8f(c9iZ, 6);
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
                    numA0N = C3cI.A0N(c9iZ, c9j4A55, 9);
                    i |= 512;
                    break;
                case 10:
                    authDataFlags = (AuthDataFlags) c9j4A55.A8Z(C9lv.A00, c9iZ, 10);
                    i |= 1024;
                    break;
                case 11:
                    strA0v = C3cI.A0v(c9iZ, c9j4A55, 11);
                    i |= 2048;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        C9lr c9lr = new C9lr();
        A00 = c9lr;
        C9iK c9iKA1C = C3cG.A1C("com.meta.mfa.credentials.ClientData", c9lr, 12);
        c9iKA1C.A08("type", false);
        c9iKA1C.A08("challenge", false);
        c9iKA1C.A08("origin", false);
        c9iKA1C.A08("uvpaa", true);
        c9iKA1C.A08("userPreference", true);
        c9iKA1C.A08("aaguid", true);
        c9iKA1C.A08("os", true);
        c9iKA1C.A08("credentialId", true);
        c9iKA1C.A08("publicKey", true);
        c9iKA1C.A08("publicKeyAlgorithm", true);
        c9iKA1C.A08("flags", true);
        c9iKA1C.A08("rawId", true);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, AbstractC07749im.A00(C07839ix.A00), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(C07729ii.A00), AbstractC07749im.A00(C9lv.A00), AbstractC07749im.A00(c07779iq)};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        ClientData clientData = (ClientData) obj;
        AnonymousClass003.A0u(interfaceC07789is, clientData);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ClientData.write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(clientData, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
