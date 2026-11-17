package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ArtifactFileActionMenuKt$ArtifactFileActionMenu$8$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $expanded;
    public final /* synthetic */ String $fileExtension;
    public final /* synthetic */ HatchScreen $loggingScreen;
    public final /* synthetic */ Function0<Unit> $onDismiss;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArtifactFileActionMenuKt$ArtifactFileActionMenu$8$1(boolean z, HatchScreen hatchScreen, String str, Function0<Unit> function0) {
        super(0);
        this.$expanded = z;
        this.$loggingScreen = hatchScreen;
        this.$fileExtension = str;
        this.$onDismiss = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$expanded) {
            ArtifactFileActionMenuKt.logFileMenuDismiss(this.$loggingScreen, this.$fileExtension);
        }
        this.$onDismiss.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
