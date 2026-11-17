package com.facebook.aura.partners.voice.api;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class VoiceCatalogPageResponseJson$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<List<? extends CatalogVoiceJson>>> {
    public static final VoiceCatalogPageResponseJson$Companion$$childSerializers$1 INSTANCE = new VoiceCatalogPageResponseJson$Companion$$childSerializers$1();

    public VoiceCatalogPageResponseJson$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends CatalogVoiceJson>> invoke() {
        return C3cG.A19(CatalogVoiceJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends CatalogVoiceJson>> invoke() {
        return C3cG.A19(CatalogVoiceJson$$serializer.INSTANCE);
    }
}
