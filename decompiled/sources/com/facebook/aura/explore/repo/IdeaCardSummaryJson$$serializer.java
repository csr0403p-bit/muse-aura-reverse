package com.facebook.aura.explore.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
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
import com.facebook.aura.model.ReplyAttributionSerializer;
import java.util.List;
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class IdeaCardSummaryJson$$serializer implements C9cd<IdeaCardSummaryJson> {
    public static final IdeaCardSummaryJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final IdeaCardSummaryJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = IdeaCardSummaryJson.$childSerializers;
        String strA8f = null;
        List list = null;
        String strA0o = null;
        String strA0n = null;
        String strA0l = null;
        String strA0m = null;
        IdeaCardPresentationJson ideaCardPresentationJson = null;
        IdeaCardContentJson ideaCardContentJson = null;
        JsonElement jsonElement = null;
        String strA8f2 = null;
        String strA8f3 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new IdeaCardSummaryJson(i, strA8f, jsonElement, ideaCardContentJson, ideaCardPresentationJson, strA0l, strA0m, strA0n, strA0o, strA8f2, strA8f3, list, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    jsonElement = (JsonElement) c9j4A55.A8Z(JsonElementSerializer.A00, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    ideaCardContentJson = (IdeaCardContentJson) c9j4A55.A8a(IdeaCardContentJson$$serializer.INSTANCE, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    ideaCardPresentationJson = (IdeaCardPresentationJson) c9j4A55.A8a(IdeaCardPresentationJson$$serializer.INSTANCE, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    strA0l = C3cI.A0l(c9iZ, c9j4A55);
                    i |= 16;
                    break;
                case 5:
                    strA0m = C3cI.A0m(c9iZ, c9j4A55);
                    i |= 32;
                    break;
                case 6:
                    strA0n = C3cI.A0n(c9iZ, c9j4A55);
                    i |= 64;
                    break;
                case 7:
                    strA0o = C3cI.A0o(c9iZ, c9j4A55);
                    i |= 128;
                    break;
                case 8:
                    strA8f2 = c9j4A55.A8f(c9iZ, 8);
                    i |= 256;
                    break;
                case 9:
                    strA8f3 = c9j4A55.A8f(c9iZ, 9);
                    i |= 512;
                    break;
                case 10:
                    list = (List) C3cJ.A0G(c9iZ, c9j4A55, f0cArr, 10);
                    i |= 1024;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        IdeaCardSummaryJson$$serializer ideaCardSummaryJson$$serializer = new IdeaCardSummaryJson$$serializer();
        INSTANCE = ideaCardSummaryJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.explore.repo.IdeaCardSummaryJson", ideaCardSummaryJson$$serializer, 11);
        c9iKA1C.A08("id", true);
        c9iKA1C.A08("sharing", true);
        c9iKA1C.A08("content", true);
        c9iKA1C.A08(ReplyAttributionSerializer.TYPE_PRESENTATION, true);
        c9iKA1C.A08("iconUrl", true);
        c9iKA1C.A08("mimeType", true);
        c9iKA1C.A08("primaryLabel", true);
        c9iKA1C.A08("secondaryLabel", true);
        c9iKA1C.A08("buildStatus", true);
        c9iKA1C.A08("build_status", true);
        c9iKA1C.A08("connectionIds", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = IdeaCardSummaryJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, AbstractC07749im.A00(JsonElementSerializer.A00), IdeaCardContentJson$$serializer.INSTANCE, IdeaCardPresentationJson$$serializer.INSTANCE, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), c07779iq, c07779iq, C3cH.A14(f0cArr, 10)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, IdeaCardSummaryJson ideaCardSummaryJson) {
        AnonymousClass003.A0u(interfaceC07789is, ideaCardSummaryJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        IdeaCardSummaryJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_explore_repo_repo(ideaCardSummaryJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
