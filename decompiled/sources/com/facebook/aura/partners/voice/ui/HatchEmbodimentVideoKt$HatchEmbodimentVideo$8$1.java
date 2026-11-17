package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import android.view.TextureView;

/* loaded from: classes4.dex */
public final class HatchEmbodimentVideoKt$HatchEmbodimentVideo$8$1 extends AbstractC7559F3s implements G0U<Context, TextureView> {
    public final /* synthetic */ HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1 $listener;

    @Override // X.G0U
    public final TextureView invoke(Context context) {
        C7384Etj.A0Y(context, 0);
        TextureView textureView = new TextureView(context);
        HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1 hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1 = this.$listener;
        hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1.attachView(textureView);
        textureView.setSurfaceTextureListener(hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1);
        return textureView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchEmbodimentVideoKt$HatchEmbodimentVideo$8$1(HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1 hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1) {
        super(1);
        this.$listener = hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1;
    }
}
