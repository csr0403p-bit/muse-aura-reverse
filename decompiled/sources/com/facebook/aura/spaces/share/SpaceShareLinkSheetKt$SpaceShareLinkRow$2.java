package com.facebook.aura.spaces.share;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class SpaceShareLinkSheetKt$SpaceShareLinkRow$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ int $iconRes;
    public final /* synthetic */ String $label;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $trailing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SpaceShareLinkSheetKt$SpaceShareLinkRow$2(int i, String str, long j, boolean z, Function0<Unit> function0, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i2, int i3) {
        super(2);
        this.$iconRes = i;
        this.$label = str;
        this.$color = j;
        this.$enabled = z;
        this.$onClick = function0;
        this.$modifier = bRg;
        this.$trailing = g0v;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public final void invoke(BFM bfm, int i) {
        SpaceShareLinkSheetKt.m2187SpaceShareLinkRowTgFrcIs(this.$iconRes, this.$label, this.$color, this.$enabled, this.$onClick, this.$modifier, this.$trailing, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
