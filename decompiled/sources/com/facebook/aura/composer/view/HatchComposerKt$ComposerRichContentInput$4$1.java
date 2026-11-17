package com.facebook.aura.composer.view;

import X.AXN;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C1958Aux;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchComposerKt$ComposerRichContentInput$4$1 extends AbstractC7559F3s implements G0V<AXN, Function0<? extends C1958Aux>, Unit> {
    public final /* synthetic */ G0V<AXN, C1958Aux, Unit> $onTextLayout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchComposerKt$ComposerRichContentInput$4$1(G0V<? super AXN, ? super C1958Aux, Unit> g0v) {
        super(2);
        this.$onTextLayout = g0v;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(AXN axn, Function0<? extends C1958Aux> function0) {
        invoke2(axn, (Function0<C1958Aux>) function0);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AXN axn, Function0<C1958Aux> function0) {
        AnonymousClass003.A0u(axn, function0);
        C1958Aux c1958AuxInvoke = function0.invoke();
        if (c1958AuxInvoke != null) {
            this.$onTextLayout.invoke(axn, c1958AuxInvoke);
        }
    }
}
