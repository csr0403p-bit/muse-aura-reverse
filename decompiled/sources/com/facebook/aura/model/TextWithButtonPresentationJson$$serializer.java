package com.facebook.aura.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
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
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class TextWithButtonPresentationJson$$serializer implements C9cd<TextWithButtonPresentationJson> {
    public static final int $stable = 0;
    public static final TextWithButtonPresentationJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final TextWithButtonPresentationJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = TextWithButtonPresentationJson.$childSerializers;
        TextWithButtonHeaderJson textWithButtonHeaderJson = null;
        String strA8f = null;
        String strA0w = null;
        TextWithButtonButtonJson textWithButtonButtonJson = null;
        List listA0P = null;
        int iA8U = 0;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new TextWithButtonPresentationJson(i, iA8U, strA8f, strA0w, textWithButtonButtonJson, listA0P, textWithButtonHeaderJson, (C2hx) null);
                case 0:
                    iA8U = c9j4A55.A8U(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA8f = c9j4A55.A8f(c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 2);
                    i |= 4;
                    break;
                case 3:
                    textWithButtonButtonJson = (TextWithButtonButtonJson) c9j4A55.A8Z(TextWithButtonButtonJson$$serializer.INSTANCE, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 4);
                    i |= 16;
                    break;
                case 5:
                    textWithButtonHeaderJson = (TextWithButtonHeaderJson) c9j4A55.A8Z(TextWithButtonHeaderJson$$serializer.INSTANCE, c9iZ, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        TextWithButtonPresentationJson$$serializer textWithButtonPresentationJson$$serializer = new TextWithButtonPresentationJson$$serializer();
        INSTANCE = textWithButtonPresentationJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.TextWithButtonPresentationJson", textWithButtonPresentationJson$$serializer, 6);
        C3cI.A1O("version", c9iKA1C, true);
        c9iKA1C.A08("text_format", true);
        c9iKA1C.A08(BrowserOperationCatalogKt.BUTTON, true);
        c9iKA1C.A08("secondary_buttons", true);
        c9iKA1C.A08("header", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = TextWithButtonPresentationJson.$childSerializers;
        C07729ii c07729ii = C07729ii.A00;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07729ii, c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(TextWithButtonButtonJson$$serializer.INSTANCE), C3cH.A13(f0cArr), AbstractC07749im.A00(TextWithButtonHeaderJson$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, TextWithButtonPresentationJson textWithButtonPresentationJson) {
        AnonymousClass003.A0u(interfaceC07789is, textWithButtonPresentationJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        TextWithButtonPresentationJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(textWithButtonPresentationJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
