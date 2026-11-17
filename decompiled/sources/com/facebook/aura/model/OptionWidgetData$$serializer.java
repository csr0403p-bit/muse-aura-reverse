package com.facebook.aura.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
public final /* synthetic */ class OptionWidgetData$$serializer implements C9cd<OptionWidgetData> {
    public static final int $stable = 0;
    public static final OptionWidgetData$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final OptionWidgetData deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = OptionWidgetData.$childSerializers;
        List list = null;
        String str = null;
        String str2 = null;
        OptionWidgetButtonStyle optionWidgetButtonStyle = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new OptionWidgetData(i, list, str, str2, optionWidgetButtonStyle, (C2hx) null);
            }
            if (iA8N == 0) {
                list = (List) c9j4A55.A8a(f0cArr[0].getValue(), c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                str = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                str2 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                optionWidgetButtonStyle = (OptionWidgetButtonStyle) c9j4A55.A8a(f0cArr[3].getValue(), c9iZ, 3);
                i |= 8;
            }
        }
    }

    static {
        OptionWidgetData$$serializer optionWidgetData$$serializer = new OptionWidgetData$$serializer();
        INSTANCE = optionWidgetData$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.OptionWidgetData", optionWidgetData$$serializer, 4);
        c9iKA1C.A08("options", false);
        c9iKA1C.A08("customInputPlaceholder", true);
        c9iKA1C.A08("composerHint", true);
        c9iKA1C.A08("buttonStyle", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = OptionWidgetData.$childSerializers;
        C9hr c9hrA0z = C3cH.A0z(f0cArr);
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c9hrA0z, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cH.A12(f0cArr)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, OptionWidgetData optionWidgetData) {
        AnonymousClass003.A0u(interfaceC07789is, optionWidgetData);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        OptionWidgetData.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(optionWidgetData, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
