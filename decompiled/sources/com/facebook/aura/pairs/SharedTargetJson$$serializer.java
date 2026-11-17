package com.facebook.aura.pairs;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C5hV;
import X.C60O;
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
import com.facebook.aura.explore.uicontrol.IdeaUiCommandsKt;
import com.facebook.aura.library.uicontrol.GoalUiCommandsKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class SharedTargetJson$$serializer implements C9cd<SharedTargetJson> {
    public static final int $stable = 0;
    public static final SharedTargetJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final SharedTargetJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        String strA0w = null;
        String strA0h = null;
        String strA8f2 = null;
        String strA0w2 = null;
        String strA0w3 = null;
        String strA0w4 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new SharedTargetJson(i, strA8f, strA0h, strA8f2, strA0w2, strA0w3, strA0w4, strA0w, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA8f2 = c9j4A55.A8f(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 3);
                    i |= 8;
                    break;
                case 4:
                    strA0w3 = C3cI.A0w(c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    strA0w4 = C3cI.A0w(c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                case 6:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 6);
                    i |= 64;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        SharedTargetJson$$serializer sharedTargetJson$$serializer = new SharedTargetJson$$serializer();
        INSTANCE = sharedTargetJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.pairs.SharedTargetJson", sharedTargetJson$$serializer, 7);
        C60O.A1S("share_id", c9iKA1C, true);
        C3cH.A1G("direction", c9iKA1C, true);
        c9iKA1C.A08(IdeaUiCommandsKt.IDEA_ID_PARAM, true);
        c9iKA1C.A08(GoalUiCommandsKt.GOAL_ID_PARAM, true);
        c9iKA1C.A08("host_muse", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, SharedTargetJson sharedTargetJson) {
        AnonymousClass003.A0u(interfaceC07789is, sharedTargetJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        SharedTargetJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(sharedTargetJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
