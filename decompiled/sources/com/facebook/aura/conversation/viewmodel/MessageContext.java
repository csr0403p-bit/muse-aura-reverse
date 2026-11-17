package com.facebook.aura.conversation.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class MessageContext extends C06G {
    public static final int $stable = 0;
    public final String eyebrow;
    public final String title;

    public MessageContext(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.title = str;
        this.eyebrow = str2;
    }

    public final MessageContext copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new MessageContext(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MessageContext) {
                MessageContext messageContext = (MessageContext) obj;
                if (!C7384Etj.areEqual(this.title, messageContext.title) || !C7384Etj.areEqual(this.eyebrow, messageContext.eyebrow)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MessageContext copy$default(MessageContext messageContext, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageContext.title;
        }
        if ((i & 2) != 0) {
            str2 = messageContext.eyebrow;
        }
        C7384Etj.A0Y(str, 0);
        return new MessageContext(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.eyebrow;
    }

    public final String getEyebrow() {
        return this.eyebrow;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.title) + AnonymousClass006.A0G(this.eyebrow);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MessageContext(String str, String str2, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2));
    }
}
