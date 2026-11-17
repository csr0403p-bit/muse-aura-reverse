package com.hatch.browser.protocol;

import X.C06H;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;

/* loaded from: classes6.dex */
public abstract class Key {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    public final class Character extends Key {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final String value;

        public Character(String str) {
            C7384Etj.A0Y(str, 0);
            this.value = str;
        }

        public final Character copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Character(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Character) && C7384Etj.areEqual(this.value, ((Character) obj).value));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Character copy$default(Character character, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = character.value;
            }
            C7384Etj.A0Y(str, 0);
            return new Character(str);
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
            return C60O.A0r("Character(value=", this.value);
        }
    }

    public final class Named extends Key {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final NamedKey key;

        public Named(NamedKey namedKey) {
            C7384Etj.A0Y(namedKey, 0);
            this.key = namedKey;
        }

        public final Named copy(NamedKey namedKey) {
            C7384Etj.A0Y(namedKey, 0);
            return new Named(namedKey);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Named) && this.key == ((Named) obj).key);
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Named copy$default(Named named, NamedKey namedKey, int i, Object obj) {
            if ((i & 1) != 0) {
                namedKey = named.key;
            }
            C7384Etj.A0Y(namedKey, 0);
            return new Named(namedKey);
        }

        public final NamedKey component1() {
            return this.key;
        }

        public final NamedKey getKey() {
            return this.key;
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("Named(key=", this.key);
        }
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public Key() {
    }

    public /* synthetic */ Key(C06H c06h) {
    }
}
