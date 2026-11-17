package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HatchStatusNarration extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String status;
    public final String summary;
    public final long updatedAtMs;

    public final class Companion {
        public final C9hr<HatchStatusNarration> serializer() {
            return HatchStatusNarration$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(HatchStatusNarration hatchStatusNarration, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(hatchStatusNarration.status, c9iZ, 0);
        c9j5.AAV(hatchStatusNarration.summary, c9iZ, 1);
        c9j5.AAN(c9iZ, 2, hatchStatusNarration.updatedAtMs);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchStatusNarration) {
                HatchStatusNarration hatchStatusNarration = (HatchStatusNarration) obj;
                if (!C7384Etj.areEqual(this.status, hatchStatusNarration.status) || !C7384Etj.areEqual(this.summary, hatchStatusNarration.summary) || this.updatedAtMs != hatchStatusNarration.updatedAtMs) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchStatusNarration copy$default(HatchStatusNarration hatchStatusNarration, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchStatusNarration.status;
        }
        if ((i & 2) != 0) {
            str2 = hatchStatusNarration.summary;
        }
        if ((i & 4) != 0) {
            j = hatchStatusNarration.updatedAtMs;
        }
        return hatchStatusNarration.copy(str, str2, j);
    }

    public final String component1() {
        return this.status;
    }

    public final String component2() {
        return this.summary;
    }

    public final long component3() {
        return this.updatedAtMs;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final long getUpdatedAtMs() {
        return this.updatedAtMs;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.updatedAtMs, AnonymousClass005.A0I(this.summary, AnonymousClass001.A0G(this.status)));
    }

    public HatchStatusNarration(String str, String str2, long j) {
        AnonymousClass003.A0u(str, str2);
        this.status = str;
        this.summary = str2;
        this.updatedAtMs = j;
    }

    public final HatchStatusNarration copy(String str, String str2, long j) {
        AnonymousClass003.A0u(str, str2);
        return new HatchStatusNarration(str, str2, j);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchStatusNarration(int i, String str, String str2, long j, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(HatchStatusNarration$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.status = str;
        this.summary = str2;
        this.updatedAtMs = j;
    }
}
