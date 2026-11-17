package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerItemActions$setMenuExpanded$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ G0U<Boolean, Unit> $onMenuExpandedChanged;
    public final /* synthetic */ MutableState<Boolean> $showContextMenu$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaViewerContentKt$MediaViewerItemActions$setMenuExpanded$1$1(G0U<? super Boolean, Unit> g0u, MutableState<Boolean> mutableState) {
        super(1);
        this.$onMenuExpandedChanged = g0u;
        this.$showContextMenu$delegate = mutableState;
    }

    public final void invoke(boolean z) {
        MutableState<Boolean> mutableState = this.$showContextMenu$delegate;
        float f = MediaViewerContentKt.CONTROLS_SCRIM_ALPHA;
        MutableState.A09(z, mutableState);
        AnonymousClass001.A1K(z, this.$onMenuExpandedChanged);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
