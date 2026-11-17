package com.facebook.aura.conversation.view;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.B1U;
import X.B1V;
import X.BBI;
import X.BFM;
import X.C07C;
import X.G0V;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.model.InternalLinkActionCardPresentation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectorAddAccountCardKt$HatchConnectorAddAccountCard$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ InternalLinkActionCardPresentation $card;
    public final /* synthetic */ String $connectorId;
    public final /* synthetic */ Function0<Unit> $requestAccountLink;

    /* renamed from: com.facebook.aura.conversation.view.HatchConnectorAddAccountCardKt$HatchConnectorAddAccountCard$1$1, reason: invalid class name */
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
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                HatchInternalLinkActionCardKt.m630InternalLinkCardIconxqIIw2o(this.$card.imageUrl, HatchInternalLinkActionCardKt.GenericIconRes, null, null, bfm, 0, 12);
            } else {
                bfm.Afo();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorAddAccountCardKt$HatchConnectorAddAccountCard$1(InternalLinkActionCardPresentation internalLinkActionCardPresentation, String str, Function0<Unit> function0) {
        super(3);
        this.$card = internalLinkActionCardPresentation;
        this.$connectorId = str;
        this.$requestAccountLink = function0;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        B1U b1uA00;
        BBI bbiA0M;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            InternalLinkActionCardPresentation internalLinkActionCardPresentation = this.$card;
            String str = internalLinkActionCardPresentation.title;
            B1U b1uA002 = B1V.A00(bfm, new AnonymousClass1(internalLinkActionCardPresentation), 1161208064);
            String str2 = this.$card.subtitle;
            if (str2 == null) {
                bbiA0M = AnonymousClass002.A0M(bfm, 1806994018);
                b1uA00 = null;
            } else {
                bfm.AgE(1806994019);
                b1uA00 = B1V.A00(bfm, new HatchConnectorAddAccountCardKt$HatchConnectorAddAccountCard$1$2$1(str2), -998183286);
                bbiA0M = (BBI) bfm;
                BBI.A0R(bbiA0M, false);
            }
            HatchInternalLinkActionCardKt.InternalLinkCardHeader(str, b1uA002, b1uA00, null, bfm, 48, 8);
            if (this.$connectorId != null) {
                bfm.AgE(1807095606);
                HatchInternalLinkActionCardKt.m628InternalLinkCardButtonPIknLig(this.$card.type, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c37), this.$requestAccountLink, null, false, null, null, bfm, 0, 120);
            } else {
                bfm.AgE(1807289728);
            }
            BBI.A0R(bbiA0M, false);
            return;
        }
        bfm.Afo();
    }
}
