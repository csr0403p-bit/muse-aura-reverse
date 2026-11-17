package com.facebook.aura.status.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
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
import X.C9j1;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.localbrowser.LocalBrowserNodeHandler;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class ActivityGoalActionJson$$serializer implements C9cd<ActivityGoalActionJson> {
    public static final ActivityGoalActionJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ActivityGoalActionJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String str = null;
        Boolean bool = null;
        Long l = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ActivityGoalActionJson(i, str, str7, str8, str6, str5, str4, str2, str3, l, bool, (C2hx) null);
                case 0:
                    str = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    str7 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    str8 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    str6 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    str2 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    str3 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    l = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 8);
                    i |= 256;
                    break;
                case 9:
                    bool = (Boolean) c9j4A55.A8Z(C07839ix.A00, c9iZ, 9);
                    i |= 512;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ActivityGoalActionJson$$serializer activityGoalActionJson$$serializer = new ActivityGoalActionJson$$serializer();
        INSTANCE = activityGoalActionJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.status.repo.ActivityGoalActionJson", activityGoalActionJson$$serializer, 10);
        boolean zA1Q = C3cG.A1Q(c9iKA1C);
        c9iKA1C.A08("agent_id", zA1Q);
        C3cH.A1G("icon", c9iKA1C, zA1Q);
        c9iKA1C.A08("subtitle", zA1Q);
        C3cH.A1H(LocalBrowserNodeHandler.REPORT, c9iKA1C, zA1Q);
        c9iKA1C.A08("created_at", zA1Q);
        c9iKA1C.A08("action_index", zA1Q);
        c9iKA1C.A08("has_report", zA1Q);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(C9j1.A00), AbstractC07749im.A00(C07839ix.A00)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ActivityGoalActionJson activityGoalActionJson) {
        AnonymousClass003.A0u(interfaceC07789is, activityGoalActionJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ActivityGoalActionJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_status_repo_repo(activityGoalActionJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
