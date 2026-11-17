package com.facebook.aura.user.provider;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3cG;
import X.C7384Etj;
import X.C9286GCn;
import X.InterfaceC7549F2g;
import com.facebook.aura.activation.data.HatchActivationWaitlistInviteCopy;

/* loaded from: classes2.dex */
public final class HatchActivationWaitlistInviteCopyStore implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final BLG<HatchActivationWaitlistInviteCopy> _copy;
    public final C1BN<HatchActivationWaitlistInviteCopy> copy;

    public final void update(HatchActivationWaitlistInviteCopy hatchActivationWaitlistInviteCopy) {
        C7384Etj.A0Y(hatchActivationWaitlistInviteCopy, 0);
        AnonymousClass002.A1I(this._copy, hatchActivationWaitlistInviteCopy);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this._copy.Af8(null);
    }

    public final C1BN<HatchActivationWaitlistInviteCopy> getCopy() {
        return this.copy;
    }

    public final class Companion {
        public final HatchActivationWaitlistInviteCopyStore getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchActivationWaitlistInviteCopyStore) abstractC3358CGz.A03(HatchActivationWaitlistInviteCopyStore.class, HatchActivationWaitlistInviteCopyStore$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ HatchActivationWaitlistInviteCopyStore(C06H c06h) {
        this();
    }

    public HatchActivationWaitlistInviteCopyStore() {
        C9286GCn c9286GCnA13 = C3cG.A13();
        this._copy = c9286GCnA13;
        this.copy = C3cG.A11(c9286GCnA13);
    }
}
