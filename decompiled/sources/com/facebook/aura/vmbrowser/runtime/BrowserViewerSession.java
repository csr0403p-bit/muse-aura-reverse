package com.facebook.aura.vmbrowser.runtime;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass603;
import X.BLG;
import X.C06H;
import X.C10543Hqv;
import X.C1BN;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C3rb;
import X.C4oT;
import X.C7384Etj;
import X.C78W;
import X.C79;
import X.C7BY;
import X.C8eO;
import X.C9258GBl;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.G2j;
import X.GAX;
import X.GAo;
import X.GBK;
import X.HoC;
import X.HtJ;
import X.HwK;
import X.Hwg;
import X.HxE;
import X.Hxb;
import X.HzP;
import X.InterfaceC2261BLa;
import X.InterfaceC3137BzH;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.browsertask.control.BrowserControlLease;
import com.facebook.aura.browsertask.control.BrowserControlResult;
import com.facebook.aura.browsertask.control.BrowserPresentResult;
import com.facebook.aura.browsertask.control.BrowserViewerPreference;
import com.facebook.aura.common.prefs.HatchPrefsStore;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.gateway.VmAuthTokenKt;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.handoff.impl.MC;
import com.facebook.aura.login.nativeflow.MC;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.qpl.module.MC;
import com.facebook.aura.vmbrowser.runtime.BrowserClipboardTelemetry;
import com.facebook.aura.vmbrowser.runtime.BrowserDeviceCopyResult;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class BrowserViewerSession {
    public static final int $stable = 8;
    public static final String CONTROL_OWNER_USER = "user";
    public static final long LOGOUT_CLEANUP_TIMEOUT_MS = 35000;
    public static final long REQUEST_TIMEOUT_MS = 15000;
    public static final long RESIZE_DEBOUNCE_MS = 250;
    public final BLG<Boolean> _controlConflict;
    public final BLG<Boolean> _failed;
    public final BLG<Boolean> _isInTakeControl;
    public final BLG<Boolean> _isPreviewScreenLive;
    public final BLG<Boolean> _isUserControlled;
    public String attemptedTakeoverTaskId;
    public final C3UX cleanupScope;
    public final BrowserClipboardTelemetry clipboardTelemetry;
    public volatile boolean closed;
    public final C1BN<Boolean> controlConflict;
    public Long controlExpiresAtMs;
    public long controlGeneration;
    public final BrowserSessionController controller;
    public final Function0<BrowserTaskPresentation> currentTask;
    public volatile String currentVmId;
    public final BrowserDeviceClipboard deviceClipboard;
    public final C1BN<Boolean> failed;
    public final HatchGatewayPrefsStore gatewayPrefs;
    public HoC heartbeatJob;
    public boolean heartbeatPending;
    public String heldTaskId;
    public final AutoCloseable inputFocusRegistration;
    public final C1BN<Boolean> isInTakeControl;
    public final C1BN<Boolean> isPreviewScreenLive;
    public final C1BN<Boolean> isUserControlled;
    public volatile Object keyboardEpoch;
    public volatile KeyboardRegistration keyboardRegistration;
    public final InterfaceC2261BLa mutations;
    public volatile Host owner;
    public final C4oT prefs;
    public boolean releasePending;
    public HoC releaseRetryJob;
    public final C3UX scope;
    public String takeoverId;
    public final InterfaceC3137BzH vmChangeListener;
    public static final Companion Companion = new Companion();
    public static final long[] TRANSIENT_RETRY_MS = {500, 1000};

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$1", f = "BrowserViewerSession.kt", l = {SelfieSnapshotKt.SELFIE_JPEG_QUALITY}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$1$1", f = "BrowserViewerSession.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C04351 extends AbstractC07127nr implements G2j<Boolean, Boolean, Boolean, HtJ<? super HxE<? extends Boolean, ? extends Boolean>>, Object> {
            public /* synthetic */ boolean Z$0;
            public /* synthetic */ boolean Z$1;
            public int label;

            public C04351(HtJ<? super C04351> htJ) {
                super(4, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                boolean z = this.Z$0;
                boolean z2 = this.Z$1;
                if (this.label == 0) {
                    return AnonymousClass002.A0q(AnonymousClass001.A0k(obj, z), z2);
                }
                throw AnonymousClass001.A0n();
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Boolean bool3, HtJ<? super HxE<? extends Boolean, ? extends Boolean>> htJ) {
                return invoke(AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), AnonymousClass001.A1X(bool3), (HtJ<? super HxE<Boolean, Boolean>>) htJ);
            }

            public final Object invoke(boolean z, boolean z2, boolean z3, HtJ<? super HxE<Boolean, Boolean>> htJ) {
                C04351 c04351 = new C04351(htJ);
                c04351.Z$0 = z;
                c04351.Z$1 = z3;
                return c04351.invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return BrowserViewerSession.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BrowserSessionController browserSessionController = BrowserViewerSession.this.controller;
                AnonymousClass603 anonymousClass603A00 = C3rb.A00(new C04351(null), browserSessionController.isConnected, browserSessionController.hasFirstFrame, browserSessionController.streamFailed);
                final BrowserViewerSession browserViewerSession = BrowserViewerSession.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.1.2
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HxE<Boolean, Boolean>) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(HxE<Boolean, Boolean> hxE, HtJ<? super Unit> htJ) {
                        Host host;
                        boolean zA1X = AnonymousClass001.A1X(hxE.first);
                        if (AnonymousClass001.A1X(hxE.second) && C3cH.A1R(browserViewerSession.controller.streamFailed) && browserViewerSession.owner != null) {
                            AnonymousClass004.A1D(true, browserViewerSession._failed);
                        }
                        browserViewerSession.updateInput();
                        if (zA1X && (host = browserViewerSession.owner) != null) {
                            browserViewerSession.scheduleResize(host);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (anonymousClass603A00.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return BrowserViewerSession.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Host {
        public static final int $stable = 0;
        public volatile boolean disposed;
        public volatile boolean foreground;
        public long measuredAtMs;
        public long modeGeneration;
        public BrowserViewerPreference preference;
        public boolean presentationConfirmed;
        public final BLG<Boolean> render;
        public HoC resizeJob;
        public BrowserViewerPreference submitted;
        public final String taskId;
        public final /* synthetic */ BrowserViewerSession this$0;
        public volatile boolean viewOnly;

        public Host(BrowserViewerSession browserViewerSession, String str, boolean z) {
            C7384Etj.A0Y(str, 1);
            this.this$0 = browserViewerSession;
            this.taskId = str;
            this.viewOnly = z;
            this.render = AnonymousClass002.A0v(false);
        }

        public final void noteOverlayVisibleForMetrics(Object obj, boolean z) {
            C7384Etj.A0Y(obj, 0);
            this.this$0.clipboardTelemetry.noteOverlayVisible(this.taskId, obj, z);
        }

        public final void updateViewer(BrowserViewerPreference browserViewerPreference) {
            C7384Etj.A0Y(browserViewerPreference, 0);
            BrowserViewerSession browserViewerSession = this.this$0;
            BrowserViewerSession.launchOperation$default(browserViewerSession, null, new BrowserViewerSession$Host$updateViewer$1(this, browserViewerPreference, browserViewerSession, null), 1, null);
        }

        private final boolean ownsForeground() {
            if (!this.this$0.closed && !this.disposed && this.foreground && this.this$0.owner == this) {
                BrowserTaskPresentation browserTaskPresentationInvoke = this.this$0.currentTask.invoke();
                if (C7384Etj.areEqual(browserTaskPresentationInvoke != null ? browserTaskPresentationInvoke.browserTaskId : null, this.taskId)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void updateViewportAspect() {
            if (this.preference != null) {
                this.this$0.controller.setUnobscuredViewportAspectRatio(r3.width / r3.height);
            }
        }

        public final void close() {
            BrowserViewerSession browserViewerSession = this.this$0;
            BrowserViewerSession.launchOperation$default(browserViewerSession, null, new BrowserViewerSession$Host$close$1(this, browserViewerSession, null), 1, null);
        }

        public final boolean getDisposed$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime() {
            return this.disposed;
        }

        public final boolean getForeground$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime() {
            return this.foreground;
        }

        public final long getMeasuredAtMs$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime() {
            return this.measuredAtMs;
        }

        public final long getModeGeneration$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime() {
            return this.modeGeneration;
        }

        public final BrowserViewerPreference getPreference$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime() {
            return this.preference;
        }

        public final boolean getPresentationConfirmed$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime() {
            return this.presentationConfirmed;
        }

        public final BLG<Boolean> getRender$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime() {
            return this.render;
        }

        public final HoC getResizeJob$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime() {
            return this.resizeJob;
        }

        public final BrowserViewerPreference getSubmitted$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime() {
            return this.submitted;
        }

        public final String getTaskId() {
            return this.taskId;
        }

        public final boolean getViewOnly() {
            return this.viewOnly;
        }

        public final Object prepareStream(HtJ<? super BrowserPresentResult> htJ) {
            return GAo.A00(htJ, AuraDispatchers.mainImmediate, new BrowserViewerSession$Host$prepareStream$2(this.this$0, this, null));
        }

        public final void setDisposed$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime(boolean z) {
            this.disposed = z;
        }

        public final void setForeground(boolean z) {
            BrowserViewerSession browserViewerSession = this.this$0;
            BrowserViewerSession.launchOperation$default(browserViewerSession, null, new BrowserViewerSession$Host$setForeground$1(this, z, browserViewerSession, null), 1, null);
        }

        public final void setForeground$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime(boolean z) {
            this.foreground = z;
        }

        public final void setMeasuredAtMs$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime(long j) {
            this.measuredAtMs = j;
        }

        public final void setPreference$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime(BrowserViewerPreference browserViewerPreference) {
            this.preference = browserViewerPreference;
        }

        public final void setPresentationConfirmed$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime(boolean z) {
            this.presentationConfirmed = z;
        }

        public final void setResizeJob$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime(HoC hoC) {
            this.resizeJob = hoC;
        }

        public final void setSubmitted$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime(BrowserViewerPreference browserViewerPreference) {
            this.submitted = browserViewerPreference;
        }

        public final void updateViewOnly(boolean z) {
            BrowserViewerSession browserViewerSession = this.this$0;
            BrowserViewerSession.launchOperation$default(browserViewerSession, null, new BrowserViewerSession$Host$updateViewOnly$1(this, z, browserViewerSession, null), 1, null);
        }

        public final boolean canRetry$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime() {
            return ownsForeground();
        }

        public final boolean isActive() {
            return (!ownsForeground() || AnonymousClass003.A1Z(this.this$0._failed) || AnonymousClass003.A1Z(this.this$0._controlConflict)) ? false : true;
        }

        public final boolean isCurrentMode$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime(long j) {
            return isActive() && this.modeGeneration == j;
        }
    }

    public final class KeyboardRegistration {
        public final G0U<Boolean, Unit> onFocus;

        /* JADX WARN: Multi-variable type inference failed */
        public KeyboardRegistration(G0U<? super Boolean, Unit> g0u) {
            C7384Etj.A0Y(g0u, 0);
            this.onFocus = g0u;
        }

        public final G0U<Boolean, Unit> getOnFocus() {
            return this.onFocus;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession", f = "BrowserViewerSession.kt", l = {430, 443, 456, 461, 478}, m = "acquireControl", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$acquireControl$1, reason: invalid class name and case insensitive filesystem */
    public final class C143161 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C143161(HtJ<? super C143161> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BrowserViewerSession.this.acquireControl(null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$acquireControl$3", f = "BrowserViewerSession.kt", l = {MC.mwa_qpl_metadata.__CONFIG__}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$acquireControl$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<BrowserViewerPreference, HtJ<? super BrowserControlResult>, Object> {
        public final /* synthetic */ Host $host;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Host host, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$host = host;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass3 anonymousClass3 = BrowserViewerSession.this.new AnonymousClass3(this.$host, htJ);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            BrowserViewerPreference browserViewerPreference = (BrowserViewerPreference) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BrowserSessionController browserSessionController = BrowserViewerSession.this.controller;
                String str = this.$host.taskId;
                this.L$0 = null;
                this.label = 1;
                obj = browserSessionController.takeControl(str, browserViewerPreference, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(BrowserViewerPreference browserViewerPreference, HtJ<? super BrowserControlResult> htJ) {
            return ((AnonymousClass3) create(browserViewerPreference, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$acquireControl$5", f = "BrowserViewerSession.kt", l = {467}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$acquireControl$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC07127nr implements G0V<BrowserViewerPreference, HtJ<? super BrowserPresentResult>, Object> {
        public final /* synthetic */ Host $host;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Host host, HtJ<? super AnonymousClass5> htJ) {
            super(2, htJ);
            this.$host = host;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass5 anonymousClass5 = BrowserViewerSession.this.new AnonymousClass5(this.$host, htJ);
            anonymousClass5.L$0 = obj;
            return anonymousClass5;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            BrowserViewerPreference browserViewerPreference = (BrowserViewerPreference) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BrowserSessionController browserSessionController = BrowserViewerSession.this.controller;
                String str = this.$host.taskId;
                this.L$0 = null;
                this.label = 1;
                obj = browserSessionController.presentTask(str, browserViewerPreference, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(BrowserViewerPreference browserViewerPreference, HtJ<? super BrowserPresentResult> htJ) {
            return ((AnonymousClass5) create(browserViewerPreference, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession", f = "BrowserViewerSession.kt", l = {627}, m = "boundedRequest", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$boundedRequest$1, reason: invalid class name and case insensitive filesystem */
    public final class C143171<T> extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C143171(HtJ<? super C143171> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BrowserViewerSession.this.boundedRequest(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$boundedRequest$2", f = "BrowserViewerSession.kt", l = {627}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$boundedRequest$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2<T> extends AbstractC07127nr implements G0V<C3UX, HtJ<? super T>, Object> {
        public final /* synthetic */ G0U<HtJ<? super T>, Object> $request;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(G0U<? super HtJ<? super T>, ? extends Object> g0u, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$request = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$request, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                G0U<HtJ<? super T>, Object> g0u = this.$request;
                this.label = 1;
                obj = g0u.invoke(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super T> htJ) {
            return new AnonymousClass2(this.$request, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$clearUserData$1", f = "BrowserViewerSession.kt", l = {337}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$clearUserData$1, reason: invalid class name and case insensitive filesystem */
    public final class C143181 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$clearUserData$1$1", f = "BrowserViewerSession.kt", l = {338}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$clearUserData$1$1, reason: invalid class name and collision with other inner class name */
        public final class C04361 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Long>, Object> {
            public int label;
            public final /* synthetic */ BrowserViewerSession this$0;

            @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$clearUserData$1$1$1", f = "BrowserViewerSession.kt", l = {959, 341}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$clearUserData$1$1$1, reason: invalid class name and collision with other inner class name */
            public final class C04371 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Long>, Object> {
                public Object L$0;
                public Object L$1;
                public Object L$2;
                public Object L$3;
                public Object L$4;
                public int label;
                public final /* synthetic */ BrowserViewerSession this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C04371(BrowserViewerSession browserViewerSession, HtJ<? super C04371> htJ) {
                    super(2, htJ);
                    this.this$0 = browserViewerSession;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    return new C04371(this.this$0, htJ);
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x005d A[Catch: all -> 0x0094, TryCatch #1 {all -> 0x0094, blocks: (B:15:0x0057, B:17:0x005d, B:20:0x007d), top: B:30:0x0057 }] */
                @Override // X.AbstractC8884Fsp
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
                    /*
                        r10 = this;
                        X.Hji r8 = X.EnumC10460Hji.A02
                        int r1 = r10.label
                        r7 = 0
                        r3 = 2
                        r0 = 1
                        r5 = 0
                        if (r1 == 0) goto L2f
                        if (r1 == r0) goto L23
                        if (r1 != r3) goto L1e
                        java.lang.Object r9 = r10.L$2
                        java.util.Iterator r9 = (java.util.Iterator) r9
                        java.lang.Object r6 = r10.L$1
                        com.facebook.aura.vmbrowser.runtime.BrowserViewerSession r6 = (com.facebook.aura.vmbrowser.runtime.BrowserViewerSession) r6
                        java.lang.Object r4 = r10.L$0
                        X.BLa r4 = (X.InterfaceC2261BLa) r4
                        X.Hwg.A00(r11)     // Catch: java.lang.Throwable -> L92
                        goto L57
                    L1e:
                        java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                        throw r0
                    L23:
                        java.lang.Object r6 = r10.L$1
                        com.facebook.aura.vmbrowser.runtime.BrowserViewerSession r6 = (com.facebook.aura.vmbrowser.runtime.BrowserViewerSession) r6
                        java.lang.Object r4 = r10.L$0
                        X.BLa r4 = (X.InterfaceC2261BLa) r4
                        X.Hwg.A00(r11)
                        goto L43
                    L2f:
                        X.Hwg.A00(r11)
                        com.facebook.aura.vmbrowser.runtime.BrowserViewerSession r6 = r10.this$0
                        X.BLa r4 = r6.mutations
                        r10.L$0 = r4
                        r10.L$1 = r6
                        r10.label = r0
                        java.lang.Object r0 = r4.APs(r5, r10)
                        if (r0 != r8) goto L43
                        return r8
                    L43:
                        java.lang.String r1 = r6.heldTaskId     // Catch: java.lang.Throwable -> L92
                        java.lang.String r0 = r6.attemptedTakeoverTaskId     // Catch: java.lang.Throwable -> L92
                        java.lang.String[] r0 = new java.lang.String[]{r1, r0}     // Catch: java.lang.Throwable -> L92
                        java.util.List r0 = X.BFI.A0F(r0)     // Catch: java.lang.Throwable -> L92
                        java.util.List r0 = X.AbstractC0878AGe.A0T(r0)     // Catch: java.lang.Throwable -> L92
                        java.util.Iterator r9 = r0.iterator()     // Catch: java.lang.Throwable -> L92
                    L57:
                        boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> L94
                        if (r0 == 0) goto L7d
                        java.lang.String r2 = X.AnonymousClass005.A0j(r9)     // Catch: java.lang.Throwable -> L94
                        java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L94
                        com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$clearUserData$1$1$1$1$1 r0 = new com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$clearUserData$1$1$1$1$1     // Catch: java.lang.Throwable -> L94
                        r0.<init>(r6, r2, r5)     // Catch: java.lang.Throwable -> L94
                        r10.L$0 = r4     // Catch: java.lang.Throwable -> L94
                        r10.L$1 = r6     // Catch: java.lang.Throwable -> L94
                        r10.L$2 = r9     // Catch: java.lang.Throwable -> L94
                        r10.L$3 = r5     // Catch: java.lang.Throwable -> L94
                        r10.L$4 = r5     // Catch: java.lang.Throwable -> L94
                        r10.label = r3     // Catch: java.lang.Throwable -> L94
                        java.lang.Object r0 = com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.access$boundedRequest(r6, r1, r0, r10)     // Catch: java.lang.Throwable -> L94
                        if (r0 != r8) goto L57
                        return r8
                    L7d:
                        r6.heldTaskId = r5     // Catch: java.lang.Throwable -> L94
                        r6.attemptedTakeoverTaskId = r5     // Catch: java.lang.Throwable -> L94
                        r6.releasePending = r7     // Catch: java.lang.Throwable -> L94
                        long r2 = r6.controlGeneration     // Catch: java.lang.Throwable -> L94
                        r0 = 1
                        long r0 = r0 + r2
                        r6.controlGeneration = r0     // Catch: java.lang.Throwable -> L94
                        java.lang.Long r8 = X.C3cG.A0S(r2)     // Catch: java.lang.Throwable -> L94
                        r4.Ahe(r5)
                        return r8
                    L92:
                        r0 = move-exception
                        goto L95
                    L94:
                        r0 = move-exception
                    L95:
                        r4.Ahe(r5)
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.C143181.C04361.C04371.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // X.G0V
                public final Object invoke(C3UX c3ux, HtJ<? super Long> htJ) {
                    return new C04371(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04361(BrowserViewerSession browserViewerSession, HtJ<? super C04361> htJ) {
                super(2, htJ);
                this.this$0 = browserViewerSession;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C04361(this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    C04371 c04371 = new C04371(this.this$0, null);
                    this.label = 1;
                    obj = GAX.A01(this, c04371, BrowserViewerSession.LOGOUT_CLEANUP_TIMEOUT_MS);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                return obj;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Long> htJ) {
                return new C04361(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C143181(HtJ<? super C143181> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return BrowserViewerSession.this.new C143181(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HoC hoC;
            BLG<Boolean> blg;
            G0U<Boolean, Unit> g0u;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        Hwg.A00(obj);
                        KeyboardRegistration keyboardRegistration = BrowserViewerSession.this.keyboardRegistration;
                        if (keyboardRegistration != null && (g0u = keyboardRegistration.onFocus) != null) {
                            AnonymousClass001.A1K(false, g0u);
                        }
                        Host host = BrowserViewerSession.this.owner;
                        if (host != null) {
                            host.disposed = true;
                        }
                        Host host2 = BrowserViewerSession.this.owner;
                        if (host2 != null && (blg = host2.render) != null) {
                            AnonymousClass003.A14(blg, false);
                        }
                        Host host3 = BrowserViewerSession.this.owner;
                        if (host3 != null && (hoC = host3.resizeJob) != null) {
                            hoC.A5w(null);
                        }
                        BrowserViewerSession.this.owner = null;
                        HoC hoC2 = BrowserViewerSession.this.heartbeatJob;
                        if (hoC2 != null) {
                            hoC2.A5w(null);
                        }
                        HoC hoC3 = BrowserViewerSession.this.releaseRetryJob;
                        if (hoC3 != null) {
                            hoC3.A5w(null);
                        }
                        BLG<Boolean> blg2 = BrowserViewerSession.this._isUserControlled;
                        Boolean boolA0h = AnonymousClass001.A0h();
                        AnonymousClass001.A1E(blg2, null, boolA0h);
                        AnonymousClass001.A1E(BrowserViewerSession.this._isInTakeControl, null, boolA0h);
                        AnonymousClass001.A1E(BrowserViewerSession.this._isPreviewScreenLive, null, boolA0h);
                        AnonymousClass001.A1E(BrowserViewerSession.this._controlConflict, null, boolA0h);
                        BrowserViewerSession browserViewerSession = BrowserViewerSession.this;
                        browserViewerSession.takeoverId = null;
                        browserViewerSession.keyboardRegistration = null;
                        HwK hwK = HwK.A00;
                        C04361 c04361 = new C04361(BrowserViewerSession.this, null);
                        this.label = 1;
                        if (GAo.A00(this, hwK, c04361) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    CFK.A0A("BrowserViewerSession", "Browser control cleanup failed", e2);
                }
                Hxb.A03(null, BrowserViewerSession.this.cleanupScope);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                Hxb.A03(null, BrowserViewerSession.this.cleanupScope);
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return BrowserViewerSession.this.new C143181(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$closeViewer$1", f = "BrowserViewerSession.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$closeViewer$1, reason: invalid class name and case insensitive filesystem */
    public final class C143191 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $expectedTaskId;
        public int label;
        public final /* synthetic */ BrowserViewerSession this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143191(String str, BrowserViewerSession browserViewerSession, HtJ<? super C143191> htJ) {
            super(1, htJ);
            this.$expectedTaskId = str;
            this.this$0 = browserViewerSession;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new C143191(this.$expectedTaskId, this.this$0, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            /*
                r2 = this;
                int r0 = r2.label
                if (r0 != 0) goto L25
                X.Hwg.A00(r3)
                java.lang.String r0 = r2.$expectedTaskId
                if (r0 == 0) goto L1b
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession r0 = r2.this$0
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$Host r0 = r0.owner
                if (r0 == 0) goto L23
                java.lang.String r1 = r0.taskId
            L13:
                java.lang.String r0 = r2.$expectedTaskId
                boolean r0 = X.C7384Etj.areEqual(r1, r0)
                if (r0 == 0) goto L20
            L1b:
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession r0 = r2.this$0
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.access$closeCurrent(r0)
            L20:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L23:
                r1 = 0
                goto L13
            L25:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.C143191.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C143191) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$copyToDevice$2", f = "BrowserViewerSession.kt", l = {785}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$copyToDevice$2, reason: invalid class name and case insensitive filesystem */
    public final class C143202 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super BrowserDeviceCopyResult>, Object> {
        public final /* synthetic */ BrowserClipboardTelemetry.Attempt $attempt;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143202(BrowserClipboardTelemetry.Attempt attempt, HtJ<? super C143202> htJ) {
            super(2, htJ);
            this.$attempt = attempt;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return BrowserViewerSession.this.new C143202(this.$attempt, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Host host;
            String str;
            String gatewayUrl;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    BrowserViewerSession browserViewerSession = BrowserViewerSession.this;
                    if (browserViewerSession.heartbeatPending) {
                        return BrowserDeviceCopyResult.TryAgain.INSTANCE;
                    }
                    if (browserViewerSession.canControl() && (host = BrowserViewerSession.this.owner) != null && (str = BrowserViewerSession.this.takeoverId) != null && !C7BY.A0j(str)) {
                        gatewayUrl = BrowserViewerSession.this.gatewayPrefs.getGatewayUrl();
                        if (!C7BY.A0j(gatewayUrl) && gatewayUrl != null) {
                            BrowserDeviceClipboard browserDeviceClipboard = BrowserViewerSession.this.deviceClipboard;
                            String str2 = host.taskId;
                            this.L$0 = host;
                            this.L$1 = str;
                            this.L$2 = gatewayUrl;
                            this.label = 1;
                            obj = browserDeviceClipboard.copy(str2, str, gatewayUrl, this);
                            if (obj == enumC10460Hji) {
                                return enumC10460Hji;
                            }
                        }
                    }
                    return BrowserDeviceCopyResult.Blocked.INSTANCE;
                }
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                gatewayUrl = (String) this.L$2;
                str = (String) this.L$1;
                host = (Host) this.L$0;
                Hwg.A00(obj);
                if (BrowserViewerSession.this.canSettleDeviceClipboardAction(host, str, gatewayUrl)) {
                    return obj;
                }
                BrowserViewerSession.this.clipboardTelemetry.finishAttempt(this.$attempt, BrowserClipboardTelemetry.Outcome.CANCELLED, BrowserClipboardTelemetry.Stage.REMOTE_RESPONSE, BrowserClipboardTelemetry.ClosedReason.CONTEXT_CHANGED, null);
                return BrowserDeviceCopyResult.Blocked.INSTANCE;
            } catch (CancellationException e) {
                BrowserViewerSession.this.clipboardTelemetry.finishAttempt(this.$attempt, BrowserClipboardTelemetry.Outcome.CANCELLED, BrowserClipboardTelemetry.Stage.REMOTE_RESPONSE, BrowserClipboardTelemetry.ClosedReason.CONTEXT_CHANGED, null);
                throw e;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super BrowserDeviceCopyResult> htJ) {
            return ((C143202) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$dismissKeyboard$1", f = "BrowserViewerSession.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$dismissKeyboard$1, reason: invalid class name and case insensitive filesystem */
    public final class C143211 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Object $epoch;
        public final /* synthetic */ KeyboardRegistration $registration;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143211(KeyboardRegistration keyboardRegistration, Object obj, HtJ<? super C143211> htJ) {
            super(2, htJ);
            this.$registration = keyboardRegistration;
            this.$epoch = obj;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return BrowserViewerSession.this.new C143211(this.$registration, this.$epoch, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            KeyboardRegistration keyboardRegistration;
            G0U<Boolean, Unit> g0u;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            if (BrowserViewerSession.this.keyboardRegistration == this.$registration && BrowserViewerSession.this.keyboardEpoch == this.$epoch && (keyboardRegistration = this.$registration) != null && (g0u = keyboardRegistration.onFocus) != null) {
                AnonymousClass001.A1K(false, g0u);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C143211) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$handBackControl$1", f = "BrowserViewerSession.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$handBackControl$1, reason: invalid class name and case insensitive filesystem */
    public final class C143221 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public int label;

        public C143221(HtJ<? super C143221> htJ) {
            super(1, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return BrowserViewerSession.this.new C143221(htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return BrowserViewerSession.this.new C143221(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            Host host = BrowserViewerSession.this.owner;
            if (host != null) {
                host.updateViewOnly(true);
            } else {
                BrowserViewerSession.this.queueRelease();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$launchOperation$2", f = "BrowserViewerSession.kt", l = {936}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$launchOperation$2, reason: invalid class name and case insensitive filesystem */
    public final class C143232 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $block;
        public final /* synthetic */ Function0<Unit> $onFailure;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C143232(G0U<? super HtJ<? super Unit>, ? extends Object> g0u, Function0<Unit> function0, HtJ<? super C143232> htJ) {
            super(2, htJ);
            this.$block = g0u;
            this.$onFailure = function0;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return BrowserViewerSession.this.new C143232(this.$block, this.$onFailure, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0A("BrowserViewerSession", "Browser viewer operation failed", e2);
                if (!BrowserViewerSession.this.closed) {
                    this.$onFailure.invoke();
                }
                BrowserViewerSession.this.updateInput();
            }
            if (i == 0) {
                Hwg.A00(obj);
                if (!BrowserViewerSession.this.closed) {
                    G0U<HtJ<? super Unit>, Object> g0u = this.$block;
                    this.label = 1;
                    if (g0u.invoke(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C143232) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$onBrowserInputFocus$1", f = "BrowserViewerSession.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$onBrowserInputFocus$1, reason: invalid class name and case insensitive filesystem */
    public final class C143241 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Object $epoch;
        public final /* synthetic */ BrowserInputFocusEvent $event;
        public final /* synthetic */ KeyboardRegistration $registration;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143241(KeyboardRegistration keyboardRegistration, Object obj, BrowserInputFocusEvent browserInputFocusEvent, HtJ<? super C143241> htJ) {
            super(2, htJ);
            this.$registration = keyboardRegistration;
            this.$epoch = obj;
            this.$event = browserInputFocusEvent;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return BrowserViewerSession.this.new C143241(this.$registration, this.$epoch, this.$event, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            if (BrowserViewerSession.this.keyboardRegistration == this.$registration && BrowserViewerSession.this.keyboardEpoch == this.$epoch && AnonymousClass003.A1Y(this.$event.isCurrentContext) && BrowserViewerSession.this.canControl() && C7384Etj.areEqual(this.$event.takeoverId, BrowserViewerSession.this.takeoverId)) {
                AnonymousClass001.A1K(this.$event.focused, this.$registration.onFocus);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C143241) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$pasteFromDevice$2", f = "BrowserViewerSession.kt", l = {824}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$pasteFromDevice$2, reason: invalid class name and case insensitive filesystem */
    public final class C143252 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super BrowserDevicePasteResult>, Object> {
        public final /* synthetic */ BrowserClipboardTelemetry.Attempt $attempt;
        public final /* synthetic */ String $text;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143252(BrowserClipboardTelemetry.Attempt attempt, String str, HtJ<? super C143252> htJ) {
            super(2, htJ);
            this.$attempt = attempt;
            this.$text = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return BrowserViewerSession.this.new C143252(this.$attempt, this.$text, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Host host;
            String str;
            String gatewayUrl;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    BrowserViewerSession browserViewerSession = BrowserViewerSession.this;
                    if (browserViewerSession.heartbeatPending) {
                        return BrowserDevicePasteResult.TRY_AGAIN;
                    }
                    if (browserViewerSession.canControl() && (host = BrowserViewerSession.this.owner) != null && (str = BrowserViewerSession.this.takeoverId) != null && !C7BY.A0j(str)) {
                        gatewayUrl = BrowserViewerSession.this.gatewayPrefs.getGatewayUrl();
                        if (!C7BY.A0j(gatewayUrl) && gatewayUrl != null) {
                            BrowserViewerSession.this.clipboardTelemetry.markRemoteDispatch(this.$attempt);
                            BrowserDeviceClipboard browserDeviceClipboard = BrowserViewerSession.this.deviceClipboard;
                            String str2 = host.taskId;
                            String str3 = this.$text;
                            this.L$0 = host;
                            this.L$1 = str;
                            this.L$2 = gatewayUrl;
                            this.label = 1;
                            obj = browserDeviceClipboard.paste(str2, str, gatewayUrl, str3, this);
                            if (obj == enumC10460Hji) {
                                return enumC10460Hji;
                            }
                        }
                    }
                    return BrowserDevicePasteResult.BLOCKED;
                }
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                gatewayUrl = (String) this.L$2;
                str = (String) this.L$1;
                host = (Host) this.L$0;
                Hwg.A00(obj);
                if (BrowserViewerSession.this.canSettleDeviceClipboardAction(host, str, gatewayUrl)) {
                    return obj;
                }
                BrowserDevicePasteResult browserDevicePasteResult = BrowserDevicePasteResult.UNAVAILABLE;
                if (obj == browserDevicePasteResult) {
                    return browserDevicePasteResult;
                }
                BrowserViewerSession.this.clipboardTelemetry.finishAttempt(this.$attempt, BrowserClipboardTelemetry.Outcome.OUTCOME_UNKNOWN, BrowserClipboardTelemetry.Stage.REMOTE_DISPATCH, BrowserClipboardTelemetry.ClosedReason.CONTEXT_CHANGED, null);
                return BrowserDevicePasteResult.OUTCOME_UNKNOWN;
            } catch (CancellationException e) {
                BrowserViewerSession.this.clipboardTelemetry.finishAttempt(this.$attempt, BrowserClipboardTelemetry.Outcome.OUTCOME_UNKNOWN, BrowserClipboardTelemetry.Stage.REMOTE_DISPATCH, BrowserClipboardTelemetry.ClosedReason.CONTEXT_CHANGED, null);
                throw e;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super BrowserDevicePasteResult> htJ) {
            return ((C143252) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession", f = "BrowserViewerSession.kt", l = {382, 393, 399}, m = "prepareLocked", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$prepareLocked$1, reason: invalid class name and case insensitive filesystem */
    public final class C143261 extends HzP {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C143261(HtJ<? super C143261> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BrowserViewerSession.this.prepareLocked(null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$prepareLocked$4", f = "BrowserViewerSession.kt", l = {405}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$prepareLocked$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<BrowserViewerPreference, HtJ<? super BrowserPresentResult>, Object> {
        public final /* synthetic */ Host $host;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Host host, HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
            this.$host = host;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass4 anonymousClass4 = BrowserViewerSession.this.new AnonymousClass4(this.$host, htJ);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            BrowserViewerPreference browserViewerPreference = (BrowserViewerPreference) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BrowserSessionController browserSessionController = BrowserViewerSession.this.controller;
                String str = this.$host.taskId;
                this.L$0 = null;
                this.label = 1;
                obj = browserSessionController.presentTask(str, browserViewerPreference, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(BrowserViewerPreference browserViewerPreference, HtJ<? super BrowserPresentResult> htJ) {
            return ((AnonymousClass4) create(browserViewerPreference, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$prepareMode$2", f = "BrowserViewerSession.kt", l = {959, 363}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$prepareMode$2, reason: invalid class name and case insensitive filesystem */
    public final class C143272 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $generation;
        public final /* synthetic */ Host $host;
        public final /* synthetic */ boolean $retryStream;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143272(Host host, long j, boolean z, HtJ<? super C143272> htJ) {
            super(1, htJ);
            this.$host = host;
            this.$generation = j;
            this.$retryStream = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return BrowserViewerSession.this.new C143272(this.$host, this.$generation, this.$retryStream, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [X.BLa] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v4, types: [X.BLa] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                X.Hji r3 = X.EnumC10460Hji.A02
                int r1 = r10.label
                r2 = 2
                r0 = 1
                r9 = 0
                if (r1 == 0) goto L29
                if (r1 == r0) goto L17
                if (r1 != r2) goto L12
                java.lang.Object r1 = r10.L$0
                X.BLa r1 = (X.InterfaceC2261BLa) r1
                goto L5b
            L12:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L17:
                long r7 = r10.J$0
                java.lang.Object r6 = r10.L$2
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$Host r6 = (com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.Host) r6
                java.lang.Object r5 = r10.L$1
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession r5 = (com.facebook.aura.vmbrowser.runtime.BrowserViewerSession) r5
                java.lang.Object r1 = r10.L$0
                X.BLa r1 = (X.InterfaceC2261BLa) r1
                X.Hwg.A00(r11)
                goto L45
            L29:
                X.Hwg.A00(r11)
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession r5 = com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.this
                X.BLa r1 = r5.mutations
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$Host r6 = r10.$host
                long r7 = r10.$generation
                r10.L$0 = r1
                r10.L$1 = r5
                r10.L$2 = r6
                r10.J$0 = r7
                r10.label = r0
                java.lang.Object r0 = r1.APs(r9, r10)
                if (r0 != r3) goto L45
                return r3
            L45:
                X.HwK r0 = X.HwK.A00     // Catch: java.lang.Throwable -> L9a
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$prepareMode$2$result$1$1 r4 = new com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$prepareMode$2$result$1$1     // Catch: java.lang.Throwable -> L9a
                r4.<init>(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L9a
                r10.L$0 = r1     // Catch: java.lang.Throwable -> L9a
                r10.L$1 = r9     // Catch: java.lang.Throwable -> L9a
                r10.L$2 = r9     // Catch: java.lang.Throwable -> L9a
                r10.label = r2     // Catch: java.lang.Throwable -> L9a
                java.lang.Object r11 = X.GAo.A00(r10, r0, r4)     // Catch: java.lang.Throwable -> L9a
                if (r11 != r3) goto L5e
                return r3
            L5b:
                X.Hwg.A00(r11)     // Catch: java.lang.Throwable -> L9a
            L5e:
                com.facebook.aura.browsertask.control.BrowserPresentResult r11 = (com.facebook.aura.browsertask.control.BrowserPresentResult) r11     // Catch: java.lang.Throwable -> L9a
                r1.Ahe(r9)
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$Host r2 = r10.$host
                long r0 = r10.$generation
                boolean r0 = r2.isCurrentMode$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime(r0)
                if (r0 == 0) goto L8f
                boolean r0 = r11 instanceof com.facebook.aura.browsertask.control.BrowserPresentResult.Presented
                if (r0 == 0) goto L8f
                boolean r0 = r10.$retryStream
                if (r0 == 0) goto L92
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession r0 = com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.this
                com.facebook.aura.vmbrowser.runtime.BrowserSessionController r0 = r0.controller
                X.1BN<java.lang.Boolean> r0 = r0.isConnected
                boolean r0 = X.C3cH.A1R(r0)
                if (r0 != 0) goto L92
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession r0 = com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.this
                com.facebook.aura.vmbrowser.runtime.BrowserSessionController r0 = r0.controller
                r0.retryStream()
            L88:
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession r1 = com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.this
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$Host r0 = r10.$host
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.access$scheduleResize(r1, r0)
            L8f:
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                return r3
            L92:
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession r0 = com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.this
                com.facebook.aura.vmbrowser.runtime.BrowserSessionController r0 = r0.controller
                r0.resumeStream()
                goto L88
            L9a:
                r0 = move-exception
                r1.Ahe(r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.C143272.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C143272) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$queueRelease$1", f = "BrowserViewerSession.kt", l = {959, 646}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$queueRelease$1, reason: invalid class name and case insensitive filesystem */
    public final class C143281 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $generation;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143281(long j, HtJ<? super C143281> htJ) {
            super(1, htJ);
            this.$generation = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return BrowserViewerSession.this.new C143281(this.$generation, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Throwable {
            BrowserViewerSession browserViewerSession;
            InterfaceC2261BLa interfaceC2261BLa;
            long j;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    browserViewerSession = BrowserViewerSession.this;
                    interfaceC2261BLa = browserViewerSession.mutations;
                    j = this.$generation;
                    this.L$0 = interfaceC2261BLa;
                    this.L$1 = browserViewerSession;
                    this.J$0 = j;
                    this.label = 1;
                    if (interfaceC2261BLa.APs(null, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw AnonymousClass001.A0n();
                        }
                        interfaceC2261BLa = (InterfaceC2261BLa) this.L$0;
                        try {
                            Hwg.A00(obj);
                            Unit unit = Unit.INSTANCE;
                            interfaceC2261BLa.Ahe(null);
                            return unit;
                        } catch (Throwable th) {
                            th = th;
                            interfaceC2261BLa.Ahe(null);
                            throw th;
                        }
                    }
                    j = this.J$0;
                    browserViewerSession = (BrowserViewerSession) this.L$1;
                    interfaceC2261BLa = (InterfaceC2261BLa) this.L$0;
                    Hwg.A00(obj);
                }
                HwK hwK = HwK.A00;
                BrowserViewerSession$queueRelease$1$1$1 browserViewerSession$queueRelease$1$1$1 = new BrowserViewerSession$queueRelease$1$1$1(j, browserViewerSession, null);
                this.L$0 = interfaceC2261BLa;
                this.L$1 = null;
                this.label = 2;
                if (GAo.A00(this, hwK, browserViewerSession$queueRelease$1$1$1) == enumC10460Hji) {
                    return enumC10460Hji;
                }
                Unit unit2 = Unit.INSTANCE;
                interfaceC2261BLa.Ahe(null);
                return unit2;
            } catch (Throwable th2) {
                th = th2;
                interfaceC2261BLa.Ahe(null);
                throw th;
            }
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C143281) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession", f = "BrowserViewerSession.kt", l = {666}, m = "releaseHeldControl", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$releaseHeldControl$1, reason: invalid class name and case insensitive filesystem */
    public final class C143291 extends HzP {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C143291(HtJ<? super C143291> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BrowserViewerSession.this.releaseHeldControl(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession", f = "BrowserViewerSession.kt", l = {916, 924}, m = "renewControl", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$renewControl$1, reason: invalid class name and case insensitive filesystem */
    public final class C143301 extends HzP {
        public int I$0;
        public long J$0;
        public long J$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C143301(HtJ<? super C143301> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BrowserViewerSession.this.renewControl(null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$retry$1", f = "BrowserViewerSession.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$retry$1, reason: invalid class name and case insensitive filesystem */
    public final class C143311 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public int label;

        public C143311(HtJ<? super C143311> htJ) {
            super(1, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return BrowserViewerSession.this.new C143311(htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return BrowserViewerSession.this.new C143311(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            Host host = BrowserViewerSession.this.owner;
            if (host != null && host.canRetry$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime()) {
                BrowserViewerSession.this.controller.clearStreamFailure();
                AnonymousClass001.A1E(BrowserViewerSession.this._controlConflict, C3cG.A0V(BrowserViewerSession.this._failed, false), false);
                host.presentationConfirmed = false;
                BrowserViewerSession.this.updateInput();
                BrowserViewerSession.this.prepareMode(host, true);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$scheduleReleaseRetry$1", f = "BrowserViewerSession.kt", l = {687, 959, 689, 969}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$scheduleReleaseRetry$1, reason: invalid class name and case insensitive filesystem */
    public final class C143321 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $generation;
        public final /* synthetic */ String $taskId;
        public int I$0;
        public int I$1;
        public long J$0;
        public long J$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143321(long j, String str, HtJ<? super C143321> htJ) {
            super(1, htJ);
            this.$generation = j;
            this.$taskId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return BrowserViewerSession.this.new C143321(this.$generation, this.$taskId, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x009e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00cc  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00ba -> B:27:0x00c0). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 257
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.C143321.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C143321) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$scheduleResize$2", f = "BrowserViewerSession.kt", l = {MC.hatch_android_login.__CONFIG__, 959, 572}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$scheduleResize$2, reason: invalid class name and case insensitive filesystem */
    public final class C143332 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $generation;
        public final /* synthetic */ Host $host;
        public long J$0;
        public long J$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public final /* synthetic */ BrowserViewerSession this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143332(Host host, long j, BrowserViewerSession browserViewerSession, HtJ<? super C143332> htJ) {
            super(1, htJ);
            this.$host = host;
            this.$generation = j;
            this.this$0 = browserViewerSession;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new C143332(this.$host, this.$generation, this.this$0, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:43:? A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0095 -> B:28:0x009b). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r14.label
                r4 = 3
                r3 = 2
                r2 = 1
                r13 = 0
                if (r0 == 0) goto L2f
                if (r0 == r2) goto L2f
                if (r0 == r3) goto L1b
                if (r0 != r4) goto L16
                java.lang.Object r6 = r14.L$0
                X.BLa r6 = (X.InterfaceC2261BLa) r6
                goto L98
            L16:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L1b:
                long r10 = r14.J$1
                long r0 = r14.J$0
                java.lang.Object r12 = r14.L$2
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession r12 = (com.facebook.aura.vmbrowser.runtime.BrowserViewerSession) r12
                java.lang.Object r9 = r14.L$1
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$Host r9 = (com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.Host) r9
                java.lang.Object r6 = r14.L$0
                X.BLa r6 = (X.InterfaceC2261BLa) r6
                X.Hwg.A00(r15)
                goto L80
            L2f:
                X.Hwg.A00(r15)
            L32:
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$Host r6 = r14.$host
                long r0 = r14.$generation
                boolean r0 = r6.isCurrentMode$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime(r0)
                if (r0 == 0) goto La4
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$Host r0 = r14.$host
                com.facebook.aura.browsertask.control.BrowserViewerPreference r1 = r0.preference
                com.facebook.aura.browsertask.control.BrowserViewerPreference r0 = r0.submitted
                boolean r0 = X.C7384Etj.areEqual(r1, r0)
                if (r0 != 0) goto La4
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$Host r9 = r14.$host
                long r0 = r9.measuredAtMs
                r6 = 250(0xfa, double:1.235E-321)
                long r0 = r0 + r6
                long r6 = android.os.SystemClock.uptimeMillis()
                long r0 = r0 - r6
                r7 = 0
                int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r6 <= 0) goto L67
                r14.L$0 = r13
                r14.J$0 = r0
                r14.label = r2
                java.lang.Object r0 = X.C7Bq.A01(r0, r14)
                if (r0 != r5) goto L32
                return r5
            L67:
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession r12 = r14.this$0
                X.BLa r6 = r12.mutations
                long r10 = r14.$generation
                r14.L$0 = r6
                r14.L$1 = r9
                r14.L$2 = r12
                r14.J$0 = r0
                r14.J$1 = r10
                r14.label = r3
                java.lang.Object r7 = r6.APs(r13, r14)
                if (r7 != r5) goto L80
                return r5
            L80:
                X.HwK r7 = X.HwK.A00     // Catch: java.lang.Throwable -> La8
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$scheduleResize$2$accepted$1$1 r8 = new com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$scheduleResize$2$accepted$1$1     // Catch: java.lang.Throwable -> La8
                r8.<init>(r9, r10, r12, r13)     // Catch: java.lang.Throwable -> La8
                r14.L$0 = r6     // Catch: java.lang.Throwable -> La8
                r14.L$1 = r13     // Catch: java.lang.Throwable -> La8
                r14.L$2 = r13     // Catch: java.lang.Throwable -> La8
                r14.J$0 = r0     // Catch: java.lang.Throwable -> La8
                r14.label = r4     // Catch: java.lang.Throwable -> La8
                java.lang.Object r15 = X.GAo.A00(r14, r7, r8)     // Catch: java.lang.Throwable -> La8
                if (r15 != r5) goto L9b
                goto La7
            L98:
                X.Hwg.A00(r15)     // Catch: java.lang.Throwable -> La8
            L9b:
                boolean r0 = X.AnonymousClass001.A1X(r15)     // Catch: java.lang.Throwable -> La8
                r6.Ahe(r13)
                if (r0 != 0) goto L32
            La4:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            La7:
                return r5
            La8:
                r0 = move-exception
                r6.Ahe(r13)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.C143332.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C143332) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$startHeartbeat$1", f = "BrowserViewerSession.kt", l = {868, 959, 877}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$startHeartbeat$1, reason: invalid class name and case insensitive filesystem */
    public final class C143341 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $generation;
        public final /* synthetic */ String $taskId;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143341(String str, long j, HtJ<? super C143341> htJ) {
            super(1, htJ);
            this.$taskId = str;
            this.$generation = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return BrowserViewerSession.this.new C143341(this.$taskId, this.$generation, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a9 -> B:30:0x00ac). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                X.Hji r1 = X.EnumC10460Hji.A02
                r2 = r17
                int r3 = r2.label
                r6 = 3
                r5 = 2
                r0 = 1
                r12 = 0
                if (r3 == 0) goto L32
                if (r3 == r0) goto L67
                if (r3 == r5) goto L20
                if (r3 != r6) goto L1b
                java.lang.Object r4 = r2.L$0
                X.BLa r4 = (X.InterfaceC2261BLa) r4
                X.Hwg.A00(r18)     // Catch: java.lang.Throwable -> Lb5
                goto Lac
            L1b:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L20:
                long r10 = r2.J$0
                java.lang.Object r9 = r2.L$2
                java.lang.String r9 = (java.lang.String) r9
                java.lang.Object r8 = r2.L$1
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession r8 = (com.facebook.aura.vmbrowser.runtime.BrowserViewerSession) r8
                java.lang.Object r4 = r2.L$0
                X.BLa r4 = (X.InterfaceC2261BLa) r4
                X.Hwg.A00(r18)
                goto L96
            L32:
                X.Hwg.A00(r18)
            L35:
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession r8 = com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.this
                java.lang.String r7 = r2.$taskId
                long r3 = r2.$generation
                boolean r3 = com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.access$canRenewControl(r8, r7, r3)
                if (r3 == 0) goto Lba
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession r3 = com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.this
                java.lang.Long r3 = r3.controlExpiresAtMs
                if (r3 == 0) goto Lb0
                long r13 = r3.longValue()
                long r3 = java.lang.System.currentTimeMillis()
                long r13 = r13 - r3
                r3 = 2
                long r13 = r13 / r3
                r15 = 0
                r17 = 600000(0x927c0, double:2.964394E-318)
                long r3 = X.ATD.A07(r13, r15, r17)
            L5c:
                r2.L$0 = r12
                r2.label = r0
                java.lang.Object r3 = X.C7Bq.A01(r3, r2)
                if (r3 != r1) goto L6a
                return r1
            L67:
                X.Hwg.A00(r18)
            L6a:
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession r8 = com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.this
                java.lang.String r7 = r2.$taskId
                long r3 = r2.$generation
                boolean r3 = com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.access$canRenewControl(r8, r7, r3)
                if (r3 == 0) goto Lba
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession r3 = com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.this
                r3.heartbeatPending = r0
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.access$updateInput(r3)
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession r8 = com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.this
                X.BLa r4 = r8.mutations
                java.lang.String r9 = r2.$taskId
                long r10 = r2.$generation
                r2.L$0 = r4
                r2.L$1 = r8
                r2.L$2 = r9
                r2.J$0 = r10
                r2.label = r5
                java.lang.Object r3 = r4.APs(r12, r2)
                if (r3 != r1) goto L96
                return r1
            L96:
                X.HwK r3 = X.HwK.A00     // Catch: java.lang.Throwable -> Lb5
                com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$startHeartbeat$1$2$1 r7 = new com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$startHeartbeat$1$2$1     // Catch: java.lang.Throwable -> Lb5
                r7.<init>(r8, r9, r10, r12)     // Catch: java.lang.Throwable -> Lb5
                r2.L$0 = r4     // Catch: java.lang.Throwable -> Lb5
                r2.L$1 = r12     // Catch: java.lang.Throwable -> Lb5
                r2.L$2 = r12     // Catch: java.lang.Throwable -> Lb5
                r2.label = r6     // Catch: java.lang.Throwable -> Lb5
                java.lang.Object r3 = X.GAo.A00(r2, r3, r7)     // Catch: java.lang.Throwable -> Lb5
                if (r3 != r1) goto Lac
                goto Lb4
            Lac:
                r4.Ahe(r12)
                goto L35
            Lb0:
                r3 = 300000(0x493e0, double:1.482197E-318)
                goto L5c
            Lb4:
                return r1
            Lb5:
                r0 = move-exception
                r4.Ahe(r12)
                throw r0
            Lba:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.C143341.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C143341) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession", f = "BrowserViewerSession.kt", l = {MC.muse_android_deeplink_security_controls.__CONFIG__, 618, 621}, m = "viewerRequest", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$viewerRequest$1, reason: invalid class name and case insensitive filesystem */
    public final class C143351<T> extends HzP {
        public int I$0;
        public int I$1;
        public long J$0;
        public long J$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C143351(HtJ<? super C143351> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BrowserViewerSession.this.viewerRequest(null, 0L, null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$viewerRequest$2", f = "BrowserViewerSession.kt", l = {621}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$viewerRequest$2, reason: invalid class name and case insensitive filesystem */
    public final class C143362<T> extends AbstractC07127nr implements G0U<HtJ<? super T>, Object> {
        public final /* synthetic */ G0V<BrowserViewerPreference, HtJ<? super T>, Object> $request;
        public final /* synthetic */ C10543Hqv<BrowserViewerPreference> $requested;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C143362(G0V<? super BrowserViewerPreference, ? super HtJ<? super T>, ? extends Object> g0v, C10543Hqv<BrowserViewerPreference> c10543Hqv, HtJ<? super C143362> htJ) {
            super(1, htJ);
            this.$request = g0v;
            this.$requested = c10543Hqv;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new C143362(this.$request, this.$requested, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                G0V<BrowserViewerPreference, HtJ<? super T>, Object> g0v = this.$request;
                BrowserViewerPreference browserViewerPreference = this.$requested.element;
                this.label = 1;
                obj = g0v.invoke(browserViewerPreference, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super T> htJ) {
            return ((C143362) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public BrowserViewerSession(BrowserSessionController browserSessionController, C3UX c3ux, AbstractC3358CGz abstractC3358CGz, BrowserClipboardTelemetry browserClipboardTelemetry, Function0<BrowserTaskPresentation> function0) {
        C7384Etj.A0Y(browserSessionController, 0);
        AnonymousClass005.A11(c3ux, abstractC3358CGz, browserClipboardTelemetry, 1);
        C7384Etj.A0Y(function0, 4);
        this.controller = browserSessionController;
        this.scope = c3ux;
        this.clipboardTelemetry = browserClipboardTelemetry;
        this.currentTask = function0;
        this.mutations = new C9258GBl();
        C8eO c8eO = new C8eO(null);
        GBK gbk = AuraDispatchers.mainImmediate;
        this.cleanupScope = Hxb.A02(C78W.A02(c8eO, gbk));
        this.keyboardEpoch = C3cG.A0T();
        this.deviceClipboard = new BrowserDeviceClipboard(abstractC3358CGz);
        C9286GCn c9286GCnA14 = C3cG.A14(false);
        this._isUserControlled = c9286GCnA14;
        this.isUserControlled = C3cG.A11(c9286GCnA14);
        C9286GCn c9286GCnA142 = C3cG.A14(false);
        this._isInTakeControl = c9286GCnA142;
        this.isInTakeControl = C3cG.A11(c9286GCnA142);
        C9286GCn c9286GCnA143 = C3cG.A14(false);
        this._isPreviewScreenLive = c9286GCnA143;
        this.isPreviewScreenLive = C3cG.A11(c9286GCnA143);
        C9286GCn c9286GCnA144 = C3cG.A14(false);
        this._controlConflict = c9286GCnA144;
        this.controlConflict = C3cG.A11(c9286GCnA144);
        C9286GCn c9286GCnA145 = C3cG.A14(false);
        this._failed = c9286GCnA145;
        this.failed = C3cG.A11(c9286GCnA145);
        this.inputFocusRegistration = BrowserInputFocusEvents.Companion.getInstance(abstractC3358CGz).register(new BrowserViewerSession$inputFocusRegistration$1(this), new BrowserViewerSession$inputFocusRegistration$2(this));
        C4oT c4oTUserPrefs = HatchPrefsStore.INSTANCE.userPrefs(abstractC3358CGz);
        this.prefs = c4oTUserPrefs;
        HatchGatewayPrefsStore hatchGatewayPrefsStoreA0D = C3cG.A0D(abstractC3358CGz);
        this.gatewayPrefs = hatchGatewayPrefsStoreA0D;
        this.currentVmId = C3cG.A0a(hatchGatewayPrefsStoreA0D);
        InterfaceC3137BzH interfaceC3137BzH = new InterfaceC3137BzH() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$$ExternalSyntheticLambda3
            @Override // X.InterfaceC3137BzH
            public final void onSharedPreferenceChanged(C4oT c4oT, String str) {
                BrowserViewerSession.vmChangeListener$lambda$0(this.f$0, c4oT, str);
            }
        };
        this.vmChangeListener = interfaceC3137BzH;
        c4oTUserPrefs.Aa2(interfaceC3137BzH);
        AnonymousClass001.A1I(gbk, new AnonymousClass1(null), c3ux);
    }

    public static final boolean acquireControl$lambda$0(BrowserControlResult browserControlResult) {
        C7384Etj.A0Y(browserControlResult, 0);
        return browserControlResult.equals(BrowserControlResult.Retry.INSTANCE);
    }

    public static final boolean acquireControl$lambda$1(BrowserPresentResult browserPresentResult) {
        C7384Etj.A0Y(browserPresentResult, 0);
        return browserPresentResult.equals(BrowserPresentResult.Retry.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBrowserInputFocus(BrowserInputFocusEvent browserInputFocusEvent) {
        KeyboardRegistration keyboardRegistration = this.keyboardRegistration;
        if (keyboardRegistration != null) {
            Object obj = this.keyboardEpoch;
            AnonymousClass001.A1I(AuraDispatchers.mainImmediate, new C143241(keyboardRegistration, obj, browserInputFocusEvent, null), this.scope);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2 A[PHI: r7 r8
  0x00a2: PHI (r7v1 com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$Host) = 
  (r7v0 com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$Host)
  (r7v0 com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$Host)
  (r7v2 com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$Host)
  (r7v2 com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$Host)
 binds: [B:27:0x0069, B:31:0x0077, B:37:0x0093, B:39:0x009a] A[DONT_GENERATE, DONT_INLINE]
  0x00a2: PHI (r8v1 long) = (r8v0 long), (r8v0 long), (r8v2 long), (r8v2 long) binds: [B:27:0x0069, B:31:0x0077, B:37:0x0093, B:39:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object prepareLocked(com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.Host r11, long r12, X.HtJ<? super com.facebook.aura.browsertask.control.BrowserPresentResult> r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.prepareLocked(com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$Host, long, X.HtJ):java.lang.Object");
    }

    public static final boolean prepareLocked$lambda$1(BrowserPresentResult browserPresentResult) {
        C7384Etj.A0Y(browserPresentResult, 0);
        return browserPresentResult.equals(BrowserPresentResult.Retry.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareMode(final Host host, boolean z) {
        final long j = host.modeGeneration;
        launchOperation(new Function0() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BrowserViewerSession.prepareMode$lambda$0(this.f$0, host, j);
            }
        }, new C143272(host, j, z, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queueRelease() {
        updateTakeoverId(null);
        dismissKeyboard();
        AnonymousClass003.A14(this._isUserControlled, false);
        this.controller.setInputEnabled(false);
        HoC hoC = this.heartbeatJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.heartbeatJob = null;
        if (this.heldTaskId == null) {
            String str = this.attemptedTakeoverTaskId;
            if (str == null) {
                return;
            }
            this.heldTaskId = str;
            this.attemptedTakeoverTaskId = null;
            C3cI.A1G(this);
        }
        this.releasePending = true;
        launchOperation(new BrowserViewerSession$$ExternalSyntheticLambda4(this), new C143281(this.controlGeneration, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00a1 -> B:12:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object renewControl(java.lang.String r14, long r15, X.HtJ<? super com.facebook.aura.browsertask.control.BrowserControlResult> r17) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.renewControl(java.lang.String, long, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleReleaseRetry() {
        String str;
        if (this.closed || !this.releasePending) {
            return;
        }
        HoC hoC = this.releaseRetryJob;
        if ((hoC == null || !hoC.isActive()) && (str = this.heldTaskId) != null) {
            this.releaseRetryJob = launchOperation(new BrowserViewerSession$$ExternalSyntheticLambda4(this), new C143321(this.controlGeneration, str, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleResize(final Host host) {
        final long j = host.modeGeneration;
        if (host.isCurrentMode$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime(j) && host.presentationConfirmed) {
            HoC hoC = host.resizeJob;
            if (hoC == null || !hoC.isActive()) {
                host.resizeJob = launchOperation(new Function0() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BrowserViewerSession.scheduleResize$lambda$0(host, this, j);
                    }
                }, new C143332(host, j, this, null));
            }
        }
    }

    private final void startHeartbeat(String str, BrowserControlLease browserControlLease) {
        HoC hoC = this.heartbeatJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.controlExpiresAtMs = browserControlLease != null ? browserControlLease.controlExpiresAtMs : null;
        this.heartbeatPending = false;
        this.heartbeatJob = launchOperation(new BrowserViewerSession$$ExternalSyntheticLambda4(this), new C143341(str, this.controlGeneration, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTakeoverId(BrowserControlLease browserControlLease) {
        String str;
        String str2 = null;
        if (browserControlLease != null && (str = browserControlLease.takeoverId) != null && !C7BY.A0j(str)) {
            str2 = str;
        }
        if (C7384Etj.areEqual(this.takeoverId, str2)) {
            return;
        }
        dismissKeyboard();
        this.controller.dismissClipboardMenu$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime();
        this.takeoverId = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00d8 -> B:14:0x0050). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object viewerRequest(com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.Host r12, long r13, T r15, X.G0U<? super T, java.lang.Boolean> r16, X.G0V<? super com.facebook.aura.browsertask.control.BrowserViewerPreference, ? super X.HtJ<? super T>, ? extends java.lang.Object> r17, X.HtJ<? super X.HxE<com.facebook.aura.browsertask.control.BrowserViewerPreference, ? extends T>> r18) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.viewerRequest(com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$Host, long, java.lang.Object, X.G0U, X.G0V, X.HtJ):java.lang.Object");
    }

    public final Function0<Boolean> captureClipboardActionContext() {
        final Host host;
        final String str;
        if (!this.heartbeatPending && (host = this.owner) != null && (str = this.takeoverId) != null && !C7BY.A0j(str)) {
            final String gatewayUrl = this.gatewayPrefs.getGatewayUrl();
            if (!C7BY.A0j(gatewayUrl) && gatewayUrl != null) {
                final long j = this.controlGeneration;
                final long j2 = host.modeGeneration;
                Function0<Boolean> function0 = new Function0() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(BrowserViewerSession.captureClipboardActionContext$lambda$2(this.f$0, host, str, gatewayUrl, j, j2));
                    }
                };
                if (AnonymousClass001.A1X(function0.invoke())) {
                    return function0;
                }
            }
        }
        return null;
    }

    public final Function0<Boolean> captureClipboardMenuContext() {
        final Host host = this.owner;
        if (host != null) {
            final String str = this.takeoverId;
            final long j = this.controlGeneration;
            final long j2 = host.modeGeneration;
            Function0<Boolean> function0 = new Function0() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(BrowserViewerSession.captureClipboardMenuContext$lambda$0(this.f$0, host, str, j, j2));
                }
            };
            if (AnonymousClass001.A1X(function0.invoke())) {
                return function0;
            }
        }
        return null;
    }

    public final void closeViewer(String str) {
        launchOperation(new BrowserViewerSession$$ExternalSyntheticLambda4(this), new C143191(str, this, null));
    }

    public final Host createHost(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        return new Host(this, str, z);
    }

    public final void handBackControl() {
        launchOperation(new BrowserViewerSession$$ExternalSyntheticLambda4(this), new C143221(null));
    }

    public final AutoCloseable registerKeyboard(G0U<? super Boolean, Unit> g0u) {
        G0U<Boolean, Unit> g0u2;
        C7384Etj.A0Y(g0u, 0);
        KeyboardRegistration keyboardRegistration = this.keyboardRegistration;
        if (keyboardRegistration != null && (g0u2 = keyboardRegistration.onFocus) != null) {
            AnonymousClass001.A1K(false, g0u2);
        }
        final KeyboardRegistration keyboardRegistration2 = new KeyboardRegistration(g0u);
        this.keyboardEpoch = C3cG.A0T();
        this.keyboardRegistration = keyboardRegistration2;
        return new AutoCloseable() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$$ExternalSyntheticLambda0
            @Override // java.lang.AutoCloseable
            public final void close() {
                BrowserViewerSession.registerKeyboard$lambda$0(this.f$0, keyboardRegistration2);
            }
        };
    }

    public final void retry() {
        launchOperation(new BrowserViewerSession$$ExternalSyntheticLambda4(this), new C143311(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object acquireControl(com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.Host r16, long r17, X.HtJ<? super com.facebook.aura.browsertask.control.BrowserPresentResult> r19) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.acquireControl(com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$Host, long, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object boundedRequest(T r6, X.G0U<? super X.HtJ<? super T>, ? extends java.lang.Object> r7, X.HtJ<? super T> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.C143171
            if (r0 == 0) goto L3d
            r4 = r8
            com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$boundedRequest$1 r4 = (com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.C143171) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r2 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L25
            if (r0 != r1) goto L44
            java.lang.Object r6 = r4.L$0
            X.Hwg.A00(r2)
        L22:
            if (r2 != 0) goto L43
            return r6
        L25:
            X.Hwg.A00(r2)
            r0 = 0
            com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$boundedRequest$2 r2 = new com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$boundedRequest$2
            r2.<init>(r7, r0)
            r4.L$0 = r6
            r4.L$1 = r0
            r4.label = r1
            r0 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r2 = X.GAX.A01(r4, r2, r0)
            if (r2 != r3) goto L22
            return r3
        L3d:
            com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$boundedRequest$1 r4 = new com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$boundedRequest$1
            r4.<init>(r8)
            goto L12
        L43:
            return r2
        L44:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.boundedRequest(java.lang.Object, X.G0U, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean canControl() {
        /*
            r5 = this;
            com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$Host r2 = r5.owner
            if (r2 == 0) goto L45
            boolean r0 = r2.isActive()
            if (r0 == 0) goto L45
            boolean r0 = r2.viewOnly
            if (r0 != 0) goto L45
            boolean r0 = r2.presentationConfirmed
            if (r0 == 0) goto L45
            java.lang.String r1 = r5.heldTaskId
            java.lang.String r0 = r2.taskId
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L45
            boolean r0 = r5.releasePending
            if (r0 != 0) goto L45
            java.lang.Long r0 = r5.controlExpiresAtMs
            if (r0 == 0) goto L30
            long r3 = r0.longValue()
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L45
        L30:
            com.facebook.aura.vmbrowser.runtime.BrowserSessionController r0 = r5.controller
            X.1BN<java.lang.Boolean> r0 = r0.isConnected
            boolean r0 = X.C3cH.A1R(r0)
            if (r0 == 0) goto L45
            com.facebook.aura.vmbrowser.runtime.BrowserSessionController r0 = r5.controller
            X.1BN<java.lang.Boolean> r0 = r0.hasFirstFrame
            boolean r1 = X.C3cH.A1R(r0)
            r0 = 1
            if (r1 != 0) goto L46
        L45:
            r0 = 0
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.canControl():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canRenewControl(String str, long j) {
        return !this.closed && C7384Etj.areEqual(this.heldTaskId, str) && j == this.controlGeneration && !this.releasePending;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearHeldControl(String str, long j) {
        if (!this.closed && j == this.controlGeneration && C7384Etj.areEqual(this.heldTaskId, str)) {
            this.heldTaskId = null;
            this.releasePending = false;
            C3cI.A1G(this);
            HoC hoC = this.releaseRetryJob;
            if (hoC != null) {
                hoC.A5w(null);
            }
            this.releaseRetryJob = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeCurrent() {
        HoC hoC;
        BLG<Boolean> blg;
        Host host = this.owner;
        if (host != null) {
            host.disposed = true;
        }
        Host host2 = this.owner;
        if (host2 != null) {
            host2.foreground = false;
        }
        Host host3 = this.owner;
        if (host3 != null && (blg = host3.render) != null) {
            AnonymousClass004.A1D(false, blg);
        }
        Host host4 = this.owner;
        if (host4 != null && (hoC = host4.resizeJob) != null) {
            hoC.A5w(null);
        }
        this.owner = null;
        AnonymousClass001.A1E(this._isInTakeControl, null, false);
        AnonymousClass001.A1E(this._isPreviewScreenLive, null, false);
        AnonymousClass001.A1E(this._controlConflict, null, false);
        AnonymousClass001.A1E(this._failed, null, false);
        queueRelease();
        this.controller.destroyVncWebView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissKeyboard() {
        KeyboardRegistration keyboardRegistration = this.keyboardRegistration;
        Object objA0T = C3cG.A0T();
        this.keyboardEpoch = objA0T;
        AnonymousClass001.A1J(new C143211(keyboardRegistration, objA0T, null), this.cleanupScope);
    }

    private final HoC launchOperation(Function0<Unit> function0, G0U<? super HtJ<? super Unit>, ? extends Object> g0u) {
        C3UX c3ux = this.scope;
        return GAo.A02(C79.A00, AuraDispatchers.mainImmediate, new C143232(g0u, function0, null), c3ux);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HoC launchOperation$default(BrowserViewerSession browserViewerSession, Function0 function0, G0U g0u, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = new BrowserViewerSession$$ExternalSyntheticLambda4(browserViewerSession);
        }
        return browserViewerSession.launchOperation(function0, g0u);
    }

    public static final Unit launchOperation$lambda$0(BrowserViewerSession browserViewerSession) {
        AnonymousClass004.A1D(true, browserViewerSession._failed);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object prepareLocked$default(BrowserViewerSession browserViewerSession, Host host, long j, HtJ htJ, int i, Object obj) {
        if ((i & 2) != 0) {
            j = host.modeGeneration;
        }
        return browserViewerSession.prepareLocked(host, j, htJ);
    }

    public static final void registerKeyboard$lambda$0(BrowserViewerSession browserViewerSession, KeyboardRegistration keyboardRegistration) {
        if (browserViewerSession.keyboardRegistration == keyboardRegistration) {
            browserViewerSession.keyboardRegistration = null;
            browserViewerSession.keyboardEpoch = C3cG.A0T();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object releaseHeldControl(X.HtJ<? super java.lang.Boolean> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.C143291
            if (r0 == 0) goto L7a
            r8 = r11
            com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$releaseHeldControl$1 r8 = (com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.C143291) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7a
            int r2 = r2 - r1
            r8.label = r2
        L12:
            java.lang.Object r4 = r8.result
            X.Hji r9 = X.EnumC10460Hji.A02
            int r0 = r8.label
            r7 = 0
            r6 = 1
            if (r0 == 0) goto L36
            if (r0 != r6) goto L80
            long r2 = r8.J$0
            java.lang.Object r0 = r8.L$0
            java.lang.String r5 = X.C3cG.A0d(r0, r4)
        L26:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r1 = r4.booleanValue()
            boolean r0 = r10.closed
            if (r0 != 0) goto L85
            if (r1 == 0) goto L35
            r10.clearHeldControl(r5, r2)
        L35:
            return r4
        L36:
            X.Hwg.A00(r4)
            boolean r0 = r10.closed
            if (r0 != 0) goto L85
            java.lang.String r5 = r10.heldTaskId
            if (r5 != 0) goto L46
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            return r9
        L46:
            long r2 = r10.controlGeneration
            r10.releasePending = r6
            r4 = 0
            r10.updateTakeoverId(r4)
            r10.dismissKeyboard()
            X.HoC r0 = r10.heartbeatJob
            if (r0 == 0) goto L58
            r0.A5w(r4)
        L58:
            r10.heartbeatJob = r4
            X.BLG<java.lang.Boolean> r0 = r10._isUserControlled
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            X.AnonymousClass001.A1E(r0, r4, r1)
            com.facebook.aura.vmbrowser.runtime.BrowserSessionController r0 = r10.controller
            r0.setInputEnabled(r7)
            com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$releaseHeldControl$released$1 r0 = new com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$releaseHeldControl$released$1
            r0.<init>(r10, r5, r4)
            r8.L$0 = r5
            r8.J$0 = r2
            r8.label = r6
            java.lang.Object r4 = r10.boundedRequest(r1, r0, r8)
            if (r4 != r9) goto L26
            return r9
        L7a:
            com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$releaseHeldControl$1 r8 = new com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$releaseHeldControl$1
            r8.<init>(r11)
            goto L12
        L80:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L85:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.releaseHeldControl(X.HtJ):java.lang.Object");
    }

    public static final Unit scheduleResize$lambda$0(Host host, BrowserViewerSession browserViewerSession, long j) {
        if (!host.presentationConfirmed) {
            browserViewerSession.fail(host, j);
        }
        return Unit.INSTANCE;
    }

    public static final void vmChangeListener$lambda$0(BrowserViewerSession browserViewerSession, C4oT c4oT, String str) {
        if (VmAuthTokenKt.KEY_GATEWAY_URL.equals(str)) {
            String strA0a = C3cG.A0a(browserViewerSession.gatewayPrefs);
            if (C7384Etj.areEqual(browserViewerSession.currentVmId, strA0a)) {
                return;
            }
            browserViewerSession.currentVmId = strA0a;
            browserViewerSession.dismissKeyboard();
        }
    }

    public final void clearUserData() throws Exception {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.inputFocusRegistration.close();
        this.prefs.Ahk(this.vmChangeListener);
        dismissKeyboard();
        this.controller.setInputEnabled(false);
        this.controller.destroyVncWebView();
        AnonymousClass001.A1J(new C143181(null), this.cleanupScope);
    }

    public final Object copyToDevice(BrowserClipboardTelemetry.Attempt attempt, HtJ<? super BrowserDeviceCopyResult> htJ) {
        return GAo.A00(htJ, AuraDispatchers.mainImmediate, new C143202(attempt, null));
    }

    public final C1BN<Boolean> getControlConflict() {
        return this.controlConflict;
    }

    public final C1BN<Boolean> getFailed() {
        return this.failed;
    }

    public final C1BN<Boolean> isInTakeControl() {
        return this.isInTakeControl;
    }

    public final C1BN<Boolean> isPreviewScreenLive() {
        return this.isPreviewScreenLive;
    }

    public final C1BN<Boolean> isUserControlled() {
        return this.isUserControlled;
    }

    public final void noteApplicationForeground(boolean z) {
        this.clipboardTelemetry.noteApplicationForeground(z);
    }

    public final Object pasteFromDevice(String str, BrowserClipboardTelemetry.Attempt attempt, HtJ<? super BrowserDevicePasteResult> htJ) {
        return GAo.A00(htJ, AuraDispatchers.mainImmediate, new C143252(attempt, str, null));
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean acceptPresentation(Host host, long j, BrowserViewerPreference browserViewerPreference, BrowserControlLease browserControlLease) {
        boolean z = false;
        if (host.isCurrentMode$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime(j)) {
            if (host.viewOnly || browserControlLease == null || ("user".equals(browserControlLease.controlOwner) && C7384Etj.areEqual(browserControlLease.taskId, host.taskId))) {
                host.presentationConfirmed = true;
                if (!host.viewOnly) {
                    updateTakeoverId(browserControlLease);
                }
                host.submitted = browserViewerPreference;
                BLG<Boolean> blg = this._isUserControlled;
                if (!host.viewOnly && C7384Etj.areEqual(this.heldTaskId, host.taskId) && !this.releasePending) {
                    z = true;
                }
                AnonymousClass001.A1E(this._failed, C3cJ.A0C(blg, z), false);
                updateInput();
                return true;
            }
            this.heldTaskId = null;
            updateTakeoverId(null);
            this.attemptedTakeoverTaskId = null;
            this.releasePending = false;
            C3cI.A1G(this);
            HoC hoC = this.heartbeatJob;
            if (hoC != null) {
                hoC.A5w(null);
            }
            this.heartbeatJob = null;
            HoC hoC2 = this.releaseRetryJob;
            if (hoC2 != null) {
                hoC2.A5w(null);
            }
            this.releaseRetryJob = null;
            AnonymousClass001.A1E(this._isUserControlled, null, false);
            host.presentationConfirmed = false;
            fail(host, j);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canSettleDeviceClipboardAction(Host host, String str, String str2) {
        return canControl() && this.owner == host && C7384Etj.areEqual(this.takeoverId, str) && C7384Etj.areEqual(this.gatewayPrefs.getGatewayUrl(), str2);
    }

    public static final boolean captureClipboardActionContext$lambda$2(BrowserViewerSession browserViewerSession, Host host, String str, String str2, long j, long j2) {
        return browserViewerSession.canSettleDeviceClipboardAction(host, str, str2) && browserViewerSession.controlGeneration == j && host.modeGeneration == j2;
    }

    public static final boolean captureClipboardMenuContext$lambda$0(BrowserViewerSession browserViewerSession, Host host, String str, long j, long j2) {
        return browserViewerSession.canControl() && !browserViewerSession.heartbeatPending && browserViewerSession.owner == host && C7384Etj.areEqual(browserViewerSession.takeoverId, str) && browserViewerSession.controlGeneration == j && host.modeGeneration == j2;
    }

    private final void fail(Host host, long j) {
        if (host.isCurrentMode$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime(j)) {
            AnonymousClass004.A1D(true, this._failed);
            updateInput();
        }
    }

    public static final Unit prepareMode$lambda$0(BrowserViewerSession browserViewerSession, Host host, long j) {
        browserViewerSession.fail(host, j);
        return Unit.INSTANCE;
    }

    private final void recordControlGrant(String str, BrowserControlLease browserControlLease) {
        updateTakeoverId(browserControlLease);
        this.heldTaskId = str;
        this.attemptedTakeoverTaskId = null;
        this.releasePending = false;
        C3cI.A1G(this);
        HoC hoC = this.releaseRetryJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.releaseRetryJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateInput() {
        /*
            r4 = this;
            boolean r3 = r4.canControl()
            com.facebook.aura.vmbrowser.runtime.BrowserSessionController r2 = r4.controller
            if (r3 == 0) goto Ld
            boolean r1 = r4.heartbeatPending
            r0 = 1
            if (r1 == 0) goto Le
        Ld:
            r0 = 0
        Le:
            r2.setInputEnabled(r0)
            if (r3 != 0) goto L16
            r4.dismissKeyboard()
        L16:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession.updateInput():void");
    }
}
