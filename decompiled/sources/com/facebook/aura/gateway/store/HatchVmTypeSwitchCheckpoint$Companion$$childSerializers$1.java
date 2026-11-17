package com.facebook.aura.gateway.store;

import X.AbstractC7559F3s;
import X.C9hr;
import X.C9iL;
import com.facebook.aura.gateway.HatchlingVmType;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchVmTypeSwitchCheckpoint$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<HatchlingVmType>> {
    public static final HatchVmTypeSwitchCheckpoint$Companion$$childSerializers$1 INSTANCE = new HatchVmTypeSwitchCheckpoint$Companion$$childSerializers$1();

    public HatchVmTypeSwitchCheckpoint$Companion$$childSerializers$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<HatchlingVmType> invoke() {
        return C9iL.A01("com.facebook.aura.gateway.HatchlingVmType", HatchlingVmType.values());
    }
}
