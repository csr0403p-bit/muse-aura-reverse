package com.facebook.aura.confidentialvm.repository;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class ConfidentialVmPinReminderContext extends C06G {
    public final String reminderId;
    public final long stateRevision;
    public final String updateId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmPinReminderContext) {
                ConfidentialVmPinReminderContext confidentialVmPinReminderContext = (ConfidentialVmPinReminderContext) obj;
                if (!C7384Etj.areEqual(this.reminderId, confidentialVmPinReminderContext.reminderId) || !C7384Etj.areEqual(this.updateId, confidentialVmPinReminderContext.updateId) || this.stateRevision != confidentialVmPinReminderContext.stateRevision) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConfidentialVmPinReminderContext copy$default(ConfidentialVmPinReminderContext confidentialVmPinReminderContext, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confidentialVmPinReminderContext.reminderId;
        }
        if ((i & 2) != 0) {
            str2 = confidentialVmPinReminderContext.updateId;
        }
        if ((i & 4) != 0) {
            j = confidentialVmPinReminderContext.stateRevision;
        }
        return confidentialVmPinReminderContext.copy(str, str2, j);
    }

    public final String component1() {
        return this.reminderId;
    }

    public final String component2() {
        return this.updateId;
    }

    public final long component3() {
        return this.stateRevision;
    }

    public final String getReminderId() {
        return this.reminderId;
    }

    public final long getStateRevision() {
        return this.stateRevision;
    }

    public final String getUpdateId() {
        return this.updateId;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.stateRevision, AnonymousClass005.A0I(this.updateId, AnonymousClass001.A0G(this.reminderId)));
    }

    public ConfidentialVmPinReminderContext(String str, String str2, long j) {
        AnonymousClass003.A0u(str, str2);
        this.reminderId = str;
        this.updateId = str2;
        this.stateRevision = j;
    }

    public final ConfidentialVmPinReminderContext copy(String str, String str2, long j) {
        AnonymousClass003.A0u(str, str2);
        return new ConfidentialVmPinReminderContext(str, str2, j);
    }

    public String toString() {
        return super.toString();
    }
}
