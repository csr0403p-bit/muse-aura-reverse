package X;

import com.whatsapp.accountlinking.ipc.api.models.ContextualPauseObservation;
import com.whatsapp.accountlinking.ipc.api.models.GetFeatureEligibilityOperation;
import com.whatsapp.accountlinking.ipc.api.models.IpcFeature;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9Pz, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9Pz implements C9cd<GetFeatureEligibilityOperation> {
    public static final C9Pz A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = GetFeatureEligibilityOperation.$childSerializers;
        Boolean boolA0M = null;
        IpcFeature ipcFeature = null;
        ContextualPauseObservation contextualPauseObservation = null;
        Boolean boolA0M2 = null;
        Boolean boolA0M3 = null;
        int iA8U = 0;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new GetFeatureEligibilityOperation(i, ipcFeature, contextualPauseObservation, iA8U, boolA0M2, boolA0M3, boolA0M, (C2hx) null);
                case 0:
                    ipcFeature = (IpcFeature) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 0);
                    i |= 1;
                    break;
                case 1:
                    contextualPauseObservation = (ContextualPauseObservation) c9j4A55.A8Z(C9Pw.A00, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    iA8U = c9j4A55.A8U(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    boolA0M2 = C3cI.A0M(c9iZ, c9j4A55, 3);
                    i |= 8;
                    break;
                case 4:
                    boolA0M3 = C3cI.A0M(c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    boolA0M = C3cI.A0M(c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        C9Pz c9Pz = new C9Pz();
        A00 = c9Pz;
        C9iK c9iKA1C = C3cG.A1C("GetFeatureEligibilityOperation", c9Pz, 6);
        c9iKA1C.A08("feature", false);
        C9iK.A04("contextual_pause_observation", c9iKA1C, true);
        c9iKA1C.A08("contextual_unpause_check", true);
        c9iKA1C.A08("without_exposure", true);
        c9iKA1C.A08("contextual_link_steal_check", true);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C9hr c9hrA0z = C3cH.A0z(GetFeatureEligibilityOperation.$childSerializers);
        C9hr c9hrA00 = AbstractC07749im.A00(C9Pw.A00);
        C07729ii c07729ii = C07729ii.A00;
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c9hrA0z, c9hrA00, c07729ii, AbstractC07749im.A00(c07839ix), AbstractC07749im.A00(c07839ix), AbstractC07749im.A00(c07839ix)};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        GetFeatureEligibilityOperation getFeatureEligibilityOperation = (GetFeatureEligibilityOperation) obj;
        AnonymousClass003.A0u(interfaceC07789is, getFeatureEligibilityOperation);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        GetFeatureEligibilityOperation.write$Self$java_com_whatsapp_accountlinking_ipc_api_api(getFeatureEligibilityOperation, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
