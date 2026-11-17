package com.facebook.aura.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C5hV;
import X.C60O;
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
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class HatchWidgetPresentation$$serializer implements C9cd<HatchWidgetPresentation> {
    public static final int $stable = 0;
    public static final HatchWidgetPresentation$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final HatchWidgetPresentation deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = HatchWidgetPresentation.$childSerializers;
        String strA8f = null;
        String strA0v = null;
        List list = null;
        String strA0g = null;
        Long l = null;
        Long l2 = null;
        String strA0g2 = null;
        String strA0k = null;
        HatchPresentationData hatchPresentationData = null;
        String strA0h = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new HatchWidgetPresentation(i, strA8f, strA0h, hatchPresentationData, strA0k, strA0g2, l, l2, strA0g, list, strA0v, null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    hatchPresentationData = (HatchPresentationData) c9j4A55.A8a(HatchPresentationDataSerializer.INSTANCE, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    strA0k = C3cI.A0k(c9iZ, c9j4A55);
                    i |= 8;
                    break;
                case 4:
                    strA0g2 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    l = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    l2 = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 7);
                    i |= 128;
                    break;
                case 8:
                    list = (List) C3cJ.A0G(c9iZ, c9j4A55, f0cArr, 8);
                    i |= 256;
                    break;
                case 9:
                    strA0v = C3cI.A0v(c9iZ, c9j4A55, 9);
                    i |= 512;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        HatchWidgetPresentation$$serializer hatchWidgetPresentation$$serializer = new HatchWidgetPresentation$$serializer();
        INSTANCE = hatchWidgetPresentation$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.HatchWidgetPresentation", hatchWidgetPresentation$$serializer, 10);
        C60O.A1S("presentationId", c9iKA1C, false);
        c9iKA1C.A08("data", false);
        c9iKA1C.A08("displayText", true);
        c9iKA1C.A08("hostMessageId", false);
        c9iKA1C.A08(AgeCheckFunnelLogging.KEY_SEQ, false);
        c9iKA1C.A08("chatEventSeq", false);
        c9iKA1C.A08("presentationEventId", true);
        c9iKA1C.A08("supportedClients", true);
        c9iKA1C.A08("fallbackText", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = HatchWidgetPresentation.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        HatchPresentationDataSerializer hatchPresentationDataSerializer = HatchPresentationDataSerializer.INSTANCE;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C9j1 c9j1 = C9j1.A00;
        return new C9hr[]{c07779iq, c07779iq, hatchPresentationDataSerializer, c9hrA00, c9hrA002, AbstractC07749im.A00(c9j1), AbstractC07749im.A00(c9j1), AbstractC07749im.A00(c07779iq), C3cH.A14(f0cArr, 8), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, HatchWidgetPresentation hatchWidgetPresentation) {
        AnonymousClass003.A0u(interfaceC07789is, hatchWidgetPresentation);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        HatchWidgetPresentation.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(hatchWidgetPresentation, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
