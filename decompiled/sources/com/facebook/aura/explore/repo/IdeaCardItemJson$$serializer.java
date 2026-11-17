package com.facebook.aura.explore.repo;

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
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.model.ReplyAttributionSerializer;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class IdeaCardItemJson$$serializer implements C9cd<IdeaCardItemJson> {
    public static final IdeaCardItemJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final IdeaCardItemJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        IdeaCardPresentationJson ideaCardPresentationJson = null;
        String strA8f = null;
        String strA8f2 = null;
        IdeaItemContentJson ideaItemContentJson = null;
        boolean zA8G = false;
        boolean zA8G2 = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new IdeaCardItemJson(i, strA8f, strA8f2, zA8G2, zA8G, ideaItemContentJson, ideaCardPresentationJson, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA8f2 = c9j4A55.A8f(c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    zA8G2 = c9j4A55.A8G(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    zA8G = c9j4A55.A8G(c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    ideaItemContentJson = (IdeaItemContentJson) c9j4A55.A8a(IdeaItemContentJson$$serializer.INSTANCE, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    ideaCardPresentationJson = (IdeaCardPresentationJson) c9j4A55.A8a(IdeaCardPresentationJson$$serializer.INSTANCE, c9iZ, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        IdeaCardItemJson$$serializer ideaCardItemJson$$serializer = new IdeaCardItemJson$$serializer();
        INSTANCE = ideaCardItemJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.explore.repo.IdeaCardItemJson", ideaCardItemJson$$serializer, 6);
        c9iKA1C.A08("id", true);
        c9iKA1C.A08("type", true);
        c9iKA1C.A08("selectable", true);
        c9iKA1C.A08("isSelected", true);
        c9iKA1C.A08("content", true);
        c9iKA1C.A08(ReplyAttributionSerializer.TYPE_PRESENTATION, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07779iq, c07779iq, c07839ix, c07839ix, IdeaItemContentJson$$serializer.INSTANCE, IdeaCardPresentationJson$$serializer.INSTANCE};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, IdeaCardItemJson ideaCardItemJson) {
        AnonymousClass003.A0u(interfaceC07789is, ideaCardItemJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        IdeaCardItemJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_explore_repo_repo(ideaCardItemJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
