package com.facebook.aura.ccv.nativeflow.ui;

import X.AFz;
import X.AKL;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00r;
import X.C1BO;
import X.C1er;
import X.C2CK;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionLogger;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.ccv.HatchAccountLinkingTarget;
import com.facebook.aura.ccv.nativeflow.HatchCheckoutUnavailableReason;
import com.facebook.aura.ccv.nativeflow.HatchLinkableAccountType;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class HatchCcvCardEntryHostKt {

    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryHostKt$HatchAgeLinkingLauncher$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Boolean> $canLaunch;
        public final /* synthetic */ Function0<Unit> $onOptionsChanged;
        public final /* synthetic */ Function0<Unit> $onRefreshAfterLinking;
        public final /* synthetic */ HatchAgeLinkingViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HatchAgeLinkingViewModel hatchAgeLinkingViewModel, Function0<Boolean> function0, Function0<Unit> function02, Function0<Unit> function03, int i) {
            super(2);
            this.$viewModel = hatchAgeLinkingViewModel;
            this.$canLaunch = function0;
            this.$onRefreshAfterLinking = function02;
            this.$onOptionsChanged = function03;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCcvCardEntryHostKt.HatchAgeLinkingLauncher(this.$viewModel, this.$canLaunch, this.$onRefreshAfterLinking, this.$onOptionsChanged, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$26, reason: invalid class name */
    public final class AnonymousClass26 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onAgeVerified;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onDismissed;
        public final /* synthetic */ Function0<Unit> $onLogOutConfirmationDismissed;
        public final /* synthetic */ Function0<Unit> $onRefreshAfterLinking;
        public final /* synthetic */ Function0<Unit> $onSettingsClick;
        public final /* synthetic */ boolean $showsLogOutConfirmation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass26(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, boolean z, Function0<Unit> function06, BRg bRg, int i, int i2) {
            super(2);
            this.$onAgeVerified = function0;
            this.$onDismissed = function02;
            this.$onSettingsClick = function03;
            this.$onRefreshAfterLinking = function04;
            this.$onBack = function05;
            this.$showsLogOutConfirmation = z;
            this.$onLogOutConfirmationDismissed = function06;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCcvCardEntryHostKt.HatchCcvCardEntryHost(this.$onAgeVerified, this.$onDismissed, this.$onSettingsClick, this.$onRefreshAfterLinking, this.$onBack, this.$showsLogOutConfirmation, this.$onLogOutConfirmationDismissed, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchAgeLinkingLauncher(HatchAgeLinkingViewModel hatchAgeLinkingViewModel, Function0<Boolean> function0, Function0<Unit> function02, Function0<Unit> function03, BFM bfm, int i) {
        C7384Etj.A0Y(hatchAgeLinkingViewModel, 0);
        AnonymousClass005.A11(function0, function02, function03, 1);
        bfm.AgG(1762889963);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchAgeLinkingViewModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function02);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function03);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            Context contextA0H = AnonymousClass002.A0H(bfm);
            Activity activity = (Activity) bfm.A6v(AKL.A00);
            int i2 = iA05 & 14;
            boolean zA67 = bfm.A67(activity) | (i2 == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchAgeLinkingViewModel)));
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchCcvCardEntryHostKt$HatchAgeLinkingLauncher$1$1(activity, hatchAgeLinkingViewModel);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, hatchAgeLinkingViewModel);
            MutableState mutableStateA00 = C1er.A00(bfm, function0);
            MutableState mutableStateA002 = C1er.A00(bfm, function02);
            MutableState mutableStateA003 = C1er.A00(bfm, function03);
            C1BO c1boA02 = C2CK.A02(bfm, hatchAgeLinkingViewModel.state);
            int i3 = ((HatchAgeLinkingState) c1boA02.getValue()).optionsVersion;
            Object[] objArr = new Object[0];
            boolean zA63 = bfm.A63(i3);
            Object objAaT2 = bfm.AaT();
            if (zA63 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchCcvCardEntryHostKt$HatchAgeLinkingLauncher$consumedOptionsVersion$2$1(i3);
                bfm.Ai0(objAaT2);
            }
            C00r c00r = (C00r) AFz.A03(bfm, (Function0) objAaT2, objArr);
            Integer numValueOf = Integer.valueOf(i3);
            boolean zA1P = AnonymousClass003.A1P(bfm, c00r, mutableStateA003, bfm.A63(i3));
            Object objAaT3 = bfm.AaT();
            if (zA1P || objAaT3 == C78N.A00) {
                objAaT3 = new HatchCcvCardEntryHostKt$HatchAgeLinkingLauncher$2$1(i3, c00r, mutableStateA003, null);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A18(bfm, objAaT3, numValueOf);
            HatchLinkableAccountType hatchLinkableAccountType = ((HatchAgeLinkingState) c1boA02.getValue()).launch;
            boolean zA1W = AnonymousClass005.A1W(bfm, contextA0H, mutableStateA002, mutableStateA003, AnonymousClass001.A1R(bfm, mutableStateA00, bfm.A63(AnonymousClass003.A0K(hatchLinkableAccountType))) | (i2 == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchAgeLinkingViewModel))));
            Object objAaT4 = bfm.AaT();
            if (zA1W || objAaT4 == C78N.A00) {
                objAaT4 = new HatchCcvCardEntryHostKt$HatchAgeLinkingLauncher$3$1(hatchLinkableAccountType, hatchAgeLinkingViewModel, contextA0H, mutableStateA00, mutableStateA002, mutableStateA003, null);
                bfm.Ai0(objAaT4);
            }
            AnonymousClass001.A18(bfm, objAaT4, hatchLinkableAccountType);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(hatchAgeLinkingViewModel, function0, function02, function03, i);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchLinkableAccountType.values().length];
            try {
                AnonymousClass002.A13(HatchLinkableAccountType.INSTAGRAM, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchLinkableAccountType.FACEBOOK, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchCcvCardEntryHost(kotlin.jvm.functions.Function0<kotlin.Unit> r61, kotlin.jvm.functions.Function0<kotlin.Unit> r62, kotlin.jvm.functions.Function0<kotlin.Unit> r63, kotlin.jvm.functions.Function0<kotlin.Unit> r64, kotlin.jvm.functions.Function0<kotlin.Unit> r65, boolean r66, kotlin.jvm.functions.Function0<kotlin.Unit> r67, X.BRg r68, X.BFM r69, int r70, int r71) {
        /*
            Method dump skipped, instructions count: 1221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryHostKt.HatchCcvCardEntryHost(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    public static final void logCcvClick(HatchComponent hatchComponent) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.AGE_CONFIRMATION, null, HatchScreen.CCV_SCREEN, hatchComponent, null, null, null);
    }

    public static final void logCcvDismiss(HatchComponent hatchComponent) {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.AGE_CONFIRMATION, null, HatchScreen.CCV_SCREEN, hatchComponent, null, null);
    }

    public static final void logCcvImpression(HatchComponent hatchComponent, Map<String, String> map) {
        HatchImpressionLogger.INSTANCE.logImpression(HatchOrigin.HATCH, HatchSurface.AGE_CONFIRMATION, null, HatchScreen.CCV_SCREEN, hatchComponent, null, map, null);
    }

    public static /* synthetic */ void logCcvImpression$default(HatchComponent hatchComponent, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        logCcvImpression(hatchComponent, map);
    }

    public static final void logCcvOutcome(HatchCcvFormOutcome hatchCcvFormOutcome, String str, HatchCheckoutUnavailableReason hatchCheckoutUnavailableReason) {
        logCcvImpression(HatchComponent.AGE_CONFIRMATION_OUTCOME, AnonymousClass006.A10(HatchMetadataKey.RESULT.getValue(), hatchCcvFormOutcome.getResult()));
        HatchCcvLogging.INSTANCE.logFormOutcome(hatchCcvFormOutcome, str, hatchCheckoutUnavailableReason);
    }

    public static /* synthetic */ void logCcvOutcome$default(HatchCcvFormOutcome hatchCcvFormOutcome, String str, HatchCheckoutUnavailableReason hatchCheckoutUnavailableReason, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchCheckoutUnavailableReason = null;
        }
        logCcvOutcome(hatchCcvFormOutcome, str, hatchCheckoutUnavailableReason);
    }

    public static final /* synthetic */ HatchCcvUiState access$HatchCcvCardEntryHost$lambda$0(C1BO c1bo) {
        return (HatchCcvUiState) c1bo.getValue();
    }

    public static final HatchAccountLinkingTarget linkingTarget(HatchLinkableAccountType hatchLinkableAccountType) {
        int iOrdinal = hatchLinkableAccountType.ordinal();
        if (iOrdinal == 0) {
            return HatchAccountLinkingTarget.INSTAGRAM;
        }
        if (iOrdinal == 1) {
            return HatchAccountLinkingTarget.FACEBOOK;
        }
        throw C3cG.A0q();
    }
}
