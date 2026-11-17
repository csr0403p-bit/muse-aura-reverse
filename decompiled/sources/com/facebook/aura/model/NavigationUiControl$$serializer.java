package com.facebook.aura.model;

import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
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
import com.facebook.aura.bloks.data.AuraBloksDataProps;
import com.facebook.aura.vmbrowser.runtime.BrowserSessionControllerKt;
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class NavigationUiControl$$serializer implements C9cd<NavigationUiControl> {
    public static final int $stable = 0;
    public static final NavigationUiControl$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final NavigationUiControl deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        String strA8f2 = null;
        String strA8f3 = null;
        JsonObject jsonObject = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new NavigationUiControl(i, strA8f, strA8f2, strA8f3, jsonObject, (C2hx) null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA8f2 = c9j4A55.A8f(c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                strA8f3 = c9j4A55.A8f(c9iZ, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                jsonObject = (JsonObject) c9j4A55.A8a(JsonObjectSerializer.A01, c9iZ, 3);
                i |= 8;
            }
        }
    }

    static {
        NavigationUiControl$$serializer navigationUiControl$$serializer = new NavigationUiControl$$serializer();
        INSTANCE = navigationUiControl$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.NavigationUiControl", navigationUiControl$$serializer, 4);
        c9iKA1C.A08("action", false);
        c9iKA1C.A08("target", true);
        c9iKA1C.A08(BrowserSessionControllerKt.WEBSOCKIFY_MODE_PARAM, true);
        c9iKA1C.A08(AuraBloksDataProps.PARAMS, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, JsonObjectSerializer.A01};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, NavigationUiControl navigationUiControl) {
        AnonymousClass003.A0u(interfaceC07789is, navigationUiControl);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        NavigationUiControl.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(navigationUiControl, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
