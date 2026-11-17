package com.facebook.aura.conversation.view;

import X.AOe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.model.InternalLinkActionCardPresentation;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConnectorLinkCardKt$ConnectorCardButton$connectUrl$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ InternalLinkActionCardPresentation $card;
    public final /* synthetic */ boolean $connected;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ AOe<Float> $settleSpec;
    public final /* synthetic */ String $sourceSessionId;
    public final /* synthetic */ HatchConnectorLinkCardViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorLinkCardKt$ConnectorCardButton$connectUrl$1(InternalLinkActionCardPresentation internalLinkActionCardPresentation, HatchConnectorLinkCardViewModel hatchConnectorLinkCardViewModel, boolean z, AOe<Float> aOe, String str, BRg bRg, int i, int i2) {
        super(2);
        this.$card = internalLinkActionCardPresentation;
        this.$viewModel = hatchConnectorLinkCardViewModel;
        this.$connected = z;
        this.$settleSpec = aOe;
        this.$sourceSessionId = str;
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
        HatchConnectorLinkCardKt.ConnectorCardButton(this.$card, this.$viewModel, this.$connected, this.$settleSpec, this.$sourceSessionId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
