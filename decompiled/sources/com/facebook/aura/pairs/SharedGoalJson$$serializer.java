package com.facebook.aura.pairs;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C5hV;
import X.C60Q;
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
import com.facebook.aura.library.uicontrol.GoalUiCommandsKt;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class SharedGoalJson$$serializer implements C9cd<SharedGoalJson> {
    public static final int $stable = 0;
    public static final SharedGoalJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final SharedGoalJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = SharedGoalJson.$childSerializers;
        String strA8f = null;
        Integer numA0X = null;
        Integer numA0X2 = null;
        List listA0P = null;
        String strA0h = null;
        String strA0i = null;
        String strA0o = null;
        String strA8f2 = null;
        String strA8f3 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new SharedGoalJson(i, strA8f, strA0h, strA0i, strA0o, strA8f2, strA8f3, listA0P, numA0X2, numA0X, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0i = C3cH.A0i(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    strA0o = C60Q.A0o(c9iZ, c9j4A55);
                    i |= 8;
                    break;
                case 4:
                    strA8f2 = c9j4A55.A8f(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    strA8f3 = c9j4A55.A8f(c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 6);
                    i |= 64;
                    break;
                case 7:
                    numA0X2 = C60Q.A0X(c9iZ, c9j4A55, 7);
                    i |= 128;
                    break;
                case 8:
                    numA0X = C60Q.A0X(c9iZ, c9j4A55, 8);
                    i |= 256;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        SharedGoalJson$$serializer sharedGoalJson$$serializer = new SharedGoalJson$$serializer();
        INSTANCE = sharedGoalJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.pairs.SharedGoalJson", sharedGoalJson$$serializer, 9);
        C3cH.A1G(GoalUiCommandsKt.GOAL_ID_PARAM, c9iKA1C, true);
        c9iKA1C.A08("summary", true);
        C3cH.A1H(HatchWebPageParserKt.DESCRIPTION, c9iKA1C, true);
        c9iKA1C.A08("revision", true);
        c9iKA1C.A08("tasks", true);
        c9iKA1C.A08("total_tasks", true);
        c9iKA1C.A08("completed_tasks", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = SharedGoalJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA16 = C3cG.A16(f0cArr, 6);
        C07729ii c07729ii = C07729ii.A00;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c9hrA16, AbstractC07749im.A00(c07729ii), AbstractC07749im.A00(c07729ii)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, SharedGoalJson sharedGoalJson) {
        AnonymousClass003.A0u(interfaceC07789is, sharedGoalJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        SharedGoalJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(sharedGoalJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
