package com.facebook.aura.conversation.repo;

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
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchConversationHistoryReloads implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final C3Em<Unit> _requests;
    public final C22I<Unit> requests;

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
    }

    public final C22I<Unit> getRequests() {
        return this.requests;
    }

    public final void request() {
        C3cG.A1I(this._requests);
    }

    public final class Companion {
        public final HatchConversationHistoryReloads getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchConversationHistoryReloads) abstractC3358CGz.A03(HatchConversationHistoryReloads.class, HatchConversationHistoryReloads$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ HatchConversationHistoryReloads(C06H c06h) {
        this();
    }

    public HatchConversationHistoryReloads() {
        C9290GCr c9290GCrA12 = C3cG.A12(C79.A01, 0, 1);
        this._requests = c9290GCrA12;
        this.requests = C3pd.A00(c9290GCrA12);
    }
}
