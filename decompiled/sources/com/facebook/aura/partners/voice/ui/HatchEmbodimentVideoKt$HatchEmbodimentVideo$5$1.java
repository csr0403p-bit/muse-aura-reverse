package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import android.view.View;

/* loaded from: classes4.dex */
public final class HatchEmbodimentVideoKt$HatchEmbodimentVideo$5$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Object $edgeSamplingOwner;
    public final /* synthetic */ View $edgeSamplingView;
    public final /* synthetic */ HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1 $listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchEmbodimentVideoKt$HatchEmbodimentVideo$5$1(HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1 hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1, View view, Object obj) {
        super(1);
        this.$listener = hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1;
        this.$edgeSamplingView = view;
        this.$edgeSamplingOwner = obj;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$listener.setEdgeSamplingSource(this.$edgeSamplingView, this.$edgeSamplingOwner);
        final HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1 hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1 = this.$listener;
        return new C78g() { // from class: com.facebook.aura.partners.voice.ui.HatchEmbodimentVideoKt$HatchEmbodimentVideo$5$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1.setEdgeSamplingSource(null, null);
            }
        };
    }
}
