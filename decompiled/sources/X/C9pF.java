package X;

import com.whatsapp.accountlinking.ipc.api.models.GetEncryptedProfileInfoOperationResultSuccess;
import com.whatsapp.accountlinking.ipc.api.models.ResponseCode;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9pF, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9pF implements C9cd<GetEncryptedProfileInfoOperationResultSuccess> {
    public static final C9pF A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = GetEncryptedProfileInfoOperationResultSuccess.$childSerializers;
        ResponseCode responseCode = null;
        String strA8f = null;
        String strA0v = null;
        String strA0v2 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new GetEncryptedProfileInfoOperationResultSuccess(i, responseCode, strA8f, strA0v, strA0v2, null);
            }
            if (iA8N == 0) {
                responseCode = (ResponseCode) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA8f = c9j4A55.A8f(c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                strA0v2 = C3cI.A0v(c9iZ, c9j4A55, 3);
                i |= 8;
            }
        }
    }

    static {
        C9pF c9pF = new C9pF();
        A00 = c9pF;
        C9iK c9iKA1C = C3cG.A1C("GetEncryptedProfileInfoOperationResultSuccess", c9pF, 4);
        boolean zA07 = C9iK.A07(c9iKA1C);
        c9iKA1C.A08("wa_data_bundle", zA07);
        c9iKA1C.A08("wa_linking_authproof", zA07);
        c9iKA1C.A08("fetch_strategy", true);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C9hr c9hrA0z = C3cH.A0z(GetEncryptedProfileInfoOperationResultSuccess.$childSerializers);
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c9hrA0z, c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq)};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        GetEncryptedProfileInfoOperationResultSuccess getEncryptedProfileInfoOperationResultSuccess = (GetEncryptedProfileInfoOperationResultSuccess) obj;
        AnonymousClass003.A0u(interfaceC07789is, getEncryptedProfileInfoOperationResultSuccess);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        GetEncryptedProfileInfoOperationResultSuccess.write$Self(getEncryptedProfileInfoOperationResultSuccess, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
