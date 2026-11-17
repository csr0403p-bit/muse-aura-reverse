package com.facebook.aura.nodes.core;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes3.dex */
public interface NodeHitlResult {

    public final class Allowed implements NodeHitlResult {
        public static final Allowed INSTANCE = new Allowed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Allowed);
        }

        public String toString() {
            return "Allowed";
        }

        public int hashCode() {
            return 2144903028;
        }
    }

    public final class Denied extends C06G implements NodeHitlResult {
        public final String message;
        public final boolean timedOut;

        public Denied(String str, boolean z) {
            C7384Etj.A0Y(str, 0);
            this.message = str;
            this.timedOut = z;
        }

        public final Denied copy(String str, boolean z) {
            C7384Etj.A0Y(str, 0);
            return new Denied(str, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Denied) {
                    Denied denied = (Denied) obj;
                    if (!C7384Etj.areEqual(this.message, denied.message) || this.timedOut != denied.timedOut) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Denied copy$default(Denied denied, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = denied.message;
            }
            if ((i & 2) != 0) {
                z = denied.timedOut;
            }
            C7384Etj.A0Y(str, 0);
            return new Denied(str, z);
        }

        public final String component1() {
            return this.message;
        }

        public final boolean component2() {
            return this.timedOut;
        }

        public final String getErrorCode() {
            return this.timedOut ? "hitl_timeout" : "hitl_denied";
        }

        public final String getMessage() {
            return this.message;
        }

        public final boolean getTimedOut() {
            return this.timedOut;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass001.A0G(this.message), this.timedOut);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Denied(String str, boolean z, int i, C06H c06h) {
            this(str, AnonymousClass001.A1Q(i, z));
        }
    }
}
