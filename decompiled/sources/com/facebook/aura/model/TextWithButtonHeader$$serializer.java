package com.facebook.aura.model;

import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C5hV;
import X.C60O;
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
/* loaded from: classes3.dex */
public final /* synthetic */ class TextWithButtonHeader$$serializer implements C9cd<TextWithButtonHeader> {
    public static final int $stable = 0;
    public static final TextWithButtonHeader$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final TextWithButtonHeader deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = TextWithButtonHeader.$childSerializers;
        String strA8f = null;
        String strA8f2 = null;
        TextWithButtonHeaderIcon textWithButtonHeaderIcon = null;
        TextWithButtonHeaderTypography textWithButtonHeaderTypography = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new TextWithButtonHeader(i, strA8f, strA8f2, textWithButtonHeaderIcon, textWithButtonHeaderTypography, (C2hx) null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA8f2 = c9j4A55.A8f(c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                textWithButtonHeaderIcon = (TextWithButtonHeaderIcon) C3cJ.A0G(c9iZ, c9j4A55, f0cArr, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                textWithButtonHeaderTypography = (TextWithButtonHeaderTypography) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 3);
                i |= 8;
            }
        }
    }

    static {
        TextWithButtonHeader$$serializer textWithButtonHeader$$serializer = new TextWithButtonHeader$$serializer();
        INSTANCE = textWithButtonHeader$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.TextWithButtonHeader", textWithButtonHeader$$serializer, 4);
        c9iKA1C.A08("title", false);
        C60O.A1W(c9iKA1C, false);
        c9iKA1C.A08("icon", true);
        c9iKA1C.A08("typography", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = TextWithButtonHeader.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, C3cH.A14(f0cArr, 2), C3cH.A12(f0cArr)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, TextWithButtonHeader textWithButtonHeader) {
        AnonymousClass003.A0u(interfaceC07789is, textWithButtonHeader);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        TextWithButtonHeader.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(textWithButtonHeader, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
