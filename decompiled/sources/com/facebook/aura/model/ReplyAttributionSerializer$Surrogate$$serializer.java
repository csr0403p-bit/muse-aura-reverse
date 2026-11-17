package com.facebook.aura.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C5hV;
import X.C60P;
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
import com.facebook.aura.model.ReplyAttribution;
import com.facebook.aura.model.ReplyAttributionSerializer;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class ReplyAttributionSerializer$Surrogate$$serializer implements C9cd<ReplyAttributionSerializer.Surrogate> {
    public static final int $stable = 0;
    public static final ReplyAttributionSerializer$Surrogate$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ReplyAttributionSerializer.Surrogate deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        ReplyAttribution.Goal goal = null;
        ReplyAttribution.Context context = null;
        ReplyAttribution.FeedUnit feedUnit = null;
        ReplyAttribution.Element element = null;
        ReplyAttribution.Product product = null;
        ReplyAttribution.Message message = null;
        ReplyAttribution.Idea idea = null;
        ReplyAttribution.Presentation presentation = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ReplyAttributionSerializer.Surrogate(i, strA8f, message, idea, presentation, product, element, feedUnit, goal, context, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    message = (ReplyAttribution.Message) c9j4A55.A8Z(ReplyAttribution$Message$$serializer.INSTANCE, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    idea = (ReplyAttribution.Idea) c9j4A55.A8Z(ReplyAttribution$Idea$$serializer.INSTANCE, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    presentation = (ReplyAttribution.Presentation) c9j4A55.A8Z(ReplyAttribution$Presentation$$serializer.INSTANCE, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    product = (ReplyAttribution.Product) c9j4A55.A8Z(ReplyAttribution$Product$$serializer.INSTANCE, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    element = (ReplyAttribution.Element) c9j4A55.A8Z(ReplyAttribution$Element$$serializer.INSTANCE, c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    feedUnit = (ReplyAttribution.FeedUnit) c9j4A55.A8Z(ReplyAttribution$FeedUnit$$serializer.INSTANCE, c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    goal = (ReplyAttribution.Goal) c9j4A55.A8Z(ReplyAttribution$Goal$$serializer.INSTANCE, c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    context = (ReplyAttribution.Context) c9j4A55.A8Z(ReplyAttribution$Context$$serializer.INSTANCE, c9iZ, 8);
                    i |= 256;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ReplyAttributionSerializer$Surrogate$$serializer replyAttributionSerializer$Surrogate$$serializer = new ReplyAttributionSerializer$Surrogate$$serializer();
        INSTANCE = replyAttributionSerializer$Surrogate$$serializer;
        C9iK c9iKA1T = C60P.A1T("com.facebook.aura.model.ReplyAttributionSerializer.Surrogate", replyAttributionSerializer$Surrogate$$serializer, 9);
        c9iKA1T.A08(ReplyAttributionSerializer.TYPE_MESSAGE, true);
        c9iKA1T.A08("idea", true);
        c9iKA1T.A08(ReplyAttributionSerializer.TYPE_PRESENTATION, true);
        c9iKA1T.A08("product", true);
        c9iKA1T.A08(ReplyAttributionSerializer.TYPE_ELEMENT, true);
        c9iKA1T.A08("feedUnit", true);
        c9iKA1T.A08(ReplyAttributionSerializer.TYPE_GOAL, true);
        c9iKA1T.A08(ReplyAttributionSerializer.TYPE_CONTEXT, true);
        descriptor = c9iKA1T;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{C07779iq.A01, AbstractC07749im.A00(ReplyAttribution$Message$$serializer.INSTANCE), AbstractC07749im.A00(ReplyAttribution$Idea$$serializer.INSTANCE), AbstractC07749im.A00(ReplyAttribution$Presentation$$serializer.INSTANCE), AbstractC07749im.A00(ReplyAttribution$Product$$serializer.INSTANCE), AbstractC07749im.A00(ReplyAttribution$Element$$serializer.INSTANCE), AbstractC07749im.A00(ReplyAttribution$FeedUnit$$serializer.INSTANCE), AbstractC07749im.A00(ReplyAttribution$Goal$$serializer.INSTANCE), AbstractC07749im.A00(ReplyAttribution$Context$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ReplyAttributionSerializer.Surrogate surrogate) {
        AnonymousClass003.A0u(interfaceC07789is, surrogate);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ReplyAttributionSerializer.Surrogate.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(surrogate, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
