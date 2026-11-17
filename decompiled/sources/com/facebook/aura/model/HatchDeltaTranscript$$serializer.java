package com.facebook.aura.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
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
import java.util.Map;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class HatchDeltaTranscript$$serializer implements C9cd<HatchDeltaTranscript> {
    public static final int $stable = 0;
    public static final HatchDeltaTranscript$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final HatchDeltaTranscript deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = HatchDeltaTranscript.$childSerializers;
        String str = null;
        Map map = null;
        HatchTranscriptMetadata hatchTranscriptMetadata = null;
        List list = null;
        HatchTranscriptStatus hatchTranscriptStatus = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new HatchDeltaTranscript(i, str, str2, str3, str4, hatchTranscriptStatus, list, hatchTranscriptMetadata, map, null);
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
                    str4 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    hatchTranscriptStatus = (HatchTranscriptStatus) c9j4A55.A8a(f0cArr[4].getValue(), c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) c9j4A55.A8a(f0cArr[5].getValue(), c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    hatchTranscriptMetadata = (HatchTranscriptMetadata) c9j4A55.A8Z(HatchTranscriptMetadata$$serializer.INSTANCE, c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    map = (Map) c9j4A55.A8Z(f0cArr[7].getValue(), c9iZ, 7);
                    i |= 128;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        HatchDeltaTranscript$$serializer hatchDeltaTranscript$$serializer = new HatchDeltaTranscript$$serializer();
        INSTANCE = hatchDeltaTranscript$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.HatchDeltaTranscript", hatchDeltaTranscript$$serializer, 8);
        c9iKA1C.A08("messageId", false);
        c9iKA1C.A08("agentId", false);
        c9iKA1C.A08("sessionId", false);
        C3cH.A1H("replyToMessageId", c9iKA1C, false);
        c9iKA1C.A08("messages", false);
        c9iKA1C.A08("metadata", false);
        c9iKA1C.A08("placeholders", false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = HatchDeltaTranscript.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cH.A13(f0cArr), C3cG.A16(f0cArr, 5), AbstractC07749im.A00(HatchTranscriptMetadata$$serializer.INSTANCE), C3cH.A14(f0cArr, 7)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, HatchDeltaTranscript hatchDeltaTranscript) {
        AnonymousClass003.A0u(interfaceC07789is, hatchDeltaTranscript);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        HatchDeltaTranscript.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(hatchDeltaTranscript, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
