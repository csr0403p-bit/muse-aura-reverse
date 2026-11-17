package com.facebook.aura.spaces.repo;

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
import com.facebook.aura.widgets.SpaceWidgetRefreshWorkerKt;
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class SpaceEntryJson$$serializer implements C9cd<SpaceEntryJson> {
    public static final SpaceEntryJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final SpaceEntryJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0g = null;
        String strA0g2 = null;
        String strA0g3 = null;
        String strA0g4 = null;
        String strA0s = null;
        Boolean bool = null;
        String strA0q = null;
        JsonElement jsonElement = null;
        JsonElement jsonElement2 = null;
        String strA0n = null;
        String strA0l = null;
        String strA0m = null;
        String strA0w = null;
        String strA0t = null;
        String strA0f = null;
        String strA0u = null;
        Boolean bool2 = null;
        String strA0v = null;
        int i2 = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new SpaceEntryJson(i2, strA0w, strA0v, strA0g4, strA0g3, strA0l, strA0m, strA0n, jsonElement2, jsonElement, strA0g2, strA0q, bool, strA0s, strA0t, strA0f, strA0u, bool2, strA0g, (C2hx) null);
                case 0:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strA0v = C3cI.A0v(c9iZ, c9j4A55, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    strA0g4 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 2);
                    i2 |= 4;
                    continue;
                case 3:
                    strA0g3 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    strA0l = C3cI.A0l(c9iZ, c9j4A55);
                    i2 |= 16;
                    continue;
                case 5:
                    strA0m = C3cI.A0m(c9iZ, c9j4A55);
                    i2 |= 32;
                    continue;
                case 6:
                    strA0n = C3cI.A0n(c9iZ, c9j4A55);
                    i2 |= 64;
                    continue;
                case 7:
                    jsonElement2 = (JsonElement) c9j4A55.A8Z(JsonElementSerializer.A00, c9iZ, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    jsonElement = (JsonElement) c9j4A55.A8Z(JsonElementSerializer.A00, c9iZ, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    strA0g2 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    strA0q = C3cI.A0q(c9iZ, c9j4A55);
                    i2 |= 1024;
                    continue;
                case 11:
                    bool = (Boolean) c9j4A55.A8Z(C07839ix.A00, c9iZ, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    strA0s = C3cI.A0s(c9iZ, c9j4A55);
                    i2 |= 4096;
                    continue;
                case 13:
                    strA0t = C3cI.A0t(c9iZ, c9j4A55);
                    i2 |= 8192;
                    continue;
                case 14:
                    strA0f = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    strA0u = C3cI.A0u(c9iZ, c9j4A55);
                    i = 32768;
                    break;
                case 16:
                    bool2 = (Boolean) c9j4A55.A8Z(C07839ix.A00, c9iZ, 16);
                    i = 65536;
                    break;
                case 17:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 17);
                    i2 |= 131072;
                    continue;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        SpaceEntryJson$$serializer spaceEntryJson$$serializer = new SpaceEntryJson$$serializer();
        INSTANCE = spaceEntryJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.spaces.repo.SpaceEntryJson", spaceEntryJson$$serializer, 18);
        c9iKA1C.A08(SpaceWidgetRefreshWorkerKt.KEY_SLUG, true);
        c9iKA1C.A08("space_id", true);
        c9iKA1C.A08("id", true);
        C3cH.A1G("name", c9iKA1C, true);
        c9iKA1C.A08("emoji", true);
        c9iKA1C.A08("image_url", true);
        c9iKA1C.A08("updated_at_ms", true);
        c9iKA1C.A08("favorite_order", true);
        c9iKA1C.A08("artifact_path", true);
        c9iKA1C.A08("html", true);
        c9iKA1C.A08("is_shared", true);
        c9iKA1C.A08("shortcode", true);
        c9iKA1C.A08("source_url", true);
        c9iKA1C.A08("construction_status", true);
        c9iKA1C.A08("build_status", true);
        c9iKA1C.A08("has_server_actions", true);
        c9iKA1C.A08("view_url", true);
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
        C9hr c9hrA007 = AbstractC07749im.A00(c07779iq);
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
        C9hr c9hrA008 = AbstractC07749im.A00(jsonElementSerializer);
        C9hr c9hrA009 = AbstractC07749im.A00(jsonElementSerializer);
        C9hr c9hrA0010 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA0011 = AbstractC07749im.A00(c07779iq);
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c9hrA00, c9hrA002, c9hrA003, c9hrA004, c9hrA005, c9hrA006, c9hrA007, c9hrA008, c9hrA009, c9hrA0010, c9hrA0011, AbstractC07749im.A00(c07839ix), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07839ix), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, SpaceEntryJson spaceEntryJson) {
        AnonymousClass003.A0u(interfaceC07789is, spaceEntryJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        SpaceEntryJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_spaces_repo_repo(spaceEntryJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
