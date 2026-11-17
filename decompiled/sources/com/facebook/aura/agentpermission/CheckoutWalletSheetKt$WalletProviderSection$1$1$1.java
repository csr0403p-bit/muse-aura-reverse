package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BBI;
import X.BFM;
import X.C07C;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.gateway.WalletPaymentOption;
import com.facebook.aura.ui.HatchSectionScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class CheckoutWalletSheetKt$WalletProviderSection$1$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ WalletOptionKey $currentSelectionKey;
    public final /* synthetic */ WalletPaymentMethodGroup $group;
    public final /* synthetic */ String $label;
    public final /* synthetic */ Function0<Unit> $onChooseDifferentCard;
    public final /* synthetic */ G0U<WalletOptionKey, Unit> $onSelectCard;
    public final /* synthetic */ WalletPaymentOption $option;
    public final /* synthetic */ WalletOptionKey $requestedKey;

    /* renamed from: com.facebook.aura.agentpermission.CheckoutWalletSheetKt$WalletProviderSection$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ WalletOptionKey $currentSelectionKey;
        public final /* synthetic */ WalletPaymentMethodGroup $group;
        public final /* synthetic */ String $label;
        public final /* synthetic */ G0U<WalletOptionKey, Unit> $onSelectCard;
        public final /* synthetic */ WalletPaymentOption $option;
        public final /* synthetic */ WalletOptionKey $requestedKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, WalletPaymentOption walletPaymentOption, WalletOptionKey walletOptionKey, WalletPaymentMethodGroup walletPaymentMethodGroup, WalletOptionKey walletOptionKey2, G0U<? super WalletOptionKey, Unit> g0u) {
            super(3);
            this.$label = str;
            this.$option = walletPaymentOption;
            this.$currentSelectionKey = walletOptionKey;
            this.$group = walletPaymentMethodGroup;
            this.$requestedKey = walletOptionKey2;
            this.$onSelectCard = g0u;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            int i2;
            String strWalletFundingLabel;
            boolean z = false;
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
                return;
            }
            String str = this.$label;
            WalletPaymentOption walletPaymentOption = this.$option;
            if (walletPaymentOption == null || !this.$group.isEligible()) {
                bfm.AgE(-1358617937);
                BBI bbi = (BBI) bfm;
                i2 = 0;
                BBI.A0R(bbi, false);
                strWalletFundingLabel = null;
            } else {
                bfm.AgE(-1358617936);
                strWalletFundingLabel = WalletFundingPresentationKt.walletFundingLabel(walletPaymentOption, bfm, WalletPaymentOption.$stable);
                BBI bbi2 = (BBI) bfm;
                i2 = 0;
                BBI.A0R(bbi2, false);
            }
            WalletOptionKey walletOptionKey = this.$currentSelectionKey;
            boolean zAreEqual = C7384Etj.areEqual(walletOptionKey != null ? walletOptionKey.paymentMethod : null, this.$group.paymentMethod);
            WalletPaymentOption walletPaymentOption2 = this.$option;
            if (walletPaymentOption2 != null && CheckoutWalletSheetViewModelKt.getKey(walletPaymentOption2).equals(this.$requestedKey)) {
                z = true;
            }
            boolean zIsEligible = this.$group.isEligible();
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$onSelectCard, bfm.A67(this.$option));
            WalletPaymentOption walletPaymentOption3 = this.$option;
            G0U<WalletOptionKey, Unit> g0u = this.$onSelectCard;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new CheckoutWalletSheetKt$WalletProviderSection$1$1$1$1$3$1(walletPaymentOption3, g0u);
                bfm.Ai0(objAaT);
            }
            CheckoutWalletSheetKt.WalletProviderRow(str, strWalletFundingLabel, zAreEqual, z, zIsEligible, (Function0) objAaT, CheckoutWalletSheetKt.getBrandMarkRes(this.$group), null, bfm, i2, 128);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutWalletSheetKt$WalletProviderSection$1$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onChooseDifferentCard;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0) {
            super(3);
            this.$onChooseDifferentCard = function0;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                CheckoutWalletSheetKt.WalletChooseDifferentCardRow(this.$onChooseDifferentCard, null, bfm, 0, 2);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass1(this.$label, this.$option, this.$currentSelectionKey, this.$group, this.$requestedKey, this.$onSelectCard), 128553994);
        if (this.$group.getEligibleOptionCount() > 1) {
            AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass2(this.$onChooseDifferentCard), 805173903);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckoutWalletSheetKt$WalletProviderSection$1$1$1(WalletPaymentMethodGroup walletPaymentMethodGroup, String str, WalletPaymentOption walletPaymentOption, WalletOptionKey walletOptionKey, WalletOptionKey walletOptionKey2, G0U<? super WalletOptionKey, Unit> g0u, Function0<Unit> function0) {
        super(1);
        this.$group = walletPaymentMethodGroup;
        this.$label = str;
        this.$option = walletPaymentOption;
        this.$currentSelectionKey = walletOptionKey;
        this.$requestedKey = walletOptionKey2;
        this.$onSelectCard = g0u;
        this.$onChooseDifferentCard = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
