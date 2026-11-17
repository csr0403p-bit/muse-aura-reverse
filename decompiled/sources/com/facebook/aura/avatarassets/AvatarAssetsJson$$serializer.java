package com.facebook.aura.avatarassets;

import X.AbstractC07749im;
import X.AnonymousClass003;
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
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.identity.provider.HatchChatThemeHelperKt;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class AvatarAssetsJson$$serializer implements C9cd<AvatarAssetsJson> {
    public static final AvatarAssetsJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final AvatarAssetsJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = AvatarAssetsJson.$childSerializers;
        String str = null;
        AvatarAssetsAvatarJson avatarAssetsAvatarJson = null;
        List list = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new AvatarAssetsJson(i, str, avatarAssetsAvatarJson, list, (C2hx) null);
            }
            if (iA8N == 0) {
                str = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                avatarAssetsAvatarJson = (AvatarAssetsAvatarJson) c9j4A55.A8Z(AvatarAssetsAvatarJson$$serializer.INSTANCE, c9iZ, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                list = (List) c9j4A55.A8a(f0cArr[2].getValue(), c9iZ, 2);
                i |= 4;
            }
        }
    }

    static {
        AvatarAssetsJson$$serializer avatarAssetsJson$$serializer = new AvatarAssetsJson$$serializer();
        INSTANCE = avatarAssetsJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.avatarassets.AvatarAssetsJson", avatarAssetsJson$$serializer, 3);
        c9iKA1C.A08("revision", true);
        c9iKA1C.A08(HatchChatThemeHelperKt.HATCH_AVATAR_THEME_ID, true);
        c9iKA1C.A08("assets", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{C3cG.A15(), AbstractC07749im.A00(AvatarAssetsAvatarJson$$serializer.INSTANCE), C3cH.A11(AvatarAssetsJson.$childSerializers)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, AvatarAssetsJson avatarAssetsJson) {
        AnonymousClass003.A0u(interfaceC07789is, avatarAssetsJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        AvatarAssetsJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_avatarassets_avatarassets(avatarAssetsJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
