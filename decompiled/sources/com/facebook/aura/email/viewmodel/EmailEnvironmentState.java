package com.facebook.aura.email.viewmodel;

import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class EmailEnvironmentState extends C06G {
    public final String environmentId;
    public final EmailError error;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailEnvironmentState) {
                EmailEnvironmentState emailEnvironmentState = (EmailEnvironmentState) obj;
                if (!C7384Etj.areEqual(this.environmentId, emailEnvironmentState.environmentId) || this.error != emailEnvironmentState.error) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailEnvironmentState copy$default(EmailEnvironmentState emailEnvironmentState, String str, EmailError emailError, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailEnvironmentState.environmentId;
        }
        if ((i & 2) != 0) {
            emailError = emailEnvironmentState.error;
        }
        return new EmailEnvironmentState(str, emailError);
    }

    public final String component1() {
        return this.environmentId;
    }

    public final EmailError component2() {
        return this.error;
    }

    public final EmailEnvironmentState copy(String str, EmailError emailError) {
        return new EmailEnvironmentState(str, emailError);
    }

    public final String getEnvironmentId() {
        return this.environmentId;
    }

    public final EmailError getError() {
        return this.error;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.environmentId) * 31) + C06G.A04(this.error);
    }

    public EmailEnvironmentState(String str, EmailError emailError) {
        this.environmentId = str;
        this.error = emailError;
    }

    public String toString() {
        return super.toString();
    }
}
