package com.facebook.aura.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class HatchWidget$$serializer implements C9cd<HatchWidget> {
    public static final int $stable = 0;
    public static final HatchWidget$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final HatchWidget deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = HatchWidget.$childSerializers;
        String strA8f = null;
        JSONState jSONState = null;
        String str = null;
        List list = null;
        String str2 = null;
        String strA8f2 = null;
        HatchWidgetData hatchWidgetData = null;
        String str3 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new HatchWidget(i, strA8f, strA8f2, hatchWidgetData, str3, str2, list, str, jSONState, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA8f2 = c9j4A55.A8f(c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    hatchWidgetData = (HatchWidgetData) c9j4A55.A8a(HatchWidgetDataSerializer.INSTANCE, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) c9j4A55.A8Z(f0cArr[5].getValue(), c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    str = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    jSONState = (JSONState) c9j4A55.A8a(JSONState$$serializer.INSTANCE, c9iZ, 7);
                    i |= 128;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        HatchWidget$$serializer hatchWidget$$serializer = new HatchWidget$$serializer();
        INSTANCE = hatchWidget$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.HatchWidget", hatchWidget$$serializer, 8);
        C60O.A1S("widgetId", c9iKA1C, false);
        c9iKA1C.A08("data", false);
        c9iKA1C.A08("displayText", true);
        c9iKA1C.A08("replyToText", true);
        c9iKA1C.A08("supportedClients", true);
        C60O.A1U("fallbackText", c9iKA1C, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = HatchWidget.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, HatchWidgetDataSerializer.INSTANCE, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cH.A14(f0cArr, 5), AbstractC07749im.A00(c07779iq), JSONState$$serializer.INSTANCE};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, HatchWidget hatchWidget) {
        AnonymousClass003.A0u(interfaceC07789is, hatchWidget);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        HatchWidget.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(hatchWidget, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
