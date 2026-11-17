package com.facebook.aura.nodes.cards;

import X.AHD;
import X.AHI;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class MessagingCardData extends C06G implements HatchNodeCardData {
    public static final int $stable = 0;
    public final AHD<MessagingCardAttachment> attachments;
    public final String body;
    public final AHD<MessagingCardRecipient> recipients;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MessagingCardData) {
                MessagingCardData messagingCardData = (MessagingCardData) obj;
                if (!C7384Etj.areEqual(this.recipients, messagingCardData.recipients) || !C7384Etj.areEqual(this.body, messagingCardData.body) || !C7384Etj.areEqual(this.attachments, messagingCardData.attachments)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessagingCardData copy$default(MessagingCardData messagingCardData, AHD ahd, String str, AHD ahd2, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = messagingCardData.recipients;
        }
        if ((i & 2) != 0) {
            str = messagingCardData.body;
        }
        if ((i & 4) != 0) {
            ahd2 = messagingCardData.attachments;
        }
        return messagingCardData.copy(ahd, str, ahd2);
    }

    public final AHD<MessagingCardRecipient> component1() {
        return this.recipients;
    }

    public final String component2() {
        return this.body;
    }

    public final AHD<MessagingCardAttachment> component3() {
        return this.attachments;
    }

    public final AHD<MessagingCardAttachment> getAttachments() {
        return this.attachments;
    }

    public final String getBody() {
        return this.body;
    }

    public final AHD<MessagingCardRecipient> getRecipients() {
        return this.recipients;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.attachments, AnonymousClass005.A0I(this.body, AnonymousClass005.A0E(this.recipients)));
    }

    public MessagingCardData(AHD<MessagingCardRecipient> ahd, String str, AHD<MessagingCardAttachment> ahd2) {
        AnonymousClass005.A0x(ahd, str, ahd2);
        this.recipients = ahd;
        this.body = str;
        this.attachments = ahd2;
    }

    public final MessagingCardData copy(AHD<MessagingCardRecipient> ahd, String str, AHD<MessagingCardAttachment> ahd2) {
        AnonymousClass005.A0x(ahd, str, ahd2);
        return new MessagingCardData(ahd, str, ahd2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MessagingCardData(AHD ahd, String str, AHD ahd2, int i, C06H c06h) {
        this(ahd, str, (i & 4) != 0 ? AHI.A01 : ahd2);
    }
}
