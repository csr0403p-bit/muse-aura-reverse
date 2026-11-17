package com.facebook.aura.vds.compose.surface;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraElevatedSurfaceKt$AuraElevatedPillSurface$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ G0W<InterfaceC05151eP, BFM, Integer, Unit> $content;
    public final /* synthetic */ float $cornerRadius;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraElevatedSurfaceKt$AuraElevatedPillSurface$2(BRg bRg, float f, Function0<Unit> function0, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
        super(2);
        this.$modifier = bRg;
        this.$cornerRadius = f;
        this.$onClick = function0;
        this.$content = g0w;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraElevatedSurfaceKt.m2622AuraElevatedPillSurfaceDzVHIIc(this.$modifier, this.$cornerRadius, this.$onClick, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
