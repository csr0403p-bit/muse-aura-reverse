package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes4.dex */
public final class HatchMapHostKt$MapThemeEffect$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchMapAgenticSceneFlow $flow;
    public final /* synthetic */ boolean $isDarkMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMapHostKt$MapThemeEffect$1$1(HatchMapAgenticSceneFlow hatchMapAgenticSceneFlow, boolean z) {
        super(1);
        this.$flow = hatchMapAgenticSceneFlow;
        this.$isDarkMode = z;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$flow.updateTheme(this.$isDarkMode);
        return new C78g() { // from class: com.facebook.aura.maps.HatchMapHostKt$MapThemeEffect$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
