package X;

import com.whatsapp.accountlinking.ipc.api.models.ContextualPauseObservation;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9Pw, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9Pw implements C9cd<ContextualPauseObservation> {
    public static final C9Pw A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        String strA8f2 = null;
        int iA8U = 0;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new ContextualPauseObservation(i, strA8f, strA8f2, zA8G, iA8U, (C2hx) null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA8f2 = c9j4A55.A8f(c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                zA8G = c9j4A55.A8G(c9iZ, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                iA8U = c9j4A55.A8U(c9iZ, 3);
                i |= 8;
            }
        }
    }

    static {
        C9Pw c9Pw = new C9Pw();
        A00 = c9Pw;
        C9iK c9iKA1C = C3cG.A1C("com.whatsapp.accountlinking.ipc.api.models.ContextualPauseObservation", c9Pw, 4);
        c9iKA1C.A08("observation_id", false);
        c9iKA1C.A08("entry_point", false);
        c9iKA1C.A08("is_entry_point_visible", false);
        c9iKA1C.A08("version", true);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, C07839ix.A00, C07729ii.A00};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        ContextualPauseObservation contextualPauseObservation = (ContextualPauseObservation) obj;
        AnonymousClass003.A0u(interfaceC07789is, contextualPauseObservation);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ContextualPauseObservation.write$Self$java_com_whatsapp_accountlinking_ipc_api_api(contextualPauseObservation, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
