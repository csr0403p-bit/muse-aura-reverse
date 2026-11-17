package com.facebook.aura.vds.compose.contextmenu;

import X.AVy;
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
public final class AuraContextMenuItemContentKt$AuraContextMenuItemContent$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $description;
    public final /* synthetic */ int $descriptionMaxLines;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ boolean $isDestructive;
    public final /* synthetic */ String $label;
    public final /* synthetic */ int $labelMaxLines;
    public final /* synthetic */ AuraContextMenuStyle $menuStyle;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ boolean $selected;
    public final /* synthetic */ AVy $startIconPainter;
    public final /* synthetic */ B6A $startIconTint;
    public final /* synthetic */ AVy $trailingIconPainter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraContextMenuItemContentKt$AuraContextMenuItemContent$2(String str, AuraContextMenuStyle auraContextMenuStyle, BRg bRg, String str2, int i, int i2, AVy aVy, B6A b6a, AVy aVy2, Function0<Unit> function0, boolean z, boolean z2, boolean z3, int i3, int i4, int i5) {
        super(2);
        this.$label = str;
        this.$menuStyle = auraContextMenuStyle;
        this.$modifier = bRg;
        this.$description = str2;
        this.$descriptionMaxLines = i;
        this.$labelMaxLines = i2;
        this.$startIconPainter = aVy;
        this.$startIconTint = b6a;
        this.$trailingIconPainter = aVy2;
        this.$onClick = function0;
        this.$selected = z;
        this.$enabled = z2;
        this.$isDestructive = z3;
        this.$$changed = i3;
        this.$$changed1 = i4;
        this.$$default = i5;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraContextMenuItemContentKt.m2516AuraContextMenuItemContentyQUhCh4(this.$label, this.$menuStyle, this.$modifier, this.$description, this.$descriptionMaxLines, this.$labelMaxLines, this.$startIconPainter, this.$startIconTint, this.$trailingIconPainter, this.$onClick, this.$selected, this.$enabled, this.$isDestructive, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
