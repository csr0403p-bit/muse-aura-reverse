package com.facebook.aura.nodes.json;

import X.AnonymousClass003;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cI;
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
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class DataSourceCapabilityJson$$serializer implements C9cd<DataSourceCapabilityJson> {
    public static final DataSourceCapabilityJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final DataSourceCapabilityJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0v = null;
        boolean zA8G = false;
        boolean zA8G2 = false;
        boolean zA8G3 = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new DataSourceCapabilityJson(i, strA0v, zA8G3, zA8G2, zA8G, (C2hx) null);
            }
            if (iA8N == 0) {
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 0);
                i |= 1;
            } else if (iA8N == 1) {
                zA8G3 = c9j4A55.A8G(c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                zA8G2 = c9j4A55.A8G(c9iZ, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                zA8G = c9j4A55.A8G(c9iZ, 3);
                i |= 8;
            }
        }
    }

    static {
        DataSourceCapabilityJson$$serializer dataSourceCapabilityJson$$serializer = new DataSourceCapabilityJson$$serializer();
        INSTANCE = dataSourceCapabilityJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.nodes.json.DataSourceCapabilityJson", dataSourceCapabilityJson$$serializer, 4);
        c9iKA1C.A08(HatchWebPageParserKt.DESCRIPTION, true);
        c9iKA1C.A08("emits_proactively", true);
        c9iKA1C.A08("supports_backfill", true);
        c9iKA1C.A08("is_permission_granted", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9cd
    public /* bridge */ C9hr<?>[] typeParametersSerializers() {
        return C5hV.A00;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C9hr c9hrA15 = C3cG.A15();
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c9hrA15, c07839ix, c07839ix, c07839ix};
    }

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, DataSourceCapabilityJson dataSourceCapabilityJson) {
        AnonymousClass003.A0u(interfaceC07789is, dataSourceCapabilityJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        DataSourceCapabilityJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_json_json(dataSourceCapabilityJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
