package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1DM;
import X.G0V;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchFlightListRowKt$HatchFlightCarrierIcons$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $airline;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ List<String> $carriers;
    public final /* synthetic */ List<String> $icons;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $singleIconSize;
    public final /* synthetic */ C1DM $singleShape;
    public final /* synthetic */ float $size;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFlightListRowKt$HatchFlightCarrierIcons$2(List<String> list, String str, long j, List<String> list2, BRg bRg, float f, C1DM c1dm, float f2, int i, int i2) {
        super(2);
        this.$icons = list;
        this.$airline = str;
        this.$backgroundColor = j;
        this.$carriers = list2;
        this.$modifier = bRg;
        this.$size = f;
        this.$singleShape = c1dm;
        this.$singleIconSize = f2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchFlightListRowKt.m599HatchFlightCarrierIconsRZJR0o8(this.$icons, this.$airline, this.$backgroundColor, this.$carriers, this.$modifier, this.$size, this.$singleShape, this.$singleIconSize, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
