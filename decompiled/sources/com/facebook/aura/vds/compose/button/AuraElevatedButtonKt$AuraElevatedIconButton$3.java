package com.facebook.aura.vds.compose.button;

import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraElevatedButtonKt$AuraElevatedIconButton$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $buttonSize;
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ boolean $enableHaptic;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ BRg $iconModifier;
    public final /* synthetic */ AVy $iconPainter;
    public final /* synthetic */ AuraIconSize $iconSize;
    public final /* synthetic */ B6A $iconTint;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ boolean $showBadge;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraElevatedButtonKt$AuraElevatedIconButton$3(AVy aVy, String str, Function0<Unit> function0, BRg bRg, boolean z, float f, AuraIconSize auraIconSize, B6A b6a, BRg bRg2, boolean z2, boolean z3, int i, int i2, int i3) {
        super(2);
        this.$iconPainter = aVy;
        this.$contentDescription = str;
        this.$onClick = function0;
        this.$modifier = bRg;
        this.$enabled = z;
        this.$buttonSize = f;
        this.$iconSize = auraIconSize;
        this.$iconTint = b6a;
        this.$iconModifier = bRg2;
        this.$showBadge = z2;
        this.$enableHaptic = z3;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(this.$iconPainter, this.$contentDescription, this.$onClick, this.$modifier, this.$enabled, this.$buttonSize, this.$iconSize, this.$iconTint, this.$iconModifier, this.$showBadge, this.$enableHaptic, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
