package com.facebook.aura.feed.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C07839ix;
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
import X.C9j1;
import X.C9j4;
import X.C9j5;
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class FeedUnitJson$$serializer implements C9cd<FeedUnitJson> {
    public static final int $stable = 0;
    public static final FeedUnitJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final FeedUnitJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = FeedUnitJson.$childSerializers;
        C2hx c2hx = null;
        String strA0f = null;
        String strA0g = null;
        String strA0g2 = null;
        List list = null;
        String strA0g3 = null;
        FeedAttachmentJson feedAttachmentJson = null;
        String str = null;
        FeedIdeaActionJson feedIdeaActionJson = null;
        String strA0f2 = null;
        String strA0f3 = null;
        Long l = null;
        String strA0i = null;
        String strA8f = null;
        String strA8f2 = null;
        String strA8f3 = null;
        String strA8f4 = null;
        String strA8f5 = null;
        String strA8f6 = null;
        long jA8X = 0;
        int i2 = 0;
        int iA8U = 0;
        boolean zA8G = false;
        String strA8f7 = null;
        int iA8U2 = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new FeedUnitJson(i2, strA8f7, strA0f, strA0i, strA8f, strA8f2, jA8X, iA8U, strA8f3, str, strA8f4, feedAttachmentJson, strA8f5, strA0g2, zA8G, list, strA0g, iA8U2, strA8f6, l, strA0f3, strA0g3, strA0f2, feedIdeaActionJson, c2hx);
                case 0:
                    strA8f7 = c9j4A55.A8f(c9iZ, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strA0f = C3cI.A0f(c9iZ, c9j4A55);
                    i2 |= 2;
                    continue;
                case 2:
                    strA0i = C3cH.A0i(c9iZ, c9j4A55);
                    i2 |= 4;
                    continue;
                case 3:
                    strA8f = c9j4A55.A8f(c9iZ, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    strA8f2 = c9j4A55.A8f(c9iZ, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    jA8X = c9j4A55.A8X(c9iZ, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    iA8U = c9j4A55.A8U(c9iZ, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    strA8f3 = c9j4A55.A8f(c9iZ, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    str = (String) C3cI.A0U(c9iZ, c9j4A55);
                    i2 |= 256;
                    continue;
                case 9:
                    strA8f4 = c9j4A55.A8f(c9iZ, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    feedAttachmentJson = (FeedAttachmentJson) c9j4A55.A8Z(FeedAttachmentJson$$serializer.INSTANCE, c9iZ, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    strA8f5 = c9j4A55.A8f(c9iZ, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    strA0g2 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    zA8G = c9j4A55.A8G(c9iZ, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    list = (List) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 15);
                    i = 32768;
                    break;
                case 16:
                    iA8U2 = c9j4A55.A8U(c9iZ, 16);
                    i2 |= 65536;
                    continue;
                case 17:
                    strA8f6 = c9j4A55.A8f(c9iZ, 17);
                    i = 131072;
                    break;
                case 18:
                    l = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 18);
                    i = 262144;
                    break;
                case 19:
                    strA0f3 = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 19);
                    i = 524288;
                    break;
                case 20:
                    strA0g3 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 20);
                    i = 1048576;
                    break;
                case 21:
                    strA0f2 = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 21);
                    i = 2097152;
                    break;
                case 22:
                    feedIdeaActionJson = (FeedIdeaActionJson) c9j4A55.A8Z(FeedIdeaActionJson$$serializer.INSTANCE, c9iZ, 22);
                    i = 4194304;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        FeedUnitJson$$serializer feedUnitJson$$serializer = new FeedUnitJson$$serializer();
        INSTANCE = feedUnitJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.feed.repo.FeedUnitJson", feedUnitJson$$serializer, 23);
        c9iKA1C.A08("unit_id", true);
        c9iKA1C.A08("prompt_id", true);
        c9iKA1C.A08("run_id", true);
        c9iKA1C.A08("edition_kind", true);
        c9iKA1C.A08("edition_local_date", true);
        c9iKA1C.A08("edition_generated_at_ms", true);
        c9iKA1C.A08(AgeCheckFunnelLogging.KEY_POSITION, true);
        C3cH.A1G("kicker", c9iKA1C, true);
        c9iKA1C.A08("body_md", true);
        c9iKA1C.A08("attachment", true);
        c9iKA1C.A08("category", true);
        c9iKA1C.A08("connector_attribution", true);
        c9iKA1C.A08("is_reflective", true);
        c9iKA1C.A08("stats", true);
        c9iKA1C.A08("reaction", true);
        c9iKA1C.A08("discuss_count", true);
        c9iKA1C.A08("origin", true);
        c9iKA1C.A08("seen_at_ms", true);
        c9iKA1C.A08("why_did_i_see_this", true);
        c9iKA1C.A08("emoji", true);
        c9iKA1C.A08("icon_url", true);
        c9iKA1C.A08("idea_action", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = FeedUnitJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9j1 c9j1 = C9j1.A00;
        C07729ii c07729ii = C07729ii.A00;
        return new C9hr[]{c07779iq, c9hrA00, c07779iq, c07779iq, c07779iq, c9j1, c07729ii, c07779iq, AbstractC07749im.A00(c07779iq), c07779iq, AbstractC07749im.A00(FeedAttachmentJson$$serializer.INSTANCE), c07779iq, AbstractC07749im.A00(c07779iq), C07839ix.A00, C3cG.A16(f0cArr, 14), AbstractC07749im.A00(c07779iq), c07729ii, c07779iq, AbstractC07749im.A00(c9j1), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(FeedIdeaActionJson$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, FeedUnitJson feedUnitJson) {
        AnonymousClass003.A0u(interfaceC07789is, feedUnitJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        FeedUnitJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_feed_repo_repo(feedUnitJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
