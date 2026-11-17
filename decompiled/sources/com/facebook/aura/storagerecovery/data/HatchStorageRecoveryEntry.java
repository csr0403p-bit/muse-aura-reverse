package com.facebook.aura.storagerecovery.data;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class HatchStorageRecoveryEntry extends C06G {
    public final String displayName;
    public final Long estimatedBytes;
    public final HatchStorageRecoveryEntryKind kind;
    public final String selectionToken;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchStorageRecoveryEntry) {
                HatchStorageRecoveryEntry hatchStorageRecoveryEntry = (HatchStorageRecoveryEntry) obj;
                if (!C7384Etj.areEqual(this.displayName, hatchStorageRecoveryEntry.displayName) || this.kind != hatchStorageRecoveryEntry.kind || !C7384Etj.areEqual(this.estimatedBytes, hatchStorageRecoveryEntry.estimatedBytes) || !C7384Etj.areEqual(this.selectionToken, hatchStorageRecoveryEntry.selectionToken)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchStorageRecoveryEntry copy$default(HatchStorageRecoveryEntry hatchStorageRecoveryEntry, String str, HatchStorageRecoveryEntryKind hatchStorageRecoveryEntryKind, Long l, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchStorageRecoveryEntry.displayName;
        }
        if ((i & 2) != 0) {
            hatchStorageRecoveryEntryKind = hatchStorageRecoveryEntry.kind;
        }
        if ((i & 4) != 0) {
            l = hatchStorageRecoveryEntry.estimatedBytes;
        }
        if ((i & 8) != 0) {
            str2 = hatchStorageRecoveryEntry.selectionToken;
        }
        AnonymousClass005.A0y(str, hatchStorageRecoveryEntryKind, str2);
        return new HatchStorageRecoveryEntry(str, hatchStorageRecoveryEntryKind, l, str2);
    }

    public final String component1() {
        return this.displayName;
    }

    public final HatchStorageRecoveryEntryKind component2() {
        return this.kind;
    }

    public final Long component3() {
        return this.estimatedBytes;
    }

    public final String component4() {
        return this.selectionToken;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final Long getEstimatedBytes() {
        return this.estimatedBytes;
    }

    public final HatchStorageRecoveryEntryKind getKind() {
        return this.kind;
    }

    public final String getSelectionToken() {
        return this.selectionToken;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.selectionToken, (AnonymousClass005.A0F(this.kind, AnonymousClass001.A0G(this.displayName)) + AnonymousClass006.A0D(this.estimatedBytes)) * 31);
    }

    public HatchStorageRecoveryEntry(String str, HatchStorageRecoveryEntryKind hatchStorageRecoveryEntryKind, Long l, String str2) {
        AnonymousClass005.A0y(str, hatchStorageRecoveryEntryKind, str2);
        this.displayName = str;
        this.kind = hatchStorageRecoveryEntryKind;
        this.estimatedBytes = l;
        this.selectionToken = str2;
    }

    public final HatchStorageRecoveryEntry copy(String str, HatchStorageRecoveryEntryKind hatchStorageRecoveryEntryKind, Long l, String str2) {
        AnonymousClass005.A0y(str, hatchStorageRecoveryEntryKind, str2);
        return new HatchStorageRecoveryEntry(str, hatchStorageRecoveryEntryKind, l, str2);
    }

    public String toString() {
        return super.toString();
    }
}
