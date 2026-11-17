package com.facebook.aura.feed.repo;

import X.AbstractC3358CGz;
import X.C06H;
import X.C22I;
import X.C3Em;
import X.C3cG;
import X.C3pd;
import X.C7384Etj;
import X.C79;
import X.C9290GCr;
import X.InterfaceC7549F2g;

/* loaded from: classes3.dex */
public final class FeedGatewayEvents implements InterfaceC7549F2g {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final C3Em<FeedUpdatedEvent> _updates;
    public final C22I<FeedUpdatedEvent> updates;

    public final void emitUpdate$fbandroid_express_aura_java_com_facebook_aura_feed_repo_repo(FeedUpdatedEvent feedUpdatedEvent) {
        C7384Etj.A0Y(feedUpdatedEvent, 0);
        this._updates.AhV(feedUpdatedEvent);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
    }

    public final C22I<FeedUpdatedEvent> getUpdates() {
        return this.updates;
    }

    public final class Companion {
        public final FeedGatewayEvents getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (FeedGatewayEvents) abstractC3358CGz.A03(FeedGatewayEvents.class, FeedGatewayEvents$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ FeedGatewayEvents(C06H c06h) {
        this();
    }

    public FeedGatewayEvents() {
        C9290GCr c9290GCrA12 = C3cG.A12(C79.A00, 0, 8);
        this._updates = c9290GCrA12;
        this.updates = C3pd.A00(c9290GCrA12);
    }
}
