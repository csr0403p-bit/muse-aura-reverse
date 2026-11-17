package com.facebook.aura.email.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class EmailAttachmentFile extends C06G {
    public final String filename;
    public final String uri;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailAttachmentFile) {
                EmailAttachmentFile emailAttachmentFile = (EmailAttachmentFile) obj;
                if (!C7384Etj.areEqual(this.uri, emailAttachmentFile.uri) || !C7384Etj.areEqual(this.filename, emailAttachmentFile.filename)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailAttachmentFile copy$default(EmailAttachmentFile emailAttachmentFile, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailAttachmentFile.uri;
        }
        if ((i & 2) != 0) {
            str2 = emailAttachmentFile.filename;
        }
        AnonymousClass003.A0u(str, str2);
        return new EmailAttachmentFile(str, str2);
    }

    public final String component1() {
        return this.uri;
    }

    public final String component2() {
        return this.filename;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.filename, AnonymousClass001.A0G(this.uri));
    }

    public EmailAttachmentFile(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.uri = str;
        this.filename = str2;
    }

    public final EmailAttachmentFile copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new EmailAttachmentFile(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
