package com.hatch.browser.protocol;

import X.C06H;
import X.C60O;
import X.C7384Etj;

/* loaded from: classes6.dex */
public abstract class ElementReadKind {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    public final class Attribute extends ElementReadKind {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final String name;

        public Attribute(String str) {
            C7384Etj.A0Y(str, 0);
            this.name = str;
        }

        public final Attribute copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Attribute(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Attribute) && C7384Etj.areEqual(this.name, ((Attribute) obj).name));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Attribute copy$default(Attribute attribute, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = attribute.name;
            }
            C7384Etj.A0Y(str, 0);
            return new Attribute(str);
        }

        public final String component1() {
            return this.name;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public String toString() {
            return C60O.A0r("Attribute(name=", this.name);
        }
    }

    public final class Checked extends ElementReadKind {
        public static final int $stable = 0;
        public static final Checked INSTANCE = new Checked();
    }

    public final class Html extends ElementReadKind {
        public static final int $stable = 0;
        public static final Html INSTANCE = new Html();
    }

    public final class Text extends ElementReadKind {
        public static final int $stable = 0;
        public static final Text INSTANCE = new Text();
    }

    public final class Value extends ElementReadKind {
        public static final int $stable = 0;
        public static final Value INSTANCE = new Value();
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public ElementReadKind() {
    }

    public /* synthetic */ ElementReadKind(C06H c06h) {
    }
}
