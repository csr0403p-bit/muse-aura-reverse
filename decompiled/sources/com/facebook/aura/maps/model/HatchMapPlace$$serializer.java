package com.facebook.aura.maps.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
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
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class HatchMapPlace$$serializer implements C9cd<HatchMapPlace> {
    public static final int $stable = 0;
    public static final HatchMapPlace$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final HatchMapPlace deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        String strA8f2 = null;
        String strA8f3 = null;
        HatchMapCoordinate hatchMapCoordinate = null;
        String strA0w = null;
        String strA0w2 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new HatchMapPlace(i, strA8f, strA8f2, strA8f3, hatchMapCoordinate, strA0w, strA0w2, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA8f2 = c9j4A55.A8f(c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    strA8f3 = c9j4A55.A8f(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    hatchMapCoordinate = (HatchMapCoordinate) c9j4A55.A8a(HatchMapCoordinate$$serializer.INSTANCE, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        HatchMapPlace$$serializer hatchMapPlace$$serializer = new HatchMapPlace$$serializer();
        INSTANCE = hatchMapPlace$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.maps.model.HatchMapPlace", hatchMapPlace$$serializer, 6);
        boolean zA1Y = C60O.A1Y(c9iKA1C);
        C60O.A1T("placeId", c9iKA1C, zA1Y);
        c9iKA1C.A08("coordinate", zA1Y);
        c9iKA1C.A08("category", true);
        c9iKA1C.A08("photoUrl", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, HatchMapCoordinate$$serializer.INSTANCE, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, HatchMapPlace hatchMapPlace) {
        AnonymousClass003.A0u(interfaceC07789is, hatchMapPlace);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        HatchMapPlace.write$Self$fbandroid_express_aura_java_com_facebook_aura_maps_model_model(hatchMapPlace, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
