package com.hatch.browser.protocol;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06H;
import X.C60O;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes6.dex */
public abstract class ElementValue {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    public final class Attribute extends ElementValue {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final String name;
        public final String value;

        public Attribute(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            this.name = str;
            this.value = str2;
        }

        public final Attribute copy(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            return new Attribute(str, str2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Attribute) {
                    Attribute attribute = (Attribute) obj;
                    if (!C7384Etj.areEqual(this.name, attribute.name) || !C7384Etj.areEqual(this.value, attribute.value)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Attribute copy$default(Attribute attribute, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = attribute.name;
            }
            if ((i & 2) != 0) {
                str2 = attribute.value;
            }
            C7384Etj.A0Y(str, 0);
            return new Attribute(str, str2);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.value;
        }

        public final String getName() {
            return this.name;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return AnonymousClass001.A0G(this.name) + AnonymousClass006.A0G(this.value);
        }

        public String toString() {
            return FGI.A0c("Attribute(name=", this.name, ", value=", this.value);
        }
    }

    public final class Checked extends ElementValue {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final boolean value;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Checked) && this.value == ((Checked) obj).value);
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Checked copy$default(Checked checked, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = checked.value;
            }
            return new Checked(z);
        }

        public final boolean component1() {
            return this.value;
        }

        public final Checked copy(boolean z) {
            return new Checked(z);
        }

        public final boolean getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value ? 1231 : 1237;
        }

        public String toString() {
            return FGI.A0q("Checked(value=", ")", this.value);
        }

        public Checked(boolean z) {
            this.value = z;
        }
    }

    public final class Html extends ElementValue {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final String value;

        public Html(String str) {
            C7384Etj.A0Y(str, 0);
            this.value = str;
        }

        public final Html copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Html(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Html) && C7384Etj.areEqual(this.value, ((Html) obj).value));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Html copy$default(Html html, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = html.value;
            }
            C7384Etj.A0Y(str, 0);
            return new Html(str);
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
            return C60O.A0r("Html(value=", this.value);
        }
    }

    public final class Text extends ElementValue {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final String value;

        public Text(String str) {
            C7384Etj.A0Y(str, 0);
            this.value = str;
        }

        public final Text copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Text(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Text) && C7384Etj.areEqual(this.value, ((Text) obj).value));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Text copy$default(Text text, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = text.value;
            }
            C7384Etj.A0Y(str, 0);
            return new Text(str);
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
            return C60O.A0r("Text(value=", this.value);
        }
    }

    public final class Value extends ElementValue {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final String value;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Value) && C7384Etj.areEqual(this.value, ((Value) obj).value));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Value copy$default(Value value, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = value.value;
            }
            return new Value(str);
        }

        public final String component1() {
            return this.value;
        }

        public final Value copy(String str) {
            return new Value(str);
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return AnonymousClass006.A0G(this.value);
        }

        public String toString() {
            return C60O.A0r("Value(value=", this.value);
        }

        public Value(String str) {
            this.value = str;
        }
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public ElementValue() {
    }

    public /* synthetic */ ElementValue(C06H c06h) {
    }
}
