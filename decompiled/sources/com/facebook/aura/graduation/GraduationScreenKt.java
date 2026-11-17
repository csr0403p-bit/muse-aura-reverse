package com.facebook.aura.graduation;

import X.AHD;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C1515AkP;
import X.C1BO;
import X.C1DG;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.C7bA;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.R;
import com.facebook.aura.graduation.viewmodel.GraduationChapterUiModel;
import com.facebook.aura.graduation.viewmodel.GraduationUiState;
import com.facebook.aura.graduation.viewmodel.GraduationViewModel;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class GraduationScreenKt {

    /* renamed from: com.facebook.aura.graduation.GraduationScreenKt$GraduationLoading$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            GraduationScreenKt.GraduationLoading(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.graduation.GraduationScreenKt$GraduationScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ C1BO<GraduationUiState> $uiState$delegate;
        public final /* synthetic */ GraduationViewModel $viewModel;

        /* renamed from: com.facebook.aura.graduation.GraduationScreenKt$GraduationScreen$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01791 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
            public final /* synthetic */ Function0<Unit> $onBack;
            public final /* synthetic */ C1BO<GraduationUiState> $uiState$delegate;
            public final /* synthetic */ GraduationViewModel $viewModel;

            /* renamed from: invoke-i1RSzL4, reason: not valid java name */
            public final void m971invokei1RSzL4(float f, float f2, BFM bfm, int i) {
                int iA05 = i;
                if ((i & 48) == 0) {
                    iA05 = i | AnonymousClass004.A05(bfm, f2);
                }
                if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 145, VoiceCallForegroundService.AVATAR_TARGET_PX), bfm, iA05)) {
                    bfm.Afo();
                    return;
                }
                GraduationUiState value = this.$uiState$delegate.getValue();
                if (C7384Etj.areEqual(value, GraduationUiState.Loading.INSTANCE)) {
                    bfm.AgE(961025408);
                    GraduationScreenKt.GraduationLoading(null, bfm, 0, 1);
                } else if (C7384Etj.areEqual(value, GraduationUiState.Unavailable.INSTANCE)) {
                    bfm.AgE(961027380);
                    GraduationScreenKt.GraduationUnavailable(this.$onBack, null, bfm, 0, 2);
                } else {
                    if (!(value instanceof GraduationUiState.Loaded)) {
                        bfm.AgE(961023926);
                        AnonymousClass002.A19(bfm);
                        throw C3cG.A0q();
                    }
                    bfm.AgE(961030676);
                    GraduationUiState.Loaded loaded = (GraduationUiState.Loaded) value;
                    String str = loaded.videoUrl;
                    Long l = loaded.loopStartTimeMs;
                    AHD<GraduationChapterUiModel> ahd = loaded.chapters;
                    boolean z = loaded.isSavingVideo;
                    boolean z2 = loaded.isVideoSaved;
                    GraduationViewModel graduationViewModel = this.$viewModel;
                    boolean zA67 = bfm.A67(graduationViewModel);
                    Object objAaT = bfm.AaT();
                    if (zA67 || objAaT == C78N.A00) {
                        objAaT = new GraduationScreenKt$GraduationScreen$1$1$1$1(graduationViewModel);
                        bfm.Ai0(objAaT);
                    }
                    GraduationStoryPlayerKt.m972GraduationStoryPlayer_WMjBM(str, l, ahd, f2, z, z2, (Function0) ((InterfaceC7353EnQ) objAaT), this.$onBack, null, bfm, (iA05 << 6) & 7168, 256);
                }
                AnonymousClass002.A19(bfm);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C01791(Function0<Unit> function0, GraduationViewModel graduationViewModel, C1BO<? extends GraduationUiState> c1bo) {
                super(4);
                this.$onBack = function0;
                this.$viewModel = graduationViewModel;
                this.$uiState$delegate = c1bo;
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
                m971invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(BRg bRg, Function0<Unit> function0, GraduationViewModel graduationViewModel, C1BO<? extends GraduationUiState> c1bo) {
            super(2);
            this.$modifier = bRg;
            this.$onBack = function0;
            this.$viewModel = graduationViewModel;
            this.$uiState$delegate = c1bo;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.PrimaryScreen.INSTANCE, this.$modifier, null, 0L, null, null, null, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new C01791(this.$onBack, this.$viewModel, this.$uiState$delegate), -517435155), bfm, 100663302, 0, 805306422, 533724924);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.graduation.GraduationScreenKt$GraduationScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ GraduationViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, BRg bRg, GraduationViewModel graduationViewModel, int i, int i2) {
            super(2);
            this.$onBack = function0;
            this.$modifier = bRg;
            this.$viewModel = graduationViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            GraduationScreenKt.GraduationScreen(this.$onBack, this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.graduation.GraduationScreenKt$GraduationStatusBarEffect$2, reason: invalid class name and case insensitive filesystem */
    public final class C121752 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121752(int i) {
            super(2);
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            GraduationScreenKt.GraduationStatusBarEffect(bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.graduation.GraduationScreenKt$GraduationUnavailable$1, reason: invalid class name and case insensitive filesystem */
    public final class C121761 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClose;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121761(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onClose = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            GraduationScreenKt.GraduationUnavailable(this.$onClose, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void GraduationScreen(kotlin.jvm.functions.Function0<kotlin.Unit> r8, X.BRg r9, com.facebook.aura.graduation.viewmodel.GraduationViewModel r10, X.BFM r11, int r12, int r13) {
        /*
            r4 = 0
            X.C7384Etj.A0Y(r8, r4)
            r0 = -122219163(0xfffffffff8b71565, float:-2.9707008E34)
            r5 = r11
            r11.AgG(r0)
            r11 = r12
            r0 = r12 & 6
            if (r0 != 0) goto La9
            int r3 = X.AnonymousClass004.A0T(r5, r8)
            r3 = r3 | r12
        L15:
            r12 = r13
            r2 = r13 & 2
            if (r2 == 0) goto L9e
            r3 = r3 | 48
        L1c:
            r0 = r11 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L2f
            r0 = r13 & 4
            if (r0 != 0) goto L2c
            boolean r1 = r5.A67(r10)
            r0 = 256(0x100, float:3.59E-43)
            if (r1 != 0) goto L2e
        L2c:
            r0 = 128(0x80, float:1.794E-43)
        L2e:
            r3 = r3 | r0
        L2f:
            boolean r0 = X.AnonymousClass004.A1J(r3)
            boolean r0 = X.AnonymousClass001.A1b(r0, r5, r3)
            if (r0 == 0) goto L9a
            r5.Afy()
            r0 = r11 & 1
            if (r0 == 0) goto L78
            boolean r0 = r5.AEk()
            if (r0 != 0) goto L78
            r5.Afo()
        L49:
            r5.AAb()
            X.1BN<com.facebook.aura.graduation.viewmodel.GraduationUiState> r0 = r10.uiState
            r3 = 0
            X.1BO r0 = X.C2CK.A02(r5, r0)
            GraduationStatusBarEffect(r5, r4)
            com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode r2 = com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode.LIGHT
            com.facebook.aura.graduation.GraduationScreenKt$GraduationScreen$1 r1 = new com.facebook.aura.graduation.GraduationScreenKt$GraduationScreen$1
            r1.<init>(r9, r8, r10, r0)
            r0 = -554705710(0xffffffffdeefdcd2, float:-8.6419602E18)
            X.B1U r4 = X.B1V.A00(r5, r1, r0)
            r6 = 390(0x186, float:5.47E-43)
            r7 = 2
            com.facebook.aura.vds.compose.theme.AuraModeOverriderKt.AuraModeOverrider(r2, r3, r4, r5, r6, r7)
        L6a:
            X.BBb r0 = r5.AAc()
            if (r0 == 0) goto L77
            com.facebook.aura.graduation.GraduationScreenKt$GraduationScreen$2 r7 = new com.facebook.aura.graduation.GraduationScreenKt$GraduationScreen$2
            r7.<init>(r8, r9, r10, r11, r12)
            r0.A06 = r7
        L77:
            return
        L78:
            if (r2 == 0) goto L7c
            X.BS0 r9 = X.BRg.A00
        L7c:
            r0 = r13 & 4
            if (r0 == 0) goto L49
            X.CGz r0 = X.AnonymousClass002.A0h(r5)
            com.facebook.aura.graduation.viewmodel.GraduationViewModel$Factory r3 = new com.facebook.aura.graduation.viewmodel.GraduationViewModel$Factory
            r3.<init>(r0)
            androidx.activity.ComponentActivity r2 = X.AnonymousClass004.A0y(r5)
            X.A6J r1 = X.AnonymousClass003.A0Z(r2)
            java.lang.Class<com.facebook.aura.graduation.viewmodel.GraduationViewModel> r0 = com.facebook.aura.graduation.viewmodel.GraduationViewModel.class
            X.AEs r10 = X.AnonymousClass004.A14(r3, r2, r1, r0)
            com.facebook.aura.graduation.viewmodel.GraduationViewModel r10 = (com.facebook.aura.graduation.viewmodel.GraduationViewModel) r10
            goto L49
        L9a:
            r5.Afo()
            goto L6a
        L9e:
            r0 = r11 & 48
            if (r0 != 0) goto L1c
            int r0 = X.AnonymousClass004.A0e(r5, r9)
            r3 = r3 | r0
            goto L1c
        La9:
            r3 = r12
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.graduation.GraduationScreenKt.GraduationScreen(kotlin.jvm.functions.Function0, X.BRg, com.facebook.aura.graduation.viewmodel.GraduationViewModel, X.BFM, int, int):void");
    }

    public static final void GraduationUnavailable(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(935262715);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int i4 = iA0T << 9;
            GraduationStoryPlayerKt.GraduationTopBar(0, 0, 0.0f, function0, bRg2, false, false, null, bfm, AnonymousClass001.A0B(i4, (i4 & 7168) | 438), 224);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C121761(function0, bRg2, i, i2);
        }
    }

    public static final void GraduationLoading(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-691213733);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120232);
            BRg bRgA0T = AnonymousClass001.A0T(bRg);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new GraduationScreenKt$GraduationLoading$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0T, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            AnonymousClass007.A0s(bfm, bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(bRg, i, i2);
        }
    }

    public static final void GraduationStatusBarEffect(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1Q(bfm, 282443432, i), bfm, i)) {
            View view = (View) bfm.A6v(AndroidCompositionLocals_androidKt.A05);
            boolean zA67 = bfm.A67(view);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new GraduationScreenKt$GraduationStatusBarEffect$1$1(view);
                bfm.Ai0(objAaT);
            }
            C7bA.A05(bfm, null, view, (G0U) objAaT, 0, 2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C121752(i);
        }
    }

    public static final /* synthetic */ GraduationUiState access$GraduationScreen$lambda$0(C1BO c1bo) {
        return (GraduationUiState) c1bo.getValue();
    }
}
