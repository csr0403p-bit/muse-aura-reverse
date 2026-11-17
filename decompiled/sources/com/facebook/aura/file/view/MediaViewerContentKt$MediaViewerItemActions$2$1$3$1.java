package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.file.view.api.ContentItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerItemActions$2$1$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ContentItem $currentItem;
    public final /* synthetic */ G0U<Boolean, Unit> $setMenuExpanded;
    public final /* synthetic */ MutableState<Boolean> $showContextMenu$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaViewerContentKt$MediaViewerItemActions$2$1$3$1(ContentItem contentItem, G0U<? super Boolean, Unit> g0u, MutableState<Boolean> mutableState) {
        super(0);
        this.$currentItem = contentItem;
        this.$setMenuExpanded = g0u;
        this.$showContextMenu$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState<Boolean> mutableState = this.$showContextMenu$delegate;
        float f = MediaViewerContentKt.CONTROLS_SCRIM_ALPHA;
        if (MutableState.A0A((MutableState) mutableState)) {
            MediaViewerContentKt.logMediaMenuDismiss(ContentViewerScreenKt.mediaTypeString(this.$currentItem));
        }
        AnonymousClass001.A1K(false, this.$setMenuExpanded);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
