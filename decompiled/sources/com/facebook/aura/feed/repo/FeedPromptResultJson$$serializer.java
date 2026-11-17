package com.facebook.aura.feed.repo;

import X.AnonymousClass003;
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
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class FeedPromptResultJson$$serializer implements C9cd<FeedPromptResultJson> {
    public static final int $stable = 0;
    public static final FeedPromptResultJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final FeedPromptResultJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        FeedPromptJson feedPromptJson = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new FeedPromptResultJson(i, feedPromptJson, (C2hx) null);
            }
            if (iA8N != 0) {
                throw C3cG.A17(iA8N);
            }
            feedPromptJson = (FeedPromptJson) c9j4A55.A8Z(FeedPromptJson$$serializer.INSTANCE, c9iZ, 0);
            i = 1;
        }
    }

    static {
        FeedPromptResultJson$$serializer feedPromptResultJson$$serializer = new FeedPromptResultJson$$serializer();
        INSTANCE = feedPromptResultJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.feed.repo.FeedPromptResultJson", feedPromptResultJson$$serializer, 1);
        c9iKA1C.A08("prompt", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cG.A1a(FeedPromptJson$$serializer.INSTANCE);
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
    public final void serialize(InterfaceC07789is interfaceC07789is, FeedPromptResultJson feedPromptResultJson) {
        AnonymousClass003.A0u(interfaceC07789is, feedPromptResultJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        FeedPromptResultJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_feed_repo_repo(feedPromptResultJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
