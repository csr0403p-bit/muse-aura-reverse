package com.facebook.aura.library.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
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
import com.facebook.aura.library.uicontrol.GoalUiCommandsKt;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class GoalJson$$serializer implements C9cd<GoalJson> {
    public static final GoalJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final GoalJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = GoalJson.$childSerializers;
        String strA0f = null;
        String strA0g = null;
        String strA0k = null;
        String strA0j = null;
        Long l = null;
        Integer num = null;
        String str = null;
        String strA0o = null;
        String strA0n = null;
        String strA0l = null;
        String strA0p = null;
        String strA0m = null;
        List list = null;
        String strA0t = null;
        Boolean bool = null;
        String strA8f = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new GoalJson(i, strA8f, strA0f, strA0j, strA0k, strA0l, strA0m, strA0n, strA0o, str, strA0p, num, l, list, strA0t, bool, strA0g, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0f = C3cI.A0f(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0j = C3cI.A0j(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    strA0k = C3cI.A0k(c9iZ, c9j4A55);
                    i |= 8;
                    break;
                case 4:
                    strA0l = C3cI.A0l(c9iZ, c9j4A55);
                    i |= 16;
                    break;
                case 5:
                    strA0m = C3cI.A0m(c9iZ, c9j4A55);
                    i |= 32;
                    break;
                case 6:
                    strA0n = C3cI.A0n(c9iZ, c9j4A55);
                    i |= 64;
                    break;
                case 7:
                    strA0o = C3cI.A0o(c9iZ, c9j4A55);
                    i |= 128;
                    break;
                case 8:
                    str = (String) C3cI.A0U(c9iZ, c9j4A55);
                    i |= 256;
                    break;
                case 9:
                    strA0p = C3cI.A0p(c9iZ, c9j4A55);
                    i |= 512;
                    break;
                case 10:
                    num = (Integer) c9j4A55.A8Z(C07729ii.A00, c9iZ, 10);
                    i |= 1024;
                    break;
                case 11:
                    l = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 11);
                    i |= 2048;
                    break;
                case 12:
                    list = (List) c9j4A55.A8Z(f0cArr[12].getValue(), c9iZ, 12);
                    i |= 4096;
                    break;
                case 13:
                    strA0t = C3cI.A0t(c9iZ, c9j4A55);
                    i |= 8192;
                    break;
                case 14:
                    bool = (Boolean) c9j4A55.A8Z(C07839ix.A00, c9iZ, 14);
                    i |= 16384;
                    break;
                case 15:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 15);
                    i |= 32768;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        GoalJson$$serializer goalJson$$serializer = new GoalJson$$serializer();
        INSTANCE = goalJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.library.repo.GoalJson", goalJson$$serializer, 16);
        C3cH.A1G(GoalUiCommandsKt.GOAL_ID_PARAM, c9iKA1C, true);
        c9iKA1C.A08("summary", true);
        c9iKA1C.A08("momentum", true);
        c9iKA1C.A08("momentum_status", true);
        c9iKA1C.A08(HatchWebPageParserKt.DESCRIPTION, true);
        c9iKA1C.A08("emoji", true);
        c9iKA1C.A08("image_url", true);
        c9iKA1C.A08("created_at", true);
        c9iKA1C.A08("parent_goal_id", true);
        c9iKA1C.A08("sort_order", true);
        c9iKA1C.A08("fixed_position", true);
        c9iKA1C.A08("sub_goals", true);
        c9iKA1C.A08("session_id", true);
        C3cH.A1H("is_thread", c9iKA1C, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = GoalJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(C07729ii.A00), AbstractC07749im.A00(C9j1.A00), C3cH.A14(f0cArr, 12), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(C07839ix.A00), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, GoalJson goalJson) {
        AnonymousClass003.A0u(interfaceC07789is, goalJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        GoalJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(goalJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
