package com.facebook.aura.file.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass006;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.gateway.HatchDeleteLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ContentViewerScreenKt$ContentViewerContent$10$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<ContentItem> $deleteTargetItem$delegate;
    public final /* synthetic */ ContentItem $itemToDelete;
    public final /* synthetic */ Function0<Unit> $requestBack;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentViewerScreenKt$ContentViewerContent$10$1(ContentItem contentItem, AbstractC3358CGz abstractC3358CGz, Function0<Unit> function0, MutableState<ContentItem> mutableState) {
        super(0);
        this.$itemToDelete = contentItem;
        this.$userSession = abstractC3358CGz;
        this.$requestBack = function0;
        this.$deleteTargetItem$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String str;
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.MEDIA_VIEWER, HatchSubsurface.MEDIA_CONTROLS, HatchScreen.MEDIA_FULLSCREEN, HatchComponent.DELETE_CONFIRM_BUTTON, null, AnonymousClass006.A10("media_type", ContentViewerScreenKt.mediaTypeString(this.$itemToDelete)), null);
        ContentItem contentItem = this.$itemToDelete;
        String str2 = contentItem.workspacePath;
        HatchDeleteLogger hatchDeleteLogger = HatchDeleteLogger.INSTANCE;
        if (str2 == null) {
            str = contentItem.imageUri;
            if (str == null) {
                str = "unknown";
            }
        } else {
            str = str2;
        }
        hatchDeleteLogger.logDeleteConfirmed(ContentViewerScreenKt.CONTENT_VIEWER_DELETE_SOURCE, str, contentItem.name);
        this.$deleteTargetItem$delegate.Af8(null);
        if (str2 != null) {
            HatchMediaDeletionManager.Companion.getInstance(this.$userSession).deleteMedia(str2, false);
        }
        this.$requestBack.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
