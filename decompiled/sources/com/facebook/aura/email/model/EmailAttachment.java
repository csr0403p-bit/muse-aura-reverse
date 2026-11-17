package com.facebook.aura.email.model;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class EmailAttachment extends C06G {
    public final String contentId;
    public final String filename;
    public final int index;
    public final boolean isInline;
    public final String mimeType;
    public final long size;

    public static /* synthetic */ EmailAttachment copy$default(EmailAttachment emailAttachment, int i, String str, String str2, long j, String str3, boolean z, int i2, Object obj) {
        int i3 = i;
        String str4 = str;
        String str5 = str2;
        long j2 = j;
        String str6 = str3;
        boolean z2 = z;
        if ((i2 & 1) != 0) {
            i3 = emailAttachment.index;
        }
        if ((i2 & 2) != 0) {
            str4 = emailAttachment.filename;
        }
        if ((i2 & 4) != 0) {
            str5 = emailAttachment.mimeType;
        }
        if ((i2 & 8) != 0) {
            j2 = emailAttachment.size;
        }
        if ((i2 & 16) != 0) {
            str6 = emailAttachment.contentId;
        }
        if ((i2 & 32) != 0) {
            z2 = emailAttachment.isInline;
        }
        AnonymousClass003.A0x(str4, str5);
        return new EmailAttachment(i3, str4, str5, j2, str6, z2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailAttachment) {
                EmailAttachment emailAttachment = (EmailAttachment) obj;
                if (this.index != emailAttachment.index || !C7384Etj.areEqual(this.filename, emailAttachment.filename) || !C7384Etj.areEqual(this.mimeType, emailAttachment.mimeType) || this.size != emailAttachment.size || !C7384Etj.areEqual(this.contentId, emailAttachment.contentId) || this.isInline != emailAttachment.isInline) {
                }
            }
            return false;
        }
        return true;
    }

    public final int component1() {
        return this.index;
    }

    public final String component2() {
        return this.filename;
    }

    public final String component3() {
        return this.mimeType;
    }

    public final long component4() {
        return this.size;
    }

    public final String component5() {
        return this.contentId;
    }

    public final boolean component6() {
        return this.isInline;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final long getSize() {
        return this.size;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass006.A06(this.size, AnonymousClass005.A0I(this.mimeType, AnonymousClass005.A0I(this.filename, this.index * 31))) + AnonymousClass006.A0G(this.contentId)) * 31, this.isInline);
    }

    public final boolean isInline() {
        return this.isInline;
    }

    public EmailAttachment(int i, String str, String str2, long j, String str3, boolean z) {
        AnonymousClass003.A0x(str, str2);
        this.index = i;
        this.filename = str;
        this.mimeType = str2;
        this.size = j;
        this.contentId = str3;
        this.isInline = z;
    }

    public final EmailAttachment copy(int i, String str, String str2, long j, String str3, boolean z) {
        AnonymousClass003.A0x(str, str2);
        return new EmailAttachment(i, str, str2, j, str3, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailAttachment(int i, String str, String str2, long j, String str3, boolean z, int i2, C06H c06h) {
        this(i, str, str2, j, (i2 & 16) != 0 ? null : str3, AnonymousClass002.A1R(i2, z));
    }
}
