package com.facebook.aura.agentpermission;

import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public interface HotelCheckoutRefundability {

    public final class FullRefundBefore extends C06G implements HotelCheckoutRefundability {
        public static final int $stable = 0;
        public final String deadline;

        public FullRefundBefore(String str) {
            C7384Etj.A0Y(str, 0);
            this.deadline = str;
        }

        public final FullRefundBefore copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new FullRefundBefore(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof FullRefundBefore) && C7384Etj.areEqual(this.deadline, ((FullRefundBefore) obj).deadline));
        }

        public static /* synthetic */ FullRefundBefore copy$default(FullRefundBefore fullRefundBefore, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fullRefundBefore.deadline;
            }
            C7384Etj.A0Y(str, 0);
            return new FullRefundBefore(str);
        }

        public final String component1() {
            return this.deadline;
        }

        public final String getDeadline() {
            return this.deadline;
        }

        public int hashCode() {
            return this.deadline.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class FullyRefundable extends C06G implements HotelCheckoutRefundability {
        public static final int $stable = 0;
        public final String until;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof FullyRefundable) && C7384Etj.areEqual(this.until, ((FullyRefundable) obj).until));
        }

        public static /* synthetic */ FullyRefundable copy$default(FullyRefundable fullyRefundable, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fullyRefundable.until;
            }
            return new FullyRefundable(str);
        }

        public final String component1() {
            return this.until;
        }

        public final FullyRefundable copy(String str) {
            return new FullyRefundable(str);
        }

        public final String getUntil() {
            return this.until;
        }

        public int hashCode() {
            return AnonymousClass006.A0G(this.until);
        }

        public FullyRefundable(String str) {
            this.until = str;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class NonRefundable implements HotelCheckoutRefundability {
        public static final int $stable = 0;
        public static final NonRefundable INSTANCE = new NonRefundable();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NonRefundable);
        }

        public String toString() {
            return "NonRefundable";
        }

        public int hashCode() {
            return -1082490381;
        }
    }
}
