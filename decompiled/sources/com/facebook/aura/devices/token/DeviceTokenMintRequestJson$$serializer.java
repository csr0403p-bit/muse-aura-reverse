package com.facebook.aura.devices.token;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cI;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j1;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class DeviceTokenMintRequestJson$$serializer implements C9cd<DeviceTokenMintRequestJson> {
    public static final DeviceTokenMintRequestJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final DeviceTokenMintRequestJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        long jA8X = 0;
        String strA0v = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new DeviceTokenMintRequestJson(i, strA8f, strA0v, jA8X, (C2hx) null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                jA8X = c9j4A55.A8X(c9iZ, 2);
                i |= 4;
            }
        }
    }

    static {
        DeviceTokenMintRequestJson$$serializer deviceTokenMintRequestJson$$serializer = new DeviceTokenMintRequestJson$$serializer();
        INSTANCE = deviceTokenMintRequestJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.devices.token.DeviceTokenMintRequestJson", deviceTokenMintRequestJson$$serializer, 3);
        c9iKA1C.A08("device_id", false);
        c9iKA1C.A08("sdk_token", true);
        c9iKA1C.A08("abra_device_app_fbid", false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, AbstractC07749im.A00(c07779iq), C9j1.A00};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, DeviceTokenMintRequestJson deviceTokenMintRequestJson) {
        AnonymousClass003.A0u(interfaceC07789is, deviceTokenMintRequestJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        DeviceTokenMintRequestJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_token_token(deviceTokenMintRequestJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
