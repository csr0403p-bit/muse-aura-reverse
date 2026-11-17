package com.facebook.aura.ccv.nativeflow.ui;

import X.AnonymousClass002;
import com.facebook.aura.ccv.nativeflow.HatchCardFieldError;

/* loaded from: classes3.dex */
public abstract class HatchCcvViewModelKt {
    public static final String TAG = "HatchCcvViewModel";

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchCardFieldError.values().length];
            try {
                AnonymousClass002.A13(HatchCardFieldError.PAN_EMPTY, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchCardFieldError.EXPIRY_EMPTY, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchCardFieldError.CSC_EMPTY, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchCardFieldError.ZIP_EMPTY, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final HatchCardFieldError nullIfEmptyField(HatchCardFieldError hatchCardFieldError) {
        int iOrdinal;
        if (hatchCardFieldError == null || !((iOrdinal = hatchCardFieldError.ordinal()) == 0 || iOrdinal == 4 || iOrdinal == 8 || iOrdinal == 10)) {
            return hatchCardFieldError;
        }
        return null;
    }
}
