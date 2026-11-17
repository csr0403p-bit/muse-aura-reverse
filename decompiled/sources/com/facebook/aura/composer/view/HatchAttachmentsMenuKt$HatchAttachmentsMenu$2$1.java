package com.facebook.aura.composer.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAttachmentsMenuKt$HatchAttachmentsMenu$2$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ G0U<HatchComponent, Unit> $logClick;
    public final /* synthetic */ Function0<Unit> $onCameraClick;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ Function0<Unit> $onFilesClick;
    public final /* synthetic */ Function0<Unit> $onGalleryClick;
    public final /* synthetic */ Function0<Unit> $onVideoClick;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        Function0<Unit> function0;
        C7384Etj.A0Y(auraContextMenuItem, 0);
        this.$onDismiss.invoke();
        int i = auraContextMenuItem.id;
        if (i == 0) {
            this.$logClick.invoke(HatchComponent.CAMERA_BUTTON);
            function0 = this.$onCameraClick;
        } else if (i == 1) {
            this.$logClick.invoke(HatchComponent.PHOTO_BUTTON);
            function0 = this.$onGalleryClick;
        } else if (i == 2) {
            this.$logClick.invoke(HatchComponent.VIDEO_BUTTON);
            function0 = this.$onVideoClick;
        } else {
            if (i != 3) {
                return;
            }
            this.$logClick.invoke(HatchComponent.DOCUMENT_BUTTON);
            function0 = this.$onFilesClick;
        }
        function0.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchAttachmentsMenuKt$HatchAttachmentsMenu$2$1(Function0<Unit> function0, G0U<? super HatchComponent, Unit> g0u, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05) {
        super(1);
        this.$onDismiss = function0;
        this.$logClick = g0u;
        this.$onCameraClick = function02;
        this.$onGalleryClick = function03;
        this.$onVideoClick = function04;
        this.$onFilesClick = function05;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
