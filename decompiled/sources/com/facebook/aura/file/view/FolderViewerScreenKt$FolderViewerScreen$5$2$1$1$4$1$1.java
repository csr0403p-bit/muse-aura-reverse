package com.facebook.aura.file.view;

import X.AOI;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.view.FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$4$1$1", f = "FolderViewerScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$4$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AOI<Boolean> $entryVisibleState;
    public final /* synthetic */ boolean $isCollapsing;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$4$1$1(AOI<Boolean> aoi, boolean z, HtJ<? super FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$4$1$1> htJ) {
        super(2, htJ);
        this.$entryVisibleState = aoi;
        this.$isCollapsing = z;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$4$1$1(this.$entryVisibleState, this.$isCollapsing, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.$entryVisibleState.A0C(Boolean.valueOf(!this.$isCollapsing));
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$4$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
