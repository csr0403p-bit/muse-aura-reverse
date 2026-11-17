package X;

import com.meta.mfa.credentials.AuthenticatorSelection;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9Rf, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9Rf implements C9cd<AuthenticatorSelection> {
    public static final C9Rf A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0v = null;
        String strA0v2 = null;
        Boolean boolA0L = null;
        String strA8f = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new AuthenticatorSelection(i, strA0v, strA0v2, boolA0L, strA8f, (C2hx) null);
            }
            if (iA8N == 0) {
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA0v2 = C3cI.A0v(c9iZ, c9j4A55, 1);
                i |= 2;
            } else if (iA8N == 2) {
                boolA0L = C3cI.A0L(c9iZ, c9j4A55, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                strA8f = c9j4A55.A8f(c9iZ, 3);
                i |= 8;
            }
        }
    }

    static {
        C9Rf c9Rf = new C9Rf();
        A00 = c9Rf;
        C9iK c9iKA1C = C3cG.A1C("com.meta.mfa.credentials.AuthenticatorSelection", c9Rf, 4);
        c9iKA1C.A08("authenticatorAttachment", true);
        c9iKA1C.A08("residentKey", true);
        c9iKA1C.A08("requireResidentKey", true);
        c9iKA1C.A08("userVerification", true);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(C07839ix.A00), c07779iq};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        AuthenticatorSelection authenticatorSelection = (AuthenticatorSelection) obj;
        AnonymousClass003.A0u(interfaceC07789is, authenticatorSelection);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        AuthenticatorSelection.write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(authenticatorSelection, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
