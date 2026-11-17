package com.facebook.aura.email.keys;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class EmailAttachmentKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final int attachmentIndex;
    public final String environmentId;
    public final String messageId;

    public final class Companion {
        public final C9hr<EmailAttachmentKey> serializer() {
            return EmailAttachmentKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_keys_keys(EmailAttachmentKey emailAttachmentKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(emailAttachmentKey.environmentId, c9iZ, 0);
        c9j5.AAV(emailAttachmentKey.messageId, c9iZ, 1);
        c9j5.AAK(c9iZ, 2, emailAttachmentKey.attachmentIndex);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailAttachmentKey) {
                EmailAttachmentKey emailAttachmentKey = (EmailAttachmentKey) obj;
                if (!C7384Etj.areEqual(this.environmentId, emailAttachmentKey.environmentId) || !C7384Etj.areEqual(this.messageId, emailAttachmentKey.messageId) || this.attachmentIndex != emailAttachmentKey.attachmentIndex) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailAttachmentKey copy$default(EmailAttachmentKey emailAttachmentKey, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = emailAttachmentKey.environmentId;
        }
        if ((i2 & 2) != 0) {
            str2 = emailAttachmentKey.messageId;
        }
        if ((i2 & 4) != 0) {
            i = emailAttachmentKey.attachmentIndex;
        }
        return emailAttachmentKey.copy(str, str2, i);
    }

    public final String component1() {
        return this.environmentId;
    }

    public final String component2() {
        return this.messageId;
    }

    public final int component3() {
        return this.attachmentIndex;
    }

    public final int getAttachmentIndex() {
        return this.attachmentIndex;
    }

    public final String getEnvironmentId() {
        return this.environmentId;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.messageId, AnonymousClass001.A0G(this.environmentId)) + this.attachmentIndex;
    }

    public EmailAttachmentKey(String str, String str2, int i) {
        AnonymousClass003.A0u(str, str2);
        this.environmentId = str;
        this.messageId = str2;
        this.attachmentIndex = i;
    }

    public final EmailAttachmentKey copy(String str, String str2, int i) {
        AnonymousClass003.A0u(str, str2);
        return new EmailAttachmentKey(str, str2, i);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailAttachmentKey(int i, String str, String str2, int i2, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(EmailAttachmentKey$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.environmentId = str;
        this.messageId = str2;
        this.attachmentIndex = i2;
    }
}
