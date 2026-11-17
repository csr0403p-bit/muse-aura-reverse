package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.file.view.api.ContentItem;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ContentViewerScreenKt$ContentViewerContent$9$9$1 extends AbstractC7559F3s implements G0U<ContentItem, Unit> {
    public final /* synthetic */ MutableState<ContentItem> $deleteTargetItem$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentViewerScreenKt$ContentViewerContent$9$9$1(MutableState<ContentItem> mutableState) {
        super(1);
        this.$deleteTargetItem$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ContentItem contentItem) {
        AnonymousClass006.A0b(contentItem).logClick(HatchSurface.MEDIA_VIEWER, HatchSubsurface.MEDIA_CONTROLS, HatchScreen.MEDIA_FULLSCREEN, HatchComponent.DELETE_BUTTON, null, AnonymousClass006.A10("media_type", ContentViewerScreenKt.mediaTypeString(contentItem)), null);
        this.$deleteTargetItem$delegate.Af8(contentItem);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ContentItem contentItem) {
        invoke2(contentItem);
        return Unit.INSTANCE;
    }
}
