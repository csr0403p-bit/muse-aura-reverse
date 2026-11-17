package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes.dex */
public final class HatchFloatingChromeGeometryKt$trackFloatingOccluder$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $docked;
    public final /* synthetic */ HatchFloatingChromeGeometry $geometry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFloatingChromeGeometryKt$trackFloatingOccluder$2$1(HatchFloatingChromeGeometry hatchFloatingChromeGeometry, boolean z) {
        super(1);
        this.$geometry = hatchFloatingChromeGeometry;
        this.$docked = z;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$geometry.setFloatingOccluderDocked$fbandroid_express_aura_java_com_facebook_aura_ui_ui(this.$docked);
        return new C78g() { // from class: com.facebook.aura.ui.HatchFloatingChromeGeometryKt$trackFloatingOccluder$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
