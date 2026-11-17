package X;

import com.whatsapp.accountlinking.ipc.api.models.ContextualUnpauseResult;
import com.whatsapp.accountlinking.ipc.api.models.GetFeatureEligibilityResultSuccess;
import com.whatsapp.accountlinking.ipc.api.models.ResponseCode;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9pO, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9pO implements C9cd<GetFeatureEligibilityResultSuccess> {
    public static final C9pO A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = GetFeatureEligibilityResultSuccess.$childSerializers;
        ResponseCode responseCode = null;
        ContextualUnpauseResult contextualUnpauseResult = null;
        Boolean boolA0M = null;
        Boolean boolA0M2 = null;
        int i = 0;
        boolean zA8G = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new GetFeatureEligibilityResultSuccess(i, responseCode, zA8G, contextualUnpauseResult, boolA0M, boolA0M2, null);
            }
            if (iA8N == 0) {
                responseCode = (ResponseCode) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 0);
                i |= 1;
            } else if (iA8N == 1) {
                zA8G = c9j4A55.A8G(c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                contextualUnpauseResult = (ContextualUnpauseResult) C3cJ.A0G(c9iZ, c9j4A55, f0cArr, 2);
                i |= 4;
            } else if (iA8N == 3) {
                boolA0M = C3cI.A0M(c9iZ, c9j4A55, 3);
                i |= 8;
            } else {
                if (iA8N != 4) {
                    throw C3cG.A17(iA8N);
                }
                boolA0M2 = C3cI.A0M(c9iZ, c9j4A55, 4);
                i |= 16;
            }
        }
    }

    static {
        C9pO c9pO = new C9pO();
        A00 = c9pO;
        C9iK c9iKA1C = C3cG.A1C("GetFeatureEligibilityResultSuccess", c9pO, 5);
        c9iKA1C.A08("enabled", C9iK.A07(c9iKA1C));
        c9iKA1C.A08("contextual_unpause_result", true);
        c9iKA1C.A08("exposure_suppressed", true);
        c9iKA1C.A08("contextual_link_steal_eligible", true);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = GetFeatureEligibilityResultSuccess.$childSerializers;
        C9hr c9hrA0z = C3cH.A0z(f0cArr);
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c9hrA0z, c07839ix, C3cH.A14(f0cArr, 2), AbstractC07749im.A00(c07839ix), AbstractC07749im.A00(c07839ix)};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        GetFeatureEligibilityResultSuccess getFeatureEligibilityResultSuccess = (GetFeatureEligibilityResultSuccess) obj;
        AnonymousClass003.A0u(interfaceC07789is, getFeatureEligibilityResultSuccess);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        GetFeatureEligibilityResultSuccess.write$Self$java_com_whatsapp_accountlinking_ipc_api_api(getFeatureEligibilityResultSuccess, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
