package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import android.graphics.Bitmap;
import android.view.TextureView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1$hasFrameContent$sample$1 extends AbstractC7559F3s implements Function0<Bitmap> {
    public final /* synthetic */ HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1$hasFrameContent$sample$1(HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1 hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1) {
        super(0);
        this.this$0 = hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Bitmap invoke() {
        TextureView textureView = this.this$0.view;
        if (textureView != null) {
            return textureView.getBitmap(1, 1);
        }
        return null;
    }
}
