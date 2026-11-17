package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsCollaboratingSectionKt$ConnectionsCollaboratingRow$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavKey $destination;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onOpen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsCollaboratingSectionKt$ConnectionsCollaboratingRow$1$1(AuraNavKey auraNavKey, Function0<Unit> function0, AuraNavigator auraNavigator) {
        super(0);
        this.$destination = auraNavKey;
        this.$onOpen = function0;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraNavKey auraNavKey = this.$destination;
        if (auraNavKey != null) {
            Function0<Unit> function0 = this.$onOpen;
            AuraNavigator auraNavigator = this.$navigator;
            function0.invoke();
            auraNavigator.popAll(ConnectionsCollaboratingSectionKt$ConnectionsCollaboratingRow$1$1$1$1.INSTANCE);
            auraNavigator.navigate(auraNavKey, false);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
