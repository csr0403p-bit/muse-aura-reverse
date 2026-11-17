package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.G0V;
import com.facebook.aura.model.TextWithButtonCta;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchTextWithButtonCardKt$HatchTextWithButtonCard$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ TextWithButtonCta $cta;
    public final /* synthetic */ int $index;
    public final /* synthetic */ G0V<Integer, TextWithButtonCta, Unit> $onButtonClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchTextWithButtonCardKt$HatchTextWithButtonCard$1$1$1$1(G0V<? super Integer, ? super TextWithButtonCta, Unit> g0v, int i, TextWithButtonCta textWithButtonCta) {
        super(0);
        this.$onButtonClick = g0v;
        this.$index = i;
        this.$cta = textWithButtonCta;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        G0V<Integer, TextWithButtonCta, Unit> g0v = this.$onButtonClick;
        if (g0v != null) {
            g0v.invoke(Integer.valueOf(this.$index), this.$cta);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
