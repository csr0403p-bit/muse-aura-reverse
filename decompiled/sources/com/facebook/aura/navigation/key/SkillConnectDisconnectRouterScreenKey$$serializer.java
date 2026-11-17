package com.facebook.aura.navigation.key;

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
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class SkillConnectDisconnectRouterScreenKey$$serializer implements C9cd<SkillConnectDisconnectRouterScreenKey> {
    public static final SkillConnectDisconnectRouterScreenKey$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final SkillConnectDisconnectRouterScreenKey deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = SkillConnectDisconnectRouterScreenKey.$childSerializers;
        String strA0w = null;
        String strA8f = null;
        HatchSkillDetailScreenKey hatchSkillDetailScreenKey = null;
        HatchSkillOAuthOrigin hatchSkillOAuthOrigin = null;
        boolean zA8G = false;
        int i = 0;
        boolean zA8G2 = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new SkillConnectDisconnectRouterScreenKey(i, strA8f, zA8G2, hatchSkillDetailScreenKey, hatchSkillOAuthOrigin, strA0w, zA8G, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    zA8G2 = c9j4A55.A8G(c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    hatchSkillDetailScreenKey = (HatchSkillDetailScreenKey) c9j4A55.A8Z(HatchSkillDetailScreenKey$$serializer.INSTANCE, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    hatchSkillOAuthOrigin = (HatchSkillOAuthOrigin) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 3);
                    i |= 8;
                    break;
                case 4:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    zA8G = c9j4A55.A8G(c9iZ, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        SkillConnectDisconnectRouterScreenKey$$serializer skillConnectDisconnectRouterScreenKey$$serializer = new SkillConnectDisconnectRouterScreenKey$$serializer();
        INSTANCE = skillConnectDisconnectRouterScreenKey$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.navigation.key.SkillConnectDisconnectRouterScreenKey", skillConnectDisconnectRouterScreenKey$$serializer, 6);
        c9iKA1C.A08("identifier", false);
        c9iKA1C.A08("isConnectFlow", false);
        C60Q.A1O("sourceSkillKey", c9iKA1C, true);
        c9iKA1C.A08("sourceSessionId", true);
        c9iKA1C.A08("dismissIfAlreadyInRequestedState", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = SkillConnectDisconnectRouterScreenKey.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07779iq, c07839ix, AbstractC07749im.A00(HatchSkillDetailScreenKey$$serializer.INSTANCE), C3cH.A12(f0cArr), AbstractC07749im.A00(c07779iq), c07839ix};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, SkillConnectDisconnectRouterScreenKey skillConnectDisconnectRouterScreenKey) {
        AnonymousClass003.A0u(interfaceC07789is, skillConnectDisconnectRouterScreenKey);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        SkillConnectDisconnectRouterScreenKey.write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(skillConnectDisconnectRouterScreenKey, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
