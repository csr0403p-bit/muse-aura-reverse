package X;

import com.meta.mfa.credentials.CreatePublicKeyCredentialResponseData;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9lx, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9lx implements C9cd<CreatePublicKeyCredentialResponseData> {
    public static final C9lx A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        String strA8f2 = null;
        Integer numA0N = null;
        String strA0v = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new CreatePublicKeyCredentialResponseData(i, strA8f, strA8f2, numA0N, strA0v, (C2hx) null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA8f2 = c9j4A55.A8f(c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                numA0N = C3cI.A0N(c9iZ, c9j4A55, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 3);
                i |= 8;
            }
        }
    }

    static {
        C9lx c9lx = new C9lx();
        A00 = c9lx;
        C9iK c9iKA1C = C3cG.A1C("com.meta.mfa.credentials.CreatePublicKeyCredentialResponseData", c9lx, 4);
        c9iKA1C.A08("clientDataJSON", false);
        c9iKA1C.A08("attestationObject", false);
        c9iKA1C.A08("publicKeyAlgorithm", true);
        c9iKA1C.A08("publicKey", true);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, AbstractC07749im.A00(C07729ii.A00), AbstractC07749im.A00(c07779iq)};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        CreatePublicKeyCredentialResponseData createPublicKeyCredentialResponseData = (CreatePublicKeyCredentialResponseData) obj;
        AnonymousClass003.A0u(interfaceC07789is, createPublicKeyCredentialResponseData);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        CreatePublicKeyCredentialResponseData.write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(createPublicKeyCredentialResponseData, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
