package com.facebook.aura.vds.compose.image;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraRetryViewKt$AuraRetryView$1$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ Function0<Unit> $onRetryClick;
    public final /* synthetic */ MutableState<Boolean> $showRetryView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraRetryViewKt$AuraRetryView$1$1(MutableState<Boolean> mutableState, Function0<Unit> function0) {
        super(1);
        this.$showRetryView = mutableState;
        this.$onRetryClick = function0;
    }

    public final void invoke(int i) {
        MutableState.A09(false, this.$showRetryView);
        this.$onRetryClick.invoke();
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
