package com.facebook.aura.email.model;

import X.AGI;
import X.AHD;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class EmailThread extends C06G {
    public final AHD<EmailMessage> messages;
    public final EmailSummary summary;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailThread) {
                EmailThread emailThread = (EmailThread) obj;
                if (!C7384Etj.areEqual(this.summary, emailThread.summary) || !C7384Etj.areEqual(this.messages, emailThread.messages)) {
                }
            }
            return false;
        }
        return true;
    }

    public final EmailThread removingMessages(Set<String> set) {
        EmailSummary emailSummaryCopy;
        C7384Etj.A0Y(set, 0);
        AHD<EmailMessage> ahd = this.messages;
        ArrayList arrayList = new ArrayList();
        for (Object obj : ahd) {
            if (!set.contains(((EmailMessage) obj).id)) {
                arrayList.add(obj);
            }
        }
        AHD ahdA07 = AGI.A07(arrayList);
        Iterator it = ahdA07.iterator();
        Object next = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                double d = ((EmailMessage) next).createdAt;
                do {
                    Object next2 = it.next();
                    double d2 = ((EmailMessage) next2).createdAt;
                    if (Double.compare(d, d2) < 0) {
                        next = next2;
                        d = d2;
                    }
                } while (it.hasNext());
            }
        }
        EmailMessage emailMessage = (EmailMessage) next;
        if (ahdA07.size() == this.messages.size() || emailMessage == null) {
            emailSummaryCopy = this.summary;
            C7384Etj.A0Y(emailSummaryCopy, 0);
        } else {
            EmailSummary emailSummary = this.summary;
            emailSummaryCopy = emailSummary.copy(emailSummary.id, emailSummary.subject, emailSummary.messageCount - (this.messages.size() - ahdA07.size()), emailMessage, emailSummary.participants);
        }
        return new EmailThread(emailSummaryCopy, ahdA07);
    }

    public static /* synthetic */ EmailThread copy$default(EmailThread emailThread, EmailSummary emailSummary, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            emailSummary = emailThread.summary;
        }
        if ((i & 2) != 0) {
            ahd = emailThread.messages;
        }
        AnonymousClass003.A0u(emailSummary, ahd);
        return new EmailThread(emailSummary, ahd);
    }

    public final EmailSummary component1() {
        return this.summary;
    }

    public final AHD<EmailMessage> component2() {
        return this.messages;
    }

    public final AHD<EmailMessage> getMessages() {
        return this.messages;
    }

    public final EmailSummary getSummary() {
        return this.summary;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.messages, AnonymousClass005.A0E(this.summary));
    }

    public EmailThread(EmailSummary emailSummary, AHD<EmailMessage> ahd) {
        AnonymousClass003.A0u(emailSummary, ahd);
        this.summary = emailSummary;
        this.messages = ahd;
    }

    public final EmailThread copy(EmailSummary emailSummary, AHD<EmailMessage> ahd) {
        AnonymousClass003.A0u(emailSummary, ahd);
        return new EmailThread(emailSummary, ahd);
    }

    public String toString() {
        return super.toString();
    }
}
