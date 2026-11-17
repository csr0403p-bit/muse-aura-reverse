package com.facebook.aura.email.viewmodel;

import X.AEs;
import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.BLG;
import X.C1BN;
import X.C3Pi;
import X.C7384Etj;
import X.C9286GCn;
import X.HnJ;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.email.repo.EmailRepository;
import com.facebook.aura.utils.HatchUtils;

/* loaded from: classes.dex */
public final class EmailEnvironmentViewModel extends AEs {
    public final BLG<EmailEnvironmentState> _state;
    public final EmailRepository repository;
    public final C1BN<EmailEnvironmentState> state;
    public final AbstractC3358CGz userSession;

    public final class Factory extends AuraViewModelFactory<EmailEnvironmentViewModel> {
        public final AbstractC3358CGz session;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.session = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public EmailEnvironmentViewModel create() {
            AbstractC3358CGz abstractC3358CGz = this.session;
            return new EmailEnvironmentViewModel(abstractC3358CGz, EmailRepository.Companion.getInstance(abstractC3358CGz));
        }
    }

    private final EmailEnvironmentState readEnvironment() {
        String hatcheryVMId = this.repository.prefs.getHatcheryVMId();
        return new EmailEnvironmentState(hatcheryVMId, hatcheryVMId == null ? EmailError.LOAD : !HatchUtils.INSTANCE.isEmailEnabled(this.userSession) ? EmailError.NOT_ENABLED : null);
    }

    public final C1BN<EmailEnvironmentState> getState() {
        return this.state;
    }

    public final void refresh() {
        this._state.Af8(readEnvironment());
    }

    public EmailEnvironmentViewModel(AbstractC3358CGz abstractC3358CGz, EmailRepository emailRepository) {
        AnonymousClass003.A0u(abstractC3358CGz, emailRepository);
        this.userSession = abstractC3358CGz;
        this.repository = emailRepository;
        C9286GCn c9286GCnA01 = HnJ.A01(readEnvironment());
        this._state = c9286GCnA01;
        this.state = C3Pi.A00(c9286GCnA01);
    }
}
