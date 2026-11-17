package com.facebook.aura.email.model;

import X.AHD;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class EmailPage<T> extends C06G {
    public final AHD<T> data;
    public final String nextCursor;

    /* JADX WARN: Multi-variable type inference failed */
    public EmailPage(AHD<? extends T> ahd, String str) {
        C7384Etj.A0Y(ahd, 0);
        this.data = ahd;
        this.nextCursor = str;
    }

    public final EmailPage<T> copy(AHD<? extends T> ahd, String str) {
        C7384Etj.A0Y(ahd, 0);
        return new EmailPage<>(ahd, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailPage) {
                EmailPage emailPage = (EmailPage) obj;
                if (!C7384Etj.areEqual(this.data, emailPage.data) || !C7384Etj.areEqual(this.nextCursor, emailPage.nextCursor)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailPage copy$default(EmailPage emailPage, AHD ahd, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = emailPage.data;
        }
        if ((i & 2) != 0) {
            str = emailPage.nextCursor;
        }
        C7384Etj.A0Y(ahd, 0);
        return new EmailPage(ahd, str);
    }

    public final AHD<T> component1() {
        return this.data;
    }

    public final String component2() {
        return this.nextCursor;
    }

    public final AHD<T> getData() {
        return this.data;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.data) + AnonymousClass006.A0G(this.nextCursor);
    }

    public String toString() {
        return super.toString();
    }
}
