package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$GoalSectionHeader$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $addContentDescription;
    public final /* synthetic */ long $color;
    public final /* synthetic */ String $label;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onAdd;
    public final /* synthetic */ boolean $showPulse;
    public final /* synthetic */ String $subtitle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabScreenKt$GoalSectionHeader$2(String str, long j, Function0<Unit> function0, String str2, BRg bRg, String str3, boolean z, int i, int i2) {
        super(2);
        this.$label = str;
        this.$color = j;
        this.$onAdd = function0;
        this.$addContentDescription = str2;
        this.$modifier = bRg;
        this.$subtitle = str3;
        this.$showPulse = z;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchGoalsTabScreenKt.m1165GoalSectionHeaderoC9nPe0(this.$label, this.$color, this.$onAdd, this.$addContentDescription, this.$modifier, this.$subtitle, this.$showPulse, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
