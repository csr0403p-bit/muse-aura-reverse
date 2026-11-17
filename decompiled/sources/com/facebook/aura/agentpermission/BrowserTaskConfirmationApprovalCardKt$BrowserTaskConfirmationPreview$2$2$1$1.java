package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import com.facebook.aura.browsertask.navigation.BrowserTaskNavigation;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class BrowserTaskConfirmationApprovalCardKt$BrowserTaskConfirmationPreview$2$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ BrowserTaskNavigation $actions;
    public final /* synthetic */ HatchAgentPermissionsRepository.BrowserTaskConfirmationApproval $confirmation;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onOpenBrowserClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserTaskConfirmationApprovalCardKt$BrowserTaskConfirmationPreview$2$2$1$1(Function0<Unit> function0, BrowserTaskNavigation browserTaskNavigation, HatchAgentPermissionsRepository.BrowserTaskConfirmationApproval browserTaskConfirmationApproval, AuraNavigator auraNavigator) {
        super(0);
        this.$onOpenBrowserClick = function0;
        this.$actions = browserTaskNavigation;
        this.$confirmation = browserTaskConfirmationApproval;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onOpenBrowserClick.invoke();
        this.$actions.openTaskPreview(this.$confirmation.browserTaskId, this.$navigator);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
