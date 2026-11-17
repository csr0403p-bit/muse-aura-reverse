package com.facebook.aura.status.repo;

import X.AnonymousClass003;
import X.C07779iq;
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
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.notifications.push.AuraCvmPushReplayStore;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class ActivityListResponseJson$$serializer implements C9cd<ActivityListResponseJson> {
    public static final ActivityListResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ActivityListResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = ActivityListResponseJson.$childSerializers;
        List list = null;
        List list2 = null;
        String str = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new ActivityListResponseJson(i, list, list2, str, (C2hx) null);
            }
            if (iA8N == 0) {
                list = (List) c9j4A55.A8Z(f0cArr[0].getValue(), c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                list2 = (List) c9j4A55.A8Z(f0cArr[1].getValue(), c9iZ, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                str = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 2);
                i |= 4;
            }
        }
    }

    static {
        ActivityListResponseJson$$serializer activityListResponseJson$$serializer = new ActivityListResponseJson$$serializer();
        INSTANCE = activityListResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.status.repo.ActivityListResponseJson", activityListResponseJson$$serializer, 3);
        c9iKA1C.A08("days", true);
        c9iKA1C.A08(AuraCvmPushReplayStore.ENTRIES_KEY, true);
        c9iKA1C.A08("next_cursor", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = ActivityListResponseJson.$childSerializers;
        return C3cG.A1b(C07779iq.A01, C3cH.A14(f0cArr, 0), C3cH.A14(f0cArr, 1));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ActivityListResponseJson activityListResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, activityListResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ActivityListResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_status_repo_repo(activityListResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
