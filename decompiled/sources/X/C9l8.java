package X;

import com.meta.mfa.credentials.SignalUnknownCredentialRequest;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9l8, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9l8 implements C9cd<SignalUnknownCredentialRequest> {
    public static final C9l8 A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        String strA8f2 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new SignalUnknownCredentialRequest(i, strA8f, strA8f2, null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else {
                if (iA8N != 1) {
                    throw C3cG.A17(iA8N);
                }
                strA8f2 = c9j4A55.A8f(c9iZ, 1);
                i |= 2;
            }
        }
    }

    static {
        C9l8 c9l8 = new C9l8();
        A00 = c9l8;
        C9iK c9iKA1C = C3cG.A1C("com.meta.mfa.credentials.SignalUnknownCredentialRequest", c9l8, 2);
        c9iKA1C.A08("rpId", false);
        c9iKA1C.A08("credentialId", false);
        A01 = c9iKA1C;
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        SignalUnknownCredentialRequest signalUnknownCredentialRequest = (SignalUnknownCredentialRequest) obj;
        AnonymousClass003.A0u(interfaceC07789is, signalUnknownCredentialRequest);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        SignalUnknownCredentialRequest.write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(signalUnknownCredentialRequest, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cG.A1Y();
    }
}
