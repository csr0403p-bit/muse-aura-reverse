package com.facebook.aura.checkpoint.probe;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.checkpoint.probe.HatchCheckpointProbe$probe$$inlined$executeStefiRequest-bMdYcbs$default$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class HatchCheckpointProbe$probe$$inlined$executeStefiRequestbMdYcbs$default$1 extends AbstractC7559F3s implements Function0<C9hr<CheckpointStatusResponseJson>> {
    public static final HatchCheckpointProbe$probe$$inlined$executeStefiRequestbMdYcbs$default$1 INSTANCE = new HatchCheckpointProbe$probe$$inlined$executeStefiRequestbMdYcbs$default$1();

    public HatchCheckpointProbe$probe$$inlined$executeStefiRequestbMdYcbs$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<CheckpointStatusResponseJson> invoke() {
        return CheckpointStatusResponseJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<CheckpointStatusResponseJson> invoke() {
        return CheckpointStatusResponseJson$$serializer.INSTANCE;
    }
}
