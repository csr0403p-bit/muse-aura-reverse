package com.facebook.aura.pairs;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SavedMessageJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String approval_id;
    public final String connection_id;
    public final String message_id;
    public final String status;

    public final class Companion {
        public final C9hr<SavedMessageJson> serializer() {
            return SavedMessageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(SavedMessageJson savedMessageJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || savedMessageJson.message_id != null) {
            c9j5.AAP(savedMessageJson.message_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || savedMessageJson.connection_id != null) {
            c9j5.AAP(savedMessageJson.connection_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || savedMessageJson.status != null) {
            c9j5.AAP(savedMessageJson.status, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || savedMessageJson.approval_id != null) {
            c9j5.AAP(savedMessageJson.approval_id, C07779iq.A01, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SavedMessageJson) {
                SavedMessageJson savedMessageJson = (SavedMessageJson) obj;
                if (!C7384Etj.areEqual(this.message_id, savedMessageJson.message_id) || !C7384Etj.areEqual(this.connection_id, savedMessageJson.connection_id) || !C7384Etj.areEqual(this.status, savedMessageJson.status) || !C7384Etj.areEqual(this.approval_id, savedMessageJson.approval_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SavedMessageJson copy$default(SavedMessageJson savedMessageJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savedMessageJson.message_id;
        }
        if ((i & 2) != 0) {
            str2 = savedMessageJson.connection_id;
        }
        if ((i & 4) != 0) {
            str3 = savedMessageJson.status;
        }
        if ((i & 8) != 0) {
            str4 = savedMessageJson.approval_id;
        }
        return new SavedMessageJson(str, str2, str3, str4);
    }

    public final String component1() {
        return this.message_id;
    }

    public final String component2() {
        return this.connection_id;
    }

    public final String component3() {
        return this.status;
    }

    public final String component4() {
        return this.approval_id;
    }

    public final SavedMessageJson copy(String str, String str2, String str3, String str4) {
        return new SavedMessageJson(str, str2, str3, str4);
    }

    public final String getApproval_id() {
        return this.approval_id;
    }

    public final String getConnection_id() {
        return this.connection_id;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0G(this.message_id) * 31) + AnonymousClass006.A0G(this.connection_id)) * 31) + AnonymousClass006.A0G(this.status)) * 31) + AnonymousClass005.A0H(this.approval_id);
    }

    public /* synthetic */ SavedMessageJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.message_id = null;
        } else {
            this.message_id = str;
        }
        if ((i & 2) == 0) {
            this.connection_id = null;
        } else {
            this.connection_id = str2;
        }
        if ((i & 4) == 0) {
            this.status = null;
        } else {
            this.status = str3;
        }
        if ((i & 8) == 0) {
            this.approval_id = null;
        } else {
            this.approval_id = str4;
        }
    }

    public String toString() {
        return super.toString();
    }

    public SavedMessageJson(String str, String str2, String str3, String str4) {
        this.message_id = str;
        this.connection_id = str2;
        this.status = str3;
        this.approval_id = str4;
    }

    public /* synthetic */ SavedMessageJson(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public SavedMessageJson() {
        this(null, null, null, null);
    }
}
