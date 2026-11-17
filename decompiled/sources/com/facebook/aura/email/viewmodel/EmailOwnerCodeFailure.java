package com.facebook.aura.email.viewmodel;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class EmailOwnerCodeFailure extends C06G {
    public final Integer attemptsRemaining;
    public final EmailOwnerCodeError kind;

    public EmailOwnerCodeFailure(EmailOwnerCodeError emailOwnerCodeError, Integer num) {
        C7384Etj.A0Y(emailOwnerCodeError, 0);
        this.kind = emailOwnerCodeError;
        this.attemptsRemaining = num;
    }

    public final EmailOwnerCodeFailure copy(EmailOwnerCodeError emailOwnerCodeError, Integer num) {
        C7384Etj.A0Y(emailOwnerCodeError, 0);
        return new EmailOwnerCodeFailure(emailOwnerCodeError, num);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailOwnerCodeFailure) {
                EmailOwnerCodeFailure emailOwnerCodeFailure = (EmailOwnerCodeFailure) obj;
                if (this.kind != emailOwnerCodeFailure.kind || !C7384Etj.areEqual(this.attemptsRemaining, emailOwnerCodeFailure.attemptsRemaining)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailOwnerCodeFailure copy$default(EmailOwnerCodeFailure emailOwnerCodeFailure, EmailOwnerCodeError emailOwnerCodeError, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            emailOwnerCodeError = emailOwnerCodeFailure.kind;
        }
        if ((i & 2) != 0) {
            num = emailOwnerCodeFailure.attemptsRemaining;
        }
        C7384Etj.A0Y(emailOwnerCodeError, 0);
        return new EmailOwnerCodeFailure(emailOwnerCodeError, num);
    }

    public final EmailOwnerCodeError component1() {
        return this.kind;
    }

    public final Integer component2() {
        return this.attemptsRemaining;
    }

    public final Integer getAttemptsRemaining() {
        return this.attemptsRemaining;
    }

    public final EmailOwnerCodeError getKind() {
        return this.kind;
    }

    public final boolean getRequiresResend() {
        EmailOwnerCodeError emailOwnerCodeError = this.kind;
        return emailOwnerCodeError == EmailOwnerCodeError.EXPIRED || emailOwnerCodeError == EmailOwnerCodeError.INVALID;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.kind) + AnonymousClass006.A0D(this.attemptsRemaining);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailOwnerCodeFailure(EmailOwnerCodeError emailOwnerCodeError, Integer num, int i, C06H c06h) {
        this(emailOwnerCodeError, (i & 2) != 0 ? null : num);
    }
}
