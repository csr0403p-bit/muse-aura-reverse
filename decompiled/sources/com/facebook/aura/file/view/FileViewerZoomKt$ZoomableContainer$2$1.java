package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1390AiL;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FileViewerZoomKt$ZoomableContainer$2$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ ZoomState $zoomState;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        c2av.AeX(MutableState.A00(this.$zoomState.scaleAnimation));
        c2av.AeY(MutableState.A00(this.$zoomState.scaleAnimation));
        c2av.Af5(AnonymousClass001.A00(this.$zoomState.m933getOffsetF1C5BW0()));
        c2av.Af6(AnonymousClass001.A01(this.$zoomState.m933getOffsetF1C5BW0(), 4294967295L));
        c2av.Ad2(true);
        long j = ((C1390AiL) c2av).A0D;
        long jA00 = (((int) AnonymousClass001.A00(j)) << 32) | (4294967295L & ((int) AnonymousClass001.A01(j, 4294967295L)));
        ZoomState zoomState = this.$zoomState;
        zoomState.canvasSize = jA00;
        zoomState.mediaSize = jA00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileViewerZoomKt$ZoomableContainer$2$1(ZoomState zoomState) {
        super(1);
        this.$zoomState = zoomState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
