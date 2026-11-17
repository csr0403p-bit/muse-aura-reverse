package com.facebook.aura.explore.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07799it;
import X.C2hx;
import X.C3cG;
import X.C3cI;
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
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class IdeaEngagementRequestJson$$serializer implements C9cd<IdeaEngagementRequestJson> {
    public static final IdeaEngagementRequestJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final IdeaEngagementRequestJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        JsonObject jsonObject = null;
        String strA0i = null;
        Double d = null;
        String strA0w = null;
        String strA0w2 = null;
        String strA0w3 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new IdeaEngagementRequestJson(i, strA8f, strA0i, d, strA0w, strA0w2, strA0w3, jsonObject, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0i = C3cI.A0i(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    d = (Double) c9j4A55.A8Z(C07799it.A00, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 3);
                    i |= 8;
                    break;
                case 4:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    strA0w3 = C3cI.A0w(c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                case 6:
                    jsonObject = (JsonObject) c9j4A55.A8Z(JsonObjectSerializer.A01, c9iZ, 6);
                    i |= 64;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        IdeaEngagementRequestJson$$serializer ideaEngagementRequestJson$$serializer = new IdeaEngagementRequestJson$$serializer();
        INSTANCE = ideaEngagementRequestJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.explore.repo.IdeaEngagementRequestJson", ideaEngagementRequestJson$$serializer, 7);
        c9iKA1C.A08("event_type", false);
        c9iKA1C.A08("surface", true);
        c9iKA1C.A08(BrowserOperationCatalogKt.VALUE, true);
        c9iKA1C.A08("anchor_kind", true);
        c9iKA1C.A08("anchor_id", true);
        c9iKA1C.A08(IdeaCardsModelsKt.IDEA_FEEDBACK_LANE_KEY, true);
        c9iKA1C.A08("metadata", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(C07799it.A00), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(JsonObjectSerializer.A01)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, IdeaEngagementRequestJson ideaEngagementRequestJson) {
        AnonymousClass003.A0u(interfaceC07789is, ideaEngagementRequestJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        IdeaEngagementRequestJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_explore_repo_repo(ideaEngagementRequestJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
