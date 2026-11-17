package com.facebook.aura.model;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchDeltaTranscript$Companion$$childSerializers$2 extends AbstractC7559F3s implements Function0<C9hr<List<HatchTranscriptMessage>>> {
    public static final HatchDeltaTranscript$Companion$$childSerializers$2 INSTANCE = new HatchDeltaTranscript$Companion$$childSerializers$2();

    public HatchDeltaTranscript$Companion$$childSerializers$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<HatchTranscriptMessage>> invoke() {
        return C3cG.A19(HatchTranscriptMessage$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<HatchTranscriptMessage>> invoke() {
        return C3cG.A19(HatchTranscriptMessage$$serializer.INSTANCE);
    }
}
