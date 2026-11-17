package com.facebook.aura.gateway.store;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import com.facebook.aura.common.HatchCvmChipPinPurpose;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class HatchCvmChipClaim extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final String allowlistVersion;
    public final String attemptId;
    public final boolean bidsWithHostData;
    public final List<String> chipIds;
    public final HatchCvmChipClaimDisposition disposition;
    public final boolean enrollmentPinned;
    public final boolean isReplacementChipPinned;
    public final String nonce;

    public final class Companion {
        public final C9hr<HatchCvmChipClaim> serializer() {
            return HatchCvmChipClaim$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, AbstractC5321DgF.A02(num, HatchCvmChipClaim$Companion$$childSerializers$1.INSTANCE), null, AbstractC5321DgF.A02(num, HatchCvmChipClaim$Companion$$childSerializers$2.INSTANCE), null, null, null};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCvmChipClaim) {
                HatchCvmChipClaim hatchCvmChipClaim = (HatchCvmChipClaim) obj;
                if (!C7384Etj.areEqual(this.attemptId, hatchCvmChipClaim.attemptId) || !C7384Etj.areEqual(this.nonce, hatchCvmChipClaim.nonce) || !C7384Etj.areEqual(this.chipIds, hatchCvmChipClaim.chipIds) || !C7384Etj.areEqual(this.allowlistVersion, hatchCvmChipClaim.allowlistVersion) || this.disposition != hatchCvmChipClaim.disposition || this.isReplacementChipPinned != hatchCvmChipClaim.isReplacementChipPinned || this.bidsWithHostData != hatchCvmChipClaim.bidsWithHostData || this.enrollmentPinned != hatchCvmChipClaim.enrollmentPinned) {
                }
            }
            return false;
        }
        return true;
    }

    private final boolean component6() {
        return this.isReplacementChipPinned;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchCvmChipClaim copy$default(HatchCvmChipClaim hatchCvmChipClaim, String str, String str2, List list, String str3, HatchCvmChipClaimDisposition hatchCvmChipClaimDisposition, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchCvmChipClaim.attemptId;
        }
        if ((i & 2) != 0) {
            str2 = hatchCvmChipClaim.nonce;
        }
        if ((i & 4) != 0) {
            list = hatchCvmChipClaim.chipIds;
        }
        if ((i & 8) != 0) {
            str3 = hatchCvmChipClaim.allowlistVersion;
        }
        if ((i & 16) != 0) {
            hatchCvmChipClaimDisposition = hatchCvmChipClaim.disposition;
        }
        if ((i & 32) != 0) {
            z = hatchCvmChipClaim.isReplacementChipPinned;
        }
        if ((i & 64) != 0) {
            z2 = hatchCvmChipClaim.bidsWithHostData;
        }
        if ((i & 128) != 0) {
            z3 = hatchCvmChipClaim.enrollmentPinned;
        }
        return hatchCvmChipClaim.copy(str, str2, list, str3, hatchCvmChipClaimDisposition, z, z2, z3);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_store_store(HatchCvmChipClaim hatchCvmChipClaim, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(hatchCvmChipClaim.attemptId, c9iZ, 0);
        c9j5.AAV(hatchCvmChipClaim.nonce, c9iZ, 1);
        c9j5.AAQ(hatchCvmChipClaim.chipIds, C3cH.A15(f0cArr, 2), c9iZ, 2);
        c9j5.AAV(hatchCvmChipClaim.allowlistVersion, c9iZ, 3);
        c9j5.AAQ(hatchCvmChipClaim.disposition, C3cH.A15(f0cArr, 4), c9iZ, 4);
        boolean zAfR = c9j5.AfR();
        if (zAfR || !hatchCvmChipClaim.isReplacementChipPinned) {
            c9j5.AA7(c9iZ, 5, hatchCvmChipClaim.isReplacementChipPinned);
        }
        if (zAfR || hatchCvmChipClaim.bidsWithHostData) {
            c9j5.AA7(c9iZ, 6, hatchCvmChipClaim.bidsWithHostData);
        }
        if (zAfR || hatchCvmChipClaim.enrollmentPinned) {
            c9j5.AA7(c9iZ, 7, hatchCvmChipClaim.enrollmentPinned);
        }
    }

    public final String component1() {
        return this.attemptId;
    }

    public final String component2() {
        return this.nonce;
    }

    public final List<String> component3() {
        return this.chipIds;
    }

    public final String component4() {
        return this.allowlistVersion;
    }

    public final HatchCvmChipClaimDisposition component5() {
        return this.disposition;
    }

    public final boolean component7() {
        return this.bidsWithHostData;
    }

    public final boolean component8() {
        return this.enrollmentPinned;
    }

    public final String getAllowlistVersion() {
        return this.allowlistVersion;
    }

    public final String getAttemptId() {
        return this.attemptId;
    }

    public final boolean getBidsWithHostData() {
        return this.bidsWithHostData;
    }

    public final List<String> getChipIds() {
        return this.chipIds;
    }

    public final HatchCvmChipClaimDisposition getDisposition() {
        return this.disposition;
    }

    public final boolean getEnrollmentPinned() {
        return this.enrollmentPinned;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final HatchCvmChipPinPurpose getPurpose() {
        return this.isReplacementChipPinned ? HatchCvmChipPinPurpose.HARD_REPLACEMENT : HatchCvmChipPinPurpose.PROVISIONING;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.disposition, AnonymousClass005.A0I(this.allowlistVersion, AnonymousClass005.A0F(this.chipIds, AnonymousClass005.A0I(this.nonce, AnonymousClass001.A0G(this.attemptId))))), this.isReplacementChipPinned), this.bidsWithHostData), this.enrollmentPinned);
    }

    public HatchCvmChipClaim(String str, String str2, List<String> list, String str3, HatchCvmChipClaimDisposition hatchCvmChipClaimDisposition, boolean z, boolean z2, boolean z3) {
        AnonymousClass005.A17(str, str2, list, str3, hatchCvmChipClaimDisposition);
        this.attemptId = str;
        this.nonce = str2;
        this.chipIds = list;
        this.allowlistVersion = str3;
        this.disposition = hatchCvmChipClaimDisposition;
        this.isReplacementChipPinned = z;
        this.bidsWithHostData = z2;
        this.enrollmentPinned = z3;
    }

    public final HatchCvmChipClaim copy(String str, String str2, List<String> list, String str3, HatchCvmChipClaimDisposition hatchCvmChipClaimDisposition, boolean z, boolean z2, boolean z3) {
        AnonymousClass005.A17(str, str2, list, str3, hatchCvmChipClaimDisposition);
        return new HatchCvmChipClaim(str, str2, list, str3, hatchCvmChipClaimDisposition, z, z2, z3);
    }

    public final boolean getAwaitsBidAnswer() {
        return getPurpose() == HatchCvmChipPinPurpose.HARD_REPLACEMENT && this.disposition == HatchCvmChipClaimDisposition.PENDING && this.attemptId.length() > 0 && !this.chipIds.isEmpty();
    }

    public final boolean getPinsEnrollment() {
        return getPurpose() == HatchCvmChipPinPurpose.PROVISIONING || this.enrollmentPinned;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchCvmChipClaim(String str, String str2, List list, String str3, HatchCvmChipClaimDisposition hatchCvmChipClaimDisposition, boolean z, boolean z2, boolean z3, int i, C06H c06h) {
        this(str, str2, list, str3, hatchCvmChipClaimDisposition, C60Q.A1Q(i & 32, z), C3cG.A1K(i & 64, z2), C3cH.A1N(i, z3));
    }

    public /* synthetic */ HatchCvmChipClaim(int i, String str, String str2, List list, String str3, HatchCvmChipClaimDisposition hatchCvmChipClaimDisposition, boolean z, boolean z2, boolean z3, C2hx c2hx) {
        if (31 != (i & 31)) {
            C9iI.A00(HatchCvmChipClaim$$serializer.descriptor, i, 31);
            throw F60.createAndThrow();
        }
        this.attemptId = str;
        this.nonce = str2;
        this.chipIds = list;
        this.allowlistVersion = str3;
        this.disposition = hatchCvmChipClaimDisposition;
        this.isReplacementChipPinned = (i & 32) == 0 ? true : z;
        if ((i & 64) == 0) {
            this.bidsWithHostData = false;
        } else {
            this.bidsWithHostData = z2;
        }
        if ((i & 128) == 0) {
            this.enrollmentPinned = false;
        } else {
            this.enrollmentPinned = z3;
        }
    }
}
