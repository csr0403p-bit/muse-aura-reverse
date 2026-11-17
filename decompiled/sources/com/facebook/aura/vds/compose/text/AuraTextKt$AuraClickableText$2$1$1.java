package com.facebook.aura.vds.compose.text;

import X.AbstractC7559F3s;
import X.C1958Aux;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraTextKt$AuraClickableText$2$1$1 extends AbstractC7559F3s implements G0U<C1958Aux, Unit> {
    public final /* synthetic */ MutableState<C1958Aux> $layoutResult;
    public final /* synthetic */ G0U<C1958Aux, Unit> $onTextLayout;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C1958Aux c1958Aux) {
        C7384Etj.A0Y(c1958Aux, 0);
        this.$layoutResult.Af8(c1958Aux);
        this.$onTextLayout.invoke(c1958Aux);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraTextKt$AuraClickableText$2$1$1(MutableState<C1958Aux> mutableState, G0U<? super C1958Aux, Unit> g0u) {
        super(1);
        this.$layoutResult = mutableState;
        this.$onTextLayout = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C1958Aux c1958Aux) {
        invoke2(c1958Aux);
        return Unit.INSTANCE;
    }
}
