package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.model.BrowserTaskPresentation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchPinnedBrowserTaskPillKt$HatchPinnedBrowserTaskPill$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $sideChatSessionId;
    public final /* synthetic */ MutableState<BrowserTaskPresentation> $stopTarget$delegate;
    public final /* synthetic */ BrowserTaskPresentation $task;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPinnedBrowserTaskPillKt$HatchPinnedBrowserTaskPill$2$1$1(BrowserTaskPresentation browserTaskPresentation, String str, MutableState<BrowserTaskPresentation> mutableState) {
        super(0);
        this.$task = browserTaskPresentation;
        this.$sideChatSessionId = str;
        this.$stopTarget$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchPinnedBrowserTaskPillKt.logPinnedBrowserClick(HatchComponent.STOP_TASK_BUTTON, this.$task.browserTaskId, this.$sideChatSessionId);
        this.$stopTarget$delegate.Af8(this.$task);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
