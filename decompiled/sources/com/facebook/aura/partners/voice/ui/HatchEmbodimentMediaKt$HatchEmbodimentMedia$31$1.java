package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$31$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ long $callGeneration;
    public final /* synthetic */ C1BO<G0W<Long, EmbodimentEdge, Integer, Unit>> $currentOnEdgeColorSampled$delegate;
    public final /* synthetic */ Object $edgeSampleOwner;
    public final /* synthetic */ boolean $edgeSamplingEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$31$1(boolean z, Object obj, long j, C1BO<? extends G0W<? super Long, ? super EmbodimentEdge, ? super Integer, Unit>> c1bo) {
        super(1);
        this.$edgeSamplingEnabled = z;
        this.$edgeSampleOwner = obj;
        this.$callGeneration = j;
        this.$currentOnEdgeColorSampled$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (!this.$edgeSamplingEnabled || this.$edgeSampleOwner != null) {
            HatchEmbodimentMediaKt.clearSampledEdges(this.$callGeneration, this.$currentOnEdgeColorSampled$delegate.getValue());
        }
        return new C78g() { // from class: com.facebook.aura.partners.voice.ui.HatchEmbodimentMediaKt$HatchEmbodimentMedia$31$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
