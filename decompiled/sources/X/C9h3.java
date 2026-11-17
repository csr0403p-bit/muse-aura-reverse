package X;

import com.whatsapp.accountlinking.ipc.api.models.ServiceState;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9h3, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9h3 implements C9cd<ServiceState> {
    public static final C9h3 A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new ServiceState(i, zA8G, null);
            }
            if (iA8N != 0) {
                throw C3cG.A17(iA8N);
            }
            zA8G = c9j4A55.A8G(c9iZ, 0);
            i = 1;
        }
    }

    static {
        C9h3 c9h3 = new C9h3();
        A00 = c9h3;
        C9iK c9iKA1C = C3cG.A1C("ServiceState", c9h3, 1);
        c9iKA1C.A08("enabled", false);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{C07839ix.A00};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        ServiceState serviceState = (ServiceState) obj;
        AnonymousClass003.A0u(interfaceC07789is, serviceState);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        c9j5A56.AA7(c9iZ, 0, serviceState.enabled);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
