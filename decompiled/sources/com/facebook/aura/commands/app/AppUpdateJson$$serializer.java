package com.facebook.aura.commands.app;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C07839ix;
import X.C3cG;
import X.C3cH;
import X.C5hV;
import X.C60Q;
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
public final /* synthetic */ class AppUpdateJson$$serializer implements C9cd<AppUpdateJson> {
    public static final AppUpdateJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final AppUpdateJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        Integer numA0X = null;
        Integer numA0X2 = null;
        String strA8f = null;
        String strA0h = null;
        String strA8f2 = null;
        boolean zA8G = false;
        boolean zA8G2 = false;
        int iA8U = 0;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new AppUpdateJson(i, strA8f, strA0h, iA8U, zA8G2, numA0X2, numA0X, strA8f2, zA8G, null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    iA8U = c9j4A55.A8U(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    zA8G2 = c9j4A55.A8G(c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    numA0X2 = C60Q.A0X(c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    numA0X = C60Q.A0X(c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                case 6:
                    strA8f2 = c9j4A55.A8f(c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    zA8G = c9j4A55.A8G(c9iZ, 7);
                    i |= 128;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        AppUpdateJson$$serializer appUpdateJson$$serializer = new AppUpdateJson$$serializer();
        INSTANCE = appUpdateJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.commands.app.AppUpdateJson", appUpdateJson$$serializer, 8);
        c9iKA1C.A08("store", false);
        c9iKA1C.A08("installed_version", false);
        c9iKA1C.A08("installed_version_code", false);
        c9iKA1C.A08("update_available", false);
        c9iKA1C.A08("available_version_code", false);
        c9iKA1C.A08("staleness_days", false);
        c9iKA1C.A08("install_status", false);
        c9iKA1C.A08("flexible_update_allowed", false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C07729ii c07729ii = C07729ii.A00;
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07779iq, c07779iq, c07729ii, c07839ix, AbstractC07749im.A00(c07729ii), AbstractC07749im.A00(c07729ii), c07779iq, c07839ix};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, AppUpdateJson appUpdateJson) {
        AnonymousClass003.A0u(interfaceC07789is, appUpdateJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        AppUpdateJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_commands_app_app(appUpdateJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
