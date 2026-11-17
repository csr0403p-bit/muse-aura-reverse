package com.facebook.aura.library.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
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
public final /* synthetic */ class GoalsListPayloadJson$$serializer implements C9cd<GoalsListPayloadJson> {
    public static final GoalsListPayloadJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final GoalsListPayloadJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = GoalsListPayloadJson.$childSerializers;
        String strA0w = null;
        String strA0w2 = null;
        List listA0P = null;
        GoalsPaginationJson goalsPaginationJson = null;
        String strA0j = null;
        boolean zA8G = false;
        boolean zA8G2 = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new GoalsListPayloadJson(i, listA0P, goalsPaginationJson, strA0j, strA0w2, strA0w, zA8G2, zA8G, (C2hx) null);
                case 0:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 0);
                    i |= 1;
                    break;
                case 1:
                    goalsPaginationJson = (GoalsPaginationJson) c9j4A55.A8Z(GoalsPaginationJson$$serializer.INSTANCE, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    strA0j = C3cI.A0j(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 3);
                    i |= 8;
                    break;
                case 4:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    zA8G2 = c9j4A55.A8G(c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    zA8G = c9j4A55.A8G(c9iZ, 6);
                    i |= 64;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        GoalsListPayloadJson$$serializer goalsListPayloadJson$$serializer = new GoalsListPayloadJson$$serializer();
        INSTANCE = goalsListPayloadJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.library.repo.GoalsListPayloadJson", goalsListPayloadJson$$serializer, 7);
        c9iKA1C.A08("goals", true);
        c9iKA1C.A08("pagination", true);
        c9iKA1C.A08("next_cursor", true);
        c9iKA1C.A08("nextCursor", true);
        c9iKA1C.A08("cursor", true);
        c9iKA1C.A08("has_next_page", true);
        c9iKA1C.A08("hasNextPage", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C9hr c9hrA0z = C3cH.A0z(GoalsListPayloadJson.$childSerializers);
        C9hr c9hrA00 = AbstractC07749im.A00(GoalsPaginationJson$$serializer.INSTANCE);
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA003 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA004 = AbstractC07749im.A00(c07779iq);
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c9hrA0z, c9hrA00, c9hrA002, c9hrA003, c9hrA004, c07839ix, c07839ix};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, GoalsListPayloadJson goalsListPayloadJson) {
        AnonymousClass003.A0u(interfaceC07789is, goalsListPayloadJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        GoalsListPayloadJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(goalsListPayloadJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
