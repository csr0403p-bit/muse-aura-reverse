package com.facebook.aura.ageverification;

import X.AEs;
import X.AEu;
import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC10623Hzj;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BLG;
import X.BLL;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C2zT;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C7Bq;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.F2X;
import X.G0U;
import X.G0V;
import X.GAo;
import X.GCV;
import X.HnJ;
import X.HoC;
import X.HsJ;
import X.Ht9;
import X.HtJ;
import X.Hu1;
import X.Hwg;
import X.HzR;
import X.InterfaceC2349BUy;
import android.content.Context;
import android.os.SystemClock;
import com.facebook.aura.ageverification.SelfieAgeStepState;
import com.facebook.aura.ageverification.SelfieStep;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.ageverification.intf.AgeCheckStep;
import com.facebook.aura.ageverification.intf.AgeCheckVia;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.user.provider.AgeCheckMethod;
import java.io.File;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class SelfieAgeStepViewModel extends AEs {
    public static final int $stable = 8;
    public final HzR<SelfieAgeStepEffect> _effects;
    public final BLG<SelfieAgeStepState> _state;
    public int captureKey;
    public boolean confirmedAcknowledged;
    public final Context context;
    public final C20Q<SelfieAgeStepEffect> effects;
    public Map<AgeVerificationUploadKind, ? extends File> files;
    public int handledFailedRefreshes;
    public HoC job;
    public long pollDeadlineMs;
    public HoC pollJob;
    public boolean resumed;
    public long reviewStartedAtMs;
    public final C1BN<SelfieAgeStepState> state;
    public AgeCheckVia stepVia;
    public final String userId;

    @DebugMetadata(c = "com.facebook.aura.ageverification.SelfieAgeStepViewModel$1", f = "SelfieAgeStepViewModel.kt", l = {103}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ageverification.SelfieAgeStepViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        /* renamed from: com.facebook.aura.ageverification.SelfieAgeStepViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public final /* synthetic */ class C00281 implements C20Z, InterfaceC2349BUy {
            public final /* synthetic */ SelfieAgeStepViewModel $tmp0;

            public C00281(SelfieAgeStepViewModel selfieAgeStepViewModel) {
                this.$tmp0 = selfieAgeStepViewModel;
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
                this.$tmp0.logStep((SelfieAgeStepState) obj);
                return Unit.INSTANCE;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof C20Z) && (obj instanceof InterfaceC2349BUy)) {
                    return C7384Etj.areEqual(getFunctionDelegate(), ((InterfaceC2349BUy) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // X.InterfaceC2349BUy
            public final Ht9<?> getFunctionDelegate() {
                return new F2X(2, this.$tmp0, SelfieAgeStepViewModel.class, "logStep", "logStep(Lcom/facebook/aura/ageverification/SelfieAgeStepState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(SelfieAgeStepState selfieAgeStepState, HtJ<? super Unit> htJ) {
                this.$tmp0.logStep(selfieAgeStepState);
                return Unit.INSTANCE;
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SelfieAgeStepViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SelfieAgeStepViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SelfieAgeStepViewModel selfieAgeStepViewModel = SelfieAgeStepViewModel.this;
                BLG<SelfieAgeStepState> blg = selfieAgeStepViewModel._state;
                C00281 c00281 = new C00281(selfieAgeStepViewModel);
                this.label = 1;
                if (blg.collect(c00281, this) == enumC10460Hji) {
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
    }

    public final class Factory extends AuraViewModelFactory<SelfieAgeStepViewModel> {
        public static final int $stable = 8;
        public final Context context;
        public final String userId;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public SelfieAgeStepViewModel create() {
            return new SelfieAgeStepViewModel(AnonymousClass001.A0I(this.context), this.userId);
        }

        public Factory(Context context, String str) {
            AnonymousClass003.A0u(context, str);
            this.context = context;
            this.userId = str;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ageverification.SelfieAgeStepViewModel$prepare$1", f = "SelfieAgeStepViewModel.kt", l = {372}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ageverification.SelfieAgeStepViewModel$prepare$1, reason: invalid class name and case insensitive filesystem */
    public final class C108901 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        /* renamed from: com.facebook.aura.ageverification.SelfieAgeStepViewModel$prepare$1$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SelfieMode.values().length];
                try {
                    AnonymousClass002.A13(SelfieMode.GUIDED, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(SelfieMode.RETRY, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(SelfieMode.UNAVAILABLE, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C108901(HtJ<? super C108901> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SelfieAgeStepViewModel.this.new C108901(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SelfieAgeStepViewModel.this.new C108901(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            BLG<SelfieAgeStepState> blg;
            Object capturing;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                FaceDetectionModule faceDetectionModule = FaceDetectionModule.INSTANCE;
                Context context = SelfieAgeStepViewModel.this.context;
                this.label = 1;
                obj = faceDetectionModule.awaitMode(context, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            int iOrdinal = ((SelfieMode) obj).ordinal();
            if (iOrdinal == 1) {
                SelfieAgeStepViewModel selfieAgeStepViewModel = SelfieAgeStepViewModel.this;
                blg = selfieAgeStepViewModel._state;
                int i2 = selfieAgeStepViewModel.captureKey + 1;
                selfieAgeStepViewModel.captureKey = i2;
                capturing = new SelfieAgeStepState.Capturing(i2);
            } else {
                if (iOrdinal != 0) {
                    if (iOrdinal != 2) {
                        throw C3cG.A0q();
                    }
                    SelfieAgeStepViewModel.this.otherMethods(SelfieAgeStepEffect.SELFIE_UNAVAILABLE);
                    return Unit.INSTANCE;
                }
                blg = SelfieAgeStepViewModel.this._state;
                capturing = new SelfieAgeStepState.Error(RetryAction.REDOWNLOAD, false);
            }
            AnonymousClass002.A1I(blg, capturing);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ageverification.SelfieAgeStepViewModel$recheck$1", f = "SelfieAgeStepViewModel.kt", l = {440}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ageverification.SelfieAgeStepViewModel$recheck$1, reason: invalid class name and case insensitive filesystem */
    public final class C108911 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C108911(HtJ<? super C108911> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SelfieAgeStepViewModel.this.new C108911(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SelfieAgeStepViewModel.this.new C108911(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x008a  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                X.Hji r1 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r5 = 1
                if (r0 == 0) goto L90
                if (r0 != r5) goto L9e
                java.lang.Object r6 = X.AnonymousClass001.A0q(r8)
            Ld:
                boolean r0 = r6 instanceof X.C10571Hud
                r4 = 0
                r3 = r6
                if (r0 == 0) goto L14
                r3 = r4
            L14:
                com.facebook.aura.ageverification.AgeVerificationStatus r3 = (com.facebook.aura.ageverification.AgeVerificationStatus) r3
                if (r3 == 0) goto L8e
                com.facebook.aura.ageverification.AgeVerificationState r1 = r3.state
            L1a:
                com.facebook.aura.ageverification.AgeVerificationState r0 = com.facebook.aura.ageverification.AgeVerificationState.PENDING
                if (r1 == r0) goto L32
                java.lang.String r2 = "not_eligible"
                if (r3 != 0) goto L35
                java.lang.Throwable r0 = X.HsJ.A00(r6)
                if (r0 == 0) goto L2c
                java.lang.String r4 = com.facebook.aura.ageverification.AgeVerificationClientKt.getProblemType(r0)
            L2c:
                boolean r0 = r2.equals(r4)
                if (r0 != 0) goto L35
            L32:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
            L35:
                com.facebook.aura.ageverification.SelfieAgeStepViewModel r1 = com.facebook.aura.ageverification.SelfieAgeStepViewModel.this
                java.lang.Throwable r0 = X.HsJ.A00(r6)
                if (r0 != 0) goto L80
                com.facebook.aura.ageverification.AgeVerificationStatus r6 = (com.facebook.aura.ageverification.AgeVerificationStatus) r6
                com.facebook.aura.ageverification.SelfieAgeStepViewModel.access$logStatusResult(r1, r6)
                com.facebook.aura.ageverification.AgeVerificationState r0 = r6.state
                if (r0 == 0) goto L7c
                int r0 = r0.ordinal()
                switch(r0) {
                    case -1: goto L7c;
                    case 0: goto L8a;
                    case 1: goto L72;
                    case 2: goto L5a;
                    case 3: goto L52;
                    case 4: goto L5e;
                    case 5: goto L7c;
                    case 6: goto L7c;
                    default: goto L4d;
                }
            L4d:
                kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
                throw r0
            L52:
                boolean r0 = r1.confirmedAcknowledged
                if (r0 != 0) goto L8a
                com.facebook.aura.ageverification.SelfieAgeStepViewModel.access$confirmed(r1)
                goto L32
            L5a:
                com.facebook.aura.ageverification.SelfieAgeStepViewModel.access$confirm(r1)
                goto L32
            L5e:
                boolean r0 = X.C60Q.A1S(r6)
                if (r0 == 0) goto L7c
                X.BLG<com.facebook.aura.ageverification.SelfieAgeStepState> r3 = r1._state
                com.facebook.aura.ageverification.RetryAction r2 = com.facebook.aura.ageverification.RetryAction.RECAPTURE
                r1 = 0
                com.facebook.aura.ageverification.SelfieAgeStepState$Error r0 = new com.facebook.aura.ageverification.SelfieAgeStepState$Error
                r0.<init>(r2, r1)
                X.AnonymousClass002.A1I(r3, r0)
                goto L32
            L72:
                boolean r0 = X.C60Q.A1S(r6)
                if (r0 == 0) goto L7c
                com.facebook.aura.ageverification.SelfieAgeStepViewModel.access$showIntro(r1)
                goto L32
            L7c:
                com.facebook.aura.ageverification.SelfieAgeStepViewModel.access$otherMethodsFallback(r1, r5)
                goto L32
            L80:
                java.lang.String r0 = com.facebook.aura.ageverification.AgeVerificationClientKt.getProblemType(r0)
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L32
            L8a:
                com.facebook.aura.ageverification.SelfieAgeStepViewModel.access$resolved(r1)
                goto L32
            L8e:
                r1 = r4
                goto L1a
            L90:
                X.Hwg.A00(r8)
                com.facebook.aura.ageverification.AgeVerificationClient r0 = com.facebook.aura.ageverification.AgeVerificationClient.INSTANCE
                r7.label = r5
                java.lang.Object r6 = r0.m222statusIoAF18A(r7)
                if (r6 != r1) goto Ld
                return r1
            L9e:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.SelfieAgeStepViewModel.C108911.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ageverification.SelfieAgeStepViewModel$resolve$1", f = "SelfieAgeStepViewModel.kt", l = {269, 271}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ageverification.SelfieAgeStepViewModel$resolve$1, reason: invalid class name and case insensitive filesystem */
    public final class C108921 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.ageverification.SelfieAgeStepViewModel$resolve$1$1", f = "SelfieAgeStepViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.ageverification.SelfieAgeStepViewModel$resolve$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00291 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ SelfieAgeStepViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00291(SelfieAgeStepViewModel selfieAgeStepViewModel, HtJ<? super C00291> htJ) {
                super(2, htJ);
                this.this$0 = selfieAgeStepViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C00291(this.this$0, htJ);
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return new C00291(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                AgeVerificationFiles ageVerificationFiles = AgeVerificationFiles.INSTANCE;
                SelfieAgeStepViewModel selfieAgeStepViewModel = this.this$0;
                ageVerificationFiles.clear(selfieAgeStepViewModel.context, selfieAgeStepViewModel.userId);
                return Unit.INSTANCE;
            }
        }

        public C108921(HtJ<? super C108921> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SelfieAgeStepViewModel.this.new C108921(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SelfieAgeStepViewModel.this.new C108921(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                X.Hji r6 = X.EnumC10460Hji.A02
                int r0 = r8.label
                r3 = 0
                r4 = 1
                r5 = 2
                if (r0 == 0) goto L3b
                if (r0 == r4) goto L5c
                if (r0 != r5) goto Lb3
                java.lang.Object r2 = r8.L$0
                com.facebook.aura.ageverification.SelfieAgeStepViewModel r2 = (com.facebook.aura.ageverification.SelfieAgeStepViewModel) r2
                java.lang.Object r1 = X.AnonymousClass001.A0q(r9)
            L15:
                com.facebook.aura.ageverification.SelfieAgeStepViewModel r9 = com.facebook.aura.ageverification.SelfieAgeStepViewModel.this
                long r7 = r9.reviewStartedAtMs
                r5 = 0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 != 0) goto L20
                r4 = 0
            L20:
                java.lang.Throwable r0 = X.HsJ.A00(r1)
                if (r0 != 0) goto L84
                com.facebook.aura.ageverification.AgeVerificationStatus r1 = (com.facebook.aura.ageverification.AgeVerificationStatus) r1
                com.facebook.aura.ageverification.SelfieAgeStepViewModel.access$logStatusResult(r2, r1)
                com.facebook.aura.ageverification.AgeVerificationState r0 = r1.state
                if (r0 == 0) goto Laf
                int r0 = r0.ordinal()
                switch(r0) {
                    case -1: goto Laf;
                    case 0: goto L95;
                    case 1: goto L72;
                    case 2: goto L6e;
                    case 3: goto L7c;
                    case 4: goto L99;
                    case 5: goto Laf;
                    case 6: goto Laf;
                    default: goto L36;
                }
            L36:
                kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
                throw r0
            L3b:
                X.Hwg.A00(r9)
                com.facebook.aura.ageverification.SelfieAgeStepViewModel r0 = com.facebook.aura.ageverification.SelfieAgeStepViewModel.this
                java.util.Map<com.facebook.aura.ageverification.AgeVerificationUploadKind, ? extends java.io.File> r0 = r0.files
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L5f
                X.78T r2 = X.AnonymousClass001.A0y()
                com.facebook.aura.ageverification.SelfieAgeStepViewModel r1 = com.facebook.aura.ageverification.SelfieAgeStepViewModel.this
                com.facebook.aura.ageverification.SelfieAgeStepViewModel$resolve$1$1 r0 = new com.facebook.aura.ageverification.SelfieAgeStepViewModel$resolve$1$1
                r0.<init>(r1, r3)
                r8.label = r4
                java.lang.Object r0 = X.GAo.A00(r8, r2, r0)
                if (r0 != r6) goto L5f
                return r6
            L5c:
                X.Hwg.A00(r9)
            L5f:
                com.facebook.aura.ageverification.SelfieAgeStepViewModel r2 = com.facebook.aura.ageverification.SelfieAgeStepViewModel.this
                com.facebook.aura.ageverification.AgeVerificationClient r0 = com.facebook.aura.ageverification.AgeVerificationClient.INSTANCE
                r8.L$0 = r2
                r8.label = r5
                java.lang.Object r1 = r0.m222statusIoAF18A(r8)
                if (r1 != r6) goto L15
                return r6
            L6e:
                com.facebook.aura.ageverification.SelfieAgeStepViewModel.access$confirm(r2)
                goto Lac
            L72:
                boolean r0 = X.C60Q.A1S(r1)
                if (r0 == 0) goto Laf
                com.facebook.aura.ageverification.SelfieAgeStepViewModel.access$showIntro(r2)
                goto Lac
            L7c:
                boolean r0 = r2.confirmedAcknowledged
                if (r0 != 0) goto L95
                com.facebook.aura.ageverification.SelfieAgeStepViewModel.access$confirmed(r2)
                goto Lac
            L84:
                java.lang.String r1 = com.facebook.aura.ageverification.AgeVerificationClientKt.getProblemType(r0)
                java.lang.String r0 = "not_eligible"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L95
                X.BLG<com.facebook.aura.ageverification.SelfieAgeStepState> r4 = r9._state
                com.facebook.aura.ageverification.RetryAction r2 = com.facebook.aura.ageverification.RetryAction.REFRESH
                goto La3
            L95:
                com.facebook.aura.ageverification.SelfieAgeStepViewModel.access$resolved(r2)
                goto Lac
            L99:
                boolean r0 = X.C60Q.A1S(r1)
                if (r0 == 0) goto Laf
                X.BLG<com.facebook.aura.ageverification.SelfieAgeStepState> r4 = r2._state
                com.facebook.aura.ageverification.RetryAction r2 = com.facebook.aura.ageverification.RetryAction.RECAPTURE
            La3:
                r1 = 0
                com.facebook.aura.ageverification.SelfieAgeStepState$Error r0 = new com.facebook.aura.ageverification.SelfieAgeStepState$Error
                r0.<init>(r2, r1)
                X.AnonymousClass001.A1E(r4, r3, r0)
            Lac:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            Laf:
                com.facebook.aura.ageverification.SelfieAgeStepViewModel.access$otherMethodsFallback(r2, r4)
                goto Lac
            Lb3:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.SelfieAgeStepViewModel.C108921.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ageverification.SelfieAgeStepViewModel$startPolling$1", f = "SelfieAgeStepViewModel.kt", l = {453, 457, 462, 484}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ageverification.SelfieAgeStepViewModel$startPolling$1, reason: invalid class name and case insensitive filesystem */
    public final class C108931 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;

        public C108931(HtJ<? super C108931> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SelfieAgeStepViewModel.this.new C108931(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SelfieAgeStepViewModel.this.new C108931(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0119 A[PHI: r1
  0x0119: PHI (r1v4 com.facebook.aura.ageverification.SelfieAgeStepViewModel) = 
  (r1v1 com.facebook.aura.ageverification.SelfieAgeStepViewModel)
  (r1v5 com.facebook.aura.ageverification.SelfieAgeStepViewModel)
  (r1v5 com.facebook.aura.ageverification.SelfieAgeStepViewModel)
  (r1v5 com.facebook.aura.ageverification.SelfieAgeStepViewModel)
 binds: [B:64:0x010c, B:66:0x0117, B:51:0x00dd, B:56:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0147  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00b2 -> B:9:0x001a). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 352
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.SelfieAgeStepViewModel.C108931.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ageverification.SelfieAgeStepViewModel$submit$1", f = "SelfieAgeStepViewModel.kt", l = {388, 404}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ageverification.SelfieAgeStepViewModel$submit$1, reason: invalid class name and case insensitive filesystem */
    public final class C108941 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public C108941(HtJ<? super C108941> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SelfieAgeStepViewModel.this.new C108941(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SelfieAgeStepViewModel.this.new C108941(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
        
            if (r0.intValue() != 401) goto L43;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 328
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.SelfieAgeStepViewModel.C108941.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void onCaptured(SelfieStep.Complete complete) {
        C7384Etj.A0Y(complete, 0);
        SelfieAgeStepState value = this._state.getValue();
        if ((value instanceof SelfieAgeStepState.Capturing) || (value instanceof SelfieAgeStepState.Recapture)) {
            this.files = AnonymousClass007.A0d(AgeVerificationUploadKind.SELFIE_PHOTO, complete.snapshot.file, C3cG.A0r(AgeVerificationUploadKind.SELFIE_VIDEO, complete.video.file));
            submit();
        }
    }

    public final void onPause() {
        this.resumed = false;
        AnonymousClass002.A1K(this.pollJob);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RetryAction.values().length];
            try {
                AnonymousClass005.A0v(RetryAction.RECAPTURE, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(RetryAction.REDOWNLOAD, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(RetryAction.RESEND, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(RetryAction.RECHECK, iArr, 4);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass005.A0v(RetryAction.REFRESH, iArr, 5);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AgeVerificationState.values().length];
            try {
                AnonymousClass005.A0v(AgeVerificationState.REQUIRED, iArr2, 1);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass005.A0v(AgeVerificationState.PENDING, iArr2, 2);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass005.A0v(AgeVerificationState.CONFIRMED, iArr2, 3);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass005.A0v(AgeVerificationState.NOT_REQUIRED, iArr2, 4);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass005.A0v(AgeVerificationState.FAILED_RETRYABLE, iArr2, 5);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass002.A18(AgeVerificationState.FAILED_FINAL, iArr2);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1G(AgeVerificationState.NOT_SUPPORTED, iArr2);
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private final void back() {
        AnonymousClass002.A1K(this.job);
        this._effects.AhZ(SelfieAgeStepEffect.BACK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void confirm() {
        if (this.pollDeadlineMs == -1) {
            this.pollDeadlineMs = SystemClock.elapsedRealtime() + 120000;
        }
        this._state.Af8(SelfieAgeStepState.Confirming.INSTANCE);
        startPolling();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void confirmed() {
        AnonymousClass002.A1K(this.pollJob);
        deleteFiles();
        this._state.Af8(SelfieAgeStepState.Confirmed.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finalFailure() {
        HoC hoC = this.pollJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        deleteFiles();
        AnonymousClass001.A1E(this._state, null, new SelfieAgeStepState.Resolved(false, true));
        this._effects.AhZ(SelfieAgeStepEffect.RESOLVED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer getHttpResponseCode(Throwable th) {
        AgeVerificationException ageVerificationException;
        if (!(th instanceof AgeVerificationException) || (ageVerificationException = (AgeVerificationException) th) == null) {
            return null;
        }
        return Integer.valueOf(ageVerificationException.httpResponseCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object holdReview(HtJ<? super Unit> htJ) {
        Object objA01;
        long jElapsedRealtime = (this.reviewStartedAtMs + 2000) - SystemClock.elapsedRealtime();
        return (jElapsedRealtime <= 0 || (objA01 = C7Bq.A01(jElapsedRealtime, htJ)) != EnumC10460Hji.A02) ? Unit.INSTANCE : objA01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isTransient(Throwable th) {
        AgeVerificationException ageVerificationException = th instanceof AgeVerificationException ? (AgeVerificationException) th : null;
        if (ageVerificationException == null) {
            return false;
        }
        int i = ageVerificationException.httpResponseCode;
        return i >= 500 || (i <= 0 && ageVerificationException.problemType == null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void logStatusResult(com.facebook.aura.ageverification.AgeVerificationStatus r7) {
        /*
            r6 = this;
            com.facebook.aura.ageverification.AgeVerificationState r0 = r7.state
            if (r0 == 0) goto L16
            int r0 = r0.ordinal()
            switch(r0) {
                case -1: goto L16;
                case 0: goto L10;
                case 1: goto L29;
                case 2: goto L29;
                case 3: goto L10;
                case 4: goto L13;
                case 5: goto L16;
                case 6: goto L19;
                default: goto Lb;
            }
        Lb:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L10:
            com.facebook.aura.ageverification.intf.AgeCheckResult r4 = com.facebook.aura.ageverification.intf.AgeCheckResult.VERIFIED
            goto L1b
        L13:
            com.facebook.aura.ageverification.intf.AgeCheckResult r4 = com.facebook.aura.ageverification.intf.AgeCheckResult.FAILED_RETRYABLE
            goto L1b
        L16:
            com.facebook.aura.ageverification.intf.AgeCheckResult r4 = com.facebook.aura.ageverification.intf.AgeCheckResult.FAILED_FINAL
            goto L1b
        L19:
            com.facebook.aura.ageverification.intf.AgeCheckResult r4 = com.facebook.aura.ageverification.intf.AgeCheckResult.BLOCKED
        L1b:
            com.facebook.aura.ageverification.intf.AgeCheckResult r0 = com.facebook.aura.ageverification.intf.AgeCheckResult.VERIFIED
            com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging r2 = com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging.INSTANCE
            com.facebook.aura.user.provider.AgeCheckMethod r3 = com.facebook.aura.user.provider.AgeCheckMethod.SELFIE
            if (r4 != r0) goto L2a
            r5 = 0
            r6 = r5
            r7 = r5
            r2.attemptResult(r3, r4, r5, r6, r7)
        L29:
            return
        L2a:
            java.lang.String r1 = r7.attemptStatus
            java.lang.String r0 = "USABILITY_ERROR"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3d
            com.facebook.aura.ageverification.intf.AgeCheckFailure r5 = com.facebook.aura.ageverification.intf.AgeCheckFailure.USABILITY_ERROR
        L36:
            java.lang.Integer r6 = r7.retriesLeft
            r7 = 0
            r2.attemptResult(r3, r4, r5, r6, r7)
            return
        L3d:
            com.facebook.aura.ageverification.intf.AgeCheckFailure r5 = com.facebook.aura.ageverification.intf.AgeCheckFailure.SYSTEM_ERROR
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.SelfieAgeStepViewModel.logStatusResult(com.facebook.aura.ageverification.AgeVerificationStatus):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logStep(SelfieAgeStepState selfieAgeStepState) {
        AgeCheckFunnelLogging ageCheckFunnelLogging;
        AgeCheckStep ageCheckStep;
        if (!(selfieAgeStepState instanceof SelfieAgeStepState.Intro)) {
            if ((selfieAgeStepState instanceof SelfieAgeStepState.Capturing) || (selfieAgeStepState instanceof SelfieAgeStepState.Recapture)) {
                ageCheckFunnelLogging = AgeCheckFunnelLogging.INSTANCE;
                ageCheckStep = AgeCheckStep.SELFIE_CAPTURE;
            } else if (C7384Etj.areEqual(selfieAgeStepState, SelfieAgeStepState.Submitting.INSTANCE) || C7384Etj.areEqual(selfieAgeStepState, SelfieAgeStepState.Confirming.INSTANCE)) {
                ageCheckFunnelLogging = AgeCheckFunnelLogging.INSTANCE;
                ageCheckStep = AgeCheckStep.SELFIE_REVIEWING;
            } else {
                if (!(selfieAgeStepState instanceof SelfieAgeStepState.Error)) {
                    if (!C7384Etj.areEqual(selfieAgeStepState, SelfieAgeStepState.Resolving.INSTANCE) && !C7384Etj.areEqual(selfieAgeStepState, SelfieAgeStepState.Confirmed.INSTANCE) && !(selfieAgeStepState instanceof SelfieAgeStepState.Resolved)) {
                        throw C3cG.A0q();
                    }
                    return;
                }
                ageCheckFunnelLogging = AgeCheckFunnelLogging.INSTANCE;
                ageCheckStep = AgeCheckStep.SELFIE_ERROR;
            }
            ageCheckFunnelLogging.stepShown(ageCheckStep, this.stepVia);
        } else if (((SelfieAgeStepState.Intro) selfieAgeStepState).preparing) {
            return;
        } else {
            AgeCheckFunnelLogging.INSTANCE.selfieIntroShown(this.stepVia);
        }
        this.stepVia = AgeCheckVia.SERVER_REFRESH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void otherMethods(SelfieAgeStepEffect selfieAgeStepEffect) {
        AnonymousClass002.A1K(this.pollJob);
        deleteFiles();
        this._effects.AhZ(selfieAgeStepEffect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void otherMethodsFallback(boolean z) {
        if (z) {
            finalFailure();
        } else {
            otherMethods(SelfieAgeStepEffect.SELFIE_UNAVAILABLE);
        }
    }

    private final void prepare() {
        HtJ htJA13 = AnonymousClass006.A13(this.job);
        AnonymousClass001.A1E(this._state, htJA13, new SelfieAgeStepState.Intro(true));
        this.job = AnonymousClass001.A11(new C108901(htJA13), AEu.A00(this));
    }

    private final void recheck() {
        HtJ htJA13 = AnonymousClass006.A13(this.job);
        this.job = AnonymousClass001.A11(new C108911(htJA13), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resolve(boolean z) {
        HtJ htJA13 = AnonymousClass006.A13(this.job);
        if (!z) {
            this._state.Af8(SelfieAgeStepState.Resolving.INSTANCE);
        }
        this.job = AnonymousClass001.A11(new C108921(htJA13), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resolved() {
        HoC hoC = this.pollJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        AnonymousClass001.A1E(this._state, null, new SelfieAgeStepState.Resolved(this.confirmedAcknowledged, false));
        this._effects.AhZ(SelfieAgeStepEffect.RESOLVED);
    }

    private final void retryOnResume(RetryAction retryAction) {
        if (retryAction == null) {
            this._effects.AhZ(SelfieAgeStepEffect.RESOLVED);
        } else {
            retry(retryAction, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showIntro() {
        AnonymousClass002.A1I(this._state, new SelfieAgeStepState.Intro(false));
    }

    private final void startPolling() {
        if (this.resumed) {
            HoC hoC = this.pollJob;
            if (hoC == null || !hoC.isActive()) {
                this.pollJob = AnonymousClass001.A11(new C108931(null), AEu.A00(this));
            }
        }
    }

    private final void submit() {
        HtJ htJA13 = AnonymousClass006.A13(this.job);
        this._state.Af8(SelfieAgeStepState.Submitting.INSTANCE);
        this.reviewStartedAtMs = SystemClock.elapsedRealtime();
        this.pollDeadlineMs = -1L;
        AgeCheckFunnelLogging.INSTANCE.attemptStarted(AgeCheckMethod.SELFIE);
        this.job = AnonymousClass001.A11(new C108941(htJA13), AEu.A00(this));
    }

    public final C20Q<SelfieAgeStepEffect> getEffects() {
        return this.effects;
    }

    public final C1BN<SelfieAgeStepState> getState() {
        return this.state;
    }

    public final void onBack() {
        SelfieAgeStepState value = this._state.getValue();
        if (!(value instanceof SelfieAgeStepState.Capturing) && !(value instanceof SelfieAgeStepState.Recapture)) {
            if (value instanceof SelfieAgeStepState.Intro) {
                if (((SelfieAgeStepState.Intro) value).preparing) {
                    HoC hoC = this.job;
                    if (hoC != null) {
                        hoC.A5w(null);
                    }
                }
            } else if (!C7384Etj.areEqual(value, SelfieAgeStepState.Resolving.INSTANCE) && !(value instanceof SelfieAgeStepState.Error)) {
                if (!(value instanceof SelfieAgeStepState.Resolved)) {
                    if (!C7384Etj.areEqual(value, SelfieAgeStepState.Submitting.INSTANCE) && !C7384Etj.areEqual(value, SelfieAgeStepState.Confirming.INSTANCE) && !C7384Etj.areEqual(value, SelfieAgeStepState.Confirmed.INSTANCE)) {
                        throw C3cG.A0q();
                    }
                    return;
                }
                SelfieAgeStepState.Resolved resolved = (SelfieAgeStepState.Resolved) value;
                if (resolved.afterConfirmed || resolved.afterFinalFailure) {
                    return;
                }
            }
            back();
            SelfieAgeStepAnalytics.INSTANCE.logClick(HatchComponent.BACK_BUTTON, HatchScreen.ONBOARDING_AGE_CONFIRMATION);
        }
        AgeCheckFunnelLogging.INSTANCE.attemptCancelled(AgeCheckMethod.SELFIE);
        this.stepVia = AgeCheckVia.BACK;
        AnonymousClass001.A1E(this._state, null, new SelfieAgeStepState.Intro(false));
        SelfieAgeStepAnalytics.INSTANCE.logClick(HatchComponent.BACK_BUTTON, HatchScreen.ONBOARDING_AGE_CONFIRMATION);
    }

    public final void onCaptureUnavailable() {
        SelfieAgeStepState value = this._state.getValue();
        if ((value instanceof SelfieAgeStepState.Capturing) || (value instanceof SelfieAgeStepState.Recapture)) {
            otherMethods(SelfieAgeStepEffect.SELFIE_UNAVAILABLE);
        }
    }

    public final void onConfirmedContinue() {
        SelfieAgeStepAnalytics.INSTANCE.logClick(HatchComponent.CONTINUE_BUTTON, HatchScreen.ONBOARDING_AGE_CONFIRMATION);
        this.confirmedAcknowledged = true;
        resolved();
    }

    public final void onContinue() {
        SelfieAgeStepAnalytics.INSTANCE.logClick(HatchComponent.CONTINUE_BUTTON, HatchScreen.ONBOARDING_AGE_CONFIRMATION);
        AgeCheckFunnelLogging.INSTANCE.methodSelectedIfNew(AgeCheckMethod.SELFIE);
        this.stepVia = AgeCheckVia.PICK;
        prepare();
    }

    public final void onFailedRefreshes(int i) {
        SelfieAgeStepState.Resolved resolved;
        if (i > this.handledFailedRefreshes) {
            this.handledFailedRefreshes = i;
            SelfieAgeStepState value = this._state.getValue();
            if (!(value instanceof SelfieAgeStepState.Resolved) || (resolved = (SelfieAgeStepState.Resolved) value) == null) {
                return;
            }
            AnonymousClass002.A1I(this._state, new SelfieAgeStepState.Error(resolved.afterFinalFailure ? null : RetryAction.REFRESH, true));
        }
    }

    public final void onHelp() {
        SelfieAgeStepAnalytics.INSTANCE.logClick(HatchComponent.AGE_CHECK_HELP_BUTTON, HatchScreen.ONBOARDING_AGE_CONFIRMATION);
    }

    public final void onHidden() {
        SelfieAgeStepState value = this._state.getValue();
        if (!C7384Etj.areEqual(value, SelfieAgeStepState.Submitting.INSTANCE) && !C7384Etj.areEqual(value, SelfieAgeStepState.Confirming.INSTANCE)) {
            AgeCheckFunnelLogging.INSTANCE.attemptCancelled(AgeCheckMethod.SELFIE);
        }
        HoC hoC = this.job;
        if (hoC != null) {
            hoC.A5w(null);
        }
        if (C7384Etj.areEqual(this._state.getValue(), new SelfieAgeStepState.Intro(true))) {
            AnonymousClass001.A1E(this._state, null, new SelfieAgeStepState.Intro(false));
        }
        while (!(this._effects.AhX() instanceof C2zT)) {
        }
    }

    public final void onHowSelfiesWork() {
        SelfieAgeStepAnalytics.INSTANCE.logClick(HatchComponent.HOW_VIDEO_SELFIES_WORK_LINK, HatchScreen.ONBOARDING_AGE_CONFIRMATION);
    }

    public final void onOtherMethods() {
        SelfieAgeStepAnalytics.INSTANCE.logClick(HatchComponent.TRY_ANOTHER_METHOD, HatchScreen.ONBOARDING_AGE_CONFIRMATION);
        AgeCheckFunnelLogging.INSTANCE.attemptCancelled(AgeCheckMethod.SELFIE);
        HoC hoC = this.job;
        if (hoC != null) {
            hoC.A5w(null);
        }
        otherMethods(SelfieAgeStepEffect.OTHER_METHODS);
    }

    public final void onRetry() {
        SelfieAgeStepState.Error error;
        RetryAction retryAction;
        SelfieAgeStepState value = this._state.getValue();
        if (!(value instanceof SelfieAgeStepState.Error) || (error = (SelfieAgeStepState.Error) value) == null || (retryAction = error.retry) == null) {
            return;
        }
        SelfieAgeStepAnalytics.INSTANCE.logClick(HatchComponent.RETRY_BUTTON, HatchScreen.ONBOARDING_AGE_CONFIRMATION);
        this.stepVia = AgeCheckVia.RETRY;
        retry(retryAction, false);
    }

    public final void onShown() {
        if (C7384Etj.areEqual(this._state.getValue(), SelfieAgeStepState.Resolving.INSTANCE)) {
            HoC hoC = this.job;
            if (hoC == null || !hoC.isActive()) {
                resolve(false);
            }
        }
    }

    public SelfieAgeStepViewModel(Context context, String str) {
        boolean zA1b = AnonymousClass004.A1b(context, str);
        this.context = context;
        this.userId = str;
        C9286GCn c9286GCnA01 = HnJ.A01(SelfieAgeStepState.Resolving.INSTANCE);
        this._state = c9286GCnA01;
        this.state = C3cG.A11(c9286GCnA01);
        Integer num = C79.A00;
        GCV gcvA00 = AbstractC10623Hzj.A00(num, -2);
        this._effects = gcvA00;
        this.effects = Hu1.A01(gcvA00);
        this.pollDeadlineMs = -1L;
        this.files = AGH.A0E();
        this.stepVia = AgeCheckVia.SERVER_REFRESH;
        resolve(zA1b);
        BLL bllA00 = AEu.A00(this);
        GAo.A02(num, C6ys.A00, new AnonymousClass1(null), bllA00);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void applyStatus(Object obj, boolean z, G0U<? super Throwable, Unit> g0u) {
        Throwable thA00 = HsJ.A00(obj);
        if (thA00 == null) {
            AgeVerificationStatus ageVerificationStatus = (AgeVerificationStatus) obj;
            logStatusResult(ageVerificationStatus);
            AgeVerificationState ageVerificationState = ageVerificationStatus.state;
            if (ageVerificationState != null) {
                switch (ageVerificationState.ordinal()) {
                    case -1:
                    case 5:
                    case 6:
                        break;
                    case 0:
                        break;
                    case 1:
                        if (C60Q.A1S(ageVerificationStatus)) {
                            showIntro();
                            return;
                        }
                        break;
                    case 2:
                        confirm();
                        return;
                    case 3:
                        if (!this.confirmedAcknowledged) {
                            confirmed();
                            return;
                        }
                        break;
                    case 4:
                        if (C60Q.A1S(ageVerificationStatus)) {
                            AnonymousClass002.A1I(this._state, new SelfieAgeStepState.Error(RetryAction.RECAPTURE, false));
                            return;
                        }
                        break;
                    default:
                        throw C3cG.A0q();
                }
            }
            otherMethodsFallback(z);
            return;
        }
        if (!AgeVerificationClientKt.NOT_ELIGIBLE.equals(AgeVerificationClientKt.getProblemType(thA00))) {
            g0u.invoke(thA00);
            return;
        }
        resolved();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static /* synthetic */ void applyStatus$default(SelfieAgeStepViewModel selfieAgeStepViewModel, Object obj, boolean z, G0U g0u, int i, Object obj2) {
        boolean zA1Q = AnonymousClass001.A1Q(i, z);
        Throwable thA00 = HsJ.A00(obj);
        if (thA00 == null) {
            AgeVerificationStatus ageVerificationStatus = (AgeVerificationStatus) obj;
            selfieAgeStepViewModel.logStatusResult(ageVerificationStatus);
            AgeVerificationState ageVerificationState = ageVerificationStatus.state;
            if (ageVerificationState != null) {
                switch (ageVerificationState.ordinal()) {
                    case -1:
                    case 5:
                    case 6:
                        break;
                    case 0:
                        break;
                    case 1:
                        if (C60Q.A1S(ageVerificationStatus)) {
                            selfieAgeStepViewModel.showIntro();
                            return;
                        }
                        break;
                    case 2:
                        selfieAgeStepViewModel.confirm();
                        return;
                    case 3:
                        if (!selfieAgeStepViewModel.confirmedAcknowledged) {
                            selfieAgeStepViewModel.confirmed();
                            return;
                        }
                        break;
                    case 4:
                        if (C60Q.A1S(ageVerificationStatus)) {
                            AnonymousClass002.A1I(selfieAgeStepViewModel._state, new SelfieAgeStepState.Error(RetryAction.RECAPTURE, false));
                            return;
                        }
                        break;
                    default:
                        throw C3cG.A0q();
                }
            }
            selfieAgeStepViewModel.otherMethodsFallback(zA1Q);
            return;
        }
        if (!AgeVerificationClientKt.NOT_ELIGIBLE.equals(AgeVerificationClientKt.getProblemType(thA00))) {
            g0u.invoke(thA00);
            return;
        }
        selfieAgeStepViewModel.resolved();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteFiles() {
        this.files = AGH.A0E();
        C60O.A1D().execute(new Runnable() { // from class: com.facebook.aura.ageverification.SelfieAgeStepViewModel.deleteFiles.1
            @Override // java.lang.Runnable
            public final void run() {
                AgeVerificationFiles ageVerificationFiles = AgeVerificationFiles.INSTANCE;
                SelfieAgeStepViewModel selfieAgeStepViewModel = SelfieAgeStepViewModel.this;
                ageVerificationFiles.clear(selfieAgeStepViewModel.context, selfieAgeStepViewModel.userId);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void logSubmitFailure(java.lang.Throwable r6) {
        /*
            r5 = this;
            java.lang.String r1 = com.facebook.aura.ageverification.AgeVerificationClientKt.getProblemType(r6)
            if (r1 == 0) goto Ld
            int r0 = r1.hashCode()
            switch(r0) {
                case -1708376637: goto L8e;
                case -1660963362: goto L81;
                case -1625724613: goto L74;
                case -1342237511: goto L67;
                case -902847857: goto L64;
                case -486635964: goto L61;
                case -267956670: goto L5e;
                case -143375472: goto L5b;
                case 346457221: goto L58;
                case 526802628: goto L4b;
                case 544463206: goto L48;
                case 853012539: goto L45;
                case 1788642672: goto L42;
                case 1898752003: goto L3f;
                default: goto Ld;
            }
        Ld:
            com.facebook.aura.ageverification.intf.AgeCheckResult r3 = com.facebook.aura.ageverification.intf.AgeCheckResult.ERROR
            java.lang.Integer r2 = r5.getHttpResponseCode(r6)
            if (r2 == 0) goto L29
            int r1 = r2.intValue()
            r0 = 429(0x1ad, float:6.01E-43)
            if (r1 != r0) goto L29
            com.facebook.aura.ageverification.intf.AgeCheckFailure r4 = com.facebook.aura.ageverification.intf.AgeCheckFailure.RATE_LIMITED
        L1f:
            com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging r1 = com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging.INSTANCE
            com.facebook.aura.user.provider.AgeCheckMethod r2 = com.facebook.aura.user.provider.AgeCheckMethod.SELFIE
            r5 = 0
            r6 = r5
            r1.attemptResult(r2, r3, r4, r5, r6)
        L28:
            return
        L29:
            boolean r0 = r5.isTransient(r6)
            if (r0 != 0) goto L39
            if (r2 == 0) goto L3c
            int r1 = r2.intValue()
            r0 = 401(0x191, float:5.62E-43)
            if (r1 != r0) goto L3c
        L39:
            com.facebook.aura.ageverification.intf.AgeCheckFailure r4 = com.facebook.aura.ageverification.intf.AgeCheckFailure.UPLOAD_FAILED
            goto L1f
        L3c:
            com.facebook.aura.ageverification.intf.AgeCheckFailure r4 = com.facebook.aura.ageverification.intf.AgeCheckFailure.SYSTEM_ERROR
            goto L1f
        L3f:
            java.lang.String r0 = "invalid_file_handle"
            goto L69
        L42:
            java.lang.String r0 = "upload_medium_not_allowed"
            goto L83
        L45:
            java.lang.String r0 = "upload_failed"
            goto L69
        L48:
            java.lang.String r0 = "evidence_rejected"
            goto L4d
        L4b:
            java.lang.String r0 = "invalid_file"
        L4d:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            com.facebook.aura.ageverification.intf.AgeCheckResult r3 = com.facebook.aura.ageverification.intf.AgeCheckResult.FAILED_RETRYABLE
            com.facebook.aura.ageverification.intf.AgeCheckFailure r4 = com.facebook.aura.ageverification.intf.AgeCheckFailure.USABILITY_ERROR
            goto L1f
        L58:
            java.lang.String r0 = "invalid_attempt"
            goto L69
        L5b:
            java.lang.String r0 = "retries_exhausted"
            goto L83
        L5e:
            java.lang.String r0 = "not_supported"
            goto L83
        L61:
            java.lang.String r0 = "submit_failed"
            goto L69
        L64:
            java.lang.String r0 = "upload_kind_not_allowed"
            goto L83
        L67:
            java.lang.String r0 = "missing_uploads"
        L69:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            com.facebook.aura.ageverification.intf.AgeCheckResult r3 = com.facebook.aura.ageverification.intf.AgeCheckResult.ERROR
            com.facebook.aura.ageverification.intf.AgeCheckFailure r4 = com.facebook.aura.ageverification.intf.AgeCheckFailure.UPLOAD_FAILED
            goto L1f
        L74:
            java.lang.String r0 = "rate_limited"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            com.facebook.aura.ageverification.intf.AgeCheckResult r3 = com.facebook.aura.ageverification.intf.AgeCheckResult.ERROR
            com.facebook.aura.ageverification.intf.AgeCheckFailure r4 = com.facebook.aura.ageverification.intf.AgeCheckFailure.RATE_LIMITED
            goto L1f
        L81:
            java.lang.String r0 = "method_not_allowed"
        L83:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            com.facebook.aura.ageverification.intf.AgeCheckResult r3 = com.facebook.aura.ageverification.intf.AgeCheckResult.FAILED_FINAL
            com.facebook.aura.ageverification.intf.AgeCheckFailure r4 = com.facebook.aura.ageverification.intf.AgeCheckFailure.SYSTEM_ERROR
            goto L1f
        L8e:
            java.lang.String r0 = "not_eligible"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L28
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.SelfieAgeStepViewModel.logSubmitFailure(java.lang.Throwable):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retry(RetryAction retryAction, boolean z) {
        int iOrdinal = retryAction.ordinal();
        if (iOrdinal == 0 || iOrdinal == 3) {
            prepare();
            return;
        }
        if (iOrdinal == 1) {
            submit();
        } else if (iOrdinal == 2) {
            recheck();
        } else {
            if (iOrdinal != 4) {
                throw C3cG.A0q();
            }
            resolve(z);
        }
    }

    @Override // X.AEs
    public void onCleared() {
        C60O.A1D().execute(new Runnable() { // from class: com.facebook.aura.ageverification.SelfieAgeStepViewModel.onCleared.1
            @Override // java.lang.Runnable
            public final void run() {
                AgeVerificationFiles ageVerificationFiles = AgeVerificationFiles.INSTANCE;
                SelfieAgeStepViewModel selfieAgeStepViewModel = SelfieAgeStepViewModel.this;
                ageVerificationFiles.clear(selfieAgeStepViewModel.context, selfieAgeStepViewModel.userId);
            }
        });
    }

    public final void onResume() {
        onShown();
        this.resumed = true;
        SelfieAgeStepState value = this._state.getValue();
        if (C7384Etj.areEqual(value, SelfieAgeStepState.Confirming.INSTANCE)) {
            startPolling();
            return;
        }
        if (value instanceof SelfieAgeStepState.Error) {
            SelfieAgeStepState.Error error = (SelfieAgeStepState.Error) value;
            if (error.retryOnResume) {
                retryOnResume(error.retry);
                return;
            }
            return;
        }
        if (!(value instanceof SelfieAgeStepState.Resolved) || ((SelfieAgeStepState.Resolved) value).afterFinalFailure) {
            return;
        }
        resolve(true);
    }
}
