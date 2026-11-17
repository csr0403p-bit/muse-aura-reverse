package com.facebook.aura.rentalcars;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1DM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class RentalCarResultsCardKt$RentalCarResultsCard$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ C1DM $containerShape;
    public final /* synthetic */ String $hostMessageId;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ RentalCarResults $results;
    public final /* synthetic */ String $sessionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RentalCarResultsCardKt$RentalCarResultsCard$2(RentalCarResults rentalCarResults, String str, String str2, String str3, long j, C1DM c1dm, BRg bRg, int i, int i2) {
        super(2);
        this.$results = rentalCarResults;
        this.$hostMessageId = str;
        this.$presentationId = str2;
        this.$sessionId = str3;
        this.$backgroundColor = j;
        this.$containerShape = c1dm;
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
        RentalCarResultsCardKt.m1883RentalCarResultsCard3f6hBDE(this.$results, this.$hostMessageId, this.$presentationId, this.$sessionId, this.$backgroundColor, this.$containerShape, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
