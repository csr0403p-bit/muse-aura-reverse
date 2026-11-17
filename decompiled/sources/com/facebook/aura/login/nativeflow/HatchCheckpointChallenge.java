package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import java.time.LocalDate;

/* loaded from: classes.dex */
public final class HatchCheckpointChallenge extends C06G {
    public final String accountEmail;
    public final String accountName;
    public final String accountPhotoUrl;
    public final String resumeToken;
    public final LocalDate suspendedOn;
    public final String url;

    public static /* synthetic */ HatchCheckpointChallenge copy$default(HatchCheckpointChallenge hatchCheckpointChallenge, String str, String str2, String str3, String str4, LocalDate localDate, String str5, int i, Object obj) {
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        LocalDate localDate2 = localDate;
        String str10 = str5;
        if ((i & 1) != 0) {
            str6 = hatchCheckpointChallenge.url;
        }
        if ((i & 2) != 0) {
            str7 = hatchCheckpointChallenge.accountName;
        }
        if ((i & 4) != 0) {
            str8 = hatchCheckpointChallenge.accountEmail;
        }
        if ((i & 8) != 0) {
            str9 = hatchCheckpointChallenge.accountPhotoUrl;
        }
        if ((i & 16) != 0) {
            localDate2 = hatchCheckpointChallenge.suspendedOn;
        }
        if ((i & 32) != 0) {
            str10 = hatchCheckpointChallenge.resumeToken;
        }
        AnonymousClass005.A0x(str6, str7, str8);
        return new HatchCheckpointChallenge(str6, str7, str8, str9, localDate2, str10);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCheckpointChallenge) {
                HatchCheckpointChallenge hatchCheckpointChallenge = (HatchCheckpointChallenge) obj;
                if (!C7384Etj.areEqual(this.url, hatchCheckpointChallenge.url) || !C7384Etj.areEqual(this.accountName, hatchCheckpointChallenge.accountName) || !C7384Etj.areEqual(this.accountEmail, hatchCheckpointChallenge.accountEmail) || !C7384Etj.areEqual(this.accountPhotoUrl, hatchCheckpointChallenge.accountPhotoUrl) || !C7384Etj.areEqual(this.suspendedOn, hatchCheckpointChallenge.suspendedOn) || !C7384Etj.areEqual(this.resumeToken, hatchCheckpointChallenge.resumeToken)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.accountName;
    }

    public final String component3() {
        return this.accountEmail;
    }

    public final String component4() {
        return this.accountPhotoUrl;
    }

    public final LocalDate component5() {
        return this.suspendedOn;
    }

    public final String component6() {
        return this.resumeToken;
    }

    public final String getAccountEmail() {
        return this.accountEmail;
    }

    public final String getAccountName() {
        return this.accountName;
    }

    public final String getAccountPhotoUrl() {
        return this.accountPhotoUrl;
    }

    public final String getResumeToken() {
        return this.resumeToken;
    }

    public final LocalDate getSuspendedOn() {
        return this.suspendedOn;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0I(this.accountEmail, AnonymousClass005.A0I(this.accountName, AnonymousClass001.A0G(this.url))) + AnonymousClass006.A0G(this.accountPhotoUrl)) * 31) + AnonymousClass006.A0D(this.suspendedOn)) * 31) + AnonymousClass005.A0H(this.resumeToken);
    }

    public HatchCheckpointChallenge(String str, String str2, String str3, String str4, LocalDate localDate, String str5) {
        AnonymousClass005.A0x(str, str2, str3);
        this.url = str;
        this.accountName = str2;
        this.accountEmail = str3;
        this.accountPhotoUrl = str4;
        this.suspendedOn = localDate;
        this.resumeToken = str5;
    }

    public final HatchCheckpointChallenge copy(String str, String str2, String str3, String str4, LocalDate localDate, String str5) {
        AnonymousClass005.A0x(str, str2, str3);
        return new HatchCheckpointChallenge(str, str2, str3, str4, localDate, str5);
    }

    public String toString() {
        return super.toString();
    }
}
