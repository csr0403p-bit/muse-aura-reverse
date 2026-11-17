package com.facebook.aura.devices.link.ordering;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BBI;
import X.BFM;
import X.C07C;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.subscription.view.HomeLinkClaimCardKt;
import com.facebook.aura.ui.HatchSectionScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchLinkSubscriptionAddOnUi$Offer$1$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ boolean $isSelected;
    public final /* synthetic */ String $label;
    public final /* synthetic */ G0U<Boolean, Unit> $onSelectedChange;
    public final /* synthetic */ String $subtitle;

    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkSubscriptionAddOnUi$Offer$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isSelected;
        public final /* synthetic */ String $label;
        public final /* synthetic */ G0U<Boolean, Unit> $onSelectedChange;
        public final /* synthetic */ String $subtitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, String str2, G0U<? super Boolean, Unit> g0u, boolean z) {
            super(3);
            this.$label = str;
            this.$subtitle = str2;
            this.$onSelectedChange = g0u;
            this.$isSelected = z;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                String strA0v = this.$label;
                if (strA0v == null) {
                    bfm.AgE(-1936372343);
                    strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120b36);
                } else {
                    bfm.AgE(-1936372622);
                }
                BBI bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
                String strA01 = this.$subtitle;
                if (strA01 == null) {
                    bfm.AgE(-1936368802);
                    strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b2f);
                } else {
                    bfm.AgE(-1936369174);
                }
                BBI.A0R(bbi, false);
                boolean zA1U = AnonymousClass001.A1U(bfm, this.$isSelected, bfm.A65(this.$onSelectedChange));
                G0U<Boolean, Unit> g0u = this.$onSelectedChange;
                boolean z = this.$isSelected;
                Object objAaT = bfm.AaT();
                if (zA1U || objAaT == C78N.A00) {
                    objAaT = new HatchLinkSubscriptionAddOnUi$Offer$1$1$1$1$1$1(g0u, z);
                    bfm.Ai0(objAaT);
                }
                HomeLinkClaimCardKt.HomeLinkClaimCard(strA0v, strA01, (Function0) objAaT, null, Boolean.valueOf(this.$isSelected), bfm, 0, 8);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$label, this.$subtitle, this.$onSelectedChange, this.$isSelected), 132063105);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchLinkSubscriptionAddOnUi$Offer$1$1$1(String str, String str2, G0U<? super Boolean, Unit> g0u, boolean z) {
        super(1);
        this.$label = str;
        this.$subtitle = str2;
        this.$onSelectedChange = g0u;
        this.$isSelected = z;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
