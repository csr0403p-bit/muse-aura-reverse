package com.facebook.aura.spaces.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07799it;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C5hV;
import X.C60O;
import X.C60Q;
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
import com.facebook.aura.model.ReplyAttributionSerializer;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class PersistedSpaceCardJson$$serializer implements C9cd<PersistedSpaceCardJson> {
    public static final PersistedSpaceCardJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final PersistedSpaceCardJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0f = null;
        String strA0g = null;
        Boolean boolA0M = null;
        String strA0t = null;
        String strA0q = null;
        Double d = null;
        String str = null;
        String strA0n = null;
        Long l = null;
        String strA0o = null;
        String strA0m = null;
        String strA8f = null;
        String strA0i = null;
        String strA0o2 = null;
        int i = 0;
        boolean zA8G = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new PersistedSpaceCardJson(i, strA8f, strA0f, strA0i, strA0o2, strA0g, strA0m, strA0n, strA0o, str, d, strA0q, l, zA8G, strA0t, boolA0M, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0f = C3cI.A0f(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0i = C3cH.A0i(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    strA0o2 = C60Q.A0o(c9iZ, c9j4A55);
                    i |= 8;
                    break;
                case 4:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    strA0m = C3cI.A0m(c9iZ, c9j4A55);
                    i |= 32;
                    break;
                case 6:
                    strA0n = C3cI.A0n(c9iZ, c9j4A55);
                    i |= 64;
                    break;
                case 7:
                    strA0o = C3cI.A0o(c9iZ, c9j4A55);
                    i |= 128;
                    break;
                case 8:
                    str = (String) C3cI.A0U(c9iZ, c9j4A55);
                    i |= 256;
                    break;
                case 9:
                    d = (Double) c9j4A55.A8Z(C07799it.A00, c9iZ, 9);
                    i |= 512;
                    break;
                case 10:
                    strA0q = C3cI.A0q(c9iZ, c9j4A55);
                    i |= 1024;
                    break;
                case 11:
                    l = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 11);
                    i |= 2048;
                    break;
                case 12:
                    zA8G = c9j4A55.A8G(c9iZ, 12);
                    i |= 4096;
                    break;
                case 13:
                    strA0t = C3cI.A0t(c9iZ, c9j4A55);
                    i |= 8192;
                    break;
                case 14:
                    boolA0M = C3cI.A0M(c9iZ, c9j4A55, 14);
                    i |= 16384;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        PersistedSpaceCardJson$$serializer persistedSpaceCardJson$$serializer = new PersistedSpaceCardJson$$serializer();
        INSTANCE = persistedSpaceCardJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.spaces.repo.PersistedSpaceCardJson", persistedSpaceCardJson$$serializer, 15);
        boolean zA1Y = C60O.A1Y(c9iKA1C);
        c9iKA1C.A08("space_id", true);
        C3cH.A1G("type", c9iKA1C, zA1Y);
        C60O.A1W(c9iKA1C, true);
        c9iKA1C.A08(ReplyAttributionSerializer.TYPE_MESSAGE, true);
        c9iKA1C.A08("icon", true);
        c9iKA1C.A08("image_url", true);
        c9iKA1C.A08("image_version", true);
        c9iKA1C.A08("favorite_order", true);
        c9iKA1C.A08("source_url", true);
        c9iKA1C.A08("updated_at_ms", true);
        c9iKA1C.A08("is_shared", true);
        c9iKA1C.A08("shared_shortcode", true);
        c9iKA1C.A08("is_pwa_compliant", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA003 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA004 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA005 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA006 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA007 = AbstractC07749im.A00(C07799it.A00);
        C9hr c9hrA008 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA009 = AbstractC07749im.A00(C9j1.A00);
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07779iq, c9hrA00, c07779iq, c07779iq, c9hrA002, c9hrA003, c9hrA004, c9hrA005, c9hrA006, c9hrA007, c9hrA008, c9hrA009, c07839ix, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07839ix)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, PersistedSpaceCardJson persistedSpaceCardJson) {
        AnonymousClass003.A0u(interfaceC07789is, persistedSpaceCardJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        PersistedSpaceCardJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_spaces_repo_repo(persistedSpaceCardJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
