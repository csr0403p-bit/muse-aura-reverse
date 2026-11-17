package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ConnectionsComponentsKt$ConnectionsSuggestionSubtitle$text$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $isSent;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ PairsSuggestion $person;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsComponentsKt$ConnectionsSuggestionSubtitle$text$1(PairsSuggestion pairsSuggestion, boolean z, BRg bRg, int i, int i2) {
        super(2);
        this.$person = pairsSuggestion;
        this.$isSent = z;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        ConnectionsComponentsKt.ConnectionsSuggestionSubtitle(this.$person, this.$isSent, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
