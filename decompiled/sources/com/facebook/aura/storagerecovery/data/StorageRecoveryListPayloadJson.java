package com.facebook.aura.storagerecovery.data;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class StorageRecoveryListPayloadJson extends C06G {
    public final List<StorageRecoveryEntryJson> entries;
    public final String next_cursor;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1X(C79.A01, StorageRecoveryListPayloadJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<StorageRecoveryListPayloadJson> serializer() {
            return StorageRecoveryListPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public StorageRecoveryListPayloadJson(List<StorageRecoveryEntryJson> list, String str) {
        C7384Etj.A0Y(list, 0);
        this.entries = list;
        this.next_cursor = str;
    }

    public final StorageRecoveryListPayloadJson copy(List<StorageRecoveryEntryJson> list, String str) {
        C7384Etj.A0Y(list, 0);
        return new StorageRecoveryListPayloadJson(list, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StorageRecoveryListPayloadJson) {
                StorageRecoveryListPayloadJson storageRecoveryListPayloadJson = (StorageRecoveryListPayloadJson) obj;
                if (!C7384Etj.areEqual(this.entries, storageRecoveryListPayloadJson.entries) || !C7384Etj.areEqual(this.next_cursor, storageRecoveryListPayloadJson.next_cursor)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ StorageRecoveryListPayloadJson copy$default(StorageRecoveryListPayloadJson storageRecoveryListPayloadJson, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = storageRecoveryListPayloadJson.entries;
        }
        if ((i & 2) != 0) {
            str = storageRecoveryListPayloadJson.next_cursor;
        }
        C7384Etj.A0Y(list, 0);
        return new StorageRecoveryListPayloadJson(list, str);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_storagerecovery_data_data(StorageRecoveryListPayloadJson storageRecoveryListPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(storageRecoveryListPayloadJson.entries)) {
            c9j5.AAQ(storageRecoveryListPayloadJson.entries, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || storageRecoveryListPayloadJson.next_cursor != null) {
            c9j5.AAP(storageRecoveryListPayloadJson.next_cursor, C07779iq.A01, c9iZ, 1);
        }
    }

    public final List<StorageRecoveryEntryJson> component1() {
        return this.entries;
    }

    public final String component2() {
        return this.next_cursor;
    }

    public final List<StorageRecoveryEntryJson> getEntries() {
        return this.entries;
    }

    public final String getNext_cursor() {
        return this.next_cursor;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.entries) + AnonymousClass006.A0G(this.next_cursor);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ StorageRecoveryListPayloadJson(int i, List list, String str, C2hx c2hx) {
        this.entries = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.next_cursor = null;
        } else {
            this.next_cursor = str;
        }
    }

    public /* synthetic */ StorageRecoveryListPayloadJson(List list, String str, int i, C06H c06h) {
        this(C3cI.A10(list, i), AnonymousClass006.A0s(i, str));
    }

    public StorageRecoveryListPayloadJson() {
        this(C0881AGi.A00, null);
    }
}
