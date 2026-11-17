package com.facebook.aura.localbrowser;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class LocalBrowserFacts {
    public static final int $stable = 0;
    public final boolean available;
    public final LocalBrowserControl control;
    public final long controlRevision;
    public final long pageRevision;
    public final String userActionRequired;

    public LocalBrowserFacts(long j, LocalBrowserControl localBrowserControl, long j2, boolean z, String str) {
        C7384Etj.A0Y(localBrowserControl, 1);
        this.controlRevision = j;
        this.control = localBrowserControl;
        this.pageRevision = j2;
        this.available = z;
        this.userActionRequired = str;
    }

    public final LocalBrowserFacts copy(long j, LocalBrowserControl localBrowserControl, long j2, boolean z, String str) {
        C7384Etj.A0Y(localBrowserControl, 1);
        return new LocalBrowserFacts(j, localBrowserControl, j2, z, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocalBrowserFacts) {
                LocalBrowserFacts localBrowserFacts = (LocalBrowserFacts) obj;
                if (this.controlRevision != localBrowserFacts.controlRevision || this.control != localBrowserFacts.control || this.pageRevision != localBrowserFacts.pageRevision || this.available != localBrowserFacts.available || !C7384Etj.areEqual(this.userActionRequired, localBrowserFacts.userActionRequired)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LocalBrowserFacts copy$default(LocalBrowserFacts localBrowserFacts, long j, LocalBrowserControl localBrowserControl, long j2, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = localBrowserFacts.controlRevision;
        }
        if ((i & 2) != 0) {
            localBrowserControl = localBrowserFacts.control;
        }
        if ((i & 4) != 0) {
            j2 = localBrowserFacts.pageRevision;
        }
        if ((i & 8) != 0) {
            z = localBrowserFacts.available;
        }
        if ((i & 16) != 0) {
            str = localBrowserFacts.userActionRequired;
        }
        return localBrowserFacts.copy(j, localBrowserControl, j2, z, str);
    }

    public final long component1() {
        return this.controlRevision;
    }

    public final LocalBrowserControl component2() {
        return this.control;
    }

    public final long component3() {
        return this.pageRevision;
    }

    public final boolean component4() {
        return this.available;
    }

    public final String component5() {
        return this.userActionRequired;
    }

    public final boolean getAvailable() {
        return this.available;
    }

    public final LocalBrowserControl getControl() {
        return this.control;
    }

    public final long getControlRevision() {
        return this.controlRevision;
    }

    public final long getPageRevision() {
        return this.pageRevision;
    }

    public final String getUserActionRequired() {
        return this.userActionRequired;
    }

    public int hashCode() {
        return C0KA.A01(AnonymousClass006.A06(this.pageRevision, AnonymousClass005.A0F(this.control, C3cG.A02(this.controlRevision) * 31)), this.available) + AnonymousClass006.A0G(this.userActionRequired);
    }

    public String toString() {
        long j = this.controlRevision;
        LocalBrowserControl localBrowserControl = this.control;
        long j2 = this.pageRevision;
        boolean z = this.available;
        String str = this.userActionRequired;
        StringBuilder sb = new StringBuilder("LocalBrowserFacts(controlRevision=");
        sb.append(j);
        sb.append(", control=");
        sb.append(localBrowserControl);
        sb.append(", pageRevision=");
        sb.append(j2);
        sb.append(", available=");
        sb.append(z);
        return C3cJ.A0N(", userActionRequired=", str, sb);
    }

    public /* synthetic */ LocalBrowserFacts(long j, LocalBrowserControl localBrowserControl, long j2, boolean z, String str, int i, C06H c06h) {
        this(j, localBrowserControl, j2, z, (i & 16) != 0 ? null : str);
    }
}
