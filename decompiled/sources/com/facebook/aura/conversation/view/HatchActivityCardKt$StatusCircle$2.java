package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchActivityCardKt$StatusCircle$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ long $color;
    public final /* synthetic */ boolean $isDone;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchActivityCardKt$StatusCircle$2(boolean z, long j, int i) {
        super(2);
        this.$isDone = z;
        this.$color = j;
        this.$$changed = i;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchActivityCardKt.m523StatusCircleRPmYEkk(this.$isDone, this.$color, bfm, AnonymousClass011.A00(this.$$changed));
    }
}
