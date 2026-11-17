package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BO;
import X.C7384Etj;
import X.G0W;
import android.view.Surface;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class EmbodimentSurfaceBindingKt$rememberEmbodimentSurfaceBinding$onSurfaceResized$1$1 extends AbstractC7559F3s implements G0W<Surface, Integer, Integer, Unit> {
    public final /* synthetic */ C1BO<G0W<Surface, Integer, Integer, Unit>> $currentOnSurfaceResized$delegate;

    public final void invoke(Surface surface, int i, int i2) {
        C7384Etj.A0Y(surface, 0);
        AnonymousClass001.A1G(surface, Integer.valueOf(i), this.$currentOnSurfaceResized$delegate.getValue(), i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EmbodimentSurfaceBindingKt$rememberEmbodimentSurfaceBinding$onSurfaceResized$1$1(C1BO<? extends G0W<? super Surface, ? super Integer, ? super Integer, Unit>> c1bo) {
        super(3);
        this.$currentOnSurfaceResized$delegate = c1bo;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(Surface surface, Integer num, Integer num2) {
        invoke(surface, AnonymousClass001.A0F(num), AnonymousClass001.A0F(num2));
        return Unit.INSTANCE;
    }
}
