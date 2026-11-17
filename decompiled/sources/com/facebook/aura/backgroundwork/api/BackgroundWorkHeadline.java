package com.facebook.aura.backgroundwork.api;

import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class BackgroundWorkHeadline extends C06G {
    public final BackgroundWorkContent content;
    public final int othersCount;

    public BackgroundWorkHeadline(BackgroundWorkContent backgroundWorkContent, int i) {
        C7384Etj.A0Y(backgroundWorkContent, 0);
        this.content = backgroundWorkContent;
        this.othersCount = i;
    }

    public final BackgroundWorkHeadline copy(BackgroundWorkContent backgroundWorkContent, int i) {
        C7384Etj.A0Y(backgroundWorkContent, 0);
        return new BackgroundWorkHeadline(backgroundWorkContent, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BackgroundWorkHeadline) {
                BackgroundWorkHeadline backgroundWorkHeadline = (BackgroundWorkHeadline) obj;
                if (!C7384Etj.areEqual(this.content, backgroundWorkHeadline.content) || this.othersCount != backgroundWorkHeadline.othersCount) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ BackgroundWorkHeadline copy$default(BackgroundWorkHeadline backgroundWorkHeadline, BackgroundWorkContent backgroundWorkContent, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            backgroundWorkContent = backgroundWorkHeadline.content;
        }
        if ((i2 & 2) != 0) {
            i = backgroundWorkHeadline.othersCount;
        }
        C7384Etj.A0Y(backgroundWorkContent, 0);
        return new BackgroundWorkHeadline(backgroundWorkContent, i);
    }

    public final BackgroundWorkContent component1() {
        return this.content;
    }

    public final int component2() {
        return this.othersCount;
    }

    public final BackgroundWorkContent getContent() {
        return this.content;
    }

    public final int getOthersCount() {
        return this.othersCount;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.content) + this.othersCount;
    }

    public String toString() {
        return super.toString();
    }
}
