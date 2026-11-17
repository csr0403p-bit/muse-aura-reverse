package com.facebook.aura.composer.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchComposerKt$HatchComposer$9$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchComposerEntryPoint $entryPoint;
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ Function0<Unit> $onClearAttachmentPreviewClick;
    public final /* synthetic */ String $threadId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$HatchComposer$9$1$1(boolean z, String str, HatchComposerEntryPoint hatchComposerEntryPoint, Function0<Unit> function0) {
        super(0);
        this.$isPrimaryThread = z;
        this.$threadId = str;
        this.$entryPoint = hatchComposerEntryPoint;
        this.$onClearAttachmentPreviewClick = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchComposerKt.logComposerClick(HatchComponent.ATTACHMENT_DISMISS_BUTTON, this.$isPrimaryThread, this.$threadId, this.$entryPoint);
        this.$onClearAttachmentPreviewClick.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
