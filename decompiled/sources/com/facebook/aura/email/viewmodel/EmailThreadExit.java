package com.facebook.aura.email.viewmodel;

import X.Ey9;
import X.F3w;
import com.facebook.aura.gateway.HatchChatHandlerKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class EmailThreadExit {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ EmailThreadExit[] $VALUES;
    public static final EmailThreadExit CLOSE_BUTTON;
    public static final EmailThreadExit DELETED;
    public static final EmailThreadExit FORWARD;
    public static final EmailThreadExit REPLY;
    public static final EmailThreadExit SWIPE;
    public final String value;

    static {
        EmailThreadExit emailThreadExit = new EmailThreadExit("CLOSE_BUTTON", 0, "close_button");
        CLOSE_BUTTON = emailThreadExit;
        EmailThreadExit emailThreadExit2 = new EmailThreadExit("SWIPE", 1, "swipe");
        SWIPE = emailThreadExit2;
        EmailThreadExit emailThreadExit3 = new EmailThreadExit(HatchChatHandlerKt.MESSAGE_STATE_DELETED, 2, "deleted");
        DELETED = emailThreadExit3;
        EmailThreadExit emailThreadExit4 = new EmailThreadExit("REPLY", 3, "reply");
        REPLY = emailThreadExit4;
        EmailThreadExit emailThreadExit5 = new EmailThreadExit("FORWARD", 4, "forward");
        FORWARD = emailThreadExit5;
        EmailThreadExit[] emailThreadExitArr = {emailThreadExit, emailThreadExit2, emailThreadExit3, emailThreadExit4, emailThreadExit5};
        $VALUES = emailThreadExitArr;
        $ENTRIES = new F3w(emailThreadExitArr);
    }

    public static Ey9<EmailThreadExit> getEntries() {
        return $ENTRIES;
    }

    public static EmailThreadExit valueOf(String str) {
        return (EmailThreadExit) Enum.valueOf(EmailThreadExit.class, str);
    }

    public static EmailThreadExit[] values() {
        return (EmailThreadExit[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public EmailThreadExit(String str, int i, String str2) {
        this.value = str2;
    }
}
