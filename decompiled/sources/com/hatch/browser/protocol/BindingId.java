package com.hatch.browser.protocol;

import X.C06H;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes2.dex */
public final class BindingId {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public String value;

    public BindingId(String str) {
        C7384Etj.A0Y(str, 0);
        this.value = str;
    }

    public final BindingId copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new BindingId(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BindingId) && C7384Etj.areEqual(this.value, ((BindingId) obj).value));
    }

    public final void setValue(String str) {
        C7384Etj.A0Y(str, 0);
        this.value = str;
    }

    public static /* synthetic */ BindingId copy$default(BindingId bindingId, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bindingId.value;
        }
        C7384Etj.A0Y(str, 0);
        return new BindingId(str);
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
        return FGI.A0U("BindingId(value=", this.value, ")");
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
