package com.facebook.aura.devices.token;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public interface LinkDeviceKeyRegisterResult {

    public final class Failed extends C06G implements LinkDeviceKeyRegisterResult {
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

    public final class NodeExists extends C06G implements LinkDeviceKeyRegisterResult {
        public final LinkDeviceKeyRecord existing;

        public NodeExists(LinkDeviceKeyRecord linkDeviceKeyRecord) {
            C7384Etj.A0Y(linkDeviceKeyRecord, 0);
            this.existing = linkDeviceKeyRecord;
        }

        public final NodeExists copy(LinkDeviceKeyRecord linkDeviceKeyRecord) {
            C7384Etj.A0Y(linkDeviceKeyRecord, 0);
            return new NodeExists(linkDeviceKeyRecord);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof NodeExists) && C7384Etj.areEqual(this.existing, ((NodeExists) obj).existing));
        }

        public static /* synthetic */ NodeExists copy$default(NodeExists nodeExists, LinkDeviceKeyRecord linkDeviceKeyRecord, int i, Object obj) {
            if ((i & 1) != 0) {
                linkDeviceKeyRecord = nodeExists.existing;
            }
            C7384Etj.A0Y(linkDeviceKeyRecord, 0);
            return new NodeExists(linkDeviceKeyRecord);
        }

        public final LinkDeviceKeyRecord component1() {
            return this.existing;
        }

        public final LinkDeviceKeyRecord getExisting() {
            return this.existing;
        }

        public int hashCode() {
            return this.existing.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class NodeRoleConflict extends C06G implements LinkDeviceKeyRegisterResult {
        public final LinkDeviceKeyRecord existing;

        public NodeRoleConflict(LinkDeviceKeyRecord linkDeviceKeyRecord) {
            C7384Etj.A0Y(linkDeviceKeyRecord, 0);
            this.existing = linkDeviceKeyRecord;
        }

        public final NodeRoleConflict copy(LinkDeviceKeyRecord linkDeviceKeyRecord) {
            C7384Etj.A0Y(linkDeviceKeyRecord, 0);
            return new NodeRoleConflict(linkDeviceKeyRecord);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof NodeRoleConflict) && C7384Etj.areEqual(this.existing, ((NodeRoleConflict) obj).existing));
        }

        public static /* synthetic */ NodeRoleConflict copy$default(NodeRoleConflict nodeRoleConflict, LinkDeviceKeyRecord linkDeviceKeyRecord, int i, Object obj) {
            if ((i & 1) != 0) {
                linkDeviceKeyRecord = nodeRoleConflict.existing;
            }
            C7384Etj.A0Y(linkDeviceKeyRecord, 0);
            return new NodeRoleConflict(linkDeviceKeyRecord);
        }

        public final LinkDeviceKeyRecord component1() {
            return this.existing;
        }

        public final LinkDeviceKeyRecord getExisting() {
            return this.existing;
        }

        public int hashCode() {
            return this.existing.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Registered implements LinkDeviceKeyRegisterResult {
        public final LinkDeviceKey key;

        public Registered(LinkDeviceKey linkDeviceKey) {
            C7384Etj.A0Y(linkDeviceKey, 0);
            this.key = linkDeviceKey;
        }

        public final LinkDeviceKey getKey() {
            return this.key;
        }
    }
}
