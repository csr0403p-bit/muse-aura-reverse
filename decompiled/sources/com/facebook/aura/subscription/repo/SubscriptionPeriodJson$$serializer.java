package com.facebook.aura.subscription.repo;

import X.AnonymousClass003;
import X.C2hx;
import X.C3cG;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j1;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.widgets.WidgetComponentsKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class SubscriptionPeriodJson$$serializer implements C9cd<SubscriptionPeriodJson> {
    public static final int $stable = 0;
    public static final SubscriptionPeriodJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final SubscriptionPeriodJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        long jA8X = 0;
        long jA8X2 = 0;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new SubscriptionPeriodJson(i, jA8X2, jA8X, (C2hx) null);
            }
            if (iA8N == 0) {
                jA8X2 = c9j4A55.A8X(c9iZ, 0);
                i |= 1;
            } else {
                if (iA8N != 1) {
                    throw C3cG.A17(iA8N);
                }
                jA8X = c9j4A55.A8X(c9iZ, 1);
                i |= 2;
            }
        }
    }

    static {
        SubscriptionPeriodJson$$serializer subscriptionPeriodJson$$serializer = new SubscriptionPeriodJson$$serializer();
        INSTANCE = subscriptionPeriodJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.subscription.repo.SubscriptionPeriodJson", subscriptionPeriodJson$$serializer, 2);
        c9iKA1C.A08(WidgetComponentsKt.START_PATH, true);
        c9iKA1C.A08("end", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C9j1 c9j1 = C9j1.A00;
        return new C9hr[]{c9j1, c9j1};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, SubscriptionPeriodJson subscriptionPeriodJson) {
        AnonymousClass003.A0u(interfaceC07789is, subscriptionPeriodJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        SubscriptionPeriodJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(subscriptionPeriodJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
