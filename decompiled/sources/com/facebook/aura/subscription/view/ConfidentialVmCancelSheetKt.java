package com.facebook.aura.subscription.view;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C07C;
import X.C0A8;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C2VU;
import X.C3U4;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.subscription.repo.SubscriptionConfidentialVmConfirmation;
import com.facebook.aura.subscription.repo.SubscriptionConfirmationIcon;
import com.facebook.aura.subscription.repo.SubscriptionConfirmationItem;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraInlineBottomSheetKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ConfidentialVmCancelSheetKt {

    /* renamed from: com.facebook.aura.subscription.view.ConfidentialVmCancelSheetKt$ConfidentialVmCancelItem$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SubscriptionConfirmationItem $item;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SubscriptionConfirmationItem subscriptionConfirmationItem, BRg bRg, int i, int i2) {
            super(2);
            this.$item = subscriptionConfirmationItem;
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
            ConfidentialVmCancelSheetKt.ConfidentialVmCancelItem(this.$item, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.ConfidentialVmCancelSheetKt$ConfidentialVmCancelSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C142122 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ SubscriptionConfidentialVmConfirmation $confirmation;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Map<String, String> $subscriptionMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142122(SubscriptionConfidentialVmConfirmation subscriptionConfidentialVmConfirmation, Map<String, String> map, Function0<Unit> function0, Function0<Unit> function02) {
            super(2);
            this.$confirmation = subscriptionConfidentialVmConfirmation;
            this.$subscriptionMetadata = map;
            this.$onConfirm = function0;
            this.$onDismiss = function02;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDismiss, AnonymousClass001.A1R(bfm, this.$onConfirm, AnonymousClass001.A1T(bfm, this.$subscriptionMetadata, bfm.A67(this.$confirmation))));
                SubscriptionConfidentialVmConfirmation subscriptionConfidentialVmConfirmation = this.$confirmation;
                Map<String, String> map = this.$subscriptionMetadata;
                Function0<Unit> function0 = this.$onConfirm;
                Function0<Unit> function02 = this.$onDismiss;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new ConfidentialVmCancelSheetKt$ConfidentialVmCancelSheet$2$1$1(subscriptionConfidentialVmConfirmation, map, function0, function02);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.ConfidentialVmCancelSheetKt$ConfidentialVmCancelSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ SubscriptionConfidentialVmConfirmation $confirmation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(SubscriptionConfidentialVmConfirmation subscriptionConfidentialVmConfirmation) {
            super(3);
            this.$confirmation = subscriptionConfidentialVmConfirmation;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A02;
                float f = AuraDimensKt.SpacingLarge;
                BRg bRgA07 = C3U4.A07(c1062ATq, f);
                SubscriptionConfidentialVmConfirmation subscriptionConfidentialVmConfirmation = this.$confirmation;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA07);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                AuraTextKt.m2639AuraTextUY9GdpU(subscriptionConfidentialVmConfirmation.summary, null, C06G.A0C(bfm), C06G.A0T(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                bfm.AgE(1778909628);
                for (SubscriptionConfirmationItem subscriptionConfirmationItem : subscriptionConfidentialVmConfirmation.items) {
                    C01N.A08(bfm, bs0, f);
                    ConfidentialVmCancelSheetKt.ConfidentialVmCancelItem(subscriptionConfirmationItem, null, bfm, SubscriptionConfirmationItem.$stable, 2);
                }
                AnonymousClass003.A0q(bbi);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.ConfidentialVmCancelSheetKt$ConfidentialVmCancelSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SubscriptionConfidentialVmConfirmation $confirmation;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Map<String, String> $subscriptionMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(SubscriptionConfidentialVmConfirmation subscriptionConfidentialVmConfirmation, Map<String, String> map, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$confirmation = subscriptionConfidentialVmConfirmation;
            this.$subscriptionMetadata = map;
            this.$onConfirm = function0;
            this.$onDismiss = function02;
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
            ConfidentialVmCancelSheetKt.ConfidentialVmCancelSheet(this.$confirmation, this.$subscriptionMetadata, this.$onConfirm, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubscriptionConfirmationIcon.values().length];
            try {
                AnonymousClass002.A13(SubscriptionConfirmationIcon.CONFIDENTIAL_VM, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(SubscriptionConfirmationIcon.TOKENS, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void ConfidentialVmCancelItem(SubscriptionConfirmationItem subscriptionConfirmationItem, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1543767686);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(subscriptionConfirmationItem, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, C2VU.A05, 0);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            SubscriptionConfirmationIcon subscriptionConfirmationIcon = subscriptionConfirmationItem.icon;
            if (subscriptionConfirmationIcon != null) {
                bfm.AgE(280003273);
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, drawableRes(subscriptionConfirmationIcon), 0), AuraIconSize.SMALL, null, C06G.A0A(bfm), null, bfm, AnonymousClass001.A04(), 33);
            } else {
                bfm.AgE(280216553);
                C01N.A0A(bfm, BRg.A00, AnonymousClass002.A0d(bfm).icon.small);
            }
            BBI.A0R(bbi, false);
            BS0 bs0 = BRg.A00;
            C01N.A09(bfm, bs0, AuraDimensKt.SpacingSmall);
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(subscriptionConfirmationItem.text, null, C06G.A0C(bfm), C06G.A0W(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            AuraTextKt.m2639AuraTextUY9GdpU(subscriptionConfirmationItem.subtext, null, C06G.A08(bfm), C06G.A0Z(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(subscriptionConfirmationItem, bRg2, i, i2);
        }
    }

    public static final void ConfidentialVmCancelSheet(SubscriptionConfidentialVmConfirmation subscriptionConfidentialVmConfirmation, Map<String, String> map, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A11(subscriptionConfidentialVmConfirmation, function0, function02, 0);
        bfm.AgG(-2109139492);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(subscriptionConfidentialVmConfirmation, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(map, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function02);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraContainer.SecondaryBottomSheet secondaryBottomSheet = AuraContainer.SecondaryBottomSheet.INSTANCE;
            BRg bRgHatchImpression = HatchImpressionModifierKt.hatchImpression(bRg2, HatchOrigin.MONETIZATION, HatchSurface.MONETIZATION, HatchSubsurface.SUBSCRIPTION, HatchScreen.CANCEL_SUBSCRIPTION_DIALOG, HatchComponent.CANCEL_SUBSCRIPTION_DIALOG_SCREEN, null, map, null, 500L, 0.0f, null, null, null);
            boolean z = ((iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(map))) | ((iA05 & 7168) == 2048);
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = new ConfidentialVmCancelSheetKt$ConfidentialVmCancelSheet$1$1(map, function02);
                bfm.Ai0(objAaT);
            }
            AuraInlineBottomSheetKt.AuraInlineBottomSheet(secondaryBottomSheet, bRgHatchImpression, (Function0) objAaT, null, null, new AuraBottomSheetHeaderConfig(subscriptionConfidentialVmConfirmation.title, null, null, null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null), B1V.A00(bfm, new C142122(subscriptionConfidentialVmConfirmation, map, function0, function02), -1400890443), null, null, null, false, false, false, B1V.A00(bfm, new AnonymousClass3(subscriptionConfidentialVmConfirmation), -2049816967), bfm, 1572870, 3072, 8088);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(subscriptionConfidentialVmConfirmation, map, function0, function02, bRg2, i, i2);
        }
    }

    public static final void logCancelSheetDismiss(HatchComponent hatchComponent, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.MONETIZATION, HatchSubsurface.SUBSCRIPTION, HatchScreen.CANCEL_SUBSCRIPTION_DIALOG, hatchComponent, null, map);
    }

    public static final int drawableRes(SubscriptionConfirmationIcon subscriptionConfirmationIcon) {
        int iOrdinal = subscriptionConfirmationIcon.ordinal();
        if (iOrdinal == 0) {
            return R.drawable.aiincognito_outline_24_wght400;
        }
        if (iOrdinal == 1) {
            return R.drawable.coinstack_outline_24_wght400;
        }
        throw new NoWhenBranchMatchedException();
    }
}
