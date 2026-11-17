package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.file.view.api.ContentItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ContentViewerScreenKt$ContentViewerContent$9$6$1 extends AbstractC7559F3s implements G0U<ContentItem, Unit> {
    public final /* synthetic */ Function0<Unit> $requestBack;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentViewerScreenKt$ContentViewerContent$9$6$1(Function0<Unit> function0) {
        super(1);
        this.$requestBack = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ContentItem contentItem) {
        AnonymousClass006.A0b(contentItem).logClick(HatchSurface.MEDIA_VIEWER, HatchSubsurface.MEDIA_CONTROLS, HatchScreen.MEDIA_FULLSCREEN, HatchComponent.REPLY_BUTTON, null, AnonymousClass006.A10("media_type", ContentViewerScreenKt.mediaTypeString(contentItem)), null);
        HatchPendingSendAction hatchPendingSendAction = HatchPendingSendAction.INSTANCE;
        String str = contentItem.messageId;
        String str2 = contentItem.workspacePath;
        if (str2 == null) {
            str2 = contentItem.imageUri;
        }
        hatchPendingSendAction.set(str, str2);
        this.$requestBack.invoke();
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ContentItem contentItem) {
        invoke2(contentItem);
        return Unit.INSTANCE;
    }
}
