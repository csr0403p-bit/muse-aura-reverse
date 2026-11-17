package X;

import com.whatsapp.accountlinking.ipc.api.models.GetRegisteredPhoneNumberOperation;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9Mx, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9Mx implements C9cd<GetRegisteredPhoneNumberOperation> {
    public static final C9Mx A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        int iA8U = 0;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new GetRegisteredPhoneNumberOperation(i, iA8U, (C2hx) null);
            }
            if (iA8N != 0) {
                throw C3cG.A17(iA8N);
            }
            iA8U = c9j4A55.A8U(c9iZ, 0);
            i = 1;
        }
    }

    static {
        C9Mx c9Mx = new C9Mx();
        A00 = c9Mx;
        C9iK c9iKA1C = C3cG.A1C("GetRegisteredPhoneNumberOperation", c9Mx, 1);
        c9iKA1C.A08("version", true);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{C07729ii.A00};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        GetRegisteredPhoneNumberOperation getRegisteredPhoneNumberOperation = (GetRegisteredPhoneNumberOperation) obj;
        AnonymousClass003.A0u(interfaceC07789is, getRegisteredPhoneNumberOperation);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        GetRegisteredPhoneNumberOperation.write$Self$java_com_whatsapp_accountlinking_ipc_api_api(getRegisteredPhoneNumberOperation, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
