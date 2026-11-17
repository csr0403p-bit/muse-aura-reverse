package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.C2LD;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchFloatingChromeGeometryKt$trackFloatingOccluder$3$1 extends AbstractC7559F3s implements G0U<C2LD, Unit> {
    public final /* synthetic */ HatchFloatingChromeGeometry $geometry;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2LD c2ld) {
        C7384Etj.A0Y(c2ld, 0);
        this.$geometry.setFloatingOccluder$fbandroid_express_aura_java_com_facebook_aura_ui_ui(HatchFloatingChromeGeometryKt.getWindowRect(c2ld));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFloatingChromeGeometryKt$trackFloatingOccluder$3$1(HatchFloatingChromeGeometry hatchFloatingChromeGeometry) {
        super(1);
        this.$geometry = hatchFloatingChromeGeometry;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2LD c2ld) {
        invoke2(c2ld);
        return Unit.INSTANCE;
    }
}
