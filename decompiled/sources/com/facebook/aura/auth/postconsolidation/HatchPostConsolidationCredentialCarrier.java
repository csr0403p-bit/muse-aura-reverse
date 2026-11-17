package com.facebook.aura.auth.postconsolidation;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV4;
import X.C06H;
import X.G0V;
import X.HtJ;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class HatchPostConsolidationCredentialCarrier {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final G0V<PostConsolidationSurvivorFrlCredential, HtJ<? super PostConsolidationCredentialRefreshResult>, Object> refresh;
    public final AtomicReference<PostConsolidationSurvivorFrlCredential> survivor;

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public final HatchPostConsolidationCredentialCarrier create(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new HatchPostConsolidationCredentialCarrier(new PostConsolidationSurvivorFrlCredential(str, str2), new HatchPostConsolidationCredentialCarrier$Companion$create$1(null));
        }

        public final HatchPostConsolidationCredentialCarrier createForTesting$fbandroid_express_aura_java_com_facebook_aura_auth_postconsolidation_postconsolidation(String str, String str2, G0V<? super PostConsolidationSurvivorFrlCredential, ? super HtJ<? super PostConsolidationCredentialRefreshResult>, ? extends Object> g0v) {
            AnonymousClass005.A0x(str, str2, g0v);
            return new HatchPostConsolidationCredentialCarrier(new PostConsolidationSurvivorFrlCredential(str, str2), g0v);
        }

        public Companion() {
        }
    }

    public final Object consume(HtJ<? super PostConsolidationCredentialRefreshResult> htJ) {
        PostConsolidationSurvivorFrlCredential andSet = this.survivor.getAndSet(null);
        if (andSet != null) {
            return this.refresh.invoke(andSet, htJ);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchPostConsolidationCredentialCarrier(PostConsolidationSurvivorFrlCredential postConsolidationSurvivorFrlCredential, G0V<? super PostConsolidationSurvivorFrlCredential, ? super HtJ<? super PostConsolidationCredentialRefreshResult>, ? extends Object> g0v) {
        this.refresh = g0v;
        this.survivor = BV4.A16(postConsolidationSurvivorFrlCredential);
    }

    public /* synthetic */ HatchPostConsolidationCredentialCarrier(PostConsolidationSurvivorFrlCredential postConsolidationSurvivorFrlCredential, G0V g0v, C06H c06h) {
        this(postConsolidationSurvivorFrlCredential, g0v);
    }
}
