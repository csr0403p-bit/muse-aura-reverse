package com.facebook.aura.email.viewmodel;

import X.AEs;
import X.C7384Etj;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;

/* loaded from: classes.dex */
public final class EmailThreadSessionViewModel extends AEs {
    public EmailThreadExit exit = EmailThreadExit.SWIPE;
    public String threadId;

    public final class Factory extends AuraViewModelFactory<EmailThreadSessionViewModel> {
        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new EmailThreadSessionViewModel();
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public EmailThreadSessionViewModel create() {
            return new EmailThreadSessionViewModel();
        }
    }

    public final void bind(String str) {
        C7384Etj.A0Y(str, 0);
        this.threadId = str;
    }

    public final void recordExit(EmailThreadExit emailThreadExit) {
        C7384Etj.A0Y(emailThreadExit, 0);
        this.exit = emailThreadExit;
    }

    @Override // X.AEs
    public void onCleared() {
        String str = this.threadId;
        if (str != null) {
            EmailEventLogger.INSTANCE.threadClosed(str, this.exit);
        }
    }
}
