package com.facebook.aura.conversation.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ReplyPrompt extends C06G {
    public static final int $stable = 8;
    public final ReplyContext replyContext;
    public final String text;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReplyPrompt) {
                ReplyPrompt replyPrompt = (ReplyPrompt) obj;
                if (!C7384Etj.areEqual(this.replyContext, replyPrompt.replyContext) || !C7384Etj.areEqual(this.text, replyPrompt.text)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ReplyPrompt copy$default(ReplyPrompt replyPrompt, ReplyContext replyContext, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            replyContext = replyPrompt.replyContext;
        }
        if ((i & 2) != 0) {
            str = replyPrompt.text;
        }
        AnonymousClass003.A0u(replyContext, str);
        return new ReplyPrompt(replyContext, str);
    }

    public final ReplyContext component1() {
        return this.replyContext;
    }

    public final String component2() {
        return this.text;
    }

    public final ReplyContext getReplyContext() {
        return this.replyContext;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.text, AnonymousClass005.A0E(this.replyContext));
    }

    public ReplyPrompt(ReplyContext replyContext, String str) {
        AnonymousClass003.A0u(replyContext, str);
        this.replyContext = replyContext;
        this.text = str;
    }

    public final ReplyPrompt copy(ReplyContext replyContext, String str) {
        AnonymousClass003.A0u(replyContext, str);
        return new ReplyPrompt(replyContext, str);
    }

    public String toString() {
        return super.toString();
    }
}
