package com.facebook.aura.shopping.model;

import X.AnonymousClass003;
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
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class PdpAction$$serializer implements C9cd<PdpAction> {
    public static final int $stable = 0;
    public static final PdpAction$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final PdpAction deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = PdpAction.$childSerializers;
        PdpActionIntent pdpActionIntent = null;
        String strA0v = null;
        PdpActionStyle pdpActionStyle = null;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new PdpAction(i, pdpActionIntent, strA0v, pdpActionStyle, zA8G, (C2hx) null);
            }
            if (iA8N == 0) {
                pdpActionIntent = (PdpActionIntent) c9j4A55.A8a(PdpActionIntentSerializer.INSTANCE, c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 1);
                i |= 2;
            } else if (iA8N == 2) {
                pdpActionStyle = (PdpActionStyle) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                zA8G = c9j4A55.A8G(c9iZ, 3);
                i |= 8;
            }
        }
    }

    static {
        PdpAction$$serializer pdpAction$$serializer = new PdpAction$$serializer();
        INSTANCE = pdpAction$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.shopping.model.PdpAction", pdpAction$$serializer, 4);
        C3cI.A1P("intent", c9iKA1C, false);
        c9iKA1C.A08("style", false);
        c9iKA1C.A08("followsProductWebsite", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{PdpActionIntentSerializer.INSTANCE, C3cG.A15(), C3cH.A11(PdpAction.$childSerializers), C07839ix.A00};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, PdpAction pdpAction) {
        AnonymousClass003.A0u(interfaceC07789is, pdpAction);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        PdpAction.write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(pdpAction, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
