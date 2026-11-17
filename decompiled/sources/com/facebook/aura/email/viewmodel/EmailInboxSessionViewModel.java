package com.facebook.aura.email.viewmodel;

import X.AEs;
import X.C7384Etj;
import android.os.SystemClock;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;

/* loaded from: classes.dex */
public final class EmailInboxSessionViewModel extends AEs {
    public boolean isPageOnTop;
    public Long shownAtElapsedMs;

    public final class Factory extends AuraViewModelFactory<EmailInboxSessionViewModel> {
        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new EmailInboxSessionViewModel();
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public EmailInboxSessionViewModel create() {
            return new EmailInboxSessionViewModel();
        }
    }

    public final void onPagePushed() {
        this.isPageOnTop = true;
    }

    public final void onShown(EmailInboxEntryPoint emailInboxEntryPoint) {
        C7384Etj.A0Y(emailInboxEntryPoint, 0);
        this.isPageOnTop = false;
        if (this.shownAtElapsedMs == null) {
            this.shownAtElapsedMs = Long.valueOf(SystemClock.elapsedRealtime());
            EmailEventLogger.INSTANCE.inboxViewed(emailInboxEntryPoint);
        }
    }

    private final void end() {
        Long l = this.shownAtElapsedMs;
        if (l != null) {
            long jLongValue = l.longValue();
            this.shownAtElapsedMs = null;
            EmailEventLogger.INSTANCE.inboxExited(SystemClock.elapsedRealtime() - jLongValue);
        }
    }

    public final void onHidden() {
        if (this.isPageOnTop) {
            return;
        }
        end();
    }

    @Override // X.AEs
    public void onCleared() {
        end();
    }
}
