package com.facebook.aura.localbrowser;

import X.AnonymousClass001;
import X.C0KA;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class LocalBrowserPopupFact {
    public static final int $stable = 0;
    public final String host;
    public final boolean shown;

    public LocalBrowserPopupFact(boolean z, String str) {
        C7384Etj.A0Y(str, 1);
        this.shown = z;
        this.host = str;
    }

    public final LocalBrowserPopupFact copy(boolean z, String str) {
        C7384Etj.A0Y(str, 1);
        return new LocalBrowserPopupFact(z, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocalBrowserPopupFact) {
                LocalBrowserPopupFact localBrowserPopupFact = (LocalBrowserPopupFact) obj;
                if (this.shown != localBrowserPopupFact.shown || !C7384Etj.areEqual(this.host, localBrowserPopupFact.host)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LocalBrowserPopupFact copy$default(LocalBrowserPopupFact localBrowserPopupFact, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = localBrowserPopupFact.shown;
        }
        if ((i & 2) != 0) {
            str = localBrowserPopupFact.host;
        }
        C7384Etj.A0Y(str, 1);
        return new LocalBrowserPopupFact(z, str);
    }

    public final boolean component1() {
        return this.shown;
    }

    public final String component2() {
        return this.host;
    }

    public final String getHost() {
        return this.host;
    }

    public final boolean getShown() {
        return this.shown;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.host, C0KA.A02(this.shown));
    }

    public String toString() {
        boolean z = this.shown;
        String str = this.host;
        StringBuilder sb = new StringBuilder("LocalBrowserPopupFact(shown=");
        sb.append(z);
        return C3cJ.A0N(", host=", str, sb);
    }
}
