package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsSheetScreenKt$ConnectionsRemoveMenu$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $iconColor;
    public final /* synthetic */ float $iconSize;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onOpen;
    public final /* synthetic */ Function0<Unit> $onRemove;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsSheetScreenKt$ConnectionsRemoveMenu$2(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, float f, long j, int i, int i2) {
        super(2);
        this.$onOpen = function0;
        this.$onRemove = function02;
        this.$modifier = bRg;
        this.$iconSize = f;
        this.$iconColor = j;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        ConnectionsSheetScreenKt.m1653ConnectionsRemoveMenuxfPyhaw(this.$onOpen, this.$onRemove, this.$modifier, this.$iconSize, this.$iconColor, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
