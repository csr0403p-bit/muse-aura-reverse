package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSidePanelTabsKt$SidePanelSpaceMenuButton$1$4$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<String, Unit> $onChangeSpaceIcon;
    public final /* synthetic */ String $prompt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraSidePanelTabsKt$SidePanelSpaceMenuButton$1$4$1$1(G0U<? super String, Unit> g0u, String str) {
        super(0);
        this.$onChangeSpaceIcon = g0u;
        this.$prompt = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        G0U<String, Unit> g0u = this.$onChangeSpaceIcon;
        if (g0u != null) {
            g0u.invoke(this.$prompt);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
