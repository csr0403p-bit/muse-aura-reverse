package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0W;
import android.view.Surface;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$39$9$1 extends AbstractC7559F3s implements G0W<Surface, Integer, Integer, Unit> {
    public final /* synthetic */ G0W<Surface, Integer, Integer, Unit> $onSurfaceAvailable;
    public final /* synthetic */ MutableState<Surface> $rtcSurface$delegate;
    public final /* synthetic */ MutableState<Boolean> $rtcSurfacePainted$delegate;

    public final void invoke(Surface surface, int i, int i2) {
        C7384Etj.A0Y(surface, 0);
        this.$rtcSurface$delegate.Af8(surface);
        MutableState.A09(false, this.$rtcSurfacePainted$delegate);
        AnonymousClass001.A1G(surface, Integer.valueOf(i), this.$onSurfaceAvailable, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$39$9$1(G0W<? super Surface, ? super Integer, ? super Integer, Unit> g0w, MutableState<Surface> mutableState, MutableState<Boolean> mutableState2) {
        super(3);
        this.$onSurfaceAvailable = g0w;
        this.$rtcSurface$delegate = mutableState;
        this.$rtcSurfacePainted$delegate = mutableState2;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(Surface surface, Integer num, Integer num2) {
        invoke(surface, AnonymousClass001.A0F(num), AnonymousClass001.A0F(num2));
        return Unit.INSTANCE;
    }
}
