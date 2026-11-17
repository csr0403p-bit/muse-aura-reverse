package com.facebook.aura.model;

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
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class TextWithButtonPresentation$$serializer implements C9cd<TextWithButtonPresentation> {
    public static final int $stable = 0;
    public static final TextWithButtonPresentation$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final TextWithButtonPresentation deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = TextWithButtonPresentation.$childSerializers;
        TextWithButtonHeader textWithButtonHeader = null;
        List listA0Q = null;
        TextWithButtonCtaStyle textWithButtonCtaStyle = null;
        String strA0k = null;
        String strA8f = null;
        TextWithButtonTextFormat textWithButtonTextFormat = null;
        String strA0i = null;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new TextWithButtonPresentation(i, strA8f, textWithButtonTextFormat, strA0i, strA0k, textWithButtonCtaStyle, zA8G, listA0Q, textWithButtonHeader, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    textWithButtonTextFormat = (TextWithButtonTextFormat) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 1);
                    i |= 2;
                    break;
                case 2:
                    strA0i = C3cH.A0i(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    strA0k = C3cI.A0k(c9iZ, c9j4A55);
                    i |= 8;
                    break;
                case 4:
                    textWithButtonCtaStyle = (TextWithButtonCtaStyle) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 4);
                    i |= 16;
                    break;
                case 5:
                    zA8G = c9j4A55.A8G(c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 6);
                    i |= 64;
                    break;
                case 7:
                    textWithButtonHeader = (TextWithButtonHeader) c9j4A55.A8Z(TextWithButtonHeader$$serializer.INSTANCE, c9iZ, 7);
                    i |= 128;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        TextWithButtonPresentation$$serializer textWithButtonPresentation$$serializer = new TextWithButtonPresentation$$serializer();
        INSTANCE = textWithButtonPresentation$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.TextWithButtonPresentation", textWithButtonPresentation$$serializer, 8);
        c9iKA1C.A08("text", false);
        c9iKA1C.A08("textFormat", true);
        c9iKA1C.A08("buttonLabel", false);
        c9iKA1C.A08("buttonUrl", false);
        c9iKA1C.A08("buttonStyle", true);
        c9iKA1C.A08("buttonDisabled", true);
        c9iKA1C.A08("secondaryButtons", true);
        c9iKA1C.A08("header", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = TextWithButtonPresentation.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, C3cH.A10(f0cArr), c07779iq, AbstractC07749im.A00(c07779iq), C3cH.A13(f0cArr), C07839ix.A00, C3cG.A16(f0cArr, 6), AbstractC07749im.A00(TextWithButtonHeader$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, TextWithButtonPresentation textWithButtonPresentation) {
        AnonymousClass003.A0u(interfaceC07789is, textWithButtonPresentation);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        TextWithButtonPresentation.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(textWithButtonPresentation, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
