package com.facebook.aura.subscription.view;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C07C;
import X.C3U4;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.ui.HatchSectionScope;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSubscriptionUsageBottomSheetKt$PurchasedUsage$3$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ String $buyCtaLabel;
    public final /* synthetic */ String $label;
    public final /* synthetic */ Function0<Unit> $onBuyClick;
    public final /* synthetic */ Integer $usedPercent;
    public final /* synthetic */ String $valueLabel;

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$PurchasedUsage$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $label;
        public final /* synthetic */ Integer $usedPercent;
        public final /* synthetic */ String $valueLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Integer num, String str2) {
            super(3);
            this.$label = str;
            this.$usedPercent = num;
            this.$valueLabel = str2;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                String strA01 = this.$label;
                if (strA01 == null) {
                    bfm.AgE(1993692020);
                    strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210b9);
                } else {
                    bfm.AgE(1993691741);
                }
                AnonymousClass001.A1D(bfm);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210ad);
                Integer num = this.$usedPercent;
                BS0 bs0 = BRg.A00;
                float f = AuraDimensKt.SpacingMedium;
                AuraSubscriptionUsageMetersKt.UsageMeterRow(strA01, strA012, num, C3U4.A0C(bs0, f, f, f, AuraDimensKt.SpacingSmall), this.$valueLabel, bfm, 0, 0);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$PurchasedUsage$3$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $buyCtaLabel;
        public final /* synthetic */ Function0<Unit> $onBuyClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Function0<Unit> function0) {
            super(3);
            this.$buyCtaLabel = str;
            this.$onBuyClick = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                AuraSubscriptionUsageMetersKt.m2274UsageCtaRowgF0flNs(this.$buyCtaLabel, this.$onBuyClick, null, 0L, null, false, false, null, false, bfm, 196608, 476);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass1(this.$label, this.$usedPercent, this.$valueLabel), -668315717);
        String str = this.$buyCtaLabel;
        if (str != null) {
            AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass2(str, this.$onBuyClick), 1879484374);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionUsageBottomSheetKt$PurchasedUsage$3$1(String str, String str2, Integer num, String str3, Function0<Unit> function0) {
        super(1);
        this.$buyCtaLabel = str;
        this.$label = str2;
        this.$usedPercent = num;
        this.$valueLabel = str3;
        this.$onBuyClick = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
