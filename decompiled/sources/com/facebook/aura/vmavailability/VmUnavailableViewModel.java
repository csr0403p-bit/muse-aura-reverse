package com.facebook.aura.vmavailability;

import X.A6J;
import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC08429uh;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BLG;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3rb;
import X.C60I;
import X.C7384Etj;
import X.C9uG;
import X.EnumC10460Hji;
import X.G0V;
import X.G0W;
import X.HtJ;
import X.Hwg;
import X.InterfaceC08439ui;
import com.facebook.aura.gateway.HatchVmAvailabilityStore;
import com.facebook.aura.gateway.VmFetchError;
import com.facebook.aura.navigation.key.VmUnavailableOverlayScreenKey;
import com.facebook.aura.overlay.api.OverlayApi;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class VmUnavailableViewModel extends AEs {
    public final OverlayApi overlayApi;
    public final BLG<Boolean> settingsVisible;
    public final HatchVmAvailabilityStore store;

    public final class Factory implements InterfaceC08439ui {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // X.InterfaceC08439ui
        public <T extends AEs> T create(Class<T> cls) {
            return new VmUnavailableViewModel(HatchVmAvailabilityStore.Companion.getInstance(this.userSession), OverlayApi.Companion.getInstance(this.userSession));
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

    @DebugMetadata(c = "com.facebook.aura.vmavailability.VmUnavailableViewModel$observeAvailability$1", f = "VmUnavailableViewModel.kt", l = {42}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmavailability.VmUnavailableViewModel$observeAvailability$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.vmavailability.VmUnavailableViewModel$observeAvailability$1$1", f = "VmUnavailableViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.vmavailability.VmUnavailableViewModel$observeAvailability$1$1, reason: invalid class name and collision with other inner class name */
        public final class C04321 extends AbstractC07127nr implements G0W<VmFetchError, Boolean, HtJ<? super Boolean>, Object> {
            public /* synthetic */ Object L$0;
            public /* synthetic */ boolean Z$0;
            public int label;

            public C04321(HtJ<? super C04321> htJ) {
                super(3, htJ);
            }

            public final Object invoke(VmFetchError vmFetchError, boolean z, HtJ<? super Boolean> htJ) {
                C04321 c04321 = new C04321(htJ);
                c04321.L$0 = vmFetchError;
                c04321.Z$0 = z;
                return c04321.invokeSuspend(Unit.INSTANCE);
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
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmavailability.VmUnavailableViewModel.AnonymousClass1.C04321.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(VmFetchError vmFetchError, Boolean bool, HtJ<? super Boolean> htJ) {
                return invoke(vmFetchError, AnonymousClass001.A1X(bool), htJ);
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VmUnavailableViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                VmUnavailableViewModel vmUnavailableViewModel = VmUnavailableViewModel.this;
                C60I c60iA03 = C3rb.A03(new C04321(null), vmUnavailableViewModel.store.vmFetchError, vmUnavailableViewModel.settingsVisible);
                final VmUnavailableViewModel vmUnavailableViewModel2 = VmUnavailableViewModel.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.vmavailability.VmUnavailableViewModel.observeAvailability.1.2
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        OverlayApi overlayApi = vmUnavailableViewModel2.overlayApi;
                        VmUnavailableOverlayScreenKey vmUnavailableOverlayScreenKey = VmUnavailableOverlayScreenKey.INSTANCE;
                        if (z) {
                            overlayApi.showOverlay(vmUnavailableOverlayScreenKey);
                        } else {
                            overlayApi.hideOverlay(vmUnavailableOverlayScreenKey);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c60iA03.collect(c20z, this) == enumC10460Hji) {
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
            return VmUnavailableViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void onSettingsVisibilityChanged(boolean z) {
        AnonymousClass004.A1D(z, this.settingsVisible);
    }

    public VmUnavailableViewModel(HatchVmAvailabilityStore hatchVmAvailabilityStore, OverlayApi overlayApi) {
        boolean zA1b = AnonymousClass004.A1b(hatchVmAvailabilityStore, overlayApi);
        this.store = hatchVmAvailabilityStore;
        this.overlayApi = overlayApi;
        this.settingsVisible = AnonymousClass002.A0v(zA1b);
        observeAvailability();
    }

    private final void observeAvailability() {
        AnonymousClass001.A1I(C3cG.A0v(), new AnonymousClass1(null), AEu.A00(this));
    }
}
