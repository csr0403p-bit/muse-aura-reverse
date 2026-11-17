package com.facebook.aura.conversation.widget.api;

import X.AbstractC3358CGz;
import X.C06H;
import X.C7384Etj;
import X.HxE;
import X.InterfaceC7549F2g;
import com.facebook.aura.memory.AuraByteLruCache;
import com.facebook.aura.model.JSONState;

/* loaded from: classes.dex */
public final class ConversationPresentationResolutions implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public static final int MAX_RESOLUTIONS = 32;
    public static final long RESOLUTION_WEIGHT_BYTES = 16384;
    public final AuraByteLruCache<HxE<String, JSONState>, ConversationPresentationResolution> cache;

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.cache.close();
    }

    public final AuraByteLruCache<HxE<String, JSONState>, ConversationPresentationResolution> getCache() {
        return this.cache;
    }

    public final class Companion {
        public final ConversationPresentationResolutions getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (ConversationPresentationResolutions) abstractC3358CGz.A03(ConversationPresentationResolutions.class, ConversationPresentationResolutions$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ConversationPresentationResolutions() {
        long j = 0;
        this.cache = new AuraByteLruCache<>(32, 524288L, j, false, j, ConversationPresentationResolutions$cache$1.INSTANCE, 28, null);
    }
}
