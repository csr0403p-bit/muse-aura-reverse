package com.facebook.aura.composer.dictation.voyager;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cI;
import X.C5hV;
import X.C60Q;
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
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class VoyagerAsrMessageJson$$serializer implements C9cd<VoyagerAsrMessageJson> {
    public static final VoyagerAsrMessageJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final VoyagerAsrMessageJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        JsonElement jsonElementA17 = null;
        VoyagerAsrSpeechBoundaryJson voyagerAsrSpeechBoundaryJson = null;
        VoyagerAsrSpeechBoundaryJson voyagerAsrSpeechBoundaryJson2 = null;
        VoyagerAsrSpeechCompleteJson voyagerAsrSpeechCompleteJson = null;
        VoyagerAsrTranscriptJson voyagerAsrTranscriptJson = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new VoyagerAsrMessageJson(i, strA8f, jsonElementA17, voyagerAsrSpeechBoundaryJson, voyagerAsrSpeechBoundaryJson2, voyagerAsrSpeechCompleteJson, voyagerAsrTranscriptJson, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    jsonElementA17 = C3cI.A17(c9iZ, c9j4A55, 1);
                    i |= 2;
                    break;
                case 2:
                    voyagerAsrSpeechBoundaryJson = (VoyagerAsrSpeechBoundaryJson) c9j4A55.A8Z(VoyagerAsrSpeechBoundaryJson$$serializer.INSTANCE, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    voyagerAsrSpeechBoundaryJson2 = (VoyagerAsrSpeechBoundaryJson) c9j4A55.A8Z(VoyagerAsrSpeechBoundaryJson$$serializer.INSTANCE, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    voyagerAsrSpeechCompleteJson = (VoyagerAsrSpeechCompleteJson) c9j4A55.A8Z(VoyagerAsrSpeechCompleteJson$$serializer.INSTANCE, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    voyagerAsrTranscriptJson = (VoyagerAsrTranscriptJson) c9j4A55.A8Z(VoyagerAsrTranscriptJson$$serializer.INSTANCE, c9iZ, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        VoyagerAsrMessageJson$$serializer voyagerAsrMessageJson$$serializer = new VoyagerAsrMessageJson$$serializer();
        INSTANCE = voyagerAsrMessageJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.composer.dictation.voyager.VoyagerAsrMessageJson", voyagerAsrMessageJson$$serializer, 6);
        C60Q.A1N("sessionId", c9iKA1C, true);
        c9iKA1C.A08("speechStart", true);
        c9iKA1C.A08("speechEnd", true);
        c9iKA1C.A08("speechComplete", true);
        c9iKA1C.A08("transcript", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(JsonElementSerializer.A00);
        VoyagerAsrSpeechBoundaryJson$$serializer voyagerAsrSpeechBoundaryJson$$serializer = VoyagerAsrSpeechBoundaryJson$$serializer.INSTANCE;
        return new C9hr[]{c07779iq, c9hrA00, AbstractC07749im.A00(voyagerAsrSpeechBoundaryJson$$serializer), AbstractC07749im.A00(voyagerAsrSpeechBoundaryJson$$serializer), AbstractC07749im.A00(VoyagerAsrSpeechCompleteJson$$serializer.INSTANCE), AbstractC07749im.A00(VoyagerAsrTranscriptJson$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, VoyagerAsrMessageJson voyagerAsrMessageJson) {
        AnonymousClass003.A0u(interfaceC07789is, voyagerAsrMessageJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        VoyagerAsrMessageJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_composer_dictation_voyager_voyager(voyagerAsrMessageJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
