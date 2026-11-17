package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.file.view.ContentViewerViewModel;
import com.facebook.aura.file.view.api.ContentItem;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ContentViewerScreenKt$ContentViewerContent$9$8$1 extends AbstractC7559F3s implements G0U<ContentItem, Unit> {
    public final /* synthetic */ C1BO<ContentViewerViewModel.UiState> $uiState$delegate;
    public final /* synthetic */ ContentViewerViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ContentItem contentItem) {
        C7384Etj.A0Y(contentItem, 0);
        if (this.$uiState$delegate.getValue().isCopyInProgress) {
            return;
        }
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.MEDIA_VIEWER, HatchSubsurface.MEDIA_CONTROLS, HatchScreen.MEDIA_FULLSCREEN, HatchComponent.COPY_BUTTON, null, AnonymousClass006.A10("media_type", ContentViewerScreenKt.mediaTypeString(contentItem)), null);
        this.$viewModel.onCopyClick(contentItem);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentViewerScreenKt$ContentViewerContent$9$8$1(ContentViewerViewModel contentViewerViewModel, C1BO<ContentViewerViewModel.UiState> c1bo) {
        super(1);
        this.$viewModel = contentViewerViewModel;
        this.$uiState$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ContentItem contentItem) {
        invoke2(contentItem);
        return Unit.INSTANCE;
    }
}
