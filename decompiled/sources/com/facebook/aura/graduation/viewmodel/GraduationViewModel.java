package com.facebook.aura.graduation.viewmodel;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass441;
import X.AnonymousClass603;
import X.BLG;
import X.BLL;
import X.C1BN;
import X.C3Es;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C3cJ;
import X.C3rb;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.graduation.repo.HatchGraduationRepository;
import com.facebook.aura.graduation.repo.HatchGraduationState;
import com.facebook.aura.graduation.viewmodel.GraduationUiState;
import com.facebook.aura.toast.api.ToastApi;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class GraduationViewModel extends AEs {
    public final BLG<Boolean> isSavingVideo;
    public final BLG<Boolean> isVideoSaved;
    public final HatchGraduationRepository repository;
    public final C1BN<GraduationUiState> uiState;

    @DebugMetadata(c = "com.facebook.aura.graduation.viewmodel.GraduationViewModel$1", f = "GraduationViewModel.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoGravity}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.graduation.viewmodel.GraduationViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return GraduationViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return GraduationViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                if (GraduationViewModel.this.repository.state.getValue().story == null) {
                    HatchGraduationRepository hatchGraduationRepository = GraduationViewModel.this.repository;
                    this.label = 1;
                    if (hatchGraduationRepository.fetchGraduation(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.graduation.viewmodel.GraduationViewModel$2", f = "GraduationViewModel.kt", l = {48}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.graduation.viewmodel.GraduationViewModel$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.graduation.viewmodel.GraduationViewModel$2$1", f = "GraduationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.graduation.viewmodel.GraduationViewModel$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<HatchGraduationState, HtJ<? super Boolean>, Object> {
            public /* synthetic */ Object L$0;
            public int label;

            public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // X.G0V
            public final Object invoke(HatchGraduationState hatchGraduationState, HtJ<? super Boolean> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                anonymousClass1.L$0 = hatchGraduationState;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                HatchGraduationState hatchGraduationState = (HatchGraduationState) this.L$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Boolean.valueOf(AnonymousClass002.A1X(hatchGraduationState.story));
            }
        }

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return GraduationViewModel.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return GraduationViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1BN<HatchGraduationState> c1bn = GraduationViewModel.this.repository.state;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                if (AbstractC9777Gfy.A00(this, anonymousClass1, c1bn) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            GraduationViewModel.this.repository.markSeen();
            return Unit.INSTANCE;
        }
    }

    public final class Factory extends AuraViewModelFactory<GraduationViewModel> {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new GraduationViewModel(this.userSession);
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public GraduationViewModel create() {
            return new GraduationViewModel(this.userSession);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.graduation.viewmodel.GraduationViewModel$onSaveVideoClick$1", f = "GraduationViewModel.kt", l = {64}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.graduation.viewmodel.GraduationViewModel$onSaveVideoClick$1, reason: invalid class name and case insensitive filesystem */
    public final class C121861 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C121861(HtJ<? super C121861> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return GraduationViewModel.this.new C121861(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return GraduationViewModel.this.new C121861(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            boolean z = false;
            try {
                try {
                    if (i == 0) {
                        Hwg.A00(obj);
                        HatchGraduationRepository hatchGraduationRepository = GraduationViewModel.this.repository;
                        this.label = 1;
                        obj = hatchGraduationRepository.saveVideoToDownloads(this);
                        if (obj == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                    }
                    boolean zA1X = AnonymousClass001.A1X(obj);
                    C3cJ.A0C(GraduationViewModel.this.isSavingVideo, false);
                    z = zA1X;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    CFK.A0A(GraduationViewModelKt.TAG, "Saving the graduation video failed", e2);
                    C3cJ.A0C(GraduationViewModel.this.isSavingVideo, false);
                }
                AnonymousClass003.A14(GraduationViewModel.this.isVideoSaved, z);
                ToastApi toastApi = ToastApi.INSTANCE;
                int i2 = com.facebook.aura.R.string._name_removed__res_0x7f1202b6;
                if (z) {
                    i2 = com.facebook.aura.R.string._name_removed__res_0x7f1202b7;
                }
                toastApi.showToast(i2);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                AnonymousClass004.A1D(false, GraduationViewModel.this.isSavingVideo);
                throw th;
            }
        }
    }

    public GraduationViewModel(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        HatchGraduationRepository companion = HatchGraduationRepository.Companion.getInstance(abstractC3358CGz);
        this.repository = companion;
        C9286GCn c9286GCnA14 = C3cG.A14(false);
        this.isSavingVideo = c9286GCnA14;
        C9286GCn c9286GCnA142 = C3cG.A14(false);
        this.isVideoSaved = c9286GCnA142;
        AnonymousClass603 anonymousClass603A00 = C3rb.A00(new GraduationViewModel$uiState$1(null), companion.state, c9286GCnA14, c9286GCnA142);
        this.uiState = AnonymousClass441.A00(GraduationUiState.Loading.INSTANCE, AEu.A00(this), anonymousClass603A00, new C3Es(5000L, LinkEncryptedPairingKt.LINK_COUNTER_MAX));
        BLL bllA00 = AEu.A00(this);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        C6ys c6ys = C6ys.A00;
        Integer num = C79.A00;
        GAo.A02(num, c6ys, new AnonymousClass2(null), AnonymousClass001.A0e(this, num, c6ys, anonymousClass1, bllA00));
    }

    public final C1BN<GraduationUiState> getUiState() {
        return this.uiState;
    }

    public final void onSaveVideoClick() {
        if (AnonymousClass003.A1Z(this.isSavingVideo) || AnonymousClass003.A1Z(this.isVideoSaved)) {
            return;
        }
        HtJ htJA14 = C3cI.A14(this.isSavingVideo, AnonymousClass001.A0i());
        AnonymousClass001.A1J(new C121861(htJA14), AEu.A00(this));
    }
}
