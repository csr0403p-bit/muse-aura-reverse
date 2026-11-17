package com.facebook.aura.feed.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
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
import X.C9j1;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class FeedStatusJson$$serializer implements C9cd<FeedStatusJson> {
    public static final int $stable = 0;
    public static final FeedStatusJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final FeedStatusJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        Long lA0Q = null;
        String strA0w = null;
        Long lA0Q2 = null;
        String strA0w2 = null;
        String strA0j = null;
        String strA0k = null;
        Long lA0Q3 = null;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new FeedStatusJson(i, strA0w2, zA8G, strA0j, strA0k, lA0Q3, lA0Q2, strA0w, lA0Q, (C2hx) null);
                case 0:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 0);
                    i |= 1;
                    break;
                case 1:
                    zA8G = c9j4A55.A8G(c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    strA0j = C3cI.A0j(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    strA0k = C3cI.A0k(c9iZ, c9j4A55);
                    i |= 8;
                    break;
                case 4:
                    lA0Q3 = C3cI.A0Q(c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    lA0Q2 = C3cI.A0Q(c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                case 6:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 6);
                    i |= 64;
                    break;
                case 7:
                    lA0Q = C3cI.A0Q(c9iZ, c9j4A55, 7);
                    i |= 128;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        FeedStatusJson$$serializer feedStatusJson$$serializer = new FeedStatusJson$$serializer();
        INSTANCE = feedStatusJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.feed.repo.FeedStatusJson", feedStatusJson$$serializer, 8);
        c9iKA1C.A08("prompt_id", true);
        c9iKA1C.A08("refresh_in_progress", true);
        c9iKA1C.A08("run_id", true);
        c9iKA1C.A08("trigger", true);
        c9iKA1C.A08("started_at_ms", true);
        c9iKA1C.A08("next_scheduled_at_ms", true);
        c9iKA1C.A08("next_edition_kind", true);
        c9iKA1C.A08("freshest_generated_at_ms", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C07839ix c07839ix = C07839ix.A00;
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA003 = AbstractC07749im.A00(c07779iq);
        C9j1 c9j1 = C9j1.A00;
        return new C9hr[]{c9hrA00, c07839ix, c9hrA002, c9hrA003, AbstractC07749im.A00(c9j1), AbstractC07749im.A00(c9j1), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c9j1)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, FeedStatusJson feedStatusJson) {
        AnonymousClass003.A0u(interfaceC07789is, feedStatusJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        FeedStatusJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_feed_repo_repo(feedStatusJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
