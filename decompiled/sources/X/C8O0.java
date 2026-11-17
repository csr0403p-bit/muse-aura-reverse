package X;

import com.meta.mfa.credentials.SignalAllAcceptedCredentialsRequest;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.8O0, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8O0 implements C9cd<SignalAllAcceptedCredentialsRequest> {
    public static final C8O0 A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = SignalAllAcceptedCredentialsRequest.$childSerializers;
        String strA8f = null;
        String strA8f2 = null;
        List listA0Q = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new SignalAllAcceptedCredentialsRequest(i, strA8f, strA8f2, listA0Q, null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA8f2 = c9j4A55.A8f(c9iZ, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 2);
                i |= 4;
            }
        }
    }

    static {
        C8O0 c8o0 = new C8O0();
        A00 = c8o0;
        C9iK c9iKA1C = C3cG.A1C("com.meta.mfa.credentials.SignalAllAcceptedCredentialsRequest", c8o0, 3);
        c9iKA1C.A08("rpId", false);
        c9iKA1C.A08("userId", false);
        c9iKA1C.A08("allAcceptedCredentialIds", false);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = SignalAllAcceptedCredentialsRequest.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, C3cH.A11(f0cArr)};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        SignalAllAcceptedCredentialsRequest signalAllAcceptedCredentialsRequest = (SignalAllAcceptedCredentialsRequest) obj;
        AnonymousClass003.A0u(interfaceC07789is, signalAllAcceptedCredentialsRequest);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        SignalAllAcceptedCredentialsRequest.write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(signalAllAcceptedCredentialsRequest, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
