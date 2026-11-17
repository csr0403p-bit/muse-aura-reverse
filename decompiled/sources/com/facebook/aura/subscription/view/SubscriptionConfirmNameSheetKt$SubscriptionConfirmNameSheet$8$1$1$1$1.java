package com.facebook.aura.subscription.view;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.B1U;
import X.BBI;
import X.BFM;
import X.C07C;
import X.C10472Hkj;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import X.Hw8;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.subscription.model.AuraSubscriptionNameGateViewModel;
import com.facebook.aura.ui.HatchSectionScope;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$8$1$1$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ MutableState<String> $firstName$delegate;
    public final /* synthetic */ boolean $isCommitting;
    public final /* synthetic */ MutableState<String> $lastName$delegate;
    public final /* synthetic */ AuraSubscriptionNameGateViewModel $nameGateViewModel;

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$8$1$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<String> $firstName$delegate;
        public final /* synthetic */ boolean $isCommitting;
        public final /* synthetic */ AuraSubscriptionNameGateViewModel $nameGateViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, MutableState<String> mutableState, AuraSubscriptionNameGateViewModel auraSubscriptionNameGateViewModel) {
            super(3);
            this.$isCommitting = z;
            this.$firstName$delegate = mutableState;
            this.$nameGateViewModel = auraSubscriptionNameGateViewModel;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            String strA05 = MutableState.A05(this.$firstName$delegate);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210a9);
            Hw8 hw8 = C10472Hkj.A0A;
            boolean z = !this.$isCommitting;
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$nameGateViewModel, bfm.A65(this.$firstName$delegate));
            AuraSubscriptionNameGateViewModel auraSubscriptionNameGateViewModel = this.$nameGateViewModel;
            MutableState<String> mutableState = this.$firstName$delegate;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$8$1$1$1$1$1$1$1(auraSubscriptionNameGateViewModel, mutableState);
                BBI.A0T(bfm, objAaT);
            }
            SubscriptionConfirmNameSheetKt.m2281NameFieldvbMXUkU(strA05, strA01, 6, hw8, z, (G0U) objAaT, null, bfm, 384, 64);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$8$1$1$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isCommitting;
        public final /* synthetic */ MutableState<String> $lastName$delegate;
        public final /* synthetic */ AuraSubscriptionNameGateViewModel $nameGateViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, MutableState<String> mutableState, AuraSubscriptionNameGateViewModel auraSubscriptionNameGateViewModel) {
            super(3);
            this.$isCommitting = z;
            this.$lastName$delegate = mutableState;
            this.$nameGateViewModel = auraSubscriptionNameGateViewModel;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            String strA05 = MutableState.A05(this.$lastName$delegate);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210aa);
            Hw8 hw8 = C10472Hkj.A0C;
            boolean z = !this.$isCommitting;
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$nameGateViewModel, bfm.A65(this.$lastName$delegate));
            AuraSubscriptionNameGateViewModel auraSubscriptionNameGateViewModel = this.$nameGateViewModel;
            MutableState<String> mutableState = this.$lastName$delegate;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$8$1$1$1$1$2$1$1(auraSubscriptionNameGateViewModel, mutableState);
                BBI.A0T(bfm, objAaT);
            }
            SubscriptionConfirmNameSheetKt.m2281NameFieldvbMXUkU(strA05, strA01, 7, hw8, z, (G0U) objAaT, null, bfm, 384, 64);
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
        hatchSectionScope.item(B1U.A03(new AnonymousClass1(this.$isCommitting, this.$firstName$delegate, this.$nameGateViewModel), -2041405902, true));
        hatchSectionScope.item(B1U.A03(new AnonymousClass2(this.$isCommitting, this.$lastName$delegate, this.$nameGateViewModel), -592273125, true));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$8$1$1$1$1(boolean z, MutableState<String> mutableState, AuraSubscriptionNameGateViewModel auraSubscriptionNameGateViewModel, MutableState<String> mutableState2) {
        super(1);
        this.$isCommitting = z;
        this.$firstName$delegate = mutableState;
        this.$nameGateViewModel = auraSubscriptionNameGateViewModel;
        this.$lastName$delegate = mutableState2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
