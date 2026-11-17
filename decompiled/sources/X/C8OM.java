package X;

import com.whatsapp.accountlinking.ipc.api.models.linked.GetStatusAudienceDisplayStringOperation;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.8OM, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8OM implements C9cd<GetStatusAudienceDisplayStringOperation> {
    public static final C8OM A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0v = null;
        int iA8U = 0;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new GetStatusAudienceDisplayStringOperation(i, iA8U, zA8G, strA0v, (C2hx) null);
            }
            if (iA8N == 0) {
                iA8U = c9j4A55.A8U(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                zA8G = c9j4A55.A8G(c9iZ, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 2);
                i |= 4;
            }
        }
    }

    static {
        C8OM c8om = new C8OM();
        A00 = c8om;
        C9iK c9iKA1C = C3cG.A1C("GetStatusAudienceDisplayStringOperation", c8om, 3);
        c9iKA1C.A08("version", true);
        c9iKA1C.A08("fetch_short_form", true);
        c9iKA1C.A08("smb_authorization_request_id", true);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cG.A1b(C07779iq.A01, C07729ii.A00, C07839ix.A00);
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        GetStatusAudienceDisplayStringOperation getStatusAudienceDisplayStringOperation = (GetStatusAudienceDisplayStringOperation) obj;
        AnonymousClass003.A0u(interfaceC07789is, getStatusAudienceDisplayStringOperation);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        GetStatusAudienceDisplayStringOperation.write$Self$java_com_whatsapp_accountlinking_ipc_api_api(getStatusAudienceDisplayStringOperation, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
