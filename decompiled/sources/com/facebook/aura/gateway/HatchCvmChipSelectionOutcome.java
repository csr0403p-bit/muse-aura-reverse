package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HatchCvmChipSelectionOutcome extends C06G {
    public static final int $stable = 0;
    public final Integer allowRetryAfterSecs;
    public final String ownerNonce;
    public final HatchCvmChipSelectionResponseClass responseClass;

    public HatchCvmChipSelectionOutcome(HatchCvmChipSelectionResponseClass hatchCvmChipSelectionResponseClass, Integer num, String str) {
        C7384Etj.A0Y(hatchCvmChipSelectionResponseClass, 0);
        this.responseClass = hatchCvmChipSelectionResponseClass;
        this.allowRetryAfterSecs = num;
        this.ownerNonce = str;
    }

    public final HatchCvmChipSelectionOutcome copy(HatchCvmChipSelectionResponseClass hatchCvmChipSelectionResponseClass, Integer num, String str) {
        C7384Etj.A0Y(hatchCvmChipSelectionResponseClass, 0);
        return new HatchCvmChipSelectionOutcome(hatchCvmChipSelectionResponseClass, num, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCvmChipSelectionOutcome) {
                HatchCvmChipSelectionOutcome hatchCvmChipSelectionOutcome = (HatchCvmChipSelectionOutcome) obj;
                if (this.responseClass != hatchCvmChipSelectionOutcome.responseClass || !C7384Etj.areEqual(this.allowRetryAfterSecs, hatchCvmChipSelectionOutcome.allowRetryAfterSecs) || !C7384Etj.areEqual(this.ownerNonce, hatchCvmChipSelectionOutcome.ownerNonce)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchCvmChipSelectionOutcome copy$default(HatchCvmChipSelectionOutcome hatchCvmChipSelectionOutcome, HatchCvmChipSelectionResponseClass hatchCvmChipSelectionResponseClass, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchCvmChipSelectionResponseClass = hatchCvmChipSelectionOutcome.responseClass;
        }
        if ((i & 2) != 0) {
            num = hatchCvmChipSelectionOutcome.allowRetryAfterSecs;
        }
        if ((i & 4) != 0) {
            str = hatchCvmChipSelectionOutcome.ownerNonce;
        }
        return hatchCvmChipSelectionOutcome.copy(hatchCvmChipSelectionResponseClass, num, str);
    }

    public final HatchCvmChipSelectionResponseClass component1() {
        return this.responseClass;
    }

    public final Integer component2() {
        return this.allowRetryAfterSecs;
    }

    public final String component3() {
        return this.ownerNonce;
    }

    public final Integer getAllowRetryAfterSecs() {
        return this.allowRetryAfterSecs;
    }

    public final String getOwnerNonce() {
        return this.ownerNonce;
    }

    public final HatchCvmChipSelectionResponseClass getResponseClass() {
        return this.responseClass;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0E(this.responseClass) + AnonymousClass006.A0D(this.allowRetryAfterSecs)) * 31) + AnonymousClass005.A0H(this.ownerNonce);
    }

    public String toString() {
        return super.toString();
    }
}
