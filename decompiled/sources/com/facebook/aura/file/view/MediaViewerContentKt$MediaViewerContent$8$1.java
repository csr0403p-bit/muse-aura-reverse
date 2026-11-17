package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.view.MediaViewerContentKt$MediaViewerContent$8$1", f = "MediaViewerContent.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerContent$8$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $currentItemIsVideo;
    public final /* synthetic */ G0U<Boolean, Unit> $onUserPausedChanged;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaViewerContentKt$MediaViewerContent$8$1(boolean z, G0U<? super Boolean, Unit> g0u, HtJ<? super MediaViewerContentKt$MediaViewerContent$8$1> htJ) {
        super(2, htJ);
        this.$currentItemIsVideo = z;
        this.$onUserPausedChanged = g0u;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new MediaViewerContentKt$MediaViewerContent$8$1(this.$currentItemIsVideo, this.$onUserPausedChanged, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (this.$currentItemIsVideo) {
            AnonymousClass001.A1K(false, this.$onUserPausedChanged);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((MediaViewerContentKt$MediaViewerContent$8$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
