package com.facebook.aura.status.repo;

import X.AnonymousClass003;
import X.C07729ii;
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
import com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class ActivityDayResponseJson$$serializer implements C9cd<ActivityDayResponseJson> {
    public static final ActivityDayResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ActivityDayResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = ActivityDayResponseJson.$childSerializers;
        String strA8f = null;
        List list = null;
        int i = 0;
        int iA8U = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new ActivityDayResponseJson(i, strA8f, iA8U, list, (C2hx) null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                iA8U = c9j4A55.A8U(c9iZ, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                list = (List) c9j4A55.A8a(f0cArr[2].getValue(), c9iZ, 2);
                i |= 4;
            }
        }
    }

    static {
        ActivityDayResponseJson$$serializer activityDayResponseJson$$serializer = new ActivityDayResponseJson$$serializer();
        INSTANCE = activityDayResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.status.repo.ActivityDayResponseJson", activityDayResponseJson$$serializer, 3);
        c9iKA1C.A08("date", true);
        c9iKA1C.A08(AuraMetaFRLSecureTokenStore.JSON_KEY_COUNT, true);
        c9iKA1C.A08("activities", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{C07779iq.A01, C07729ii.A00, C3cH.A11(ActivityDayResponseJson.$childSerializers)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ActivityDayResponseJson activityDayResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, activityDayResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ActivityDayResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_status_repo_repo(activityDayResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
