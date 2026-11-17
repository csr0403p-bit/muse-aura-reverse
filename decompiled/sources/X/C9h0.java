package X;

import com.facebook.oxygen.sdk.app.installapi.sdk.keepalive.KeepAliveParameters;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9h0, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9h0 implements C9cd<KeepAliveParameters> {
    public static final C9h0 A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        Boolean boolA0L = null;
        String strA0v = null;
        Long lA0P = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new KeepAliveParameters(boolA0L, lA0P, strA0v, i);
            }
            if (iA8N == 0) {
                boolA0L = C3cI.A0L(c9iZ, c9j4A55, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                lA0P = C3cI.A0P(c9iZ, c9j4A55, 2);
                i |= 4;
            }
        }
    }

    static {
        C9h0 c9h0 = new C9h0();
        A00 = c9h0;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.oxygen.sdk.app.installapi.sdk.keepalive.KeepAliveParameters", c9h0, 3);
        c9iKA1C.A08("enabled", true);
        c9iKA1C.A08("priority", true);
        c9iKA1C.A08("max_hold_minutes", true);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cG.A1b(C9j1.A00, AbstractC07749im.A00(C07839ix.A00), C3cG.A15());
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        KeepAliveParameters keepAliveParameters = (KeepAliveParameters) obj;
        boolean zA1a = AnonymousClass002.A1a(interfaceC07789is, keepAliveParameters);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        boolean zAfR = c9j5A56.AfR();
        if (zAfR || keepAliveParameters.A00 != null) {
            c9j5A56.AAP(keepAliveParameters.A00, C07839ix.A00, c9iZ, 0);
        }
        if (zAfR || keepAliveParameters.A02 != null) {
            c9j5A56.AAP(keepAliveParameters.A02, C07779iq.A01, c9iZ, zA1a ? 1 : 0);
        }
        if (zAfR || keepAliveParameters.A01 != null) {
            c9j5A56.AAP(keepAliveParameters.A01, C9j1.A00, c9iZ, 2);
        }
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
