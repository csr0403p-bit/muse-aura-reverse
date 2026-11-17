package com.facebook.aura.model;

import X.AbstractC7559F3s;
import X.C07779iq;
import X.C9hr;
import X.C9tS;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchDeltaTranscript$Companion$$childSerializers$3 extends AbstractC7559F3s implements Function0<C9hr<Map<String, HatchPlaceholderEntry>>> {
    public static final HatchDeltaTranscript$Companion$$childSerializers$3 INSTANCE = new HatchDeltaTranscript$Companion$$childSerializers$3();

    public HatchDeltaTranscript$Companion$$childSerializers$3() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<Map<String, HatchPlaceholderEntry>> invoke() {
        return new C9tS(C07779iq.A01, HatchPlaceholderEntry$$serializer.INSTANCE);
    }
}
