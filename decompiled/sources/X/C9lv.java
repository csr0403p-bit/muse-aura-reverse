package X;

import com.meta.mfa.credentials.AuthDataFlags;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9lv, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9lv implements C9cd<AuthDataFlags> {
    public static final C9lv A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        boolean zA8G = false;
        boolean zA8G2 = false;
        boolean zA8G3 = false;
        boolean zA8G4 = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new AuthDataFlags(i, zA8G, zA8G4, zA8G3, zA8G2, (C2hx) null);
            }
            if (iA8N == 0) {
                zA8G = c9j4A55.A8G(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                zA8G4 = c9j4A55.A8G(c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                zA8G3 = c9j4A55.A8G(c9iZ, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                zA8G2 = c9j4A55.A8G(c9iZ, 3);
                i |= 8;
            }
        }
    }

    static {
        C9lv c9lv = new C9lv();
        A00 = c9lv;
        C9iK c9iKA1C = C3cG.A1C("com.meta.mfa.credentials.AuthDataFlags", c9lv, 4);
        c9iKA1C.A08("up", true);
        c9iKA1C.A08("uv", true);
        c9iKA1C.A08("be", true);
        c9iKA1C.A08("bs", true);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07839ix, c07839ix, c07839ix, c07839ix};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        AuthDataFlags authDataFlags = (AuthDataFlags) obj;
        AnonymousClass003.A0u(interfaceC07789is, authDataFlags);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        AuthDataFlags.write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(authDataFlags, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
