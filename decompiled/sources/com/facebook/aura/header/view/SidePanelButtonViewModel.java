package com.facebook.aura.header.view;

import X.AEs;
import X.AbstractC3358CGz;
import X.C1BN;
import X.C3Pi;
import X.C7384Etj;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.conversation.unread.HatchUnreadThreadsRepository;

/* loaded from: classes3.dex */
public final class SidePanelButtonViewModel extends AEs {
    public static final int $stable = 8;
    public final C1BN<Boolean> hasUnreadThreads;

    public final class Factory extends AuraViewModelFactory<SidePanelButtonViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public SidePanelButtonViewModel create() {
            return new SidePanelButtonViewModel(HatchUnreadThreadsRepository.Companion.getInstance(this.userSession));
        }
    }

    public SidePanelButtonViewModel(HatchUnreadThreadsRepository hatchUnreadThreadsRepository) {
        C7384Etj.A0Y(hatchUnreadThreadsRepository, 0);
        this.hasUnreadThreads = C3Pi.A00(hatchUnreadThreadsRepository._hasUnreadThreads);
    }

    public final C1BN<Boolean> getHasUnreadThreads() {
        return this.hasUnreadThreads;
    }
}
