package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import android.view.Surface;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class EmbodimentSurfaceBindingKt$rememberEmbodimentSurfaceBinding$onSurfaceDestroyed$1$1 extends AbstractC7559F3s implements G0U<Surface, Unit> {
    public final /* synthetic */ C1BO<G0U<Surface, Unit>> $currentOnSurfaceDestroyed$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Surface surface) {
        C7384Etj.A0Y(surface, 0);
        C1BO.A0B(this.$currentOnSurfaceDestroyed$delegate).invoke(surface);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EmbodimentSurfaceBindingKt$rememberEmbodimentSurfaceBinding$onSurfaceDestroyed$1$1(C1BO<? extends G0U<? super Surface, Unit>> c1bo) {
        super(1);
        this.$currentOnSurfaceDestroyed$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Surface surface) {
        invoke2(surface);
        return Unit.INSTANCE;
    }
}
