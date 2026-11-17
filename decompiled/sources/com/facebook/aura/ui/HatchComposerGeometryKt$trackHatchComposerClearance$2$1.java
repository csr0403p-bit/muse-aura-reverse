package com.facebook.aura.ui;

import X.AXN;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C2LD;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchComposerGeometryKt$trackHatchComposerClearance$2$1 extends AbstractC7559F3s implements G0U<C2LD, Unit> {
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ HatchComposerGeometry $geometry;
    public final /* synthetic */ Object $owner;
    public final /* synthetic */ float $windowHeightDp;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2LD c2ld) {
        C7384Etj.A0Y(c2ld, 0);
        this.$geometry.m2314x8c755d2d(this.$windowHeightDp - this.$density.Agy(AnonymousClass002.A09(c2ld.A01())), this.$owner);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerGeometryKt$trackHatchComposerClearance$2$1(HatchComposerGeometry hatchComposerGeometry, float f, AXN axn, Object obj) {
        super(1);
        this.$geometry = hatchComposerGeometry;
        this.$windowHeightDp = f;
        this.$density = axn;
        this.$owner = obj;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2LD c2ld) {
        invoke2(c2ld);
        return Unit.INSTANCE;
    }
}
