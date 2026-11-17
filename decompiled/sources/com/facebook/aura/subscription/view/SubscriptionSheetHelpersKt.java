package com.facebook.aura.subscription.view;

import X.AIW;
import X.AKO;
import X.ARD;
import X.AbstractC1798ArH;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.B1U;
import X.B1V;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPc;
import X.BRg;
import X.C0924AIa;
import X.C0jP;
import X.C10543Hqv;
import X.C10G;
import X.C1822Arm;
import X.C19U;
import X.C1b8;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C8j4;
import X.EnumC10573Huf;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.HzP;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.devices.intf.SubscriptionAddOn;
import com.facebook.aura.devices.intf.SubscriptionAddOnIntegration;
import com.facebook.aura.devices.intf.SubscriptionAddOnKt;
import com.facebook.aura.iap.HatchIapUserSession;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.SubscriptionAttribution;
import com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.subscription.model.CheckoutNotice;
import com.facebook.aura.subscription.repo.SubscriptionCrossPlatformDialog;
import com.facebook.aura.ui.HatchScreenErrorStateKt;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class SubscriptionSheetHelpersKt {
    public static final String TAG = "SubscriptionSheetHelpers";
    public static final String WORKPLACE_GROUP_LINK_PHRASE = "workplace group";

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionSheetHelpersKt$CheckoutNoticeMessage$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ CheckoutNotice $notice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheckoutNotice checkoutNotice, BRg bRg, int i, int i2) {
            super(2);
            this.$notice = checkoutNotice;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SubscriptionSheetHelpersKt.CheckoutNoticeMessage(this.$notice, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionSheetHelpersKt$CrossPlatformDialog$1, reason: invalid class name and case insensitive filesystem */
    public final class C142131 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SubscriptionCrossPlatformDialog $dialog;
        public final /* synthetic */ String $message;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142131(SubscriptionCrossPlatformDialog subscriptionCrossPlatformDialog, String str, BRg bRg, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$dialog = subscriptionCrossPlatformDialog;
            this.$message = str;
            this.$modifier = bRg;
            this.$onDismiss = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SubscriptionSheetHelpersKt.CrossPlatformDialog(this.$dialog, this.$message, this.$modifier, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionSheetHelpersKt$MockPaymentWarning$1, reason: invalid class name and case insensitive filesystem */
    public final class C142141 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142141(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SubscriptionSheetHelpersKt.MockPaymentWarning(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionSheetHelpersKt$PurchaseErrorMessage$1, reason: invalid class name and case insensitive filesystem */
    public final class C142151 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142151(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SubscriptionSheetHelpersKt.PurchaseErrorMessage(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionSheetHelpersKt$PurchasePendingDialog$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes2.dex */
    public final class C142161 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142161(Function0<Unit> function0) {
            super(2);
            this.$onDismiss = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA65 = bfm.A65(this.$onDismiss);
                Function0<Unit> function0 = this.$onDismiss;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new SubscriptionSheetHelpersKt$PurchasePendingDialog$1$1$1(function0);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionSheetHelpersKt$PurchasePendingDialog$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, int i) {
            super(2);
            this.$onDismiss = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            SubscriptionSheetHelpersKt.PurchasePendingDialog(this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionSheetHelpersKt$SubscriptionInfoDialog$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    public final class C142171 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $buttonLabel;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onDismissLogged;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142171(String str, Function0<Unit> function0, Function0<Unit> function02) {
            super(2);
            this.$buttonLabel = str;
            this.$onDismissLogged = function0;
            this.$onDismiss = function02;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDismiss, AnonymousClass001.A1R(bfm, this.$onDismissLogged, bfm.A65(this.$buttonLabel)));
            String str = this.$buttonLabel;
            Function0<Unit> function0 = this.$onDismissLogged;
            Function0<Unit> function02 = this.$onDismiss;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new SubscriptionSheetHelpersKt$SubscriptionInfoDialog$1$1$1(str, function0, function02);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A14(bfm, objAaT);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionSheetHelpersKt$SubscriptionInfoDialog$2, reason: invalid class name and case insensitive filesystem */
    public final class C142182 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $body;
        public final /* synthetic */ String $dismissLabel;
        public final /* synthetic */ BRg $impression;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onDismissLogged;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142182(String str, String str2, BRg bRg, String str3, Function0<Unit> function0, BRg bRg2, Function0<Unit> function02, int i, int i2) {
            super(2);
            this.$title = str;
            this.$body = str2;
            this.$modifier = bRg;
            this.$dismissLabel = str3;
            this.$onDismiss = function0;
            this.$impression = bRg2;
            this.$onDismissLogged = function02;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SubscriptionSheetHelpersKt.SubscriptionInfoDialog(this.$title, this.$body, this.$modifier, this.$dismissLabel, this.$onDismiss, this.$impression, this.$onDismissLogged, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionSheetHelpersKt$SubscriptionLoadError$2, reason: invalid class name and case insensitive filesystem */
    public final class C142192 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRetry;
        public final /* synthetic */ HatchScreen $screen;
        public final /* synthetic */ HatchSubsurface $subsurface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142192(HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$subsurface = hatchSubsurface;
            this.$screen = hatchScreen;
            this.$onRetry = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SubscriptionSheetHelpersKt.SubscriptionLoadError(this.$subsurface, this.$screen, this.$onRetry, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionSheetHelpersKt$SubscriptionUnavailableDialog$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes2.dex */
    public final class C142202 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142202(Function0<Unit> function0) {
            super(2);
            this.$onDismiss = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA65 = bfm.A65(this.$onDismiss);
                Function0<Unit> function0 = this.$onDismiss;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new SubscriptionSheetHelpersKt$SubscriptionUnavailableDialog$2$1$1(function0);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionSheetHelpersKt$SubscriptionUnavailableDialog$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SubscriptionAttribution $attribution;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(SubscriptionAttribution subscriptionAttribution, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$attribution = subscriptionAttribution;
            this.$onDismiss = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SubscriptionSheetHelpersKt.SubscriptionUnavailableDialog(this.$attribution, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.subscription.view.SubscriptionSheetHelpersKt", f = "SubscriptionSheetHelpers.kt", l = {394}, m = "runCatchingResult", v = 2)
    /* renamed from: com.facebook.aura.subscription.view.SubscriptionSheetHelpersKt$runCatchingResult$1, reason: invalid class name and case insensitive filesystem */
    public final class C142211 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SubscriptionSheetHelpersKt.runCatchingResult(null, this);
        }

        public C142211(HtJ<? super C142211> htJ) {
            super(htJ);
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionSheetHelpersKt$withAddOnContinuation$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C142221 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ Function0<Unit> $onSuccess;
        public final /* synthetic */ C10543Hqv<SubscriptionAddOnIntegration> $pendingAddOn;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142221(C10543Hqv<SubscriptionAddOnIntegration> c10543Hqv, Function0<Unit> function0, AuraNavigator auraNavigator) {
            super(0);
            this.$pendingAddOn = c10543Hqv;
            this.$onSuccess = function0;
            this.$navigator = auraNavigator;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C10543Hqv<SubscriptionAddOnIntegration> c10543Hqv = this.$pendingAddOn;
            SubscriptionAddOnIntegration subscriptionAddOnIntegration = c10543Hqv.element;
            c10543Hqv.element = null;
            this.$onSuccess.invoke();
            if (subscriptionAddOnIntegration != null) {
                AuraNavigator auraNavigator = this.$navigator;
                if (auraNavigator.isInBackStack(new SubscriptionSheetHelpersKt$withAddOnContinuation$1$1$1(subscriptionAddOnIntegration))) {
                    auraNavigator.popAll(new SubscriptionSheetHelpersKt$withAddOnContinuation$1$1$2(subscriptionAddOnIntegration));
                }
                auraNavigator.navigate(subscriptionAddOnIntegration.ui().purchaseSuccessDestination(), false);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public static final void CheckoutNoticeMessage(CheckoutNotice checkoutNotice, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(checkoutNotice, 0);
        bfm.AgG(-331904057);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, checkoutNotice) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA08 |= 48;
        } else if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA08), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int iOrdinal = checkoutNotice.ordinal();
            if (iOrdinal == 0) {
                bfm.AgE(-1132214182);
                m2283CheckoutNoticeText3IgeMak(AnonymousClass005.A0X(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210b5)), C3cH.A0W(bfm).secondaryText, bRg2, bfm, (iA08 << 3) & 896, 0);
            } else {
                if (iOrdinal != 1) {
                    throw AnonymousClass005.A0k(bfm, -1132215812);
                }
                bfm.AgE(-1132206640);
                PurchaseErrorMessage(bRg2, bfm, (iA08 >> 3) & 14, 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(checkoutNotice, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0097 A[PHI: r8
  0x0097: PHI (r8v3 java.lang.String) = (r8v0 java.lang.String), (r8v4 java.lang.String) binds: [B:27:0x0062, B:25:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CrossPlatformDialog(com.facebook.aura.subscription.repo.SubscriptionCrossPlatformDialog r12, java.lang.String r13, X.BRg r14, kotlin.jvm.functions.Function0<kotlin.Unit> r15, X.BFM r16, int r17, int r18) {
        /*
            r9 = r14
            r0 = 3
            r11 = r15
            X.C7384Etj.A0Y(r15, r0)
            r0 = 1936693828(0x736f9a44, float:1.8983274E31)
            r14 = r16
            r14.AgG(r0)
            r1 = r17
            r0 = r17 & 6
            r3 = r12
            if (r0 != 0) goto Lbb
            boolean r0 = X.AnonymousClass004.A1X(r12, r14, r1)
            int r5 = X.AnonymousClass002.A05(r0)
            r5 = r5 | r17
        L1f:
            r0 = r17 & 48
            r2 = r13
            if (r0 != 0) goto L29
            int r0 = X.AnonymousClass004.A0e(r14, r13)
            r5 = r5 | r0
        L29:
            r7 = r18 & 4
            if (r7 == 0) goto Lb0
            r5 = r5 | 384(0x180, float:5.38E-43)
        L2f:
            r0 = r1 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L38
            int r0 = X.AnonymousClass004.A0W(r14, r15)
            r5 = r5 | r0
        L38:
            r4 = r5 & 1171(0x493, float:1.641E-42)
            r0 = 1170(0x492, float:1.64E-42)
            r6 = 0
            boolean r0 = X.AnonymousClass002.A1P(r4, r0)
            boolean r0 = X.AnonymousClass001.A1b(r0, r14, r5)
            if (r0 == 0) goto Lac
            if (r7 == 0) goto L4b
            X.BS0 r9 = X.BRg.A00
        L4b:
            if (r12 == 0) goto L9e
            java.lang.String r7 = r12.title
            if (r7 == 0) goto L9e
            r0 = 1441935983(0x55f2326f, float:3.32873031E13)
            r14.AgE(r0)
        L57:
            X.BBI r4 = X.C3cG.A07(r14)
            if (r12 == 0) goto L61
            java.lang.String r8 = r12.body
            if (r8 != 0) goto L97
        L61:
            r8 = r13
            if (r13 != 0) goto L97
            r0 = 1441939709(0x55f240fd, float:3.32951171E13)
            r14.AgE(r0)
            r0 = 2131890377(0x7f1210c9, float:1.9415444E38)
            java.lang.String r8 = X.AbstractC2271BQs.A01(r14, r0)
        L71:
            X.BBI.A0R(r4, r6)
            r4 = r5 & 896(0x380, float:1.256E-42)
            int r0 = r5 << 3
            int r15 = X.AnonymousClass001.A0B(r0, r4)
            r16 = 104(0x68, float:1.46E-43)
            r10 = 0
            r12 = r10
            r13 = r10
            SubscriptionInfoDialog(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L84:
            X.BBb r0 = r14.AAc()
            if (r0 == 0) goto L96
            com.facebook.aura.subscription.view.SubscriptionSheetHelpersKt$CrossPlatformDialog$1 r12 = new com.facebook.aura.subscription.view.SubscriptionSheetHelpersKt$CrossPlatformDialog$1
            r15 = r9
            r16 = r11
            r14 = r2
            r13 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r0.A06 = r12
        L96:
            return
        L97:
            r0 = 1441938872(0x55f23db8, float:3.32933617E13)
            r14.AgE(r0)
            goto L71
        L9e:
            r0 = 1441936510(0x55f2347e, float:3.32884083E13)
            r14.AgE(r0)
            r0 = 2131890379(0x7f1210cb, float:1.9415448E38)
            java.lang.String r7 = X.AbstractC2271BQs.A01(r14, r0)
            goto L57
        Lac:
            r14.Afo()
            goto L84
        Lb0:
            r0 = r1 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L2f
            int r0 = X.AnonymousClass004.A0f(r14, r9)
            r5 = r5 | r0
            goto L2f
        Lbb:
            r5 = r1
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.view.SubscriptionSheetHelpersKt.CrossPlatformDialog(com.facebook.aura.subscription.repo.SubscriptionCrossPlatformDialog, java.lang.String, X.BRg, kotlin.jvm.functions.Function0, X.BFM, int, int):void");
    }

    public static final void PurchaseErrorMessage(BRg bRg, BFM bfm, int i, int i2) {
        ApQ apQA0X;
        BRg bRg2 = bRg;
        bfm.AgG(-1306145952);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BBI bbi = (BBI) bfm;
            Context contextA00 = AKO.A00(AndroidCompositionLocals_androidKt.A01, bbi);
            boolean zA65 = bfm.A65(contextA00);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = C3cG.A0P(AuraInstallSourceDetector.INSTANCE.isPublicInstall(contextA00));
                bfm.Ai0(objAaT);
            }
            boolean zA1X = AnonymousClass001.A1X(objAaT);
            HatchIapUserSession scoped = HatchIapUserSession.Companion.getScoped(contextA00);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210b6);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long j = auraTheme.getColors(bfm, 6).accent;
            C0jP c0jP = (C0jP) AKO.A07(Am0.A0G, bbi);
            if (!zA1X || !HatchUtil.INSTANCE.isViewerEmployee() || scoped == null || scoped.getUseIacOverIap()) {
                bfm.AgE(1010231692);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1010173164);
                apQA0X = m2286optOutMessageIv8Zu3U(j, c0jP, bfm, 0);
                BBI.A0R(bbi, false);
                if (apQA0X == null) {
                }
                m2283CheckoutNoticeText3IgeMak(apQA0X, auraTheme.getColors(bfm, 6).destructiveText, bRg2, bfm, (iA0d << 6) & 896, 0);
            }
            apQA0X = AnonymousClass005.A0X(strA01);
            m2283CheckoutNoticeText3IgeMak(apQA0X, auraTheme.getColors(bfm, 6).destructiveText, bRg2, bfm, (iA0d << 6) & 896, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142151(bRg2, i, i2);
        }
    }

    public static final void PurchasePendingDialog(Function0<Unit> function0, BFM bfm, int i) {
        C7384Etj.A0Y(function0, 0);
        bfm.AgG(1503284943);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0T), bfm, iA0T)) {
            AuraAlertDialogKt.AuraAlertDialog((BRg) null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210b8), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210b7), (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) B1V.A00(bfm, new C142161(function0), 2133043936), function0, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, ((iA0T << 18) & 3670016) | 196608, 0, 1945);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, i);
        }
    }

    public static final void SubscriptionLoadError(HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A10(hatchSubsurface, hatchScreen, function0);
        bfm.AgG(-10958582);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, hatchSubsurface) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass005.A09(bfm, hatchScreen);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA08 |= 3072;
        } else if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0g(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA08), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b19);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = SubscriptionSheetHelpersKt$SubscriptionLoadError$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            HatchScreenErrorStateKt.HatchScreenErrorState(strA01, function0, ARD.A01(bRg2, (G0U) objAaT, false), HatchSurface.MONETIZATION, hatchSubsurface, hatchScreen, null, bfm, AnonymousClass004.A03(iA08 << 12, ((iA08 >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 3072), 64);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142192(hatchSubsurface, hatchScreen, function0, bRg2, i, i2);
        }
    }

    public static final void logCheckoutOutcome(HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, Map<String, String> map, String str, String str2) {
        AnonymousClass005.A0x(hatchSubsurface, hatchScreen, map);
        HatchImpressionLogger hatchImpressionLogger = HatchImpressionLogger.INSTANCE;
        HatchOrigin hatchOrigin = HatchOrigin.MONETIZATION;
        HatchSurface hatchSurface = HatchSurface.MONETIZATION;
        HatchComponent hatchComponent = str != null ? HatchComponent.CHECKOUT_ERROR_DIALOG : str2 != null ? HatchComponent.CHECKOUT_ABANDONED : HatchComponent.CHECKOUT_CONFIRMATION;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.putAll(map);
        if (str != null) {
            AnonymousClass001.A1C(HatchMetadataKey.FAILURE_REASON, str, c0924AIaA0u);
        }
        if (str2 != null) {
            AnonymousClass001.A1C(HatchMetadataKey.RESULT, str2, c0924AIaA0u);
        }
        hatchImpressionLogger.logImpression(hatchOrigin, hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, AIW.A0K(c0924AIaA0u), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Function0<Unit> withAddOnContinuation(SubscriptionAddOnIntegration subscriptionAddOnIntegration, SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint, AuraNavigator auraNavigator, Function0<Unit> function0) {
        AnonymousClass005.A11(subscriptionPaywallEntryPoint, auraNavigator, function0, 1);
        C10543Hqv c10543HqvA0z = C3cG.A0z();
        T t = 0;
        t = 0;
        t = 0;
        if ((subscriptionAddOnIntegration != null && subscriptionAddOnIntegration.isCheckoutEnabled()) || (subscriptionPaywallEntryPoint == SubscriptionPaywallEntryPoint.HOME_LINK_CLAIM && (subscriptionAddOnIntegration = SubscriptionAddOn.INSTANCE.resolveIntegration()) != null && SubscriptionAddOnKt.META_HOME_LINK_CATALOG_TYPE.equals(subscriptionAddOnIntegration.getCatalogType()))) {
            t = subscriptionAddOnIntegration;
        }
        c10543HqvA0z.element = t;
        return t == 0 ? function0 : new C142221(c10543HqvA0z, function0, auraNavigator);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CheckoutNotice.values().length];
            try {
                AnonymousClass002.A13(CheckoutNotice.CANCELED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(CheckoutNotice.FAILED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: CheckoutNoticeText-3IgeMak, reason: not valid java name */
    public static final void m2283CheckoutNoticeText3IgeMak(ApQ apQ, long j, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-377716383);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, apQ) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0N(bfm, j);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1822Arm c1822Arm = C8j4.A0l(bfm).footnoteRegular;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = SubscriptionSheetHelpersKt$CheckoutNoticeText$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2640AuraTextVmYn7U0(apQ, ARD.A01(bRg2, (G0U) objAaT, false), j, c1822Arm, null, null, C3cH.A0F(3), 0L, false, 0, 0, 0, null, null, null, bfm, (iA0d & 14) | ((iA0d << 3) & 896), 0, 32688);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new SubscriptionSheetHelpersKt$CheckoutNoticeText$2(apQ, j, bRg2, i, i2);
        }
    }

    public static final void MockPaymentWarning(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1042908800);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU("Mock payment is for internal testing only and will not result in real payment", AnonymousClass001.A0R(bRg2), auraTheme.getColors(bfm, 6).errorText, auraTheme.getTypography(bfm, 6).caption1Regular, null, null, C3cH.A0F(5), false, 0, 0, 0, null, null, null, bfm, 6, 0, 16304);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142141(bRg2, i, i2);
        }
    }

    public static final void SubscriptionInfoDialog(String str, String str2, BRg bRg, String str3, Function0<Unit> function0, BRg bRg2, Function0<Unit> function02, BFM bfm, int i, int i2) {
        Function0<Unit> function03;
        String strA0e;
        String str4 = str3;
        BRg bRg3 = bRg;
        BRg bRg4 = bRg2;
        AnonymousClass002.A1C(str, 0, function0);
        bfm.AgG(-1871026957);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg3);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str4);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function0);
        }
        int i5 = i2 & 32;
        int iA0i = 196608;
        if (i5 != 0) {
            iA0d |= iA0i;
        } else if ((i & 196608) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg4);
            iA0d |= iA0i;
        }
        int i6 = i2 & 64;
        int iA0Z = 1572864;
        if (i6 != 0) {
            iA0d |= iA0Z;
        } else if ((1572864 & i) == 0) {
            iA0Z = AnonymousClass004.A0Z(bfm, function02);
            iA0d |= iA0Z;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 599187, 599186), bfm, iA0d)) {
            if (i3 != 0) {
                bRg3 = BRg.A00;
            }
            if (i4 != 0) {
                str4 = null;
            }
            if (i5 != 0) {
                bRg4 = BRg.A00;
            }
            function03 = i6 == 0 ? function02 : null;
            if (str4 == null) {
                bfm.AgE(1534403082);
                strA0e = AnonymousClass003.A0e(bfm, R.string._name_removed__res_0x7f1210ca);
            } else {
                AnonymousClass003.A0l(bfm, 1534402586);
                strA0e = str4;
            }
            BRg bRgThen = bRg3.then(bRg4);
            B1U b1uA00 = B1V.A00(bfm, new C142171(strA0e, function03, function0), -592332092);
            int i7 = iA0d << 3;
            AuraAlertDialogKt.AuraAlertDialog(bRgThen, str, str2, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) b1uA00, function0, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, (i7 & 896) | (i7 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 196608 | ((iA0d << 6) & 3670016), 0, 1944);
        } else {
            bfm.Afo();
            function03 = function02;
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142182(str, str2, bRg3, str4, function0, bRg4, function03, i, i2);
        }
    }

    public static final void SubscriptionUnavailableDialog(SubscriptionAttribution subscriptionAttribution, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(subscriptionAttribution, function0);
        bfm.AgG(-1714615777);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, subscriptionAttribution) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AbstractC1798ArH.A07(Boolean.valueOf(zA1b), bfm);
            }
            MutableState mutableState = (MutableState) objAaT;
            boolean zA67 = bfm.A67(subscriptionAttribution);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == obj) {
                objAaT2 = new SubscriptionSheetHelpersKt$SubscriptionUnavailableDialog$1$1(subscriptionAttribution, mutableState);
                BBI.A0T(bfm, objAaT2);
            }
            AuraAlertDialogKt.AuraAlertDialog(BPc.A00(bRg2, EnumC10573Huf.A06, (G0U) objAaT2, 0.0f, 0L), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210c5), (String) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, B1V.A00(bfm, new C142202(function0), 1597224238), function0, (BA2) null, zA1b, zA1b, (G0U<? super String, Unit>) null, bfm, ((iA0T << 15) & 3670016) | 196608, zA1b ? 1 : 0, 1948);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(subscriptionAttribution, function0, bRg2, i, i2);
        }
    }

    public static /* synthetic */ void logCheckoutOutcome$default(HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, Map map, String str, String str2, int i, Object obj) {
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        logCheckoutOutcome(hatchSubsurface, hatchScreen, map, str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object runCatchingResult(X.G0U<? super X.HtJ<? super java.lang.Boolean>, ? extends java.lang.Object> r5, X.HtJ<? super java.lang.Boolean> r6) {
        /*
            boolean r0 = r6 instanceof com.facebook.aura.subscription.view.SubscriptionSheetHelpersKt.C142211
            if (r0 == 0) goto L1e
            r4 = r6
            com.facebook.aura.subscription.view.SubscriptionSheetHelpersKt$runCatchingResult$1 r4 = (com.facebook.aura.subscription.view.SubscriptionSheetHelpersKt.C142211) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L24
            goto L38
        L1e:
            com.facebook.aura.subscription.view.SubscriptionSheetHelpersKt$runCatchingResult$1 r4 = new com.facebook.aura.subscription.view.SubscriptionSheetHelpersKt$runCatchingResult$1
            r4.<init>(r6)
            goto L12
        L24:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L46
            r4.label = r1     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L46
            java.lang.Object r3 = r5.invoke(r4)     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L46
            if (r3 != r2) goto L3b
            return r2
        L38:
            X.Hwg.A00(r3)     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L46
        L3b:
            boolean r0 = X.AnonymousClass001.A1X(r3)     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L46
            goto L41
        L40:
            r0 = 0
        L41:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L46:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.view.SubscriptionSheetHelpersKt.runCatchingResult(X.G0U, X.HtJ):java.lang.Object");
    }

    /* renamed from: SubscriptionSheetBackground--orJrPs, reason: not valid java name */
    public static final void m2284SubscriptionSheetBackgroundorJrPs(float f, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-131349984);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA04 |= 48;
        } else if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 19, 18), bfm, iA04)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            C1b8.A04(bfm, C10G.A04(AnonymousClass001.A0R(bRg), f), C3cH.A0W(bfm).secondaryButtonBackground);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new SubscriptionSheetHelpersKt$SubscriptionSheetBackground$1(f, bRg, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* renamed from: optOutMessage-Iv8Zu3U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.ApQ m2286optOutMessageIv8Zu3U(long r10, X.C0jP r12, X.BFM r13, int r14) {
        /*
            r0 = 1599303851(0x5f5370ab, float:1.5235866E19)
            r13.AgE(r0)
            com.facebook.aura.utils.HatchUtil r2 = com.facebook.aura.utils.HatchUtil.INSTANCE
            java.lang.String r6 = r2.getSubscriptionOptOutDisclaimer()
            boolean r1 = X.C7BY.A0j(r6)
            r0 = 0
            if (r1 != 0) goto L79
            java.lang.String r2 = r2.getSubscriptionOptOutWorkplaceGroupUrl()
            boolean r0 = X.C7BY.A0j(r2)
            if (r0 != 0) goto L75
            java.lang.String r7 = "workplace group"
            r3 = 0
            boolean r0 = X.C7BY.A0q(r6, r7, r3)
            if (r0 == 0) goto L75
            boolean r5 = X.AnonymousClass003.A1K(r13, r6, r2)
            r0 = r14 & 14
            r0 = r0 ^ 6
            r4 = 4
            r8 = r10
            if (r0 <= r4) goto L38
            boolean r0 = r13.A64(r10)
            if (r0 != 0) goto L3d
        L38:
            r1 = r14 & 6
            r0 = 0
            if (r1 != r4) goto L3e
        L3d:
            r0 = 1
        L3e:
            r5 = r5 | r0
            r0 = r14 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            if (r0 <= r1) goto L4d
            boolean r0 = r13.A65(r12)
            if (r0 != 0) goto L51
        L4d:
            r0 = r14 & 48
            if (r0 != r1) goto L52
        L51:
            r3 = 1
        L52:
            r5 = r5 | r3
            java.lang.Object r1 = r13.AaT()
            if (r5 != 0) goto L5d
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L6f
        L5d:
            com.facebook.aura.subscription.view.SubscriptionSheetHelpersKt$optOutMessage$1$1 r11 = new com.facebook.aura.subscription.view.SubscriptionSheetHelpersKt$optOutMessage$1$1
            r11.<init>(r12, r2)
            r0 = 11
            java.lang.String r10 = X.BV3.A00(r0)
            X.ApQ r1 = com.facebook.aura.linktext.HatchInlineLinkTextKt.m1187buildInlineLinkTextXOJAsU(r6, r7, r8, r10, r11)
            r13.Ai0(r1)
        L6f:
            X.ApQ r1 = (X.ApQ) r1
            X.AnonymousClass002.A19(r13)
            return r1
        L75:
            X.ApQ r0 = X.AnonymousClass005.A0X(r6)
        L79:
            X.AnonymousClass002.A19(r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.view.SubscriptionSheetHelpersKt.m2286optOutMessageIv8Zu3U(long, X.0jP, X.BFM, int):X.ApQ");
    }

    public static final G0U<String, Unit> rememberDismissToast(BFM bfm, int i) {
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT == obj) {
            objAaT = AbstractC1798ArH.A07(null, bfm);
        }
        MutableState mutableState = (MutableState) objAaT;
        Unit unit = Unit.INSTANCE;
        Object objAaT2 = bfm.AaT();
        if (objAaT2 == obj) {
            objAaT2 = new SubscriptionSheetHelpersKt$rememberDismissToast$1$1(mutableState);
            BBI.A0T(bfm, objAaT2);
        }
        AnonymousClass001.A17(bfm, objAaT2, unit);
        Object objAaT3 = bfm.AaT();
        if (objAaT3 == obj) {
            objAaT3 = new SubscriptionSheetHelpersKt$rememberDismissToast$2$1(mutableState);
            BBI.A0T(bfm, objAaT3);
        }
        return (G0U) objAaT3;
    }

    public static final C1822Arm subscriptionCtaTextStyle(BFM bfm, int i) {
        return C1822Arm.A00(null, C8j4.A0l(bfm).subheadlineMedium, null, null, null, null, null, null, null, null, 0, 0, 0, 16646015, 0L, 0L, C19U.A03(0), C60Q.A04());
    }
}
