package com.facebook.aura.email.model;

import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC2159Azp;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class EmailSummary extends C06G {
    public final String id;
    public final EmailMessage lastMessage;
    public final int messageCount;
    public final AHD<String> participants;
    public final String subject;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailSummary) {
                EmailSummary emailSummary = (EmailSummary) obj;
                if (!C7384Etj.areEqual(this.id, emailSummary.id) || !C7384Etj.areEqual(this.subject, emailSummary.subject) || this.messageCount != emailSummary.messageCount || !C7384Etj.areEqual(this.lastMessage, emailSummary.lastMessage) || !C7384Etj.areEqual(this.participants, emailSummary.participants)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmailSummary copy$default(EmailSummary emailSummary, String str, String str2, int i, EmailMessage emailMessage, AHD ahd, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = emailSummary.id;
        }
        if ((i2 & 2) != 0) {
            str2 = emailSummary.subject;
        }
        if ((i2 & 4) != 0) {
            i = emailSummary.messageCount;
        }
        if ((i2 & 8) != 0) {
            emailMessage = emailSummary.lastMessage;
        }
        if ((i2 & 16) != 0) {
            ahd = emailSummary.participants;
        }
        return emailSummary.copy(str, str2, i, emailMessage, ahd);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.subject;
    }

    public final int component3() {
        return this.messageCount;
    }

    public final EmailMessage component4() {
        return this.lastMessage;
    }

    public final AHD<String> component5() {
        return this.participants;
    }

    public final String getId() {
        return this.id;
    }

    public final EmailMessage getLastMessage() {
        return this.lastMessage;
    }

    public final int getMessageCount() {
        return this.messageCount;
    }

    public final AHD<String> getParticipants() {
        return this.participants;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.AHD<java.lang.String>, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public final String getParty() {
        EmailMessage emailMessage = this.lastMessage;
        if (!"OUTBOUND".equals(emailMessage.direction)) {
            return emailMessage.getSender();
        }
        ?? arrayList = emailMessage.headerTo;
        if (arrayList.isEmpty()) {
            AHD<String> ahd = this.participants;
            arrayList = new ArrayList();
            for (Object obj : ahd) {
                if (!AbstractC2159Azp.A12((String) obj, this.lastMessage.headerFrom, true)) {
                    arrayList.add(obj);
                }
            }
        }
        List list = (List) arrayList;
        return list.isEmpty() ? this.lastMessage.getSender() : AbstractC0878AGe.A0L(", ", "", "", list, null);
    }

    public final String getSubject() {
        return this.subject;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.participants, AnonymousClass005.A0F(this.lastMessage, (AnonymousClass005.A0I(this.subject, AnonymousClass001.A0G(this.id)) + this.messageCount) * 31));
    }

    public EmailSummary(String str, String str2, int i, EmailMessage emailMessage, AHD<String> ahd) {
        AnonymousClass005.A0y(str, str2, emailMessage);
        C7384Etj.A0Y(ahd, 4);
        this.id = str;
        this.subject = str2;
        this.messageCount = i;
        this.lastMessage = emailMessage;
        this.participants = ahd;
    }

    public final EmailSummary copy(String str, String str2, int i, EmailMessage emailMessage, AHD<String> ahd) {
        AnonymousClass005.A0y(str, str2, emailMessage);
        C7384Etj.A0Y(ahd, 4);
        return new EmailSummary(str, str2, i, emailMessage, ahd);
    }

    public String toString() {
        return super.toString();
    }
}
