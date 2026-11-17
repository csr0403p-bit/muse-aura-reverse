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
import java.util.List;
import kotlin.Deprecated;
import kotlinx.serialization.UnknownFieldException;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class AvatarAssetJson$$serializer implements C9cd<AvatarAssetJson> {
    public static final AvatarAssetJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final AvatarAssetJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = AvatarAssetJson.$childSerializers;
        String str = null;
        List list = null;
        AvatarAssetPartJson avatarAssetPartJson = null;
        AvatarAssetPartJson avatarAssetPartJson2 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new AvatarAssetJson(i, str, list, avatarAssetPartJson, avatarAssetPartJson2, (C2hx) null);
            }
            if (iA8N == 0) {
                str = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                list = (List) c9j4A55.A8a(f0cArr[1].getValue(), c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                avatarAssetPartJson = (AvatarAssetPartJson) c9j4A55.A8Z(AvatarAssetPartJson$$serializer.INSTANCE, c9iZ, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw new UnknownFieldException(iA8N);
                }
                avatarAssetPartJson2 = (AvatarAssetPartJson) c9j4A55.A8Z(AvatarAssetPartJson$$serializer.INSTANCE, c9iZ, 3);
                i |= 8;
            }
        }
    }

    static {
        AvatarAssetJson$$serializer avatarAssetJson$$serializer = new AvatarAssetJson$$serializer();
        INSTANCE = avatarAssetJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.avatarassets.AvatarAssetJson", avatarAssetJson$$serializer, 4);
        boolean zA1Q = C3cG.A1Q(c9iKA1C);
        c9iKA1C.A08("aliases", zA1Q);
        c9iKA1C.A08("still", zA1Q);
        c9iKA1C.A08("video", zA1Q);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = AvatarAssetJson.$childSerializers;
        C9hr c9hrA15 = C3cG.A15();
        C9hr c9hrA10 = C3cH.A10(f0cArr);
        AvatarAssetPartJson$$serializer avatarAssetPartJson$$serializer = AvatarAssetPartJson$$serializer.INSTANCE;
        return C3cH.A1a(avatarAssetPartJson$$serializer, c9hrA15, c9hrA10, AbstractC07749im.A00(avatarAssetPartJson$$serializer));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, AvatarAssetJson avatarAssetJson) {
        AnonymousClass003.A0u(interfaceC07789is, avatarAssetJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        AvatarAssetJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_avatarassets_avatarassets(avatarAssetJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
