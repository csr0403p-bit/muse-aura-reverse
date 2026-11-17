package com.facebook.aura.spaces.menu;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SpaceRenameDialogKt$SpaceRenameDialog$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ SpaceMenuLogOrigin $logOrigin;
    public final /* synthetic */ Function0<Unit> $onConfirm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceRenameDialogKt$SpaceRenameDialog$1$1(SpaceMenuLogOrigin spaceMenuLogOrigin, Function0<Unit> function0) {
        super(0);
        this.$logOrigin = spaceMenuLogOrigin;
        this.$onConfirm = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SpaceMenuLogOrigin spaceMenuLogOrigin = this.$logOrigin;
        if (spaceMenuLogOrigin != null) {
            SpaceMenuAnalytics.INSTANCE.logRenameConfirm$fbandroid_express_aura_java_com_facebook_aura_spaces_menu_menu(spaceMenuLogOrigin);
        }
        this.$onConfirm.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
