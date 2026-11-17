package X;

import com.whatsapp.accountlinking.ipc.api.models.ErrorSubCode;
import com.whatsapp.accountlinking.ipc.api.models.ResponseCode;
import com.whatsapp.accountlinking.ipc.api.models.linked.ExecuteCrosspostOperationResultError;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9ob, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C07879ob implements C9cd<ExecuteCrosspostOperationResultError> {
    public static final C07879ob A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = ExecuteCrosspostOperationResultError.$childSerializers;
        ResponseCode responseCode = null;
        C9oU c9oU = null;
        ErrorSubCode errorSubCode = null;
        ErrorSubCode errorSubCode2 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new ExecuteCrosspostOperationResultError(i, responseCode, c9oU, errorSubCode, errorSubCode2, null);
            }
            if (iA8N == 0) {
                responseCode = (ResponseCode) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 0);
                i |= 1;
            } else if (iA8N == 1) {
                c9oU = (C9oU) c9j4A55.A8a(C9oT.A00, c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                errorSubCode = (ErrorSubCode) c9j4A55.A8Z(C9ij.A00, c9iZ, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                errorSubCode2 = (ErrorSubCode) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 3);
                i |= 8;
            }
        }
    }

    static {
        C07879ob c07879ob = new C07879ob();
        A00 = c07879ob;
        C9iK c9iKA1C = C3cG.A1C("ExecuteCrosspostOperationResultError", c07879ob, 4);
        boolean zA07 = C9iK.A07(c9iKA1C);
        c9iKA1C.A08("error_code", zA07);
        c9iKA1C.A08("error_sub_code", true);
        c9iKA1C.A08("error", zA07);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = ExecuteCrosspostOperationResultError.$childSerializers;
        return new C9hr[]{C3cH.A0z(f0cArr), C9oT.A00, AbstractC07749im.A00(C9ij.A00), C3cH.A12(f0cArr)};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        ExecuteCrosspostOperationResultError executeCrosspostOperationResultError = (ExecuteCrosspostOperationResultError) obj;
        AnonymousClass003.A0u(interfaceC07789is, executeCrosspostOperationResultError);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ExecuteCrosspostOperationResultError.write$Self(executeCrosspostOperationResultError, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
