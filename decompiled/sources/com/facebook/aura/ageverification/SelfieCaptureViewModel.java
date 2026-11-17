package com.facebook.aura.ageverification;

import X.AEs;
import X.AEu;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC10623Hzj;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass441;
import X.BLG;
import X.BLL;
import X.C06H;
import X.C1BN;
import X.C20Q;
import X.C3Ek;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C6ys;
import X.C7384Etj;
import X.C78T;
import X.C79;
import X.C7Bq;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.GAt;
import X.GCV;
import X.HoC;
import X.HtJ;
import X.Hu1;
import X.Hwg;
import X.Hxb;
import X.HzP;
import X.HzR;
import X.InterfaceC10560Hsz;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.ageverification.SelfieEffect;
import com.facebook.aura.ageverification.SelfieStep;
import com.facebook.aura.ageverification.intf.AgeCheckFailure;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.ageverification.intf.AgeCheckResult;
import com.facebook.aura.ageverification.intf.SelfieCapturePhase;
import com.facebook.aura.ageverification.intf.SelfieResetReason;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.user.provider.AgeCheckMethod;
import com.facebook.aura.utils.MC;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class SelfieCaptureViewModel extends AEs {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final List<HeadMovement> HEAD_MOVEMENTS = Arrays.asList(HeadMovement.RIGHT, HeadMovement.UP);
    public final HzR<SelfieEffect> _effects;
    public final BLG<Float> _progress;
    public final BLG<SelfieCaptureState> _state;
    public long alignedSinceMs;
    public Integer attemptTake;
    public Float basePitch;
    public HoC clearing;
    public final Context context;
    public long darkSinceMs;
    public final C20Q<SelfieEffect> effects;
    public long faceLostSinceMs;
    public HoC holdJob;
    public HeadPose lastPose;
    public int movementIndex;
    public boolean movementStarted;
    public boolean onTarget;
    public FaceGuidance pendingHint;
    public long pendingHintSinceMs;
    public final HeadPoseFilter poseFilter;
    public final C1BN<Float> progress;
    public HoC progressJob;
    public FaceGuidance shownHint;
    public long shownHintSinceMs;
    public final FrontalSnapshotSelector snapshots;
    public HoC startJob;
    public final C1BN<SelfieCaptureState> state;
    public int take;
    public InterfaceC10560Hsz<Unit> takeEnded;
    public boolean trackingUnavailable;
    public final C1BN<SelfieCaptureUi> ui;
    public final String userId;

    public final class Companion {

        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HeadMovement.values().length];
                try {
                    AnonymousClass002.A13(HeadMovement.UP, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(HeadMovement.LEFT, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(HeadMovement.RIGHT, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final SelfieCaptureUi captureUi(SelfieCaptureState selfieCaptureState) {
            Integer numValueOf;
            int i;
            int i2;
            int iOrdinal;
            SelfieStep selfieStep = selfieCaptureState.step;
            if (C7384Etj.areEqual(selfieStep, SelfieStep.Positioning.INSTANCE)) {
                if (selfieCaptureState.recaptureNotice && selfieCaptureState.guidance.getHintRes() == null) {
                    return new SelfieCaptureUi(R.string._name_removed__res_0x7f120067, Integer.valueOf(R.string._name_removed__res_0x7f120068), true);
                }
                Integer hintRes = selfieCaptureState.guidance.getHintRes();
                numValueOf = Integer.valueOf(hintRes != null ? hintRes.intValue() : R.string._name_removed__res_0x7f120066);
                i = R.string._name_removed__res_0x7f120067;
            } else {
                if (selfieStep instanceof SelfieStep.Recording) {
                    if (!selfieCaptureState.frontalHeld) {
                        i2 = R.string._name_removed__res_0x7f12005f;
                    } else if (selfieCaptureState.getDone()) {
                        i2 = R.string._name_removed__res_0x7f120065;
                    } else {
                        HeadMovement headMovement = selfieCaptureState.movement;
                        if (headMovement == null || (iOrdinal = headMovement.ordinal()) == -1) {
                            i2 = R.string._name_removed__res_0x7f12006a;
                        } else if (iOrdinal == 1) {
                            i2 = R.string._name_removed__res_0x7f120063;
                        } else if (iOrdinal != 2) {
                            if (iOrdinal != 0) {
                                throw C3cG.A0q();
                            }
                            i2 = R.string._name_removed__res_0x7f12006a;
                        } else {
                            i2 = R.string._name_removed__res_0x7f120069;
                        }
                    }
                    return new SelfieCaptureUi(i2, selfieCaptureState.outOfCircle ? Integer.valueOf(R.string._name_removed__res_0x7f120066) : null, false);
                }
                if (!C7384Etj.areEqual(selfieStep, SelfieStep.Finishing.INSTANCE) && !(selfieStep instanceof SelfieStep.Complete)) {
                    throw C3cG.A0q();
                }
                numValueOf = null;
                i = R.string._name_removed__res_0x7f120065;
            }
            return new SelfieCaptureUi(i, numValueOf, false);
        }

        public final List<HeadMovement> getHEAD_MOVEMENTS() {
            return SelfieCaptureViewModel.HEAD_MOVEMENTS;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final class Factory extends AuraViewModelFactory<SelfieCaptureViewModel> {
        public static final int $stable = 8;
        public final Context context;
        public final boolean recapture;
        public final int take;
        public final String userId;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public SelfieCaptureViewModel create() {
            return new SelfieCaptureViewModel(AnonymousClass001.A0I(this.context), this.userId, this.take, this.recapture);
        }

        public Factory(Context context, String str, int i, boolean z) {
            AnonymousClass003.A0u(context, str);
            this.context = context;
            this.userId = str;
            this.take = i;
            this.recapture = z;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ageverification.SelfieCaptureViewModel$clearFiles$1", f = "SelfieCaptureViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ageverification.SelfieCaptureViewModel$clearFiles$1, reason: invalid class name and case insensitive filesystem */
    public final class C108961 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C108961(HtJ<? super C108961> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SelfieCaptureViewModel.this.new C108961(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SelfieCaptureViewModel.this.new C108961(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            AgeVerificationFiles ageVerificationFiles = AgeVerificationFiles.INSTANCE;
            SelfieCaptureViewModel selfieCaptureViewModel = SelfieCaptureViewModel.this;
            ageVerificationFiles.clear(selfieCaptureViewModel.context, selfieCaptureViewModel.userId);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ageverification.SelfieCaptureViewModel", f = "SelfieCaptureViewModel.kt", l = {239}, m = "fillProgress", v = 2)
    /* renamed from: com.facebook.aura.ageverification.SelfieCaptureViewModel$fillProgress$1, reason: invalid class name and case insensitive filesystem */
    public final class C108971 extends HzP {
        public long J$0;
        public int label;
        public /* synthetic */ Object result;

        public C108971(HtJ<? super C108971> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelfieCaptureViewModel.this.fillProgress(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ageverification.SelfieCaptureViewModel$finish$2", f = "SelfieCaptureViewModel.kt", l = {376, MC.xe_feta_entrypoint_rl.__CONFIG__, MC.xe_feta_entrypoint_rl.__CONFIG__}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ageverification.SelfieCaptureViewModel$finish$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super SelfieStep.Complete>, Object> {
        public final /* synthetic */ FaceSnapshot $frontal;
        public final /* synthetic */ File $videoFile;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public final /* synthetic */ SelfieCaptureViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(File file, SelfieCaptureViewModel selfieCaptureViewModel, FaceSnapshot faceSnapshot, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$videoFile = file;
            this.this$0 = selfieCaptureViewModel;
            this.$frontal = faceSnapshot;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$videoFile, this.this$0, this.$frontal, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
        
            if (X.C7Bq.A01(750, r12) == r6) goto L12;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r11 = r12.L$0
                X.3UX r11 = (X.C3UX) r11
                X.Hji r6 = X.EnumC10460Hji.A02
                int r0 = r12.label
                r7 = 3
                r8 = 2
                r10 = 1
                if (r0 == 0) goto L22
                if (r0 == r10) goto L5b
                if (r0 == r8) goto L76
                if (r0 != r7) goto L93
                java.lang.Object r1 = r12.L$3
                com.facebook.aura.ageverification.CapturedVideo r1 = (com.facebook.aura.ageverification.CapturedVideo) r1
                X.Hwg.A00(r13)
            L1a:
                com.facebook.aura.ageverification.CapturedPhoto r13 = (com.facebook.aura.ageverification.CapturedPhoto) r13
                com.facebook.aura.ageverification.SelfieStep$Complete r0 = new com.facebook.aura.ageverification.SelfieStep$Complete
                r0.<init>(r1, r13)
                return r0
            L22:
                X.Hwg.A00(r13)
                com.facebook.aura.executors.AuraDispatchers r3 = com.facebook.aura.executors.AuraDispatchers.INSTANCE
                X.78T r2 = r3.io()
                java.io.File r1 = r12.$videoFile
                r9 = 0
                com.facebook.aura.ageverification.SelfieCaptureViewModel$finish$2$video$1 r0 = new com.facebook.aura.ageverification.SelfieCaptureViewModel$finish$2$video$1
                r0.<init>(r1, r9)
                java.lang.Integer r5 = X.C79.A00
                X.Hrx r1 = X.GAo.A01(r5, r2, r0, r11)
                X.78T r4 = r3.m764default()
                com.facebook.aura.ageverification.SelfieCaptureViewModel r3 = r12.this$0
                com.facebook.aura.ageverification.FaceSnapshot r2 = r12.$frontal
                com.facebook.aura.ageverification.SelfieCaptureViewModel$finish$2$photo$1 r0 = new com.facebook.aura.ageverification.SelfieCaptureViewModel$finish$2$photo$1
                r0.<init>(r3, r2, r9)
                X.Hrx r4 = X.GAo.A01(r5, r4, r0, r11)
                r12.L$0 = r9
                r12.L$1 = r1
                r12.L$2 = r4
                r12.label = r10
                r2 = 750(0x2ee, double:3.705E-321)
                java.lang.Object r0 = X.C7Bq.A01(r2, r12)
                if (r0 != r6) goto L66
            L5a:
                return r6
            L5b:
                java.lang.Object r4 = r12.L$2
                X.27k r4 = (X.C27k) r4
                java.lang.Object r1 = r12.L$1
                X.27k r1 = (X.C27k) r1
                X.Hwg.A00(r13)
            L66:
                r0 = 0
                r12.L$0 = r0
                r12.L$1 = r0
                r12.L$2 = r4
                r12.label = r8
                java.lang.Object r13 = X.C3cG.A0W(r1, r12)
                if (r13 != r6) goto L7d
                return r6
            L76:
                java.lang.Object r4 = r12.L$2
                X.27k r4 = (X.C27k) r4
                X.Hwg.A00(r13)
            L7d:
                com.facebook.aura.ageverification.CapturedVideo r13 = (com.facebook.aura.ageverification.CapturedVideo) r13
                r0 = 0
                r12.L$0 = r0
                r12.L$1 = r0
                r12.L$2 = r0
                r12.L$3 = r13
                r12.label = r7
                java.lang.Object r0 = X.C3cG.A0W(r4, r12)
                if (r0 == r6) goto L5a
                r1 = r13
                r13 = r0
                goto L1a
            L93:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.SelfieCaptureViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super SelfieStep.Complete> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ageverification.SelfieCaptureViewModel$onRecorded$2", f = "SelfieCaptureViewModel.kt", l = {335}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ageverification.SelfieCaptureViewModel$onRecorded$2, reason: invalid class name and case insensitive filesystem */
    public final class C108992 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ FaceSnapshot $frontal;
        public final /* synthetic */ SelfieStep.Recording $step;
        public int label;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Exception {
            SelfieCaptureState value;
            FaceGuidance faceGuidance;
            HeadMovement headMovement;
            AHD<HeadMovement> ahd;
            boolean z;
            boolean z2;
            boolean z3;
            Object objFinish = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    SelfieCaptureViewModel selfieCaptureViewModel = SelfieCaptureViewModel.this;
                    File file = this.$step.video;
                    FaceSnapshot faceSnapshot = this.$frontal;
                    this.label = 1;
                    objFinish = selfieCaptureViewModel.finish(file, faceSnapshot, this);
                    if (objFinish == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                SelfieStep.Complete complete = (SelfieStep.Complete) objFinish;
                SelfieCaptureViewModel.this.snapshots.reset();
                AgeCheckFunnelLogging.INSTANCE.selfieCapture(SelfieCapturePhase.COMPLETED, null, null, null);
                BLG<SelfieCaptureState> blg = SelfieCaptureViewModel.this._state;
                do {
                    value = blg.getValue();
                    SelfieCaptureState selfieCaptureState = value;
                    faceGuidance = selfieCaptureState.guidance;
                    headMovement = selfieCaptureState.movement;
                    ahd = selfieCaptureState.completed;
                    z = selfieCaptureState.frontalHeld;
                    z2 = selfieCaptureState.outOfCircle;
                    z3 = selfieCaptureState.recaptureNotice;
                    AnonymousClass005.A0y(complete, faceGuidance, ahd);
                } while (!blg.A6e(value, new SelfieCaptureState(complete, faceGuidance, headMovement, ahd, z, z2, z3)));
                SelfieCaptureViewModel.this._effects.AhZ(new SelfieEffect.Captured(complete));
            } catch (Exception e) {
                if (e instanceof CancellationException) {
                    throw e;
                }
                CFK.A08(SelfieCaptureViewModelKt.TAG, "Could not save the selfie", e);
                SelfieCaptureViewModel.this.resetAfterFailure(this.$step.video);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108992(SelfieStep.Recording recording, FaceSnapshot faceSnapshot, HtJ<? super C108992> htJ) {
            super(2, htJ);
            this.$step = recording;
            this.$frontal = faceSnapshot;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SelfieCaptureViewModel.this.new C108992(this.$step, this.$frontal, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C108992) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ageverification.SelfieCaptureViewModel$onRecordingStarted$1", f = "SelfieCaptureViewModel.kt", l = {230}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ageverification.SelfieCaptureViewModel$onRecordingStarted$1, reason: invalid class name and case insensitive filesystem */
    public final class C109001 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C109001(HtJ<? super C109001> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SelfieCaptureViewModel.this.new C109001(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SelfieCaptureViewModel.this.new C109001(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            SelfieCaptureState value;
            SelfieStep selfieStep;
            FaceGuidance faceGuidance;
            HeadMovement headMovement;
            AHD<HeadMovement> ahd;
            boolean z;
            boolean z2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(200L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            BLG<SelfieCaptureState> blg = SelfieCaptureViewModel.this._state;
            do {
                value = blg.getValue();
                SelfieCaptureState selfieCaptureState = value;
                selfieStep = selfieCaptureState.step;
                faceGuidance = selfieCaptureState.guidance;
                headMovement = selfieCaptureState.movement;
                ahd = selfieCaptureState.completed;
                z = selfieCaptureState.outOfCircle;
                z2 = selfieCaptureState.recaptureNotice;
                AnonymousClass005.A0y(selfieStep, faceGuidance, ahd);
            } while (!blg.A6e(value, new SelfieCaptureState(selfieStep, faceGuidance, headMovement, ahd, true, z, z2)));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ageverification.SelfieCaptureViewModel$onRecordingStarted$2", f = "SelfieCaptureViewModel.kt", l = {233}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ageverification.SelfieCaptureViewModel$onRecordingStarted$2, reason: invalid class name and case insensitive filesystem */
    public final class C109012 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C109012(HtJ<? super C109012> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SelfieCaptureViewModel.this.new C109012(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SelfieCaptureViewModel.this.new C109012(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SelfieCaptureViewModel selfieCaptureViewModel = SelfieCaptureViewModel.this;
                this.label = 1;
                if (selfieCaptureViewModel.fillProgress(this) == enumC10460Hji) {
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
    }

    @DebugMetadata(c = "com.facebook.aura.ageverification.SelfieCaptureViewModel$onStart$1", f = "SelfieCaptureViewModel.kt", l = {308, 311}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ageverification.SelfieCaptureViewModel$onStart$1, reason: invalid class name and case insensitive filesystem */
    public final class C109021 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C109021(HtJ<? super C109021> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SelfieCaptureViewModel.this.new C109021(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SelfieCaptureViewModel.this.new C109021(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Exception {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (Exception e) {
                if (e instanceof CancellationException) {
                    throw e;
                }
                CFK.A08(SelfieCaptureViewModelKt.TAG, "Could not create the selfie file", e);
                SelfieCaptureViewModel.this._effects.AhZ(SelfieEffect.RecordingFailed.INSTANCE);
            }
            if (i == 0) {
                Hwg.A00(obj);
                HoC hoC = SelfieCaptureViewModel.this.clearing;
                this.label = 1;
                if (hoC.APQ(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    SelfieCaptureViewModel.this.resetMovement(new SelfieStep.Recording((File) obj), (HeadMovement) AbstractC0878AGe.A0F(SelfieCaptureViewModel.HEAD_MOVEMENTS));
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            C78T c78tA0y = AnonymousClass001.A0y();
            SelfieCaptureViewModel$onStart$1$video$1 selfieCaptureViewModel$onStart$1$video$1 = new SelfieCaptureViewModel$onStart$1$video$1(SelfieCaptureViewModel.this, null);
            this.label = 2;
            obj = GAo.A00(this, c78tA0y, selfieCaptureViewModel$onStart$1$video$1);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
            SelfieCaptureViewModel.this.resetMovement(new SelfieStep.Recording((File) obj), (HeadMovement) AbstractC0878AGe.A0F(SelfieCaptureViewModel.HEAD_MOVEMENTS));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object finish(File file, FaceSnapshot faceSnapshot, HtJ<? super SelfieStep.Complete> htJ) {
        return Hxb.A00(new AnonymousClass2(file, this, faceSnapshot, null), htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFaceFrame(com.facebook.aura.ageverification.FaceFrame r24) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.SelfieCaptureViewModel.onFaceFrame(com.facebook.aura.ageverification.FaceFrame):void");
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HeadMovement.values().length];
            try {
                AnonymousClass002.A13(HeadMovement.RIGHT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HeadMovement.UP, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HeadMovement.LEFT, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void cancelRecording(final SelfieStep.Recording recording) {
        AgeCheckFunnelLogging.INSTANCE.selfieCapture(SelfieCapturePhase.RESET, null, SelfieResetReason.FACE_LOST, null);
        C60O.A1D().execute(new Runnable() { // from class: com.facebook.aura.ageverification.SelfieCaptureViewModel.cancelRecording.1
            @Override // java.lang.Runnable
            public final void run() {
                recording.video.delete();
            }
        });
        this.snapshots.reset();
        resetMovement(SelfieStep.Positioning.INSTANCE, null);
        this._effects.AhZ(SelfieEffect.FaceLost.INSTANCE);
    }

    private final void endAttempt(AgeCheckFailure ageCheckFailure) {
        AgeCheckFunnelLogging ageCheckFunnelLogging = AgeCheckFunnelLogging.INSTANCE;
        ageCheckFunnelLogging.selfieCapture(SelfieCapturePhase.FAILED, null, null, ageCheckFailure);
        ageCheckFunnelLogging.attemptResult(AgeCheckMethod.SELFIE, AgeCheckResult.ERROR, ageCheckFailure, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00f9 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fillProgress(X.HtJ<? super kotlin.Unit> r24) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.SelfieCaptureViewModel.fillProgress(X.HtJ):java.lang.Object");
    }

    private final boolean isSnapshotWindow(SelfieStep selfieStep) {
        if (C7384Etj.areEqual(selfieStep, SelfieStep.Positioning.INSTANCE)) {
            return true;
        }
        return (selfieStep instanceof SelfieStep.Recording) && !this.movementStarted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetAfterFailure(final File file) {
        endAttempt(AgeCheckFailure.RECORDING_FAILED);
        this.attemptTake = null;
        if (file != null) {
            C60O.A1D().execute(new Runnable() { // from class: com.facebook.aura.ageverification.SelfieCaptureViewModel$resetAfterFailure$1$1
                @Override // java.lang.Runnable
                public final void run() {
                    file.delete();
                }
            });
        }
        this.snapshots.reset();
        resetMovement(SelfieStep.Positioning.INSTANCE, null);
        this._effects.AhZ(SelfieEffect.RecordingFailed.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetMovement(SelfieStep selfieStep, HeadMovement headMovement) {
        SelfieCaptureState value;
        AHI ahi;
        FaceGuidance faceGuidance;
        boolean z;
        HoC hoC = this.holdJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        HoC hoC2 = this.progressJob;
        if (hoC2 != null) {
            hoC2.A5w(null);
        }
        this.onTarget = false;
        this.movementIndex = 0;
        this.takeEnded = new GAt(null);
        this.basePitch = null;
        this.movementStarted = false;
        this.faceLostSinceMs = -1L;
        AnonymousClass001.A1E(this._progress, null, Float.valueOf(0.0f));
        BLG<SelfieCaptureState> blg = this._state;
        do {
            value = blg.getValue();
            SelfieCaptureState selfieCaptureState = value;
            ahi = AHI.A01;
            faceGuidance = selfieCaptureState.guidance;
            z = selfieCaptureState.recaptureNotice;
            AnonymousClass005.A0y(selfieStep, faceGuidance, ahi);
        } while (!blg.A6e(value, new SelfieCaptureState(selfieStep, faceGuidance, headMovement, ahi, false, false, z)));
    }

    public static /* synthetic */ void resetMovement$default(SelfieCaptureViewModel selfieCaptureViewModel, SelfieStep selfieStep, HeadMovement headMovement, int i, Object obj) {
        if ((i & 2) != 0) {
            headMovement = null;
        }
        selfieCaptureViewModel.resetMovement(selfieStep, headMovement);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateMovement(com.facebook.aura.ageverification.SelfieStep.Recording r18, com.facebook.aura.ageverification.HeadPose r19, long r20) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.SelfieCaptureViewModel.updateMovement(com.facebook.aura.ageverification.SelfieStep$Recording, com.facebook.aura.ageverification.HeadPose, long):void");
    }

    public final Object awaitTakeEnd(HtJ<? super Unit> htJ) {
        Object objA0W = C3cG.A0W(this.takeEnded, htJ);
        return objA0W != EnumC10460Hji.A02 ? Unit.INSTANCE : objA0W;
    }

    public final void beginTake(int i, boolean z) {
        if (i != this.take) {
            this.take = i;
            HoC hoC = this.startJob;
            if (hoC != null) {
                hoC.A5w(null);
            }
            this.clearing = clearFiles();
            this.trackingUnavailable = false;
            this.snapshots.reset();
            this.poseFilter.reset();
            this.lastPose = null;
            this.alignedSinceMs = -1L;
            this.darkSinceMs = -1L;
            FaceGuidance faceGuidance = FaceGuidance.POSITION;
            this.shownHint = faceGuidance;
            this.shownHintSinceMs = -1L;
            this.pendingHintSinceMs = -1L;
            SelfieStep.Positioning positioning = SelfieStep.Positioning.INSTANCE;
            resetMovement(positioning, null);
            AnonymousClass001.A1E(this._state, null, new SelfieCaptureState(positioning, faceGuidance, null, AHI.A01, false, false, z));
        }
    }

    public final C20Q<SelfieEffect> getEffects() {
        return this.effects;
    }

    public final C1BN<Float> getProgress() {
        return this.progress;
    }

    public final C1BN<SelfieCaptureState> getState() {
        return this.state;
    }

    public final C1BN<SelfieCaptureUi> getUi() {
        return this.ui;
    }

    public final void onCameraUnavailable() {
        endAttempt(AgeCheckFailure.CAMERA_ERROR);
        this._effects.AhZ(SelfieEffect.CameraUnavailable.INSTANCE);
    }

    public final void onRecordingStarted() {
        Integer num = this.attemptTake;
        int i = this.take;
        if (num == null || num.intValue() != i) {
            this.attemptTake = Integer.valueOf(i);
            AgeCheckFunnelLogging ageCheckFunnelLogging = AgeCheckFunnelLogging.INSTANCE;
            ageCheckFunnelLogging.attemptStarted(AgeCheckMethod.SELFIE);
            ageCheckFunnelLogging.selfieCapture(SelfieCapturePhase.CAMERA_READY, FaceDetectionModule.source, null, null);
        }
        HeadPose headPose = this.lastPose;
        this.basePitch = headPose != null ? Float.valueOf(headPose.pitch) : null;
        BLL bllA00 = AEu.A00(this);
        C109001 c109001 = new C109001(null);
        C6ys c6ys = C6ys.A00;
        Integer num2 = C79.A00;
        this.holdJob = GAo.A02(num2, c6ys, c109001, bllA00);
        this.progressJob = GAo.A02(num2, c6ys, new C109012(null), AEu.A00(this));
    }

    public SelfieCaptureViewModel(Context context, String str, int i, boolean z) {
        boolean zA1b = AnonymousClass004.A1b(context, str);
        this.context = context;
        this.userId = str;
        this.take = i;
        SelfieStep.Positioning positioning = SelfieStep.Positioning.INSTANCE;
        FaceGuidance faceGuidance = FaceGuidance.POSITION;
        C9286GCn c9286GCnA14 = C3cG.A14(new SelfieCaptureState(positioning, faceGuidance, null, AHI.A01, zA1b, zA1b, z));
        this._state = c9286GCnA14;
        this.state = C3cG.A11(c9286GCnA14);
        C9286GCn c9286GCnA142 = C3cG.A14(Float.valueOf(0.0f));
        this._progress = c9286GCnA142;
        this.progress = C3cG.A11(c9286GCnA142);
        GCV gcvA00 = AbstractC10623Hzj.A00(C79.A00, -2);
        this._effects = gcvA00;
        this.effects = Hu1.A01(gcvA00);
        this.clearing = clearFiles();
        this.snapshots = new FrontalSnapshotSelector();
        this.takeEnded = new GAt(null);
        Companion companion = Companion;
        SelfieCaptureViewModel$special$$inlined$map$1 selfieCaptureViewModel$special$$inlined$map$1 = new SelfieCaptureViewModel$special$$inlined$map$1(c9286GCnA14, companion);
        this.ui = AnonymousClass441.A00(companion.captureUi((SelfieCaptureState) c9286GCnA14.getValue()), AEu.A00(this), selfieCaptureViewModel$special$$inlined$map$1, C3Ek.A00);
        this.poseFilter = new HeadPoseFilter();
        this.alignedSinceMs = -1L;
        this.faceLostSinceMs = -1L;
        this.darkSinceMs = -1L;
        this.shownHint = faceGuidance;
        this.shownHintSinceMs = -1L;
        this.pendingHint = faceGuidance;
        this.pendingHintSinceMs = -1L;
    }

    private final HoC clearFiles() {
        BLL bllA00 = AEu.A00(this);
        return GAo.A02(C79.A00, AnonymousClass001.A0y(), new C108961(null), bllA00);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.ageverification.FaceGuidance debounceHint(com.facebook.aura.ageverification.FaceGuidance r14, long r15) {
        /*
            r13 = this;
            java.lang.Integer r1 = r14.getHintRes()
            com.facebook.aura.ageverification.FaceGuidance r0 = r13.shownHint
            java.lang.Integer r0 = r0.getHintRes()
            boolean r2 = X.C7384Etj.areEqual(r1, r0)
            r0 = -1
            if (r2 == 0) goto L17
            r13.shownHint = r14
            r13.pendingHintSinceMs = r0
            return r14
        L17:
            java.lang.Integer r3 = r14.getHintRes()
            com.facebook.aura.ageverification.FaceGuidance r2 = r13.pendingHint
            java.lang.Integer r2 = r2.getHintRes()
            boolean r2 = X.C7384Etj.areEqual(r3, r2)
            r9 = r15
            if (r2 == 0) goto L2e
            long r7 = r13.pendingHintSinceMs
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 != 0) goto L31
        L2e:
            r13.pendingHintSinceMs = r15
            r7 = r15
        L31:
            r13.pendingHint = r14
            long r2 = r13.shownHintSinceMs
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L42
            long r5 = r15 - r2
            r3 = 400(0x190, double:1.976E-321)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r3 = 0
            if (r2 < 0) goto L43
        L42:
            r3 = 1
        L43:
            r11 = 100
            boolean r2 = com.facebook.aura.ageverification.SelfieCaptureViewModelKt.heldFor(r7, r9, r11)
            if (r2 == 0) goto L53
            if (r3 == 0) goto L53
            r13.shownHint = r14
            r13.shownHintSinceMs = r15
            r13.pendingHintSinceMs = r0
        L53:
            com.facebook.aura.ageverification.FaceGuidance r14 = r13.shownHint
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.SelfieCaptureViewModel.debounceHint(com.facebook.aura.ageverification.FaceGuidance, long):com.facebook.aura.ageverification.FaceGuidance");
    }

    private final void onStart() {
        if (C7384Etj.areEqual(C60Q.A0F(this).step, SelfieStep.Positioning.INSTANCE)) {
            HoC hoC = this.startJob;
            if (hoC == null || !hoC.isActive()) {
                this.startJob = AnonymousClass001.A11(new C109021(null), AEu.A00(this));
            }
        }
    }

    public final void cancelTake() {
        final SelfieStep.Recording recording;
        SelfieStep selfieStep = C60Q.A0F(this).step;
        SelfieStep.Positioning positioning = SelfieStep.Positioning.INSTANCE;
        if (C7384Etj.areEqual(selfieStep, positioning) || (selfieStep instanceof SelfieStep.Recording)) {
            HoC hoC = this.startJob;
            if (hoC != null) {
                hoC.A5w(null);
            }
            if ((selfieStep instanceof SelfieStep.Recording) && (recording = (SelfieStep.Recording) selfieStep) != null) {
                AgeCheckFunnelLogging.INSTANCE.selfieCapture(SelfieCapturePhase.RESET, null, SelfieResetReason.APP_PAUSED, null);
                C60O.A1D().execute(new Runnable() { // from class: com.facebook.aura.ageverification.SelfieCaptureViewModel$cancelTake$1$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        recording.video.delete();
                    }
                });
            }
            this.snapshots.reset();
            resetMovement(positioning, null);
        }
    }

    @Override // X.AEs
    public void onCleared() {
        C60O.A1D().execute(new Runnable() { // from class: com.facebook.aura.ageverification.SelfieCaptureViewModel.onCleared.1
            @Override // java.lang.Runnable
            public final void run() {
                AgeVerificationFiles ageVerificationFiles = AgeVerificationFiles.INSTANCE;
                SelfieCaptureViewModel selfieCaptureViewModel = SelfieCaptureViewModel.this;
                ageVerificationFiles.clear(selfieCaptureViewModel.context, selfieCaptureViewModel.userId);
            }
        });
    }

    public final void onFaceTrackingUnavailable() {
        final SelfieStep.Recording recording;
        SelfieStep selfieStep = C60Q.A0F(this).step;
        if (this.trackingUnavailable) {
            return;
        }
        SelfieStep.Positioning positioning = SelfieStep.Positioning.INSTANCE;
        if (C7384Etj.areEqual(selfieStep, positioning) || (selfieStep instanceof SelfieStep.Recording)) {
            this.trackingUnavailable = true;
            endAttempt(AgeCheckFailure.FACE_DETECTION_UNAVAILABLE);
            HoC hoC = this.startJob;
            if (hoC != null) {
                hoC.A5w(null);
            }
            if ((selfieStep instanceof SelfieStep.Recording) && (recording = (SelfieStep.Recording) selfieStep) != null) {
                C60O.A1D().execute(new Runnable() { // from class: com.facebook.aura.ageverification.SelfieCaptureViewModel$onFaceTrackingUnavailable$1$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        recording.video.delete();
                    }
                });
            }
            this.snapshots.reset();
            resetMovement(positioning, null);
            this._effects.AhZ(SelfieEffect.TrackingUnavailable.INSTANCE);
        }
    }

    public final void onRecorded() {
        SelfieStep.Recording recording;
        SelfieCaptureState value;
        SelfieStep.Finishing finishing;
        FaceGuidance faceGuidance;
        HeadMovement headMovement;
        AHD<HeadMovement> ahd;
        boolean z;
        boolean z2;
        boolean z3;
        SelfieStep selfieStep = C60Q.A0F(this).step;
        if (!(selfieStep instanceof SelfieStep.Recording) || (recording = (SelfieStep.Recording) selfieStep) == null) {
            return;
        }
        FaceSnapshot faceSnapshot = this.snapshots.best;
        if (faceSnapshot == null) {
            CFK.A04(SelfieCaptureViewModelKt.TAG, "The selfie frame was not captured");
            resetAfterFailure(recording.video);
            return;
        }
        BLG<SelfieCaptureState> blg = this._state;
        do {
            value = blg.getValue();
            SelfieCaptureState selfieCaptureState = value;
            finishing = SelfieStep.Finishing.INSTANCE;
            faceGuidance = selfieCaptureState.guidance;
            headMovement = selfieCaptureState.movement;
            ahd = selfieCaptureState.completed;
            z = selfieCaptureState.frontalHeld;
            z2 = selfieCaptureState.outOfCircle;
            z3 = selfieCaptureState.recaptureNotice;
            AnonymousClass005.A0y(finishing, faceGuidance, ahd);
        } while (!blg.A6e(value, new SelfieCaptureState(finishing, faceGuidance, headMovement, ahd, z, z2, z3)));
        AnonymousClass001.A1J(new C108992(recording, faceSnapshot, null), AEu.A00(this));
    }

    public final void onRecordingFailed() {
        SelfieStep.Recording recording;
        SelfieStep selfieStep = C60Q.A0F(this).step;
        if (!(selfieStep instanceof SelfieStep.Recording) || (recording = (SelfieStep.Recording) selfieStep) == null) {
            return;
        }
        resetAfterFailure(recording.video);
    }
}
