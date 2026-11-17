package com.facebook.aura.partners.voice.ui;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.partners.voice.ui.BackdropFrameReader;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final /* synthetic */ class HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1$sampleBackdropIfNeeded$startBackdropSample$started$1 extends C7438Evz implements G0U<BackdropFrameReader.PixelCopyColorResult, Unit> {
    public HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1$sampleBackdropIfNeeded$startBackdropSample$started$1(Object obj) {
        super(1, obj, HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1.class, "completeBackdropSample", "completeBackdropSample(Lcom/facebook/aura/partners/voice/ui/BackdropFrameReader$PixelCopyColorResult;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BackdropFrameReader.PixelCopyColorResult pixelCopyColorResult) {
        ((HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1) AnonymousClass006.A0o(pixelCopyColorResult, this)).completeBackdropSample(pixelCopyColorResult);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(BackdropFrameReader.PixelCopyColorResult pixelCopyColorResult) {
        invoke2(pixelCopyColorResult);
        return Unit.INSTANCE;
    }
}
