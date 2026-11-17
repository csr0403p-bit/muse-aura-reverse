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
public final /* synthetic */ class SkillAlreadyConnectedOrDisconnectedSheetKey$$serializer implements C9cd<SkillAlreadyConnectedOrDisconnectedSheetKey> {
    public static final SkillAlreadyConnectedOrDisconnectedSheetKey$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final SkillAlreadyConnectedOrDisconnectedSheetKey deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = SkillAlreadyConnectedOrDisconnectedSheetKey.$childSerializers;
        String strA8f = null;
        HatchSkillDetailScreenKey hatchSkillDetailScreenKey = null;
        HatchSkillOAuthOrigin hatchSkillOAuthOrigin = null;
        String strA0w = null;
        int i = 0;
        boolean zA8G = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new SkillAlreadyConnectedOrDisconnectedSheetKey(i, strA8f, zA8G, hatchSkillDetailScreenKey, hatchSkillOAuthOrigin, strA0w, (C2hx) null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                zA8G = c9j4A55.A8G(c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                hatchSkillDetailScreenKey = (HatchSkillDetailScreenKey) c9j4A55.A8Z(HatchSkillDetailScreenKey$$serializer.INSTANCE, c9iZ, 2);
                i |= 4;
            } else if (iA8N == 3) {
                hatchSkillOAuthOrigin = (HatchSkillOAuthOrigin) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 3);
                i |= 8;
            } else {
                if (iA8N != 4) {
                    throw C3cG.A17(iA8N);
                }
                strA0w = C3cI.A0w(c9iZ, c9j4A55, 4);
                i |= 16;
            }
        }
    }

    static {
        SkillAlreadyConnectedOrDisconnectedSheetKey$$serializer skillAlreadyConnectedOrDisconnectedSheetKey$$serializer = new SkillAlreadyConnectedOrDisconnectedSheetKey$$serializer();
        INSTANCE = skillAlreadyConnectedOrDisconnectedSheetKey$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.navigation.key.SkillAlreadyConnectedOrDisconnectedSheetKey", skillAlreadyConnectedOrDisconnectedSheetKey$$serializer, 5);
        c9iKA1C.A08("identifier", false);
        c9iKA1C.A08("isConnectFlow", false);
        C60Q.A1O("sourceSkillKey", c9iKA1C, true);
        c9iKA1C.A08("sourceSessionId", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = SkillAlreadyConnectedOrDisconnectedSheetKey.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, C07839ix.A00, AbstractC07749im.A00(HatchSkillDetailScreenKey$$serializer.INSTANCE), C3cH.A12(f0cArr), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, SkillAlreadyConnectedOrDisconnectedSheetKey skillAlreadyConnectedOrDisconnectedSheetKey) {
        AnonymousClass003.A0u(interfaceC07789is, skillAlreadyConnectedOrDisconnectedSheetKey);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        SkillAlreadyConnectedOrDisconnectedSheetKey.write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(skillAlreadyConnectedOrDisconnectedSheetKey, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
