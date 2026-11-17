package com.facebook.aura.storagerecovery.data;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class StorageRecoveryListRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String cursor;
    public final String directory_token;
    public final int limit;

    public final class Companion {
        public final C9hr<StorageRecoveryListRequestJson> serializer() {
            return StorageRecoveryListRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_storagerecovery_data_data(StorageRecoveryListRequestJson storageRecoveryListRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || storageRecoveryListRequestJson.directory_token != null) {
            c9j5.AAP(storageRecoveryListRequestJson.directory_token, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || storageRecoveryListRequestJson.cursor != null) {
            c9j5.AAP(storageRecoveryListRequestJson.cursor, C07779iq.A01, c9iZ, 1);
        }
        c9j5.AAK(c9iZ, 2, storageRecoveryListRequestJson.limit);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StorageRecoveryListRequestJson) {
                StorageRecoveryListRequestJson storageRecoveryListRequestJson = (StorageRecoveryListRequestJson) obj;
                if (!C7384Etj.areEqual(this.directory_token, storageRecoveryListRequestJson.directory_token) || !C7384Etj.areEqual(this.cursor, storageRecoveryListRequestJson.cursor) || this.limit != storageRecoveryListRequestJson.limit) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ StorageRecoveryListRequestJson copy$default(StorageRecoveryListRequestJson storageRecoveryListRequestJson, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = storageRecoveryListRequestJson.directory_token;
        }
        if ((i2 & 2) != 0) {
            str2 = storageRecoveryListRequestJson.cursor;
        }
        if ((i2 & 4) != 0) {
            i = storageRecoveryListRequestJson.limit;
        }
        return new StorageRecoveryListRequestJson(str, str2, i);
    }

    public final String component1() {
        return this.directory_token;
    }

    public final String component2() {
        return this.cursor;
    }

    public final int component3() {
        return this.limit;
    }

    public final StorageRecoveryListRequestJson copy(String str, String str2, int i) {
        return new StorageRecoveryListRequestJson(str, str2, i);
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final String getDirectory_token() {
        return this.directory_token;
    }

    public final int getLimit() {
        return this.limit;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.directory_token) * 31) + AnonymousClass005.A0H(this.cursor)) * 31) + this.limit;
    }

    public StorageRecoveryListRequestJson(String str, String str2, int i) {
        this.directory_token = str;
        this.cursor = str2;
        this.limit = i;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ StorageRecoveryListRequestJson(int i, String str, String str2, int i2, C2hx c2hx) {
        if (4 != (i & 4)) {
            C9iI.A00(StorageRecoveryListRequestJson$$serializer.descriptor, i, 4);
            throw F60.createAndThrow();
        }
        if ((i & 1) == 0) {
            this.directory_token = null;
        } else {
            this.directory_token = str;
        }
        if ((i & 2) == 0) {
            this.cursor = null;
        } else {
            this.cursor = str2;
        }
        this.limit = i2;
    }

    public /* synthetic */ StorageRecoveryListRequestJson(String str, String str2, int i, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, i);
    }
}
