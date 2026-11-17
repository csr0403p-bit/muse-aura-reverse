package com.facebook.aura.nodes.json;

import X.AbstractC07749im;
import X.AnonymousClass003;
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
import java.util.Map;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class CapabilitiesJson$$serializer implements C9cd<CapabilitiesJson> {
    public static final CapabilitiesJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final CapabilitiesJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = CapabilitiesJson.$childSerializers;
        Map map = null;
        Map map2 = null;
        Map map3 = null;
        RenderingCapabilitiesJson renderingCapabilitiesJson = null;
        Boolean boolA0M = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new CapabilitiesJson(i, map, map2, map3, renderingCapabilitiesJson, boolA0M, (C2hx) null);
            }
            if (iA8N == 0) {
                map = (Map) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 0);
                i |= 1;
            } else if (iA8N == 1) {
                map2 = (Map) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 1);
                i |= 2;
            } else if (iA8N == 2) {
                map3 = (Map) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 2);
                i |= 4;
            } else if (iA8N == 3) {
                renderingCapabilitiesJson = (RenderingCapabilitiesJson) c9j4A55.A8Z(RenderingCapabilitiesJson$$serializer.INSTANCE, c9iZ, 3);
                i |= 8;
            } else {
                if (iA8N != 4) {
                    throw C3cG.A17(iA8N);
                }
                boolA0M = C3cI.A0M(c9iZ, c9j4A55, 4);
                i |= 16;
            }
        }
    }

    static {
        CapabilitiesJson$$serializer capabilitiesJson$$serializer = new CapabilitiesJson$$serializer();
        INSTANCE = capabilitiesJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.nodes.json.CapabilitiesJson", capabilitiesJson$$serializer, 5);
        c9iKA1C.A08("data_sources", false);
        c9iKA1C.A08("device_commands", false);
        c9iKA1C.A08("hatch_app_commands", true);
        c9iKA1C.A08("rendering", true);
        c9iKA1C.A08("voice_entrypoint_enabled", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = CapabilitiesJson.$childSerializers;
        return C3cI.A1b(C07839ix.A00, C3cH.A0z(f0cArr), C3cH.A10(f0cArr), C3cH.A11(f0cArr), AbstractC07749im.A00(RenderingCapabilitiesJson$$serializer.INSTANCE));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, CapabilitiesJson capabilitiesJson) {
        AnonymousClass003.A0u(interfaceC07789is, capabilitiesJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        CapabilitiesJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_json_json(capabilitiesJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
