package com.facebook.aura.status.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j1;
import X.C9j4;
import X.C9j5;
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.wearablebroadcast.MetaAiAppBroadcastSender;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class ActivityDetailResponseJson$$serializer implements C9cd<ActivityDetailResponseJson> {
    public static final ActivityDetailResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ActivityDetailResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = ActivityDetailResponseJson.$childSerializers;
        String strA8f = null;
        Long lA0Q = null;
        String strA0w = null;
        String strA0w2 = null;
        ActivityDetailNoteJson activityDetailNoteJson = null;
        List list = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ActivityDetailResponseJson(i, strA8f, lA0Q, strA0w, strA0w2, activityDetailNoteJson, list, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    lA0Q = C3cI.A0Q(c9iZ, c9j4A55, 1);
                    i |= 2;
                    break;
                case 2:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 2);
                    i |= 4;
                    break;
                case 3:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 3);
                    i |= 8;
                    break;
                case 4:
                    activityDetailNoteJson = (ActivityDetailNoteJson) c9j4A55.A8Z(ActivityDetailNoteJson$$serializer.INSTANCE, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) C3cJ.A0G(c9iZ, c9j4A55, f0cArr, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ActivityDetailResponseJson$$serializer activityDetailResponseJson$$serializer = new ActivityDetailResponseJson$$serializer();
        INSTANCE = activityDetailResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.status.repo.ActivityDetailResponseJson", activityDetailResponseJson$$serializer, 6);
        c9iKA1C.A08("hash", true);
        c9iKA1C.A08("ts_ms", true);
        c9iKA1C.A08("subject", true);
        c9iKA1C.A08(MetaAiAppBroadcastSender.EXTRA_BODY, true);
        c9iKA1C.A08("note", true);
        c9iKA1C.A08("files", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = ActivityDetailResponseJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, AbstractC07749im.A00(C9j1.A00), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(ActivityDetailNoteJson$$serializer.INSTANCE), C3cH.A14(f0cArr, 5)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ActivityDetailResponseJson activityDetailResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, activityDetailResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ActivityDetailResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_status_repo_repo(activityDetailResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
