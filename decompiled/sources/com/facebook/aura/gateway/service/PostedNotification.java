package com.facebook.aura.gateway.service;

import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.backgroundwork.api.BackgroundWorkContent;

/* loaded from: classes2.dex */
public final class PostedNotification extends C06G {
    public final BackgroundWorkContent content;
    public final int othersCount;
    public final boolean runInBackground;

    public PostedNotification(boolean z, BackgroundWorkContent backgroundWorkContent, int i) {
        C7384Etj.A0Y(backgroundWorkContent, 1);
        this.runInBackground = z;
        this.content = backgroundWorkContent;
        this.othersCount = i;
    }

    public final PostedNotification copy(boolean z, BackgroundWorkContent backgroundWorkContent, int i) {
        C7384Etj.A0Y(backgroundWorkContent, 1);
        return new PostedNotification(z, backgroundWorkContent, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PostedNotification) {
                PostedNotification postedNotification = (PostedNotification) obj;
                if (this.runInBackground != postedNotification.runInBackground || !C7384Etj.areEqual(this.content, postedNotification.content) || this.othersCount != postedNotification.othersCount) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PostedNotification copy$default(PostedNotification postedNotification, boolean z, BackgroundWorkContent backgroundWorkContent, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = postedNotification.runInBackground;
        }
        if ((i2 & 2) != 0) {
            backgroundWorkContent = postedNotification.content;
        }
        if ((i2 & 4) != 0) {
            i = postedNotification.othersCount;
        }
        return postedNotification.copy(z, backgroundWorkContent, i);
    }

    public final boolean component1() {
        return this.runInBackground;
    }

    public final BackgroundWorkContent component2() {
        return this.content;
    }

    public final int component3() {
        return this.othersCount;
    }

    public final BackgroundWorkContent getContent() {
        return this.content;
    }

    public final int getOthersCount() {
        return this.othersCount;
    }

    public final boolean getRunInBackground() {
        return this.runInBackground;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.content, C0KA.A02(this.runInBackground)) + this.othersCount;
    }

    public String toString() {
        return super.toString();
    }
}
