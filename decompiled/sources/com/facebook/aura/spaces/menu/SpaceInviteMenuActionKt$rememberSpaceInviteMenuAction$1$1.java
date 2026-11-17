package com.facebook.aura.spaces.menu;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.SpaceInviteScreenKey;
import com.facebook.aura.utils.HatchUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SpaceInviteMenuActionKt$rememberSpaceInviteMenuAction$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $expanded;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onReady;
    public final /* synthetic */ String $slug;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceInviteMenuActionKt$rememberSpaceInviteMenuAction$1$1(boolean z, Function0<Unit> function0, AuraNavigator auraNavigator, String str) {
        super(0);
        this.$expanded = z;
        this.$onReady = function0;
        this.$navigator = auraNavigator;
        this.$slug = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$expanded && HatchUtil.INSTANCE.isConnectionsTabEnabled()) {
            this.$onReady.invoke();
            this.$navigator.navigate((AuraNavKey) new SpaceInviteScreenKey(this.$slug), false);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
