package com.facebook.aura.spaces.menu;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SpaceContextMenuKt$SpaceContextMenu$6$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ SpaceMenuLogOrigin $logOrigin;
    public final /* synthetic */ MutableState<Boolean> $showDeleteConfirmation$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceContextMenuKt$SpaceContextMenu$6$1(SpaceMenuLogOrigin spaceMenuLogOrigin, MutableState<Boolean> mutableState) {
        super(0);
        this.$logOrigin = spaceMenuLogOrigin;
        this.$showDeleteConfirmation$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SpaceMenuLogOrigin spaceMenuLogOrigin = this.$logOrigin;
        if (spaceMenuLogOrigin != null) {
            SpaceMenuAnalytics.INSTANCE.logDeleteCancel$fbandroid_express_aura_java_com_facebook_aura_spaces_menu_menu(spaceMenuLogOrigin, false);
        }
        MutableState.A09(false, this.$showDeleteConfirmation$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
