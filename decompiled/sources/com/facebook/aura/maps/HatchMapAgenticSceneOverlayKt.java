package com.facebook.aura.maps;

import X.AKQ;
import X.AVy;
import X.AbstractC1754Apr;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AnonymousClass962;
import X.AnonymousClass963;
import X.AnonymousClass965;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C0v5;
import X.C0z7;
import X.C10G;
import X.C1515AkP;
import X.C1DG;
import X.C1qN;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C3cG;
import X.C7354EnR;
import X.C7384Etj;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.C8ni;
import X.C8sK;
import X.C96C;
import X.C9Tm;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC05151eP;
import X.InterfaceC1072AWd;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.maps.data.HatchMapPlaces;
import com.facebook.aura.maps.data.HatchMapPlacesKt;
import com.facebook.aura.maps.theme.HatchMapCardStyleKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchMapAgenticSceneOverlayKt {
    public static final float FULLSCREEN_CAROUSEL_BOTTOM_PADDING = 12.0f;

    /* renamed from: com.facebook.aura.maps.HatchMapAgenticSceneOverlayKt$HatchMapAgenticSceneOverlay$10, reason: invalid class name */
    public final class AnonymousClass10 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<C1DG, Unit> $onCarouselSectionHeightChanged;
        public final /* synthetic */ HatchMapAgenticScenePresentation $presentation;
        public final /* synthetic */ InterfaceC05151eP $this_HatchMapAgenticSceneOverlay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass10(InterfaceC05151eP interfaceC05151eP, HatchMapAgenticScenePresentation hatchMapAgenticScenePresentation, G0U<? super C1DG, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$this_HatchMapAgenticSceneOverlay = interfaceC05151eP;
            this.$presentation = hatchMapAgenticScenePresentation;
            this.$onCarouselSectionHeightChanged = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMapAgenticSceneOverlayKt.HatchMapAgenticSceneOverlay(this.$this_HatchMapAgenticSceneOverlay, this.$presentation, this.$onCarouselSectionHeightChanged, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchMapAgenticSceneOverlayKt$HatchMapAgenticSceneOverlay$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<C1DG, Unit> $onCarouselSectionHeightChanged;
        public final /* synthetic */ HatchMapAgenticScenePresentation $presentation;
        public final /* synthetic */ InterfaceC05151eP $this_HatchMapAgenticSceneOverlay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(InterfaceC05151eP interfaceC05151eP, HatchMapAgenticScenePresentation hatchMapAgenticScenePresentation, G0U<? super C1DG, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$this_HatchMapAgenticSceneOverlay = interfaceC05151eP;
            this.$presentation = hatchMapAgenticScenePresentation;
            this.$onCarouselSectionHeightChanged = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMapAgenticSceneOverlayKt.HatchMapAgenticSceneOverlay(this.$this_HatchMapAgenticSceneOverlay, this.$presentation, this.$onCarouselSectionHeightChanged, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchMapAgenticSceneOverlayKt$HatchMapAgenticSceneOverlay$9, reason: invalid class name */
    public final class AnonymousClass9 extends AbstractC7559F3s implements G2j<C8ni, C9Tm, BFM, Integer, Unit> {
        public final /* synthetic */ AnonymousClass965 $iconProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(AnonymousClass965 anonymousClass965) {
            super(4);
            this.$iconProvider = anonymousClass965;
        }

        public final void invoke(C8ni c8ni, C9Tm c9Tm, BFM bfm, int i) {
            AnonymousClass003.A0u(c8ni, c9Tm);
            int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c8ni) | i : i;
            if ((i & 48) == 0) {
                iA0d |= AnonymousClass004.A0e(bfm, c9Tm);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                AnonymousClass963.A01(bfm, null, this.$iconProvider, c8ni, c9Tm, iA0d & 126, 2);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C8ni c8ni, C9Tm c9Tm, BFM bfm, Integer num) {
            invoke(c8ni, c9Tm, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchMapAgenticSceneOverlayKt$HatchMapExpandButton$4, reason: invalid class name and case insensitive filesystem */
    public final class C126724 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onExpand;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126724(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onExpand = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMapAgenticSceneOverlayKt.HatchMapExpandButton(this.$onExpand, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchMapAgenticSceneOverlayKt$HatchMapExpandOverlay$5, reason: invalid class name and case insensitive filesystem */
    public final class C126735 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onExpand;
        public final /* synthetic */ String $selectedArtifactId;
        public final /* synthetic */ InterfaceC05151eP $this_HatchMapExpandOverlay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C126735(InterfaceC05151eP interfaceC05151eP, String str, G0U<? super String, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$this_HatchMapExpandOverlay = interfaceC05151eP;
            this.$selectedArtifactId = str;
            this.$onExpand = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMapAgenticSceneOverlayKt.HatchMapExpandOverlay(this.$this_HatchMapExpandOverlay, this.$selectedArtifactId, this.$onExpand, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchMapAgenticSceneOverlayKt$HatchMapFlowOverlay$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<C1DG, Unit> $onCarouselSectionHeightChanged;
        public final /* synthetic */ HatchMapFlowPresentation $presentation;
        public final /* synthetic */ InterfaceC05151eP $this_HatchMapFlowOverlay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(InterfaceC05151eP interfaceC05151eP, HatchMapFlowPresentation hatchMapFlowPresentation, G0U<? super C1DG, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$this_HatchMapFlowOverlay = interfaceC05151eP;
            this.$presentation = hatchMapFlowPresentation;
            this.$onCarouselSectionHeightChanged = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMapAgenticSceneOverlayKt.HatchMapFlowOverlay(this.$this_HatchMapFlowOverlay, this.$presentation, this.$onCarouselSectionHeightChanged, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchMapFlowOverlay(InterfaceC05151eP interfaceC05151eP, HatchMapFlowPresentation hatchMapFlowPresentation, G0U<? super C1DG, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A10(interfaceC05151eP, hatchMapFlowPresentation, g0u);
        bfm.AgG(-180936331);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, interfaceC05151eP) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(hatchMapFlowPresentation, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (hatchMapFlowPresentation instanceof HatchMapAgenticScenePresentation) {
                bfm.AgE(-2081114424);
                HatchMapAgenticSceneOverlay(interfaceC05151eP, (HatchMapAgenticScenePresentation) hatchMapFlowPresentation, g0u, bRg2, bfm, AnonymousClass003.A06(iA0d, (iA0d & 14) | (HatchMapAgenticScenePresentation.$stable << 3)), 0);
            } else {
                bfm.AgE(-2081111431);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(interfaceC05151eP, hatchMapFlowPresentation, g0u, bRg2, i, i2);
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchMapAgenticSceneOverlayKt$HatchMapAgenticSceneOverlay$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0W<C9Tm, BFM, Integer, String> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(3);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ String invoke(C9Tm c9Tm, BFM bfm, Integer num) {
            AnonymousClass004.A1A(AnonymousClass005.A0P(bfm, num), 1831809357);
            return "";
        }

        public final String invoke(C9Tm c9Tm, BFM bfm, int i) {
            AnonymousClass004.A1A(bfm, 1831809357);
            return "";
        }
    }

    public static final void HatchMapAgenticSceneOverlay(InterfaceC05151eP interfaceC05151eP, HatchMapAgenticScenePresentation hatchMapAgenticScenePresentation, G0U<? super C1DG, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass10;
        boolean z;
        C8sK c8sKRememberHatchMapCardStyle;
        BRg bRg2 = bRg;
        bfm.AgG(-1976410697);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, interfaceC05151eP) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(hatchMapAgenticScenePresentation, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean zA65 = bfm.A65(hatchMapAgenticScenePresentation.scene);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = HatchMapPlacesKt.toHatchMapPlaces(hatchMapAgenticScenePresentation.scene);
                bfm.Ai0(objAaT);
            }
            HatchMapPlaces hatchMapPlaces = (HatchMapPlaces) objAaT;
            List<C9Tm> listRememberHatchMapPlaces = HatchMapPresentationKt.rememberHatchMapPlaces(hatchMapAgenticScenePresentation.cache, hatchMapPlaces, bfm, 0);
            AnonymousClass965 anonymousClass965RememberHatchMapCardIconProvider = HatchMapPresentationKt.rememberHatchMapCardIconProvider(hatchMapAgenticScenePresentation.cache, hatchMapPlaces, listRememberHatchMapPlaces, bfm, 0);
            String str = hatchMapAgenticScenePresentation.selectedArtifactId;
            G0U<String, Unit> g0u2 = hatchMapAgenticScenePresentation.onExpand;
            if (hatchMapAgenticScenePresentation.displayMode != HatchMapDisplayMode.INLINE || g0u2 == null) {
                bfm.AgE(456311691);
            } else {
                bfm.AgE(456200215);
                HatchMapExpandOverlay(interfaceC05151eP, str, g0u2, null, bfm, iA0d & 14, 4);
            }
            BBI bbiA07 = C3cG.A07(bfm);
            if (str != null && (!(listRememberHatchMapPlaces instanceof Collection) || !listRememberHatchMapPlaces.isEmpty())) {
                Iterator<C9Tm> it = listRememberHatchMapPlaces.iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().A09)) {
                        bfm.AgE(456465451);
                        BBI.A0R(bbiA07, false);
                        if (hatchMapAgenticScenePresentation.displayMode == HatchMapDisplayMode.FULLSCREEN) {
                            z = true;
                            bfm.AgE(456594411);
                            c8sKRememberHatchMapCardStyle = HatchMapCardStyleKt.rememberHatchFullscreenMapCardStyle(bfm, 0);
                        } else {
                            z = false;
                            bfm.AgE(456663541);
                            c8sKRememberHatchMapCardStyle = HatchMapCardStyleKt.rememberHatchMapCardStyle(bfm, 0);
                        }
                        AnonymousClass962 anonymousClass962 = c8sKRememberHatchMapCardStyle.A00;
                        BBI.A0R(bbiA07, false);
                        AnonymousClass4 anonymousClass4 = new C7354EnR() { // from class: com.facebook.aura.maps.HatchMapAgenticSceneOverlayKt.HatchMapAgenticSceneOverlay.4
                            {
                                AnonymousClass000.A00(46);
                            }

                            @Override // X.C7354EnR, X.InterfaceC7356EnT
                            public Object get(Object obj) {
                                return ((C9Tm) obj).A09;
                            }
                        };
                        AnonymousClass5 anonymousClass5 = AnonymousClass5.INSTANCE;
                        BRg bRgA4C = interfaceC05151eP.A4C(C2VU.A06, bRg2);
                        BRg bRgA0C = BRg.A00;
                        if (z) {
                            bRgA0C = C3U4.A0C(AbstractC1754Apr.A01(bRgA0C), 0.0f, 0.0f, 0.0f, FULLSCREEN_CAROUSEL_BOTTOM_PADDING);
                        }
                        BRg bRgThen = bRgA4C.then(bRgA0C);
                        int i4 = iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
                        boolean z2 = i4 == 32 || ((iA0d & 64) != 0 && bfm.A67(hatchMapAgenticScenePresentation));
                        Object objAaT2 = bfm.AaT();
                        if (z2 || objAaT2 == C78N.A00) {
                            objAaT2 = new HatchMapAgenticSceneOverlayKt$HatchMapAgenticSceneOverlay$6$1(hatchMapAgenticScenePresentation);
                            BBI.A0O(bbiA07, objAaT2);
                        }
                        G0U g0u3 = (G0U) objAaT2;
                        boolean z3 = i4 == 32 || ((iA0d & 64) != 0 && bfm.A67(hatchMapAgenticScenePresentation));
                        Object objAaT3 = bfm.AaT();
                        if (z3 || objAaT3 == C78N.A00) {
                            objAaT3 = new HatchMapAgenticSceneOverlayKt$HatchMapAgenticSceneOverlay$7$1(hatchMapAgenticScenePresentation);
                            BBI.A0O(bbiA07, objAaT3);
                        }
                        G0U g0u4 = (G0U) objAaT3;
                        boolean zA1V = C8j3.A1V(bfm, anonymousClass962, AnonymousClass004.A1K(iA0d));
                        Object objAaT4 = bfm.AaT();
                        if (zA1V || objAaT4 == C78N.A00) {
                            objAaT4 = new HatchMapAgenticSceneOverlayKt$HatchMapAgenticSceneOverlay$8$1(g0u, anonymousClass962);
                            BBI.A0O(bbiA07, objAaT4);
                        }
                        C96C.A01(bfm, bRgThen, anonymousClass962, str, listRememberHatchMapPlaces, anonymousClass4, null, g0u3, g0u4, (G0U) objAaT4, anonymousClass5, B1V.A00(bfm, new AnonymousClass9(anonymousClass965RememberHatchMapCardIconProvider), -1083058772), 0, 6, 64);
                    }
                }
            }
            bfm.AgE(456396259);
            boolean zA1K = AnonymousClass004.A1K(iA0d);
            Object objAaT5 = bfm.AaT();
            if (zA1K || objAaT5 == C78N.A00) {
                objAaT5 = new HatchMapAgenticSceneOverlayKt$HatchMapAgenticSceneOverlay$2$1(g0u);
                BBI.A0O(bbiA07, objAaT5);
            }
            AnonymousClass001.A15(bfm, objAaT5);
            bBbAAc = AnonymousClass001.A0L(bfm, bbiA07);
            if (bBbAAc != null) {
                anonymousClass10 = new AnonymousClass3(interfaceC05151eP, hatchMapAgenticScenePresentation, g0u, bRg2, i, i2);
                bBbAAc.A06 = anonymousClass10;
            }
            return;
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass10 = new AnonymousClass10(interfaceC05151eP, hatchMapAgenticScenePresentation, g0u, bRg2, i, i2);
            bBbAAc.A06 = anonymousClass10;
        }
    }

    public static final void HatchMapExpandButton(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(function0, 0);
        bfm.AgG(-17514215);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120441);
            BRg bRgA07 = C10G.A07(C3U4.A09(bRg2, C8j4.A01(bfm)), 48.0f);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new C1qN();
                BBI.A0T(bfm, objAaT);
            }
            BRg bRgA01 = C0v5.A01(null, (InterfaceC1072AWd) objAaT, bRgA07, null, null, function0, true);
            boolean zA65 = bfm.A65(strA01) | AnonymousClass003.A1B(iA0T);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = new HatchMapAgenticSceneOverlayKt$HatchMapExpandButton$2$1(strA01, function0);
                BBI.A0T(bfm, objAaT2);
            }
            BRg bRgA0X = AnonymousClass001.A0X(bRgA01, objAaT2);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0X);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA012, iA0J);
            AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(BOf.A00(bfm, R.drawable.arrows_expand_wght400_outline, 0), strA01, function0, C0z7.A00.A4C(C2VU.A0D, BRg.A00), false, 36.0f, AuraIconSize.TINY, null, null, false, false, bfm, 1769472 | AVy.$stable | ((iA0T << 6) & 896), 0, 1936);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C126724(function0, bRg2, i, i2);
        }
    }

    public static final void HatchMapExpandOverlay(InterfaceC05151eP interfaceC05151eP, String str, G0U<? super String, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-877821476);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, interfaceC05151eP) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgAQJ = interfaceC05151eP.AQJ(BRg.A00);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new C1qN();
                BBI.A0T(bfm, objAaT);
            }
            InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) objAaT;
            int i4 = iA0d & 896;
            boolean zA1Q = AnonymousClass002.A1Q(i4, 256);
            int i5 = iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1Q2 = zA1Q | AnonymousClass002.A1Q(i5, 32);
            Object objAaT2 = bfm.AaT();
            if (zA1Q2 || objAaT2 == obj) {
                objAaT2 = new HatchMapAgenticSceneOverlayKt$HatchMapExpandOverlay$2$1(g0u, str);
                BBI.A0T(bfm, objAaT2);
            }
            BRg bRgA01 = C0v5.A01(null, interfaceC1072AWd, bRgAQJ, null, null, (Function0) objAaT2, true);
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = HatchMapAgenticSceneOverlayKt$HatchMapExpandOverlay$3$1.INSTANCE;
                bfm.Ai0(objAaT3);
            }
            C3Ue.A04(AnonymousClass001.A0X(bRgA01, objAaT3), bfm, 0);
            boolean zA1Q3 = AnonymousClass002.A1Q(i4, 256) | (i5 == 32);
            Object objAaT4 = bfm.AaT();
            if (zA1Q3 || objAaT4 == obj) {
                objAaT4 = new HatchMapAgenticSceneOverlayKt$HatchMapExpandOverlay$4$1(g0u, str);
                BBI.A0T(bfm, objAaT4);
            }
            HatchMapExpandButton((Function0) objAaT4, interfaceC05151eP.A4C(C2VU.A0D, bRg2), bfm, 0, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C126735(interfaceC05151eP, str, g0u, bRg2, i, i2);
        }
    }

    public static final float getFULLSCREEN_CAROUSEL_BOTTOM_PADDING() {
        return FULLSCREEN_CAROUSEL_BOTTOM_PADDING;
    }
}
