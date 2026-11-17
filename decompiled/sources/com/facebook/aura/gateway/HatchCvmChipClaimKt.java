package com.facebook.aura.gateway;

import X.AnonymousClass002;
import X.C0881AGi;
import X.C3cG;
import X.C9hr;
import X.F0C;
import com.facebook.aura.gateway.store.HatchCvmChipClaim;
import com.facebook.aura.gateway.store.HatchCvmChipClaimDisposition;

/* loaded from: classes4.dex */
public abstract class HatchCvmChipClaimKt {
    public static final HatchCvmChipClaim settled(HatchCvmChipClaim hatchCvmChipClaim, HatchCvmChipSelectionResponseClass hatchCvmChipSelectionResponseClass) {
        HatchCvmChipClaimDisposition hatchCvmChipClaimDisposition;
        HatchCvmChipClaimDisposition hatchCvmChipClaimDisposition2;
        boolean zA1a = AnonymousClass002.A1a(hatchCvmChipClaim, hatchCvmChipSelectionResponseClass);
        int iOrdinal = hatchCvmChipSelectionResponseClass.ordinal();
        if (iOrdinal == zA1a) {
            hatchCvmChipClaimDisposition = HatchCvmChipClaimDisposition.ACCEPTED;
        } else {
            if (iOrdinal != 3 && iOrdinal != 0) {
                if (iOrdinal == 2) {
                    hatchCvmChipClaimDisposition2 = HatchCvmChipClaimDisposition.STOOD_DOWN;
                } else {
                    if (iOrdinal != 4) {
                        throw C3cG.A0q();
                    }
                    hatchCvmChipClaimDisposition2 = HatchCvmChipClaimDisposition.FATAL;
                }
                return tombstone(hatchCvmChipClaim, hatchCvmChipClaimDisposition2);
            }
            hatchCvmChipClaimDisposition = HatchCvmChipClaimDisposition.PENDING;
        }
        F0C<C9hr<Object>>[] f0cArr = HatchCvmChipClaim.$childSerializers;
        return hatchCvmChipClaim.copy(hatchCvmChipClaim.attemptId, hatchCvmChipClaim.nonce, hatchCvmChipClaim.chipIds, hatchCvmChipClaim.allowlistVersion, hatchCvmChipClaimDisposition, hatchCvmChipClaim.isReplacementChipPinned, hatchCvmChipClaim.bidsWithHostData, hatchCvmChipClaim.enrollmentPinned);
    }

    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchCvmChipSelectionResponseClass.values().length];
            try {
                AnonymousClass002.A13(HatchCvmChipSelectionResponseClass.ACCEPTED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchCvmChipSelectionResponseClass.RETRY, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchCvmChipSelectionResponseClass.UNKNOWN, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchCvmChipSelectionResponseClass.STAND_DOWN, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(HatchCvmChipSelectionResponseClass.FATAL, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final HatchCvmChipClaim tombstone(HatchCvmChipClaim hatchCvmChipClaim, HatchCvmChipClaimDisposition hatchCvmChipClaimDisposition) {
        C0881AGi c0881AGi = C0881AGi.A00;
        F0C<C9hr<Object>>[] f0cArr = HatchCvmChipClaim.$childSerializers;
        return hatchCvmChipClaim.copy(hatchCvmChipClaim.attemptId, "", c0881AGi, "", hatchCvmChipClaimDisposition, hatchCvmChipClaim.isReplacementChipPinned, hatchCvmChipClaim.bidsWithHostData, hatchCvmChipClaim.enrollmentPinned);
    }
}
