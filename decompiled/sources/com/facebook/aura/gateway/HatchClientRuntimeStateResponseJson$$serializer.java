package com.facebook.aura.gateway;

import X.AnonymousClass003;
import X.C07839ix;
import X.C3cG;
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
/* loaded from: classes3.dex */
public final /* synthetic */ class HatchClientRuntimeStateResponseJson$$serializer implements C9cd<HatchClientRuntimeStateResponseJson> {
    public static final int $stable = 0;
    public static final HatchClientRuntimeStateResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final HatchClientRuntimeStateResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new HatchClientRuntimeStateResponseJson(i, zA8G, null);
            }
            if (iA8N != 0) {
                throw C3cG.A17(iA8N);
            }
            zA8G = c9j4A55.A8G(c9iZ, 0);
            i = 1;
        }
    }

    static {
        HatchClientRuntimeStateResponseJson$$serializer hatchClientRuntimeStateResponseJson$$serializer = new HatchClientRuntimeStateResponseJson$$serializer();
        INSTANCE = hatchClientRuntimeStateResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.HatchClientRuntimeStateResponseJson", hatchClientRuntimeStateResponseJson$$serializer, 1);
        c9iKA1C.A08(HatchReTosViewModelKt.RESULT_ACCEPTED, false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{C07839ix.A00};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, HatchClientRuntimeStateResponseJson hatchClientRuntimeStateResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, hatchClientRuntimeStateResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        c9j5A56.AA7(c9iZ, 0, hatchClientRuntimeStateResponseJson.accepted);
        c9j5A56.AAd(c9iZ);
    }
}
