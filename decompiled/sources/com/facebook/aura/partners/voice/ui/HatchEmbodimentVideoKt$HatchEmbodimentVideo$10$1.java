package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.view.TextureView;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchEmbodimentVideoKt$HatchEmbodimentVideo$10$1 extends AbstractC7559F3s implements G0U<TextureView, Unit> {
    public final /* synthetic */ HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1 $listener;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TextureView textureView) {
        C7384Etj.A0Y(textureView, 0);
        textureView.setSurfaceTextureListener(null);
        this.$listener.release(textureView);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchEmbodimentVideoKt$HatchEmbodimentVideo$10$1(HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1 hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1) {
        super(1);
        this.$listener = hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
        invoke2(textureView);
        return Unit.INSTANCE;
    }
}
