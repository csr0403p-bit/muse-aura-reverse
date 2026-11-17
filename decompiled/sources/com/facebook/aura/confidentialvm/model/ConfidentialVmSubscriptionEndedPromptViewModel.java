package com.facebook.aura.confidentialvm.model;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BLG;
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
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.navigation.key.ConfidentialVmSubscriptionEndedScreenKey;
import com.facebook.aura.overlay.api.OverlayApi;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes.dex */
public final class ConfidentialVmSubscriptionEndedPromptViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<Boolean> isSuppressed;
    public final OverlayApi overlayApi;

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedPromptViewModel$1", f = "ConfidentialVmSubscriptionEndedPromptViewModel.kt", l = {R.styleable.maplibre_MapView_maplibre_uiRotateGestures}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedPromptViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;
        public final /* synthetic */ ConfidentialVmSubscriptionEndedPromptViewModel this$0;

        @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedPromptViewModel$1$1", f = "ConfidentialVmSubscriptionEndedPromptViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedPromptViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00821 extends AbstractC07127nr implements G0W<Boolean, Boolean, HtJ<? super Boolean>, Object> {
            public /* synthetic */ boolean Z$0;
            public /* synthetic */ boolean Z$1;
            public int label;

            public C00821(HtJ<? super C00821> htJ) {
                super(3, htJ);
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
                    boolean r2 = r3.Z$0
                    boolean r1 = r3.Z$1
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
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedPromptViewModel.AnonymousClass1.C00821.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, HtJ<? super Boolean> htJ) {
                return invoke(AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), htJ);
            }

            public final Object invoke(boolean z, boolean z2, HtJ<? super Boolean> htJ) {
                C00821 c00821 = new C00821(htJ);
                c00821.Z$0 = z;
                c00821.Z$1 = z2;
                return c00821.invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC3358CGz abstractC3358CGz, ConfidentialVmSubscriptionEndedPromptViewModel confidentialVmSubscriptionEndedPromptViewModel, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
            this.this$0 = confidentialVmSubscriptionEndedPromptViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$userSession, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q c20qA01 = GDB.A01(C3rb.A03(new C00821(null), ConfidentialVmEligibility.Companion.getInstance(this.$userSession).isNotEligibleOnCvm, this.this$0.isSuppressed));
                final ConfidentialVmSubscriptionEndedPromptViewModel confidentialVmSubscriptionEndedPromptViewModel = this.this$0;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedPromptViewModel.1.2
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        OverlayApi overlayApi = confidentialVmSubscriptionEndedPromptViewModel.overlayApi;
                        ConfidentialVmSubscriptionEndedScreenKey confidentialVmSubscriptionEndedScreenKey = ConfidentialVmSubscriptionEndedScreenKey.INSTANCE;
                        if (z) {
                            overlayApi.showOverlay(confidentialVmSubscriptionEndedScreenKey);
                        } else {
                            overlayApi.hideOverlay(confidentialVmSubscriptionEndedScreenKey);
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
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<ConfidentialVmSubscriptionEndedPromptViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new ConfidentialVmSubscriptionEndedPromptViewModel(this.userSession);
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ConfidentialVmSubscriptionEndedPromptViewModel create() {
            return new ConfidentialVmSubscriptionEndedPromptViewModel(this.userSession);
        }
    }

    public ConfidentialVmSubscriptionEndedPromptViewModel(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.overlayApi = OverlayApi.Companion.getInstance(abstractC3358CGz);
        this.isSuppressed = AnonymousClass002.A0v(false);
        AnonymousClass001.A1I(AuraDispatchers.INSTANCE.m764default(), new AnonymousClass1(abstractC3358CGz, this, null), AEu.A00(this));
    }

    public final void onSuppressionChanged(boolean z) {
        AnonymousClass004.A1D(z, this.isSuppressed);
    }
}
