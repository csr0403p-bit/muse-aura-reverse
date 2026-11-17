package X;

import com.meta.mfa.credentials.CreatePublicKeyCredentialRequest;
import com.meta.mfa.credentials.CreatePublicKeyCredentialRequestData;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9gx, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9gx implements C9cd<CreatePublicKeyCredentialRequest> {
    public static final C9gx A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        CreatePublicKeyCredentialRequestData createPublicKeyCredentialRequestData = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new CreatePublicKeyCredentialRequest(i, createPublicKeyCredentialRequestData, null);
            }
            if (iA8N != 0) {
                throw C3cG.A17(iA8N);
            }
            createPublicKeyCredentialRequestData = (CreatePublicKeyCredentialRequestData) c9j4A55.A8a(C9gp.A00, c9iZ, 0);
            i = 1;
        }
    }

    static {
        C9gx c9gx = new C9gx();
        A00 = c9gx;
        C9iK c9iKA1C = C3cG.A1C("com.meta.mfa.credentials.CreatePublicKeyCredentialRequest", c9gx, 1);
        c9iKA1C.A08("publicKey", false);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{C9gp.A00};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        CreatePublicKeyCredentialRequest createPublicKeyCredentialRequest = (CreatePublicKeyCredentialRequest) obj;
        AnonymousClass003.A0u(interfaceC07789is, createPublicKeyCredentialRequest);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        c9j5A56.AAQ(createPublicKeyCredentialRequest.publicKey, C9gp.A00, c9iZ, 0);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
