package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import com.facebook.aura.browsertask.navigation.BrowserTaskNavigation;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class CheckoutApprovalCardKt$CheckoutScreenshot$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ BrowserTaskNavigation $actions;
    public final /* synthetic */ String $browserTaskId;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onOpenBrowserClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutApprovalCardKt$CheckoutScreenshot$3$1$1(Function0<Unit> function0, BrowserTaskNavigation browserTaskNavigation, String str, AuraNavigator auraNavigator) {
        super(0);
        this.$onOpenBrowserClick = function0;
        this.$actions = browserTaskNavigation;
        this.$browserTaskId = str;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onOpenBrowserClick.invoke();
        this.$actions.openTaskPreview(this.$browserTaskId, this.$navigator);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
