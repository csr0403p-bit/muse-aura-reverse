package X;

import com.facebook.aura.login.nativeflow.HatchPasskeyW3cKt;
import com.meta.mfa.credentials.CreatePublicKeyCredentialResponse;
import com.meta.mfa.credentials.CreatePublicKeyCredentialResponseData;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9m0, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9m0 implements C9cd<CreatePublicKeyCredentialResponse> {
    public static final C9m0 A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        byte[] bArr = null;
        String strA8f2 = null;
        CreatePublicKeyCredentialResponseData createPublicKeyCredentialResponseData = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new CreatePublicKeyCredentialResponse(i, strA8f, bArr, strA8f2, createPublicKeyCredentialResponseData, null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                bArr = (byte[]) c9j4A55.A8a(C9jL.A00, c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                strA8f2 = c9j4A55.A8f(c9iZ, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                createPublicKeyCredentialResponseData = (CreatePublicKeyCredentialResponseData) c9j4A55.A8a(C9lx.A00, c9iZ, 3);
                i |= 8;
            }
        }
    }

    static {
        C9m0 c9m0 = new C9m0();
        A00 = c9m0;
        C9iK c9iKA1C = C3cG.A1C("com.meta.mfa.credentials.CreatePublicKeyCredentialResponse", c9m0, 4);
        boolean zA1Y = C60O.A1Y(c9iKA1C);
        c9iKA1C.A08("rawId", zA1Y);
        c9iKA1C.A08("authenticatorAttachment", zA1Y);
        c9iKA1C.A08(HatchPasskeyW3cKt.RESPONSE_KEY, zA1Y);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, C9jL.A00, c07779iq, C9lx.A00};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        CreatePublicKeyCredentialResponse createPublicKeyCredentialResponse = (CreatePublicKeyCredentialResponse) obj;
        AnonymousClass003.A0u(interfaceC07789is, createPublicKeyCredentialResponse);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        CreatePublicKeyCredentialResponse.write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(createPublicKeyCredentialResponse, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
