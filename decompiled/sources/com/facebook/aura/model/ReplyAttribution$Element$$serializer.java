package com.facebook.aura.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
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
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.model.ReplyAttribution;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class ReplyAttribution$Element$$serializer implements C9cd<ReplyAttribution.Element> {
    public static final int $stable = 0;
    public static final ReplyAttribution$Element$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ReplyAttribution.Element deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        ReplyAttribution.Presentation presentation = null;
        ReplyElementReference replyElementReference = null;
        String strA0h = null;
        String strA0w = null;
        String strA0w2 = null;
        String strA0w3 = null;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ReplyAttribution.Element(i, replyElementReference, strA0h, strA0w, strA0w2, strA0w3, zA8G, presentation, (C2hx) null);
                case 0:
                    replyElementReference = (ReplyElementReference) c9j4A55.A8a(ReplyElementReference$$serializer.INSTANCE, c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 2);
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
                    zA8G = c9j4A55.A8G(c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    presentation = (ReplyAttribution.Presentation) c9j4A55.A8Z(ReplyAttribution$Presentation$$serializer.INSTANCE, c9iZ, 6);
                    i |= 64;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ReplyAttribution$Element$$serializer replyAttribution$Element$$serializer = new ReplyAttribution$Element$$serializer();
        INSTANCE = replyAttribution$Element$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.ReplyAttribution.Element", replyAttribution$Element$$serializer, 7);
        c9iKA1C.A08("reference", false);
        c9iKA1C.A08("elementKind", true);
        C3cH.A1G("widgetKind", c9iKA1C, true);
        c9iKA1C.A08("imageUrl", true);
        c9iKA1C.A08("isUnavailable", true);
        c9iKA1C.A08("fallback", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        ReplyElementReference$$serializer replyElementReference$$serializer = ReplyElementReference$$serializer.INSTANCE;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{replyElementReference$$serializer, c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C07839ix.A00, AbstractC07749im.A00(ReplyAttribution$Presentation$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ReplyAttribution.Element element) {
        AnonymousClass003.A0u(interfaceC07789is, element);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ReplyAttribution.Element.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(element, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
