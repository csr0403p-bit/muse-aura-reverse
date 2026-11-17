package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C1BO;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$onUnsend$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<Boolean> $hasSeenUnsendNux$delegate;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ MutableState<Boolean> $showUnsendNux$delegate;
    public final /* synthetic */ G0U<HatchMessageUiModel, Unit> $unsend;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$onUnsend$2$1$1(G0U<? super HatchMessageUiModel, Unit> g0u, HatchMessageUiModel hatchMessageUiModel, C1BO<Boolean> c1bo, MutableState<Boolean> mutableState) {
        super(0);
        this.$unsend = g0u;
        this.$message = hatchMessageUiModel;
        this.$hasSeenUnsendNux$delegate = c1bo;
        this.$showUnsendNux$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        C1BO<Boolean> c1bo = this.$hasSeenUnsendNux$delegate;
        float f = HatchMessageLongPressMenuHostKt.MenuGap;
        if (C1BO.A0F(c1bo)) {
            this.$unsend.invoke(this.$message);
        } else {
            MutableState.A09(true, this.$showUnsendNux$delegate);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
