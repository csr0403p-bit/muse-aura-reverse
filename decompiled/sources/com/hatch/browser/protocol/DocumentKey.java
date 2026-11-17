package com.hatch.browser.protocol;

import X.C06H;
import X.C60O;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class DocumentKey {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public String value;

    public DocumentKey(String str) {
        C7384Etj.A0Y(str, 0);
        this.value = str;
    }

    public final DocumentKey copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new DocumentKey(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DocumentKey) && C7384Etj.areEqual(this.value, ((DocumentKey) obj).value));
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

    public static /* synthetic */ DocumentKey copy$default(DocumentKey documentKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = documentKey.value;
        }
        C7384Etj.A0Y(str, 0);
        return new DocumentKey(str);
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
        return C60O.A0r("DocumentKey(value=", this.value);
    }
}
