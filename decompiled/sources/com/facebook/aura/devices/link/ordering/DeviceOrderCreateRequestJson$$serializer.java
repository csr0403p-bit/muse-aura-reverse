package com.facebook.aura.devices.link.ordering;

import X.AnonymousClass003;
import X.C07779iq;
import X.C3cG;
import X.C3cH;
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
/* loaded from: classes4.dex */
public final /* synthetic */ class DeviceOrderCreateRequestJson$$serializer implements C9cd<DeviceOrderCreateRequestJson> {
    public static final int $stable = 0;
    public static final DeviceOrderCreateRequestJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final DeviceOrderCreateRequestJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = DeviceOrderCreateRequestJson.$childSerializers;
        String strA8f = null;
        DeviceOrderRecipientJson deviceOrderRecipientJson = null;
        DeviceOrderContactJson deviceOrderContactJson = null;
        DeviceOrderAddressJson deviceOrderAddressJson = null;
        List listA0P = null;
        String strA8f2 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new DeviceOrderCreateRequestJson(i, strA8f, deviceOrderRecipientJson, deviceOrderContactJson, deviceOrderAddressJson, listA0P, strA8f2, null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    deviceOrderRecipientJson = (DeviceOrderRecipientJson) c9j4A55.A8a(DeviceOrderRecipientJson$$serializer.INSTANCE, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    deviceOrderContactJson = (DeviceOrderContactJson) c9j4A55.A8a(DeviceOrderContactJson$$serializer.INSTANCE, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    deviceOrderAddressJson = (DeviceOrderAddressJson) c9j4A55.A8a(DeviceOrderAddressJson$$serializer.INSTANCE, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 4);
                    i |= 16;
                    break;
                case 5:
                    strA8f2 = c9j4A55.A8f(c9iZ, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        DeviceOrderCreateRequestJson$$serializer deviceOrderCreateRequestJson$$serializer = new DeviceOrderCreateRequestJson$$serializer();
        INSTANCE = deviceOrderCreateRequestJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.devices.link.ordering.DeviceOrderCreateRequestJson", deviceOrderCreateRequestJson$$serializer, 6);
        c9iKA1C.A08("subscription_id", false);
        c9iKA1C.A08("recipient", false);
        c9iKA1C.A08("contact", false);
        c9iKA1C.A08("shipping_address", false);
        c9iKA1C.A08("order_items", false);
        c9iKA1C.A08("environment", false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = DeviceOrderCreateRequestJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, DeviceOrderRecipientJson$$serializer.INSTANCE, DeviceOrderContactJson$$serializer.INSTANCE, DeviceOrderAddressJson$$serializer.INSTANCE, C3cH.A13(f0cArr), c07779iq};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, DeviceOrderCreateRequestJson deviceOrderCreateRequestJson) {
        AnonymousClass003.A0u(interfaceC07789is, deviceOrderCreateRequestJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        DeviceOrderCreateRequestJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_link_ordering_ordering(deviceOrderCreateRequestJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
