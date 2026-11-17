package com.hatch.browser.protocol;

import X.C06H;
import X.C60O;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes6.dex */
public abstract class ElementState {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    public final class Checked extends ElementState {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final boolean expected;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Checked) && this.expected == ((Checked) obj).expected);
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Checked copy$default(Checked checked, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = checked.expected;
            }
            return new Checked(z);
        }

        public final boolean component1() {
            return this.expected;
        }

        public final Checked copy(boolean z) {
            return new Checked(z);
        }

        public final boolean getExpected() {
            return this.expected;
        }

        public int hashCode() {
            return this.expected ? 1231 : 1237;
        }

        public String toString() {
            return FGI.A0q("Checked(expected=", ")", this.expected);
        }

        public Checked(boolean z) {
            this.expected = z;
        }
    }

    public final class Disabled extends ElementState {
        public static final int $stable = 0;
        public static final Disabled INSTANCE = new Disabled();
    }

    public final class Enabled extends ElementState {
        public static final int $stable = 0;
        public static final Enabled INSTANCE = new Enabled();
    }

    public final class Hidden extends ElementState {
        public static final int $stable = 0;
        public static final Hidden INSTANCE = new Hidden();
    }

    public final class ValueEquals extends ElementState {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final String value;

        public ValueEquals(String str) {
            C7384Etj.A0Y(str, 0);
            this.value = str;
        }

        public final ValueEquals copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new ValueEquals(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ValueEquals) && C7384Etj.areEqual(this.value, ((ValueEquals) obj).value));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ ValueEquals copy$default(ValueEquals valueEquals, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = valueEquals.value;
            }
            C7384Etj.A0Y(str, 0);
            return new ValueEquals(str);
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
            return C60O.A0r("ValueEquals(value=", this.value);
        }
    }

    public final class Visible extends ElementState {
        public static final int $stable = 0;
        public static final Visible INSTANCE = new Visible();
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public ElementState() {
    }

    public /* synthetic */ ElementState(C06H c06h) {
    }
}
