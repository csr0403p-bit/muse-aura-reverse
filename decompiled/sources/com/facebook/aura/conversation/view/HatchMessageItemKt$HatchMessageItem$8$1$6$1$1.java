package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageItemKt$HatchMessageItem$8$1$6$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ G0U<String, Unit> $retry;
    public final /* synthetic */ String $sideChatSessionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageItemKt$HatchMessageItem$8$1$6$1$1(HatchMessageUiModel hatchMessageUiModel, String str, G0U<? super String, Unit> g0u) {
        super(0);
        this.$message = hatchMessageUiModel;
        this.$sideChatSessionId = str;
        this.$retry = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchMessageItemKt.logSendRetryClick(this.$message, this.$sideChatSessionId);
        this.$retry.invoke(this.$message.id);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
