package com.facebook.aura.network.transport.tigon;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C7384Etj;
import X.CXt;
import X.CYV;
import com.facebook.aura.network.transport.HatchRequestCategory;
import com.facebook.aura.network.transport.HatchRequestPurpose;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes5.dex */
public abstract class TigonRequestTaggingKt {
    public static final CYV toTigon(HatchRequestCategory hatchRequestCategory) {
        C7384Etj.A0Y(hatchRequestCategory, 0);
        int iOrdinal = hatchRequestCategory.ordinal();
        if (iOrdinal == 0) {
            return CYV.A03;
        }
        if (iOrdinal == 1) {
            return CYV.A04;
        }
        if (iOrdinal == 2) {
            return CYV.A05;
        }
        if (iOrdinal == 3) {
            return CYV.A08;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HatchRequestCategory.values().length];
            try {
                AnonymousClass005.A0v(HatchRequestCategory.API, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(HatchRequestCategory.CRITICAL_API, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchRequestCategory.IMAGE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchRequestCategory.VIDEO, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HatchRequestPurpose.values().length];
            try {
                AnonymousClass005.A0v(HatchRequestPurpose.FETCH, iArr2, 1);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass005.A0v(HatchRequestPurpose.PREFETCH, iArr2, 2);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final CXt toTigon(HatchRequestPurpose hatchRequestPurpose) {
        C7384Etj.A0Y(hatchRequestPurpose, 0);
        int iOrdinal = hatchRequestPurpose.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return CXt.A05;
            }
            throw new NoWhenBranchMatchedException();
        }
        return CXt.A03;
    }
}
