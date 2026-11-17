package com.facebook.aura.avatarassets;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import kotlin.Deprecated;
import kotlinx.serialization.UnknownFieldException;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class AvatarAssetFileJson$$serializer implements C9cd<AvatarAssetFileJson> {
    public static final AvatarAssetFileJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final AvatarAssetFileJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        Integer num2 = null;
        AvatarDisplayCropJson avatarDisplayCropJson = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new AvatarAssetFileJson(i, str, str2, str3, num, num2, avatarDisplayCropJson, (C2hx) null);
                case 0:
                    str = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) c9j4A55.A8Z(C07729ii.A00, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    num2 = (Integer) c9j4A55.A8Z(C07729ii.A00, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    avatarDisplayCropJson = (AvatarDisplayCropJson) c9j4A55.A8Z(AvatarDisplayCropJson$$serializer.INSTANCE, c9iZ, 5);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iA8N);
            }
        }
    }

    static {
        AvatarAssetFileJson$$serializer avatarAssetFileJson$$serializer = new AvatarAssetFileJson$$serializer();
        INSTANCE = avatarAssetFileJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.avatarassets.AvatarAssetFileJson", avatarAssetFileJson$$serializer, 6);
        c9iKA1C.A08("path", true);
        c9iKA1C.A08("format", true);
        C3cH.A1C(PhotosSearchHandlerKt.PARAM_SOURCE, c9iKA1C);
        c9iKA1C.A08("display_crop", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA003 = AbstractC07749im.A00(c07779iq);
        C07729ii c07729ii = C07729ii.A00;
        return new C9hr[]{c9hrA00, c9hrA002, c9hrA003, AbstractC07749im.A00(c07729ii), AbstractC07749im.A00(c07729ii), AbstractC07749im.A00(AvatarDisplayCropJson$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, AvatarAssetFileJson avatarAssetFileJson) {
        AnonymousClass003.A0u(interfaceC07789is, avatarAssetFileJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        AvatarAssetFileJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_avatarassets_avatarassets(avatarAssetFileJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
