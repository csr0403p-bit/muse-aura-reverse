package com.facebook.aura.checkpoint.view;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BLG;
import X.C1BN;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.checkpoint.HatchCheckpointBlock;
import com.facebook.aura.checkpoint.HatchCheckpointRepository;
import com.facebook.aura.checkpoint.probe.HatchCheckpointGate;
import com.facebook.aura.checkpoint.probe.HatchCheckpointProbeStatus;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.logout.AuraLogoutHelper;
import com.facebook.aura.navigation.key.HatchCheckpointOverlayScreenKey;
import com.facebook.aura.overlay.api.OverlayApi;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class HatchCheckpointViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<Boolean> _isRechecking;
    public int activeRechecks;
    public final C1BN<HatchCheckpointBlock> block;
    public final HatchCheckpointGate gate;
    public final C1BN<Boolean> isRechecking;
    public final OverlayApi overlayApi;
    public final Object recheckLock;
    public final HatchCheckpointRepository repository;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.checkpoint.view.HatchCheckpointViewModel$1", f = "HatchCheckpointViewModel.kt", l = {50}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.checkpoint.view.HatchCheckpointViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchCheckpointViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final HatchCheckpointViewModel hatchCheckpointViewModel = HatchCheckpointViewModel.this;
                C1BN<HatchCheckpointBlock> c1bn = hatchCheckpointViewModel.repository.block;
                C20Z<? super HatchCheckpointBlock> c20z = new C20Z() { // from class: com.facebook.aura.checkpoint.view.HatchCheckpointViewModel.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HatchCheckpointBlock) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(HatchCheckpointBlock hatchCheckpointBlock, HtJ<? super Unit> htJ) {
                        OverlayApi overlayApi = hatchCheckpointViewModel.overlayApi;
                        HatchCheckpointOverlayScreenKey hatchCheckpointOverlayScreenKey = HatchCheckpointOverlayScreenKey.INSTANCE;
                        if (hatchCheckpointBlock != null) {
                            overlayApi.showOverlay(hatchCheckpointOverlayScreenKey);
                        } else {
                            overlayApi.hideOverlay(hatchCheckpointOverlayScreenKey);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c1bn.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchCheckpointViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<HatchCheckpointViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new HatchCheckpointViewModel(this.userSession);
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchCheckpointViewModel create() {
            return new HatchCheckpointViewModel(this.userSession);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.checkpoint.view.HatchCheckpointViewModel$recheck$1", f = "HatchCheckpointViewModel.kt", l = {80}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.checkpoint.view.HatchCheckpointViewModel$recheck$1, reason: invalid class name and case insensitive filesystem */
    public final class C110621 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $clearWhenUnavailable;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110621(boolean z, HtJ<? super C110621> htJ) {
            super(2, htJ);
            this.$clearWhenUnavailable = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchCheckpointViewModel.this.new C110621(this.$clearWhenUnavailable, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        Hwg.A00(obj);
                        HatchCheckpointViewModel.this.beginRecheck();
                        HatchCheckpointGate hatchCheckpointGate = HatchCheckpointViewModel.this.gate;
                        this.label = 1;
                        obj = hatchCheckpointGate.probeNow(this);
                        if (obj == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                    }
                    if (obj == HatchCheckpointProbeStatus.UNAVAILABLE && this.$clearWhenUnavailable) {
                        HatchCheckpointViewModel.this.repository.clear();
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    CFK.A0A(HatchCheckpointViewModelKt.TAG, "checkpoint recheck failed", e2);
                    if (this.$clearWhenUnavailable) {
                        HatchCheckpointViewModel.this.repository.clear();
                    }
                }
                HatchCheckpointViewModel.this.endRecheck();
                return Unit.INSTANCE;
            } catch (Throwable th) {
                HatchCheckpointViewModel.this.endRecheck();
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C110621) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HatchCheckpointViewModel(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        HatchCheckpointRepository companion = HatchCheckpointRepository.Companion.getInstance(abstractC3358CGz);
        this.repository = companion;
        this.overlayApi = OverlayApi.Companion.getInstance(abstractC3358CGz);
        this.gate = HatchCheckpointGate.Companion.getInstance(abstractC3358CGz);
        this.block = companion.block;
        this.recheckLock = C3cG.A0T();
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(false);
        this._isRechecking = c9286GCnA0v;
        this.isRechecking = C3cG.A11(c9286GCnA0v);
        AnonymousClass001.A1I(C3cG.A0v(), new AnonymousClass1(null), AEu.A00(this));
    }

    public final void onOverlayResumed() {
        recheck(false);
    }

    public final void onReturnedFromWeb() {
        recheck(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void beginRecheck() {
        synchronized (this.recheckLock) {
            this.activeRechecks++;
            AnonymousClass004.A1D(true, this._isRechecking);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endRecheck() {
        synchronized (this.recheckLock) {
            int i = this.activeRechecks - 1;
            this.activeRechecks = i;
            AnonymousClass004.A1D(AnonymousClass002.A1N(i), this._isRechecking);
        }
    }

    public final C1BN<HatchCheckpointBlock> getBlock() {
        return this.block;
    }

    public final C1BN<Boolean> isRechecking() {
        return this.isRechecking;
    }

    public final void logOut() {
        AuraLogoutHelper auraLogoutHelper = AuraLogoutHelper.INSTANCE;
        if (C3cH.A1R(AuraLogoutHelper.isLoggingOut)) {
            return;
        }
        HatchClientCvmEventLogger.INSTANCE.logLogoutClick();
        auraLogoutHelper.performLogout();
    }

    private final void recheck(boolean z) {
        AnonymousClass001.A1I(C3cG.A0v(), new C110621(z, null), AEu.A00(this));
    }
}
