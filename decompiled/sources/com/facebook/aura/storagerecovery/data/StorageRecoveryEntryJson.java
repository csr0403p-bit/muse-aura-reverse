package com.facebook.aura.storagerecovery.data;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class StorageRecoveryEntryJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String display_name;
    public final Long estimated_bytes;
    public final String kind;
    public final String selection_token;

    public final class Companion {
        public final C9hr<StorageRecoveryEntryJson> serializer() {
            return StorageRecoveryEntryJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public StorageRecoveryEntryJson() {
        this("", "", null, "");
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_storagerecovery_data_data(StorageRecoveryEntryJson storageRecoveryEntryJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(storageRecoveryEntryJson.display_name)) {
            c9j5.AAV(storageRecoveryEntryJson.display_name, c9iZ, 0);
        }
        if (zAfR || !"".equals(storageRecoveryEntryJson.kind)) {
            c9j5.AAV(storageRecoveryEntryJson.kind, c9iZ, 1);
        }
        if (zAfR || storageRecoveryEntryJson.estimated_bytes != null) {
            c9j5.AAP(storageRecoveryEntryJson.estimated_bytes, C9j1.A00, c9iZ, 2);
        }
        if (zAfR || !"".equals(storageRecoveryEntryJson.selection_token)) {
            c9j5.AAV(storageRecoveryEntryJson.selection_token, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StorageRecoveryEntryJson) {
                StorageRecoveryEntryJson storageRecoveryEntryJson = (StorageRecoveryEntryJson) obj;
                if (!C7384Etj.areEqual(this.display_name, storageRecoveryEntryJson.display_name) || !C7384Etj.areEqual(this.kind, storageRecoveryEntryJson.kind) || !C7384Etj.areEqual(this.estimated_bytes, storageRecoveryEntryJson.estimated_bytes) || !C7384Etj.areEqual(this.selection_token, storageRecoveryEntryJson.selection_token)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ StorageRecoveryEntryJson copy$default(StorageRecoveryEntryJson storageRecoveryEntryJson, String str, String str2, Long l, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = storageRecoveryEntryJson.display_name;
        }
        if ((i & 2) != 0) {
            str2 = storageRecoveryEntryJson.kind;
        }
        if ((i & 4) != 0) {
            l = storageRecoveryEntryJson.estimated_bytes;
        }
        if ((i & 8) != 0) {
            str3 = storageRecoveryEntryJson.selection_token;
        }
        AnonymousClass005.A0y(str, str2, str3);
        return new StorageRecoveryEntryJson(str, str2, l, str3);
    }

    public final String component1() {
        return this.display_name;
    }

    public final String component2() {
        return this.kind;
    }

    public final Long component3() {
        return this.estimated_bytes;
    }

    public final String component4() {
        return this.selection_token;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final Long getEstimated_bytes() {
        return this.estimated_bytes;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getSelection_token() {
        return this.selection_token;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.selection_token, (AnonymousClass005.A0I(this.kind, AnonymousClass001.A0G(this.display_name)) + AnonymousClass006.A0D(this.estimated_bytes)) * 31);
    }

    public final StorageRecoveryEntryJson copy(String str, String str2, Long l, String str3) {
        AnonymousClass005.A0y(str, str2, str3);
        return new StorageRecoveryEntryJson(str, str2, l, str3);
    }

    public String toString() {
        return super.toString();
    }

    public StorageRecoveryEntryJson(String str, String str2, Long l, String str3) {
        AnonymousClass005.A0y(str, str2, str3);
        this.display_name = str;
        this.kind = str2;
        this.estimated_bytes = l;
        this.selection_token = str3;
    }

    public /* synthetic */ StorageRecoveryEntryJson(String str, String str2, Long l, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? "" : str3);
    }

    public /* synthetic */ StorageRecoveryEntryJson(int i, String str, String str2, Long l, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.display_name = "";
        } else {
            this.display_name = str;
        }
        if ((i & 2) == 0) {
            this.kind = "";
        } else {
            this.kind = str2;
        }
        if ((i & 4) == 0) {
            this.estimated_bytes = null;
        } else {
            this.estimated_bytes = l;
        }
        if ((i & 8) == 0) {
            this.selection_token = "";
        } else {
            this.selection_token = str3;
        }
    }
}
