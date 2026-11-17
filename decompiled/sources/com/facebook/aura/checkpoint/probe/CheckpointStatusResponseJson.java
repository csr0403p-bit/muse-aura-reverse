package com.facebook.aura.checkpoint.probe;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CheckpointStatusResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String checkpoint_id;
    public final boolean checkpoint_required;
    public final String checkpoint_url;
    public final int next_check_after_s;

    public final class Companion {
        public final C9hr<CheckpointStatusResponseJson> serializer() {
            return CheckpointStatusResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_checkpoint_probe_probe(CheckpointStatusResponseJson checkpointStatusResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AA7(c9iZ, 0, checkpointStatusResponseJson.checkpoint_required);
        boolean zAfR = c9j5.AfR();
        if (zAfR || checkpointStatusResponseJson.checkpoint_url != null) {
            c9j5.AAP(checkpointStatusResponseJson.checkpoint_url, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || checkpointStatusResponseJson.checkpoint_id != null) {
            c9j5.AAP(checkpointStatusResponseJson.checkpoint_id, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || checkpointStatusResponseJson.next_check_after_s != 300) {
            c9j5.AAK(c9iZ, 3, checkpointStatusResponseJson.next_check_after_s);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckpointStatusResponseJson) {
                CheckpointStatusResponseJson checkpointStatusResponseJson = (CheckpointStatusResponseJson) obj;
                if (this.checkpoint_required != checkpointStatusResponseJson.checkpoint_required || !C7384Etj.areEqual(this.checkpoint_url, checkpointStatusResponseJson.checkpoint_url) || !C7384Etj.areEqual(this.checkpoint_id, checkpointStatusResponseJson.checkpoint_id) || this.next_check_after_s != checkpointStatusResponseJson.next_check_after_s) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CheckpointStatusResponseJson copy$default(CheckpointStatusResponseJson checkpointStatusResponseJson, boolean z, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = checkpointStatusResponseJson.checkpoint_required;
        }
        if ((i2 & 2) != 0) {
            str = checkpointStatusResponseJson.checkpoint_url;
        }
        if ((i2 & 4) != 0) {
            str2 = checkpointStatusResponseJson.checkpoint_id;
        }
        if ((i2 & 8) != 0) {
            i = checkpointStatusResponseJson.next_check_after_s;
        }
        return new CheckpointStatusResponseJson(z, str, str2, i);
    }

    public final boolean component1() {
        return this.checkpoint_required;
    }

    public final String component2() {
        return this.checkpoint_url;
    }

    public final String component3() {
        return this.checkpoint_id;
    }

    public final int component4() {
        return this.next_check_after_s;
    }

    public final CheckpointStatusResponseJson copy(boolean z, String str, String str2, int i) {
        return new CheckpointStatusResponseJson(z, str, str2, i);
    }

    public final String getCheckpoint_id() {
        return this.checkpoint_id;
    }

    public final boolean getCheckpoint_required() {
        return this.checkpoint_required;
    }

    public final String getCheckpoint_url() {
        return this.checkpoint_url;
    }

    public final int getNext_check_after_s() {
        return this.next_check_after_s;
    }

    public int hashCode() {
        return ((((C0KA.A02(this.checkpoint_required) + AnonymousClass006.A0G(this.checkpoint_url)) * 31) + AnonymousClass005.A0H(this.checkpoint_id)) * 31) + this.next_check_after_s;
    }

    public CheckpointStatusResponseJson(boolean z, String str, String str2, int i) {
        this.checkpoint_required = z;
        this.checkpoint_url = str;
        this.checkpoint_id = str2;
        this.next_check_after_s = i;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CheckpointStatusResponseJson(int i, boolean z, String str, String str2, int i2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(CheckpointStatusResponseJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.checkpoint_required = z;
        if ((i & 2) == 0) {
            this.checkpoint_url = null;
        } else {
            this.checkpoint_url = str;
        }
        if ((i & 4) == 0) {
            this.checkpoint_id = null;
        } else {
            this.checkpoint_id = str2;
        }
        if ((i & 8) == 0) {
            this.next_check_after_s = 300;
        } else {
            this.next_check_after_s = i2;
        }
    }

    public /* synthetic */ CheckpointStatusResponseJson(boolean z, String str, String str2, int i, int i2, C06H c06h) {
        this(z, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? 300 : i);
    }
}
