package com.facebook.aura.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j1;
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
/* loaded from: classes3.dex */
public final /* synthetic */ class HatchTranscriptMetadata$$serializer implements C9cd<HatchTranscriptMetadata> {
    public static final int $stable = 0;
    public static final HatchTranscriptMetadata$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final HatchTranscriptMetadata deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = HatchTranscriptMetadata.$childSerializers;
        C2hx c2hx = null;
        List list = null;
        HatchStatusNarration hatchStatusNarration = null;
        Long l = null;
        Long l2 = null;
        long jA8X = 0;
        boolean zA8G = false;
        String str = null;
        String str2 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new HatchTranscriptMetadata(i, str, str2, jA8X, l2, l, hatchStatusNarration, list, zA8G, c2hx);
                case 0:
                    str = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    jA8X = c9j4A55.A8X(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    l2 = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    l = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    hatchStatusNarration = (HatchStatusNarration) c9j4A55.A8Z(HatchStatusNarration$$serializer.INSTANCE, c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    list = (List) c9j4A55.A8a(f0cArr[6].getValue(), c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    zA8G = c9j4A55.A8G(c9iZ, 7);
                    i |= 128;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        HatchTranscriptMetadata$$serializer hatchTranscriptMetadata$$serializer = new HatchTranscriptMetadata$$serializer();
        INSTANCE = hatchTranscriptMetadata$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.HatchTranscriptMetadata", hatchTranscriptMetadata$$serializer, 8);
        c9iKA1C.A08("model", false);
        c9iKA1C.A08(PhotosSearchHandlerKt.PARAM_SOURCE, false);
        c9iKA1C.A08("startedAtMs", false);
        c9iKA1C.A08("serverStartedAtMs", true);
        c9iKA1C.A08("completedAtMs", false);
        c9iKA1C.A08("statusNarration", true);
        c9iKA1C.A08("lifecycleSummaries", true);
        c9iKA1C.A08("isSpokenSummary", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = HatchTranscriptMetadata.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C9j1 c9j1 = C9j1.A00;
        return new C9hr[]{c9hrA00, c9hrA002, c9j1, AbstractC07749im.A00(c9j1), AbstractC07749im.A00(c9j1), AbstractC07749im.A00(HatchStatusNarration$$serializer.INSTANCE), C3cG.A16(f0cArr, 6), C07839ix.A00};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, HatchTranscriptMetadata hatchTranscriptMetadata) {
        AnonymousClass003.A0u(interfaceC07789is, hatchTranscriptMetadata);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        HatchTranscriptMetadata.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(hatchTranscriptMetadata, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
