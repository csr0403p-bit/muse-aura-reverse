package com.facebook.aura.email.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class EmailRestrictionAction extends C06G {
    public final EmailRestrictionActionKind kind;
    public final String label;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailRestrictionAction) {
                EmailRestrictionAction emailRestrictionAction = (EmailRestrictionAction) obj;
                if (!C7384Etj.areEqual(this.label, emailRestrictionAction.label) || this.kind != emailRestrictionAction.kind) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailRestrictionAction copy$default(EmailRestrictionAction emailRestrictionAction, String str, EmailRestrictionActionKind emailRestrictionActionKind, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailRestrictionAction.label;
        }
        if ((i & 2) != 0) {
            emailRestrictionActionKind = emailRestrictionAction.kind;
        }
        AnonymousClass003.A0u(str, emailRestrictionActionKind);
        return new EmailRestrictionAction(str, emailRestrictionActionKind);
    }

    public final String component1() {
        return this.label;
    }

    public final EmailRestrictionActionKind component2() {
        return this.kind;
    }

    public final EmailRestrictionActionKind getKind() {
        return this.kind;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.kind, AnonymousClass001.A0G(this.label));
    }

    public EmailRestrictionAction(String str, EmailRestrictionActionKind emailRestrictionActionKind) {
        AnonymousClass003.A0u(str, emailRestrictionActionKind);
        this.label = str;
        this.kind = emailRestrictionActionKind;
    }

    public final EmailRestrictionAction copy(String str, EmailRestrictionActionKind emailRestrictionActionKind) {
        AnonymousClass003.A0u(str, emailRestrictionActionKind);
        return new EmailRestrictionAction(str, emailRestrictionActionKind);
    }

    public String toString() {
        return super.toString();
    }
}
