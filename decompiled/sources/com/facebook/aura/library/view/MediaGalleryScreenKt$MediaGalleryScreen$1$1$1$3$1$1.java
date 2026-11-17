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
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaGalleryScreenKt$MediaGalleryScreen$1$1$1$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<AHD<ContentItem>> $contentItems;
    public final /* synthetic */ C1BO<AuraNavigator> $currentNavigator;
    public final /* synthetic */ int $index;
    public final /* synthetic */ boolean $isVideo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaGalleryScreenKt$MediaGalleryScreen$1$1$1$3$1$1(boolean z, C1BO<? extends AuraNavigator> c1bo, C1BO<? extends AHD<ContentItem>> c1bo2, int i) {
        super(0);
        this.$isVideo = z;
        this.$currentNavigator = c1bo;
        this.$contentItems = c1bo2;
        this.$index = i;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.LIBRARY, null, HatchScreen.LIBRARY_HOME, HatchComponent.MEDIA_THUMBNAIL, null, AnonymousClass006.A10("media_type", this.$isVideo ? "video" : "image"), null);
        ContentViewerDataHolderKt.navigateToContentViewer(this.$currentNavigator.getValue(), this.$contentItems.getValue(), this.$index, false, false, null, false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
