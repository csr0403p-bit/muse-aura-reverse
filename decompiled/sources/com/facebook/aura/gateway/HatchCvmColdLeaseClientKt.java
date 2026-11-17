package com.facebook.aura.gateway;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C7384Etj;
import com.facebook.aura.gateway.HatchCvmColdLeaseException;

/* loaded from: classes4.dex */
public abstract class HatchCvmColdLeaseClientKt {
    public static final boolean retriesColdLeaseWithSameKey(Throwable th) {
        HatchCvmColdLeaseException hatchCvmColdLeaseException;
        C7384Etj.A0Y(th, 0);
        HatchCvmColdLeaseException.Reason reason = null;
        if ((th instanceof HatchCvmColdLeaseException) && (hatchCvmColdLeaseException = (HatchCvmColdLeaseException) th) != null) {
            reason = hatchCvmColdLeaseException.reason;
        }
        int iA0M = AnonymousClass003.A0M(reason);
        return iA0M == -1 || iA0M == 5;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchCvmColdLeaseException.Reason.values().length];
            try {
                AnonymousClass002.A13(HatchCvmColdLeaseException.Reason.CAPACITY_UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
