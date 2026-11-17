package com.facebook.aura.gateway.store;

import X.AnonymousClass001;
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
/* loaded from: classes4.dex */
public final class HatchCvmDrawnChip extends C06G {
    public static final Companion Companion = new Companion();
    public final long at;
    public final String chipId;

    public final class Companion {
        public final C9hr<HatchCvmDrawnChip> serializer() {
            return HatchCvmDrawnChip$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchCvmDrawnChip(String str, long j) {
        C7384Etj.A0Y(str, 0);
        this.chipId = str;
        this.at = j;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_store_store(HatchCvmDrawnChip hatchCvmDrawnChip, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(hatchCvmDrawnChip.chipId, c9iZ, 0);
        c9j5.AAN(c9iZ, 1, hatchCvmDrawnChip.at);
    }

    public final HatchCvmDrawnChip copy(String str, long j) {
        C7384Etj.A0Y(str, 0);
        return new HatchCvmDrawnChip(str, j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCvmDrawnChip) {
                HatchCvmDrawnChip hatchCvmDrawnChip = (HatchCvmDrawnChip) obj;
                if (!C7384Etj.areEqual(this.chipId, hatchCvmDrawnChip.chipId) || this.at != hatchCvmDrawnChip.at) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchCvmDrawnChip copy$default(HatchCvmDrawnChip hatchCvmDrawnChip, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchCvmDrawnChip.chipId;
        }
        if ((i & 2) != 0) {
            j = hatchCvmDrawnChip.at;
        }
        C7384Etj.A0Y(str, 0);
        return new HatchCvmDrawnChip(str, j);
    }

    public final String component1() {
        return this.chipId;
    }

    public final long component2() {
        return this.at;
    }

    public final long getAt() {
        return this.at;
    }

    public final String getChipId() {
        return this.chipId;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.at, AnonymousClass001.A0G(this.chipId));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchCvmDrawnChip(int i, String str, long j, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(HatchCvmDrawnChip$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.chipId = str;
        this.at = j;
    }
}
