package com.facebook.aura.composer.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchComposerKt$ActionButton$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $background;
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ float $iconPadding;
    public final /* synthetic */ int $iconRes;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ float $size;
    public final /* synthetic */ long $tint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$ActionButton$2(int i, Function0<Unit> function0, long j, long j2, BRg bRg, String str, float f, float f2, boolean z, int i2, int i3) {
        super(2);
        this.$iconRes = i;
        this.$onClick = function0;
        this.$tint = j;
        this.$background = j2;
        this.$modifier = bRg;
        this.$contentDescription = str;
        this.$iconPadding = f;
        this.$size = f2;
        this.$enabled = z;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchComposerKt.m430ActionButtongI4cVvE(this.$iconRes, this.$onClick, this.$tint, this.$background, this.$modifier, this.$contentDescription, this.$iconPadding, this.$size, this.$enabled, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
