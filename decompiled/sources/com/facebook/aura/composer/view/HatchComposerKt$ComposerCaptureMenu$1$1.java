package com.facebook.aura.composer.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchComposerKt$ComposerCaptureMenu$1$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ Function0<Unit> $onCameraClick;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ Function0<Unit> $onScreenshotClick;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        Function0<Unit> function0;
        C7384Etj.A0Y(auraContextMenuItem, 0);
        this.$onDismiss.invoke();
        int i = auraContextMenuItem.id;
        if (i == 0) {
            function0 = this.$onCameraClick;
        } else if (i != 1) {
            return;
        } else {
            function0 = this.$onScreenshotClick;
        }
        function0.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$ComposerCaptureMenu$1$1(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        super(1);
        this.$onDismiss = function0;
        this.$onCameraClick = function02;
        this.$onScreenshotClick = function03;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
