package com.facebook.aura.vds.compose.button;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraElevatedButtonKt$AuraPillButton$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
    public final /* synthetic */ float $cornerRadius;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ float $paddingHorizontal;
    public final /* synthetic */ float $paddingVertical;
    public final /* synthetic */ boolean $setDefaultMinHeight;
    public final /* synthetic */ boolean $showBadge;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraElevatedButtonKt$AuraPillButton$3(Function0<Unit> function0, BRg bRg, boolean z, float f, float f2, float f3, boolean z2, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
        super(2);
        this.$onClick = function0;
        this.$modifier = bRg;
        this.$setDefaultMinHeight = z;
        this.$paddingVertical = f;
        this.$paddingHorizontal = f2;
        this.$cornerRadius = f3;
        this.$showBadge = z2;
        this.$content = g0v;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraElevatedButtonKt.m2420AuraPillButtonq88KkHs(this.$onClick, this.$modifier, this.$setDefaultMinHeight, this.$paddingVertical, this.$paddingHorizontal, this.$cornerRadius, this.$showBadge, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
