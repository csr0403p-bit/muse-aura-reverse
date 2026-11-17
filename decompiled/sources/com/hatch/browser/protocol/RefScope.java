package com.hatch.browser.protocol;

import X.C06H;
import X.C60O;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class RefScope {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public String value;

    public RefScope(String str) {
        C7384Etj.A0Y(str, 0);
        this.value = str;
    }

    public final RefScope copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new RefScope(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof RefScope) && C7384Etj.areEqual(this.value, ((RefScope) obj).value));
    }

    public final void setValue(String str) {
        C7384Etj.A0Y(str, 0);
        this.value = str;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ RefScope copy$default(RefScope refScope, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = refScope.value;
        }
        C7384Etj.A0Y(str, 0);
        return new RefScope(str);
    }

    public final String component1() {
        return this.value;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return C60O.A0r("RefScope(value=", this.value);
    }
}
