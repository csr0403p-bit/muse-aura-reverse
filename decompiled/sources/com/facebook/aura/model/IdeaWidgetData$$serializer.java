package com.facebook.aura.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C5hV;
import X.C60Q;
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
import com.facebook.aura.explore.repo.IdeaCardsModelsKt;
import com.facebook.aura.gateway.ConnectorOrderCheckoutKt;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class IdeaWidgetData$$serializer implements C9cd<IdeaWidgetData> {
    public static final int $stable = 0;
    public static final IdeaWidgetData$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final IdeaWidgetData deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = IdeaWidgetData.$childSerializers;
        IdeaSharing ideaSharing = null;
        String strA0g = null;
        String strA0t = null;
        String strA0p = null;
        String strA0o = null;
        String strA0n = null;
        List list = null;
        String strA0f = null;
        String strA0s = null;
        String strA0r = null;
        String strA0q = null;
        String str = null;
        String strA0h = null;
        String strA0i = null;
        String strA0o2 = null;
        String strA8f = null;
        List list2 = null;
        String strA8f2 = null;
        int i2 = 0;
        boolean zA8G = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new IdeaWidgetData(i2, strA8f2, strA0h, strA0i, strA0o2, strA8f, strA0g, strA0n, strA0o, str, strA0p, strA0q, strA0r, strA0s, strA0t, strA0f, list, list2, zA8G, ideaSharing, (C2hx) null);
                case 0:
                    strA8f2 = c9j4A55.A8f(c9iZ, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i2 |= 2;
                    continue;
                case 2:
                    strA0i = C3cH.A0i(c9iZ, c9j4A55);
                    i2 |= 4;
                    continue;
                case 3:
                    strA0o2 = C60Q.A0o(c9iZ, c9j4A55);
                    i2 |= 8;
                    continue;
                case 4:
                    strA8f = c9j4A55.A8f(c9iZ, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    strA0n = C3cI.A0n(c9iZ, c9j4A55);
                    i2 |= 64;
                    continue;
                case 7:
                    strA0o = C3cI.A0o(c9iZ, c9j4A55);
                    i2 |= 128;
                    continue;
                case 8:
                    str = (String) C3cI.A0U(c9iZ, c9j4A55);
                    i2 |= 256;
                    continue;
                case 9:
                    strA0p = C3cI.A0p(c9iZ, c9j4A55);
                    i2 |= 512;
                    continue;
                case 10:
                    strA0q = C3cI.A0q(c9iZ, c9j4A55);
                    i2 |= 1024;
                    continue;
                case 11:
                    strA0r = C3cI.A0r(c9iZ, c9j4A55);
                    i2 |= 2048;
                    continue;
                case 12:
                    strA0s = C3cI.A0s(c9iZ, c9j4A55);
                    i2 |= 4096;
                    continue;
                case 13:
                    strA0t = C3cI.A0t(c9iZ, c9j4A55);
                    i2 |= 8192;
                    continue;
                case 14:
                    strA0f = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    list = (List) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 15);
                    i = 32768;
                    break;
                case 16:
                    list2 = (List) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 16);
                    i = 65536;
                    break;
                case 17:
                    zA8G = c9j4A55.A8G(c9iZ, 17);
                    i = 131072;
                    break;
                case 18:
                    ideaSharing = (IdeaSharing) c9j4A55.A8a(IdeaSharing$$serializer.INSTANCE, c9iZ, 18);
                    i = 262144;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        IdeaWidgetData$$serializer ideaWidgetData$$serializer = new IdeaWidgetData$$serializer();
        INSTANCE = ideaWidgetData$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.IdeaWidgetData", ideaWidgetData$$serializer, 19);
        c9iKA1C.A08("ideaId", false);
        c9iKA1C.A08("id", false);
        C3cH.A1G("kind", c9iKA1C, false);
        c9iKA1C.A08("summary", false);
        c9iKA1C.A08("rationale", true);
        c9iKA1C.A08("categoryLabel", true);
        c9iKA1C.A08("dateLabel", true);
        c9iKA1C.A08(IdeaCardsModelsKt.IDEA_FEEDBACK_LANE_KEY, true);
        c9iKA1C.A08("previewImageUrl", true);
        c9iKA1C.A08("iconUrl", true);
        c9iKA1C.A08("iconMimeType", true);
        c9iKA1C.A08("installMarkdown", true);
        c9iKA1C.A08("createdAt", true);
        c9iKA1C.A08("updatedAt", true);
        c9iKA1C.A08(ConnectorOrderCheckoutKt.ITEMS_KEY, true);
        c9iKA1C.A08("tags", true);
        c9iKA1C.A08("showDoItButton", true);
        c9iKA1C.A08("sharing", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = IdeaWidgetData.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cG.A16(f0cArr, 15), C3cG.A16(f0cArr, 16), C07839ix.A00, IdeaSharing$$serializer.INSTANCE};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, IdeaWidgetData ideaWidgetData) {
        AnonymousClass003.A0u(interfaceC07789is, ideaWidgetData);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        IdeaWidgetData.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(ideaWidgetData, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
