package com.facebook.aura.navigation;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AuraNavDisplayKt$AuraNavDisplayContent$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ModalFlowSceneStrategy<AuraNavKey> $modalFlowSceneStrategy;
    public final /* synthetic */ boolean $modalFlowsEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraNavDisplayKt$AuraNavDisplayContent$1$1(ModalFlowSceneStrategy<AuraNavKey> modalFlowSceneStrategy, boolean z) {
        super(0);
        this.$modalFlowSceneStrategy = modalFlowSceneStrategy;
        this.$modalFlowsEnabled = z;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$modalFlowSceneStrategy.enabled = this.$modalFlowsEnabled;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
