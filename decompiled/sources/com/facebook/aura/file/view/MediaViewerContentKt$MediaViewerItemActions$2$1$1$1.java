package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.file.view.api.ContentItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerItemActions$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ContentItem $currentItem;
    public final /* synthetic */ G0U<Boolean, Unit> $setMenuExpanded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaViewerContentKt$MediaViewerItemActions$2$1$1$1(ContentItem contentItem, G0U<? super Boolean, Unit> g0u) {
        super(0);
        this.$currentItem = contentItem;
        this.$setMenuExpanded = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.MEDIA_VIEWER, HatchSubsurface.MEDIA_CONTROLS, HatchScreen.MEDIA_FULLSCREEN, HatchComponent.THREE_DOTS_MENU, null, AnonymousClass006.A10("media_type", ContentViewerScreenKt.mediaTypeString(this.$currentItem)), null);
        AnonymousClass001.A1K(true, this.$setMenuExpanded);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
