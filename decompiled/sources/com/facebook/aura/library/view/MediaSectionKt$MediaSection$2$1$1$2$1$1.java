package com.facebook.aura.library.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C1BO;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentViewerDataHolderKt;
import com.facebook.aura.library.model.MediaEntryUiModel;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaSectionKt$MediaSection$2$1$1$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AHD<ContentItem> $contentItems;
    public final /* synthetic */ C1BO<AuraNavigator> $currentNavigator;
    public final /* synthetic */ MediaEntryUiModel $entry;
    public final /* synthetic */ int $index;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaSectionKt$MediaSection$2$1$1$2$1$1(MediaEntryUiModel mediaEntryUiModel, C1BO<? extends AuraNavigator> c1bo, AHD<ContentItem> ahd, int i) {
        super(0);
        this.$entry = mediaEntryUiModel;
        this.$currentNavigator = c1bo;
        this.$contentItems = ahd;
        this.$index = i;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.LIBRARY, null, HatchScreen.LIBRARY_HOME, HatchComponent.MEDIA_THUMBNAIL, null, AnonymousClass006.A10("media_type", this.$entry.isVideo ? "video" : "image"), null);
        ContentViewerDataHolderKt.navigateToContentViewer(this.$currentNavigator.getValue(), this.$contentItems, this.$index, false, false, null, false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
