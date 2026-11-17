package X;

import com.whatsapp.accountlinking.ipc.api.models.CreateAcUserAndRecordDisclosureOperation;
import com.whatsapp.accountlinking.ipc.api.models.UseCase;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9bC, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9bC implements C9cd<CreateAcUserAndRecordDisclosureOperation> {
    public static final C9bC A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = CreateAcUserAndRecordDisclosureOperation.$childSerializers;
        String strA8f = null;
        String strA8f2 = null;
        UseCase useCase = null;
        int iA8U = 0;
        int iA8U2 = 0;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new CreateAcUserAndRecordDisclosureOperation(i, iA8U, strA8f, iA8U2, strA8f2, useCase, (C2hx) null);
            }
            if (iA8N == 0) {
                iA8U = c9j4A55.A8U(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA8f = c9j4A55.A8f(c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                iA8U2 = c9j4A55.A8U(c9iZ, 2);
                i |= 4;
            } else if (iA8N == 3) {
                strA8f2 = c9j4A55.A8f(c9iZ, 3);
                i |= 8;
            } else {
                if (iA8N != 4) {
                    throw C3cG.A17(iA8N);
                }
                useCase = (UseCase) C3cJ.A0G(c9iZ, c9j4A55, f0cArr, 4);
                i |= 16;
            }
        }
    }

    static {
        C9bC c9bC = new C9bC();
        A00 = c9bC;
        C9iK c9iKA1C = C3cG.A1C("CreateAcUserAndRecordDisclosureOperation", c9bC, 5);
        c9iKA1C.A08("version", true);
        c9iKA1C.A08("wa_ipc_session_id", false);
        c9iKA1C.A08("disclosure_id", false);
        c9iKA1C.A08("disclosure_version", false);
        c9iKA1C.A08("use_case", true);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = CreateAcUserAndRecordDisclosureOperation.$childSerializers;
        C07729ii c07729ii = C07729ii.A00;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07729ii, c07779iq, c07729ii, c07779iq, C3cH.A14(f0cArr, 4)};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        CreateAcUserAndRecordDisclosureOperation createAcUserAndRecordDisclosureOperation = (CreateAcUserAndRecordDisclosureOperation) obj;
        AnonymousClass003.A0u(interfaceC07789is, createAcUserAndRecordDisclosureOperation);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        CreateAcUserAndRecordDisclosureOperation.write$Self$java_com_whatsapp_accountlinking_ipc_api_api(createAcUserAndRecordDisclosureOperation, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
