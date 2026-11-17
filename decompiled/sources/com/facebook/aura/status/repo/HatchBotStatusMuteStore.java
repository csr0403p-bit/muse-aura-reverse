package com.facebook.aura.status.repo;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3Pi;
import X.C3cG;
import X.C7384Etj;
import X.C9286GCn;
import X.InterfaceC7549F2g;
import com.facebook.aura.utils.HatchUtil;

/* loaded from: classes3.dex */
public final class HatchBotStatusMuteStore implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final BLG<Long> _userSendCount;
    public final C1BN<Long> userSendCount;

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        AnonymousClass002.A1I(this._userSendCount, 0L);
    }

    public final C1BN<Long> getUserSendCount() {
        return this.userSendCount;
    }

    public final void onUserMessageSent() {
        Long value;
        if (HatchUtil.INSTANCE.unmuteDisconnectedOnSend()) {
            BLG<Long> blg = this._userSendCount;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, Long.valueOf(C3cG.A05(value) + 1)));
        }
    }

    public final class Companion {
        public final HatchBotStatusMuteStore getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchBotStatusMuteStore) abstractC3358CGz.A03(HatchBotStatusMuteStore.class, HatchBotStatusMuteStore$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ HatchBotStatusMuteStore(C06H c06h) {
        this();
    }

    public HatchBotStatusMuteStore() {
        C9286GCn c9286GCnA14 = C3cG.A14(0L);
        this._userSendCount = c9286GCnA14;
        this.userSendCount = C3Pi.A00(c9286GCnA14);
    }
}
