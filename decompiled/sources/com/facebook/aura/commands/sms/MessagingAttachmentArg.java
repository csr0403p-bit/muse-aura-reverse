package com.facebook.aura.commands.sms;

import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class MessagingAttachmentArg extends C06G {
    public final String fileName;
    public final String mimeType;
    public final String path;

    public MessagingAttachmentArg(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        this.path = str;
        this.fileName = str2;
        this.mimeType = str3;
    }

    public final MessagingAttachmentArg copy(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        return new MessagingAttachmentArg(str, str2, str3);
    }

    public static /* synthetic */ MessagingAttachmentArg copy$default(MessagingAttachmentArg messagingAttachmentArg, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messagingAttachmentArg.path;
        }
        if ((i & 2) != 0) {
            str2 = messagingAttachmentArg.fileName;
        }
        if ((i & 4) != 0) {
            str3 = messagingAttachmentArg.mimeType;
        }
        return messagingAttachmentArg.copy(str, str2, str3);
    }

    public final String component1() {
        return this.path;
    }

    public final String component2() {
        return this.fileName;
    }

    public final String component3() {
        return this.mimeType;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getPath() {
        return this.path;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MessagingAttachmentArg(String str, String str2, String str3, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
