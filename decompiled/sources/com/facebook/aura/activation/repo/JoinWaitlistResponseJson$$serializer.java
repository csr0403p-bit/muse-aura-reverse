package com.facebook.aura.activation.repo;

import X.AnonymousClass003;
import X.C2hx;
import X.C3cG;
import X.C3cI;
import X.C3cJ;
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
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class JoinWaitlistResponseJson$$serializer implements C9cd<JoinWaitlistResponseJson> {
    public static final JoinWaitlistResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final JoinWaitlistResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0v = null;
        String strA0v2 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new JoinWaitlistResponseJson(i, strA0v, strA0v2, (C2hx) null);
            }
            if (iA8N == 0) {
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 0);
                i |= 1;
            } else {
                if (iA8N != 1) {
                    throw C3cG.A17(iA8N);
                }
                strA0v2 = C3cI.A0v(c9iZ, c9j4A55, 1);
                i |= 2;
            }
        }
    }

    static {
        JoinWaitlistResponseJson$$serializer joinWaitlistResponseJson$$serializer = new JoinWaitlistResponseJson$$serializer();
        INSTANCE = joinWaitlistResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.activation.repo.JoinWaitlistResponseJson", joinWaitlistResponseJson$$serializer, 2);
        c9iKA1C.A08(AuraDeeplinkRouteMapper.STATUS_ROUTE, true);
        c9iKA1C.A08("eligibility_error", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9cd
    public /* bridge */ C9hr<?>[] typeParametersSerializers() {
        return C5hV.A00;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cJ.A17();
    }

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, JoinWaitlistResponseJson joinWaitlistResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, joinWaitlistResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        JoinWaitlistResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo(joinWaitlistResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
