package com.facebook.aura.appappearance;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAppAppearanceSettingsScreenKt$ColorSwatch$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ long $color;
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ boolean $isSelected;
    public final /* synthetic */ Function0<Unit> $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAppAppearanceSettingsScreenKt$ColorSwatch$4(long j, boolean z, String str, Function0<Unit> function0, int i) {
        super(2);
        this.$color = j;
        this.$isSelected = z;
        this.$contentDescription = str;
        this.$onClick = function0;
        this.$$changed = i;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchAppAppearanceSettingsScreenKt.m237ColorSwatchKTwxG1Y(this.$color, this.$isSelected, this.$contentDescription, this.$onClick, bfm, AnonymousClass011.A00(this.$$changed));
    }
}
