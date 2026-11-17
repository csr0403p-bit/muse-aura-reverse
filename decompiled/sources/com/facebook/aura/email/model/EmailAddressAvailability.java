package com.facebook.aura.email.model;

import X.Ey9;
import X.F3w;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class EmailAddressAvailability {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ EmailAddressAvailability[] $VALUES;
    public static final EmailAddressAvailability AVAILABLE;
    public static final EmailAddressAvailability CHECKING;
    public static final EmailAddressAvailability FAILED;
    public static final EmailAddressAvailability INVALID;
    public static final EmailAddressAvailability UNAVAILABLE;
    public static final EmailAddressAvailability UNKNOWN;

    static {
        EmailAddressAvailability emailAddressAvailability = new EmailAddressAvailability("UNKNOWN", 0);
        UNKNOWN = emailAddressAvailability;
        EmailAddressAvailability emailAddressAvailability2 = new EmailAddressAvailability("CHECKING", 1);
        CHECKING = emailAddressAvailability2;
        EmailAddressAvailability emailAddressAvailability3 = new EmailAddressAvailability("AVAILABLE", 2);
        AVAILABLE = emailAddressAvailability3;
        EmailAddressAvailability emailAddressAvailability4 = new EmailAddressAvailability("UNAVAILABLE", 3);
        UNAVAILABLE = emailAddressAvailability4;
        EmailAddressAvailability emailAddressAvailability5 = new EmailAddressAvailability("INVALID", 4);
        INVALID = emailAddressAvailability5;
        EmailAddressAvailability emailAddressAvailability6 = new EmailAddressAvailability(CvmMigrationStatusJson.STAGE_FAILED, 5);
        FAILED = emailAddressAvailability6;
        EmailAddressAvailability[] emailAddressAvailabilityArr = {emailAddressAvailability, emailAddressAvailability2, emailAddressAvailability3, emailAddressAvailability4, emailAddressAvailability5, emailAddressAvailability6};
        $VALUES = emailAddressAvailabilityArr;
        $ENTRIES = new F3w(emailAddressAvailabilityArr);
    }

    public static Ey9<EmailAddressAvailability> getEntries() {
        return $ENTRIES;
    }

    public static EmailAddressAvailability valueOf(String str) {
        return (EmailAddressAvailability) Enum.valueOf(EmailAddressAvailability.class, str);
    }

    public static EmailAddressAvailability[] values() {
        return (EmailAddressAvailability[]) $VALUES.clone();
    }

    public EmailAddressAvailability(String str, int i) {
    }
}
