package com.facebook.aura.confidentialvm.model;

import X.AnonymousClass002;
import X.C3cG;
import com.facebook.aura.gateway.HatchlingVmType;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection;

/* loaded from: classes2.dex */
public abstract class ConfidentialVmSwitchProgressViewModelKt {

    /* loaded from: classes.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConfidentialVmSwitchDirection.values().length];
            try {
                AnonymousClass002.A13(ConfidentialVmSwitchDirection.TO_CONFIDENTIAL_VM, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConfidentialVmSwitchDirection.TO_SECURE_VM, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final HatchlingVmType getTargetVmType(ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = confidentialVmSwitchDirection.ordinal();
        if (iOrdinal == 0) {
            return HatchlingVmType.HATCH_CVM;
        }
        if (iOrdinal == 1) {
            return HatchlingVmType.HATCH_VM;
        }
        throw C3cG.A0q();
    }
}
