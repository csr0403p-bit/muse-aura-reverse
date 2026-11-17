package com.facebook.aura.storagerecovery.data;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class StorageRecoveryDeleteRequestJson extends C06G {
    public final boolean confirm_permanent_delete;
    public final String idempotency_key;
    public final List<String> selection_tokens;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cI.A1Z(C79.A01, StorageRecoveryDeleteRequestJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<StorageRecoveryDeleteRequestJson> serializer() {
            return StorageRecoveryDeleteRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StorageRecoveryDeleteRequestJson) {
                StorageRecoveryDeleteRequestJson storageRecoveryDeleteRequestJson = (StorageRecoveryDeleteRequestJson) obj;
                if (!C7384Etj.areEqual(this.selection_tokens, storageRecoveryDeleteRequestJson.selection_tokens) || !C7384Etj.areEqual(this.idempotency_key, storageRecoveryDeleteRequestJson.idempotency_key) || this.confirm_permanent_delete != storageRecoveryDeleteRequestJson.confirm_permanent_delete) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StorageRecoveryDeleteRequestJson copy$default(StorageRecoveryDeleteRequestJson storageRecoveryDeleteRequestJson, List list, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = storageRecoveryDeleteRequestJson.selection_tokens;
        }
        if ((i & 2) != 0) {
            str = storageRecoveryDeleteRequestJson.idempotency_key;
        }
        if ((i & 4) != 0) {
            z = storageRecoveryDeleteRequestJson.confirm_permanent_delete;
        }
        return storageRecoveryDeleteRequestJson.copy(list, str, z);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_storagerecovery_data_data(StorageRecoveryDeleteRequestJson storageRecoveryDeleteRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(storageRecoveryDeleteRequestJson.selection_tokens, C3cH.A15($childSerializers, 0), c9iZ, 0);
        c9j5.AAV(storageRecoveryDeleteRequestJson.idempotency_key, c9iZ, 1);
        c9j5.AA7(c9iZ, 2, storageRecoveryDeleteRequestJson.confirm_permanent_delete);
    }

    public final List<String> component1() {
        return this.selection_tokens;
    }

    public final String component2() {
        return this.idempotency_key;
    }

    public final boolean component3() {
        return this.confirm_permanent_delete;
    }

    public final boolean getConfirm_permanent_delete() {
        return this.confirm_permanent_delete;
    }

    public final String getIdempotency_key() {
        return this.idempotency_key;
    }

    public final List<String> getSelection_tokens() {
        return this.selection_tokens;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0I(this.idempotency_key, AnonymousClass005.A0E(this.selection_tokens)), this.confirm_permanent_delete);
    }

    public StorageRecoveryDeleteRequestJson(List<String> list, String str, boolean z) {
        AnonymousClass003.A0u(list, str);
        this.selection_tokens = list;
        this.idempotency_key = str;
        this.confirm_permanent_delete = z;
    }

    public final StorageRecoveryDeleteRequestJson copy(List<String> list, String str, boolean z) {
        AnonymousClass003.A0u(list, str);
        return new StorageRecoveryDeleteRequestJson(list, str, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ StorageRecoveryDeleteRequestJson(int i, List list, String str, boolean z, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(StorageRecoveryDeleteRequestJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.selection_tokens = list;
        this.idempotency_key = str;
        this.confirm_permanent_delete = z;
    }
}
