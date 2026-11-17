package com.facebook.aura.status.repo;

import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C5hV;
import X.C60O;
import X.C60P;
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
/* loaded from: classes3.dex */
public final /* synthetic */ class ActivityGoalJson$$serializer implements C9cd<ActivityGoalJson> {
    public static final ActivityGoalJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ActivityGoalJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new ActivityGoalJson(i, strA8f, str, str2, str3, (C2hx) null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                str = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                str2 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                str3 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 3);
                i |= 8;
            }
        }
    }

    static {
        ActivityGoalJson$$serializer activityGoalJson$$serializer = new ActivityGoalJson$$serializer();
        INSTANCE = activityGoalJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.status.repo.ActivityGoalJson", activityGoalJson$$serializer, 4);
        C60O.A1T("id", c9iKA1C, true);
        C60O.A1W(c9iKA1C, true);
        c9iKA1C.A08("icon", true);
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
        return C60P.A1b();
    }

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, ActivityGoalJson activityGoalJson) {
        AnonymousClass003.A0u(interfaceC07789is, activityGoalJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ActivityGoalJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_status_repo_repo(activityGoalJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
