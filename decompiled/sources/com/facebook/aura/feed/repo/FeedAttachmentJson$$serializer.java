package com.facebook.aura.feed.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07819iv;
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
public final /* synthetic */ class FeedAttachmentJson$$serializer implements C9cd<FeedAttachmentJson> {
    public static final int $stable = 0;
    public static final FeedAttachmentJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final FeedAttachmentJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = FeedAttachmentJson.$childSerializers;
        String strA0f = null;
        List list = null;
        String strA0g = null;
        String strA0r = null;
        String strA0q = null;
        Float f = null;
        String strA0o = null;
        String strA0n = null;
        String strA0p = null;
        List listA0P = null;
        String strA0m = null;
        List list2 = null;
        String strA0s = null;
        Boolean bool = null;
        String strA8f = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new FeedAttachmentJson(i, strA8f, strA0f, strA0g, listA0P, list2, strA0m, strA0n, strA0o, f, strA0p, strA0q, strA0r, strA0s, bool, list, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0f = C3cI.A0f(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0g = C3cI.A0g(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 3);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) C3cJ.A0G(c9iZ, c9j4A55, f0cArr, 4);
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
                    f = (Float) c9j4A55.A8Z(C07819iv.A00, c9iZ, 8);
                    i |= 256;
                    break;
                case 9:
                    strA0p = C3cI.A0p(c9iZ, c9j4A55);
                    i |= 512;
                    break;
                case 10:
                    strA0q = C3cI.A0q(c9iZ, c9j4A55);
                    i |= 1024;
                    break;
                case 11:
                    strA0r = C3cI.A0r(c9iZ, c9j4A55);
                    i |= 2048;
                    break;
                case 12:
                    strA0s = C3cI.A0s(c9iZ, c9j4A55);
                    i |= 4096;
                    break;
                case 13:
                    bool = (Boolean) c9j4A55.A8Z(C07839ix.A00, c9iZ, 13);
                    i |= 8192;
                    break;
                case 14:
                    list = (List) C3cJ.A0G(c9iZ, c9j4A55, f0cArr, 14);
                    i |= 16384;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        FeedAttachmentJson$$serializer feedAttachmentJson$$serializer = new FeedAttachmentJson$$serializer();
        INSTANCE = feedAttachmentJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.feed.repo.FeedAttachmentJson", feedAttachmentJson$$serializer, 15);
        boolean zA1X = C3cI.A1X(c9iKA1C);
        c9iKA1C.A08("hero_image_url", zA1X);
        c9iKA1C.A08("video_url", zA1X);
        c9iKA1C.A08("image_urls", zA1X);
        c9iKA1C.A08("media_items", zA1X);
        c9iKA1C.A08("widget_html", zA1X);
        c9iKA1C.A08("social_embed_url", zA1X);
        c9iKA1C.A08("social_thumbnail_url", zA1X);
        c9iKA1C.A08("social_thumbnail_aspect_ratio", zA1X);
        c9iKA1C.A08("social_attribution_text", zA1X);
        c9iKA1C.A08("social_post_username", zA1X);
        c9iKA1C.A08("social_source_name", zA1X);
        c9iKA1C.A08("social_source_icon_url", zA1X);
        c9iKA1C.A08("social_is_carousel", zA1X);
        c9iKA1C.A08("social_media_items", zA1X);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = FeedAttachmentJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cH.A12(f0cArr), C3cH.A14(f0cArr, 4), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(C07819iv.A00), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(C07839ix.A00), C3cH.A14(f0cArr, 14)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, FeedAttachmentJson feedAttachmentJson) {
        AnonymousClass003.A0u(interfaceC07789is, feedAttachmentJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        FeedAttachmentJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_feed_repo_repo(feedAttachmentJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
