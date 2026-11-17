package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C1BO;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.file.view.api.ContentItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerContent$logSwipeDismiss$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<ContentItem> $currentDismissItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerContentKt$MediaViewerContent$logSwipeDismiss$1$1(C1BO<ContentItem> c1bo) {
        super(0);
        this.$currentDismissItem = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logSwipe(HatchSurface.MEDIA_VIEWER, null, HatchScreen.MEDIA_FULLSCREEN, null, AnonymousClass006.A10("media_type", ContentViewerScreenKt.mediaTypeString(this.$currentDismissItem.getValue())));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
