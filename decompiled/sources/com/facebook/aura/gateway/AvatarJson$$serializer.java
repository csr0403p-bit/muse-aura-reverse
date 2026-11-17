package com.facebook.aura.gateway;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
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
import java.util.Map;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class AvatarJson$$serializer implements C9cd<AvatarJson> {
    public static final int $stable = 0;
    public static final AvatarJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final AvatarJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = AvatarJson.$childSerializers;
        Map map = null;
        Map map2 = null;
        String str = null;
        String str2 = null;
        CallIdleVideosJson callIdleVideosJson = null;
        String str3 = null;
        Map map3 = null;
        String strA8f = null;
        long jA8X = 0;
        int i = 0;
        boolean zA8G = false;
        String strA8f2 = null;
        String strA8f3 = null;
        boolean zA8G2 = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new AvatarJson(i, strA8f2, zA8G2, zA8G, strA8f3, jA8X, strA8f, map, map3, callIdleVideosJson, str, str2, map2, str3, (C2hx) null);
                case 0:
                    strA8f2 = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    zA8G2 = c9j4A55.A8G(c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    zA8G = c9j4A55.A8G(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    strA8f3 = c9j4A55.A8f(c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    jA8X = c9j4A55.A8X(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    strA8f = c9j4A55.A8f(c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    map = (Map) c9j4A55.A8a(f0cArr[6].getValue(), c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    map3 = (Map) c9j4A55.A8a(f0cArr[7].getValue(), c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    callIdleVideosJson = (CallIdleVideosJson) c9j4A55.A8Z(CallIdleVideosJson$$serializer.INSTANCE, c9iZ, 8);
                    i |= 256;
                    break;
                case 9:
                    str = (String) c9j4A55.A8Z(LenientStringSerializer.INSTANCE, c9iZ, 9);
                    i |= 512;
                    break;
                case 10:
                    str2 = (String) c9j4A55.A8Z(LenientStringSerializer.INSTANCE, c9iZ, 10);
                    i |= 1024;
                    break;
                case 11:
                    map2 = (Map) c9j4A55.A8a(LenientStringMapSerializer.INSTANCE, c9iZ, 11);
                    i |= 2048;
                    break;
                case 12:
                    str3 = (String) c9j4A55.A8Z(LenientStringSerializer.INSTANCE, c9iZ, 12);
                    i |= 4096;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        AvatarJson$$serializer avatarJson$$serializer = new AvatarJson$$serializer();
        INSTANCE = avatarJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.AvatarJson", avatarJson$$serializer, 13);
        c9iKA1C.A08("canonical_path", true);
        c9iKA1C.A08("image_exists", true);
        c9iKA1C.A08("video_exists", true);
        c9iKA1C.A08("image_path", true);
        c9iKA1C.A08("image_updated_ms", true);
        c9iKA1C.A08("video_path", true);
        c9iKA1C.A08("video_start_frames", true);
        c9iKA1C.A08("video_variants", true);
        c9iKA1C.A08("call_idle_videos", true);
        c9iKA1C.A08("darkmode_image_path", true);
        c9iKA1C.A08("darkmode_video_path", true);
        c9iKA1C.A08("darkmode_video_variants", true);
        c9iKA1C.A08("assets_revision", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = AvatarJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        C07839ix c07839ix = C07839ix.A00;
        C9j1 c9j1 = C9j1.A00;
        C9hr c9hrA16 = C3cG.A16(f0cArr, 6);
        C9hr c9hrA162 = C3cG.A16(f0cArr, 7);
        C9hr c9hrA00 = AbstractC07749im.A00(CallIdleVideosJson$$serializer.INSTANCE);
        LenientStringSerializer lenientStringSerializer = LenientStringSerializer.INSTANCE;
        return new C9hr[]{c07779iq, c07839ix, c07839ix, c07779iq, c9j1, c07779iq, c9hrA16, c9hrA162, c9hrA00, AbstractC07749im.A00(lenientStringSerializer), AbstractC07749im.A00(lenientStringSerializer), LenientStringMapSerializer.INSTANCE, AbstractC07749im.A00(lenientStringSerializer)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, AvatarJson avatarJson) {
        AnonymousClass003.A0u(interfaceC07789is, avatarJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        AvatarJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(avatarJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
