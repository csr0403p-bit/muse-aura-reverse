package com.facebook.aura.file.view;

import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C1BO;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.file.view.ContentViewerViewModel;
import com.facebook.aura.file.view.api.ContentItem;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ContentViewerScreenKt$ContentViewerContent$9$4$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ MutableState<Boolean> $isMuted$delegate;
    public final /* synthetic */ AHD<ContentItem> $items;
    public final /* synthetic */ C1BO<ContentViewerViewModel.UiState> $uiState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentViewerScreenKt$ContentViewerContent$9$4$1(AHD<ContentItem> ahd, MutableState<Boolean> mutableState, C1BO<ContentViewerViewModel.UiState> c1bo) {
        super(1);
        this.$items = ahd;
        this.$isMuted$delegate = mutableState;
        this.$uiState$delegate = c1bo;
    }

    public final void invoke(boolean z) {
        MutableState.A09(z, this.$isMuted$delegate);
        HatchInteractionLogger.INSTANCE.logToggle(z, HatchSurface.MEDIA_VIEWER, HatchSubsurface.MEDIA_CONTROLS, HatchScreen.MEDIA_FULLSCREEN, HatchComponent.SPEAKER_BUTTON, null, AnonymousClass006.A10("media_type", ContentViewerScreenKt.mediaTypeString((ContentItem) AbstractC0878AGe.A0A(this.$uiState$delegate.getValue().currentPage, this.$items))));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
