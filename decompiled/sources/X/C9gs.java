package X;

import com.meta.mfa.credentials.User;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9gs, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9gs implements C9cd<User> {
    public static final C9gs A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        byte[] bArr = null;
        String strA8f = null;
        String strA8f2 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new User(i, bArr, strA8f, strA8f2, null);
            }
            if (iA8N == 0) {
                bArr = (byte[]) c9j4A55.A8a(C9jL.A00, c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA8f = c9j4A55.A8f(c9iZ, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                strA8f2 = c9j4A55.A8f(c9iZ, 2);
                i |= 4;
            }
        }
    }

    static {
        C9gs c9gs = new C9gs();
        A00 = c9gs;
        C9iK c9iKA1C = C3cG.A1C("com.meta.mfa.credentials.User", c9gs, 3);
        C60O.A1T("id", c9iKA1C, false);
        c9iKA1C.A08("displayName", false);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C9jL c9jL = C9jL.A00;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c9jL, c07779iq, c07779iq};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        User user = (User) obj;
        AnonymousClass003.A0u(interfaceC07789is, user);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        User.write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(user, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
