package com.facebook.aura.email.model;

import X.C06H;
import X.C7384Etj;
import X.Ey9;
import X.F3w;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class EmailMailboxRestriction {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ EmailMailboxRestriction[] $VALUES;
    public static final Companion Companion;
    public static final EmailMailboxRestriction SENDER_NAME_CHANGE_REQUIRED;
    public static final EmailMailboxRestriction TAKEN_DOWN;
    public final String wireValue;

    static {
        EmailMailboxRestriction emailMailboxRestriction = new EmailMailboxRestriction("SENDER_NAME_CHANGE_REQUIRED", 0, "SENDER_NAME_CHANGE_REQUIRED");
        SENDER_NAME_CHANGE_REQUIRED = emailMailboxRestriction;
        EmailMailboxRestriction emailMailboxRestriction2 = new EmailMailboxRestriction("TAKEN_DOWN", 1, "TAKEN_DOWN");
        TAKEN_DOWN = emailMailboxRestriction2;
        EmailMailboxRestriction[] emailMailboxRestrictionArr = {emailMailboxRestriction, emailMailboxRestriction2};
        $VALUES = emailMailboxRestrictionArr;
        $ENTRIES = new F3w(emailMailboxRestrictionArr);
        Companion = new Companion();
    }

    public static Ey9<EmailMailboxRestriction> getEntries() {
        return $ENTRIES;
    }

    public static EmailMailboxRestriction valueOf(String str) {
        return (EmailMailboxRestriction) Enum.valueOf(EmailMailboxRestriction.class, str);
    }

    public static EmailMailboxRestriction[] values() {
        return (EmailMailboxRestriction[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public final class Companion {
        public final EmailMailboxRestriction fromWire(String str) {
            EmailMailboxRestriction next;
            C7384Etj.A0Y(str, 0);
            Iterator<EmailMailboxRestriction> it = EmailMailboxRestriction.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (str.equals(next.getWireValue())) {
                    break;
                }
            }
            return next;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public EmailMailboxRestriction(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
