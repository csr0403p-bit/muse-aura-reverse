package X;

import com.whatsapp.accountlinking.ipc.api.models.GetRegisteredPhoneNumberOperationResultSuccess;
import com.whatsapp.accountlinking.ipc.api.models.ResponseCode;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9pP, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9pP implements C9cd<GetRegisteredPhoneNumberOperationResultSuccess> {
    public static final C9pP A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = GetRegisteredPhoneNumberOperationResultSuccess.$childSerializers;
        ResponseCode responseCode = null;
        String strA8f = null;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new GetRegisteredPhoneNumberOperationResultSuccess(i, responseCode, strA8f, zA8G, null);
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
                zA8G = c9j4A55.A8G(c9iZ, 2);
                i |= 4;
            }
        }
    }

    static {
        C9pP c9pP = new C9pP();
        A00 = c9pP;
        C9iK c9iKA1C = C3cG.A1C("GetRegisteredPhoneNumberOperationResultSuccess", c9pP, 3);
        c9iKA1C.A08("phone_number", C9iK.A07(c9iKA1C));
        c9iKA1C.A08("is_switcher_acquisition_enabled", true);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{C3cH.A0z(GetRegisteredPhoneNumberOperationResultSuccess.$childSerializers), C07779iq.A01, C07839ix.A00};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        GetRegisteredPhoneNumberOperationResultSuccess getRegisteredPhoneNumberOperationResultSuccess = (GetRegisteredPhoneNumberOperationResultSuccess) obj;
        AnonymousClass003.A0u(interfaceC07789is, getRegisteredPhoneNumberOperationResultSuccess);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        GetRegisteredPhoneNumberOperationResultSuccess.write$Self$java_com_whatsapp_accountlinking_ipc_api_api(getRegisteredPhoneNumberOperationResultSuccess, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
