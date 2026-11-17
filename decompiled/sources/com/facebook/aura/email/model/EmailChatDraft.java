package com.facebook.aura.email.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.model.ReplyAttribution;

/* loaded from: classes.dex */
public final class EmailChatDraft extends C06G {
    public final ReplyAttribution.Context attribution;
    public final String text;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailChatDraft) {
                EmailChatDraft emailChatDraft = (EmailChatDraft) obj;
                if (!C7384Etj.areEqual(this.text, emailChatDraft.text) || !C7384Etj.areEqual(this.attribution, emailChatDraft.attribution)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailChatDraft copy$default(EmailChatDraft emailChatDraft, String str, ReplyAttribution.Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailChatDraft.text;
        }
        if ((i & 2) != 0) {
            context = emailChatDraft.attribution;
        }
        AnonymousClass003.A0u(str, context);
        return new EmailChatDraft(str, context);
    }

    public final String component1() {
        return this.text;
    }

    public final ReplyAttribution.Context component2() {
        return this.attribution;
    }

    public final ReplyAttribution.Context getAttribution() {
        return this.attribution;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.attribution, AnonymousClass001.A0G(this.text));
    }

    public EmailChatDraft(String str, ReplyAttribution.Context context) {
        AnonymousClass003.A0u(str, context);
        this.text = str;
        this.attribution = context;
    }

    public final EmailChatDraft copy(String str, ReplyAttribution.Context context) {
        AnonymousClass003.A0u(str, context);
        return new EmailChatDraft(str, context);
    }

    public String toString() {
        return super.toString();
    }
}
