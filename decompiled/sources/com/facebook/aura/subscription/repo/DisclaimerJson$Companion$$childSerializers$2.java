package com.facebook.aura.subscription.repo;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class DisclaimerJson$Companion$$childSerializers$2 extends AbstractC7559F3s implements Function0<C9hr<List<? extends DisclaimerLinkJson>>> {
    public static final DisclaimerJson$Companion$$childSerializers$2 INSTANCE = new DisclaimerJson$Companion$$childSerializers$2();

    public DisclaimerJson$Companion$$childSerializers$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends DisclaimerLinkJson>> invoke() {
        return C3cG.A19(DisclaimerLinkJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends DisclaimerLinkJson>> invoke() {
        return C3cG.A19(DisclaimerLinkJson$$serializer.INSTANCE);
    }
}
