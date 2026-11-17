package X;

import com.whatsapp.accountlinking.ipc.api.models.ErrorSubCode;
import com.whatsapp.accountlinking.ipc.api.models.OperationResultError;
import com.whatsapp.accountlinking.ipc.api.models.ResponseCode;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9od, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C07889od implements C9cd<OperationResultError> {
    public static final C07889od A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = OperationResultError.$childSerializers;
        ResponseCode responseCode = null;
        C9oU c9oU = null;
        ErrorSubCode errorSubCode = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new OperationResultError(i, responseCode, c9oU, errorSubCode, null);
            }
            if (iA8N == 0) {
                responseCode = (ResponseCode) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 0);
                i |= 1;
            } else if (iA8N == 1) {
                c9oU = (C9oU) c9j4A55.A8a(C9oT.A00, c9iZ, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                errorSubCode = (ErrorSubCode) c9j4A55.A8Z(C9ij.A00, c9iZ, 2);
                i |= 4;
            }
        }
    }

    static {
        C07889od c07889od = new C07889od();
        A00 = c07889od;
        C9iK c9iKA1C = C3cG.A1C("OperationResultError", c07889od, 3);
        c9iKA1C.A08("error_code", C9iK.A07(c9iKA1C));
        c9iKA1C.A08("error_sub_code", true);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cG.A1b(C9ij.A00, C3cH.A0z(OperationResultError.$childSerializers), C9oT.A00);
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        OperationResultError operationResultError = (OperationResultError) obj;
        AnonymousClass003.A0u(interfaceC07789is, operationResultError);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        OperationResultError.write$Self(operationResultError, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
