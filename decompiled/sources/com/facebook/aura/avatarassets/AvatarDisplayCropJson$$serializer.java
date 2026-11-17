package com.facebook.aura.avatarassets;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07819iv;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iZ;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class AvatarDisplayCropJson$$serializer implements C9cd<AvatarDisplayCropJson> {
    public static final AvatarDisplayCropJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final AvatarDisplayCropJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        Float f = null;
        Float f2 = null;
        Float f3 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new AvatarDisplayCropJson(i, f, f2, f3, (C2hx) null);
            }
            if (iA8N == 0) {
                f = (Float) c9j4A55.A8Z(C07819iv.A00, c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                f2 = (Float) c9j4A55.A8Z(C07819iv.A00, c9iZ, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                f3 = (Float) c9j4A55.A8Z(C07819iv.A00, c9iZ, 2);
                i |= 4;
            }
        }
    }

    static {
        AvatarDisplayCropJson$$serializer avatarDisplayCropJson$$serializer = new AvatarDisplayCropJson$$serializer();
        INSTANCE = avatarDisplayCropJson$$serializer;
        descriptor = C3cH.A16("com.facebook.aura.avatarassets.AvatarDisplayCropJson", avatarDisplayCropJson$$serializer);
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07819iv c07819iv = C07819iv.A00;
        return C3cG.A1b(c07819iv, AbstractC07749im.A00(c07819iv), AbstractC07749im.A00(c07819iv));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, AvatarDisplayCropJson avatarDisplayCropJson) {
        AnonymousClass003.A0u(interfaceC07789is, avatarDisplayCropJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        AvatarDisplayCropJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_avatarassets_avatarassets(avatarDisplayCropJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
