package com.facebook.aura.storagerecovery.data;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class StorageRecoveryStatusJson extends C06G {
    public static final Companion Companion = new Companion();
    public final long available_bytes;
    public final boolean can_delete;
    public final boolean can_download;
    public final boolean can_list;
    public final String filesystem;
    public final String policy_version;
    public final long recovery_floor_bytes;
    public final String recovery_root;
    public final String status;
    public final long total_bytes;
    public final double usage_percentage;
    public final boolean writable;

    public final class Companion {
        public final C9hr<StorageRecoveryStatusJson> serializer() {
            return StorageRecoveryStatusJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_storagerecovery_data_data(StorageRecoveryStatusJson storageRecoveryStatusJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(storageRecoveryStatusJson.status)) {
            c9j5.AAV(storageRecoveryStatusJson.status, c9iZ, 0);
        }
        if (zAfR || !"".equals(storageRecoveryStatusJson.filesystem)) {
            c9j5.AAV(storageRecoveryStatusJson.filesystem, c9iZ, 1);
        }
        if (zAfR || !"".equals(storageRecoveryStatusJson.recovery_root)) {
            c9j5.AAV(storageRecoveryStatusJson.recovery_root, c9iZ, 2);
        }
        if (zAfR || storageRecoveryStatusJson.total_bytes != 0) {
            c9j5.AAN(c9iZ, 3, storageRecoveryStatusJson.total_bytes);
        }
        if (zAfR || storageRecoveryStatusJson.available_bytes != 0) {
            c9j5.AAN(c9iZ, 4, storageRecoveryStatusJson.available_bytes);
        }
        if (zAfR || Double.compare(storageRecoveryStatusJson.usage_percentage, 0.0d) != 0) {
            c9j5.AAD(c9iZ, storageRecoveryStatusJson.usage_percentage, 5);
        }
        if (zAfR || storageRecoveryStatusJson.recovery_floor_bytes != 0) {
            c9j5.AAN(c9iZ, 6, storageRecoveryStatusJson.recovery_floor_bytes);
        }
        if (zAfR || storageRecoveryStatusJson.writable) {
            c9j5.AA7(c9iZ, 7, storageRecoveryStatusJson.writable);
        }
        if (zAfR || storageRecoveryStatusJson.can_list) {
            c9j5.AA7(c9iZ, 8, storageRecoveryStatusJson.can_list);
        }
        if (zAfR || storageRecoveryStatusJson.can_download) {
            c9j5.AA7(c9iZ, 9, storageRecoveryStatusJson.can_download);
        }
        if (zAfR || storageRecoveryStatusJson.can_delete) {
            c9j5.AA7(c9iZ, 10, storageRecoveryStatusJson.can_delete);
        }
        if (zAfR || !"".equals(storageRecoveryStatusJson.policy_version)) {
            c9j5.AAV(storageRecoveryStatusJson.policy_version, c9iZ, 11);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StorageRecoveryStatusJson) {
                StorageRecoveryStatusJson storageRecoveryStatusJson = (StorageRecoveryStatusJson) obj;
                if (!C7384Etj.areEqual(this.status, storageRecoveryStatusJson.status) || !C7384Etj.areEqual(this.filesystem, storageRecoveryStatusJson.filesystem) || !C7384Etj.areEqual(this.recovery_root, storageRecoveryStatusJson.recovery_root) || this.total_bytes != storageRecoveryStatusJson.total_bytes || this.available_bytes != storageRecoveryStatusJson.available_bytes || Double.compare(this.usage_percentage, storageRecoveryStatusJson.usage_percentage) != 0 || this.recovery_floor_bytes != storageRecoveryStatusJson.recovery_floor_bytes || this.writable != storageRecoveryStatusJson.writable || this.can_list != storageRecoveryStatusJson.can_list || this.can_download != storageRecoveryStatusJson.can_download || this.can_delete != storageRecoveryStatusJson.can_delete || !C7384Etj.areEqual(this.policy_version, storageRecoveryStatusJson.policy_version)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ StorageRecoveryStatusJson copy$default(StorageRecoveryStatusJson storageRecoveryStatusJson, String str, String str2, String str3, long j, long j2, double d, long j3, boolean z, boolean z2, boolean z3, boolean z4, String str4, int i, Object obj) {
        String str5 = str;
        String str6 = str3;
        long j4 = j;
        long j5 = j2;
        double d2 = d;
        long j6 = j3;
        boolean z5 = z;
        boolean z6 = z2;
        boolean z7 = z3;
        boolean z8 = z4;
        String str7 = str4;
        if ((i & 1) != 0) {
            str5 = storageRecoveryStatusJson.status;
        }
        if ((i & 2) != 0) {
            str2 = storageRecoveryStatusJson.filesystem;
        }
        if ((i & 4) != 0) {
            str6 = storageRecoveryStatusJson.recovery_root;
        }
        if ((i & 8) != 0) {
            j4 = storageRecoveryStatusJson.total_bytes;
        }
        if ((i & 16) != 0) {
            j5 = storageRecoveryStatusJson.available_bytes;
        }
        if ((i & 32) != 0) {
            d2 = storageRecoveryStatusJson.usage_percentage;
        }
        if ((i & 64) != 0) {
            j6 = storageRecoveryStatusJson.recovery_floor_bytes;
        }
        if ((i & 128) != 0) {
            z5 = storageRecoveryStatusJson.writable;
        }
        if ((i & 256) != 0) {
            z6 = storageRecoveryStatusJson.can_list;
        }
        if ((i & 512) != 0) {
            z7 = storageRecoveryStatusJson.can_download;
        }
        if ((i & 1024) != 0) {
            z8 = storageRecoveryStatusJson.can_delete;
        }
        if ((i & 2048) != 0) {
            str7 = storageRecoveryStatusJson.policy_version;
        }
        boolean z9 = z5;
        boolean z10 = z6;
        return storageRecoveryStatusJson.copy(str5, str2, str6, j4, j5, d2, j6, z9, z10, z7, z8, str7);
    }

    public final String component1() {
        return this.status;
    }

    public final boolean component10() {
        return this.can_download;
    }

    public final boolean component11() {
        return this.can_delete;
    }

    public final String component12() {
        return this.policy_version;
    }

    public final String component2() {
        return this.filesystem;
    }

    public final String component3() {
        return this.recovery_root;
    }

    public final long component4() {
        return this.total_bytes;
    }

    public final long component5() {
        return this.available_bytes;
    }

    public final double component6() {
        return this.usage_percentage;
    }

    public final long component7() {
        return this.recovery_floor_bytes;
    }

    public final boolean component8() {
        return this.writable;
    }

    public final boolean component9() {
        return this.can_list;
    }

    public final long getAvailable_bytes() {
        return this.available_bytes;
    }

    public final boolean getCan_delete() {
        return this.can_delete;
    }

    public final boolean getCan_download() {
        return this.can_download;
    }

    public final boolean getCan_list() {
        return this.can_list;
    }

    public final String getFilesystem() {
        return this.filesystem;
    }

    public final String getPolicy_version() {
        return this.policy_version;
    }

    public final long getRecovery_floor_bytes() {
        return this.recovery_floor_bytes;
    }

    public final String getRecovery_root() {
        return this.recovery_root;
    }

    public final String getStatus() {
        return this.status;
    }

    public final long getTotal_bytes() {
        return this.total_bytes;
    }

    public final double getUsage_percentage() {
        return this.usage_percentage;
    }

    public final boolean getWritable() {
        return this.writable;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.policy_version, C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass006.A06(this.recovery_floor_bytes, (AnonymousClass006.A06(this.available_bytes, AnonymousClass006.A06(this.total_bytes, AnonymousClass005.A0I(this.recovery_root, AnonymousClass005.A0I(this.filesystem, AnonymousClass001.A0G(this.status))))) + AnonymousClass002.A0A(Double.doubleToLongBits(this.usage_percentage))) * 31), this.writable), this.can_list), this.can_download), this.can_delete));
    }

    public StorageRecoveryStatusJson(String str, String str2, String str3, long j, long j2, double d, long j3, boolean z, boolean z2, boolean z3, boolean z4, String str4) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(str4, 11);
        this.status = str;
        this.filesystem = str2;
        this.recovery_root = str3;
        this.total_bytes = j;
        this.available_bytes = j2;
        this.usage_percentage = d;
        this.recovery_floor_bytes = j3;
        this.writable = z;
        this.can_list = z2;
        this.can_download = z3;
        this.can_delete = z4;
        this.policy_version = str4;
    }

    public final StorageRecoveryStatusJson copy(String str, String str2, String str3, long j, long j2, double d, long j3, boolean z, boolean z2, boolean z3, boolean z4, String str4) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(str4, 11);
        return new StorageRecoveryStatusJson(str, str2, str3, j, j2, d, j3, z, z2, z3, z4, str4);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ StorageRecoveryStatusJson(int i, String str, String str2, String str3, long j, long j2, double d, long j3, boolean z, boolean z2, boolean z3, boolean z4, String str4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.status = "";
        } else {
            this.status = str;
        }
        if ((i & 2) == 0) {
            this.filesystem = "";
        } else {
            this.filesystem = str2;
        }
        if ((i & 4) == 0) {
            this.recovery_root = "";
        } else {
            this.recovery_root = str3;
        }
        if ((i & 8) == 0) {
            this.total_bytes = 0L;
        } else {
            this.total_bytes = j;
        }
        if ((i & 16) == 0) {
            this.available_bytes = 0L;
        } else {
            this.available_bytes = j2;
        }
        if ((i & 32) == 0) {
            this.usage_percentage = 0.0d;
        } else {
            this.usage_percentage = d;
        }
        this.recovery_floor_bytes = (i & 64) != 0 ? j3 : 0L;
        if ((i & 128) == 0) {
            this.writable = false;
        } else {
            this.writable = z;
        }
        if ((i & 256) == 0) {
            this.can_list = false;
        } else {
            this.can_list = z2;
        }
        if ((i & 512) == 0) {
            this.can_download = false;
        } else {
            this.can_download = z3;
        }
        if ((i & 1024) == 0) {
            this.can_delete = false;
        } else {
            this.can_delete = z4;
        }
        if ((i & 2048) == 0) {
            this.policy_version = "";
        } else {
            this.policy_version = str4;
        }
    }

    public /* synthetic */ StorageRecoveryStatusJson(String str, String str2, String str3, long j, long j2, double d, long j3, boolean z, boolean z2, boolean z3, boolean z4, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, C3cH.A03(i & 8, j), C3cH.A03(i & 16, j2), (i & 32) != 0 ? 0.0d : d, (i & 64) == 0 ? j3 : 0L, C3cH.A1N(i, z), C3cG.A1K(i & 256, z2), C3cG.A1K(i & 512, z3), C3cG.A1K(i & 1024, z4), (i & 2048) != 0 ? "" : str4);
    }

    public StorageRecoveryStatusJson() {
        this("", "", "", 0L, 0L, 0.0d, 0L, false, false, false, false, "");
    }
}
