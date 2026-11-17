package com.facebook.aura.subscription.view;

import X.AFs;
import X.AFz;
import X.AG7;
import X.AG9;
import X.AKO;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.B1V;
import X.B81;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BRg;
import X.C0872AFu;
import X.C1BO;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C60O;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C8j4;
import X.CFK;
import X.FGI;
import X.G0U;
import X.G0V;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.navigation.key.AuraSubscriptionPage;
import com.facebook.aura.navigation.key.SubscriptionAttribution;
import com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.subscription.model.AuraSubscriptionActionsKt;
import com.facebook.aura.subscription.model.AuraSubscriptionNameGateViewModel;
import com.facebook.aura.subscription.model.PurchaseBlock;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepository;
import com.facebook.aura.subscription.repo.SubscriptionCrossPlatformDialog;
import com.facebook.aura.subscription.repo.SubscriptionDetails;
import com.facebook.aura.subscription.repo.SubscriptionDetailsState;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AuraSubscriptionSheetKt {
    public static final String BUY_CREDITS_PREFIX = "buy_credits:";
    public static final String CONFIRM_NAME_TOKEN = "confirm_name";
    public static final String PAYWALL_TOKEN = "paywall";
    public static final String TAG = "AuraSubscriptionSheet";
    public static final String USAGE_TOKEN = "usage";
    public static final AFs<SnapshotStateList<AuraSubscriptionPage>, ArrayList<String>> pageStackSaver = new C0872AFu(AuraSubscriptionSheetKt$pageStackSaver$1.INSTANCE, AuraSubscriptionSheetKt$pageStackSaver$2.INSTANCE);

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionSheetKt$AuraSubscriptionSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ SubscriptionAttribution $attribution;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<AuraSubscriptionPage, Unit> $navigateToPage;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ AuraSubscriptionPage $page;

        /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionSheetKt$AuraSubscriptionSheet$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ SubscriptionAttribution $attribution;
            public final /* synthetic */ BRg $modifier;
            public final /* synthetic */ G0U<AuraSubscriptionPage, Unit> $navigateToPage;
            public final /* synthetic */ Function0<Unit> $onBack;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Function0<Unit> function0, SubscriptionAttribution subscriptionAttribution, G0U<? super AuraSubscriptionPage, Unit> g0u, BRg bRg) {
                super(2);
                this.$onBack = function0;
                this.$attribution = subscriptionAttribution;
                this.$navigateToPage = g0u;
                this.$modifier = bRg;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                    AuraSubscriptionPaywallBottomSheetKt.AuraSubscriptionPaywallBottomSheet(this.$onBack, this.$attribution, this.$navigateToPage, this.$modifier, bfm, 384, 0);
                } else {
                    bfm.Afo();
                }
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionSheetKt$AuraSubscriptionSheet$2$2, reason: invalid class name and collision with other inner class name */
        public final class C04052 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ SubscriptionAttribution $attribution;
            public final /* synthetic */ BRg $modifier;
            public final /* synthetic */ G0U<AuraSubscriptionPage, Unit> $navigateToPage;
            public final /* synthetic */ Function0<Unit> $onBack;
            public final /* synthetic */ AuraSubscriptionPage $page;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C04052(AuraSubscriptionPage auraSubscriptionPage, SubscriptionAttribution subscriptionAttribution, Function0<Unit> function0, G0U<? super AuraSubscriptionPage, Unit> g0u, BRg bRg) {
                super(2);
                this.$page = auraSubscriptionPage;
                this.$attribution = subscriptionAttribution;
                this.$onBack = function0;
                this.$navigateToPage = g0u;
                this.$modifier = bRg;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                    AuraBuyCreditsBottomSheetKt.AuraBuyCreditsBottomSheet(((AuraSubscriptionPage.BuyCredits) this.$page).prevSurface, this.$attribution, this.$onBack, this.$navigateToPage, this.$modifier, null, bfm, 3072, 32);
                } else {
                    bfm.Afo();
                }
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionSheetKt$AuraSubscriptionSheet$2$3, reason: invalid class name */
        public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ SubscriptionAttribution $attribution;
            public final /* synthetic */ AuraSubscriptionNameGateViewModel.HeldCheckout $heldCheckout;
            public final /* synthetic */ BRg $modifier;
            public final /* synthetic */ Function0<Unit> $onBack;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(AuraSubscriptionNameGateViewModel.HeldCheckout heldCheckout, SubscriptionAttribution subscriptionAttribution, Function0<Unit> function0, BRg bRg) {
                super(2);
                this.$heldCheckout = heldCheckout;
                this.$attribution = subscriptionAttribution;
                this.$onBack = function0;
                this.$modifier = bRg;
            }

            public final void invoke(BFM bfm, int i) {
                SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint;
                SubscriptionAttribution attribution;
                if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                    bfm.Afo();
                    return;
                }
                AuraSubscriptionNameGateViewModel.HeldCheckout heldCheckout = this.$heldCheckout;
                if (heldCheckout == null || (attribution = heldCheckout.getAttribution()) == null || (subscriptionPaywallEntryPoint = attribution.localEntryPoint) == null) {
                    subscriptionPaywallEntryPoint = this.$attribution.localEntryPoint;
                }
                SubscriptionConfirmNameSheetKt.SubscriptionConfirmNameSheet(subscriptionPaywallEntryPoint, this.$onBack, this.$modifier, null, null, bfm, 0, 24);
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AuraSubscriptionPage auraSubscriptionPage, SubscriptionAttribution subscriptionAttribution, G0U<? super AuraSubscriptionPage, Unit> g0u, BRg bRg, Function0<Unit> function0) {
            super(2);
            this.$page = auraSubscriptionPage;
            this.$attribution = subscriptionAttribution;
            this.$navigateToPage = g0u;
            this.$modifier = bRg;
            this.$onBack = function0;
        }

        public final void invoke(BFM bfm, int i) {
            SubscriptionAttribution attribution;
            boolean z = false;
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                bfm.Afo();
                return;
            }
            AuraSubscriptionPage auraSubscriptionPage = this.$page;
            if (auraSubscriptionPage instanceof AuraSubscriptionPage.Usage) {
                bfm.AgE(-1541448031);
                AuraSubscriptionUsageBottomSheetKt.AuraSubscriptionUsageBottomSheet(this.$attribution, this.$navigateToPage, this.$modifier, bfm, 48, 0);
            } else if (auraSubscriptionPage instanceof AuraSubscriptionPage.Paywall) {
                bfm.AgE(-1541440711);
                Function0<Unit> function0 = this.$onBack;
                SubscriptionAttribution subscriptionAttribution = this.$attribution;
                AuraSubscriptionSheetKt.PurchaseGate(function0, true, subscriptionAttribution, B1V.A00(bfm, new AnonymousClass1(function0, subscriptionAttribution, this.$navigateToPage, this.$modifier), -620397004), bfm, 3120);
            } else if (auraSubscriptionPage instanceof AuraSubscriptionPage.BuyCredits) {
                bfm.AgE(-1541426559);
                Function0<Unit> function02 = this.$onBack;
                SubscriptionAttribution subscriptionAttribution2 = this.$attribution;
                AuraSubscriptionSheetKt.PurchaseGate(function02, false, subscriptionAttribution2, B1V.A00(bfm, new C04052(this.$page, subscriptionAttribution2, function02, this.$navigateToPage, this.$modifier), 1498653971), bfm, 3120);
            } else {
                if (!(auraSubscriptionPage instanceof AuraSubscriptionPage.ConfirmName)) {
                    throw AnonymousClass005.A0k(bfm, -1541448249);
                }
                bfm.AgE(-539104369);
                AuraSubscriptionNameGateViewModel.Factory factory = new AuraSubscriptionNameGateViewModel.Factory(AKO.A06(LocalUserSessionKt.LocalUserSession, (BBI) bfm));
                BOD bodA00 = C5wL.A00(bfm);
                if (bodA00 == null) {
                    throw AnonymousClass001.A0o();
                }
                AuraSubscriptionNameGateViewModel.HeldPurchase heldPurchase = (AuraSubscriptionNameGateViewModel.HeldPurchase) C1BO.A07(bfm, ((AuraSubscriptionNameGateViewModel) C3cH.A0G(factory, bodA00, AnonymousClass005.A0Y(bodA00), AuraSubscriptionNameGateViewModel.class)).heldPurchase);
                AuraSubscriptionNameGateViewModel.HeldCheckout heldCheckout = heldPurchase != null ? heldPurchase.checkout : null;
                Function0<Unit> function03 = this.$onBack;
                if (heldCheckout != null && !heldCheckout.isSubscriptionPlanPurchase()) {
                    z = true;
                }
                boolean z2 = !z;
                if (heldCheckout == null || (attribution = heldCheckout.getAttribution()) == null) {
                    attribution = this.$attribution;
                }
                AuraSubscriptionSheetKt.PurchaseGate(function03, z2, attribution, B1V.A00(bfm, new AnonymousClass3(heldCheckout, this.$attribution, this.$onBack, this.$modifier), -677262350), bfm, 3072);
            }
            AnonymousClass002.A19(bfm);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionSheetKt$AuraSubscriptionSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SubscriptionAttribution $attribution;
        public final /* synthetic */ AuraSubscriptionPage $initialPage;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AuraSubscriptionPage auraSubscriptionPage, SubscriptionAttribution subscriptionAttribution, BRg bRg, int i, int i2) {
            super(2);
            this.$initialPage = auraSubscriptionPage;
            this.$attribution = subscriptionAttribution;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionSheetKt.AuraSubscriptionSheet(this.$initialPage, this.$attribution, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionSheetKt$PurchaseBlockGate$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ SubscriptionAttribution $attribution;
        public final /* synthetic */ PurchaseBlock $block;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ SubscriptionDetails $details;
        public final /* synthetic */ Function0<Unit> $onBack;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(PurchaseBlock purchaseBlock, SubscriptionDetails subscriptionDetails, Function0<Unit> function0, SubscriptionAttribution subscriptionAttribution, G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
            super(2);
            this.$block = purchaseBlock;
            this.$details = subscriptionDetails;
            this.$onBack = function0;
            this.$attribution = subscriptionAttribution;
            this.$content = g0v;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionSheetKt.PurchaseBlockGate(this.$block, this.$details, this.$onBack, this.$attribution, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionSheetKt$PurchaseGate$2, reason: invalid class name and case insensitive filesystem */
    public final class C141982 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ SubscriptionAttribution $attribution;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $isSubscriptionPlanPurchase;
        public final /* synthetic */ Function0<Unit> $onBack;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C141982(Function0<Unit> function0, boolean z, SubscriptionAttribution subscriptionAttribution, G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
            super(2);
            this.$onBack = function0;
            this.$isSubscriptionPlanPurchase = z;
            this.$attribution = subscriptionAttribution;
            this.$content = g0v;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionSheetKt.PurchaseGate(this.$onBack, this.$isSubscriptionPlanPurchase, this.$attribution, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [boolean] */
    public static final void AuraSubscriptionSheet(AuraSubscriptionPage auraSubscriptionPage, SubscriptionAttribution subscriptionAttribution, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        ?? A1a = AnonymousClass002.A1a(auraSubscriptionPage, subscriptionAttribution);
        bfm.AgG(-382949834);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(auraSubscriptionPage, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, subscriptionAttribution);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object[] objArr = new Object[0];
            AFs<SnapshotStateList<AuraSubscriptionPage>, ArrayList<String>> aFs = pageStackSaver;
            boolean z = (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(auraSubscriptionPage));
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = new AuraSubscriptionSheetKt$AuraSubscriptionSheet$backStack$1$1(auraSubscriptionPage);
                BBI.A0T(bfm, objAaT);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) AFz.A01(bfm, aFs, (Function0) objAaT, objArr);
            AG9 ag9A00 = AG7.A00(bfm);
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT2 == obj) {
                objAaT2 = new AuraSubscriptionSheetKt$AuraSubscriptionSheet$navigateToPage$1$1(snapshotStateList, ag9A00);
                BBI.A0T(bfm, objAaT2);
            }
            G0U g0u = (G0U) objAaT2;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = new AuraSubscriptionSheetKt$AuraSubscriptionSheet$popPage$1$1(snapshotStateList, ag9A00);
                BBI.A0T(bfm, objAaT3);
            }
            Function0 function0 = (Function0) objAaT3;
            boolean zA1V = C8j4.A1V(snapshotStateList.size(), A1a == true ? 1 : 0);
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = new AuraSubscriptionSheetKt$AuraSubscriptionSheet$1$1(function0);
                BBI.A0T(bfm, objAaT4);
            }
            B81.A00(zA1V, (Function0) objAaT4, bfm, 48, 0);
            if (snapshotStateList.size() <= A1a) {
                function0 = null;
            }
            AuraSubscriptionPage auraSubscriptionPage2 = (AuraSubscriptionPage) AbstractC0878AGe.A0H(snapshotStateList);
            ag9A00.A2e(encodePage(auraSubscriptionPage2), B1V.A00(bfm, new AnonymousClass2(auraSubscriptionPage2, subscriptionAttribution, g0u, bRg2, function0), -841826537), bfm, 48);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(auraSubscriptionPage, subscriptionAttribution, bRg2, i, i2);
        }
    }

    public static final void PurchaseBlockGate(PurchaseBlock purchaseBlock, SubscriptionDetails subscriptionDetails, Function0<Unit> function0, SubscriptionAttribution subscriptionAttribution, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        Function0<Unit> function02;
        int iOrdinal;
        SubscriptionCrossPlatformDialog subscriptionCrossPlatformDialog;
        C7384Etj.A0Y(subscriptionAttribution, 3);
        C7384Etj.A0Y(g0v, 4);
        bfm.AgG(459592310);
        int iA0D = (i & 6) == 0 ? AnonymousClass004.A0D(bfm, AnonymousClass003.A0K(purchaseBlock)) | i : i;
        if ((i & 48) == 0) {
            iA0D |= AnonymousClass002.A06(AnonymousClass004.A1Y(subscriptionDetails, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0D |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0D |= AnonymousClass004.A0W(bfm, subscriptionAttribution);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0D |= AnonymousClass004.A0X(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 9363, 9362), bfm, iA0D)) {
            BBI bbi = (BBI) bfm;
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            if (function0 == null) {
                boolean zA1Z = AnonymousClass001.A1Z(auraNavigatorA05, bfm, -640969277);
                Object objAaT = bfm.AaT();
                if (zA1Z || objAaT == C78N.A00) {
                    objAaT = new AuraSubscriptionSheetKt$PurchaseBlockGate$onDismiss$1$1(auraNavigatorA05);
                    BBI.A0O(bbi, objAaT);
                }
                function02 = (Function0) objAaT;
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-713413399);
                BBI.A0R(bbi, false);
                function02 = function0;
            }
            if (purchaseBlock == null || (iOrdinal = purchaseBlock.ordinal()) == -1) {
                bfm.AgE(-713400161);
                AnonymousClass003.A13(bfm, g0v, iA0D >> 12);
            } else if (iOrdinal == 0) {
                bfm.AgE(-713409665);
                String str = null;
                if (subscriptionDetails != null) {
                    subscriptionCrossPlatformDialog = subscriptionDetails.crossPlatformDialog;
                    str = subscriptionDetails.crossPlatformMessage;
                } else {
                    subscriptionCrossPlatformDialog = null;
                }
                SubscriptionSheetHelpersKt.CrossPlatformDialog(subscriptionCrossPlatformDialog, str, null, function02, bfm, SubscriptionCrossPlatformDialog.$stable, 4);
            } else {
                if (iOrdinal != 1) {
                    throw AnonymousClass003.A0k(bfm, bbi, -713411348);
                }
                bfm.AgE(-713403035);
                SubscriptionSheetHelpersKt.SubscriptionUnavailableDialog(subscriptionAttribution, function02, null, bfm, (iA0D >> 9) & 14, 4);
            }
            BBI.A0R(bbi, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(purchaseBlock, subscriptionDetails, function0, subscriptionAttribution, g0v, i);
        }
    }

    public static final void PurchaseGate(Function0<Unit> function0, boolean z, SubscriptionAttribution subscriptionAttribution, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        SubscriptionDetailsState.Success success;
        AnonymousClass002.A1B(subscriptionAttribution, 2, g0v);
        bfm.AgG(758299426);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, subscriptionAttribution);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0T), bfm, iA0T)) {
            BBI bbi = (BBI) bfm;
            AuraSubscriptionRepository companion = AuraSubscriptionRepository.Companion.getInstance(AKO.A06(LocalUserSessionKt.LocalUserSession, bbi));
            Unit unit = Unit.INSTANCE;
            boolean zA67 = bfm.A67(companion);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new AuraSubscriptionSheetKt$PurchaseGate$1$1(companion);
                BBI.A0O(bbi, objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, unit);
            SubscriptionDetails subscriptionDetails = null;
            Object objA07 = C1BO.A07(bfm, companion.subscriptionDetailsState);
            if ((objA07 instanceof SubscriptionDetailsState.Success) && (success = (SubscriptionDetailsState.Success) objA07) != null) {
                subscriptionDetails = success.details;
            }
            PurchaseBlockGate(AuraSubscriptionActionsKt.purchaseBlock(subscriptionDetails, z), subscriptionDetails, function0, subscriptionAttribution, g0v, bfm, AnonymousClass003.A07(iA0T << 3, (SubscriptionDetails.$stable << 3) | ((iA0T << 6) & 896)));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141982(function0, z, subscriptionAttribution, g0v, i);
        }
    }

    /* loaded from: classes.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchaseBlock.values().length];
            try {
                AnonymousClass002.A13(PurchaseBlock.CROSS_PLATFORM, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(PurchaseBlock.INELIGIBLE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final AuraSubscriptionPage decodePage(String str) {
        AuraSubscriptionPage auraSubscriptionPage;
        if (USAGE_TOKEN.equals(str)) {
            auraSubscriptionPage = AuraSubscriptionPage.Usage.INSTANCE;
        } else if ("paywall".equals(str)) {
            auraSubscriptionPage = AuraSubscriptionPage.Paywall.INSTANCE;
        } else if (CONFIRM_NAME_TOKEN.equals(str)) {
            auraSubscriptionPage = AuraSubscriptionPage.ConfirmName.INSTANCE;
        } else {
            if (C60O.A1X(str, BUY_CREDITS_PREFIX)) {
                return new AuraSubscriptionPage.BuyCredits(C7BY.A0K(BUY_CREDITS_PREFIX, str));
            }
            CFK.A06(TAG, FGI.A0M("Unknown subscription page token on restore, defaulting to Usage: ", str));
            auraSubscriptionPage = AuraSubscriptionPage.Usage.INSTANCE;
        }
        return auraSubscriptionPage;
    }

    public static final String encodePage(AuraSubscriptionPage auraSubscriptionPage) {
        if (auraSubscriptionPage instanceof AuraSubscriptionPage.Usage) {
            return USAGE_TOKEN;
        }
        if (auraSubscriptionPage instanceof AuraSubscriptionPage.Paywall) {
            return "paywall";
        }
        if (auraSubscriptionPage instanceof AuraSubscriptionPage.ConfirmName) {
            return CONFIRM_NAME_TOKEN;
        }
        if (auraSubscriptionPage instanceof AuraSubscriptionPage.BuyCredits) {
            return FGI.A0M(BUY_CREDITS_PREFIX, ((AuraSubscriptionPage.BuyCredits) auraSubscriptionPage).prevSurface);
        }
        throw C3cG.A0q();
    }
}
