package com.facebook.aura.nodes.cards;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class MessagingCardAttachment extends C06G {
    public static final int $stable = 0;
    public final String fileName;
    public final String mimeType;
    public final String path;

    public MessagingCardAttachment(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        this.path = str;
        this.fileName = str2;
        this.mimeType = str3;
    }

    public final MessagingCardAttachment copy(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        return new MessagingCardAttachment(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MessagingCardAttachment) {
                MessagingCardAttachment messagingCardAttachment = (MessagingCardAttachment) obj;
                if (!C7384Etj.areEqual(this.path, messagingCardAttachment.path) || !C7384Etj.areEqual(this.fileName, messagingCardAttachment.fileName) || !C7384Etj.areEqual(this.mimeType, messagingCardAttachment.mimeType)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MessagingCardAttachment copy$default(MessagingCardAttachment messagingCardAttachment, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messagingCardAttachment.path;
        }
        if ((i & 2) != 0) {
            str2 = messagingCardAttachment.fileName;
        }
        if ((i & 4) != 0) {
            str3 = messagingCardAttachment.mimeType;
        }
        return messagingCardAttachment.copy(str, str2, str3);
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

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.path) + AnonymousClass006.A0G(this.fileName)) * 31) + AnonymousClass005.A0H(this.mimeType);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MessagingCardAttachment(String str, String str2, String str3, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
