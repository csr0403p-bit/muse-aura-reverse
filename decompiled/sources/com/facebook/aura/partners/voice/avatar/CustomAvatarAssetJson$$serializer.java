package com.facebook.aura.partners.voice.avatar;

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
import X.C9j1;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class CustomAvatarAssetJson$$serializer implements C9cd<CustomAvatarAssetJson> {
    public static final CustomAvatarAssetJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final CustomAvatarAssetJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        Boolean boolA0L = null;
        GeneratedHatchIdleAnimationJson generatedHatchIdleAnimationJson = null;
        DisplayCropJson displayCropJson = null;
        Long lA0Q = null;
        String strA0h = null;
        JsonElement jsonElement = null;
        String strA8f2 = null;
        String strA8f3 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new CustomAvatarAssetJson(i, strA8f, strA0h, jsonElement, strA8f2, strA8f3, lA0Q, displayCropJson, generatedHatchIdleAnimationJson, boolA0L, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    jsonElement = (JsonElement) c9j4A55.A8Z(JsonElementSerializer.A00, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    strA8f2 = c9j4A55.A8f(c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    strA8f3 = c9j4A55.A8f(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    lA0Q = C3cI.A0Q(c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                case 6:
                    displayCropJson = (DisplayCropJson) c9j4A55.A8Z(DisplayCropJson$$serializer.INSTANCE, c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    generatedHatchIdleAnimationJson = (GeneratedHatchIdleAnimationJson) c9j4A55.A8Z(GeneratedHatchIdleAnimationJson$$serializer.INSTANCE, c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    boolA0L = C3cI.A0L(c9iZ, c9j4A55, 8);
                    i |= 256;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        CustomAvatarAssetJson$$serializer customAvatarAssetJson$$serializer = new CustomAvatarAssetJson$$serializer();
        INSTANCE = customAvatarAssetJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.partners.voice.avatar.CustomAvatarAssetJson", customAvatarAssetJson$$serializer, 9);
        c9iKA1C.A08("asset_id", true);
        c9iKA1C.A08("asset_kind", true);
        c9iKA1C.A08("attributes", true);
        c9iKA1C.A08("uri", true);
        c9iKA1C.A08("content_hash", true);
        c9iKA1C.A08("generated_at", true);
        c9iKA1C.A08("display_crop", true);
        c9iKA1C.A08("generated_hatch_idle_animation", true);
        c9iKA1C.A08("is_avatar_embodiment_compatible", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, AbstractC07749im.A00(JsonElementSerializer.A00), c07779iq, c07779iq, AbstractC07749im.A00(C9j1.A00), AbstractC07749im.A00(DisplayCropJson$$serializer.INSTANCE), AbstractC07749im.A00(GeneratedHatchIdleAnimationJson$$serializer.INSTANCE), AbstractC07749im.A00(C07839ix.A00)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, CustomAvatarAssetJson customAvatarAssetJson) {
        AnonymousClass003.A0u(interfaceC07789is, customAvatarAssetJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        CustomAvatarAssetJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(customAvatarAssetJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
