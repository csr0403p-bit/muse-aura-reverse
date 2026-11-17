package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes4.dex */
public final class HatchMapHostKt$MapSelectionEffect$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $clearsOnNull;
    public final /* synthetic */ HatchMapAgenticSceneFlow $flow;
    public final /* synthetic */ String $selectedArtifactId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMapHostKt$MapSelectionEffect$1$1(String str, HatchMapAgenticSceneFlow hatchMapAgenticSceneFlow, boolean z) {
        super(1);
        this.$selectedArtifactId = str;
        this.$flow = hatchMapAgenticSceneFlow;
        this.$clearsOnNull = z;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        String str = this.$selectedArtifactId;
        if (str != null) {
            this.$flow.selectArtifact(str);
        } else if (this.$clearsOnNull) {
            this.$flow.clearSelection();
        }
        return new C78g() { // from class: com.facebook.aura.maps.HatchMapHostKt$MapSelectionEffect$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
