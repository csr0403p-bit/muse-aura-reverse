package com.facebook.aura.status.view;

import X.AKQ;
import X.AWx;
import X.AaM;
import X.AbstractC04540eo;
import X.AbstractC07539Wl;
import X.AbstractC1996Aw5;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AnonymousClass604;
import X.AnonymousClass605;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BRr;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C0dx;
import X.C0v5;
import X.C10G;
import X.C11U;
import X.C1299Agk;
import X.C1515AkP;
import X.C1BN;
import X.C1BO;
import X.C1D8;
import X.C1DE;
import X.C1DG;
import X.C1YD;
import X.C1b8;
import X.C2CK;
import X.C2K7;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C3cI;
import X.C78N;
import X.EnumC10460Hji;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.InterfaceC1072AWd;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.aura.R;
import com.facebook.aura.avatarsize.HatchAvatarSize;
import com.facebook.aura.avatarsize.HatchAvatarSizeKt;
import com.facebook.aura.header.api.AvatarTakeover;
import com.facebook.aura.header.api.AvatarTakeoverKt;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import com.facebook.aura.header.view.HatchStatusPillMetricsKt;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.status.viewmodel.HatchPillState;
import com.facebook.aura.status.viewmodel.HatchStatusPillUiState;
import com.facebook.aura.ui.adaptive.AuraLayoutSizeKt;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchStatusPillKt {
    public static final int AVATAR_SIZE_MORPH_DURATION_MS = 350;
    public static final int CIRCLE_CORNER_PERCENT = 50;
    public static final float PillVerticalPadding = 8.0f;
    public static final float STATUS_PILL_SHADOW_ELEVATION = 8.0f;

    /* renamed from: com.facebook.aura.status.view.HatchStatusPillKt$PreloadStatusLineFont$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchStatusPillKt.PreloadStatusLineFont(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.HatchStatusPillKt$StatusPillAvatarInteractionTarget$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $consumeDragGestures;
        public final /* synthetic */ String $contentDescription;
        public final /* synthetic */ boolean $isTakeoverAvatar;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Function0<Unit> $onOpenStatus;
        public final /* synthetic */ BRg $takeoverGestures;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(boolean z, boolean z2, String str, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BRg bRg2, int i, int i2) {
            super(2);
            this.$isTakeoverAvatar = z;
            this.$consumeDragGestures = z2;
            this.$contentDescription = str;
            this.$onClick = function0;
            this.$onOpenStatus = function02;
            this.$modifier = bRg;
            this.$takeoverGestures = bRg2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchStatusPillKt.StatusPillAvatarInteractionTarget(this.$isTakeoverAvatar, this.$consumeDragGestures, this.$contentDescription, this.$onClick, this.$onOpenStatus, this.$modifier, this.$takeoverGestures, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.status.view.HatchStatusPillKt$StatusPillAvatarOverlay$2, reason: invalid class name and case insensitive filesystem */
    public final class C140782 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ float $panelProgress;
        public final /* synthetic */ AvatarTakeover $takeover;
        public final /* synthetic */ C1BO<Boolean> $transitionComplete;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140782(AvatarTakeover avatarTakeover, C1BO<Boolean> c1bo, float f, BRg bRg, int i, int i2) {
            super(2);
            this.$takeover = avatarTakeover;
            this.$transitionComplete = c1bo;
            this.$panelProgress = f;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchStatusPillKt.StatusPillAvatarOverlay(this.$takeover, this.$transitionComplete, this.$panelProgress, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.status.view.HatchStatusPillKt$StatusPillSurface$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Function0<Unit> $onLongClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$onClick = function0;
            this.$onLongClick = function02;
            this.$modifier = bRg;
            this.$content = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchStatusPillKt.StatusPillSurface(this.$onClick, this.$onLongClick, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void StatusPillAvatarOverlay(AvatarTakeover avatarTakeover, C1BO<Boolean> c1bo, float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-762820532);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, avatarTakeover) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, c1bo);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A06(bfm, f);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean zA0F = C1BO.A0F(c1bo);
            bfm.AgE(1368884551);
            BRg bRgPortraitViewport = avatarTakeover.portraitViewport(bRg2, f, bfm, ((iA0d >> 9) & 14) | ((iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX));
            AnonymousClass002.A19(bfm);
            avatarTakeover.Overlay(zA0F, bRgPortraitViewport, bfm, (iA0d << 6) & 896);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140782(avatarTakeover, c1bo, f, bRg2, i, i2);
        }
    }

    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchPillState.values().length];
            try {
                AnonymousClass002.A13(HatchPillState.DISCONNECTED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchPillState.CONNECTION_ERROR, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchPillState.NEEDS_APPROVAL, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05be A[PHI: r34
  0x05be: PHI (r34v2 boolean) = (r34v1 boolean), (r34v4 boolean) binds: [B:167:0x02cc, B:173:0x02e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0635 A[PHI: r15
  0x0635: PHI (r15v3 boolean) = (r15v1 boolean), (r15v4 boolean) binds: [B:104:0x01a8, B:102:0x01a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ff  */
    /* renamed from: HatchStatusPill-rBjAxNU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2233HatchStatusPillrBjAxNU(X.InterfaceC05151eP r104, X.BRg r105, kotlin.jvm.functions.Function0<kotlin.Unit> r106, boolean r107, com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode r108, boolean r109, boolean r110, java.lang.String r111, boolean r112, java.lang.String r113, boolean r114, boolean r115, boolean r116, X.C1DG r117, boolean r118, X.C1DG r119, X.BFM r120, int r121, int r122, int r123) {
        /*
            Method dump skipped, instructions count: 1834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.HatchStatusPillKt.m2233HatchStatusPillrBjAxNU(X.1eP, X.BRg, kotlin.jvm.functions.Function0, boolean, com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode, boolean, boolean, java.lang.String, boolean, java.lang.String, boolean, boolean, boolean, X.1DG, boolean, X.1DG, X.BFM, int, int, int):void");
    }

    public static final void StatusPillAvatarInteractionTarget(boolean z, boolean z2, String str, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BRg bRg2, BFM bfm, int i, int i2) {
        BBI bbiA0M;
        boolean zA0A;
        String strA0f;
        String strA0s;
        BRg bRgThen;
        BRg bRg3 = bRg;
        BRg bRg4 = bRg2;
        bfm.AgG(1329295700);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0o(bfm, z2);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0X(bfm, function02);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0n |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg3);
            iA0n |= iA0i;
        }
        int i4 = i2 & 64;
        int iA0j = 1572864;
        if (i4 != 0) {
            iA0n |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg4);
            iA0n |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(599187 & iA0n, 599186), bfm, iA0n)) {
            if (i3 != 0) {
                bRg3 = BRg.A00;
            }
            if (i4 != 0) {
                bRg4 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            if (z) {
                bfm.AgE(1847893410);
                zA0A = MutableState.A0A(AnonymousClass002.A0a(bfm).avatarExpanded$delegate);
                bbiA0M = (BBI) bfm;
                BBI.A0R(bbiA0M, false);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, 1450122099);
                zA0A = false;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = HatchIdentityProvider.Companion.getInstance(abstractC3358CGzA0h).aiIdentityName;
                bfm.Ai0(objAaT);
            }
            C1BO c1boA02 = C2CK.A02(bfm, (C1BN) objAaT);
            if (str == null) {
                bfm.AgE(1847902314);
                strA0f = AnonymousClass003.A0f(bfm, bbiA0M, c1boA02.getValue(), R.string._name_removed__res_0x7f12101b);
                bfm.AgE(1847907055);
                int i5 = R.string._name_removed__res_0x7f12101a;
                if (zA0A) {
                    i5 = R.string._name_removed__res_0x7f121019;
                }
                strA0s = AnonymousClass001.A0s(bfm, bbiA0M, i5);
            } else {
                bfm.AgE(1847901322);
                BBI.A0R(bbiA0M, false);
                strA0f = str;
                bfm.AgE(1847906063);
                BBI.A0R(bbiA0M, false);
                strA0s = strA0f;
            }
            bfm.AgE(1847924892);
            if (z) {
                BS0 bs0 = BRg.A00;
                bRgThen = bRg3.then(AbstractC07539Wl.A00(C10G.A0F(bs0, 48.0f, 48.0f, Float.NaN, Float.NaN), zA0A ? "status-call-avatar-collapse" : "status-call-avatar-expand"));
                if (z2) {
                    Unit unit = Unit.INSTANCE;
                    Object objAaT2 = bfm.AaT();
                    if (objAaT2 == C78N.A00) {
                        objAaT2 = new PointerInputEventHandler() { // from class: com.facebook.aura.status.view.HatchStatusPillKt$StatusPillAvatarInteractionTarget$2$1$1

                            /* renamed from: com.facebook.aura.status.view.HatchStatusPillKt$StatusPillAvatarInteractionTarget$2$1$1$1, reason: invalid class name */
                            public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<C1299Agk, AWx, Unit> {
                                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                                public AnonymousClass1() {
                                    super(2);
                                }

                                @Override // X.G0V
                                public /* bridge */ /* synthetic */ Unit invoke(C1299Agk c1299Agk, AWx aWx) {
                                    C3cI.A1B(c1299Agk);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                                public final void m2240invokeUv8p0NA(C1299Agk c1299Agk, long j) {
                                    C3cI.A1B(c1299Agk);
                                }
                            }

                            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                            public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                                Object objA0C = DragGestureDetectorKt.A0C(bRr, htJ, new AnonymousClass605(0), new AnonymousClass605(1), new AnonymousClass604(0), AnonymousClass1.INSTANCE);
                                return objA0C != EnumC10460Hji.A02 ? Unit.INSTANCE : objA0C;
                            }
                        };
                        bfm.Ai0(objAaT2);
                    }
                    bRgThen = bRgThen.then(AaM.A00(bs0, (PointerInputEventHandler) objAaT2, unit));
                }
            } else {
                bRgThen = bRg3;
            }
            BBI.A0R(bbiA0M, false);
            BRg bRgThen2 = bRgThen.then(bRg4);
            boolean zA1P = AnonymousClass003.A1P(bfm, strA0s, strA0f, AnonymousClass004.A1F(iA0n));
            Object objAaT3 = bfm.AaT();
            if (zA1P || objAaT3 == C78N.A00) {
                objAaT3 = new HatchStatusPillKt$StatusPillAvatarInteractionTarget$3$1(z, strA0s, strA0f);
                bfm.Ai0(objAaT3);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgThen2, objAaT3, false);
            Object objAaT4 = bfm.AaT();
            Object obj = C78N.A00;
            InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) AnonymousClass004.A16(bfm, objAaT4, obj);
            String str2 = HatchUtil.INSTANCE.isViewerEmployee() ? null : strA0f;
            C1YD c1yd = new C1YD(0);
            boolean zA67 = bfm.A67(auraNavigatorA0b) | AnonymousClass005.A1M(iA0n);
            Object objAaT5 = bfm.AaT();
            if (zA67 || objAaT5 == obj) {
                objAaT5 = new HatchStatusPillKt$StatusPillAvatarInteractionTarget$6$1(auraNavigatorA0b, function02);
                bfm.Ai0(objAaT5);
            }
            C3Ue.A04(C0v5.A00(null, interfaceC1072AWd, bRgA0Y, c1yd, null, str2, (Function0) objAaT5, function0, true), bfm, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass7(z, z2, str, function0, function02, bRg3, bRg4, i, i2);
        }
    }

    /* renamed from: StatusPillContent-ikN4xI4, reason: not valid java name */
    public static final void m2234StatusPillContentikN4xI4(HatchStatusPillUiState hatchStatusPillUiState, Function0<Unit> function0, Function0<C1DG> function02, float f, float f2, boolean z, boolean z2, Function0<Float> function03, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgFullScreenStatus;
        BRg bRg2 = bRg;
        bfm.AgG(578650543);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, hatchStatusPillUiState) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function02);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A07(bfm, f);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A08(bfm, f2);
        }
        if ((196608 & i) == 0) {
            iA0T |= AnonymousClass004.A0s(bfm, z);
        }
        if ((1572864 & i) == 0) {
            iA0T |= AnonymousClass004.A0t(bfm, z2);
        }
        if ((12582912 & i) == 0) {
            iA0T |= AnonymousClass004.A0a(bfm, function03);
        }
        int i3 = i2 & 256;
        int iA0l = 100663296;
        if (i3 != 0) {
            iA0T |= iA0l;
        } else if ((100663296 & i) == 0) {
            iA0l = AnonymousClass004.A0l(bfm, bRg2);
            iA0T |= iA0l;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1G(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            AuraTypography auraTypographyA0f = AnonymousClass002.A0f(bfm);
            HatchStatusPillMetrics hatchStatusPillMetricsA0a = AnonymousClass002.A0a(bfm);
            AvatarTakeover avatarTakeover = (AvatarTakeover) bfm.A6v(AvatarTakeoverKt.LocalAvatarTakeover);
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zA1R = AnonymousClass001.A1R(bfm, hatchStatusPillMetricsA0a, AnonymousClass005.A1C(iA0T));
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new HatchStatusPillKt$StatusPillContent$1$1(z2, hatchStatusPillMetricsA0a);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A19(bfm, objAaT, hatchStatusPillMetricsA0a, boolValueOf);
            float fRememberAvatarSizeDp = HatchAvatarSizeKt.rememberAvatarSizeDp(HatchAvatarSize.SMALL, bfm, 6) - (PillVerticalPadding * 2.0f);
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A0C, false);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function04);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, i4);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            bfm.AgE(-1753239802);
            BS0 bs0 = BRg.A00;
            BRg bRgM1016hatchStatusPillEnvelopelG28NQ4 = HatchStatusPillMetricsKt.m1016hatchStatusPillEnvelopelG28NQ4(bs0, f, function03);
            if (avatarTakeover != null) {
                bfm.AgE(1483887966);
                bRgFullScreenStatus = avatarTakeover.fullScreenStatus(bs0, function02, bfm, ((iA0T >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1484044547);
                BBI.A0R(bbi, false);
                bRgFullScreenStatus = bs0;
            }
            BRg bRgThen = bRgM1016hatchStatusPillEnvelopelG28NQ4.then(bRgFullScreenStatus);
            if (z2) {
                boolean zA1K = AnonymousClass003.A1K(bfm, avatarTakeover, hatchStatusPillMetricsA0a);
                Object objAaT2 = bfm.AaT();
                if (zA1K || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchStatusPillKt$StatusPillContent$2$2$1$1(avatarTakeover, hatchStatusPillMetricsA0a);
                    bfm.Ai0(objAaT2);
                }
                bRgThen = bRgThen.then(HatchStatusPillMetricsKt.onBoundsInWindowChanged(bs0, (G0U) objAaT2));
            }
            BBI.A0R(bbi, false);
            boolean zA67 = bfm.A67(auraNavigatorA0b) | AnonymousClass003.A1C(iA0T);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchStatusPillKt$StatusPillContent$2$3$1(auraNavigatorA0b, function0);
                bfm.Ai0(objAaT3);
            }
            StatusPillSurface(function0, (Function0) objAaT3, bRgThen, B1V.A00(bfm, new HatchStatusPillKt$StatusPillContent$2$4(hatchStatusPillUiState, auraTypographyA0f, auraColorsA0c, z, fRememberAvatarSizeDp), 1744232213), bfm, ((iA0T >> 3) & 14) | 3072, 0);
            if (z) {
                bfm.AgE(1487496180);
                C01N.A0A(bfm, bs0, f + f2);
            } else {
                bfm.AgE(1487562489);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchStatusPillKt$StatusPillContent$3(hatchStatusPillUiState, function0, function02, f, f2, z, z2, function03, bRg2, i, i2);
        }
    }

    public static final void StatusPillSurface(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1763089354);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            C0dx c0dxA0T = AnonymousClass002.A0T(bfm);
            float f = AnonymousClass002.A0d(bfm).bubbleCornerRadius;
            boolean zA62 = bfm.A62(f);
            Object objAaT = bfm.AaT();
            if (zA62 || objAaT == C78N.A00) {
                objAaT = C1D8.A00(f);
                bfm.Ai0(objAaT);
            }
            C1DE c1de = (C1DE) objAaT;
            BRg bRgA0D = C10G.A0D(AbstractC07539Wl.A00(bRg2, "hatch-status-pill"), Float.NaN, C1DG.A04(new C1DG((AuraLayoutSizeKt.auraLayoutWidth(bfm, 0) - (56.0f * 2.0f)) - AuraDimensKt.SpacingMedium), 0.0f).A00);
            float f2 = STATUS_PILL_SHADOW_ELEVATION;
            long j = auraColorsA0c.shadow;
            BRg bRgA03 = C1b8.A03(C11U.A03(AbstractC04540eo.A00(bRgA0D, c1de, f2, 4, j, j), c1de), c1de, auraColorsA0c.elevated);
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) AnonymousClass004.A16(bfm, objAaT2, obj);
            C1YD c1yd = new C1YD(0);
            boolean zA67 = bfm.A67(c0dxA0T) | AnonymousClass003.A1B(iA0T);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = new HatchStatusPillKt$StatusPillSurface$2$1(c0dxA0T, function0);
                bfm.Ai0(objAaT3);
            }
            BRg bRgA0B = C3U4.A0B(C0v5.A00(null, interfaceC1072AWd, bRgA03, c1yd, null, null, function02, (Function0) objAaT3, true), 12.0f, PillVerticalPadding);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            AnonymousClass004.A1C(bbi, bfm, g0v, iA0T >> 9, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(function0, function02, bRg2, g0v, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1BO<java.lang.Boolean> rememberStatusPillAvatarTransitionComplete(X.AT5<java.lang.Float, X.AOW> r6, float r7, boolean r8, X.C1BO<java.lang.Float> r9, X.C1BO<java.lang.Boolean> r10, X.BFM r11, int r12) {
        /*
            r0 = r12 & 14
            r0 = r0 ^ 6
            r1 = 4
            r4 = 0
            if (r0 <= r1) goto Le
            boolean r0 = r11.A65(r6)
            if (r0 != 0) goto L13
        Le:
            r0 = r12 & 6
            r3 = 0
            if (r0 != r1) goto L14
        L13:
            r3 = 1
        L14:
            r0 = r12 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r2 = 32
            if (r0 <= r2) goto L22
            boolean r0 = r11.A62(r7)
            if (r0 != 0) goto L27
        L22:
            r1 = r12 & 48
            r0 = 0
            if (r1 != r2) goto L28
        L27:
            r0 = 1
        L28:
            r3 = r3 | r0
            r0 = r12 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r2 = 256(0x100, float:3.59E-43)
            if (r0 <= r2) goto L37
            boolean r0 = r11.A66(r8)
            if (r0 != 0) goto L3c
        L37:
            r1 = r12 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r2) goto L3d
        L3c:
            r0 = 1
        L3d:
            r3 = r3 | r0
            r0 = r12 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 ^ 3072(0xc00, float:4.305E-42)
            r2 = 2048(0x800, float:2.87E-42)
            if (r0 <= r2) goto L4c
            boolean r0 = r11.A65(r9)
            if (r0 != 0) goto L51
        L4c:
            r1 = r12 & 3072(0xc00, float:4.305E-42)
            r0 = 0
            if (r1 != r2) goto L52
        L51:
            r0 = 1
        L52:
            r3 = r3 | r0
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r12
            r0 = r0 ^ 24576(0x6000, float:3.4438E-41)
            r1 = 16384(0x4000, float:2.2959E-41)
            r5 = r10
            if (r0 <= r1) goto L64
            boolean r0 = r11.A65(r10)
            if (r0 != 0) goto L68
        L64:
            r0 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r0 != r1) goto L69
        L68:
            r4 = 1
        L69:
            r3 = r3 | r4
            java.lang.Object r1 = r11.AaT()
            if (r3 != 0) goto L74
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L7d
        L74:
            com.facebook.aura.status.view.HatchStatusPillKt$rememberStatusPillAvatarTransitionComplete$1$1 r4 = new com.facebook.aura.status.view.HatchStatusPillKt$rememberStatusPillAvatarTransitionComplete$1$1
            r4.<init>(r5, r6, r7, r8, r9)
            X.BBP r1 = X.AnonymousClass003.A0R(r11, r4)
        L7d:
            X.1BO r1 = (X.C1BO) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.HatchStatusPillKt.rememberStatusPillAvatarTransitionComplete(X.AT5, float, boolean, X.1BO, X.1BO, X.BFM, int):X.1BO");
    }

    public static final String statusPillViewModelKey(String str) {
        if (str != null) {
            return FGI.A0M("HatchStatusPillViewModel:", str);
        }
        return null;
    }

    public static final void PreloadStatusLineFont(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1Q(bfm, 1727562980, i), bfm, i)) {
            AbstractC1996Aw5 abstractC1996Aw5 = C06G.A0Y(bfm).A02.A06;
            C2K7 c2k7 = (C2K7) bfm.A6v(Am0.A06);
            boolean zA1J = AnonymousClass003.A1J(bfm, abstractC1996Aw5, c2k7);
            Object objAaT = bfm.AaT();
            if (zA1J || objAaT == C78N.A00) {
                objAaT = new HatchStatusPillKt$PreloadStatusLineFont$1$1(abstractC1996Aw5, c2k7, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A1A(bfm, objAaT, abstractC1996Aw5, c2k7);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(i);
        }
    }

    public static final /* synthetic */ HatchStatusPillUiState access$HatchStatusPill_rBjAxNU$lambda$0(C1BO c1bo) {
        return (HatchStatusPillUiState) c1bo.getValue();
    }

    public static final long getSubtitleColor(HatchPillState hatchPillState, AuraColors auraColors) {
        int iOrdinal = hatchPillState.ordinal();
        return (iOrdinal == 0 || iOrdinal == 3) ? auraColors.errorText : iOrdinal != 12 ? auraColors.secondaryText : auraColors.link;
    }
}
