package com.facebook.aura.subscription.repo;

import X.AnonymousClass003;
import X.C07729ii;
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
public final /* synthetic */ class CreditDrainResponseJson$$serializer implements C9cd<CreditDrainResponseJson> {
    public static final int $stable = 0;
    public static final CreditDrainResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final CreditDrainResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        int iA8U = 0;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new CreditDrainResponseJson(i, iA8U, (C2hx) null);
            }
            if (iA8N != 0) {
                throw C3cG.A17(iA8N);
            }
            iA8U = c9j4A55.A8U(c9iZ, 0);
            i = 1;
        }
    }

    static {
        CreditDrainResponseJson$$serializer creditDrainResponseJson$$serializer = new CreditDrainResponseJson$$serializer();
        INSTANCE = creditDrainResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.subscription.repo.CreditDrainResponseJson", creditDrainResponseJson$$serializer, 1);
        c9iKA1C.A08("wallets_drained", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{C07729ii.A00};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, CreditDrainResponseJson creditDrainResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, creditDrainResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        CreditDrainResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(creditDrainResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
