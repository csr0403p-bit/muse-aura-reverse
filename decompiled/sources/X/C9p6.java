package X;

import com.whatsapp.accountlinking.ipc.api.models.ResponseCode;
import com.whatsapp.accountlinking.ipc.api.models.linked.GetNotificationCountOperationResultSuccess;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9p6, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9p6 implements C9cd<GetNotificationCountOperationResultSuccess> {
    public static final C9p6 A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = GetNotificationCountOperationResultSuccess.$childSerializers;
        ResponseCode responseCode = null;
        int iA8U = 0;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new GetNotificationCountOperationResultSuccess(i, responseCode, iA8U, null);
            }
            if (iA8N == 0) {
                responseCode = (ResponseCode) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 0);
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
        C9p6 c9p6 = new C9p6();
        A00 = c9p6;
        C9iK c9iKA1C = C3cG.A1C("GetNotificationCountOperationResultSuccess", c9p6, 2);
        c9iKA1C.A08("notification_count", C9iK.A07(c9iKA1C));
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{C3cH.A0z(GetNotificationCountOperationResultSuccess.$childSerializers), C07729ii.A00};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        GetNotificationCountOperationResultSuccess getNotificationCountOperationResultSuccess = (GetNotificationCountOperationResultSuccess) obj;
        AnonymousClass003.A0u(interfaceC07789is, getNotificationCountOperationResultSuccess);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        GetNotificationCountOperationResultSuccess.write$Self$java_com_whatsapp_accountlinking_ipc_api_api(getNotificationCountOperationResultSuccess, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
