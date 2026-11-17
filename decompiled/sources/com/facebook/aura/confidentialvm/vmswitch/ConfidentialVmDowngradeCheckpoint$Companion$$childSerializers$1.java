package com.facebook.aura.confidentialvm.vmswitch;

import X.AbstractC7559F3s;
import X.C9hr;
import X.C9iL;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ConfidentialVmDowngradeCheckpoint$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<ConfidentialVmDowngradeCheckpoint.Phase>> {
    public static final ConfidentialVmDowngradeCheckpoint$Companion$$childSerializers$1 INSTANCE = new ConfidentialVmDowngradeCheckpoint$Companion$$childSerializers$1();

    public ConfidentialVmDowngradeCheckpoint$Companion$$childSerializers$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<ConfidentialVmDowngradeCheckpoint.Phase> invoke() {
        return C9iL.A01("com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint.Phase", ConfidentialVmDowngradeCheckpoint.Phase.values());
    }
}
