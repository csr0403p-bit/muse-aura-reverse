package com.facebook.aura.overlay.viewmodel;

import X.A6J;
import X.AEs;
import X.AEu;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC08429uh;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C06H;
import X.C1BN;
import X.C20Z;
import X.C3UX;
import X.C7384Etj;
import X.C9uG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC08439ui;
import com.facebook.aura.appupdate.AppUpdateChecker;
import com.facebook.aura.appupdate.AppUpdateState;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.AppUpdateHardBlockOverlayScreenKey;
import com.facebook.aura.overlay.api.OverlayApi;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes.dex */
public final class HatchOverlayViewModel extends AEs {
    public final C1BN<AHD<AuraNavKey>> activeOverlays;
    public AHD<? extends AuraNavKey> navigatedOverlayKeys;
    public final OverlayApi overlayApi;

    /* loaded from: classes2.dex */
    public final class Factory implements InterfaceC08439ui {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.InterfaceC08439ui
        public <T extends AEs> T create(Class<T> cls) {
            return new HatchOverlayViewModel(this.userSession, null, 2, 0 == true ? 1 : 0);
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

    @DebugMetadata(c = "com.facebook.aura.overlay.viewmodel.HatchOverlayViewModel$observeAppUpdateState$1", f = "HatchOverlayViewModel.kt", l = {R.styleable.maplibre_MapView_maplibre_uiTiltGestures}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.overlay.viewmodel.HatchOverlayViewModel$observeAppUpdateState$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchOverlayViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1BN<AppUpdateState> c1bn = AppUpdateChecker.updateState;
                final HatchOverlayViewModel hatchOverlayViewModel = HatchOverlayViewModel.this;
                C20Z<? super AppUpdateState> c20z = new C20Z() { // from class: com.facebook.aura.overlay.viewmodel.HatchOverlayViewModel.observeAppUpdateState.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((AppUpdateState) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(AppUpdateState appUpdateState, HtJ<? super Unit> htJ) {
                        boolean z = appUpdateState instanceof AppUpdateState.HardBlock;
                        OverlayApi overlayApi = hatchOverlayViewModel.overlayApi;
                        AppUpdateHardBlockOverlayScreenKey appUpdateHardBlockOverlayScreenKey = AppUpdateHardBlockOverlayScreenKey.INSTANCE;
                        if (z) {
                            overlayApi.showOverlay(appUpdateHardBlockOverlayScreenKey);
                        } else {
                            overlayApi.hideOverlay(appUpdateHardBlockOverlayScreenKey);
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
            throw new KotlinNothingValueException();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchOverlayViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HatchOverlayViewModel(AbstractC3358CGz abstractC3358CGz, OverlayApi overlayApi) {
        C7384Etj.A0Y(overlayApi, 1);
        this.overlayApi = overlayApi;
        this.activeOverlays = overlayApi.activeOverlays;
        this.navigatedOverlayKeys = AHI.A01;
        observeAppUpdateState();
    }

    public final void setNavigatedOverlayKeys(AHD<? extends AuraNavKey> ahd) {
        C7384Etj.A0Y(ahd, 0);
        this.navigatedOverlayKeys = ahd;
    }

    public final C1BN<AHD<AuraNavKey>> getActiveOverlays() {
        return this.activeOverlays;
    }

    public final AHD<AuraNavKey> getNavigatedOverlayKeys() {
        return this.navigatedOverlayKeys;
    }

    private final void observeAppUpdateState() {
        AnonymousClass001.A1I(AuraDispatchers.INSTANCE.m764default(), new AnonymousClass1(null), AEu.A00(this));
    }

    public /* synthetic */ HatchOverlayViewModel(AbstractC3358CGz abstractC3358CGz, OverlayApi overlayApi, int i, C06H c06h) {
        this(abstractC3358CGz, (i & 2) != 0 ? OverlayApi.Companion.getInstance(abstractC3358CGz) : overlayApi);
    }
}
