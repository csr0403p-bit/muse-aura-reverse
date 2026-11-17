package com.facebook.aura.vds.compose.card;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraCardOptionKt$AuraCardOption$6$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ G0U<Boolean, Unit> $onChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraCardOptionKt$AuraCardOption$6$1(G0U<? super Boolean, Unit> g0u) {
        super(1);
        this.$onChange = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        G0U<Boolean, Unit> g0u = this.$onChange;
        if (g0u != null) {
            AnonymousClass001.A1K(z, g0u);
        }
    }
}
