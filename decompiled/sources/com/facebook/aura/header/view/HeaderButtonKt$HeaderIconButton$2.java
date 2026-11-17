package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.G0V;
import X.G2j;
import com.facebook.aura.header.api.HeaderActionIcon;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HeaderButtonKt$HeaderIconButton$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ HeaderActionIcon $icon;
    public final /* synthetic */ G2j<B6A, BRg, BFM, Integer, Unit> $iconContent;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ boolean $showBadge;
    public final /* synthetic */ boolean $suppressPressHaptic;
    public final /* synthetic */ String $testTag;
    public final /* synthetic */ B6A $tint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HeaderButtonKt$HeaderIconButton$2(HeaderActionIcon headerActionIcon, Function0<Unit> function0, String str, BRg bRg, B6A b6a, boolean z, boolean z2, G2j<? super B6A, ? super BRg, ? super BFM, ? super Integer, Unit> g2j, int i, int i2) {
        super(2);
        this.$icon = headerActionIcon;
        this.$onClick = function0;
        this.$testTag = str;
        this.$modifier = bRg;
        this.$tint = b6a;
        this.$suppressPressHaptic = z;
        this.$showBadge = z2;
        this.$iconContent = g2j;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HeaderButtonKt.m1027HeaderIconButtonrglY58k(this.$icon, this.$onClick, this.$testTag, this.$modifier, this.$tint, this.$suppressPressHaptic, this.$showBadge, this.$iconContent, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
