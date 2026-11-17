package com.facebook.aura.skills.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
import com.facebook.aura.pairs.PairsAnalyticsKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class ConnectorJson$$serializer implements C9cd<ConnectorJson> {
    public static final ConnectorJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ConnectorJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0v = null;
        ConnectorConsentJson connectorConsentJson = null;
        String strA0k = null;
        String strA0j = null;
        String strA8f = null;
        String strA0h = null;
        String strA8f2 = null;
        boolean zA8G = false;
        boolean zA8G2 = false;
        boolean zA8G3 = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ConnectorJson(i, strA8f, strA0h, strA0j, strA0k, zA8G3, zA8G, strA8f2, connectorConsentJson, zA8G2, strA0v, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0j = C3cI.A0j(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    strA0k = C3cI.A0k(c9iZ, c9j4A55);
                    i |= 8;
                    break;
                case 4:
                    zA8G3 = c9j4A55.A8G(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    zA8G = c9j4A55.A8G(c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    strA8f2 = c9j4A55.A8f(c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    connectorConsentJson = (ConnectorConsentJson) c9j4A55.A8Z(ConnectorConsentJson$$serializer.INSTANCE, c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    zA8G2 = c9j4A55.A8G(c9iZ, 8);
                    i |= 256;
                    break;
                case 9:
                    strA0v = C3cI.A0v(c9iZ, c9j4A55, 9);
                    i |= 512;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ConnectorJson$$serializer connectorJson$$serializer = new ConnectorJson$$serializer();
        INSTANCE = connectorJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.skills.repo.ConnectorJson", connectorJson$$serializer, 10);
        boolean zA1Q = C3cG.A1Q(c9iKA1C);
        c9iKA1C.A08("name", zA1Q);
        c9iKA1C.A08(HatchWebPageParserKt.DESCRIPTION, zA1Q);
        c9iKA1C.A08("icon_url", zA1Q);
        c9iKA1C.A08("supports_multiple_accounts", zA1Q);
        c9iKA1C.A08("is_custom", zA1Q);
        c9iKA1C.A08("state", zA1Q);
        c9iKA1C.A08("consent", zA1Q);
        c9iKA1C.A08("needs_reauth", zA1Q);
        c9iKA1C.A08(PairsAnalyticsKt.CONNECTION_TYPE_GROUP, zA1Q);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07779iq, c07779iq, c9hrA00, c9hrA002, c07839ix, c07839ix, c07779iq, AbstractC07749im.A00(ConnectorConsentJson$$serializer.INSTANCE), c07839ix, AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ConnectorJson connectorJson) {
        AnonymousClass003.A0u(interfaceC07789is, connectorJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ConnectorJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(connectorJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
