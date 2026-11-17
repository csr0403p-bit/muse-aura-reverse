package com.facebook.aura.storagerecovery.data;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07799it;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class StorageRecoveryDeleteReceiptJson extends C06G {
    public static final Companion Companion = new Companion();
    public final Long available_bytes_after;
    public final long available_bytes_before;
    public final long entries_deleted;
    public final Long estimated_bytes_selected;
    public final String outcome;
    public final String server_status_after;
    public final Double usage_percentage_after;

    public final class Companion {
        public final C9hr<StorageRecoveryDeleteReceiptJson> serializer() {
            return StorageRecoveryDeleteReceiptJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public StorageRecoveryDeleteReceiptJson(String str, long j, Long l, long j2, Long l2, Double d, String str2) {
        C7384Etj.A0Y(str, 0);
        this.outcome = str;
        this.entries_deleted = j;
        this.estimated_bytes_selected = l;
        this.available_bytes_before = j2;
        this.available_bytes_after = l2;
        this.usage_percentage_after = d;
        this.server_status_after = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_storagerecovery_data_data(StorageRecoveryDeleteReceiptJson storageRecoveryDeleteReceiptJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(storageRecoveryDeleteReceiptJson.outcome)) {
            c9j5.AAV(storageRecoveryDeleteReceiptJson.outcome, c9iZ, 0);
        }
        if (zAfR || storageRecoveryDeleteReceiptJson.entries_deleted != 0) {
            c9j5.AAN(c9iZ, 1, storageRecoveryDeleteReceiptJson.entries_deleted);
        }
        if (zAfR || storageRecoveryDeleteReceiptJson.estimated_bytes_selected != null) {
            c9j5.AAP(storageRecoveryDeleteReceiptJson.estimated_bytes_selected, C9j1.A00, c9iZ, 2);
        }
        if (zAfR || storageRecoveryDeleteReceiptJson.available_bytes_before != 0) {
            c9j5.AAN(c9iZ, 3, storageRecoveryDeleteReceiptJson.available_bytes_before);
        }
        if (zAfR || storageRecoveryDeleteReceiptJson.available_bytes_after != null) {
            c9j5.AAP(storageRecoveryDeleteReceiptJson.available_bytes_after, C9j1.A00, c9iZ, 4);
        }
        if (zAfR || storageRecoveryDeleteReceiptJson.usage_percentage_after != null) {
            c9j5.AAP(storageRecoveryDeleteReceiptJson.usage_percentage_after, C07799it.A00, c9iZ, 5);
        }
        if (zAfR || storageRecoveryDeleteReceiptJson.server_status_after != null) {
            c9j5.AAP(storageRecoveryDeleteReceiptJson.server_status_after, C07779iq.A01, c9iZ, 6);
        }
    }

    public final StorageRecoveryDeleteReceiptJson copy(String str, long j, Long l, long j2, Long l2, Double d, String str2) {
        C7384Etj.A0Y(str, 0);
        return new StorageRecoveryDeleteReceiptJson(str, j, l, j2, l2, d, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StorageRecoveryDeleteReceiptJson) {
                StorageRecoveryDeleteReceiptJson storageRecoveryDeleteReceiptJson = (StorageRecoveryDeleteReceiptJson) obj;
                if (!C7384Etj.areEqual(this.outcome, storageRecoveryDeleteReceiptJson.outcome) || this.entries_deleted != storageRecoveryDeleteReceiptJson.entries_deleted || !C7384Etj.areEqual(this.estimated_bytes_selected, storageRecoveryDeleteReceiptJson.estimated_bytes_selected) || this.available_bytes_before != storageRecoveryDeleteReceiptJson.available_bytes_before || !C7384Etj.areEqual(this.available_bytes_after, storageRecoveryDeleteReceiptJson.available_bytes_after) || !C7384Etj.areEqual(this.usage_percentage_after, storageRecoveryDeleteReceiptJson.usage_percentage_after) || !C7384Etj.areEqual(this.server_status_after, storageRecoveryDeleteReceiptJson.server_status_after)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ StorageRecoveryDeleteReceiptJson copy$default(StorageRecoveryDeleteReceiptJson storageRecoveryDeleteReceiptJson, String str, long j, Long l, long j2, Long l2, Double d, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = storageRecoveryDeleteReceiptJson.outcome;
        }
        if ((i & 2) != 0) {
            j = storageRecoveryDeleteReceiptJson.entries_deleted;
        }
        if ((i & 4) != 0) {
            l = storageRecoveryDeleteReceiptJson.estimated_bytes_selected;
        }
        if ((i & 8) != 0) {
            j2 = storageRecoveryDeleteReceiptJson.available_bytes_before;
        }
        if ((i & 16) != 0) {
            l2 = storageRecoveryDeleteReceiptJson.available_bytes_after;
        }
        if ((i & 32) != 0) {
            d = storageRecoveryDeleteReceiptJson.usage_percentage_after;
        }
        if ((i & 64) != 0) {
            str2 = storageRecoveryDeleteReceiptJson.server_status_after;
        }
        return storageRecoveryDeleteReceiptJson.copy(str, j, l, j2, l2, d, str2);
    }

    public final String component1() {
        return this.outcome;
    }

    public final long component2() {
        return this.entries_deleted;
    }

    public final Long component3() {
        return this.estimated_bytes_selected;
    }

    public final long component4() {
        return this.available_bytes_before;
    }

    public final Long component5() {
        return this.available_bytes_after;
    }

    public final Double component6() {
        return this.usage_percentage_after;
    }

    public final String component7() {
        return this.server_status_after;
    }

    public final Long getAvailable_bytes_after() {
        return this.available_bytes_after;
    }

    public final long getAvailable_bytes_before() {
        return this.available_bytes_before;
    }

    public final long getEntries_deleted() {
        return this.entries_deleted;
    }

    public final Long getEstimated_bytes_selected() {
        return this.estimated_bytes_selected;
    }

    public final String getOutcome() {
        return this.outcome;
    }

    public final String getServer_status_after() {
        return this.server_status_after;
    }

    public final Double getUsage_percentage_after() {
        return this.usage_percentage_after;
    }

    public int hashCode() {
        return ((((AnonymousClass006.A06(this.available_bytes_before, (AnonymousClass006.A06(this.entries_deleted, AnonymousClass001.A0G(this.outcome)) + AnonymousClass006.A0D(this.estimated_bytes_selected)) * 31) + AnonymousClass006.A0D(this.available_bytes_after)) * 31) + AnonymousClass006.A0D(this.usage_percentage_after)) * 31) + AnonymousClass005.A0H(this.server_status_after);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ StorageRecoveryDeleteReceiptJson(String str, long j, Long l, long j2, Long l2, Double d, String str2, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? null : l, (i & 8) != 0 ? 0L : j2, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : d, (i & 64) != 0 ? null : str2);
    }

    public /* synthetic */ StorageRecoveryDeleteReceiptJson(int i, String str, long j, Long l, long j2, Long l2, Double d, String str2, C2hx c2hx) {
        this.outcome = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.entries_deleted = 0L;
        } else {
            this.entries_deleted = j;
        }
        if ((i & 4) == 0) {
            this.estimated_bytes_selected = null;
        } else {
            this.estimated_bytes_selected = l;
        }
        if ((i & 8) == 0) {
            this.available_bytes_before = 0L;
        } else {
            this.available_bytes_before = j2;
        }
        if ((i & 16) == 0) {
            this.available_bytes_after = null;
        } else {
            this.available_bytes_after = l2;
        }
        if ((i & 32) == 0) {
            this.usage_percentage_after = null;
        } else {
            this.usage_percentage_after = d;
        }
        if ((i & 64) == 0) {
            this.server_status_after = null;
        } else {
            this.server_status_after = str2;
        }
    }

    public StorageRecoveryDeleteReceiptJson() {
        this("", 0L, null, 0L, null, null, null);
    }
}
