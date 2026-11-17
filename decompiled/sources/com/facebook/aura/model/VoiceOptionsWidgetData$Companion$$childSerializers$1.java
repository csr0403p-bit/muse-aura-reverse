package com.facebook.aura.model;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class VoiceOptionsWidgetData$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<List<? extends VoiceOptionData>>> {
    public static final VoiceOptionsWidgetData$Companion$$childSerializers$1 INSTANCE = new VoiceOptionsWidgetData$Companion$$childSerializers$1();

    public VoiceOptionsWidgetData$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends VoiceOptionData>> invoke() {
        return C3cG.A19(VoiceOptionData$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends VoiceOptionData>> invoke() {
        return C3cG.A19(VoiceOptionData$$serializer.INSTANCE);
    }
}
