package X;

import com.whatsapp.accountlinking.ipc.api.models.OperationResult;
import com.whatsapp.accountlinking.ipc.api.models.ResponseCode;
import com.whatsapp.accountlinking.ipc.api.models.linked.NotifySeamlessLinkingCompleteOperationSuccess;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9ok, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C07919ok implements C9cd<NotifySeamlessLinkingCompleteOperationSuccess> {
    public static final C07919ok A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = NotifySeamlessLinkingCompleteOperationSuccess.$childSerializers;
        ResponseCode responseCode = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new NotifySeamlessLinkingCompleteOperationSuccess(i, responseCode, null);
            }
            if (iA8N != 0) {
                throw C3cG.A17(iA8N);
            }
            responseCode = (ResponseCode) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 0);
            i = 1;
        }
    }

    static {
        C07919ok c07919ok = new C07919ok();
        A00 = c07919ok;
        A01 = C9iK.A01("NotifySeamlessLinkingCompleteOperationSuccess", c07919ok);
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cJ.A1B(NotifySeamlessLinkingCompleteOperationSuccess.$childSerializers);
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        OperationResult operationResult = (OperationResult) obj;
        AnonymousClass003.A0u(interfaceC07789is, operationResult);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = NotifySeamlessLinkingCompleteOperationSuccess.$childSerializers;
        c9j5A56.AAQ(operationResult.responseCode, C3cH.A15(OperationResult.$childSerializers, 0), c9iZ, 0);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
