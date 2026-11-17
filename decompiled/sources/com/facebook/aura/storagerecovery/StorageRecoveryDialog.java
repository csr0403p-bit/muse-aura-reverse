package com.facebook.aura.storagerecovery;

import X.AHD;
import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntry;

/* loaded from: classes3.dex */
public interface StorageRecoveryDialog {

    public final class ConfirmDelete extends C06G implements StorageRecoveryDialog {
        public final AHD<HatchStorageRecoveryEntry> entries;

        public ConfirmDelete(AHD<HatchStorageRecoveryEntry> ahd) {
            C7384Etj.A0Y(ahd, 0);
            this.entries = ahd;
        }

        public final ConfirmDelete copy(AHD<HatchStorageRecoveryEntry> ahd) {
            C7384Etj.A0Y(ahd, 0);
            return new ConfirmDelete(ahd);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ConfirmDelete) && C7384Etj.areEqual(this.entries, ((ConfirmDelete) obj).entries));
        }

        public static /* synthetic */ ConfirmDelete copy$default(ConfirmDelete confirmDelete, AHD ahd, int i, Object obj) {
            if ((i & 1) != 0) {
                ahd = confirmDelete.entries;
            }
            C7384Etj.A0Y(ahd, 0);
            return new ConfirmDelete(ahd);
        }

        public final AHD<HatchStorageRecoveryEntry> component1() {
            return this.entries;
        }

        public final AHD<HatchStorageRecoveryEntry> getEntries() {
            return this.entries;
        }

        public int hashCode() {
            return this.entries.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Error extends C06G implements StorageRecoveryDialog {
        public final StorageRecoveryErrorKind kind;
        public final boolean retry;

        public Error(StorageRecoveryErrorKind storageRecoveryErrorKind, boolean z) {
            C7384Etj.A0Y(storageRecoveryErrorKind, 0);
            this.kind = storageRecoveryErrorKind;
            this.retry = z;
        }

        public final Error copy(StorageRecoveryErrorKind storageRecoveryErrorKind, boolean z) {
            C7384Etj.A0Y(storageRecoveryErrorKind, 0);
            return new Error(storageRecoveryErrorKind, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Error) {
                    Error error = (Error) obj;
                    if (this.kind != error.kind || this.retry != error.retry) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Error copy$default(Error error, StorageRecoveryErrorKind storageRecoveryErrorKind, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                storageRecoveryErrorKind = error.kind;
            }
            if ((i & 2) != 0) {
                z = error.retry;
            }
            C7384Etj.A0Y(storageRecoveryErrorKind, 0);
            return new Error(storageRecoveryErrorKind, z);
        }

        public final StorageRecoveryErrorKind component1() {
            return this.kind;
        }

        public final boolean component2() {
            return this.retry;
        }

        public final StorageRecoveryErrorKind getKind() {
            return this.kind;
        }

        public final boolean getRetry() {
            return this.retry;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass005.A0E(this.kind), this.retry);
        }

        public String toString() {
            return super.toString();
        }
    }
}
