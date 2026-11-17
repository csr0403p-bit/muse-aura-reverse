package com.facebook.aura.appappearance;

import X.AKQ;
import X.AVy;
import X.AWx;
import X.AaM;
import X.AbstractC1103AYp;
import X.AbstractC1996Aw5;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AnonymousClass604;
import X.AnonymousClass607;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BOf;
import X.BQN;
import X.BRg;
import X.BRr;
import X.BS0;
import X.C00q;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1323AhA;
import X.C1515AkP;
import X.C1809ArT;
import X.C1822Arm;
import X.C1847AsK;
import X.C19U;
import X.C1DG;
import X.C1er;
import X.C3U4;
import X.C3Ue;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C5V9;
import X.C5WT;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.EnumC10460Hji;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.HBA;
import X.HtJ;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.aura.R;
import com.facebook.aura.conversation.view.richcontent.HatchAuraMarkdownProvidersKt;
import com.facebook.aura.conversation.view.richcontent.HatchMarkdownTableCardKt;
import com.facebook.aura.conversation.view.richcontent.HatchMermaidContentKt;
import com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer;
import com.facebook.aura.conversation.view.richcontent.MermaidThemeColors;
import com.facebook.aura.header.view.HatchHeaderTitleAlignment;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.markdown.render.AuraMarkdownDefaults;
import com.facebook.aura.markdown.render.AuraMarkdownTheme;
import com.facebook.aura.markdown.render.block.TableRendererKt;
import com.facebook.aura.model.HatchContentViewModelData;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class HatchRichFormatFullScreenKt {
    public static final float MAX_ZOOM = 8.0f;
    public static final float MIN_ZOOM = 0.5f;

    /* renamed from: com.facebook.aura.appappearance.HatchRichFormatFullScreenKt$CodeFullScreen$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ HatchContentViewModelData.Code $data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Context context, HatchContentViewModelData.Code code) {
            super(2);
            this.$context = context;
            this.$data = code;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                AVy aVyA00 = BOf.A00(bfm, R.drawable.copy_wght400_outline_24, 0);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1208a0);
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$data, bfm.A67(this.$context));
                Context context = this.$context;
                HatchContentViewModelData.Code code = this.$data;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchRichFormatFullScreenKt$CodeFullScreen$3$1$1(context, code);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass005.A0o(bfm, aVyA00, strA01, (Function0) objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.appappearance.HatchRichFormatFullScreenKt$CodeFullScreen$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ HatchContentViewModelData.Code $data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HatchContentViewModelData.Code code) {
            super(4);
            this.$data = code;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m245invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m245invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            BRg bRgA09 = C3U4.A09(AbstractC1103AYp.A01(AbstractC1103AYp.A00(0, bfm, 0, 1), AnonymousClass006.A0M(bfm), true), 12.0f);
            HatchContentViewModelData.Code code = this.$data;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C01N.A08(bfm, bs0, f);
            AuraTextKt.m2639AuraTextUY9GdpU(code.codeParams.codeContent, null, C06G.A0C(bfm), C1822Arm.A00(null, C06G.A0Y(bfm), AbstractC1996Aw5.A01, null, null, null, null, null, null, null, 0, 0, 0, 16777183, 0L, 0L, 0L, 0L), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A04(bfm, bbi, bs0, f2, true);
        }
    }

    /* renamed from: com.facebook.aura.appappearance.HatchRichFormatFullScreenKt$CodeFullScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchContentViewModelData.Code $data;
        public final /* synthetic */ Function0<Unit> $onDismissClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(HatchContentViewModelData.Code code, Function0<Unit> function0, int i) {
            super(2);
            this.$data = code;
            this.$onDismissClick = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchRichFormatFullScreenKt.CodeFullScreen(this.$data, this.$onDismissClick, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.appappearance.HatchRichFormatFullScreenKt$HatchRichFormatFullScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $cacheId;
        public final /* synthetic */ Function0<Unit> $onDismissClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Function0<Unit> function0, int i) {
            super(2);
            this.$cacheId = str;
            this.$onDismissClick = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchRichFormatFullScreenKt.HatchRichFormatFullScreen(this.$cacheId, this.$onDismissClick, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.appappearance.HatchRichFormatFullScreenKt$MermaidFullScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C109272 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ HatchContentViewModelData.MermaidDiagram $data;
        public final /* synthetic */ MutableState<Boolean> $showSource$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109272(Context context, HatchContentViewModelData.MermaidDiagram mermaidDiagram, MutableState<Boolean> mutableState) {
            super(2);
            this.$context = context;
            this.$data = mermaidDiagram;
            this.$showSource$delegate = mutableState;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                if (MutableState.A0A((MutableState) this.$showSource$delegate)) {
                    bfm.AgE(-1453403953);
                    AVy aVyA00 = BOf.A00(bfm, R.drawable.copy_wght400_outline_24, 0);
                    String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1208a0);
                    boolean zA1R = AnonymousClass001.A1R(bfm, this.$data, bfm.A67(this.$context));
                    Context context = this.$context;
                    HatchContentViewModelData.MermaidDiagram mermaidDiagram = this.$data;
                    Object objAaT = bfm.AaT();
                    if (zA1R || objAaT == C78N.A00) {
                        objAaT = new HatchRichFormatFullScreenKt$MermaidFullScreen$2$1$1(context, mermaidDiagram);
                        bfm.Ai0(objAaT);
                    }
                    int i2 = AVy.$stable;
                    AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(aVyA00, strA01, (Function0) objAaT, null, false, 0.0f, null, null, null, false, false, bfm, i2, 0, 2040);
                    AVy aVyA002 = BOf.A00(bfm, R.drawable.aura_icon_eye, 0);
                    String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121119);
                    boolean zA65 = bfm.A65(this.$showSource$delegate);
                    MutableState<Boolean> mutableState = this.$showSource$delegate;
                    Object objAaT2 = bfm.AaT();
                    if (zA65 || objAaT2 == C78N.A00) {
                        objAaT2 = new HatchRichFormatFullScreenKt$MermaidFullScreen$2$2$1(mutableState);
                        bfm.Ai0(objAaT2);
                    }
                    AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(aVyA002, strA012, (Function0) objAaT2, null, false, 0.0f, null, null, null, false, false, bfm, i2, 0, 2040);
                } else {
                    bfm.AgE(-1452702547);
                    AVy aVyA003 = BOf.A00(bfm, R.drawable.aura_icon_code, 0);
                    String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12111a);
                    boolean zA652 = bfm.A65(this.$showSource$delegate);
                    MutableState<Boolean> mutableState2 = this.$showSource$delegate;
                    Object objAaT3 = bfm.AaT();
                    if (zA652 || objAaT3 == C78N.A00) {
                        objAaT3 = new HatchRichFormatFullScreenKt$MermaidFullScreen$2$3$1(mutableState2);
                        bfm.Ai0(objAaT3);
                    }
                    AnonymousClass005.A0o(bfm, aVyA003, strA013, (Function0) objAaT3);
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.appappearance.HatchRichFormatFullScreenKt$MermaidFullScreen$3, reason: invalid class name and case insensitive filesystem */
    public final class C109283 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ HatchContentViewModelData.MermaidDiagram $data;
        public final /* synthetic */ MutableState<Boolean> $showSource$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109283(HatchContentViewModelData.MermaidDiagram mermaidDiagram, MutableState<Boolean> mutableState) {
            super(4);
            this.$data = mermaidDiagram;
            this.$showSource$delegate = mutableState;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m246invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m246invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            BBI bbi;
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            if (MutableState.A0A((MutableState) this.$showSource$delegate)) {
                AuraColors auraColorsA0K = C3cI.A0K(bfm, 2047868568);
                BS0 bs0 = BRg.A00;
                BRg bRgA09 = C3U4.A09(AnonymousClass005.A0T(bfm, C10G.A01), 16.0f);
                HatchContentViewModelData.MermaidDiagram mermaidDiagram = this.$data;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA09);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V != null) {
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                    C01N.A08(bfm, bs0, f);
                    String str = mermaidDiagram.mermaidSource;
                    long j = auraColorsA0K.primaryText;
                    C1847AsK c1847AsK = AbstractC1996Aw5.A01;
                    long jA03 = C19U.A03(13);
                    long jA032 = C19U.A03(20);
                    C1822Arm c1822Arm = C1822Arm.A03;
                    long j2 = B6A.A07;
                    AuraTextKt.m2639AuraTextUY9GdpU(str, null, j, new C1822Arm(null, c1847AsK, null, 0, 0, j2, jA03, C1809ArT.A01, j2, jA032), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                    C01N.A04(bfm, bbi, bs0, f2, true);
                    BBI.A0R(bbi, false);
                }
                C00x.A00();
                throw F60.createAndThrow();
            }
            bfm.AgE(2048445013);
            MermaidSvgRenderer.RenderResult renderResultRememberMermaidRenderResult = HatchMermaidContentKt.rememberMermaidRenderResult(this.$data.mermaidSource, HatchMermaidContentKt.rememberMermaidThemeColors(bfm, 0), bfm, MermaidThemeColors.$stable << 3);
            if (renderResultRememberMermaidRenderResult == null) {
                BS0 bs0A09 = C3cG.A09(bfm, 2048705258);
                C1062ATq c1062ATq = C10G.A01;
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                BBI bbi2 = (BBI) bfm;
                int iA0J2 = AnonymousClass003.A0J(bbi2);
                AKQ akqA042 = BBI.A04(bbi2);
                BRg bRgA012 = AxM.A01(bfm, c1062ATq);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbi2.A0V != null) {
                    AnonymousClass005.A0n(bfm, bbi2, function02);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA042, bRgA012, iA0J2);
                    AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(C10G.A07(bs0A09, 48.0f), null, 0L, bfm, 6, 6);
                    BBI.A0R(bbi2, true);
                }
                C00x.A00();
                throw F60.createAndThrow();
            }
            if (renderResultRememberMermaidRenderResult instanceof MermaidSvgRenderer.RenderResult.Success) {
                bfm.AgE(2048924459);
                HatchRichFormatFullScreenKt.ZoomableMermaidContent(((MermaidSvgRenderer.RenderResult.Success) renderResultRememberMermaidRenderResult).parsedSvg, C10G.A01, bfm, 48, 0);
            } else {
                if (!(renderResultRememberMermaidRenderResult instanceof MermaidSvgRenderer.RenderResult.Error)) {
                    throw AnonymousClass005.A0k(bfm, 1867201282);
                }
                bfm.AgE(2049077878);
                C3Ue.A04(C10G.A01, bfm, 6);
            }
            BBI bbi3 = (BBI) bfm;
            bbi = bbi3;
            BBI.A0R(bbi3, false);
            BBI.A0R(bbi, false);
        }
    }

    /* renamed from: com.facebook.aura.appappearance.HatchRichFormatFullScreenKt$MermaidFullScreen$4, reason: invalid class name and case insensitive filesystem */
    public final class C109294 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchContentViewModelData.MermaidDiagram $data;
        public final /* synthetic */ Function0<Unit> $onDismissClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109294(HatchContentViewModelData.MermaidDiagram mermaidDiagram, Function0<Unit> function0, int i) {
            super(2);
            this.$data = mermaidDiagram;
            this.$onDismissClick = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchRichFormatFullScreenKt.MermaidFullScreen(this.$data, this.$onDismissClick, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.appappearance.HatchRichFormatFullScreenKt$TableFullScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C109302 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ HatchContentViewModelData.Table $data;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* renamed from: com.facebook.aura.appappearance.HatchRichFormatFullScreenKt$TableFullScreen$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public final class C00312 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ AuraBlock.Table $block;
            public final /* synthetic */ float $bottomPadding;
            public final /* synthetic */ AuraMarkdownTheme $theme;
            public final /* synthetic */ float $topPadding;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00312(float f, float f2, AuraBlock.Table table, AuraMarkdownTheme auraMarkdownTheme) {
                super(2);
                this.$topPadding = f;
                this.$bottomPadding = f2;
                this.$block = table;
                this.$theme = auraMarkdownTheme;
            }

            public final void invoke(BFM bfm, int i) {
                if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                    bfm.Afo();
                } else {
                    TableRendererKt.TableRenderer(this.$block, this.$theme, C3U4.A0B(C3U4.A0C(C10G.A01, 0.0f, this.$topPadding, 0.0f, this.$bottomPadding), 16.0f, 0.0f), true, true, 0, true, bfm, 1600512, 32);
                }
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109302(HatchContentViewModelData.Table table, AbstractC3358CGz abstractC3358CGz, Context context, AuraNavigator auraNavigator) {
            super(4);
            this.$data = table;
            this.$userSession = abstractC3358CGz;
            this.$context = context;
            this.$navigator = auraNavigator;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m247invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m247invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA04), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            boolean zA65 = bfm.A65(this.$data.tableParams);
            HatchContentViewModelData.Table table = this.$data;
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = HatchMarkdownTableCardKt.toAuraBlockTable(table.tableParams);
                bfm.Ai0(objAaT);
            }
            AuraBlock.Table table2 = (AuraBlock.Table) objAaT;
            AuraMarkdownTheme auraMarkdownThemeM1366fromAuraTheme6p0HZu4 = AuraMarkdownDefaults.INSTANCE.m1366fromAuraTheme6p0HZu4(null, null, null, null, false, bfm, 196608, 31);
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$navigator, AnonymousClass001.A1T(bfm, this.$context, bfm.A67(this.$userSession)));
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            Context context = this.$context;
            AuraNavigator auraNavigator = this.$navigator;
            Object objAaT2 = bfm.AaT();
            if (zA1T || objAaT2 == C78N.A00) {
                objAaT2 = new HatchRichFormatFullScreenKt$TableFullScreen$2$1$1(abstractC3358CGz, context, auraNavigator);
                bfm.Ai0(objAaT2);
            }
            HatchAuraMarkdownProvidersKt.HatchAuraMarkdownUrlHandler((G0U) objAaT2, B1V.A00(bfm, new C00312(f, f2, table2, auraMarkdownThemeM1366fromAuraTheme6p0HZu4), -944309642), bfm, 48);
        }
    }

    /* renamed from: com.facebook.aura.appappearance.HatchRichFormatFullScreenKt$TableFullScreen$3, reason: invalid class name and case insensitive filesystem */
    public final class C109313 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchContentViewModelData.Table $data;
        public final /* synthetic */ Function0<Unit> $onDismissClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109313(HatchContentViewModelData.Table table, Function0<Unit> function0, int i) {
            super(2);
            this.$data = table;
            this.$onDismissClick = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchRichFormatFullScreenKt.TableFullScreen(this.$data, this.$onDismissClick, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.appappearance.HatchRichFormatFullScreenKt$ZoomableMermaidContent$3, reason: invalid class name and case insensitive filesystem */
    public final class C109323 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HBA $svg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109323(HBA hba, BRg bRg, int i, int i2) {
            super(2);
            this.$svg = hba;
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
            HatchRichFormatFullScreenKt.ZoomableMermaidContent(this.$svg, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchRichFormatFullScreen(String str, Function0<Unit> function0, BFM bfm, int i) {
        C7384Etj.A0Y(function0, 1);
        bfm.AgG(-1871649512);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            HatchRichFormatFullScreenViewModel hatchRichFormatFullScreenViewModel = (HatchRichFormatFullScreenViewModel) BQN.A00(null, bodA00, AnonymousClass005.A0Y(bodA00), null, C3cG.A0x(HatchRichFormatFullScreenViewModel.class));
            hatchRichFormatFullScreenViewModel.loadIfNeeded(str);
            HatchContentViewModelData hatchContentViewModelData = hatchRichFormatFullScreenViewModel.contentViewModelData;
            boolean zA65 = bfm.A65(hatchContentViewModelData);
            int i2 = iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean z = zA65 | (i2 == 32);
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = new HatchRichFormatFullScreenKt$HatchRichFormatFullScreen$1$1(hatchContentViewModelData, function0, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, hatchContentViewModelData);
            if (hatchContentViewModelData != null) {
                bfm.AgE(-1044611087);
                if (hatchContentViewModelData instanceof HatchContentViewModelData.Code) {
                    bfm.AgE(-1044549180);
                    CodeFullScreen((HatchContentViewModelData.Code) hatchContentViewModelData, function0, bfm, i2);
                } else if (hatchContentViewModelData instanceof HatchContentViewModelData.Table) {
                    bfm.AgE(-1044435069);
                    TableFullScreen((HatchContentViewModelData.Table) hatchContentViewModelData, function0, bfm, i2);
                } else if (hatchContentViewModelData instanceof HatchContentViewModelData.MermaidDiagram) {
                    bfm.AgE(-1044311007);
                    MermaidFullScreen((HatchContentViewModelData.MermaidDiagram) hatchContentViewModelData, function0, bfm, i2);
                } else {
                    bfm.AgE(-1044225912);
                }
                AnonymousClass001.A1D(bfm);
            } else {
                bfm.AgE(-1044214070);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, function0, i);
        }
    }

    public static final void ZoomableMermaidContent(HBA hba, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1399470527);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, hba) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new ParcelableSnapshotMutableFloatState(1.0f);
                bfm.Ai0(objAaT);
            }
            final C00q c00q = (C00q) objAaT;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = AnonymousClass004.A11(bfm, new AWx(0L));
            }
            final MutableState mutableState = (MutableState) objAaT2;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = new HatchRichFormatFullScreenKt$ZoomableMermaidContent$transformableState$1$1(c00q, mutableState);
                bfm.Ai0(objAaT3);
            }
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = new AnonymousClass607(objAaT3, 1);
                bfm.Ai0(objAaT4);
            }
            MutableState mutableStateA00 = C1er.A00(bfm, objAaT4);
            Object objAaT5 = bfm.AaT();
            if (objAaT5 == obj) {
                objAaT5 = new C5WT(new AnonymousClass607(mutableStateA00, 0));
                bfm.Ai0(objAaT5);
            }
            BRg bRgThen = C11U.A00(bRg2).then(new C1323AhA((C5V9) objAaT5, new AnonymousClass604(2)));
            Unit unit = Unit.INSTANCE;
            Object objAaT6 = bfm.AaT();
            if (objAaT6 == obj) {
                objAaT6 = new PointerInputEventHandler() { // from class: com.facebook.aura.appappearance.HatchRichFormatFullScreenKt$ZoomableMermaidContent$1$1

                    /* renamed from: com.facebook.aura.appappearance.HatchRichFormatFullScreenKt$ZoomableMermaidContent$1$1$1, reason: invalid class name */
                    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AWx, Unit> {
                        public final /* synthetic */ MutableState<AWx> $offset$delegate;
                        public final /* synthetic */ C00q $scale$delegate;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(C00q c00q, MutableState<AWx> mutableState) {
                            super(1);
                            this.$scale$delegate = c00q;
                            this.$offset$delegate = mutableState;
                        }

                        @Override // X.G0U
                        public /* bridge */ /* synthetic */ Unit invoke(AWx aWx) {
                            m248invokek4lQ0M(aWx.A00);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                        public final void m248invokek4lQ0M(long j) {
                            float fAFn = this.$scale$delegate.AFn();
                            C00q c00q = this.$scale$delegate;
                            if (fAFn <= 1.5f) {
                                c00q.AdS(3.0f);
                            } else {
                                c00q.AdS(1.0f);
                                HatchRichFormatFullScreenKt.ZoomableMermaidContent$lambda$5(this.$offset$delegate, 0L);
                            }
                        }
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                        Object objA06 = TapGestureDetectorKt.A06(bRr, htJ, new AnonymousClass1(c00q, mutableState), null, null, TapGestureDetectorKt.A00);
                        return objA06 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA06;
                    }
                };
                bfm.Ai0(objAaT6);
            }
            BRg bRgA00 = AaM.A00(bRgThen, (PointerInputEventHandler) objAaT6, unit);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            C1062ATq c1062ATq = C10G.A01;
            Object objAaT7 = bfm.AaT();
            if (objAaT7 == obj) {
                objAaT7 = new HatchRichFormatFullScreenKt$ZoomableMermaidContent$2$1$1(c00q, mutableState);
                bfm.Ai0(objAaT7);
            }
            HatchMermaidContentKt.MermaidSvgCanvas(hba, AnonymousClass001.A0W(c1062ATq, objAaT7), bfm, (iA0T & 14) | 48, 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C109323(hba, bRg2, i, i2);
        }
    }

    public static final void ZoomableMermaidContent$lambda$5(MutableState<AWx> mutableState, long j) {
        mutableState.Af8(new AWx(j));
    }

    public static final void CodeFullScreen(HatchContentViewModelData.Code code, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(24320370);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, code) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AuraContainer.PrimaryScreen primaryScreen = AuraContainer.PrimaryScreen.INSTANCE;
            AuraContentRole auraContentRole = AuraContentRole.Immersive;
            long j = C3cH.A0W(bfm).background;
            String strA0v = code.codeParams.language;
            if (strA0v.length() > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append((Object) String.valueOf(strA0v.charAt(0)).toUpperCase(Locale.ROOT));
                strA0v = AnonymousClass001.A0v(strA0v.substring(1), sb);
            }
            HatchHeaderTitleAlignment hatchHeaderTitleAlignment = HatchHeaderTitleAlignment.START;
            boolean zA1C = AnonymousClass003.A1C(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = new HatchRichFormatFullScreenKt$CodeFullScreen$2$1(function0);
                bfm.Ai0(objAaT);
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(primaryScreen, null, auraContentRole, j, strA0v, null, (Function0) objAaT, hatchHeaderTitleAlignment, false, false, R.drawable.x_wght400_outline_24, null, null, null, null, null, B1V.A00(bfm, new AnonymousClass3(contextA0H, code), 1154469759), 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new AnonymousClass4(code), -314794505), bfm, 12583302, 1572864, 905969664, 268368674);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(code, function0, i);
        }
    }

    public static final void MermaidFullScreen(HatchContentViewModelData.MermaidDiagram mermaidDiagram, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(-1916774795);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, mermaidDiagram) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            Context contextA0H = AnonymousClass002.A0H(bfm);
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HatchRichFormatFullScreenKt$MermaidFullScreen$showSource$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT, objArr);
            AuraContainer.PrimaryScreen primaryScreen = AuraContainer.PrimaryScreen.INSTANCE;
            AuraContentRole auraContentRole = AuraContentRole.Immersive;
            long j = C3cH.A0W(bfm).background;
            HatchHeaderTitleAlignment hatchHeaderTitleAlignment = HatchHeaderTitleAlignment.HIDDEN;
            boolean z = (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32;
            Object objAaT2 = bfm.AaT();
            if (z || objAaT2 == obj) {
                objAaT2 = new HatchRichFormatFullScreenKt$MermaidFullScreen$1$1(function0);
                bfm.Ai0(objAaT2);
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(primaryScreen, null, auraContentRole, j, null, null, (Function0) objAaT2, hatchHeaderTitleAlignment, false, false, R.drawable.x_wght400_outline_24, null, null, null, null, null, B1V.A00(bfm, new C109272(contextA0H, mermaidDiagram, mutableStateA0N), -981557880), 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new C109283(mermaidDiagram, mutableStateA0N), -2067328496), bfm, 12583302, 1572864, 905969664, 268368690);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C109294(mermaidDiagram, function0, i);
        }
    }

    public static final void TableFullScreen(HatchContentViewModelData.Table table, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(-1528232784);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, table) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            AuraContainer.PrimaryScreen primaryScreen = AuraContainer.PrimaryScreen.INSTANCE;
            AuraContentRole auraContentRole = AuraContentRole.Immersive;
            long j = C3cH.A0W(bfm).background;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bf0);
            HatchHeaderTitleAlignment hatchHeaderTitleAlignment = HatchHeaderTitleAlignment.START;
            boolean zA1V = AnonymousClass006.A1V(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new HatchRichFormatFullScreenKt$TableFullScreen$1$1(function0);
                bfm.Ai0(objAaT);
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(primaryScreen, null, auraContentRole, j, strA01, null, (Function0) objAaT, hatchHeaderTitleAlignment, false, false, R.drawable.x_wght400_outline_24, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new C109302(table, abstractC3358CGzA0h, contextA0H, auraNavigatorA0b), -1000113163), bfm, 12583302, 0, 905969664, 268434210);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C109313(table, function0, i);
        }
    }

    public static final long ZoomableMermaidContent$lambda$4(MutableState<AWx> mutableState) {
        return mutableState.getValue().A00;
    }
}
