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
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.model.InternalLinkActionCardPresentation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectorScopeLinkCardKt$HatchConnectorScopeLinkCard$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ InternalLinkActionCardPresentation $card;
    public final /* synthetic */ String $connectorId;
    public final /* synthetic */ G0U<String, Unit> $requestAdditionalAccess;
    public final /* synthetic */ String $scopeKey;

    /* renamed from: com.facebook.aura.conversation.view.HatchConnectorScopeLinkCardKt$HatchConnectorScopeLinkCard$1$1, reason: invalid class name */
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
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConnectorScopeLinkCardKt$HatchConnectorScopeLinkCard$1(InternalLinkActionCardPresentation internalLinkActionCardPresentation, String str, String str2, G0U<? super String, Unit> g0u) {
        super(3);
        this.$card = internalLinkActionCardPresentation;
        this.$connectorId = str;
        this.$scopeKey = str2;
        this.$requestAdditionalAccess = g0u;
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
            B1U b1uA002 = B1V.A00(bfm, new AnonymousClass1(internalLinkActionCardPresentation), 28962676);
            String str2 = this.$card.subtitle;
            if (str2 == null) {
                bbiA0M = AnonymousClass002.A0M(bfm, 1000218350);
                b1uA00 = null;
            } else {
                bfm.AgE(1000218351);
                b1uA00 = B1V.A00(bfm, new HatchConnectorScopeLinkCardKt$HatchConnectorScopeLinkCard$1$2$1(str2), -1653729410);
                bbiA0M = (BBI) bfm;
                BBI.A0R(bbiA0M, false);
            }
            HatchInternalLinkActionCardKt.InternalLinkCardHeader(str, b1uA002, b1uA00, null, bfm, 48, 8);
            if (this.$connectorId != null && this.$scopeKey != null) {
                bfm.AgE(1000340119);
                String str3 = this.$card.type;
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c38);
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$scopeKey, bfm.A65(this.$requestAdditionalAccess));
                G0U<String, Unit> g0u = this.$requestAdditionalAccess;
                String str4 = this.$scopeKey;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchConnectorScopeLinkCardKt$HatchConnectorScopeLinkCard$1$3$1(g0u, str4);
                    bfm.Ai0(objAaT);
                }
                HatchInternalLinkActionCardKt.m628InternalLinkCardButtonPIknLig(str3, strA01, (Function0) objAaT, null, false, null, null, bfm, 0, 120);
            } else {
                bfm.AgE(1000544812);
            }
            BBI.A0R(bbiA0M, false);
            return;
        }
        bfm.Afo();
    }
}
