package com.facebook.aura.ccv.accountlink;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchFOAAccountLinkScreenKey;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.ccv.accountlink.ComposableSingletons$HatchFOAAccountLinkEntryProviderKt$lambda$-613065240$1$1$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$HatchFOAAccountLinkEntryProviderKt$lambda$613065240$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchFOAAccountLinkScreenKey $key;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$HatchFOAAccountLinkEntryProviderKt$lambda$613065240$1$1$1(AuraNavigator auraNavigator, HatchFOAAccountLinkScreenKey hatchFOAAccountLinkScreenKey) {
        super(0);
        this.$navigator = auraNavigator;
        this.$key = hatchFOAAccountLinkScreenKey;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$navigator.popAll(Collections.singletonList(this.$key));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
