package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ArtifactFileActionMenuKt$ArtifactFileActionMenu$7$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $fileExtension;
    public final /* synthetic */ HatchScreen $loggingScreen;
    public final /* synthetic */ MutableState<Boolean> $showDeleteConfirmation$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArtifactFileActionMenuKt$ArtifactFileActionMenu$7$1(HatchScreen hatchScreen, String str, MutableState<Boolean> mutableState) {
        super(0);
        this.$loggingScreen = hatchScreen;
        this.$fileExtension = str;
        this.$showDeleteConfirmation$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ArtifactFileActionMenuKt.logFileMenuClick(this.$loggingScreen, HatchComponent.DELETE_BUTTON, this.$fileExtension);
        MutableState.A09(true, this.$showDeleteConfirmation$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
