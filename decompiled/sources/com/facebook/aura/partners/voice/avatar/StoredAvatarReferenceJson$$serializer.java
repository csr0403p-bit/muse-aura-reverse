package com.facebook.aura.partners.voice.avatar;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07819iv;
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
import X.C9j1;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class StoredAvatarReferenceJson$$serializer implements C9cd<StoredAvatarReferenceJson> {
    public static final StoredAvatarReferenceJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final StoredAvatarReferenceJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0l = null;
        String strA0m = null;
        Float f = null;
        Float f2 = null;
        Float f3 = null;
        String strA8f = null;
        long jA8X = 0;
        boolean zA8G = false;
        boolean zA8G2 = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new StoredAvatarReferenceJson(i, strA8f, f3, f2, f, strA0l, strA0m, zA8G2, zA8G, jA8X, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    f3 = (Float) c9j4A55.A8Z(C07819iv.A00, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    f2 = (Float) c9j4A55.A8Z(C07819iv.A00, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    f = (Float) c9j4A55.A8Z(C07819iv.A00, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    strA0l = C3cI.A0l(c9iZ, c9j4A55);
                    i |= 16;
                    break;
                case 5:
                    strA0m = C3cI.A0m(c9iZ, c9j4A55);
                    i |= 32;
                    break;
                case 6:
                    zA8G2 = c9j4A55.A8G(c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    zA8G = c9j4A55.A8G(c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    jA8X = c9j4A55.A8X(c9iZ, 8);
                    i |= 256;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        StoredAvatarReferenceJson$$serializer storedAvatarReferenceJson$$serializer = new StoredAvatarReferenceJson$$serializer();
        INSTANCE = storedAvatarReferenceJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.partners.voice.avatar.StoredAvatarReferenceJson", storedAvatarReferenceJson$$serializer, 9);
        c9iKA1C.A08("asset_id", true);
        c9iKA1C.A08("crop_x", true);
        c9iKA1C.A08("crop_y", true);
        c9iKA1C.A08("crop_size", true);
        c9iKA1C.A08("source_sha1", true);
        c9iKA1C.A08("image_uri", true);
        c9iKA1C.A08("crop_refreshed", true);
        c9iKA1C.A08("embodiment_compatible", true);
        c9iKA1C.A08("written_at_ms", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C07819iv c07819iv = C07819iv.A00;
        C9hr c9hrA00 = AbstractC07749im.A00(c07819iv);
        C9hr c9hrA002 = AbstractC07749im.A00(c07819iv);
        C9hr c9hrA003 = AbstractC07749im.A00(c07819iv);
        C9hr c9hrA004 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA005 = AbstractC07749im.A00(c07779iq);
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07779iq, c9hrA00, c9hrA002, c9hrA003, c9hrA004, c9hrA005, c07839ix, c07839ix, C9j1.A00};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, StoredAvatarReferenceJson storedAvatarReferenceJson) {
        AnonymousClass003.A0u(interfaceC07789is, storedAvatarReferenceJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        StoredAvatarReferenceJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(storedAvatarReferenceJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
