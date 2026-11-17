package com.facebook.aura.partners.voice.avatar;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C07819iv;
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
import X.C9j1;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class StoredVoiceReadinessJson$$serializer implements C9cd<StoredVoiceReadinessJson> {
    public static final StoredVoiceReadinessJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final StoredVoiceReadinessJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0r = null;
        String strA0s = null;
        String strA0g = null;
        String strA0q = null;
        String strA0j = null;
        String strA0i = null;
        Boolean bool = null;
        Float f = null;
        Float f2 = null;
        Float f3 = null;
        String strA8f = null;
        String strA8f2 = null;
        String strA8f3 = null;
        String strA8f4 = null;
        long jA8X = 0;
        long jA8X2 = 0;
        int i2 = 0;
        int iA8U = 0;
        boolean zA8G = false;
        int iA8U2 = 0;
        boolean zA8G2 = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new StoredVoiceReadinessJson(i2, strA8f, strA0i, strA0j, jA8X, strA8f2, strA8f3, zA8G, strA8f4, iA8U, iA8U2, strA0q, strA0r, strA0s, f3, f2, f, zA8G2, strA0g, bool, jA8X2, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strA0i = C3cI.A0i(c9iZ, c9j4A55);
                    i2 |= 2;
                    continue;
                case 2:
                    strA0j = C3cI.A0j(c9iZ, c9j4A55);
                    i2 |= 4;
                    continue;
                case 3:
                    jA8X = c9j4A55.A8X(c9iZ, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    strA8f2 = c9j4A55.A8f(c9iZ, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    strA8f3 = c9j4A55.A8f(c9iZ, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    zA8G = c9j4A55.A8G(c9iZ, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    strA8f4 = c9j4A55.A8f(c9iZ, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    iA8U = c9j4A55.A8U(c9iZ, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    iA8U2 = c9j4A55.A8U(c9iZ, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    strA0q = C3cI.A0q(c9iZ, c9j4A55);
                    i2 |= 1024;
                    continue;
                case 11:
                    strA0r = C3cI.A0r(c9iZ, c9j4A55);
                    i2 |= 2048;
                    continue;
                case 12:
                    strA0s = C3cI.A0s(c9iZ, c9j4A55);
                    i2 |= 4096;
                    continue;
                case 13:
                    f3 = (Float) c9j4A55.A8Z(C07819iv.A00, c9iZ, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    f2 = (Float) c9j4A55.A8Z(C07819iv.A00, c9iZ, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    f = (Float) c9j4A55.A8Z(C07819iv.A00, c9iZ, 15);
                    i = 32768;
                    break;
                case 16:
                    zA8G2 = c9j4A55.A8G(c9iZ, 16);
                    i = 65536;
                    break;
                case 17:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 17);
                    i = 131072;
                    break;
                case 18:
                    bool = (Boolean) c9j4A55.A8Z(C07839ix.A00, c9iZ, 18);
                    i = 262144;
                    break;
                case 19:
                    jA8X2 = c9j4A55.A8X(c9iZ, 19);
                    i2 |= 524288;
                    continue;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        StoredVoiceReadinessJson$$serializer storedVoiceReadinessJson$$serializer = new StoredVoiceReadinessJson$$serializer();
        INSTANCE = storedVoiceReadinessJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.partners.voice.avatar.StoredVoiceReadinessJson", storedVoiceReadinessJson$$serializer, 20);
        c9iKA1C.A08("gateway_url", true);
        c9iKA1C.A08("vm_id", true);
        c9iKA1C.A08("avatar_image_path", true);
        c9iKA1C.A08("avatar_image_updated_ms", true);
        c9iKA1C.A08("avatar_still_path", true);
        c9iKA1C.A08("selection_kind", true);
        c9iKA1C.A08("full_frame", true);
        c9iKA1C.A08("asset_id", true);
        c9iKA1C.A08("crop_top", true);
        c9iKA1C.A08("crop_bottom", true);
        c9iKA1C.A08("source_sha1", true);
        c9iKA1C.A08("idle_video_uri", true);
        c9iKA1C.A08("reference_image_uri", true);
        c9iKA1C.A08("reference_crop_x", true);
        c9iKA1C.A08("reference_crop_y", true);
        c9iKA1C.A08("reference_crop_size", true);
        c9iKA1C.A08("embodiment_compatible", true);
        c9iKA1C.A08("avatar_still_sha1", true);
        c9iKA1C.A08("reference_from_original", true);
        c9iKA1C.A08("written_at_ms", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C9j1 c9j1 = C9j1.A00;
        C07839ix c07839ix = C07839ix.A00;
        C07729ii c07729ii = C07729ii.A00;
        C9hr c9hrA003 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA004 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA005 = AbstractC07749im.A00(c07779iq);
        C07819iv c07819iv = C07819iv.A00;
        return new C9hr[]{c07779iq, c9hrA00, c9hrA002, c9j1, c07779iq, c07779iq, c07839ix, c07779iq, c07729ii, c07729ii, c9hrA003, c9hrA004, c9hrA005, AbstractC07749im.A00(c07819iv), AbstractC07749im.A00(c07819iv), AbstractC07749im.A00(c07819iv), c07839ix, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07839ix), c9j1};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, StoredVoiceReadinessJson storedVoiceReadinessJson) {
        AnonymousClass003.A0u(interfaceC07789is, storedVoiceReadinessJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        StoredVoiceReadinessJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(storedVoiceReadinessJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
