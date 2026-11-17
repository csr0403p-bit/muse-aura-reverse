package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchTranscriptRendererKt$HatchTranscriptRendererWithBubbles$1$bubbleContent$1$2$1$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<HatchMessageUiModel, Unit> $reply;
    public final /* synthetic */ HatchMessageUiModel $segmentMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchTranscriptRendererKt$HatchTranscriptRendererWithBubbles$1$bubbleContent$1$2$1$2$1$1(G0U<? super HatchMessageUiModel, Unit> g0u, HatchMessageUiModel hatchMessageUiModel) {
        super(0);
        this.$reply = g0u;
        this.$segmentMessage = hatchMessageUiModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$reply.invoke(this.$segmentMessage);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
