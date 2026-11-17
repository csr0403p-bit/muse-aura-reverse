package com.facebook.aura.common.coroutines;

import X.AnonymousClass006;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public abstract class SingleFlightResult<T> {

    public final class Result<T> extends SingleFlightResult<T> {
        public final T value;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Result) && C7384Etj.areEqual(this.value, ((Result) obj).value));
        }

        public static /* synthetic */ Result copy$default(Result result, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = result.value;
            }
            return new Result(obj);
        }

        public final T component1() {
            return this.value;
        }

        public final Result<T> copy(T t) {
            return new Result<>(t);
        }

        public final T getValue() {
            return this.value;
        }

        public int hashCode() {
            return AnonymousClass006.A0D(this.value);
        }

        public Result(T t) {
            this.value = t;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Skipped extends SingleFlightResult {
        public static final Skipped INSTANCE = new Skipped();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Skipped);
        }

        public String toString() {
            return "Skipped";
        }

        public int hashCode() {
            return -644999977;
        }
    }

    public /* synthetic */ SingleFlightResult(C06H c06h) {
    }

    public SingleFlightResult() {
    }
}
