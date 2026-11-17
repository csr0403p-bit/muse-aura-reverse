package com.facebook.aura.threadvoicecaption;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class ThreadAssistantCaption extends C06G {
    public final String messageId;
    public final String text;
    public final String threadId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ThreadAssistantCaption) {
                ThreadAssistantCaption threadAssistantCaption = (ThreadAssistantCaption) obj;
                if (!C7384Etj.areEqual(this.messageId, threadAssistantCaption.messageId) || !C7384Etj.areEqual(this.text, threadAssistantCaption.text) || !C7384Etj.areEqual(this.threadId, threadAssistantCaption.threadId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ThreadAssistantCaption copy$default(ThreadAssistantCaption threadAssistantCaption, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = threadAssistantCaption.messageId;
        }
        if ((i & 2) != 0) {
            str2 = threadAssistantCaption.text;
        }
        if ((i & 4) != 0) {
            str3 = threadAssistantCaption.threadId;
        }
        return threadAssistantCaption.copy(str, str2, str3);
    }

    public final String component1() {
        return this.messageId;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.threadId;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getText() {
        return this.text;
    }

    public final String getThreadId() {
        return this.threadId;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.text, AnonymousClass001.A0G(this.messageId)) + AnonymousClass006.A0G(this.threadId);
    }

    public ThreadAssistantCaption(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.messageId = str;
        this.text = str2;
        this.threadId = str3;
    }

    public final ThreadAssistantCaption copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new ThreadAssistantCaption(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }
}
