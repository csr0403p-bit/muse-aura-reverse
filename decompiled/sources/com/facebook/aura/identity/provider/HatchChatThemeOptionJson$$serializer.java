package com.facebook.aura.identity.provider;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C2hx;
import X.C3cG;
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
import kotlin.Deprecated;
import kotlinx.serialization.UnknownFieldException;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class HatchChatThemeOptionJson$$serializer implements C9cd<HatchChatThemeOptionJson> {
    public static final int $stable = 0;
    public static final HatchChatThemeOptionJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final HatchChatThemeOptionJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        HatchChatThemeColorModeJson hatchChatThemeColorModeJson = null;
        HatchChatThemeColorModeJson hatchChatThemeColorModeJson2 = null;
        HatchChatThemeColorModeJson hatchChatThemeColorModeJson3 = null;
        HatchChatThemeColorModeJson hatchChatThemeColorModeJson4 = null;
        HatchChatThemeColorModeJson hatchChatThemeColorModeJson5 = null;
        HatchChatThemeColorModeJson hatchChatThemeColorModeJson6 = null;
        HatchChatThemeColorModeJson hatchChatThemeColorModeJson7 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new HatchChatThemeOptionJson(i, hatchChatThemeColorModeJson, hatchChatThemeColorModeJson3, hatchChatThemeColorModeJson4, hatchChatThemeColorModeJson5, hatchChatThemeColorModeJson6, hatchChatThemeColorModeJson7, hatchChatThemeColorModeJson2, (C2hx) null);
                case 0:
                    hatchChatThemeColorModeJson = (HatchChatThemeColorModeJson) c9j4A55.A8a(HatchChatThemeColorModeJson$$serializer.INSTANCE, c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    hatchChatThemeColorModeJson3 = (HatchChatThemeColorModeJson) c9j4A55.A8a(HatchChatThemeColorModeJson$$serializer.INSTANCE, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    hatchChatThemeColorModeJson4 = (HatchChatThemeColorModeJson) c9j4A55.A8a(HatchChatThemeColorModeJson$$serializer.INSTANCE, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    hatchChatThemeColorModeJson5 = (HatchChatThemeColorModeJson) c9j4A55.A8a(HatchChatThemeColorModeJson$$serializer.INSTANCE, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    hatchChatThemeColorModeJson6 = (HatchChatThemeColorModeJson) c9j4A55.A8a(HatchChatThemeColorModeJson$$serializer.INSTANCE, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    hatchChatThemeColorModeJson7 = (HatchChatThemeColorModeJson) c9j4A55.A8Z(HatchChatThemeColorModeJson$$serializer.INSTANCE, c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    hatchChatThemeColorModeJson2 = (HatchChatThemeColorModeJson) c9j4A55.A8Z(HatchChatThemeColorModeJson$$serializer.INSTANCE, c9iZ, 6);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iA8N);
            }
        }
    }

    static {
        HatchChatThemeOptionJson$$serializer hatchChatThemeOptionJson$$serializer = new HatchChatThemeOptionJson$$serializer();
        INSTANCE = hatchChatThemeOptionJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.identity.provider.HatchChatThemeOptionJson", hatchChatThemeOptionJson$$serializer, 7);
        c9iKA1C.A08("userText", false);
        c9iKA1C.A08("userBubble", false);
        c9iKA1C.A08("botText", false);
        c9iKA1C.A08("botBubble", false);
        c9iKA1C.A08("background", false);
        c9iKA1C.A08("primaryActionBackground", true);
        c9iKA1C.A08("primaryActionForeground", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        HatchChatThemeColorModeJson$$serializer hatchChatThemeColorModeJson$$serializer = HatchChatThemeColorModeJson$$serializer.INSTANCE;
        return new C9hr[]{hatchChatThemeColorModeJson$$serializer, hatchChatThemeColorModeJson$$serializer, hatchChatThemeColorModeJson$$serializer, hatchChatThemeColorModeJson$$serializer, hatchChatThemeColorModeJson$$serializer, AbstractC07749im.A00(hatchChatThemeColorModeJson$$serializer), AbstractC07749im.A00(hatchChatThemeColorModeJson$$serializer)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, HatchChatThemeOptionJson hatchChatThemeOptionJson) {
        AnonymousClass003.A0u(interfaceC07789is, hatchChatThemeOptionJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        HatchChatThemeOptionJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_identity_provider_provider(hatchChatThemeOptionJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
