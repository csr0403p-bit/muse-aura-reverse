package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import com.facebook.aura.gateway.EditableMessageAttachment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AgentPermissionMessageEditorScreenKt$MessageEditorAttachments$2$1$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ EditableMessageAttachment $attachment;
    public final /* synthetic */ AgentPermissionMessageEditorViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionMessageEditorScreenKt$MessageEditorAttachments$2$1$1$1$1$1(AgentPermissionMessageEditorViewModel agentPermissionMessageEditorViewModel, EditableMessageAttachment editableMessageAttachment) {
        super(0);
        this.$viewModel = agentPermissionMessageEditorViewModel;
        this.$attachment = editableMessageAttachment;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.removeAttachment(this.$attachment.id);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
