package com.facebook.aura.status.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
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
import X.C9j4;
import X.C9j5;
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class ActivityNoteJson$$serializer implements C9cd<ActivityNoteJson> {
    public static final ActivityNoteJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ActivityNoteJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = ActivityNoteJson.$childSerializers;
        List list = null;
        String strA0w = null;
        String strA0w2 = null;
        String strA0w3 = null;
        Integer num = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new ActivityNoteJson(i, list, strA0w, strA0w2, strA0w3, num, (C2hx) null);
            }
            if (iA8N == 0) {
                list = (List) C3cJ.A0G(c9iZ, c9j4A55, f0cArr, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA0w = C3cI.A0w(c9iZ, c9j4A55, 1);
                i |= 2;
            } else if (iA8N == 2) {
                strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 2);
                i |= 4;
            } else if (iA8N == 3) {
                strA0w3 = C3cI.A0w(c9iZ, c9j4A55, 3);
                i |= 8;
            } else {
                if (iA8N != 4) {
                    throw C3cG.A17(iA8N);
                }
                num = (Integer) c9j4A55.A8Z(C07729ii.A00, c9iZ, 4);
                i |= 16;
            }
        }
    }

    static {
        ActivityNoteJson$$serializer activityNoteJson$$serializer = new ActivityNoteJson$$serializer();
        INSTANCE = activityNoteJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.status.repo.ActivityNoteJson", activityNoteJson$$serializer, 5);
        c9iKA1C.A08("highlights", true);
        c9iKA1C.A08("summary", true);
        C3cH.A1G("tag", c9iKA1C, true);
        c9iKA1C.A08("version", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C9hr c9hrA14 = C3cH.A14(ActivityNoteJson.$childSerializers, 0);
        C07779iq c07779iq = C07779iq.A01;
        return C3cI.A1b(C07729ii.A00, c9hrA14, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ActivityNoteJson activityNoteJson) {
        AnonymousClass003.A0u(interfaceC07789is, activityNoteJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ActivityNoteJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_status_repo_repo(activityNoteJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
