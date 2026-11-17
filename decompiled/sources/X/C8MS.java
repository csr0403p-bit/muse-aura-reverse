package X;

import com.meta.mfa.credentials.GetCredentialRequestData;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.8MS, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8MS implements C9cd<GetCredentialRequestData> {
    public static final C8MS A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = GetCredentialRequestData.$childSerializers;
        String strA8f = null;
        String strA0w = null;
        String strA8f2 = null;
        byte[] bArr = null;
        List listA0P = null;
        String strA0w2 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new GetCredentialRequestData(i, strA8f, strA0w, strA8f2, bArr, listA0P, strA0w2, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 1);
                    i |= 2;
                    break;
                case 2:
                    strA8f2 = c9j4A55.A8f(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    bArr = (byte[]) c9j4A55.A8a(C9jL.A00, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 4);
                    i |= 16;
                    break;
                case 5:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        C8MS c8ms = new C8MS();
        A00 = c8ms;
        C9iK c9iKA1C = C3cG.A1C("com.meta.mfa.credentials.GetCredentialRequestData", c8ms, 6);
        c9iKA1C.A08("rpId", false);
        c9iKA1C.A08("userId", false);
        c9iKA1C.A08("userVerification", true);
        c9iKA1C.A08("challenge", false);
        c9iKA1C.A08("allowCredentials", true);
        c9iKA1C.A08("mediation", true);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = GetCredentialRequestData.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, AbstractC07749im.A00(c07779iq), c07779iq, C9jL.A00, C3cH.A13(f0cArr), AbstractC07749im.A00(c07779iq)};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        GetCredentialRequestData getCredentialRequestData = (GetCredentialRequestData) obj;
        AnonymousClass003.A0u(interfaceC07789is, getCredentialRequestData);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        GetCredentialRequestData.write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(getCredentialRequestData, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
