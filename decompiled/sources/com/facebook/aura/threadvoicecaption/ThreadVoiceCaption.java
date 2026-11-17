package com.facebook.aura.threadvoicecaption;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class ThreadVoiceCaption extends C06G {
    public final boolean beforeConnect;
    public final String text;
    public final String threadId;
    public final String turnId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ThreadVoiceCaption) {
                ThreadVoiceCaption threadVoiceCaption = (ThreadVoiceCaption) obj;
                if (!C7384Etj.areEqual(this.turnId, threadVoiceCaption.turnId) || !C7384Etj.areEqual(this.text, threadVoiceCaption.text) || !C7384Etj.areEqual(this.threadId, threadVoiceCaption.threadId) || this.beforeConnect != threadVoiceCaption.beforeConnect) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ThreadVoiceCaption copy$default(ThreadVoiceCaption threadVoiceCaption, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = threadVoiceCaption.turnId;
        }
        if ((i & 2) != 0) {
            str2 = threadVoiceCaption.text;
        }
        if ((i & 4) != 0) {
            str3 = threadVoiceCaption.threadId;
        }
        if ((i & 8) != 0) {
            z = threadVoiceCaption.beforeConnect;
        }
        AnonymousClass003.A0u(str, str2);
        return new ThreadVoiceCaption(str, str2, str3, z);
    }

    public final String component1() {
        return this.turnId;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.threadId;
    }

    public final boolean component4() {
        return this.beforeConnect;
    }

    public final boolean getBeforeConnect() {
        return this.beforeConnect;
    }

    public final String getText() {
        return this.text;
    }

    public final String getThreadId() {
        return this.threadId;
    }

    public final String getTurnId() {
        return this.turnId;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass005.A0I(this.text, AnonymousClass001.A0G(this.turnId)) + AnonymousClass006.A0G(this.threadId)) * 31, this.beforeConnect);
    }

    public ThreadVoiceCaption(String str, String str2, String str3, boolean z) {
        AnonymousClass003.A0u(str, str2);
        this.turnId = str;
        this.text = str2;
        this.threadId = str3;
        this.beforeConnect = z;
    }

    public final ThreadVoiceCaption copy(String str, String str2, String str3, boolean z) {
        AnonymousClass003.A0u(str, str2);
        return new ThreadVoiceCaption(str, str2, str3, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ThreadVoiceCaption(String str, String str2, String str3, boolean z, int i, C06H c06h) {
        this(str, str2, str3, (i & 8) != 0 ? false : z);
    }
}
