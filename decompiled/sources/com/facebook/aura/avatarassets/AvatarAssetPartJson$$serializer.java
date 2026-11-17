package com.facebook.aura.avatarassets;

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
import java.util.Map;
import kotlin.Deprecated;
import kotlinx.serialization.UnknownFieldException;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class AvatarAssetPartJson$$serializer implements C9cd<AvatarAssetPartJson> {
    public static final AvatarAssetPartJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final AvatarAssetPartJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = AvatarAssetPartJson.$childSerializers;
        C2hx c2hx = null;
        Map map = null;
        String str = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new AvatarAssetPartJson(i, map, str, c2hx);
            }
            if (iA8N == 0) {
                map = (Map) c9j4A55.A8a(f0cArr[0].getValue(), c9iZ, 0);
                i |= 1;
            } else {
                if (iA8N != 1) {
                    throw new UnknownFieldException(iA8N);
                }
                str = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 1);
                i |= 2;
            }
        }
    }

    static {
        AvatarAssetPartJson$$serializer avatarAssetPartJson$$serializer = new AvatarAssetPartJson$$serializer();
        INSTANCE = avatarAssetPartJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.avatarassets.AvatarAssetPartJson", avatarAssetPartJson$$serializer, 2);
        c9iKA1C.A08("appearances", true);
        c9iKA1C.A08("starts_from", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cH.A1Y(C3cH.A0z(AvatarAssetPartJson.$childSerializers));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, AvatarAssetPartJson avatarAssetPartJson) {
        AnonymousClass003.A0u(interfaceC07789is, avatarAssetPartJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        AvatarAssetPartJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_avatarassets_avatarassets(avatarAssetPartJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
