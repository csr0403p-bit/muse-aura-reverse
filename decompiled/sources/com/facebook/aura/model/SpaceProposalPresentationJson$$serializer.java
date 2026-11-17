package com.facebook.aura.model;

import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C5hV;
import X.C60O;
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
import com.facebook.aura.widgets.SpaceWidgetRefreshWorkerKt;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class SpaceProposalPresentationJson$$serializer implements C9cd<SpaceProposalPresentationJson> {
    public static final int $stable = 0;
    public static final SpaceProposalPresentationJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final SpaceProposalPresentationJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = SpaceProposalPresentationJson.$childSerializers;
        String strA8f = null;
        String strA8f2 = null;
        String strA8f3 = null;
        List listA0P = null;
        String strA8f4 = null;
        String strA8f5 = null;
        String strA8f6 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new SpaceProposalPresentationJson(i, strA8f, strA8f2, strA8f3, listA0P, strA8f4, strA8f5, strA8f6, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA8f2 = c9j4A55.A8f(c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    strA8f3 = c9j4A55.A8f(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 3);
                    i |= 8;
                    break;
                case 4:
                    strA8f4 = c9j4A55.A8f(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    strA8f5 = c9j4A55.A8f(c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    strA8f6 = c9j4A55.A8f(c9iZ, 6);
                    i |= 64;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        SpaceProposalPresentationJson$$serializer spaceProposalPresentationJson$$serializer = new SpaceProposalPresentationJson$$serializer();
        INSTANCE = spaceProposalPresentationJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.SpaceProposalPresentationJson", spaceProposalPresentationJson$$serializer, 7);
        c9iKA1C.A08("name", true);
        C60O.A1V(SpaceWidgetRefreshWorkerKt.KEY_SLUG, c9iKA1C, true);
        c9iKA1C.A08("features", true);
        c9iKA1C.A08("image_url", true);
        c9iKA1C.A08("constructionStatus", true);
        c9iKA1C.A08("construction_status", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = SpaceProposalPresentationJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, C3cH.A12(f0cArr), c07779iq, c07779iq, c07779iq};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, SpaceProposalPresentationJson spaceProposalPresentationJson) {
        AnonymousClass003.A0u(interfaceC07789is, spaceProposalPresentationJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        SpaceProposalPresentationJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(spaceProposalPresentationJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
