package com.facebook.aura.network.acs;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class OhaiAcsConfigRepository$delegate$2 extends AbstractC7559F3s implements Function0<StoredOhaiAcsConfig> {
    public static final OhaiAcsConfigRepository$delegate$2 INSTANCE = new OhaiAcsConfigRepository$delegate$2();

    public OhaiAcsConfigRepository$delegate$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final StoredOhaiAcsConfig invoke() {
        return OhaiAcsConfigRepository.store.load();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ StoredOhaiAcsConfig invoke() {
        return OhaiAcsConfigRepository.store.load();
    }
}
