package com.facebook.aura.skills.viewmodel;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public interface DirectSignInState {

    public final class Handled implements DirectSignInState {
        public static final Handled INSTANCE = new Handled();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Handled);
        }

        public String toString() {
            return "Handled";
        }

        public int hashCode() {
            return 1669982190;
        }
    }

    public final class Idle implements DirectSignInState {
        public static final Idle INSTANCE = new Idle();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Idle);
        }

        public String toString() {
            return "Idle";
        }

        public int hashCode() {
            return 1653718114;
        }
    }

    public final class Resolved extends C06G implements DirectSignInState {
        public final DirectSignInOutcome outcome;

        public Resolved(DirectSignInOutcome directSignInOutcome) {
            C7384Etj.A0Y(directSignInOutcome, 0);
            this.outcome = directSignInOutcome;
        }

        public final Resolved copy(DirectSignInOutcome directSignInOutcome) {
            C7384Etj.A0Y(directSignInOutcome, 0);
            return new Resolved(directSignInOutcome);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Resolved) && C7384Etj.areEqual(this.outcome, ((Resolved) obj).outcome));
        }

        public static /* synthetic */ Resolved copy$default(Resolved resolved, DirectSignInOutcome directSignInOutcome, int i, Object obj) {
            if ((i & 1) != 0) {
                directSignInOutcome = resolved.outcome;
            }
            C7384Etj.A0Y(directSignInOutcome, 0);
            return new Resolved(directSignInOutcome);
        }

        public final DirectSignInOutcome component1() {
            return this.outcome;
        }

        public final DirectSignInOutcome getOutcome() {
            return this.outcome;
        }

        public int hashCode() {
            return this.outcome.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Resolving implements DirectSignInState {
        public static final Resolving INSTANCE = new Resolving();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Resolving);
        }

        public String toString() {
            return "Resolving";
        }

        public int hashCode() {
            return 774701019;
        }
    }
}
