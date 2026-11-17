package com.facebook.aura.ccv.nativeflow;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C5hV;
import X.C60Q;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.settings.SecureStorageLogging;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class HatchCredentialMutationJson$$serializer implements C9cd<HatchCredentialMutationJson> {
    public static final HatchCredentialMutationJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final HatchCredentialMutationJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        C2hx c2hx = null;
        String strA0v = null;
        HatchCheckoutErrorJson hatchCheckoutErrorJson = null;
        HatchCheckoutNextActionJson hatchCheckoutNextActionJson = null;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new HatchCredentialMutationJson(i, zA8G, strA0v, hatchCheckoutErrorJson, hatchCheckoutNextActionJson, c2hx);
            }
            if (iA8N == 0) {
                zA8G = c9j4A55.A8G(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 1);
                i |= 2;
            } else if (iA8N == 2) {
                hatchCheckoutErrorJson = (HatchCheckoutErrorJson) c9j4A55.A8Z(HatchCheckoutErrorJson$$serializer.INSTANCE, c9iZ, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                hatchCheckoutNextActionJson = (HatchCheckoutNextActionJson) c9j4A55.A8Z(HatchCheckoutNextActionJson$$serializer.INSTANCE, c9iZ, 3);
                i |= 8;
            }
        }
    }

    static {
        HatchCredentialMutationJson$$serializer hatchCredentialMutationJson$$serializer = new HatchCredentialMutationJson$$serializer();
        INSTANCE = hatchCredentialMutationJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.ccv.nativeflow.HatchCredentialMutationJson", hatchCredentialMutationJson$$serializer, 4);
        c9iKA1C.A08("success", true);
        C60Q.A1N(SecureStorageLogging.KEY_CREDENTIAL_ID, c9iKA1C, true);
        c9iKA1C.A08("next_action", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cH.A1a(HatchCheckoutNextActionJson$$serializer.INSTANCE, C07839ix.A00, C3cG.A15(), AbstractC07749im.A00(HatchCheckoutErrorJson$$serializer.INSTANCE));
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9cd
    public /* bridge */ C9hr<?>[] typeParametersSerializers() {
        return C5hV.A00;
    }

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, HatchCredentialMutationJson hatchCredentialMutationJson) {
        AnonymousClass003.A0u(interfaceC07789is, hatchCredentialMutationJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        HatchCredentialMutationJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(hatchCredentialMutationJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
