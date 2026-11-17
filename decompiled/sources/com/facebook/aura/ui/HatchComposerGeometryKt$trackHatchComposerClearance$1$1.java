package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes2.dex */
public final class HatchComposerGeometryKt$trackHatchComposerClearance$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchComposerGeometry $geometry;
    public final /* synthetic */ Object $owner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerGeometryKt$trackHatchComposerClearance$1$1(HatchComposerGeometry hatchComposerGeometry, Object obj) {
        super(1);
        this.$geometry = hatchComposerGeometry;
        this.$owner = obj;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final HatchComposerGeometry hatchComposerGeometry = this.$geometry;
        final Object obj = this.$owner;
        return new C78g() { // from class: com.facebook.aura.ui.HatchComposerGeometryKt$trackHatchComposerClearance$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                hatchComposerGeometry.clearBottomClearance$fbandroid_express_aura_java_com_facebook_aura_ui_ui(obj);
            }
        };
    }
}
