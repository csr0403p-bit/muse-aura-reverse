package com.facebook.aura.composer.view;

import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchComposerKt$ComposerAttachmentPreviews$1$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchComposerEntryPoint $entryPoint;
    public final /* synthetic */ int $index;
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ G0U<Integer, Unit> $onClearFileClick;
    public final /* synthetic */ String $threadId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchComposerKt$ComposerAttachmentPreviews$1$2$1$1(boolean z, String str, HatchComposerEntryPoint hatchComposerEntryPoint, G0U<? super Integer, Unit> g0u, int i) {
        super(0);
        this.$isPrimaryThread = z;
        this.$threadId = str;
        this.$entryPoint = hatchComposerEntryPoint;
        this.$onClearFileClick = g0u;
        this.$index = i;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchComposerKt.logComposerClick(HatchComponent.ATTACHMENT_DISMISS_BUTTON, this.$isPrimaryThread, this.$threadId, this.$entryPoint);
        AnonymousClass005.A0l(this.$index, this.$onClearFileClick);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
