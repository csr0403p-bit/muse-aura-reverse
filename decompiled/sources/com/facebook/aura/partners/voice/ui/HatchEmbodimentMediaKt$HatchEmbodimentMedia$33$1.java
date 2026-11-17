package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$33$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ long $callGeneration;
    public final /* synthetic */ C1BO<G0W<Long, EmbodimentEdge, Integer, Unit>> $currentOnEdgeColorSampled$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$33$1(long j, C1BO<? extends G0W<? super Long, ? super EmbodimentEdge, ? super Integer, Unit>> c1bo) {
        super(1);
        this.$callGeneration = j;
        this.$currentOnEdgeColorSampled$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final long j = this.$callGeneration;
        final C1BO<G0W<Long, EmbodimentEdge, Integer, Unit>> c1bo = this.$currentOnEdgeColorSampled$delegate;
        return new C78g() { // from class: com.facebook.aura.partners.voice.ui.HatchEmbodimentMediaKt$HatchEmbodimentMedia$33$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                HatchEmbodimentMediaKt.clearSampledEdges(j, (G0W) c1bo.getValue());
            }
        };
    }
}
