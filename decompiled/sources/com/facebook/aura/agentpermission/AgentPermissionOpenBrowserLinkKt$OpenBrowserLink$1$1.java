package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import com.facebook.aura.browsertask.presentation.BrowserTaskActions;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AgentPermissionOpenBrowserLinkKt$OpenBrowserLink$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ BrowserTaskActions $actions;
    public final /* synthetic */ String $browserTaskId;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionOpenBrowserLinkKt$OpenBrowserLink$1$1(Function0<Unit> function0, BrowserTaskActions browserTaskActions, String str, AuraNavigator auraNavigator) {
        super(0);
        this.$onClick = function0;
        this.$actions = browserTaskActions;
        this.$browserTaskId = str;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onClick.invoke();
        this.$actions.focusTask(this.$browserTaskId);
        this.$navigator.back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
