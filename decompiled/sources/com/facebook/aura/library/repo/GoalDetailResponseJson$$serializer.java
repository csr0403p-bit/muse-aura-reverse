package com.facebook.aura.library.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
import com.facebook.aura.model.ReplyAttributionSerializer;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class GoalDetailResponseJson$$serializer implements C9cd<GoalDetailResponseJson> {
    public static final GoalDetailResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final GoalDetailResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = GoalDetailResponseJson.$childSerializers;
        GoalDetailPayloadJson goalDetailPayloadJson = null;
        GoalJson goalJson = null;
        List listA0Q = null;
        List listA0Q2 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new GoalDetailResponseJson(i, goalDetailPayloadJson, goalJson, listA0Q, listA0Q2, (C2hx) null);
            }
            if (iA8N == 0) {
                goalDetailPayloadJson = (GoalDetailPayloadJson) c9j4A55.A8Z(GoalDetailPayloadJson$$serializer.INSTANCE, c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                goalJson = (GoalJson) c9j4A55.A8Z(GoalJson$$serializer.INSTANCE, c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                listA0Q2 = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 3);
                i |= 8;
            }
        }
    }

    static {
        GoalDetailResponseJson$$serializer goalDetailResponseJson$$serializer = new GoalDetailResponseJson$$serializer();
        INSTANCE = goalDetailResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.library.repo.GoalDetailResponseJson", goalDetailResponseJson$$serializer, 4);
        c9iKA1C.A08("result", true);
        c9iKA1C.A08(ReplyAttributionSerializer.TYPE_GOAL, true);
        c9iKA1C.A08("updates", true);
        c9iKA1C.A08("associations", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = GoalDetailResponseJson.$childSerializers;
        return new C9hr[]{AbstractC07749im.A00(GoalDetailPayloadJson$$serializer.INSTANCE), AbstractC07749im.A00(GoalJson$$serializer.INSTANCE), C3cH.A11(f0cArr), C3cH.A12(f0cArr)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, GoalDetailResponseJson goalDetailResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, goalDetailResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        GoalDetailResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(goalDetailResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
