package com.facebook.aura.conversation.view;

import X.AOe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.B1U;
import X.B1V;
import X.BFM;
import X.C07C;
import X.G0V;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.model.InternalLinkActionCardPresentation;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConnectorLinkCardKt$HatchConnectorLinkCard$2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ InternalLinkActionCardPresentation $card;
    public final /* synthetic */ boolean $connected;
    public final /* synthetic */ AOe<Float> $settleSpec;
    public final /* synthetic */ String $sourceSessionId;
    public final /* synthetic */ HatchConnectorLinkCardViewModel $viewModel;

    /* renamed from: com.facebook.aura.conversation.view.HatchConnectorLinkCardKt$HatchConnectorLinkCard$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ InternalLinkActionCardPresentation $card;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InternalLinkActionCardPresentation internalLinkActionCardPresentation) {
            super(2);
            this.$card = internalLinkActionCardPresentation;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            int i2;
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                InternalLinkActionCardPresentation internalLinkActionCardPresentation = this.$card;
                String str = internalLinkActionCardPresentation.imageUrl;
                if (internalLinkActionCardPresentation.walletSetup) {
                    i2 = R.drawable.wallet_outline_24_wght400;
                } else {
                    i2 = HatchInternalLinkActionCardKt.GenericIconRes;
                }
                HatchInternalLinkActionCardKt.m630InternalLinkCardIconxqIIw2o(str, i2, null, null, bfm, 0, 12);
                return;
            }
            bfm.Afo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorLinkCardKt$HatchConnectorLinkCard$2(InternalLinkActionCardPresentation internalLinkActionCardPresentation, HatchConnectorLinkCardViewModel hatchConnectorLinkCardViewModel, boolean z, AOe<Float> aOe, String str) {
        super(3);
        this.$card = internalLinkActionCardPresentation;
        this.$viewModel = hatchConnectorLinkCardViewModel;
        this.$connected = z;
        this.$settleSpec = aOe;
        this.$sourceSessionId = str;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        B1U b1uA00;
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            InternalLinkActionCardPresentation internalLinkActionCardPresentation = this.$card;
            String str = internalLinkActionCardPresentation.title;
            B1U b1uA002 = B1V.A00(bfm, new AnonymousClass1(internalLinkActionCardPresentation), 276631527);
            String str2 = this.$card.subtitle;
            if (str2 == null) {
                AnonymousClass004.A1A(bfm, -2104180289);
                b1uA00 = null;
            } else {
                bfm.AgE(-2104180288);
                b1uA00 = B1V.A00(bfm, new HatchConnectorLinkCardKt$HatchConnectorLinkCard$2$2$1(str2), 937882653);
                AnonymousClass002.A19(bfm);
            }
            HatchInternalLinkActionCardKt.InternalLinkCardHeader(str, b1uA002, b1uA00, null, bfm, 48, 8);
            HatchConnectorLinkCardKt.ConnectorCardButton(this.$card, this.$viewModel, this.$connected, this.$settleSpec, this.$sourceSessionId, null, bfm, InternalLinkActionCardPresentation.$stable | (HatchConnectorLinkCardViewModel.$stable << 3), 32);
            return;
        }
        bfm.Afo();
    }
}
