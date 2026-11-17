package com.facebook.aura.agentpermission;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import com.facebook.aura.file.view.api.ContentViewerDataHolderKt;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AgentPermissionRequestPreviewAttachmentsKt$PreviewAttachmentMedia$openViewerModifier$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachment $item;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onOpen;
    public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachmentResource $resolvedResource;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionRequestPreviewAttachmentsKt$PreviewAttachmentMedia$openViewerModifier$1$1$1(Function0<Unit> function0, HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachmentResource agentPermissionRequestPreviewAttachmentResource, HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachment agentPermissionRequestPreviewAttachment, AbstractC3358CGz abstractC3358CGz, AuraNavigator auraNavigator) {
        super(0);
        this.$onOpen = function0;
        this.$resolvedResource = agentPermissionRequestPreviewAttachmentResource;
        this.$item = agentPermissionRequestPreviewAttachment;
        this.$userSession = abstractC3358CGz;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onOpen.invoke();
        ContentViewerDataHolderKt.navigateToFileViewerFromUrl(this.$resolvedResource.url, this.$item.fileName, this.$userSession, this.$navigator, null, false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
