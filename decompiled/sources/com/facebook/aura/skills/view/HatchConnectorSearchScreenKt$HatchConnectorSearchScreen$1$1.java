package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.C1C3;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectorSearchScreenKt$HatchConnectorSearchScreen$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1C3 $keyboard;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorSearchScreenKt$HatchConnectorSearchScreen$1$1(C1C3 c1c3, AuraNavigator auraNavigator) {
        super(0);
        this.$keyboard = c1c3;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        C1C3 c1c3 = this.$keyboard;
        if (c1c3 != null) {
            c1c3.hide();
        }
        this.$navigator.back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
