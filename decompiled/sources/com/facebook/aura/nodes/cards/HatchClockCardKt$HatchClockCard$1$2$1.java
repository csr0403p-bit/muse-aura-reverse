package com.facebook.aura.nodes.cards;

import X.AbstractC7559F3s;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchClockCardKt$HatchClockCard$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ ClockCardData $data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchClockCardKt$HatchClockCard$1$2$1(Context context, ClockCardData clockCardData) {
        super(0);
        this.$context = context;
        this.$data = clockCardData;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchClockCardKt.launchDismiss(this.$context, this.$data);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
