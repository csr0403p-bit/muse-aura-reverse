package com.facebook.aura.vds.compose.button;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraElevatedButtonKt$AuraMultiIconButtonPill$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $buttonSize;
    public final /* synthetic */ List<AuraMultiIconButtonPillEntry> $entries;
    public final /* synthetic */ AuraIconSize $iconSize;
    public final /* synthetic */ BRg $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraElevatedButtonKt$AuraMultiIconButtonPill$1(List<AuraMultiIconButtonPillEntry> list, BRg bRg, float f, AuraIconSize auraIconSize, int i, int i2) {
        super(2);
        this.$entries = list;
        this.$modifier = bRg;
        this.$buttonSize = f;
        this.$iconSize = auraIconSize;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraElevatedButtonKt.m2419AuraMultiIconButtonPill942rkJo(this.$entries, this.$modifier, this.$buttonSize, this.$iconSize, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
