package com.facebook.aura.confidentialvm.model;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BLG;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3rb;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.G0W;
import X.GDB;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.gateway.HatchCvmChipBudgetGate;
import com.facebook.aura.gateway.HatchCvmChipBudgetStop;
import com.facebook.aura.navigation.key.ConfidentialVmChipBudgetOverlayScreenKey;
import com.facebook.aura.overlay.api.OverlayApi;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes.dex */
public final class ConfidentialVmChipBudgetViewModel extends AEs {
    public static final int $stable = 8;
    public final HatchCvmChipBudgetGate gate;
    public final C1BN<Boolean> isRetrying;
    public final BLG<Boolean> isSuppressed;
    public final OverlayApi overlayApi;
    public final C1BN<HatchCvmChipBudgetStop> stopped;

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmChipBudgetViewModel$1", f = "ConfidentialVmChipBudgetViewModel.kt", l = {R.styleable.maplibre_MapView_maplibre_uiRotateGestures}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmChipBudgetViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmChipBudgetViewModel$1$1", f = "ConfidentialVmChipBudgetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmChipBudgetViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00791 extends AbstractC07127nr implements G0W<HatchCvmChipBudgetStop, Boolean, HtJ<? super Boolean>, Object> {
            public /* synthetic */ Object L$0;
            public /* synthetic */ boolean Z$0;
            public int label;

            public C00791(HtJ<? super C00791> htJ) {
                super(3, htJ);
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(HatchCvmChipBudgetStop hatchCvmChipBudgetStop, Boolean bool, HtJ<? super Boolean> htJ) {
                return invoke(hatchCvmChipBudgetStop, AnonymousClass001.A1X(bool), htJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                /*
                    r3 = this;
                    java.lang.Object r2 = r3.L$0
                    boolean r1 = r3.Z$0
                    int r0 = r3.label
                    if (r0 != 0) goto L16
                    X.Hwg.A00(r4)
                    if (r2 == 0) goto L10
                    r0 = 1
                    if (r1 == 0) goto L11
                L10:
                    r0 = 0
                L11:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                L16:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.model.ConfidentialVmChipBudgetViewModel.AnonymousClass1.C00791.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            public final Object invoke(HatchCvmChipBudgetStop hatchCvmChipBudgetStop, boolean z, HtJ<? super Boolean> htJ) {
                C00791 c00791 = new C00791(htJ);
                c00791.L$0 = hatchCvmChipBudgetStop;
                c00791.Z$0 = z;
                return c00791.invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmChipBudgetViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ConfidentialVmChipBudgetViewModel confidentialVmChipBudgetViewModel = ConfidentialVmChipBudgetViewModel.this;
                C20Q c20qA01 = GDB.A01(C3rb.A03(new C00791(null), confidentialVmChipBudgetViewModel.gate.stopped, confidentialVmChipBudgetViewModel.isSuppressed));
                final ConfidentialVmChipBudgetViewModel confidentialVmChipBudgetViewModel2 = ConfidentialVmChipBudgetViewModel.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.confidentialvm.model.ConfidentialVmChipBudgetViewModel.1.2
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        OverlayApi overlayApi = confidentialVmChipBudgetViewModel2.overlayApi;
                        ConfidentialVmChipBudgetOverlayScreenKey confidentialVmChipBudgetOverlayScreenKey = ConfidentialVmChipBudgetOverlayScreenKey.INSTANCE;
                        if (z) {
                            overlayApi.showOverlay(confidentialVmChipBudgetOverlayScreenKey);
                        } else {
                            overlayApi.hideOverlay(confidentialVmChipBudgetOverlayScreenKey);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c20qA01.collect(c20z, this) == enumC10460Hji) {
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
            return ConfidentialVmChipBudgetViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<ConfidentialVmChipBudgetViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new ConfidentialVmChipBudgetViewModel(this.userSession);
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ConfidentialVmChipBudgetViewModel create() {
            return new ConfidentialVmChipBudgetViewModel(this.userSession);
        }
    }

    public ConfidentialVmChipBudgetViewModel(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        HatchCvmChipBudgetGate companion = HatchCvmChipBudgetGate.Companion.getInstance(abstractC3358CGz);
        this.gate = companion;
        this.overlayApi = OverlayApi.Companion.getInstance(abstractC3358CGz);
        this.isSuppressed = AnonymousClass002.A0v(false);
        this.isRetrying = companion.isRetrying;
        this.stopped = companion.stopped;
        AnonymousClass001.A1I(AuraDispatchers.INSTANCE.m764default(), new AnonymousClass1(null), AEu.A00(this));
    }

    public final C1BN<HatchCvmChipBudgetStop> getStopped() {
        return this.stopped;
    }

    public final C1BN<Boolean> isRetrying() {
        return this.isRetrying;
    }

    public final void onGetSupport() {
        HatchClientCvmEventLogger.INSTANCE.logCvmReplacementChipBudgetSupportClick();
    }

    public final void onSettings() {
        HatchClientCvmEventLogger.INSTANCE.logCvmReplacementChipBudgetSettingsClick();
    }

    public final void onSuppressionChanged(boolean z) {
        AnonymousClass004.A1D(z, this.isSuppressed);
    }

    public final void onTryAgain() {
        this.gate.retry();
    }
}
