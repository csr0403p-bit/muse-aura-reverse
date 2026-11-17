package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HeaderButtonKt$HeaderTextButton$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ int $labelRes;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ boolean $showBadge;
    public final /* synthetic */ String $testTag;
    public final /* synthetic */ B6A $tint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderButtonKt$HeaderTextButton$3(int i, Function0<Unit> function0, String str, BRg bRg, B6A b6a, boolean z, int i2, int i3) {
        super(2);
        this.$labelRes = i;
        this.$onClick = function0;
        this.$testTag = str;
        this.$modifier = bRg;
        this.$tint = b6a;
        this.$showBadge = z;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HeaderButtonKt.m1029HeaderTextButtonjM_yU8I(this.$labelRes, this.$onClick, this.$testTag, this.$modifier, this.$tint, this.$showBadge, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
