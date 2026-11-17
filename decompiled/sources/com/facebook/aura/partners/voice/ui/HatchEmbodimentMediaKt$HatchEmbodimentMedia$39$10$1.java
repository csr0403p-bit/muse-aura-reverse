package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.view.Surface;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$39$10$1 extends AbstractC7559F3s implements G0U<Surface, Unit> {
    public final /* synthetic */ G0U<Surface, Unit> $onSurfaceDestroyed;
    public final /* synthetic */ boolean $retainOnSurfaceLoss;
    public final /* synthetic */ MutableState<Surface> $rtcSurface$delegate;
    public final /* synthetic */ MutableState<Boolean> $rtcSurfaceLost$delegate;
    public final /* synthetic */ MutableState<Boolean> $rtcSurfacePainted$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Surface surface) {
        C7384Etj.A0Y(surface, 0);
        if (this.$rtcSurface$delegate.getValue() == surface) {
            this.$rtcSurface$delegate.Af8(null);
            MutableState.A09(false, this.$rtcSurfacePainted$delegate);
            if (this.$retainOnSurfaceLoss) {
                MutableState.A09(true, this.$rtcSurfaceLost$delegate);
            }
        }
        this.$onSurfaceDestroyed.invoke(surface);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$39$10$1(boolean z, G0U<? super Surface, Unit> g0u, MutableState<Surface> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3) {
        super(1);
        this.$retainOnSurfaceLoss = z;
        this.$onSurfaceDestroyed = g0u;
        this.$rtcSurface$delegate = mutableState;
        this.$rtcSurfacePainted$delegate = mutableState2;
        this.$rtcSurfaceLost$delegate = mutableState3;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Surface surface) {
        invoke2(surface);
        return Unit.INSTANCE;
    }
}
