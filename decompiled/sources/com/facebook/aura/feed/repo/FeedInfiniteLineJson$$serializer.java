package com.facebook.aura.feed.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C07839ix;
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
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class FeedInfiniteLineJson$$serializer implements C9cd<FeedInfiniteLineJson> {
    public static final int $stable = 0;
    public static final FeedInfiniteLineJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final FeedInfiniteLineJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0w = null;
        String strA0w2 = null;
        FeedUnitJson feedUnitJson = null;
        boolean zA8G = false;
        int iA8U = 0;
        boolean zA8G2 = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new FeedInfiniteLineJson(i, strA0w2, feedUnitJson, zA8G2, iA8U, strA0w, zA8G, (C2hx) null);
                case 0:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 0);
                    i |= 1;
                    break;
                case 1:
                    feedUnitJson = (FeedUnitJson) c9j4A55.A8Z(FeedUnitJson$$serializer.INSTANCE, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    zA8G2 = c9j4A55.A8G(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    iA8U = c9j4A55.A8U(c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    zA8G = c9j4A55.A8G(c9iZ, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        FeedInfiniteLineJson$$serializer feedInfiniteLineJson$$serializer = new FeedInfiniteLineJson$$serializer();
        INSTANCE = feedInfiniteLineJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.feed.repo.FeedInfiniteLineJson", feedInfiniteLineJson$$serializer, 6);
        c9iKA1C.A08("unit_key", true);
        c9iKA1C.A08("unit", true);
        c9iKA1C.A08("done", true);
        C3cI.A1Q("units", c9iKA1C, true);
        c9iKA1C.A08("busy", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(FeedUnitJson$$serializer.INSTANCE);
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c9hrA00, c9hrA002, c07839ix, C07729ii.A00, AbstractC07749im.A00(c07779iq), c07839ix};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, FeedInfiniteLineJson feedInfiniteLineJson) {
        AnonymousClass003.A0u(interfaceC07789is, feedInfiniteLineJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        FeedInfiniteLineJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_feed_repo_repo(feedInfiniteLineJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
