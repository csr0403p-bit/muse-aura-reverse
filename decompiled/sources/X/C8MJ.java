package X;

import com.whatsapp.accountlinking.ipc.api.models.Operation;
import com.whatsapp.accountlinking.ipc.api.models.WaAcIpcRequest;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.8MJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8MJ implements C9cd<WaAcIpcRequest> {
    public static final C8MJ A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = WaAcIpcRequest.$childSerializers;
        String strA8f = null;
        String strA0w = null;
        C9oJ c9oJ = null;
        Operation operation = null;
        String strA0w2 = null;
        String strA0w3 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new WaAcIpcRequest(i, strA8f, strA0w, c9oJ, operation, strA0w2, strA0w3, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 1);
                    i |= 2;
                    break;
                case 2:
                    c9oJ = (C9oJ) c9j4A55.A8Z(C9oI.A00, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    operation = (Operation) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 3);
                    i |= 8;
                    break;
                case 4:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    strA0w3 = C3cI.A0w(c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        C8MJ c8mj = new C8MJ();
        A00 = c8mj;
        C9iK c9iKA1C = C3cG.A1C("WaAcIpcRequest", c8mj, 6);
        c9iKA1C.A08("caller_identity", false);
        c9iKA1C.A08("linked_op_nonce", false);
        c9iKA1C.A08("linked_op_nonce_source_app", false);
        c9iKA1C.A08("operation", false);
        c9iKA1C.A08("source_app_pkg_name", true);
        c9iKA1C.A08("request_id", true);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = WaAcIpcRequest.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(C9oI.A00), C3cH.A12(f0cArr), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq)};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        WaAcIpcRequest waAcIpcRequest = (WaAcIpcRequest) obj;
        AnonymousClass003.A0u(interfaceC07789is, waAcIpcRequest);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        WaAcIpcRequest.write$Self$java_com_whatsapp_accountlinking_ipc_api_api(waAcIpcRequest, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
