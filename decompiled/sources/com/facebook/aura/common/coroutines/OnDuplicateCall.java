package com.facebook.aura.common.coroutines;

import X.C06H;
import X.C7384Etj;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class OnDuplicateCall {

    /* loaded from: classes3.dex */
    public final class Cancel extends OnDuplicateCall {
        public static final Cancel INSTANCE = new Cancel();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public String toString() {
            return "Cancel";
        }

        public int hashCode() {
            return -2049745858;
        }
    }

    public final class Join extends OnDuplicateCall {
        public static final Join INSTANCE = new Join();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Join);
        }

        public String toString() {
            return "Join";
        }

        public int hashCode() {
            return -1262244882;
        }
    }

    /* loaded from: classes2.dex */
    public final class SkipWhen extends OnDuplicateCall {
        public final Function0<Boolean> predicate;

        public SkipWhen(Function0<Boolean> function0) {
            C7384Etj.A0Y(function0, 0);
            this.predicate = function0;
        }

        public final Function0<Boolean> getPredicate() {
            return this.predicate;
        }
    }

    public /* synthetic */ OnDuplicateCall(C06H c06h) {
    }

    public OnDuplicateCall() {
    }
}
