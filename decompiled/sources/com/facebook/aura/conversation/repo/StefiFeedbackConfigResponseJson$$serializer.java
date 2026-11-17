package com.facebook.aura.conversation.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
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

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class StefiFeedbackConfigResponseJson$$serializer implements C9cd<StefiFeedbackConfigResponseJson> {
    public static final StefiFeedbackConfigResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final StefiFeedbackConfigResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = StefiFeedbackConfigResponseJson.$childSerializers;
        List list = null;
        String str = null;
        String str2 = null;
        List list2 = null;
        boolean zA8G = false;
        int i = 0;
        boolean zA8G2 = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new StefiFeedbackConfigResponseJson(i, zA8G, zA8G2, str, str2, list2, list, (C2hx) null);
                case 0:
                    zA8G = c9j4A55.A8G(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    zA8G2 = c9j4A55.A8G(c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) c9j4A55.A8a(f0cArr[4].getValue(), c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) c9j4A55.A8a(f0cArr[5].getValue(), c9iZ, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        StefiFeedbackConfigResponseJson$$serializer stefiFeedbackConfigResponseJson$$serializer = new StefiFeedbackConfigResponseJson$$serializer();
        INSTANCE = stefiFeedbackConfigResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.conversation.repo.StefiFeedbackConfigResponseJson", stefiFeedbackConfigResponseJson$$serializer, 6);
        c9iKA1C.A08("enable_good_feedback", true);
        c9iKA1C.A08("enable_bad_feedback", true);
        c9iKA1C.A08("good_response_label", true);
        c9iKA1C.A08("bad_response_label", true);
        c9iKA1C.A08("good_feedback_options", true);
        c9iKA1C.A08("bad_feedback_options", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = StefiFeedbackConfigResponseJson.$childSerializers;
        C07839ix c07839ix = C07839ix.A00;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07839ix, c07839ix, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cH.A13(f0cArr), C3cG.A16(f0cArr, 5)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, StefiFeedbackConfigResponseJson stefiFeedbackConfigResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, stefiFeedbackConfigResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        StefiFeedbackConfigResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_conversation_repo_repo(stefiFeedbackConfigResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
