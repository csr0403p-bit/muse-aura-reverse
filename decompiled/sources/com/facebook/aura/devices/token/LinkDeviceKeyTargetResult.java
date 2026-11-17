package com.facebook.aura.devices.token;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public interface LinkDeviceKeyTargetResult {

    public final class Failed extends C06G implements LinkDeviceKeyTargetResult {
        public final LinkDeviceKeyFailure failure;

        public Failed(LinkDeviceKeyFailure linkDeviceKeyFailure) {
            C7384Etj.A0Y(linkDeviceKeyFailure, 0);
            this.failure = linkDeviceKeyFailure;
        }

        public final Failed copy(LinkDeviceKeyFailure linkDeviceKeyFailure) {
            C7384Etj.A0Y(linkDeviceKeyFailure, 0);
            return new Failed(linkDeviceKeyFailure);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Failed) && this.failure == ((Failed) obj).failure);
        }

        public static /* synthetic */ Failed copy$default(Failed failed, LinkDeviceKeyFailure linkDeviceKeyFailure, int i, Object obj) {
            if ((i & 1) != 0) {
                linkDeviceKeyFailure = failed.failure;
            }
            C7384Etj.A0Y(linkDeviceKeyFailure, 0);
            return new Failed(linkDeviceKeyFailure);
        }

        public final LinkDeviceKeyFailure component1() {
            return this.failure;
        }

        public final LinkDeviceKeyFailure getFailure() {
            return this.failure;
        }

        public int hashCode() {
            return this.failure.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Resolved extends C06G implements LinkDeviceKeyTargetResult {
        public final LinkDeviceKeyTarget target;

        public Resolved(LinkDeviceKeyTarget linkDeviceKeyTarget) {
            C7384Etj.A0Y(linkDeviceKeyTarget, 0);
            this.target = linkDeviceKeyTarget;
        }

        public final Resolved copy(LinkDeviceKeyTarget linkDeviceKeyTarget) {
            C7384Etj.A0Y(linkDeviceKeyTarget, 0);
            return new Resolved(linkDeviceKeyTarget);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Resolved) && C7384Etj.areEqual(this.target, ((Resolved) obj).target));
        }

        public static /* synthetic */ Resolved copy$default(Resolved resolved, LinkDeviceKeyTarget linkDeviceKeyTarget, int i, Object obj) {
            if ((i & 1) != 0) {
                linkDeviceKeyTarget = resolved.target;
            }
            C7384Etj.A0Y(linkDeviceKeyTarget, 0);
            return new Resolved(linkDeviceKeyTarget);
        }

        public final LinkDeviceKeyTarget component1() {
            return this.target;
        }

        public final LinkDeviceKeyTarget getTarget() {
            return this.target;
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
