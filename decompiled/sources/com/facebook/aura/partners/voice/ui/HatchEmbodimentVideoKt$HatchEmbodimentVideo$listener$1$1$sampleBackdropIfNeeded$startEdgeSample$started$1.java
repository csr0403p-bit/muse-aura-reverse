package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.partners.voice.ui.BackdropFrameReader;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1$sampleBackdropIfNeeded$startEdgeSample$started$1 extends AbstractC7559F3s implements G0U<BackdropFrameReader.PixelCopyColorResult, Unit> {
    public final /* synthetic */ EmbodimentEdge $edge;
    public final /* synthetic */ long $sampleGeneration;
    public final /* synthetic */ HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1 this$0;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BackdropFrameReader.PixelCopyColorResult pixelCopyColorResult) {
        C7384Etj.A0Y(pixelCopyColorResult, 0);
        this.this$0.completeEdgeSample(this.$edge, this.$sampleGeneration, pixelCopyColorResult);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1$sampleBackdropIfNeeded$startEdgeSample$started$1(HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1 hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1, EmbodimentEdge embodimentEdge, long j) {
        super(1);
        this.this$0 = hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1;
        this.$edge = embodimentEdge;
        this.$sampleGeneration = j;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(BackdropFrameReader.PixelCopyColorResult pixelCopyColorResult) {
        invoke2(pixelCopyColorResult);
        return Unit.INSTANCE;
    }
}
