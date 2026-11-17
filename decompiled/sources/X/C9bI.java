package X;

import com.whatsapp.accountlinking.ipc.api.models.GetEncryptedProfileInfoOperation;
import com.whatsapp.accountlinking.ipc.api.models.UseCase;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9bI, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9bI implements C9cd<GetEncryptedProfileInfoOperation> {
    public static final C9bI A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = GetEncryptedProfileInfoOperation.$childSerializers;
        UseCase useCase = null;
        String strA0w = null;
        Boolean boolA0M = null;
        int iA8U = 0;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new GetEncryptedProfileInfoOperation(i, useCase, iA8U, zA8G, strA0w, boolA0M, (C2hx) null);
            }
            if (iA8N == 0) {
                useCase = (UseCase) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 0);
                i |= 1;
            } else if (iA8N == 1) {
                iA8U = c9j4A55.A8U(c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                zA8G = c9j4A55.A8G(c9iZ, 2);
                i |= 4;
            } else if (iA8N == 3) {
                strA0w = C3cI.A0w(c9iZ, c9j4A55, 3);
                i |= 8;
            } else {
                if (iA8N != 4) {
                    throw C3cG.A17(iA8N);
                }
                boolA0M = C3cI.A0M(c9iZ, c9j4A55, 4);
                i |= 16;
            }
        }
    }

    static {
        C9bI c9bI = new C9bI();
        A00 = c9bI;
        C9iK c9iKA1C = C3cG.A1C("GetEncryptedProfileInfoOperation", c9bI, 5);
        c9iKA1C.A08("use_case", false);
        c9iKA1C.A08("version", true);
        c9iKA1C.A08("disable_cache", true);
        c9iKA1C.A08("entry_point", true);
        c9iKA1C.A08("fetch_fresh_token", true);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C9hr c9hrA0z = C3cH.A0z(GetEncryptedProfileInfoOperation.$childSerializers);
        C07729ii c07729ii = C07729ii.A00;
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c9hrA0z, c07729ii, c07839ix, C3cG.A15(), AbstractC07749im.A00(c07839ix)};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        GetEncryptedProfileInfoOperation getEncryptedProfileInfoOperation = (GetEncryptedProfileInfoOperation) obj;
        AnonymousClass003.A0u(interfaceC07789is, getEncryptedProfileInfoOperation);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        GetEncryptedProfileInfoOperation.write$Self$java_com_whatsapp_accountlinking_ipc_api_api(getEncryptedProfileInfoOperation, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
