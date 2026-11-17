package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import java.time.LocalDate;

/* loaded from: classes.dex */
public final class HatchReactivationChallenge extends C06G {
    public final String accountName;
    public final LocalDate scheduledDeletionOn;
    public final String token;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchReactivationChallenge) {
                HatchReactivationChallenge hatchReactivationChallenge = (HatchReactivationChallenge) obj;
                if (!C7384Etj.areEqual(this.token, hatchReactivationChallenge.token) || !C7384Etj.areEqual(this.accountName, hatchReactivationChallenge.accountName) || !C7384Etj.areEqual(this.scheduledDeletionOn, hatchReactivationChallenge.scheduledDeletionOn)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchReactivationChallenge copy$default(HatchReactivationChallenge hatchReactivationChallenge, String str, String str2, LocalDate localDate, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchReactivationChallenge.token;
        }
        if ((i & 2) != 0) {
            str2 = hatchReactivationChallenge.accountName;
        }
        if ((i & 4) != 0) {
            localDate = hatchReactivationChallenge.scheduledDeletionOn;
        }
        return hatchReactivationChallenge.copy(str, str2, localDate);
    }

    public final String component1() {
        return this.token;
    }

    public final String component2() {
        return this.accountName;
    }

    public final LocalDate component3() {
        return this.scheduledDeletionOn;
    }

    public final String getAccountName() {
        return this.accountName;
    }

    public final LocalDate getScheduledDeletionOn() {
        return this.scheduledDeletionOn;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.accountName, AnonymousClass001.A0G(this.token)) + AnonymousClass006.A0D(this.scheduledDeletionOn);
    }

    public HatchReactivationChallenge(String str, String str2, LocalDate localDate) {
        AnonymousClass003.A0u(str, str2);
        this.token = str;
        this.accountName = str2;
        this.scheduledDeletionOn = localDate;
    }

    public final HatchReactivationChallenge copy(String str, String str2, LocalDate localDate) {
        AnonymousClass003.A0u(str, str2);
        return new HatchReactivationChallenge(str, str2, localDate);
    }

    public String toString() {
        return super.toString();
    }
}
