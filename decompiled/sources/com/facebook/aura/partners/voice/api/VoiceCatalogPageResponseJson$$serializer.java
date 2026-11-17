package com.facebook.aura.partners.voice.api;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
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
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class VoiceCatalogPageResponseJson$$serializer implements C9cd<VoiceCatalogPageResponseJson> {
    public static final int $stable = 0;
    public static final VoiceCatalogPageResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final VoiceCatalogPageResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = VoiceCatalogPageResponseJson.$childSerializers;
        List listA0P = null;
        CurrentVoiceJson currentVoiceJson = null;
        int iA8U = 0;
        int iA8U2 = 0;
        int iA8U3 = 0;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new VoiceCatalogPageResponseJson(i, listA0P, iA8U, iA8U3, iA8U2, currentVoiceJson, (C2hx) null);
            }
            if (iA8N == 0) {
                listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 0);
                i |= 1;
            } else if (iA8N == 1) {
                iA8U = c9j4A55.A8U(c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                iA8U3 = c9j4A55.A8U(c9iZ, 2);
                i |= 4;
            } else if (iA8N == 3) {
                iA8U2 = c9j4A55.A8U(c9iZ, 3);
                i |= 8;
            } else {
                if (iA8N != 4) {
                    throw C3cG.A17(iA8N);
                }
                currentVoiceJson = (CurrentVoiceJson) c9j4A55.A8Z(CurrentVoiceJson$$serializer.INSTANCE, c9iZ, 4);
                i |= 16;
            }
        }
    }

    static {
        VoiceCatalogPageResponseJson$$serializer voiceCatalogPageResponseJson$$serializer = new VoiceCatalogPageResponseJson$$serializer();
        INSTANCE = voiceCatalogPageResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.partners.voice.api.VoiceCatalogPageResponseJson", voiceCatalogPageResponseJson$$serializer, 5);
        c9iKA1C.A08("voices", false);
        c9iKA1C.A08("total", false);
        c9iKA1C.A08(PhotosSearchHandlerKt.PARAM_LIMIT, false);
        c9iKA1C.A08(PhotosSearchHandlerKt.PARAM_OFFSET, false);
        c9iKA1C.A08("current", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C9hr c9hrA0z = C3cH.A0z(VoiceCatalogPageResponseJson.$childSerializers);
        C07729ii c07729ii = C07729ii.A00;
        return new C9hr[]{c9hrA0z, c07729ii, c07729ii, c07729ii, AbstractC07749im.A00(CurrentVoiceJson$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, VoiceCatalogPageResponseJson voiceCatalogPageResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, voiceCatalogPageResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        VoiceCatalogPageResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_api_api(voiceCatalogPageResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
