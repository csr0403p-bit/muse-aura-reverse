package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes4.dex */
public final class HatchEmbodimentVideoKt$HatchEmbodimentVideo$6$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $backdropSamplingActive;
    public final /* synthetic */ boolean $edgeSamplingActive;
    public final /* synthetic */ HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1 $listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchEmbodimentVideoKt$HatchEmbodimentVideo$6$1(HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1 hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1, boolean z, boolean z2) {
        super(1);
        this.$listener = hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1;
        this.$backdropSamplingActive = z;
        this.$edgeSamplingActive = z2;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$listener.setSamplingEnabled(this.$backdropSamplingActive, this.$edgeSamplingActive);
        final HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1 hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1 = this.$listener;
        return new C78g() { // from class: com.facebook.aura.partners.voice.ui.HatchEmbodimentVideoKt$HatchEmbodimentVideo$6$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1.setSamplingEnabled(false, false);
            }
        };
    }
}
