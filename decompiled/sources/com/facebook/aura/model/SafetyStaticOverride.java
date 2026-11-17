package com.facebook.aura.model;

import X.C06H;
import X.C7384Etj;

/* loaded from: classes3.dex */
public abstract class SafetyStaticOverride {
    public static final int $stable = 8;

    public final class Invalid extends SafetyStaticOverride {
        public static final int $stable = 0;
        public static final Invalid INSTANCE = new Invalid();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Invalid);
        }

        public String toString() {
            return "Invalid";
        }

        public int hashCode() {
            return -1097101174;
        }
    }

    public final class None extends SafetyStaticOverride {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public String toString() {
            return "None";
        }

        public int hashCode() {
            return 310366597;
        }
    }

    public final class Refusal extends SafetyStaticOverride {
        public static final int $stable = 0;
        public final String text;

        public Refusal(String str) {
            C7384Etj.A0Y(str, 0);
            this.text = str;
        }

        public final Refusal copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Refusal(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Refusal) && C7384Etj.areEqual(this.text, ((Refusal) obj).text));
        }

        public static /* synthetic */ Refusal copy$default(Refusal refusal, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = refusal.text;
            }
            C7384Etj.A0Y(str, 0);
            return new Refusal(str);
        }

        public final String component1() {
            return this.text;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public /* synthetic */ SafetyStaticOverride(C06H c06h) {
    }

    public SafetyStaticOverride() {
    }
}
