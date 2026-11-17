package X;

import com.meta.mfa.credentials.AuthenticatorSelection;
import com.meta.mfa.credentials.CreatePublicKeyCredentialRequestData;
import com.meta.mfa.credentials.RelyingParty;
import com.meta.mfa.credentials.User;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9gp, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9gp implements C9cd<CreatePublicKeyCredentialRequestData> {
    public static final C9gp A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = CreatePublicKeyCredentialRequestData.$childSerializers;
        AuthenticatorSelection authenticatorSelection = null;
        Map map = null;
        User user = null;
        List list = null;
        RelyingParty relyingParty = null;
        List listA0P = null;
        byte[] bArr = null;
        String strA0i = null;
        List list2 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new CreatePublicKeyCredentialRequestData(i, authenticatorSelection, strA0i, list2, bArr, listA0P, relyingParty, user, list, map, (C2hx) null);
                case 0:
                    authenticatorSelection = (AuthenticatorSelection) c9j4A55.A8a(C9Rf.A00, c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0i = C3cI.A0i(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    list2 = (List) C3cJ.A0G(c9iZ, c9j4A55, f0cArr, 2);
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
                    relyingParty = (RelyingParty) c9j4A55.A8a(C9gl.A00, c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    user = (User) c9j4A55.A8a(C9gs.A00, c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    list = (List) C3cJ.A0G(c9iZ, c9j4A55, f0cArr, 7);
                    i |= 128;
                    break;
                case 8:
                    map = (Map) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 8);
                    i |= 256;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        C9gp c9gp = new C9gp();
        A00 = c9gp;
        C9iK c9iKA1C = C3cG.A1C("com.meta.mfa.credentials.CreatePublicKeyCredentialRequestData", c9gp, 9);
        c9iKA1C.A08("authenticatorSelection", true);
        c9iKA1C.A08("attestation", true);
        c9iKA1C.A08("attestationFormats", true);
        c9iKA1C.A08("challenge", false);
        c9iKA1C.A08("pubKeyCredParams", false);
        c9iKA1C.A08("rp", false);
        c9iKA1C.A08("user", false);
        c9iKA1C.A08("excludeCredentials", true);
        c9iKA1C.A08("extensions", true);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = CreatePublicKeyCredentialRequestData.$childSerializers;
        return new C9hr[]{C9Rf.A00, C3cG.A15(), C3cH.A14(f0cArr, 2), C9jL.A00, C3cH.A13(f0cArr), C9gl.A00, C9gs.A00, C3cH.A14(f0cArr, 7), C3cG.A16(f0cArr, 8)};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        CreatePublicKeyCredentialRequestData createPublicKeyCredentialRequestData = (CreatePublicKeyCredentialRequestData) obj;
        AnonymousClass003.A0u(interfaceC07789is, createPublicKeyCredentialRequestData);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        CreatePublicKeyCredentialRequestData.write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(createPublicKeyCredentialRequestData, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
