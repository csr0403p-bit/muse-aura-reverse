package X;

import com.meta.mfa.credentials.PubKeyCredParams;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9gv, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9gv implements C9cd<PubKeyCredParams> {
    public static final C9gv A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        int iA8U = 0;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new PubKeyCredParams(i, strA8f, iA8U, null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else {
                if (iA8N != 1) {
                    throw C3cG.A17(iA8N);
                }
                iA8U = c9j4A55.A8U(c9iZ, 1);
                i |= 2;
            }
        }
    }

    static {
        C9gv c9gv = new C9gv();
        A00 = c9gv;
        C9iK c9iKA1C = C3cG.A1C("com.meta.mfa.credentials.PubKeyCredParams", c9gv, 2);
        c9iKA1C.A08("type", false);
        c9iKA1C.A08("alg", false);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{C07779iq.A01, C07729ii.A00};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        PubKeyCredParams pubKeyCredParams = (PubKeyCredParams) obj;
        AnonymousClass003.A0u(interfaceC07789is, pubKeyCredParams);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        PubKeyCredParams.write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(pubKeyCredParams, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
