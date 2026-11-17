package X;

import com.whatsapp.accountlinking.ipc.api.models.ErrorSubCode;

/* renamed from: X.9ij, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ij implements C9hr<ErrorSubCode> {
    public static final C9ij A00 = new C9ij();
    public static final C9iZ A01 = new C9iT(C9iY.A05("ErrorSubCode", C07719ih.A00));

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        if (interfaceC07829iw.A8Y()) {
            int iA8T = interfaceC07829iw.A8T();
            for (ErrorSubCode errorSubCode : ErrorSubCode.values()) {
                if (errorSubCode.code == iA8T) {
                    return errorSubCode;
                }
            }
        }
        return null;
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        ErrorSubCode errorSubCode = (ErrorSubCode) obj;
        C7384Etj.A0Y(interfaceC07789is, 0);
        if (errorSubCode == null) {
            interfaceC07789is.AAO();
        } else {
            interfaceC07789is.AAJ(errorSubCode.code);
        }
    }
}
