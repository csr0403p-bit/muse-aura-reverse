package com.facebook.aura.nodes.json;

import X.AbstractC07749im;
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
import X.C9j1;
import X.C9j4;
import X.C9j5;
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class DeviceCommandCapabilityJson$$serializer implements C9cd<DeviceCommandCapabilityJson> {
    public static final DeviceCommandCapabilityJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final DeviceCommandCapabilityJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = DeviceCommandCapabilityJson.$childSerializers;
        String strA0w = null;
        long jA8X = 0;
        Boolean boolA0M = null;
        Map map = null;
        Map map2 = null;
        List listA0P = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new DeviceCommandCapabilityJson(i, strA0w, map, map2, listA0P, jA8X, boolA0M, (C2hx) null);
                case 0:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 0);
                    i |= 1;
                    break;
                case 1:
                    map = (Map) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 1);
                    i |= 2;
                    break;
                case 2:
                    map2 = (Map) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 2);
                    i |= 4;
                    break;
                case 3:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 3);
                    i |= 8;
                    break;
                case 4:
                    jA8X = c9j4A55.A8X(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    boolA0M = C3cI.A0M(c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        DeviceCommandCapabilityJson$$serializer deviceCommandCapabilityJson$$serializer = new DeviceCommandCapabilityJson$$serializer();
        INSTANCE = deviceCommandCapabilityJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.nodes.json.DeviceCommandCapabilityJson", deviceCommandCapabilityJson$$serializer, 6);
        c9iKA1C.A08(HatchWebPageParserKt.DESCRIPTION, true);
        c9iKA1C.A08("required", true);
        c9iKA1C.A08(LinkEncryptedPairingKt.LINK_WIFI_OPTIONAL, true);
        c9iKA1C.A08("permission_required", true);
        c9iKA1C.A08("timeout_ms", true);
        c9iKA1C.A08("supports_background_execution", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = DeviceCommandCapabilityJson.$childSerializers;
        return new C9hr[]{C3cG.A15(), C3cH.A10(f0cArr), C3cH.A11(f0cArr), C3cH.A12(f0cArr), C9j1.A00, AbstractC07749im.A00(C07839ix.A00)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, DeviceCommandCapabilityJson deviceCommandCapabilityJson) {
        C7384Etj.A0Y(interfaceC07789is, 0);
        C7384Etj.A0Y(deviceCommandCapabilityJson, 1);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        DeviceCommandCapabilityJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_json_json(deviceCommandCapabilityJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
