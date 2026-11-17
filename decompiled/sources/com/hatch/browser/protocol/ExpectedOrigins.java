package com.hatch.browser.protocol;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06H;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes6.dex */
public final class ExpectedOrigins {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public String frameOrigin;
    public String pageOrigin;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ExpectedOrigins) {
                ExpectedOrigins expectedOrigins = (ExpectedOrigins) obj;
                if (!C7384Etj.areEqual(this.pageOrigin, expectedOrigins.pageOrigin) || !C7384Etj.areEqual(this.frameOrigin, expectedOrigins.frameOrigin)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setFrameOrigin(String str) {
        C7384Etj.A0Y(str, 0);
        this.frameOrigin = str;
    }

    public final void setPageOrigin(String str) {
        C7384Etj.A0Y(str, 0);
        this.pageOrigin = str;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ ExpectedOrigins copy$default(ExpectedOrigins expectedOrigins, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = expectedOrigins.pageOrigin;
        }
        if ((i & 2) != 0) {
            str2 = expectedOrigins.frameOrigin;
        }
        AnonymousClass003.A0u(str, str2);
        return new ExpectedOrigins(str, str2);
    }

    public final String component1() {
        return this.pageOrigin;
    }

    public final String component2() {
        return this.frameOrigin;
    }

    public final String getFrameOrigin() {
        return this.frameOrigin;
    }

    public final String getPageOrigin() {
        return this.pageOrigin;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.frameOrigin, AnonymousClass001.A0G(this.pageOrigin));
    }

    public String toString() {
        return FGI.A0c("ExpectedOrigins(pageOrigin=", this.pageOrigin, ", frameOrigin=", this.frameOrigin);
    }

    public ExpectedOrigins(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.pageOrigin = str;
        this.frameOrigin = str2;
    }

    public final ExpectedOrigins copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new ExpectedOrigins(str, str2);
    }
}
