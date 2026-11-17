package X;

import com.facebook.pushlite.hpke.JsonKeypair;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class A5G implements C9cd<JsonKeypair> {
    public static final A5G A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        String strA8f2 = null;
        String strA8f3 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new JsonKeypair(i, strA8f, strA8f3, strA8f2);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA8f3 = c9j4A55.A8f(c9iZ, 1);
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
        A5G a5g = new A5G();
        A00 = a5g;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.pushlite.hpke.JsonKeypair", a5g, 3);
        c9iKA1C.A08("keyAlias", false);
        c9iKA1C.A08("pubKey", false);
        c9iKA1C.A08("privKey", false);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, c07779iq};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        JsonKeypair jsonKeypair = (JsonKeypair) obj;
        boolean zA1a = AnonymousClass002.A1a(interfaceC07789is, jsonKeypair);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        c9j5A56.AAV(jsonKeypair.A00, c9iZ, 0);
        c9j5A56.AAV(jsonKeypair.A02, c9iZ, zA1a ? 1 : 0);
        c9j5A56.AAV(jsonKeypair.A01, c9iZ, 2);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
