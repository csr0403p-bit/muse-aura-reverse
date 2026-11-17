package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import com.facebook.aura.logout.AuraLogoutHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$28$1 extends AbstractC7559F3s implements Function0<Unit> {
    public static final ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$28$1 INSTANCE = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$28$1();

    public ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$28$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        AuraLogoutHelper.INSTANCE.performLogout();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraLogoutHelper.INSTANCE.performLogout();
    }
}
