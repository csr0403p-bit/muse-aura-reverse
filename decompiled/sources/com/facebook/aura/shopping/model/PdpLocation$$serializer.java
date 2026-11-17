package com.facebook.aura.shopping.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07799it;
import X.C3cG;
import X.C3cI;
import X.C5hV;
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
import com.facebook.aura.gateway.service.GeofenceEventWorker;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class PdpLocation$$serializer implements C9cd<PdpLocation> {
    public static final int $stable = 0;
    public static final PdpLocation$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final PdpLocation deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        Double d = null;
        Double d2 = null;
        Double d3 = null;
        String strA0v = null;
        String strA0v2 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new PdpLocation(i, d, d2, d3, strA0v, strA0v2, null);
            }
            if (iA8N == 0) {
                d = (Double) c9j4A55.A8Z(C07799it.A00, c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                d2 = (Double) c9j4A55.A8Z(C07799it.A00, c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                d3 = (Double) c9j4A55.A8Z(C07799it.A00, c9iZ, 2);
                i |= 4;
            } else if (iA8N == 3) {
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 3);
                i |= 8;
            } else {
                if (iA8N != 4) {
                    throw C3cG.A17(iA8N);
                }
                strA0v2 = C3cI.A0v(c9iZ, c9j4A55, 4);
                i |= 16;
            }
        }
    }

    static {
        PdpLocation$$serializer pdpLocation$$serializer = new PdpLocation$$serializer();
        INSTANCE = pdpLocation$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.shopping.model.PdpLocation", pdpLocation$$serializer, 5);
        c9iKA1C.A08(GeofenceEventWorker.KEY_LATITUDE, false);
        c9iKA1C.A08(GeofenceEventWorker.KEY_LONGITUDE, false);
        c9iKA1C.A08("radiusKm", false);
        c9iKA1C.A08("locationText", false);
        c9iKA1C.A08("staticMapImageUrl", false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07799it c07799it = C07799it.A00;
        C9hr c9hrA00 = AbstractC07749im.A00(c07799it);
        C9hr c9hrA002 = AbstractC07749im.A00(c07799it);
        C9hr c9hrA003 = AbstractC07749im.A00(c07799it);
        C07779iq c07779iq = C07779iq.A01;
        return C3cI.A1b(c07779iq, c9hrA00, c9hrA002, c9hrA003, AbstractC07749im.A00(c07779iq));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, PdpLocation pdpLocation) {
        AnonymousClass003.A0u(interfaceC07789is, pdpLocation);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        PdpLocation.write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(pdpLocation, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
