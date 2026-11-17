package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.file.view.api.ContentItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ContentViewerScreenKt$ContentViewerContent$11$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<ContentItem> $deleteTargetItem$delegate;
    public final /* synthetic */ ContentItem $itemToDelete;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentViewerScreenKt$ContentViewerContent$11$1(ContentItem contentItem, MutableState<ContentItem> mutableState) {
        super(0);
        this.$itemToDelete = contentItem;
        this.$deleteTargetItem$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.MEDIA_VIEWER, HatchSubsurface.MEDIA_CONTROLS, HatchScreen.MEDIA_FULLSCREEN, HatchComponent.DELETE_CANCEL_BUTTON, null, AnonymousClass006.A10("media_type", ContentViewerScreenKt.mediaTypeString(this.$itemToDelete)), null);
        this.$deleteTargetItem$delegate.Af8(null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
