package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import X.CFK;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SpaceNavigationIconKt$SpaceNavigationIcon$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $isSaved;
    public final /* synthetic */ MutableState<Boolean> $previewFailed$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceNavigationIconKt$SpaceNavigationIcon$2$1(boolean z, MutableState<Boolean> mutableState) {
        super(0);
        this.$isSaved = z;
        this.$previewFailed$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$isSaved) {
            CFK.A06("SavedSpaceViewer", "event=nav_icon_load_failed");
        }
        MutableState.A09(true, this.$previewFailed$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
