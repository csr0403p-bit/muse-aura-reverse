package com.facebook.aura.confidentialvm.repository;

import X.AnonymousClass003;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C5hV;
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
import com.facebook.aura.activation.model.HatchReTosViewModelKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class PinMutationResultJson$$serializer implements C9cd<PinMutationResultJson> {
    public static final PinMutationResultJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final PinMutationResultJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        C2hx c2hx = null;
        PinStateJson pinStateJson = null;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new PinMutationResultJson(i, zA8G, pinStateJson, c2hx);
            }
            if (iA8N == 0) {
                zA8G = c9j4A55.A8G(c9iZ, 0);
                i |= 1;
            } else {
                if (iA8N != 1) {
                    throw C3cG.A17(iA8N);
                }
                pinStateJson = (PinStateJson) c9j4A55.A8Z(PinStateJson$$serializer.INSTANCE, c9iZ, 1);
                i |= 2;
            }
        }
    }

    static {
        PinMutationResultJson$$serializer pinMutationResultJson$$serializer = new PinMutationResultJson$$serializer();
        INSTANCE = pinMutationResultJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.confidentialvm.repository.PinMutationResultJson", pinMutationResultJson$$serializer, 2);
        c9iKA1C.A08(HatchReTosViewModelKt.RESULT_ACCEPTED, false);
        c9iKA1C.A08("current_pin_state", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cH.A1Z(PinStateJson$$serializer.INSTANCE, C07839ix.A00);
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
    public final void serialize(InterfaceC07789is interfaceC07789is, PinMutationResultJson pinMutationResultJson) {
        AnonymousClass003.A0u(interfaceC07789is, pinMutationResultJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        PinMutationResultJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_repository_repository(pinMutationResultJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
