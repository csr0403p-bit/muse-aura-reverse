package com.facebook.aura.vmbrowser.runtime;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AnonymousClass441;
import X.BBb;
import X.BFM;
import X.BLG;
import X.BRg;
import X.C06H;
import X.C1BN;
import X.C22I;
import X.C3Ej;
import X.C3Ek;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3pd;
import X.C3rb;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.G2j;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HzC;
import X.InterfaceC2178B0w;
import X.InterfaceC7549F2g;
import com.facebook.aura.R;
import com.facebook.aura.browsertask.presentation.BrowserTaskActions;
import com.facebook.aura.browsertask.presentation.BrowserTaskPresentationStore;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.model.BrowserTaskDisplayStatus;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.toast.api.ToastApi;
import com.facebook.aura.vmbrowser.config.BrowserDeviceClipboardConfig;
import com.facebook.aura.vmbrowser.runtime.AgentBrowserSurface;
import com.facebook.aura.vmbrowser.runtime.BrowserClipboardTelemetry;
import com.facebook.aura.vmbrowser.runtime.BrowserDeviceCopyResult;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AgentBrowserSurface implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final boolean TAKEOVER_DEFAULT_PAN_MODE_ENABLED = true;
    public final C3Em<Unit> _deviceClipboardActionSucceeded;
    public final BLG<Boolean> _isPanModeEnabled;
    public final BrowserTaskActions actions;
    public final C1BN<Boolean> canStopTask;
    public final BrowserClipboardTelemetry clipboardTelemetry;
    public final C1BN<Boolean> controlConflict;
    public final BrowserSessionController controller;
    public final C1BN<BrowserTaskPresentation> currentTask;
    public final C1BN<Boolean> isActive;
    public final C1BN<Boolean> isInTakeControl;
    public final C1BN<Boolean> isPreviewRevoked;
    public final C1BN<Boolean> isPreviewScreenLive;
    public final C1BN<Boolean> isUserControlled;
    public final C1BN<Boolean> isViewerReady;
    public final C1BN<Integer> loadingProgress;
    public final BLG<BrowserDeviceClipboardAction> mutablePendingDeviceClipboardAction;
    public final C1BN<String> pageUrl;
    public final BrowserTaskPresentationStore presentation;
    public final C1BN<InterfaceC2178B0w> previewFrame;
    public final AutoCloseable previewResetRegistration;
    public final C1BN<Set<String>> previewRevokedTaskIds;
    public final C3UX scope;
    public final C1BN<Long> sessionStartedAt;
    public final C1BN<String> siteDomain;
    public final AgentBrowserTakeoverControls takeoverControls;
    public final C1BN<String> taskActivityTitle;
    public final C1BN<BrowserTaskDisplayStatus> taskDisplayState;
    public final C1BN<String> taskDisplayStatus;
    public final C1BN<BrowserTaskPresentation> terminalOutcome;
    public final C1BN<String> thumbnailUri;
    public final AbstractC3358CGz userSession;
    public final BrowserViewerSession viewerSession;

    public final class Companion {
        public final AgentBrowserSurface getInstance(final AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (AgentBrowserSurface) abstractC3358CGz.A03(AgentBrowserSurface.class, new Function0() { // from class: com.facebook.aura.vmbrowser.runtime.AgentBrowserSurface$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new AgentBrowserSurface(abstractC3358CGz);
                }
            });
        }

        public static final AgentBrowserSurface getInstance$lambda$0(AbstractC3358CGz abstractC3358CGz) {
            return new AgentBrowserSurface(abstractC3358CGz);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.AgentBrowserSurface$copyBrowserSelectionToDevice$1", f = "AgentBrowserSurface.kt", l = {163}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.AgentBrowserSurface$copyBrowserSelectionToDevice$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<Function0<? extends Boolean>, HtJ<? super Unit>, Object> {
        public final /* synthetic */ BrowserClipboardTelemetry.Attempt $attempt;
        public final /* synthetic */ G0U<String, Unit> $writeDeviceClipboard;
        public /* synthetic */ Object L$0;
        public int label;

        /* renamed from: com.facebook.aura.vmbrowser.runtime.AgentBrowserSurface$copyBrowserSelectionToDevice$1$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BrowserClipboardUnavailableReason.values().length];
                try {
                    AnonymousClass002.A13(BrowserClipboardUnavailableReason.NO_SELECTION, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(BrowserClipboardUnavailableReason.TEXT_TOO_LARGE, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(BrowserClipboardUnavailableReason.INVALID_TEXT, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    AnonymousClass002.A16(BrowserClipboardUnavailableReason.UNSUPPORTED_SELECTION, iArr);
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(BrowserClipboardTelemetry.Attempt attempt, G0U<? super String, Unit> g0u, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$attempt = attempt;
            this.$writeDeviceClipboard = g0u;
        }

        public static final Unit invokeSuspend$lambda$0(AgentBrowserSurface agentBrowserSurface, BrowserClipboardTelemetry.Attempt attempt) {
            agentBrowserSurface.clipboardTelemetry.finishAttempt(attempt, BrowserClipboardTelemetry.Outcome.SUCCESS, BrowserClipboardTelemetry.Stage.LOCAL_CLIPBOARD_WRITE, BrowserClipboardTelemetry.ClosedReason.COPY_COMPLETED, null);
            ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f1201d0);
            C3Em<Unit> c3Em = agentBrowserSurface._deviceClipboardActionSucceeded;
            Unit unit = Unit.INSTANCE;
            c3Em.AhV(unit);
            return unit;
        }

        public static final Unit invokeSuspend$lambda$1(AgentBrowserSurface agentBrowserSurface, BrowserClipboardTelemetry.Attempt attempt) {
            agentBrowserSurface.clipboardTelemetry.finishAttempt(attempt, BrowserClipboardTelemetry.Outcome.FAILED, BrowserClipboardTelemetry.Stage.LOCAL_CLIPBOARD_WRITE, BrowserClipboardTelemetry.ClosedReason.CLIPBOARD_WRITE_FAILED, BrowserClipboardReasonDetail.CLIPBOARD_WRITE_ERROR);
            ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f1201ca);
            return Unit.INSTANCE;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = AgentBrowserSurface.this.new AnonymousClass1(this.$attempt, this.$writeDeviceClipboard, htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Function0<? extends Boolean> function0, HtJ<? super Unit> htJ) {
            return invoke2((Function0<Boolean>) function0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            BrowserClipboardTelemetry browserClipboardTelemetry;
            BrowserClipboardTelemetry.Attempt attempt;
            BrowserClipboardTelemetry.Outcome outcome;
            BrowserClipboardTelemetry.Stage stage;
            BrowserClipboardTelemetry.ClosedReason closedReason;
            ToastApi toastApi;
            int iOrdinal;
            int i;
            Function0 function0 = (Function0) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i2 = this.label;
            if (i2 == 0) {
                Hwg.A00(obj);
                BrowserViewerSession browserViewerSession = AgentBrowserSurface.this.viewerSession;
                BrowserClipboardTelemetry.Attempt attempt2 = this.$attempt;
                this.L$0 = function0;
                this.label = 1;
                obj = browserViewerSession.copyToDevice(attempt2, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i2 != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            BrowserDeviceCopyResult browserDeviceCopyResult = (BrowserDeviceCopyResult) obj;
            if (!AnonymousClass003.A1Y(function0)) {
                AgentBrowserSurface.this.clipboardTelemetry.finishCancellation(this.$attempt);
                return Unit.INSTANCE;
            }
            if (browserDeviceCopyResult instanceof BrowserDeviceCopyResult.Available) {
                String str = ((BrowserDeviceCopyResult.Available) browserDeviceCopyResult).text;
                G0U<String, Unit> g0u = this.$writeDeviceClipboard;
                final AgentBrowserSurface agentBrowserSurface = AgentBrowserSurface.this;
                final BrowserClipboardTelemetry.Attempt attempt3 = this.$attempt;
                AgentBrowserSurfaceKt.writeDeviceClipboardThenReport(str, g0u, new Function0() { // from class: com.facebook.aura.vmbrowser.runtime.AgentBrowserSurface$copyBrowserSelectionToDevice$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AgentBrowserSurface.AnonymousClass1.invokeSuspend$lambda$0(agentBrowserSurface, attempt3);
                    }
                }, new Function0() { // from class: com.facebook.aura.vmbrowser.runtime.AgentBrowserSurface$copyBrowserSelectionToDevice$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AgentBrowserSurface.AnonymousClass1.invokeSuspend$lambda$1(agentBrowserSurface, attempt3);
                    }
                });
            } else {
                if (C7384Etj.areEqual(browserDeviceCopyResult, BrowserDeviceCopyResult.TryAgain.INSTANCE)) {
                    browserClipboardTelemetry = AgentBrowserSurface.this.clipboardTelemetry;
                    attempt = this.$attempt;
                    outcome = BrowserClipboardTelemetry.Outcome.BLOCKED;
                    stage = BrowserClipboardTelemetry.Stage.READINESS_CHECK;
                    closedReason = BrowserClipboardTelemetry.ClosedReason.TRANSPORT_NOT_READY;
                } else if (C7384Etj.areEqual(browserDeviceCopyResult, BrowserDeviceCopyResult.Blocked.INSTANCE)) {
                    browserClipboardTelemetry = AgentBrowserSurface.this.clipboardTelemetry;
                    attempt = this.$attempt;
                    outcome = BrowserClipboardTelemetry.Outcome.BLOCKED;
                    stage = BrowserClipboardTelemetry.Stage.ACCEPTED;
                    closedReason = BrowserClipboardTelemetry.ClosedReason.CONTROLS_UNAVAILABLE;
                } else if (browserDeviceCopyResult instanceof BrowserDeviceCopyResult.Unavailable) {
                    BrowserClipboardTelemetry browserClipboardTelemetry2 = AgentBrowserSurface.this.clipboardTelemetry;
                    BrowserClipboardTelemetry.Attempt attempt4 = this.$attempt;
                    BrowserDeviceCopyResult.Unavailable unavailable = (BrowserDeviceCopyResult.Unavailable) browserDeviceCopyResult;
                    BrowserClipboardUnavailableReason browserClipboardUnavailableReason = unavailable.reason;
                    browserClipboardTelemetry2.finishAttempt(attempt4, browserClipboardUnavailableReason != null ? BrowserClipboardTelemetry.Outcome.BLOCKED : BrowserClipboardTelemetry.Outcome.FAILED, BrowserClipboardTelemetry.Stage.REMOTE_RESPONSE, browserClipboardUnavailableReason != null ? BrowserClipboardTelemetry.ClosedReason.CONTENT_UNAVAILABLE : BrowserClipboardTelemetry.ClosedReason.INVALID_REMOTE_PAYLOAD, unavailable.reasonDetail);
                    toastApi = ToastApi.INSTANCE;
                    BrowserClipboardUnavailableReason browserClipboardUnavailableReason2 = unavailable.reason;
                    if (browserClipboardUnavailableReason2 == null || (iOrdinal = browserClipboardUnavailableReason2.ordinal()) == -1) {
                        i = R.string._name_removed__res_0x7f1201cb;
                    } else if (iOrdinal == 0) {
                        i = R.string._name_removed__res_0x7f1201ce;
                    } else if (iOrdinal == 1) {
                        i = R.string._name_removed__res_0x7f1201cf;
                    } else if (iOrdinal == 2) {
                        i = R.string._name_removed__res_0x7f1201cd;
                    } else {
                        if (iOrdinal != 3) {
                            throw C3cG.A0q();
                        }
                        i = R.string._name_removed__res_0x7f1201d1;
                    }
                    toastApi.showToast(i);
                } else {
                    if (!C7384Etj.areEqual(browserDeviceCopyResult, BrowserDeviceCopyResult.OutcomeUnknown.INSTANCE)) {
                        throw C3cG.A0q();
                    }
                    browserClipboardTelemetry = AgentBrowserSurface.this.clipboardTelemetry;
                    attempt = this.$attempt;
                    outcome = BrowserClipboardTelemetry.Outcome.OUTCOME_UNKNOWN;
                    stage = BrowserClipboardTelemetry.Stage.REMOTE_RESPONSE;
                    closedReason = BrowserClipboardTelemetry.ClosedReason.ACKNOWLEDGEMENT_UNKNOWN;
                }
                browserClipboardTelemetry.finishAttempt(attempt, outcome, stage, closedReason, null);
                toastApi = ToastApi.INSTANCE;
                i = R.string._name_removed__res_0x7f1201cb;
                toastApi.showToast(i);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Function0<Boolean> function0, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(function0, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.AgentBrowserSurface$isViewerReady$1", f = "AgentBrowserSurface.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.AgentBrowserSurface$isViewerReady$1, reason: invalid class name and case insensitive filesystem */
    public final class C143111 extends AbstractC07127nr implements G2j<Boolean, Boolean, Boolean, HtJ<? super Boolean>, Object> {
        public /* synthetic */ boolean Z$0;
        public /* synthetic */ boolean Z$1;
        public /* synthetic */ boolean Z$2;
        public int label;

        public C143111(HtJ<? super C143111> htJ) {
            super(4, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                boolean r3 = r4.Z$0
                boolean r2 = r4.Z$1
                boolean r1 = r4.Z$2
                int r0 = r4.label
                if (r0 != 0) goto L1a
                X.Hwg.A00(r5)
                if (r3 == 0) goto L14
                if (r2 == 0) goto L14
                r0 = 1
                if (r1 == 0) goto L15
            L14:
                r0 = 0
            L15:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            L1a:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmbrowser.runtime.AgentBrowserSurface.C143111.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Boolean bool3, HtJ<? super Boolean> htJ) {
            return invoke(AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), AnonymousClass001.A1X(bool3), htJ);
        }

        public final Object invoke(boolean z, boolean z2, boolean z3, HtJ<? super Boolean> htJ) {
            C143111 c143111 = new C143111(htJ);
            c143111.Z$0 = z;
            c143111.Z$1 = z2;
            c143111.Z$2 = z3;
            return c143111.invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.AgentBrowserSurface$pasteDeviceClipboardToBrowser$1", f = "AgentBrowserSurface.kt", l = {317}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.AgentBrowserSurface$pasteDeviceClipboardToBrowser$1, reason: invalid class name and case insensitive filesystem */
    public final class C143121 extends AbstractC07127nr implements G0V<Function0<? extends Boolean>, HtJ<? super Unit>, Object> {
        public final /* synthetic */ BrowserClipboardTelemetry.Attempt $attempt;
        public final /* synthetic */ Function0<String> $readDeviceClipboard;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public final /* synthetic */ AgentBrowserSurface this$0;

        /* renamed from: com.facebook.aura.vmbrowser.runtime.AgentBrowserSurface$pasteDeviceClipboardToBrowser$1$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BrowserDevicePasteResult.values().length];
                try {
                    AnonymousClass002.A13(BrowserDevicePasteResult.DELIVERED, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(BrowserDevicePasteResult.TRY_AGAIN, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(BrowserDevicePasteResult.BLOCKED, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    AnonymousClass002.A16(BrowserDevicePasteResult.UNAVAILABLE, iArr);
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    AnonymousClass002.A17(BrowserDevicePasteResult.OUTCOME_UNKNOWN, iArr);
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143121(Function0<String> function0, AgentBrowserSurface agentBrowserSurface, BrowserClipboardTelemetry.Attempt attempt, HtJ<? super C143121> htJ) {
            super(2, htJ);
            this.$readDeviceClipboard = function0;
            this.this$0 = agentBrowserSurface;
            this.$attempt = attempt;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C143121 c143121 = new C143121(this.$readDeviceClipboard, this.this$0, this.$attempt, htJ);
            c143121.L$0 = obj;
            return c143121;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Function0<? extends Boolean> function0, HtJ<? super Unit> htJ) {
            return invoke2((Function0<Boolean>) function0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            AgentBrowserSurface agentBrowserSurface;
            ToastApi toastApi;
            int i;
            String strInvoke;
            BrowserClipboardTelemetry browserClipboardTelemetry;
            BrowserClipboardTelemetry.Attempt attempt;
            BrowserClipboardTelemetry.Outcome outcome;
            BrowserClipboardTelemetry.Stage stage;
            BrowserClipboardTelemetry.ClosedReason closedReason;
            Function0 function0 = (Function0) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i2 = this.label;
            if (i2 == 0) {
                Hwg.A00(obj);
                try {
                    strInvoke = this.$readDeviceClipboard.invoke();
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                    boolean zA1Y = AnonymousClass003.A1Y(function0);
                    agentBrowserSurface = this.this$0;
                    if (zA1Y) {
                        agentBrowserSurface.clipboardTelemetry.finishAttempt(this.$attempt, BrowserClipboardTelemetry.Outcome.FAILED, BrowserClipboardTelemetry.Stage.LOCAL_CLIPBOARD_READ, BrowserClipboardTelemetry.ClosedReason.CLIPBOARD_READ_FAILED, BrowserClipboardReasonDetail.CLIPBOARD_READ_ERROR);
                        toastApi = ToastApi.INSTANCE;
                        i = R.string._name_removed__res_0x7f1201c9;
                    }
                }
                if (AnonymousClass003.A1Y(function0)) {
                    if (strInvoke == null || strInvoke.length() == 0) {
                        this.this$0.clipboardTelemetry.finishAttempt(this.$attempt, BrowserClipboardTelemetry.Outcome.BLOCKED, BrowserClipboardTelemetry.Stage.LOCAL_CLIPBOARD_READ, BrowserClipboardTelemetry.ClosedReason.CLIPBOARD_EMPTY, null);
                        toastApi = ToastApi.INSTANCE;
                        i = R.string._name_removed__res_0x7f1201d7;
                    } else {
                        BrowserClipboardUnavailableReason browserClipboardUnavailableReasonBrowserClipboardTextError = BrowserDeviceClipboardFeedbackKt.browserClipboardTextError(strInvoke);
                        AgentBrowserSurface agentBrowserSurface2 = this.this$0;
                        if (browserClipboardUnavailableReasonBrowserClipboardTextError != null) {
                            agentBrowserSurface2.clipboardTelemetry.finishAttempt(this.$attempt, BrowserClipboardTelemetry.Outcome.FAILED, BrowserClipboardTelemetry.Stage.LOCAL_CLIPBOARD_READ, BrowserClipboardTelemetry.ClosedReason.INVALID_LOCAL_PAYLOAD, browserClipboardUnavailableReasonBrowserClipboardTextError.getReasonDetail());
                            toastApi = ToastApi.INSTANCE;
                            BrowserClipboardUnavailableReason browserClipboardUnavailableReason = BrowserClipboardUnavailableReason.TEXT_TOO_LARGE;
                            i = R.string._name_removed__res_0x7f1201d6;
                            if (browserClipboardUnavailableReasonBrowserClipboardTextError == browserClipboardUnavailableReason) {
                                i = R.string._name_removed__res_0x7f1201d8;
                            }
                        } else {
                            BrowserViewerSession browserViewerSession = agentBrowserSurface2.viewerSession;
                            BrowserClipboardTelemetry.Attempt attempt2 = this.$attempt;
                            this.L$0 = function0;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 1;
                            obj = browserViewerSession.pasteFromDevice(strInvoke, attempt2, this);
                            if (obj == enumC10460Hji) {
                                return enumC10460Hji;
                            }
                        }
                    }
                    toastApi.showToast(i);
                    return Unit.INSTANCE;
                }
                agentBrowserSurface = this.this$0;
                agentBrowserSurface.clipboardTelemetry.finishCancellation(this.$attempt);
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            BrowserDevicePasteResult browserDevicePasteResult = (BrowserDevicePasteResult) obj;
            if (AnonymousClass003.A1Y(function0)) {
                int iOrdinal = browserDevicePasteResult.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        browserClipboardTelemetry = this.this$0.clipboardTelemetry;
                        attempt = this.$attempt;
                        outcome = BrowserClipboardTelemetry.Outcome.BLOCKED;
                        stage = BrowserClipboardTelemetry.Stage.READINESS_CHECK;
                        closedReason = BrowserClipboardTelemetry.ClosedReason.TRANSPORT_NOT_READY;
                    } else if (iOrdinal == 2) {
                        browserClipboardTelemetry = this.this$0.clipboardTelemetry;
                        attempt = this.$attempt;
                        outcome = BrowserClipboardTelemetry.Outcome.BLOCKED;
                        stage = BrowserClipboardTelemetry.Stage.ACCEPTED;
                        closedReason = BrowserClipboardTelemetry.ClosedReason.CONTROLS_UNAVAILABLE;
                    } else if (iOrdinal == 3) {
                        browserClipboardTelemetry = this.this$0.clipboardTelemetry;
                        attempt = this.$attempt;
                        outcome = BrowserClipboardTelemetry.Outcome.FAILED;
                        stage = BrowserClipboardTelemetry.Stage.REMOTE_ACKNOWLEDGEMENT;
                        closedReason = BrowserClipboardTelemetry.ClosedReason.PASTE_UNAVAILABLE;
                    } else {
                        if (iOrdinal != 4) {
                            throw C3cG.A0q();
                        }
                        this.this$0.clipboardTelemetry.finishAttempt(this.$attempt, BrowserClipboardTelemetry.Outcome.OUTCOME_UNKNOWN, BrowserClipboardTelemetry.Stage.REMOTE_DISPATCH, BrowserClipboardTelemetry.ClosedReason.ACKNOWLEDGEMENT_UNKNOWN, null);
                        ToastApi.INSTANCE.showLongToast(R.string._name_removed__res_0x7f1201d4);
                    }
                    browserClipboardTelemetry.finishAttempt(attempt, outcome, stage, closedReason, null);
                    toastApi = ToastApi.INSTANCE;
                    i = R.string._name_removed__res_0x7f1201d2;
                    toastApi.showToast(i);
                } else {
                    this.this$0.clipboardTelemetry.finishAttempt(this.$attempt, BrowserClipboardTelemetry.Outcome.SUCCESS, BrowserClipboardTelemetry.Stage.REMOTE_ACKNOWLEDGEMENT, BrowserClipboardTelemetry.ClosedReason.PASTE_ACKNOWLEDGED, null);
                    ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f1201d3);
                    C3cG.A1I(this.this$0._deviceClipboardActionSucceeded);
                }
                return Unit.INSTANCE;
            }
            agentBrowserSurface = this.this$0;
            agentBrowserSurface.clipboardTelemetry.finishCancellation(this.$attempt);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Function0<Boolean> function0, HtJ<? super Unit> htJ) {
            return ((C143121) create(function0, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public AgentBrowserSurface(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        BrowserSessionController browserSessionController = new BrowserSessionController(abstractC3358CGz);
        this.controller = browserSessionController;
        this.actions = BrowserTaskActions.Companion.getInstance(abstractC3358CGz);
        HzC hzCA0x = C3cH.A0x(C3cG.A0v());
        this.scope = hzCA0x;
        BrowserTaskPresentationStore companion = BrowserTaskPresentationStore.Companion.getInstance(abstractC3358CGz);
        this.presentation = companion;
        this.currentTask = companion.currentTask;
        C1BN<Boolean> c1bn = companion.isActive;
        this.isActive = c1bn;
        this.terminalOutcome = companion.terminalOutcome;
        this.previewRevokedTaskIds = companion.previewRevokedTaskIds;
        this.isPreviewRevoked = companion.isPreviewRevoked;
        this.taskActivityTitle = companion.taskActivityTitle;
        this.taskDisplayStatus = companion.taskDisplayStatus;
        this.taskDisplayState = companion.taskDisplayState;
        this.siteDomain = companion.siteDomain;
        this.pageUrl = companion.pageUrl;
        this.canStopTask = companion.canStopTask;
        this.sessionStartedAt = companion.sessionStartedAt;
        this.thumbnailUri = companion.thumbnailUri;
        this.previewFrame = companion.previewFrame;
        AgentBrowserSurface$special$$inlined$map$1 agentBrowserSurface$special$$inlined$map$1 = new AgentBrowserSurface$special$$inlined$map$1(c1bn);
        C3Ej c3Ej = C3Ek.A00;
        this.loadingProgress = AnonymousClass441.A00(0, hzCA0x, agentBrowserSurface$special$$inlined$map$1, c3Ej);
        BrowserClipboardTelemetry browserClipboardTelemetry = new BrowserClipboardTelemetry();
        this.clipboardTelemetry = browserClipboardTelemetry;
        BrowserViewerSession browserViewerSession = new BrowserViewerSession(browserSessionController, hzCA0x, abstractC3358CGz, browserClipboardTelemetry, new Function0() { // from class: com.facebook.aura.vmbrowser.runtime.AgentBrowserSurface$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AgentBrowserSurface.viewerSession$lambda$0(this.f$0);
            }
        });
        this.viewerSession = browserViewerSession;
        this.mutablePendingDeviceClipboardAction = C3cG.A13();
        this.isInTakeControl = browserViewerSession.isInTakeControl;
        this.isPreviewScreenLive = browserViewerSession.isPreviewScreenLive;
        this.isUserControlled = browserViewerSession.isUserControlled;
        this.controlConflict = browserViewerSession.controlConflict;
        this.isViewerReady = AnonymousClass441.A00(false, hzCA0x, C3rb.A00(new C143111(null), browserSessionController.isConnected, browserSessionController.hasFirstFrame, browserViewerSession.failed), c3Ej);
        this._isPanModeEnabled = AnonymousClass002.A0v(true);
        this._deviceClipboardActionSucceeded = C3cG.A12(C79.A00, 0, 1);
        this.takeoverControls = new AgentBrowserTakeoverControls() { // from class: com.facebook.aura.vmbrowser.runtime.AgentBrowserSurface$takeoverControls$1
            public final C22I<Unit> deviceClipboardActionSucceeded;
            public final C1BN<Boolean> isPanModeEnabled;
            public final C1BN<BrowserDeviceClipboardAction> pendingDeviceClipboardAction;
            public final C22I<String> remoteClipboardText;

            @Override // com.facebook.aura.vmbrowser.runtime.AgentBrowserTakeoverControls
            public void copySelection(G0U<? super String, Unit> g0u) {
                C7384Etj.A0Y(g0u, 0);
                boolean zIsEnabled = BrowserDeviceClipboardConfig.INSTANCE.isEnabled();
                AgentBrowserSurface agentBrowserSurface = this.this$0;
                if (zIsEnabled) {
                    agentBrowserSurface.copyBrowserSelectionToDevice(g0u);
                } else {
                    agentBrowserSurface.controller.copySelection();
                }
            }

            @Override // com.facebook.aura.vmbrowser.runtime.AgentBrowserTakeoverControls
            public void pasteFromDevice(Function0<String> function0) {
                C7384Etj.A0Y(function0, 0);
                if (BrowserDeviceClipboardConfig.INSTANCE.isEnabled()) {
                    this.this$0.pasteDeviceClipboardToBrowser(function0);
                    return;
                }
                String strInvoke = function0.invoke();
                if (strInvoke == null || strInvoke.length() <= 0) {
                    return;
                }
                this.this$0.controller.pasteText(strInvoke);
            }

            @Override // com.facebook.aura.vmbrowser.runtime.AgentBrowserTakeoverControls
            public AutoCloseable registerKeyboard(G0U<? super Boolean, Unit> g0u) {
                C7384Etj.A0Y(g0u, 0);
                return this.this$0.viewerSession.registerKeyboard(g0u);
            }

            @Override // com.facebook.aura.vmbrowser.runtime.AgentBrowserTakeoverControls
            public void sendSpecialKey(AgentBrowserRemoteKey agentBrowserRemoteKey) {
                C7384Etj.A0Y(agentBrowserRemoteKey, 0);
                this.this$0.controller.sendSpecialKey(agentBrowserRemoteKey);
            }

            @Override // com.facebook.aura.vmbrowser.runtime.AgentBrowserTakeoverControls
            public void sendTextInput(String str) {
                C7384Etj.A0Y(str, 0);
                this.this$0.controller.sendTextInput(str);
            }

            {
                this.isPanModeEnabled = C3cG.A11(this.this$0._isPanModeEnabled);
                this.remoteClipboardText = this.this$0.controller.remoteClipboardText;
                this.pendingDeviceClipboardAction = C3cG.A11(this.this$0.mutablePendingDeviceClipboardAction);
                this.deviceClipboardActionSucceeded = C3pd.A00(this.this$0._deviceClipboardActionSucceeded);
            }

            @Override // com.facebook.aura.vmbrowser.runtime.AgentBrowserTakeoverControls
            public C22I<Unit> getDeviceClipboardActionSucceeded() {
                return this.deviceClipboardActionSucceeded;
            }

            @Override // com.facebook.aura.vmbrowser.runtime.AgentBrowserTakeoverControls
            public C1BN<BrowserDeviceClipboardAction> getPendingDeviceClipboardAction() {
                return this.pendingDeviceClipboardAction;
            }

            @Override // com.facebook.aura.vmbrowser.runtime.AgentBrowserTakeoverControls
            public C22I<String> getRemoteClipboardText() {
                return this.remoteClipboardText;
            }

            @Override // com.facebook.aura.vmbrowser.runtime.AgentBrowserTakeoverControls
            public boolean isDeviceClipboardEnabled() {
                return BrowserDeviceClipboardConfig.INSTANCE.isEnabled();
            }

            @Override // com.facebook.aura.vmbrowser.runtime.AgentBrowserTakeoverControls
            public C1BN<Boolean> isPanModeEnabled() {
                return this.isPanModeEnabled;
            }

            @Override // com.facebook.aura.vmbrowser.runtime.AgentBrowserTakeoverControls
            public void setPanModeEnabled(boolean z) {
                AnonymousClass004.A1D(z, this.this$0._isPanModeEnabled);
                this.this$0.controller.setPanModeEnabled(z);
            }

            @Override // com.facebook.aura.vmbrowser.runtime.AgentBrowserTakeoverControls
            public void setDeviceClipboardControlsExposed(String str, Object obj, boolean z) {
                AnonymousClass003.A0u(str, obj);
                this.this$0.clipboardTelemetry.setControlsExposed(z, str, obj);
            }
        };
        this.previewResetRegistration = companion.registerViewerReset(new G0U() { // from class: com.facebook.aura.vmbrowser.runtime.AgentBrowserSurface$$ExternalSyntheticLambda3
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return AgentBrowserSurface.previewResetRegistration$lambda$0(this.f$0, (String) obj);
            }
        });
    }

    private final void launchDeviceClipboardAction(final BrowserClipboardTelemetry.Attempt attempt, BrowserDeviceClipboardAction browserDeviceClipboardAction, int i, G0V<? super Function0<Boolean>, ? super HtJ<? super Unit>, ? extends Object> g0v) {
        C3UX c3ux = this.scope;
        GAo.A02(C79.A00, AuraDispatchers.mainImmediate, new AgentBrowserSurface$launchDeviceClipboardAction$job$1(this, attempt, browserDeviceClipboardAction, g0v, i, null), c3ux).AO5(new G0U() { // from class: com.facebook.aura.vmbrowser.runtime.AgentBrowserSurface$$ExternalSyntheticLambda0
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return AgentBrowserSurface.launchDeviceClipboardAction$lambda$0(this.f$0, attempt, (Throwable) obj);
            }
        });
    }

    public final void focusTask(BrowserTaskPresentation browserTaskPresentation) {
        C7384Etj.A0Y(browserTaskPresentation, 0);
        this.actions.focusTask(browserTaskPresentation);
    }

    public final void stopTask(BrowserTaskPresentation browserTaskPresentation) {
        C7384Etj.A0Y(browserTaskPresentation, 0);
        this.actions.stopTask(browserTaskPresentation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copyBrowserSelectionToDevice(G0U<? super String, Unit> g0u) {
        String str;
        BrowserTaskPresentation browserTaskPresentationA0G = C3cG.A0G(this.currentTask);
        if (browserTaskPresentationA0G == null || (str = browserTaskPresentationA0G.browserTaskId) == null) {
            return;
        }
        BrowserClipboardTelemetry.Attempt attemptBeginAttempt = this.clipboardTelemetry.beginAttempt(BrowserClipboardTelemetry.Direction.COPY_TO_DEVICE, str);
        launchDeviceClipboardAction(attemptBeginAttempt, BrowserDeviceClipboardAction.COPY, R.string._name_removed__res_0x7f1201cb, new AnonymousClass1(attemptBeginAttempt, g0u, null));
    }

    public static final Unit launchDeviceClipboardAction$lambda$0(AgentBrowserSurface agentBrowserSurface, BrowserClipboardTelemetry.Attempt attempt, Throwable th) {
        if (th instanceof CancellationException) {
            agentBrowserSurface.clipboardTelemetry.finishCancellation(attempt);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pasteDeviceClipboardToBrowser(Function0<String> function0) {
        String str;
        BrowserTaskPresentation browserTaskPresentationA0G = C3cG.A0G(this.currentTask);
        if (browserTaskPresentationA0G == null || (str = browserTaskPresentationA0G.browserTaskId) == null) {
            return;
        }
        BrowserClipboardTelemetry.Attempt attemptBeginAttempt = this.clipboardTelemetry.beginAttempt(BrowserClipboardTelemetry.Direction.PASTE_FROM_DEVICE, str);
        launchDeviceClipboardAction(attemptBeginAttempt, BrowserDeviceClipboardAction.PASTE, R.string._name_removed__res_0x7f1201d4, new C143121(function0, this, attemptBeginAttempt, null));
    }

    public static final Unit previewResetRegistration$lambda$0(AgentBrowserSurface agentBrowserSurface, String str) {
        agentBrowserSurface.viewerSession.closeViewer(str);
        AnonymousClass004.A1D(true, agentBrowserSurface._isPanModeEnabled);
        return Unit.INSTANCE;
    }

    public static final BrowserTaskPresentation viewerSession$lambda$0(AgentBrowserSurface agentBrowserSurface) {
        BrowserTaskPresentation browserTaskPresentationA0G = C3cG.A0G(agentBrowserSurface.currentTask);
        if (browserTaskPresentationA0G == null || !browserTaskPresentationA0G.execution.isVm()) {
            return null;
        }
        return browserTaskPresentationA0G;
    }

    /* renamed from: LiveViewer-WH-ejsw, reason: not valid java name */
    public final void m3143LiveViewerWHejsw(final String str, final Object obj, final boolean z, final boolean z2, final float f, BRg bRg, BFM bfm, final int i, final int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(obj, 1);
        bfm.AgG(-643373107);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, obj);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A08(bfm, f);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0d |= iA0i;
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, this);
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BrowserViewerSession browserViewerSession = this.viewerSession;
            int i4 = ((iA0d >> 18) & 14) | (BrowserViewerSession.$stable << 3);
            int i5 = iA0d << 6;
            AgentBrowserLiveViewerKt.m3142AgentBrowserLiveViewer0vH8DBg(this, browserViewerSession, str, obj, z, z2, f, bRg2, bfm, AnonymousClass005.A05(i5, AnonymousClass004.A02(i5, AnonymousClass002.A08(i5, i4))), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.vmbrowser.runtime.AgentBrowserSurface$$ExternalSyntheticLambda1
                @Override // X.G0V
                public final Object invoke(Object obj2, Object obj3) {
                    AgentBrowserSurface agentBrowserSurface = this.f$0;
                    String str2 = str;
                    Object obj4 = obj;
                    boolean z3 = z;
                    boolean z4 = z2;
                    float f2 = f;
                    BRg bRg4 = bRg3;
                    int i6 = i;
                    agentBrowserSurface.m3143LiveViewerWHejsw(str2, obj4, z3, z4, f2, bRg4, (BFM) obj2, AnonymousClass011.A02(obj3, i6), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public final void acknowledgeTerminalOutcome() {
        this.actions.acknowledgeTerminalOutcome();
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() throws Exception {
        this.previewResetRegistration.close();
        this.viewerSession.clearUserData();
        C9286GCn.A00(null, AnonymousClass001.A0i(), (C9286GCn) this._isPanModeEnabled);
        HoC hoC = (HoC) C3cH.A0t(this.scope);
        if (hoC != null) {
            hoC.A5w(null);
        }
    }

    public final void closeViewer() {
        this.viewerSession.closeViewer(null);
    }

    public final C1BN<Boolean> getCanStopTask() {
        return this.canStopTask;
    }

    public final C1BN<Boolean> getControlConflict() {
        return this.controlConflict;
    }

    public final BrowserSessionController getController() {
        return this.controller;
    }

    public final C1BN<BrowserTaskPresentation> getCurrentTask() {
        return this.currentTask;
    }

    public final C1BN<Integer> getLoadingProgress() {
        return this.loadingProgress;
    }

    public final C1BN<String> getPageUrl() {
        return this.pageUrl;
    }

    public final C1BN<InterfaceC2178B0w> getPreviewFrame() {
        return this.previewFrame;
    }

    public final C1BN<Set<String>> getPreviewRevokedTaskIds() {
        return this.previewRevokedTaskIds;
    }

    public final C1BN<Long> getSessionStartedAt() {
        return this.sessionStartedAt;
    }

    public final C1BN<String> getSiteDomain() {
        return this.siteDomain;
    }

    public final AgentBrowserTakeoverControls getTakeoverControls() {
        return this.takeoverControls;
    }

    public final C1BN<String> getTaskActivityTitle() {
        return this.taskActivityTitle;
    }

    public final C1BN<BrowserTaskDisplayStatus> getTaskDisplayState() {
        return this.taskDisplayState;
    }

    public final C1BN<String> getTaskDisplayStatus() {
        return this.taskDisplayStatus;
    }

    public final C1BN<BrowserTaskPresentation> getTerminalOutcome() {
        return this.terminalOutcome;
    }

    public final C1BN<String> getThumbnailUri() {
        return this.thumbnailUri;
    }

    public final void handBackControl() {
        this.viewerSession.handBackControl();
    }

    public final C1BN<Boolean> isActive() {
        return this.isActive;
    }

    public final C1BN<Boolean> isInTakeControl() {
        return this.isInTakeControl;
    }

    public final C1BN<Boolean> isPreviewRevoked() {
        return this.isPreviewRevoked;
    }

    public final C1BN<Boolean> isPreviewScreenLive() {
        return this.isPreviewScreenLive;
    }

    public final C1BN<Boolean> isUserControlled() {
        return this.isUserControlled;
    }

    public final C1BN<Boolean> isViewerReady() {
        return this.isViewerReady;
    }

    public final void stopSession() {
        this.actions.stopSession();
    }

    public static final Unit LiveViewer_WH_ejsw$lambda$0(AgentBrowserSurface agentBrowserSurface, String str, Object obj, boolean z, boolean z2, float f, BRg bRg, int i, int i2, BFM bfm, int i3) {
        agentBrowserSurface.m3143LiveViewerWHejsw(str, obj, z, z2, f, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public final void focusTask(String str) {
        C7384Etj.A0Y(str, 0);
        this.actions.focusTask(str);
    }
}
