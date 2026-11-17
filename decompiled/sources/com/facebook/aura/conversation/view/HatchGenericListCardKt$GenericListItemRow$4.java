package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.model.GenericListRow;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchGenericListCardKt$GenericListItemRow$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ InlineContentCallbacks $callbacks;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ GenericListRow $row;
    public final /* synthetic */ boolean $showIcon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGenericListCardKt$GenericListItemRow$4(GenericListRow genericListRow, boolean z, InlineContentCallbacks inlineContentCallbacks, long j, BRg bRg, int i, int i2) {
        super(2);
        this.$row = genericListRow;
        this.$showIcon = z;
        this.$callbacks = inlineContentCallbacks;
        this.$backgroundColor = j;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchGenericListCardKt.m603GenericListItemRowuDo3WH8(this.$row, this.$showIcon, this.$callbacks, this.$backgroundColor, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
