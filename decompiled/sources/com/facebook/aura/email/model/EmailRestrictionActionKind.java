package com.facebook.aura.email.model;

import X.C06H;
import X.C7384Etj;
import X.Ey9;
import X.F3w;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class EmailRestrictionActionKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ EmailRestrictionActionKind[] $VALUES;
    public static final EmailRestrictionActionKind CREATE_EMAIL;
    public static final Companion Companion;
    public static final EmailRestrictionActionKind EDIT_SENDER_NAME;
    public final String wireValue;

    static {
        EmailRestrictionActionKind emailRestrictionActionKind = new EmailRestrictionActionKind("EDIT_SENDER_NAME", 0, "edit_sender_name");
        EDIT_SENDER_NAME = emailRestrictionActionKind;
        EmailRestrictionActionKind emailRestrictionActionKind2 = new EmailRestrictionActionKind("CREATE_EMAIL", 1, "create_email");
        CREATE_EMAIL = emailRestrictionActionKind2;
        EmailRestrictionActionKind[] emailRestrictionActionKindArr = {emailRestrictionActionKind, emailRestrictionActionKind2};
        $VALUES = emailRestrictionActionKindArr;
        $ENTRIES = new F3w(emailRestrictionActionKindArr);
        Companion = new Companion();
    }

    public static Ey9<EmailRestrictionActionKind> getEntries() {
        return $ENTRIES;
    }

    public static EmailRestrictionActionKind valueOf(String str) {
        return (EmailRestrictionActionKind) Enum.valueOf(EmailRestrictionActionKind.class, str);
    }

    public static EmailRestrictionActionKind[] values() {
        return (EmailRestrictionActionKind[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public final class Companion {
        public final EmailRestrictionActionKind fromWire(String str) {
            EmailRestrictionActionKind next;
            C7384Etj.A0Y(str, 0);
            Iterator<EmailRestrictionActionKind> it = EmailRestrictionActionKind.getEntries().iterator();
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

    public EmailRestrictionActionKind(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
