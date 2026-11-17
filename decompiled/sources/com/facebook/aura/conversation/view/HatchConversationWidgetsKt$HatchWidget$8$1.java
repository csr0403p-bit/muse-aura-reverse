package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationWidgetsKt$HatchWidget$8$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ String $heightCacheKey;
    public final /* synthetic */ G0V<String, Integer, Unit> $onSetWidgetHeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationWidgetsKt$HatchWidget$8$1(G0V<? super String, ? super Integer, Unit> g0v, String str) {
        super(1);
        this.$onSetWidgetHeight = g0v;
        this.$heightCacheKey = str;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        AnonymousClass001.A1H(this.$heightCacheKey, this.$onSetWidgetHeight, i);
    }
}
