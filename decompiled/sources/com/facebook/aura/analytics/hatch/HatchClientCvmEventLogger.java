package com.facebook.aura.analytics.hatch;

import X.AbstractC6676EOt;
import X.AbstractC7559F3s;
import X.AbstractC8150FWo;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFI;
import X.BV4;
import X.BV5;
import X.BV6;
import X.BV7;
import X.C3cG;
import X.C3cH;
import X.C4lm;
import X.C60O;
import X.C7384Etj;
import X.EOv;
import X.EOx;
import X.EVK;
import X.EVO;
import X.EnumC7420EvW;
import X.Eu0;
import X.Eu1;
import X.Ey9;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchVmLoggingContext;
import com.facebook.aura.common.HatchCvmChipPinPurpose;
import com.facebook.aura.utils.HatchUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class HatchClientCvmEventLogger {
    public static final int $stable = 0;
    public static final HatchClientCvmEventLogger INSTANCE = new HatchClientCvmEventLogger();
    public static final Set<EVK> VM_ATTRIBUTED_EVENT_NAMES = BFI.A0H(new EVK[]{EVK.A05, EVK.A0L});
    public static final AtomicBoolean pendingClientOpen = BV4.A12(false);
    public static final AtomicBoolean pendingForeground = BV4.A12(false);
    public static final AtomicReference<CvmRun> downgradeRun = BV5.A1A();

    /* renamed from: com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger$logConnectVm$1, reason: invalid class name and case insensitive filesystem */
    public final class C109031 extends AbstractC7559F3s implements G0U<EOv, Unit> {
        public final /* synthetic */ C4lm $vmState;

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(EOv eOv) {
            C7384Etj.A0Y(eOv, 0);
            C4lm c4lm = this.$vmState;
            if (c4lm != null) {
                ((AbstractC6676EOt) eOv).A00(c4lm, "vm_state");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109031(C4lm c4lm) {
            super(1);
            this.$vmState = c4lm;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(EOv eOv) {
            invoke2(eOv);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger$logTimeSpentBitArray$1, reason: invalid class name and case insensitive filesystem */
    public final class C109041 extends AbstractC7559F3s implements G0U<EOv, Unit> {
        public final /* synthetic */ long $sessionId;
        public final /* synthetic */ long $startTimeSec;
        public final /* synthetic */ int[] $tosArray;
        public final /* synthetic */ int $tosLen;

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(EOv eOv) {
            C7384Etj.A0Y(eOv, 0);
            AbstractC6676EOt abstractC6676EOt = (AbstractC6676EOt) eOv;
            abstractC6676EOt.A02("client_session_id", Long.valueOf(this.$sessionId));
            abstractC6676EOt.A02("tos_start_time", Long.valueOf(this.$startTimeSec));
            int length = this.$tosArray.length;
            ArrayList arrayListA11 = C60O.A11(length);
            for (int i = 0; i < length; i++) {
                BV6.A1R(arrayListA11, r5[i]);
            }
            abstractC6676EOt.A00.A42("tos_array", arrayListA11);
            abstractC6676EOt.A02("tos_len", Long.valueOf(this.$tosLen));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109041(long j, long j2, int[] iArr, int i) {
            super(1);
            this.$sessionId = j;
            this.$startTimeSec = j2;
            this.$tosArray = iArr;
            this.$tosLen = i;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(EOv eOv) {
            invoke2(eOv);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger$logTimeSpentMarker$1, reason: invalid class name and case insensitive filesystem */
    public final class C109051 extends AbstractC7559F3s implements G0U<EOv, Unit> {
        public final /* synthetic */ long $sessionId;

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(EOv eOv) {
            C7384Etj.A0Y(eOv, 0);
            ((AbstractC6676EOt) eOv).A02("client_session_id", Long.valueOf(this.$sessionId));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109051(long j) {
            super(1);
            this.$sessionId = j;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(EOv eOv) {
            invoke2(eOv);
            return Unit.INSTANCE;
        }
    }

    private final void logTimeSpentMarker(EVK evk, CvmAttribution cvmAttribution) {
        Long lTimeSpentSessionId = timeSpentSessionId(cvmAttribution);
        if (lTimeSpentSessionId != null) {
            log(evk, cvmAttribution, null, null, new C109051(lTimeSpentSessionId.longValue()));
        }
    }

    public final void logAppStartup(HatchClientCvmOutcome hatchClientCvmOutcome) {
        C7384Etj.A0Y(hatchClientCvmOutcome, 0);
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A01, cvmAttribution, toEventResult(hatchClientCvmOutcome), null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logConnectVm(HatchClientCvmOutcome hatchClientCvmOutcome) {
        C7384Etj.A0Y(hatchClientCvmOutcome, 0);
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            String strFetchedVmState = HatchVmLoggingContext.INSTANCE.fetchedVmState(cvmAttribution.vmId);
            log(EVK.A05, cvmAttribution, toEventResult(hatchClientCvmOutcome), null, new C109031(strFetchedVmState != null ? toLogValue(strFetchedVmState) : null));
        }
    }

    public final void logCvmAccessErrorView() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A06, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logCvmActivationComplete() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A07, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logCvmDowngrade(HatchClientCvmOutcome hatchClientCvmOutcome) {
        CvmRun cvmRun;
        int iA0E = AnonymousClass001.A0E(hatchClientCvmOutcome, 0);
        if (iA0E == 0) {
            CvmAttribution cvmAttribution = cvmAttribution();
            if (cvmAttribution == null) {
                return;
            }
            cvmRun = new CvmRun(cvmAttribution, HatchClientCvmUuid.INSTANCE.getOrCreate());
            if (!INSTANCE.openDowngradeRun(cvmRun)) {
                return;
            }
        } else {
            if (iA0E != 1 && iA0E != 2) {
                throw C3cG.A0q();
            }
            cvmRun = takeDowngradeRun();
            if (cvmRun == null) {
                return;
            }
        }
        log(EVK.A08, cvmRun.vm, toEventResult(hatchClientCvmOutcome), cvmRun.clientCvmUuid, AnonymousClass1.INSTANCE);
    }

    public final void logCvmDowngradeRefused() {
        CvmRun cvmRunTakeDowngradeRun = takeDowngradeRun();
        if (cvmRunTakeDowngradeRun != null) {
            EVK evk = EVK.A0X;
            CvmAttribution cvmAttribution = cvmRunTakeDowngradeRun.vm;
            String str = cvmRunTakeDowngradeRun.clientCvmUuid;
            AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
            log(evk, cvmAttribution, null, str, anonymousClass1);
            log(EVK.A08, cvmRunTakeDowngradeRun.vm, toEventResult(HatchClientCvmOutcome.FAILURE), cvmRunTakeDowngradeRun.clientCvmUuid, anonymousClass1);
        }
    }

    public final void logCvmEncryptionSettingsView() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0A, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logCvmReadyConfirmClick() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0E, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logCvmReadyView() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0F, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logCvmReplacementChipBid(HatchClientCvmOutcome hatchClientCvmOutcome) {
        C7384Etj.A0Y(hatchClientCvmOutcome, 0);
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0G, cvmAttribution, toEventResult(hatchClientCvmOutcome), null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logCvmReplacementChipBudgetExhausted(HatchClientCvmChipBudget hatchClientCvmChipBudget, String str) {
        C7384Etj.A0Y(hatchClientCvmChipBudget, 0);
        logChipBudget(EVK.A0H, hatchClientCvmChipBudget, str);
    }

    public final void logCvmReplacementChipSubmitted(HatchClientCvmChipBudget hatchClientCvmChipBudget, String str) {
        C7384Etj.A0Y(hatchClientCvmChipBudget, 0);
        EVK evk = EVK.A0K;
        if (str == null || !AnonymousClass002.A1b(hatchClientCvmChipBudget.isOverBudget, true)) {
            str = null;
        }
        logChipBudget(evk, hatchClientCvmChipBudget, str);
    }

    public final void logCvmReplacementPushReceived() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0L, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logCvmReplacementUnlock(HatchClientCvmOutcome hatchClientCvmOutcome) {
        C7384Etj.A0Y(hatchClientCvmOutcome, 0);
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0M, cvmAttribution, toEventResult(hatchClientCvmOutcome), null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logCvmSwitchStartFreshCompleted() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0a, cvmAttribution, Eu0.SUCCESS, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logCvmSwitchStartFreshFailed() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0a, cvmAttribution, Eu0.FAILURE, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logCvmSwitchTransferCompleted() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0b, cvmAttribution, Eu0.SUCCESS, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logCvmSwitchTransferFailed() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0b, cvmAttribution, Eu0.FAILURE, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logEncryptionSettingsClick() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A09, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logHelpClick() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0B, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logLogoutClick() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0C, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logRecoveryPinChange(HatchClientCvmOutcome hatchClientCvmOutcome) {
        C7384Etj.A0Y(hatchClientCvmOutcome, 0);
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0i, cvmAttribution, toEventResult(hatchClientCvmOutcome), null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logRecoveryPinChangeClick() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0j, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logRecoveryPinCreate(HatchClientCvmOutcome hatchClientCvmOutcome) {
        C7384Etj.A0Y(hatchClientCvmOutcome, 0);
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0k, cvmAttribution, toEventResult(hatchClientCvmOutcome), null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logRecoveryPinHelpView() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0l, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logRecoveryPinLogoutClick() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0m, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logRecoveryPinLookupFailedView() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0n, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logRecoveryPinReminderVerify(HatchClientCvmOutcome hatchClientCvmOutcome) {
        C7384Etj.A0Y(hatchClientCvmOutcome, 0);
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0p, cvmAttribution, toEventResult(hatchClientCvmOutcome), null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logRecoveryPinReminderView() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0q, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logRecoveryPinReset(HatchClientCvmOutcome hatchClientCvmOutcome) {
        C7384Etj.A0Y(hatchClientCvmOutcome, 0);
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0r, cvmAttribution, toEventResult(hatchClientCvmOutcome), null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logRecoveryPinResetClick() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0s, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logRecoveryPinVerify(HatchClientCvmOutcome hatchClientCvmOutcome) {
        C7384Etj.A0Y(hatchClientCvmOutcome, 0);
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0t, cvmAttribution, toEventResult(hatchClientCvmOutcome), null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logSendMessage() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0u, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logSubscriptionEndedContinueClick() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0N, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logSubscriptionEndedRenewClick() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0O, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logSubscriptionEndedView() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0P, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logSwitchBackClick() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0Q, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logSwitchBackDeleteCancelClick() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0R, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logSwitchBackDismissClick() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0S, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logSwitchBackDownloadClick() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0T, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logSwitchBackKeepDataClick() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0U, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logSwitchBackKeepDataOptionClick() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0V, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logSwitchBackLearnMoreClick() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0W, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logSwitchBackStartFreshClick() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0Y, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logSwitchBackStartFreshOptionClick() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0Z, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logTabClick(HatchClientCvmTab hatchClientCvmTab) {
        C7384Etj.A0Y(hatchClientCvmTab, 0);
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(toEventName(hatchClientCvmTab), cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logTimeSpentBitArray(long j, int[] iArr, int i) {
        Long lTimeSpentSessionId;
        C7384Etj.A0Y(iArr, 1);
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution == null || (lTimeSpentSessionId = timeSpentSessionId(cvmAttribution)) == null) {
            return;
        }
        log(EVK.A0w, cvmAttribution, null, null, new C109041(lTimeSpentSessionId.longValue(), j, iArr, i));
    }

    public final void logVoiceDictation(HatchClientCvmOutcome hatchClientCvmOutcome) {
        C7384Etj.A0Y(hatchClientCvmOutcome, 0);
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A0z, cvmAttribution, toEventResult(hatchClientCvmOutcome), null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logWebMediaToggle(boolean z) {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(z ? EVK.A0c : EVK.A0d, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logWhatsAppConnect(HatchClientCvmOutcome hatchClientCvmOutcome) {
        C7384Etj.A0Y(hatchClientCvmOutcome, 0);
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A10, cvmAttribution, toEventResult(hatchClientCvmOutcome), null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logWhatsAppUpdateClick() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A11, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    public final void logWhatsAppUpdatePromptView() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            log(EVK.A12, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
        }
    }

    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class EntriesMappings {
        public static final /* synthetic */ Ey9<C4lm> entries$0;

        static {
            C4lm[] c4lmArrValues = C4lm.values();
            C7384Etj.A0Y(c4lmArrValues, 0);
            entries$0 = C3cG.A0w(c4lmArrValues);
        }
    }

    /* loaded from: classes.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[HatchClientCvmOutcome.values().length];
            try {
                AnonymousClass005.A0v(HatchClientCvmOutcome.ATTEMPT, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(HatchClientCvmOutcome.SUCCESS, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(HatchClientCvmOutcome.FAILURE, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HatchClientCvmTab.values().length];
            try {
                AnonymousClass005.A0v(HatchClientCvmTab.CHAT, iArr2, 1);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass005.A0v(HatchClientCvmTab.CONNECTIONS, iArr2, 2);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass005.A0v(HatchClientCvmTab.FEED, iArr2, 3);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass002.A16(HatchClientCvmTab.GOALS, iArr2);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass002.A17(HatchClientCvmTab.IDEAS, iArr2);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass002.A18(HatchClientCvmTab.LIBRARY, iArr2);
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[HatchCvmChipPinPurpose.values().length];
            try {
                AnonymousClass005.A0v(HatchCvmChipPinPurpose.HARD_REPLACEMENT, iArr3, 1);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass005.A0v(HatchCvmChipPinPurpose.PROVISIONING, iArr3, 2);
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* renamed from: com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger$log$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<EOv, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(EOv eOv) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(EOv eOv) {
        }
    }

    private final CvmAttribution cvmAttribution() {
        return toCvmAttribution(HatchVmLoggingContext.INSTANCE.snapshot());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void log$default(HatchClientCvmEventLogger hatchClientCvmEventLogger, EVK evk, CvmAttribution cvmAttribution, Eu0 eu0, String str, G0U g0u, int i, Object obj) {
        if ((i & 4) != 0) {
            eu0 = null;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            g0u = AnonymousClass1.INSTANCE;
        }
        hatchClientCvmEventLogger.log(evk, cvmAttribution, eu0, str, g0u);
    }

    private final boolean openDowngradeRun(final CvmRun cvmRun) {
        return AnonymousClass002.A1Z(downgradeRun.updateAndGet(new UnaryOperator() { // from class: com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger.openDowngradeRun.1
            @Override // java.util.function.Function
            public final CvmRun apply(CvmRun cvmRun2) {
                if (cvmRun2 != null) {
                    if (cvmRun2.vm.sessionGeneration == cvmRun.vm.sessionGeneration) {
                        return cvmRun2;
                    }
                }
                return cvmRun;
            }
        }), cvmRun);
    }

    private final CvmRun takeDowngradeRun() {
        CvmRun andSet = downgradeRun.getAndSet(null);
        if (andSet == null || andSet.vm.sessionGeneration != HatchVmLoggingContext.INSTANCE.snapshot().sessionGeneration) {
            return null;
        }
        return andSet;
    }

    private final Long timeSpentSessionId(CvmAttribution cvmAttribution) {
        return HatchVmLoggingContext.INSTANCE.timeSpentSessionId(cvmAttribution.vmId, cvmAttribution.sessionGeneration);
    }

    private final CvmAttribution toCvmAttribution(HatchVmLoggingContext.Attribution attribution) {
        String str = attribution.vmId;
        if (!AnonymousClass002.A1b(attribution.isCvm, true) || str == null) {
            return null;
        }
        return new CvmAttribution(str, attribution.vmHostname, attribution.sessionGeneration);
    }

    private final C4lm toLogValue(String str) {
        C4lm next;
        Iterator<C4lm> it = EntriesMappings.entries$0.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.name().equals(str)) {
                break;
            }
        }
        C4lm c4lm = next;
        return c4lm == null ? C4lm.UNKNOWN : c4lm;
    }

    private final EVO toStruct(HatchClientCvmChipBudget hatchClientCvmChipBudget) {
        EVO evo = new EVO();
        evo.A03(toLogValue(hatchClientCvmChipBudget.budgetType), "budget_type");
        AbstractC8150FWo.A02(evo, "budget_chips_spent", Long.valueOf(hatchClientCvmChipBudget.budgetChipsSpent));
        AbstractC8150FWo.A02(evo, "budget_chips_limit", Long.valueOf(hatchClientCvmChipBudget.budgetChipsLimit));
        Boolean boolValueOf = Boolean.valueOf(hatchClientCvmChipBudget.isTryAgain);
        Map<String, Object> map = evo.A00;
        map.put("is_try_again", boolValueOf);
        Integer num = hatchClientCvmChipBudget.chipsSubmittedCount;
        AbstractC8150FWo.A02(evo, "chips_submitted_count", num != null ? BV7.A0p(num) : null);
        Integer num2 = hatchClientCvmChipBudget.chipsDrawnCount;
        AbstractC8150FWo.A02(evo, "chips_drawn_count", num2 != null ? BV7.A0p(num2) : null);
        map.put("is_over_budget", hatchClientCvmChipBudget.isOverBudget);
        map.put("is_rebid", hatchClientCvmChipBudget.isRebid);
        Integer num3 = hatchClientCvmChipBudget.rememberedChipsCount;
        AbstractC8150FWo.A02(evo, "remembered_chips_count", num3 != null ? BV7.A0p(num3) : null);
        return evo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final EOv withInternalTraffic(EOv eOv) {
        AbstractC6676EOt abstractC6676EOt = (AbstractC6676EOt) eOv;
        abstractC6676EOt.A00.A3P("is_employee", Boolean.valueOf(HatchUtil.INSTANCE.isViewerEmployee()));
        abstractC6676EOt.A00.A3P("is_internal_build", AnonymousClass001.A0h());
        return eOv;
    }

    public final void logClientOpen() {
        AtomicBoolean atomicBoolean = pendingClientOpen;
        atomicBoolean.set(true);
        HatchVmLoggingContext.Attribution attributionSnapshot = HatchVmLoggingContext.INSTANCE.snapshot();
        if (AnonymousClass002.A1b(attributionSnapshot.isCvm, false)) {
            atomicBoolean.set(false);
            return;
        }
        CvmAttribution cvmAttribution = toCvmAttribution(attributionSnapshot);
        if (cvmAttribution == null || !atomicBoolean.compareAndSet(true, false)) {
            return;
        }
        log(EVK.A03, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
    }

    public final void logCvmReplacementChipBudgetSettingsClick() {
        logChipBudget(EVK.A0I, null, null);
    }

    public final void logCvmReplacementChipBudgetSupportClick() {
        logChipBudget(EVK.A0J, null, null);
    }

    public final void logPendingAppOpen() {
        HatchVmLoggingContext.Attribution attributionSnapshot = HatchVmLoggingContext.INSTANCE.snapshot();
        if (AnonymousClass002.A1b(attributionSnapshot.isCvm, false)) {
            pendingForeground.set(false);
            pendingClientOpen.set(false);
        }
        CvmAttribution cvmAttribution = toCvmAttribution(attributionSnapshot);
        if (cvmAttribution != null) {
            if (pendingForeground.compareAndSet(true, false)) {
                logTimeSpentMarker(EVK.A0x, cvmAttribution);
            }
            if (pendingClientOpen.compareAndSet(true, false)) {
                log(EVK.A03, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
            }
        }
    }

    public final void logTimeSpentBackground() {
        pendingForeground.set(false);
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            logTimeSpentMarker(EVK.A0v, cvmAttribution);
        }
    }

    public final void logTimeSpentForeground() {
        AtomicBoolean atomicBoolean = pendingForeground;
        atomicBoolean.set(true);
        HatchVmLoggingContext.Attribution attributionSnapshot = HatchVmLoggingContext.INSTANCE.snapshot();
        if (AnonymousClass002.A1b(attributionSnapshot.isCvm, false)) {
            atomicBoolean.set(false);
            return;
        }
        CvmAttribution cvmAttribution = toCvmAttribution(attributionSnapshot);
        if (cvmAttribution == null || !atomicBoolean.compareAndSet(true, false)) {
            return;
        }
        logTimeSpentMarker(EVK.A0x, cvmAttribution);
    }

    public final void onAppBackgrounded() {
        pendingClientOpen.set(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void log(X.EVK r4, com.facebook.aura.analytics.hatch.CvmAttribution r5, X.Eu0 r6, java.lang.String r7, X.G0U<? super X.EOv, kotlin.Unit> r8) {
        /*
            r3 = this;
            X.8ee r1 = X.C3cH.A0I()
            java.lang.String r0 = "hatch_client_cvm_event"
            X.Eu1 r0 = r1.acquireEvent(r0)
            X.EOx r2 = new X.EOx
            r2.<init>()
            r2.A00 = r0
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L46
            java.lang.String r0 = "event_name"
            r2.A00(r4, r0)
            r3.withInternalTraffic(r2)
            java.util.Set<X.EVK> r0 = com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger.VM_ATTRIBUTED_EVENT_NAMES
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L47
            java.lang.String r1 = r5.vmId
            java.lang.String r0 = "vm_id"
            r2.A03(r0, r1)
            java.lang.String r7 = r5.vmHostname
            if (r7 == 0) goto L39
            java.lang.String r0 = "vm_hostname"
        L36:
            r2.A03(r0, r7)
        L39:
            if (r6 == 0) goto L40
            java.lang.String r0 = "event_result"
            r2.A00(r6, r0)
        L40:
            r8.invoke(r2)
            r2.APu()
        L46:
            return
        L47:
            if (r7 != 0) goto L4f
            com.facebook.aura.analytics.hatch.HatchClientCvmUuid r0 = com.facebook.aura.analytics.hatch.HatchClientCvmUuid.INSTANCE
            java.lang.String r7 = r0.getOrCreate()
        L4f:
            java.lang.String r0 = "client_cvm_uuid"
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger.log(X.EVK, com.facebook.aura.analytics.hatch.CvmAttribution, X.Eu0, java.lang.String, X.G0U):void");
    }

    private final void logChipBudget(EVK evk, HatchClientCvmChipBudget hatchClientCvmChipBudget, String str) {
        String str2;
        Eu1 eu1AcquireEvent = C3cH.A0I().acquireEvent("hatch_client_cvm_event");
        EOx eOx = new EOx();
        eOx.A00 = eu1AcquireEvent;
        if (eu1AcquireEvent.isSampled()) {
            eOx.A00(evk, "event_name");
            withInternalTraffic(eOx);
            if (hatchClientCvmChipBudget != null) {
                eOx.A01(INSTANCE.toStruct(hatchClientCvmChipBudget), "chip_budget");
            }
            if (str == null) {
                if (AnonymousClass002.A1b(HatchVmLoggingContext.INSTANCE.snapshot().isCvm, true)) {
                    str = HatchClientCvmUuid.INSTANCE.getOrCreate();
                    str2 = HatchClientCvmUuid.KEY_UUID;
                }
                eOx.APu();
            }
            str2 = "vm_id";
            eOx.A03(str2, str);
            eOx.APu();
        }
    }

    private final EVK toEventName(HatchClientCvmTab hatchClientCvmTab) {
        switch (hatchClientCvmTab.ordinal()) {
            case 0:
                return EVK.A02;
            case 1:
                return EVK.A04;
            case 2:
                return EVK.A0e;
            case 3:
                return EVK.A0f;
            case 4:
                return EVK.A0g;
            case 5:
                return EVK.A0h;
            default:
                throw C3cG.A0q();
        }
    }

    private final Eu0 toEventResult(HatchClientCvmOutcome hatchClientCvmOutcome) {
        int iOrdinal = hatchClientCvmOutcome.ordinal();
        if (iOrdinal == 0) {
            return Eu0.ATTEMPT;
        }
        if (iOrdinal == 1) {
            return Eu0.SUCCESS;
        }
        if (iOrdinal == 2) {
            return Eu0.FAILURE;
        }
        throw C3cG.A0q();
    }

    public final String currentCvmVmId() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            return cvmAttribution.vmId;
        }
        return null;
    }

    public final void logCvmMaintenanceView(String str, AtomicReference<String> atomicReference) {
        AnonymousClass003.A0u(str, atomicReference);
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution == null || C7384Etj.areEqual(atomicReference.getAndSet(str), str)) {
            return;
        }
        log(EVK.A0D, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
    }

    public final void logRecoveryPinReminderPromptView(String str, AtomicReference<String> atomicReference) {
        AnonymousClass003.A0u(str, atomicReference);
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution == null || C7384Etj.areEqual(atomicReference.getAndSet(str), str)) {
            return;
        }
        log(EVK.A0o, cvmAttribution, null, null, AnonymousClass1.INSTANCE);
    }

    public final void logTimeSpentNavigation() {
        CvmAttribution cvmAttribution = cvmAttribution();
        if (cvmAttribution != null) {
            logTimeSpentMarker(EVK.A0y, cvmAttribution);
        }
    }

    private final EnumC7420EvW toLogValue(HatchCvmChipPinPurpose hatchCvmChipPinPurpose) {
        int iOrdinal = hatchCvmChipPinPurpose.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 0) {
                return EnumC7420EvW.COLD_PROVISION;
            }
            throw C3cG.A0q();
        }
        return EnumC7420EvW.HARD_REPLACEMENT;
    }
}
