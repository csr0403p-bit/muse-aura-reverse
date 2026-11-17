package com.facebook.aura.pause;

import X.A6J;
import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC08429uh;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass603;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C1BN;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3rb;
import X.C7384Etj;
import X.C9286GCn;
import X.C9uG;
import X.EnumC10460Hji;
import X.G0V;
import X.G2j;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import X.InterfaceC08439ui;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvThreeDSChallengeDialogKt;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.gateway.HatchPauseOperations;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.navigation.key.HatchPausedOverlayScreenKey;
import com.facebook.aura.overlay.api.OverlayApi;
import com.facebook.aura.perf.HatchPauseQplLogger;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class HatchPauseViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<PauseErrorDialog> _errorDialog;
    public final BLG<PauseUiState> _pauseState;
    public final BLG<Boolean> _settingsVisible;
    public final BLG<Boolean> _shouldShowPausedOverlay;
    public final C1BN<PauseErrorDialog> errorDialog;
    public final HatchGatewayConnection gatewayConnection;
    public final OverlayApi overlayApi;
    public final HatchPauseOperations pauseOperations;
    public final C1BN<PauseUiState> pauseState;
    public final C1BN<Boolean> shouldShowPausedOverlay;

    public final class Factory implements InterfaceC08439ui {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // X.InterfaceC08439ui
        public <T extends AEs> T create(Class<T> cls) {
            AbstractC3358CGz abstractC3358CGz = this.userSession;
            return new HatchPauseViewModel(abstractC3358CGz, OverlayApi.Companion.getInstance(abstractC3358CGz));
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(C9uG<T> c9uG, A6J a6j) {
            return (T) AbstractC08429uh.A00(this, a6j, c9uG);
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(Class<T> cls, A6J a6j) {
            return (T) AbstractC08429uh.A01(this, cls);
        }
    }

    /* loaded from: classes.dex */
    public interface PauseErrorDialog {

        public final class LockFailed implements PauseErrorDialog {
            public static final int $stable = 0;
            public static final LockFailed INSTANCE = new LockFailed();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof LockFailed);
            }

            public String toString() {
                return "LockFailed";
            }

            public int hashCode() {
                return -481111404;
            }
        }

        public final class UnlockFailed implements PauseErrorDialog {
            public static final int $stable = 0;
            public static final UnlockFailed INSTANCE = new UnlockFailed();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof UnlockFailed);
            }

            public String toString() {
                return "UnlockFailed";
            }

            public int hashCode() {
                return -1961422099;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface PauseUiState {

        /* loaded from: classes2.dex */
        public final class Failed extends C06G implements PauseUiState {
            public static final int $stable = 0;
            public final String message;

            public Failed(String str) {
                C7384Etj.A0Y(str, 0);
                this.message = str;
            }

            public final Failed copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new Failed(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Failed) && C7384Etj.areEqual(this.message, ((Failed) obj).message));
            }

            public static /* synthetic */ Failed copy$default(Failed failed, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = failed.message;
                }
                C7384Etj.A0Y(str, 0);
                return new Failed(str);
            }

            public final String component1() {
                return this.message;
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        /* loaded from: classes2.dex */
        public final class Idle implements PauseUiState {
            public static final int $stable = 0;
            public static final Idle INSTANCE = new Idle();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Idle);
            }

            public String toString() {
                return "Idle";
            }

            public int hashCode() {
                return 376129619;
            }
        }

        /* loaded from: classes2.dex */
        public final class Locking implements PauseUiState {
            public static final int $stable = 0;
            public static final Locking INSTANCE = new Locking();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Locking);
            }

            public String toString() {
                return "Locking";
            }

            public int hashCode() {
                return -1617759752;
            }
        }

        /* loaded from: classes2.dex */
        public final class Success implements PauseUiState {
            public static final int $stable = 0;
            public static final Success INSTANCE = new Success();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Success);
            }

            public String toString() {
                return HatchCcvThreeDSChallengeDialogKt.AUTH_RESULT_SUCCESS;
            }

            public int hashCode() {
                return 471331620;
            }
        }

        /* loaded from: classes2.dex */
        public final class Unlocked implements PauseUiState {
            public static final int $stable = 0;
            public static final Unlocked INSTANCE = new Unlocked();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Unlocked);
            }

            public String toString() {
                return "Unlocked";
            }

            public int hashCode() {
                return -731849758;
            }
        }

        /* loaded from: classes2.dex */
        public final class Unlocking implements PauseUiState {
            public static final int $stable = 0;
            public static final Unlocking INSTANCE = new Unlocking();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Unlocking);
            }

            public String toString() {
                return "Unlocking";
            }

            public int hashCode() {
                return -1212501761;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseViewModel$lock$1", f = "HatchPauseViewModel.kt", l = {154, 158}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseViewModel$lock$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ byte[] $derivedBytes;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(byte[] bArr, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$derivedBytes = bArr;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchPauseViewModel.this.new AnonymousClass1(this.$derivedBytes, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            BLG<PauseUiState> blg;
            PauseUiState failed;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (Exception e) {
                HatchPauseQplLogger.INSTANCE.endPauseException(e, 0);
                HatchPauseViewModel.this._errorDialog.Af8(PauseErrorDialog.LockFailed.INSTANCE);
                BLG<PauseUiState> blg2 = HatchPauseViewModel.this._pauseState;
                String message = e.getMessage();
                if (message == null) {
                    message = "Lock failed";
                }
                AnonymousClass001.A1E(blg2, null, new PauseUiState.Failed(message));
            }
            if (i == 0) {
                Hwg.A00(obj);
                HatchPauseViewModel.this._pauseState.Af8(PauseUiState.Locking.INSTANCE);
                HatchPauseQplLogger.INSTANCE.startPause(0);
                HatchPauseOperations hatchPauseOperations = HatchPauseViewModel.this.pauseOperations;
                byte[] bArr = this.$derivedBytes;
                this.label = 1;
                obj = hatchPauseOperations.lock(bArr, null, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    blg = (BLG) this.L$1;
                    Hwg.A00(obj);
                    HatchPauseQplLogger.INSTANCE.endPauseSuccess(0);
                    failed = PauseUiState.Success.INSTANCE;
                    blg.Af8(failed);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            HatchPauseOperations.PauseResult pauseResult = (HatchPauseOperations.PauseResult) obj;
            HatchPauseViewModel hatchPauseViewModel = HatchPauseViewModel.this;
            blg = hatchPauseViewModel._pauseState;
            if (!(pauseResult instanceof HatchPauseOperations.PauseResult.Success)) {
                if (!(pauseResult instanceof HatchPauseOperations.PauseResult.Failed)) {
                    throw C3cG.A0q();
                }
                HatchPauseOperations.PauseResult.Failed failed2 = (HatchPauseOperations.PauseResult.Failed) pauseResult;
                HatchPauseQplLogger.INSTANCE.endPauseFailure(failed2.message, 0);
                HatchPauseViewModel.this._errorDialog.Af8(PauseErrorDialog.LockFailed.INSTANCE);
                failed = new PauseUiState.Failed(failed2.message);
                blg.Af8(failed);
                return Unit.INSTANCE;
            }
            HatchGatewayConnection hatchGatewayConnection = hatchPauseViewModel.gatewayConnection;
            this.L$0 = null;
            this.L$1 = blg;
            this.label = 2;
            if (hatchGatewayConnection.setPaused(this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            HatchPauseQplLogger.INSTANCE.endPauseSuccess(0);
            failed = PauseUiState.Success.INSTANCE;
            blg.Af8(failed);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseViewModel$observeOverlayVisibility$1", f = "HatchPauseViewModel.kt", l = {114}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseViewModel$observeOverlayVisibility$1, reason: invalid class name and case insensitive filesystem */
    public final class C134281 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseViewModel$observeOverlayVisibility$1$1", f = "HatchPauseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.pause.HatchPauseViewModel$observeOverlayVisibility$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03411 extends AbstractC07127nr implements G2j<HatchGatewayConnectionState, Boolean, Boolean, HtJ<? super Boolean>, Object> {
            public /* synthetic */ Object L$0;
            public /* synthetic */ boolean Z$0;
            public /* synthetic */ boolean Z$1;
            public int label;

            public C03411(HtJ<? super C03411> htJ) {
                super(4, htJ);
            }

            public final Object invoke(HatchGatewayConnectionState hatchGatewayConnectionState, boolean z, boolean z2, HtJ<? super Boolean> htJ) {
                C03411 c03411 = new C03411(htJ);
                c03411.L$0 = hatchGatewayConnectionState;
                c03411.Z$0 = z;
                c03411.Z$1 = z2;
                return c03411.invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object obj2 = this.L$0;
                boolean z = this.Z$0;
                boolean z2 = this.Z$1;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                boolean z3 = obj2 instanceof HatchGatewayConnectionState.Paused;
                boolean z4 = false;
                if (!(obj2 instanceof HatchGatewayConnectionState.Connected) && !z2 && (z3 || z)) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Object invoke(HatchGatewayConnectionState hatchGatewayConnectionState, Boolean bool, Boolean bool2, HtJ<? super Boolean> htJ) {
                return invoke(hatchGatewayConnectionState, AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), htJ);
            }
        }

        public C134281(HtJ<? super C134281> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchPauseViewModel.this.new C134281(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchPauseViewModel hatchPauseViewModel = HatchPauseViewModel.this;
                HatchPauseViewModel$observeOverlayVisibility$1$invokeSuspend$$inlined$map$1 hatchPauseViewModel$observeOverlayVisibility$1$invokeSuspend$$inlined$map$1 = new HatchPauseViewModel$observeOverlayVisibility$1$invokeSuspend$$inlined$map$1(hatchPauseViewModel._pauseState);
                AnonymousClass603 anonymousClass603A00 = C3rb.A00(new C03411(null), hatchPauseViewModel.gatewayConnection.connectionState, hatchPauseViewModel$observeOverlayVisibility$1$invokeSuspend$$inlined$map$1, hatchPauseViewModel._settingsVisible);
                final HatchPauseViewModel hatchPauseViewModel2 = HatchPauseViewModel.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.pause.HatchPauseViewModel.observeOverlayVisibility.1.2
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        boolean zA1Z = AnonymousClass003.A1Z(hatchPauseViewModel2._shouldShowPausedOverlay);
                        AnonymousClass004.A1D(z, hatchPauseViewModel2._shouldShowPausedOverlay);
                        if (z) {
                            if (!zA1Z) {
                                hatchPauseViewModel2.overlayApi.showOverlay(HatchPausedOverlayScreenKey.INSTANCE);
                            }
                        } else if (zA1Z) {
                            hatchPauseViewModel2.overlayApi.hideOverlay(HatchPausedOverlayScreenKey.INSTANCE);
                            if ((hatchPauseViewModel2._pauseState.getValue() instanceof PauseUiState.Unlocked) || (hatchPauseViewModel2._pauseState.getValue() instanceof PauseUiState.Unlocking)) {
                                hatchPauseViewModel2._pauseState.Af8(PauseUiState.Idle.INSTANCE);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.L$0 = null;
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
            return HatchPauseViewModel.this.new C134281(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseViewModel$unlock$1", f = "HatchPauseViewModel.kt", l = {182, 186}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseViewModel$unlock$1, reason: invalid class name and case insensitive filesystem */
    public final class C134291 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ byte[] $derivedBytes;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134291(byte[] bArr, HtJ<? super C134291> htJ) {
            super(2, htJ);
            this.$derivedBytes = bArr;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchPauseViewModel.this.new C134291(this.$derivedBytes, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            BLG<PauseUiState> blg;
            PauseUiState failed;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (Exception e) {
                HatchPauseQplLogger.INSTANCE.endUnpauseException(e, 0);
                HatchPauseViewModel.this._errorDialog.Af8(PauseErrorDialog.UnlockFailed.INSTANCE);
                BLG<PauseUiState> blg2 = HatchPauseViewModel.this._pauseState;
                String message = e.getMessage();
                if (message == null) {
                    message = "Unlock failed";
                }
                AnonymousClass001.A1E(blg2, null, new PauseUiState.Failed(message));
            }
            if (i == 0) {
                Hwg.A00(obj);
                HatchPauseViewModel.this._pauseState.Af8(PauseUiState.Unlocking.INSTANCE);
                HatchPauseQplLogger.INSTANCE.startUnpause(0);
                HatchPauseOperations hatchPauseOperations = HatchPauseViewModel.this.pauseOperations;
                byte[] bArr = this.$derivedBytes;
                this.label = 1;
                obj = hatchPauseOperations.unlock(bArr, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    blg = (BLG) this.L$1;
                    Hwg.A00(obj);
                    HatchPauseQplLogger.INSTANCE.endUnpauseSuccess(0);
                    failed = PauseUiState.Unlocked.INSTANCE;
                    blg.Af8(failed);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            HatchPauseOperations.PauseResult pauseResult = (HatchPauseOperations.PauseResult) obj;
            HatchPauseViewModel hatchPauseViewModel = HatchPauseViewModel.this;
            blg = hatchPauseViewModel._pauseState;
            if (!(pauseResult instanceof HatchPauseOperations.PauseResult.Success)) {
                if (!(pauseResult instanceof HatchPauseOperations.PauseResult.Failed)) {
                    throw C3cG.A0q();
                }
                HatchPauseOperations.PauseResult.Failed failed2 = (HatchPauseOperations.PauseResult.Failed) pauseResult;
                HatchPauseQplLogger.INSTANCE.endUnpauseFailure(failed2.message, 0);
                HatchPauseViewModel.this._errorDialog.Af8(PauseErrorDialog.UnlockFailed.INSTANCE);
                failed = new PauseUiState.Failed(failed2.message);
                blg.Af8(failed);
                return Unit.INSTANCE;
            }
            HatchGatewayConnection hatchGatewayConnection = hatchPauseViewModel.gatewayConnection;
            this.L$0 = null;
            this.L$1 = blg;
            this.label = 2;
            if (hatchGatewayConnection.fetchAndConnect(false, false, null, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            HatchPauseQplLogger.INSTANCE.endUnpauseSuccess(0);
            failed = PauseUiState.Unlocked.INSTANCE;
            blg.Af8(failed);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C134291) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void lock(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        AnonymousClass001.A1J(new AnonymousClass1(bArr, null), AEu.A00(this));
    }

    public final void unlock(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        AnonymousClass001.A1J(new C134291(bArr, null), AEu.A00(this));
    }

    public final void dismissErrorDialog() {
        this._errorDialog.Af8(null);
        if (this._pauseState.getValue() instanceof PauseUiState.Failed) {
            this._pauseState.Af8(PauseUiState.Idle.INSTANCE);
        }
    }

    public final C1BN<PauseErrorDialog> getErrorDialog() {
        return this.errorDialog;
    }

    public final C1BN<PauseUiState> getPauseState() {
        return this.pauseState;
    }

    public final C1BN<Boolean> getShouldShowPausedOverlay() {
        return this.shouldShowPausedOverlay;
    }

    public final void onSettingsVisibilityChanged(boolean z) {
        AnonymousClass004.A1D(z, this._settingsVisible);
    }

    public HatchPauseViewModel(AbstractC3358CGz abstractC3358CGz, OverlayApi overlayApi) {
        boolean zA1b = AnonymousClass004.A1b(abstractC3358CGz, overlayApi);
        this.overlayApi = overlayApi;
        HatchGatewayServiceManager hatchGatewayServiceManager = HatchGatewayServiceManager.INSTANCE;
        this.gatewayConnection = HatchGatewayConnection.Companion.getInstance(abstractC3358CGz);
        this.pauseOperations = new HatchPauseOperations(abstractC3358CGz);
        C9286GCn c9286GCnA01 = HnJ.A01(PauseUiState.Idle.INSTANCE);
        this._pauseState = c9286GCnA01;
        this.pauseState = C3cG.A11(c9286GCnA01);
        C9286GCn c9286GCnA13 = C3cG.A13();
        this._errorDialog = c9286GCnA13;
        this.errorDialog = C3cG.A11(c9286GCnA13);
        Boolean boolValueOf = Boolean.valueOf(zA1b);
        this._settingsVisible = C3cG.A14(boolValueOf);
        C9286GCn c9286GCnA14 = C3cG.A14(boolValueOf);
        this._shouldShowPausedOverlay = c9286GCnA14;
        this.shouldShowPausedOverlay = C3cG.A11(c9286GCnA14);
        observeOverlayVisibility();
    }

    private final void observeOverlayVisibility() {
        AnonymousClass001.A1I(C3cG.A0v(), new C134281(null), AEu.A00(this));
    }

    public /* synthetic */ HatchPauseViewModel(AbstractC3358CGz abstractC3358CGz, OverlayApi overlayApi, int i, C06H c06h) {
        this(abstractC3358CGz, (i & 2) != 0 ? OverlayApi.Companion.getInstance(abstractC3358CGz) : overlayApi);
    }
}
