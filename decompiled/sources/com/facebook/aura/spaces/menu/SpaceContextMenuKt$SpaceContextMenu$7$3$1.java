package com.facebook.aura.spaces.menu;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.library.repo.ArtifactPlacement;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SpaceContextMenuKt$SpaceContextMenu$7$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<ArtifactPlacement> $moveConfirmationPlacement$delegate;
    public final /* synthetic */ SpaceMenuLogOrigin $moveLogOrigin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceContextMenuKt$SpaceContextMenu$7$3$1(SpaceMenuLogOrigin spaceMenuLogOrigin, MutableState<ArtifactPlacement> mutableState) {
        super(0);
        this.$moveLogOrigin = spaceMenuLogOrigin;
        this.$moveConfirmationPlacement$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SpaceMenuLogOrigin spaceMenuLogOrigin = this.$moveLogOrigin;
        if (spaceMenuLogOrigin != null) {
            SpaceMenuAnalytics.INSTANCE.logMoveToSpacesCancel$fbandroid_express_aura_java_com_facebook_aura_spaces_menu_menu(spaceMenuLogOrigin, false);
        }
        this.$moveConfirmationPlacement$delegate.Af8(null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
