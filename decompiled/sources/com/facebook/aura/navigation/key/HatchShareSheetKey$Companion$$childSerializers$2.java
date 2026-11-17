package com.facebook.aura.navigation.key;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchShareSheetKey$Companion$$childSerializers$2 extends AbstractC7559F3s implements Function0<C9hr<HatchShareDownloadTarget>> {
    public static final HatchShareSheetKey$Companion$$childSerializers$2 INSTANCE = new HatchShareSheetKey$Companion$$childSerializers$2();

    public HatchShareSheetKey$Companion$$childSerializers$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<HatchShareDownloadTarget> invoke() {
        return HatchShareDownloadTarget.Companion.serializer();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<HatchShareDownloadTarget> invoke() {
        return HatchShareDownloadTarget.Companion.serializer();
    }
}
