package com.facebook.aura.confidentialvm.repository;

import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public interface ConfidentialVmValuePropsState {

    public final class Resolved extends C06G implements ConfidentialVmValuePropsState {
        public final ConfidentialVmValueProps valueProps;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Resolved) && C7384Etj.areEqual(this.valueProps, ((Resolved) obj).valueProps));
        }

        public static /* synthetic */ Resolved copy$default(Resolved resolved, ConfidentialVmValueProps confidentialVmValueProps, int i, Object obj) {
            if ((i & 1) != 0) {
                confidentialVmValueProps = resolved.valueProps;
            }
            return new Resolved(confidentialVmValueProps);
        }

        public final ConfidentialVmValueProps component1() {
            return this.valueProps;
        }

        public final Resolved copy(ConfidentialVmValueProps confidentialVmValueProps) {
            return new Resolved(confidentialVmValueProps);
        }

        @Override // com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsState
        public ConfidentialVmValueProps getValueProps() {
            return this.valueProps;
        }

        public int hashCode() {
            return AnonymousClass006.A0D(this.valueProps);
        }

        public Resolved(ConfidentialVmValueProps confidentialVmValueProps) {
            this.valueProps = confidentialVmValueProps;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Unresolved implements ConfidentialVmValuePropsState {
        public static final Unresolved INSTANCE = new Unresolved();
        public static final ConfidentialVmValueProps valueProps = null;

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unresolved);
        }

        @Override // com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsState
        public ConfidentialVmValueProps getValueProps() {
            return valueProps;
        }

        public String toString() {
            return "Unresolved";
        }

        public int hashCode() {
            return -908402767;
        }
    }

    ConfidentialVmValueProps getValueProps();
}
