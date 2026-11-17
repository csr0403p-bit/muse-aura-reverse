package com.facebook.aura.library.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass006;
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
public final class HatchLibraryTabScreenKt$LibraryTabContent$2$1$4$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AHD<ContentItem> $contentItems;
    public final /* synthetic */ MediaEntryUiModel $entry;
    public final /* synthetic */ int $flatIndex;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLibraryTabScreenKt$LibraryTabContent$2$1$4$1$1$1$1(MediaEntryUiModel mediaEntryUiModel, AuraNavigator auraNavigator, AHD<ContentItem> ahd, int i) {
        super(0);
        this.$entry = mediaEntryUiModel;
        this.$navigator = auraNavigator;
        this.$contentItems = ahd;
        this.$flatIndex = i;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.LIBRARY, null, HatchScreen.LIBRARY_HOME, HatchComponent.MEDIA_THUMBNAIL, null, AnonymousClass006.A10("media_type", this.$entry.isVideo ? "video" : "image"), null);
        ContentViewerDataHolderKt.navigateToContentViewer(this.$navigator, this.$contentItems, this.$flatIndex, false, false, null, false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
