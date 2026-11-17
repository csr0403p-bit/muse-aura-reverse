package com.facebook.aura.vds.compose.header;

import X.AbstractC7559F3s;
import com.facebook.aura.vds.toolbar.AuraToolbarAgent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraPageHeaderKt$AuraPageHeader$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraToolbarAgent.Config $config;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraPageHeaderKt$AuraPageHeader$1$1(AuraToolbarAgent.Config config) {
        super(0);
        this.$config = config;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function0<Unit> function0 = this.$config.navigationOnClickListener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
