package com.facebook.aura.activation.repo;

import X.AnonymousClass003;
import X.C07729ii;
import X.C07839ix;
import X.C2hx;
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
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class DebugResetActivationResponseJson$$serializer implements C9cd<DebugResetActivationResponseJson> {
    public static final DebugResetActivationResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final DebugResetActivationResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        boolean zA8G = false;
        int iA8U = 0;
        boolean zA8G2 = false;
        boolean zA8G3 = false;
        int iA8U2 = 0;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new DebugResetActivationResponseJson(i, zA8G, iA8U2, zA8G3, iA8U, zA8G2, (C2hx) null);
            }
            if (iA8N == 0) {
                zA8G = c9j4A55.A8G(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                iA8U2 = c9j4A55.A8U(c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                zA8G3 = c9j4A55.A8G(c9iZ, 2);
                i |= 4;
            } else if (iA8N == 3) {
                iA8U = c9j4A55.A8U(c9iZ, 3);
                i |= 8;
            } else {
                if (iA8N != 4) {
                    throw C3cG.A17(iA8N);
                }
                zA8G2 = c9j4A55.A8G(c9iZ, 4);
                i |= 16;
            }
        }
    }

    static {
        DebugResetActivationResponseJson$$serializer debugResetActivationResponseJson$$serializer = new DebugResetActivationResponseJson$$serializer();
        INSTANCE = debugResetActivationResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.activation.repo.DebugResetActivationResponseJson", debugResetActivationResponseJson$$serializer, 5);
        c9iKA1C.A08("waitlist_reset", true);
        c9iKA1C.A08("redemptions_deleted", true);
        c9iKA1C.A08("consent_revoked", true);
        c9iKA1C.A08("ccv_orders_deleted", true);
        c9iKA1C.A08("wearables_link_reset", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07839ix c07839ix = C07839ix.A00;
        C07729ii c07729ii = C07729ii.A00;
        return new C9hr[]{c07839ix, c07729ii, c07839ix, c07729ii, c07839ix};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, DebugResetActivationResponseJson debugResetActivationResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, debugResetActivationResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        DebugResetActivationResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo(debugResetActivationResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
