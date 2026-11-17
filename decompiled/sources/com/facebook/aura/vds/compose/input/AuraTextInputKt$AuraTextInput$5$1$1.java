package com.facebook.aura.vds.compose.input;

import X.AbstractC7559F3s;
import X.C1805ArO;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraTextInputKt$AuraTextInput$5$1$1 extends AbstractC7559F3s implements G0U<C1805ArO, Unit> {
    public final /* synthetic */ G0U<C1805ArO, Unit> $onChange;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C1805ArO c1805ArO) {
        C7384Etj.A0Y(c1805ArO, 0);
        this.$onChange.invoke(c1805ArO);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraTextInputKt$AuraTextInput$5$1$1(G0U<? super C1805ArO, Unit> g0u) {
        super(1);
        this.$onChange = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C1805ArO c1805ArO) {
        invoke2(c1805ArO);
        return Unit.INSTANCE;
    }
}
