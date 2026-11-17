package com.facebook.aura.rentalcars;

import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public interface RentalCarLoadState<T> {

    public final class Loaded<T> extends C06G implements RentalCarLoadState<T> {
        public static final int $stable = 0;
        public final T value;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Loaded) && C7384Etj.areEqual(this.value, ((Loaded) obj).value));
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = loaded.value;
            }
            return new Loaded(obj);
        }

        public final T component1() {
            return this.value;
        }

        public final Loaded<T> copy(T t) {
            return new Loaded<>(t);
        }

        public final T getValue() {
            return this.value;
        }

        public int hashCode() {
            return AnonymousClass006.A0D(this.value);
        }

        public Loaded(T t) {
            this.value = t;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Loading implements RentalCarLoadState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return -636323356;
        }
    }

    public final class Unavailable implements RentalCarLoadState {
        public static final int $stable = 0;
        public static final Unavailable INSTANCE = new Unavailable();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unavailable);
        }

        public String toString() {
            return "Unavailable";
        }

        public int hashCode() {
            return 487251192;
        }
    }
}
