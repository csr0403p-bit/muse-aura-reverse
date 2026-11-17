package com.facebook.aura.email.model;

import X.C06H;
import X.C7384Etj;
import X.Ey9;
import X.F3w;
import com.facebook.aura.permissions.defaults.ConfidentialVmSettingsJsonKt;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class EmailSendPermission {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ EmailSendPermission[] $VALUES;
    public static final EmailSendPermission ALLOW;
    public static final EmailSendPermission ASK;
    public static final Companion Companion;
    public static final EmailSendPermission DENY;
    public final String wireValue;

    static {
        EmailSendPermission emailSendPermission = new EmailSendPermission("ALLOW", 0, ConfidentialVmSettingsJsonKt.MODE_ALLOW);
        ALLOW = emailSendPermission;
        EmailSendPermission emailSendPermission2 = new EmailSendPermission("ASK", 1, "ask");
        ASK = emailSendPermission2;
        EmailSendPermission emailSendPermission3 = new EmailSendPermission("DENY", 2, ConfidentialVmSettingsJsonKt.MODE_DENY);
        DENY = emailSendPermission3;
        EmailSendPermission[] emailSendPermissionArr = {emailSendPermission, emailSendPermission2, emailSendPermission3};
        $VALUES = emailSendPermissionArr;
        $ENTRIES = new F3w(emailSendPermissionArr);
        Companion = new Companion();
    }

    public static Ey9<EmailSendPermission> getEntries() {
        return $ENTRIES;
    }

    public static EmailSendPermission valueOf(String str) {
        return (EmailSendPermission) Enum.valueOf(EmailSendPermission.class, str);
    }

    public static EmailSendPermission[] values() {
        return (EmailSendPermission[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public final class Companion {
        public final EmailSendPermission fromWire(String str) {
            EmailSendPermission next;
            C7384Etj.A0Y(str, 0);
            Iterator<EmailSendPermission> it = EmailSendPermission.getEntries().iterator();
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

    public EmailSendPermission(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
