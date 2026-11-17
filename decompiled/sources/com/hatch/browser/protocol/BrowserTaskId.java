package com.hatch.browser.protocol;

import X.C06H;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes2.dex */
public final class BrowserTaskId {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public String value;

    public BrowserTaskId(String str) {
        C7384Etj.A0Y(str, 0);
        this.value = str;
    }

    public final BrowserTaskId copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new BrowserTaskId(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BrowserTaskId) && C7384Etj.areEqual(this.value, ((BrowserTaskId) obj).value));
    }

    public final void setValue(String str) {
        C7384Etj.A0Y(str, 0);
        this.value = str;
    }

    public static /* synthetic */ BrowserTaskId copy$default(BrowserTaskId browserTaskId, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = browserTaskId.value;
        }
        C7384Etj.A0Y(str, 0);
        return new BrowserTaskId(str);
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
        return FGI.A0U("BrowserTaskId(value=", this.value, ")");
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
