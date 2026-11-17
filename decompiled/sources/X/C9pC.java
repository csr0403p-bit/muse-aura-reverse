package X;

import com.whatsapp.accountlinking.ipc.api.models.ResponseCode;
import com.whatsapp.accountlinking.ipc.api.models.linked.GetStatusAudienceDisplayStringOperationResultSuccess;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9pC, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9pC implements C9cd<GetStatusAudienceDisplayStringOperationResultSuccess> {
    public static final C9pC A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = GetStatusAudienceDisplayStringOperationResultSuccess.$childSerializers;
        ResponseCode responseCode = null;
        String strA8f = null;
        String strA0v = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new GetStatusAudienceDisplayStringOperationResultSuccess(i, responseCode, strA8f, strA0v, null);
            }
            if (iA8N == 0) {
                responseCode = (ResponseCode) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA8f = c9j4A55.A8f(c9iZ, 1);
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
        C9pC c9pC = new C9pC();
        A00 = c9pC;
        C9iK c9iKA1C = C3cG.A1C("GetStatusAudienceDisplayStringOperationResultSuccess", c9pC, 3);
        c9iKA1C.A08("display_string", C9iK.A07(c9iKA1C));
        c9iKA1C.A08("smb_authorization_request_id", true);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C9hr c9hrA0z = C3cH.A0z(GetStatusAudienceDisplayStringOperationResultSuccess.$childSerializers);
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c9hrA0z, c07779iq, AbstractC07749im.A00(c07779iq)};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        GetStatusAudienceDisplayStringOperationResultSuccess getStatusAudienceDisplayStringOperationResultSuccess = (GetStatusAudienceDisplayStringOperationResultSuccess) obj;
        AnonymousClass003.A0u(interfaceC07789is, getStatusAudienceDisplayStringOperationResultSuccess);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        GetStatusAudienceDisplayStringOperationResultSuccess.write$Self(getStatusAudienceDisplayStringOperationResultSuccess, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
