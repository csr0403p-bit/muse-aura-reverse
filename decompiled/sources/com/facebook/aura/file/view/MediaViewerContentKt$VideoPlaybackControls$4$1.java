package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.view.MediaViewerContentKt$VideoPlaybackControls$4$1", f = "MediaViewerContent.kt", l = {1668}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class MediaViewerContentKt$VideoPlaybackControls$4$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $isPlaying;
    public final /* synthetic */ G0U<Boolean, Unit> $onShowControlsChanged;
    public final /* synthetic */ boolean $showControls;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaViewerContentKt$VideoPlaybackControls$4$1(boolean z, boolean z2, G0U<? super Boolean, Unit> g0u, HtJ<? super MediaViewerContentKt$VideoPlaybackControls$4$1> htJ) {
        super(2, htJ);
        this.$showControls = z;
        this.$isPlaying = z2;
        this.$onShowControlsChanged = g0u;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new MediaViewerContentKt$VideoPlaybackControls$4$1(this.$showControls, this.$isPlaying, this.$onShowControlsChanged, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$showControls && this.$isPlaying) {
                this.label = 1;
                if (C7Bq.A01(3000L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        AnonymousClass001.A1K(false, this.$onShowControlsChanged);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((MediaViewerContentKt$VideoPlaybackControls$4$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
