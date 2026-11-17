package com.facebook.aura.conversation.view;

import X.AEk;
import X.AGH;
import X.AGO;
import X.AHD;
import X.AKH;
import X.AKQ;
import X.AOB;
import X.AOI;
import X.AOP;
import X.AOQ;
import X.AOR;
import X.AOW;
import X.ARD;
import X.ASR;
import X.AST;
import X.AT5;
import X.ATD;
import X.AVd;
import X.AWx;
import X.AaC;
import X.AaM;
import X.AbstractC07117nq;
import X.AbstractC0878AGe;
import X.AbstractC1396AiR;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BRr;
import X.BS0;
import X.C00x;
import X.C0dx;
import X.C0v5;
import X.C1003AOr;
import X.C10G;
import X.C1299Agk;
import X.C1515AkP;
import X.C16Z;
import X.C16a;
import X.C1822Arm;
import X.C19U;
import X.C1BO;
import X.C1D8;
import X.C1DG;
import X.C1DO;
import X.C1EQ;
import X.C1YD;
import X.C1b8;
import X.C1er;
import X.C2Uh;
import X.C2av;
import X.C31w;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.EnumC10460Hji;
import X.EnumC1080AXj;
import X.EnumC1820Arj;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.HzP;
import X.InterfaceC05151eP;
import X.InterfaceC1072AWd;
import X.InterfaceC1074AXb;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.aura.analytics.hatch.HatchCitationAnalytics;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.model.HatchMessageKt;
import com.facebook.aura.model.HatchSearchResultData;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.surface.AuraElevatedSurfaceKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchMessageLongPressMenuHostKt {
    public static final String DoubleTapHeartReaction = "\u2764\ufe0f";
    public static final long ImeSettleTimeoutMs = 600;
    public static final int ReactionEntryStaggerMs = 30;
    public static final int ReactionEntryStaggerSlots = 6;
    public static final List<B6A> ReactionTrayFadeInColors;
    public static final List<B6A> ReactionTrayFadeOutColors;
    public static final float SelectionTextFallbackInset = 32.0f;
    public static final float SelectionLabelFallbackInset = 2.0f;
    public static final float SelectionVerticalFallbackInset = 8.0f;
    public static final float ReactionBarHeight = 60.0f;
    public static final float ReactionButtonSize = 48.0f;
    public static final float ReactionButtonHighlightInset = 4.0f;
    public static final float ReactionTraySpacing = -2.0f;
    public static final float ReactionBarContentPadding = 8.0f;
    public static final float ReactionBarSideMargin = 16.0f;
    public static final float ReactionTrayFadeWidth = 10.0f;
    public static final C1003AOr<Float> ReactionEntrySpring = new C1003AOr<>(null, 0.5f, 1500.0f);
    public static final float MenuGap = 8.0f;
    public static final AKH<G0V<String, String, Unit>> LocalMessageReactionHandler = new AGO(HatchMessageLongPressMenuHostKt$LocalMessageReactionHandler$1.INSTANCE);
    public static final AKH<G0U<HatchMessageUiModel, Unit>> LocalMessageUnsendHandler = new AGO(HatchMessageLongPressMenuHostKt$LocalMessageUnsendHandler$1.INSTANCE);
    public static final AKH<G0V<HatchSearchResultData, HatchCitationAnalytics, Unit>> LocalViewSourcesHandler = new AGO(HatchMessageLongPressMenuHostKt$LocalViewSourcesHandler$1.INSTANCE);
    public static final AKH<C1DG> LocalMessageReactionBarTopBoundary = new AGO(HatchMessageLongPressMenuHostKt$LocalMessageReactionBarTopBoundary$1.INSTANCE);
    public static final AKH<C1DG> LocalMessageActionMenuBottomBoundary = new AGO(HatchMessageLongPressMenuHostKt$LocalMessageActionMenuBottomBoundary$1.INSTANCE);
    public static final AKH<BubbleChildTapTracker> LocalBubbleChildTapTracker = new AGO(HatchMessageLongPressMenuHostKt$LocalBubbleChildTapTracker$1.INSTANCE);

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$HatchInlineReactionBar$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
        public final /* synthetic */ AHD<String> $currentReactions;
        public final /* synthetic */ C0dx $haptics;
        public final /* synthetic */ String $moreOptionsLabel;
        public final /* synthetic */ Function0<Unit> $onOpenPicker;
        public final /* synthetic */ G0U<String, Unit> $onReaction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, C0dx c0dx, Function0<Unit> function0, AHD<String> ahd, G0U<? super String, Unit> g0u) {
            super(3);
            this.$moreOptionsLabel = str;
            this.$haptics = c0dx;
            this.$onOpenPicker = function0;
            this.$currentReactions = ahd;
            this.$onReaction = g0u;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
            invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.InterfaceC05151eP r24, X.BFM r25, int r26) {
            /*
                Method dump skipped, instructions count: 533
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt.AnonymousClass2.invoke(X.1eP, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$HatchInlineReactionBar$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ AHD<String> $currentReactions;
        public final /* synthetic */ AOI<Boolean> $expandedStates;
        public final /* synthetic */ Function0<Unit> $onOpenPicker;
        public final /* synthetic */ G0U<String, Unit> $onReaction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(AOI<Boolean> aoi, AHD<String> ahd, G0U<? super String, Unit> g0u, Function0<Unit> function0, int i) {
            super(2);
            this.$expandedStates = aoi;
            this.$currentReactions = ahd;
            this.$onReaction = g0u;
            this.$onOpenPicker = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMessageLongPressMenuHostKt.HatchInlineReactionBar(this.$expandedStates, this.$currentReactions, this.$onReaction, this.$onOpenPicker, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G2j<BRg, Boolean, BFM, Integer, Unit> $content;
        public final /* synthetic */ HatchMessageUiModel $message;
        public final /* synthetic */ G0U<ContentItem, Unit> $onImageCopy;
        public final /* synthetic */ Function0<Unit> $onReply;
        public final /* synthetic */ boolean $selectionAllowed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(HatchMessageUiModel hatchMessageUiModel, Function0<Unit> function0, boolean z, G0U<? super ContentItem, Unit> g0u, G2j<? super BRg, ? super Boolean, ? super BFM, ? super Integer, Unit> g2j, int i, int i2) {
            super(2);
            this.$message = hatchMessageUiModel;
            this.$onReply = function0;
            this.$selectionAllowed = z;
            this.$onImageCopy = g0u;
            this.$content = g2j;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMessageLongPressMenuHostKt.HatchMessageLongPressMenuHost(this.$message, this.$onReply, this.$selectionAllowed, this.$onImageCopy, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$InlineReactionButton$2, reason: invalid class name and case insensitive filesystem */
    public final class C114932 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $emoji;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114932(String str) {
            super(2);
            this.$emoji = str;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                HatchReactionGlyphKt.HatchReactionGlyph(this.$emoji, null, C1822Arm.A00(null, AnonymousClass002.A0f(bfm).title1Regular, null, null, null, null, null, null, null, null, 0, 0, 0, 16777213, 0L, C19U.A03(28), 0L, 0L), bfm, 0, 2);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$InlineReactionButton$3, reason: invalid class name and case insensitive filesystem */
    public final class C114943 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $emoji;
        public final /* synthetic */ int $entryDelayMillis;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ boolean $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114943(String str, boolean z, int i, Function0<Unit> function0, BRg bRg, int i2, int i3) {
            super(2);
            this.$emoji = str;
            this.$selected = z;
            this.$entryDelayMillis = i;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMessageLongPressMenuHostKt.InlineReactionButton(this.$emoji, this.$selected, this.$entryDelayMillis, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$InlineReactionButtonSurface$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ int $entryDelayMillis;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ boolean $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(boolean z, int i, Function0<Unit> function0, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i2, int i3) {
            super(2);
            this.$selected = z;
            this.$entryDelayMillis = i;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$content = g0v;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMessageLongPressMenuHostKt.InlineReactionButtonSurface(this.$selected, this.$entryDelayMillis, this.$onClick, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$InlineReactionMoreButton$2, reason: invalid class name and case insensitive filesystem */
    public final class C114952 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $contentDescription;
        public final /* synthetic */ int $entryDelayMillis;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114952(String str, int i, Function0<Unit> function0, BRg bRg, int i2, int i3) {
            super(2);
            this.$contentDescription = str;
            this.$entryDelayMillis = i;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMessageLongPressMenuHostKt.InlineReactionMoreButton(this.$contentDescription, this.$entryDelayMillis, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt", f = "HatchMessageLongPressMenuHost.kt", l = {1077}, m = "consumeRestOfGesture", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$consumeRestOfGesture$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchMessageLongPressMenuHostKt.consumeRestOfGesture(null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt", f = "HatchMessageLongPressMenuHost.kt", l = {1090}, m = "dispatchSyntheticLongPress", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$dispatchSyntheticLongPress$1, reason: invalid class name and case insensitive filesystem */
    public final class C114961 extends HzP {
        public float F$0;
        public float F$1;
        public float F$2;
        public float F$3;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchMessageLongPressMenuHostKt.dispatchSyntheticLongPress(null, 0.0f, 0.0f, this);
        }

        public C114961(HtJ<? super C114961> htJ) {
            super(htJ);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$reactionTrayEdgeFade$2, reason: invalid class name and case insensitive filesystem */
    public final class C114982 extends AbstractC7559F3s implements G0U<AST, ASR> {
        public final /* synthetic */ boolean $showEndFade;
        public final /* synthetic */ boolean $showStartFade;

        /* renamed from: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$reactionTrayEdgeFade$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
            public final /* synthetic */ long $edgeSize;
            public final /* synthetic */ C1EQ $leadingBrush;
            public final /* synthetic */ C1EQ $trailingBrush;
            public final /* synthetic */ long $trailingOffset;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(C16Z c16z) {
                C16Z.A00(c16z);
                C1EQ c1eq = this.$leadingBrush;
                if (c1eq != null) {
                    c16z.A9f(c1eq, null, C16a.A00, 1.0f, 6, 0L, this.$edgeSize);
                }
                C1EQ c1eq2 = this.$trailingBrush;
                if (c1eq2 != null) {
                    c16z.A9f(c1eq2, null, C16a.A00, 1.0f, 6, this.$trailingOffset, this.$edgeSize);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C1EQ c1eq, C1EQ c1eq2, long j, long j2) {
                super(1);
                this.$leadingBrush = c1eq;
                this.$trailingBrush = c1eq2;
                this.$edgeSize = j;
                this.$trailingOffset = j2;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
                invoke2(c16z);
                return Unit.INSTANCE;
            }
        }

        @Override // X.G0U
        public final ASR invoke(AST ast) {
            C7384Etj.A0Y(ast, 0);
            float fAEm = HatchMessageLongPressMenuHostKt.ReactionTrayFadeWidth * ast.AEm();
            boolean zA1Z = AnonymousClass002.A1Z(ast.A00.getLayoutDirection(), EnumC1820Arj.A02);
            return ast.A01(new AnonymousClass1(zA1Z ? this.$showStartFade : this.$showEndFade ? C1EQ.A00(HatchMessageLongPressMenuHostKt.ReactionTrayFadeInColors, 0.0f, fAEm) : null, zA1Z ? this.$showEndFade : this.$showStartFade ? C1EQ.A00(HatchMessageLongPressMenuHostKt.ReactionTrayFadeOutColors, C1DO.A00(ast) - fAEm, C1DO.A00(ast)) : null, (Float.floatToRawIntBits(fAEm) << 32) | (Float.floatToRawIntBits(AnonymousClass001.A01(r2.AKb(), 4294967295L)) & 4294967295L), (Float.floatToRawIntBits(C1DO.A00(ast) - fAEm) << 32) | (4294967295L & Float.floatToRawIntBits(0.0f))));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114982(boolean z, boolean z2) {
            super(1);
            this.$showStartFade = z;
            this.$showEndFade = z2;
        }
    }

    public static final /* synthetic */ int access$reactionEntryDelayMillis(int i) {
        if (i > 6) {
            i = 6;
        }
        return i * 30;
    }

    public static final BRg handlesOwnTaps(BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        bfm.AgE(1534295630);
        final BubbleChildTapTracker bubbleChildTapTracker = (BubbleChildTapTracker) bfm.A6v(LocalBubbleChildTapTracker);
        if (bubbleChildTapTracker != null) {
            boolean zA67 = bfm.A67(bubbleChildTapTracker);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new PointerInputEventHandler() { // from class: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$handlesOwnTaps$1$1

                    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$handlesOwnTaps$1$1$1", f = "HatchMessageLongPressMenuHost.kt", l = {HatchWidgetWebViewKt.HTTP_NO_CONTENT}, m = "invokeSuspend", v = 2)
                    /* renamed from: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$handlesOwnTaps$1$1$1, reason: invalid class name */
                    public final class AnonymousClass1 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Unit>, Object> {
                        public final /* synthetic */ BubbleChildTapTracker $tracker;
                        public /* synthetic */ Object L$0;
                        public Object L$1;
                        public int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(BubbleChildTapTracker bubbleChildTapTracker, HtJ<? super AnonymousClass1> htJ) {
                            super(2, htJ);
                            this.$tracker = bubbleChildTapTracker;
                        }

                        @Override // X.AbstractC8884Fsp
                        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$tracker, htJ);
                            anonymousClass1.L$0 = obj;
                            return anonymousClass1;
                        }

                        @Override // X.AbstractC8884Fsp
                        public final Object invokeSuspend(Object obj) {
                            BubbleChildTapTracker bubbleChildTapTracker;
                            InterfaceC1074AXb interfaceC1074AXb = (InterfaceC1074AXb) this.L$0;
                            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                            int i = this.label;
                            if (i == 0) {
                                Hwg.A00(obj);
                                bubbleChildTapTracker = this.$tracker;
                                EnumC1080AXj enumC1080AXj = EnumC1080AXj.A03;
                                this.L$0 = null;
                                this.L$1 = bubbleChildTapTracker;
                                this.label = 1;
                                obj = TapGestureDetectorKt.A04(interfaceC1074AXb, enumC1080AXj, this, false);
                                if (obj == enumC10460Hji) {
                                    return enumC10460Hji;
                                }
                            } else {
                                if (i != 1) {
                                    throw AnonymousClass001.A0n();
                                }
                                bubbleChildTapTracker = (BubbleChildTapTracker) this.L$1;
                                Hwg.A00(obj);
                            }
                            bubbleChildTapTracker.claimedPointer = new C2Uh(((C1299Agk) obj).A08);
                            return Unit.INSTANCE;
                        }

                        @Override // X.G0V
                        public final Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Unit> htJ) {
                            return ((AnonymousClass1) create(interfaceC1074AXb, htJ)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                        return AnonymousClass006.A0l(bRr, htJ, new AnonymousClass1(bubbleChildTapTracker, null));
                    }
                };
                bfm.Ai0(objAaT);
            }
            bRg = AaM.A00(bRg, (PointerInputEventHandler) objAaT, bubbleChildTapTracker);
        }
        AnonymousClass001.A1D(bfm);
        return bRg;
    }

    public static final int reactionEntryDelayMillis(int i) {
        if (i > 6) {
            i = 6;
        }
        return i * 30;
    }

    static {
        long j = B6A.A01;
        B6A b6a = new B6A(j);
        long j2 = B6A.A06;
        ReactionTrayFadeOutColors = AnonymousClass004.A17(b6a, j2);
        ReactionTrayFadeInColors = AnonymousClass004.A17(new B6A(j2), j);
    }

    public static final void HatchMessageLongPressMenuHost$lambda$37(MutableState<AWx> mutableState, long j) {
        mutableState.Af8(new AWx(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void InlineReactionButton(java.lang.String r16, boolean r17, int r18, kotlin.jvm.functions.Function0<kotlin.Unit> r19, X.BRg r20, X.BFM r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt.InlineReactionButton(java.lang.String, boolean, int, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    public static final void InlineReactionButtonSurface(boolean z, int i, Function0<Unit> function0, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i2, int i3) {
        BBI bbiA0M;
        long j;
        BRg bRg2 = bRg;
        bfm.AgG(1150779623);
        int iA0n = (i2 & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0n |= AnonymousClass004.A0E(bfm, i);
        }
        if ((i2 & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function0);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA0n |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0n |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0X(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 9363, 9362), bfm, iA0n)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            AT5 at5 = (AT5) AnonymousClass005.A0e(bfm, objAaT, obj);
            Unit unit = Unit.INSTANCE;
            boolean zA1S = AnonymousClass001.A1S(bfm, at5, AnonymousClass001.A1N(iA0n));
            Object objAaT2 = bfm.AaT();
            if (zA1S || objAaT2 == obj) {
                objAaT2 = new HatchMessageLongPressMenuHostKt$InlineReactionButtonSurface$1$1(i, at5, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A18(bfm, objAaT2, unit);
            boolean zA67 = bfm.A67(at5);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = new HatchMessageLongPressMenuHostKt$InlineReactionButtonSurface$2$1(at5);
                bfm.Ai0(objAaT3);
            }
            BRg bRgA0W = AnonymousClass001.A0W(bRg2, objAaT3);
            float f = ReactionButtonSize;
            BRg bRgA09 = C3U4.A09(C0v5.A01(null, (InterfaceC1072AWd) AnonymousClass007.A0U(bfm, obj), C10G.A0F(bRgA0W, f, f, Float.NaN, Float.NaN), new C1YD(0), null, function0, true), ReactionButtonHighlightInset);
            if (z) {
                j = AnonymousClass003.A0c(bfm, 2092664240).highlight;
                bbiA0M = (BBI) bfm;
                BBI.A0R(bbiA0M, false);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, 2092664914);
                j = B6A.A06;
            }
            BRg bRgA03 = C1b8.A03(bRgA09, C1D8.A00, j);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D = AnonymousClass001.A0D(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRgA03);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0D);
            AnonymousClass004.A1C(bbiA0M, bfm, g0v, iA0n >> 12, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(z, i, function0, bRg2, g0v, i2, i3);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[LOOP:0: B:12:0x002c->B:14:0x0032, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0065 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object consumeRestOfGesture(X.InterfaceC1074AXb r6, X.HtJ<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt.AnonymousClass1
            if (r0 == 0) goto L68
            r5 = r7
            com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$consumeRestOfGesture$1 r5 = (com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L58
            if (r0 != r3) goto L6e
            java.lang.Object r6 = r5.L$0
            X.AXb r6 = (X.InterfaceC1074AXb) r6
            X.Hwg.A00(r1)
        L24:
            X.Afe r1 = (X.C1247Afe) r1
            java.util.List<X.Agk> r2 = r1.A05
            java.util.Iterator r1 = r2.iterator()
        L2c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L36
            X.AnonymousClass006.A1S(r1)
            goto L2c
        L36:
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L43
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L43
        L40:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L43:
            java.util.Iterator r1 = r2.iterator()
        L47:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r1.next()
            X.Agk r0 = (X.C1299Agk) r0
            boolean r0 = r0.A0F
            if (r0 == 0) goto L47
            goto L5b
        L58:
            X.Hwg.A00(r1)
        L5b:
            X.AXj r0 = X.EnumC1080AXj.A03
            r5.L$0 = r6
            r5.label = r3
            java.lang.Object r1 = r6.A4z(r0, r5)
            if (r1 != r4) goto L24
            return r4
        L68:
            com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$consumeRestOfGesture$1 r5 = new com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$consumeRestOfGesture$1
            r5.<init>(r7)
            goto L12
        L6e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt.consumeRestOfGesture(X.AXb, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object dispatchSyntheticLongPress(android.view.View r20, float r21, float r22, X.HtJ<? super kotlin.Unit> r23) {
        /*
            r3 = r23
            r4 = r20
            boolean r0 = r3 instanceof com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt.C114961
            if (r0 == 0) goto L94
            r6 = r3
            com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$dispatchSyntheticLongPress$1 r6 = (com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt.C114961) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L94
            int r2 = r2 - r1
            r6.label = r2
        L16:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r13 = 1
            if (r0 == 0) goto L41
            if (r0 != r13) goto L9b
            long r9 = r6.J$0
            float r15 = r6.F$3
            float r14 = r6.F$2
            java.lang.Object r4 = r6.L$0
            android.view.View r4 = (android.view.View) r4
            X.Hwg.A00(r1)
        L2e:
            long r11 = android.os.SystemClock.uptimeMillis()
            r16 = 0
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            r4.dispatchTouchEvent(r0)
            r0.recycle()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L41:
            X.Hwg.A00(r1)
            r0 = 2
            int[] r1 = new int[r0]
            r4.getLocationInWindow(r1)
            r20 = 0
            r0 = r1[r20]
            float r0 = (float) r0
            r8 = r21
            float r14 = r21 - r0
            r0 = r1[r13]
            float r0 = (float) r0
            r7 = r22
            float r15 = r22 - r0
            long r9 = android.os.SystemClock.uptimeMillis()
            r16 = r9
            r18 = r9
            r21 = r14
            r22 = r15
            r23 = r20
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r16, r18, r20, r21, r22, r23)
            r4.dispatchTouchEvent(r0)
            r0.recycle()
            int r0 = android.view.ViewConfiguration.getLongPressTimeout()
            long r0 = (long) r0
            r2 = 100
            long r0 = r0 + r2
            r6.L$0 = r4
            r2 = 0
            r6.L$1 = r2
            r6.L$2 = r2
            r6.F$0 = r8
            r6.F$1 = r7
            r6.F$2 = r14
            r6.F$3 = r15
            r6.J$0 = r9
            r6.label = r13
            java.lang.Object r0 = X.C7Bq.A01(r0, r6)
            if (r0 != r5) goto L2e
            return r5
        L94:
            com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$dispatchSyntheticLongPress$1 r6 = new com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$dispatchSyntheticLongPress$1
            r6.<init>(r3)
            goto L16
        L9b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt.dispatchSyntheticLongPress(android.view.View, float, float, X.HtJ):java.lang.Object");
    }

    public static final AKH<BubbleChildTapTracker> getLocalBubbleChildTapTracker() {
        return LocalBubbleChildTapTracker;
    }

    public static final AKH<C1DG> getLocalMessageActionMenuBottomBoundary() {
        return LocalMessageActionMenuBottomBoundary;
    }

    public static final AKH<C1DG> getLocalMessageReactionBarTopBoundary() {
        return LocalMessageReactionBarTopBoundary;
    }

    public static final AKH<G0V<String, String, Unit>> getLocalMessageReactionHandler() {
        return LocalMessageReactionHandler;
    }

    public static final AKH<G0U<HatchMessageUiModel, Unit>> getLocalMessageUnsendHandler() {
        return LocalMessageUnsendHandler;
    }

    public static final AKH<G0V<HatchSearchResultData, HatchCitationAnalytics, Unit>> getLocalViewSourcesHandler() {
        return LocalViewSourcesHandler;
    }

    public static final long insetPoint(AaC aaC, float f, float f2) {
        float f3 = aaC.A01;
        float fA03 = ATD.A03(f3 + f, f3, Math.max(f3, aaC.A02 - 1.0f));
        float f4 = aaC.A03;
        return AnonymousClass007.A0A(fA03, ATD.A03(f4 + f2, f4, Math.max(f4, aaC.A00 - 1.0f)));
    }

    public static final void logMessageLongPress(HatchMessageUiModel hatchMessageUiModel, boolean z, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logLongPress(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchInteractionEnumsKt.chatScreen(z), HatchComponent.MESSAGE_BUBBLE, null, AnonymousClass006.A11(HatchMetadataKey.MESSAGE_ROLE.getValue(), HatchMessageKt.getAnalyticsValue(hatchMessageUiModel.role), map));
    }

    public static final void logReactionClick(HatchMessageUiModel hatchMessageUiModel, String str, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchScreen.MAIN_CHAT, HatchComponent.REACTION_BUTTON, null, AGH.A02(map, AnonymousClass007.A0d("emoji", HatchCustomReactionKt.reactionAnalyticsValue(str), new HxE(HatchMetadataKey.MESSAGE_ROLE.getValue(), HatchMessageKt.getAnalyticsValue(hatchMessageUiModel.role)))), null);
    }

    public static final void logReactionPickerClick(boolean z, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchInteractionEnumsKt.chatScreen(z), HatchComponent.REACTION_PICKER_BUTTON, null, map, null);
    }

    public static final void logUnsendNuxConfirm(boolean z, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.RESPONSE_TOOLBAR, HatchInteractionEnumsKt.chatScreen(z), HatchComponent.DELETE_CONFIRM_BUTTON, null, map, null);
    }

    public static final void logUnsendNuxDismiss(boolean z, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.CHAT, HatchSubsurface.RESPONSE_TOOLBAR, HatchInteractionEnumsKt.chatScreen(z), HatchComponent.UNSEND_NUX_SHEET, null, map);
    }

    public static final BRg reactionTrayEdgeFade(BRg bRg, boolean z, boolean z2) {
        return (z || z2) ? AEk.A02(AbstractC1396AiR.A00(bRg, C114971.INSTANCE), new C114982(z, z2)) : bRg;
    }

    /* renamed from: reactionTrayWidth-0680j_4, reason: not valid java name */
    public static final float m651reactionTrayWidth0680j_4(float f) {
        return (((f - (ReactionBarSideMargin * 2.0f)) - (ReactionBarContentPadding * 2.0f)) - ReactionButtonSize) - ReactionTraySpacing;
    }

    /* renamed from: selectionSeedWindowOffsets-86GbZ28, reason: not valid java name */
    public static final List<AWx> m652selectionSeedWindowOffsets86GbZ28(AWx aWx, List<AaC> list, long j, float f, float f2, float f3) {
        AaC aaC;
        long jInsetPoint;
        AaC next;
        ArrayList arrayList = new ArrayList();
        AaC next2 = null;
        if (aWx != null) {
            long j2 = aWx.A00;
            Iterator<AaC> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.A06(j2)) {
                    break;
                }
            }
            aaC = next;
        } else {
            aaC = null;
        }
        if (aWx != null && aaC != null) {
            arrayList.add(aWx);
            float fA01 = AnonymousClass001.A01(aWx.A00, 4294967295L) - aaC.A03;
            arrayList.add(new AWx(insetPoint(aaC, f, fA01)));
            arrayList.add(new AWx(insetPoint(aaC, f2, fA01)));
        }
        Iterator<AaC> it2 = list.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                float f4 = next2.A03;
                do {
                    AaC next3 = it2.next();
                    float f5 = next3.A03;
                    if (Float.compare(f4, f5) > 0) {
                        next2 = next3;
                        f4 = f5;
                    }
                } while (it2.hasNext());
            }
        }
        AaC aaC2 = next2;
        if (aaC2 == null) {
            jInsetPoint = AWx.A05(j, (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
        } else {
            arrayList.add(new AWx(insetPoint(aaC2, f, f3)));
            jInsetPoint = insetPoint(aaC2, f2, f3);
        }
        arrayList.add(new AWx(jInsetPoint));
        return AbstractC0878AGe.A0X(AbstractC0878AGe.A0f(arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void HatchInlineReactionBar(AOI<Boolean> aoi, AHD<String> ahd, G0U<? super String, Unit> g0u, Function0<Unit> function0, BFM bfm, int i) {
        BBI bbiA0M;
        Object objA09;
        Snapshot snapshotA03;
        G0U<Object, Unit> g0uA0D;
        Snapshot snapshotA04;
        Object objA092;
        bfm.AgG(160568387);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(aoi, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, ahd);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0u);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            C0dx c0dxA0T = AnonymousClass002.A0T(bfm);
            String strA0i = AnonymousClass005.A0i(bfm);
            final AOP aopA03 = AOR.A03(aoi, bfm, "ReactionBar", ((iA05 & 14) | 48) & 126, 0);
            HatchMessageLongPressMenuHostKt$HatchInlineReactionBar$scale$2 hatchMessageLongPressMenuHostKt$HatchInlineReactionBar$scale$2 = HatchMessageLongPressMenuHostKt$HatchInlineReactionBar$scale$2.INSTANCE;
            C31w<Float, AOW> c31w = AVd.A02;
            if (aopA03.A0G()) {
                bbiA0M = AnonymousClass002.A0M(bfm, 1666827533);
                objA09 = aopA03.A02.A09();
            } else {
                boolean zA1Y = AnonymousClass001.A1Y(aopA03, bfm, 1666573488);
                objA09 = bfm.AaT();
                if (zA1Y || objA09 == C78N.A00) {
                    snapshotA03 = Snapshot.A03();
                    g0uA0D = snapshotA03 != null ? snapshotA03.A0D() : null;
                    snapshotA04 = Snapshot.A04(snapshotA03);
                    try {
                        objA09 = AnonymousClass007.A0S(aopA03, bfm, snapshotA03, snapshotA04, g0uA0D);
                    } catch (Throwable th) {
                        Snapshot.A07(snapshotA03, snapshotA04, g0uA0D);
                        throw th;
                    }
                }
                bbiA0M = (BBI) bfm;
                BBI.A0R(bbiA0M, false);
            }
            boolean zA1X = AnonymousClass001.A1X(objA09);
            bfm.AgE(164686687);
            Float fA0b = AnonymousClass005.A0b(bbiA0M, zA1X ? 1.0f : 0.8f);
            boolean zA65 = bfm.A65(aopA03);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = AnonymousClass003.A0R(bfm, new Function0<Boolean>() { // from class: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$HatchInlineReactionBar$$inlined$animateFloat$1
                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        return aopA03.A07.getValue();
                    }
                });
            }
            boolean zA0F = C1BO.A0F((C1BO) objAaT);
            bfm.AgE(164686687);
            Float fA0b2 = AnonymousClass005.A0b(bbiA0M, zA0F ? 1.0f : 0.8f);
            boolean zA652 = bfm.A65(aopA03);
            Object objAaT2 = bfm.AaT();
            if (zA652 || objAaT2 == C78N.A00) {
                objAaT2 = AnonymousClass003.A0R(bfm, new Function0<AOB<Boolean>>() { // from class: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$HatchInlineReactionBar$$inlined$animateFloat$2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final AOB<Boolean> invoke() {
                        return aopA03.A03();
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ AOB<Boolean> invoke() {
                        return aopA03.A03();
                    }
                });
            }
            AOQ aoqA01 = AOR.A01(hatchMessageLongPressMenuHostKt$HatchInlineReactionBar$scale$2.invoke((AOB<Boolean>) ((C1BO) objAaT2).getValue(), bfm, (Integer) 0), aopA03, c31w, bfm, fA0b, fA0b2, 196608);
            HatchMessageLongPressMenuHostKt$HatchInlineReactionBar$alpha$2 hatchMessageLongPressMenuHostKt$HatchInlineReactionBar$alpha$2 = HatchMessageLongPressMenuHostKt$HatchInlineReactionBar$alpha$2.INSTANCE;
            if (aopA03.A0G()) {
                bfm.AgE(1666827533);
                BBI.A0R(bbiA0M, false);
                objA092 = aopA03.A02.A09();
            } else {
                boolean zA1Y2 = AnonymousClass001.A1Y(aopA03, bfm, 1666573488);
                objA092 = bfm.AaT();
                if (zA1Y2 || objA092 == C78N.A00) {
                    snapshotA03 = Snapshot.A03();
                    g0uA0D = snapshotA03 != null ? snapshotA03.A0D() : null;
                    snapshotA04 = Snapshot.A04(snapshotA03);
                    objA092 = AnonymousClass007.A0S(aopA03, bfm, snapshotA03, snapshotA04, g0uA0D);
                }
                BBI.A0R(bbiA0M, false);
            }
            boolean zA1X2 = AnonymousClass001.A1X(objA092);
            bfm.AgE(-1735238797);
            Float fA0b3 = AnonymousClass005.A0b(bbiA0M, AnonymousClass006.A00(zA1X2 ? 1 : 0));
            boolean zA653 = bfm.A65(aopA03);
            Object objAaT3 = bfm.AaT();
            if (zA653 || objAaT3 == C78N.A00) {
                objAaT3 = AnonymousClass003.A0R(bfm, new Function0<Boolean>() { // from class: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$HatchInlineReactionBar$$inlined$animateFloat$3
                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        return aopA03.A07.getValue();
                    }
                });
            }
            boolean zA0F2 = C1BO.A0F((C1BO) objAaT3);
            bfm.AgE(-1735238797);
            Float fA0b4 = AnonymousClass005.A0b(bbiA0M, zA0F2 ? 1.0f : 0.0f);
            boolean zA654 = bfm.A65(aopA03);
            Object objAaT4 = bfm.AaT();
            if (zA654 || objAaT4 == C78N.A00) {
                objAaT4 = AnonymousClass003.A0R(bfm, new Function0<AOB<Boolean>>() { // from class: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$HatchInlineReactionBar$$inlined$animateFloat$4
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final AOB<Boolean> invoke() {
                        return aopA03.A03();
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ AOB<Boolean> invoke() {
                        return aopA03.A03();
                    }
                });
            }
            AOQ aoqA012 = AOR.A01(hatchMessageLongPressMenuHostKt$HatchInlineReactionBar$alpha$2.invoke((AOB<Boolean>) ((C1BO) objAaT4).getValue(), bfm, (Integer) 0), aopA03, c31w, bfm, fA0b3, fA0b4, 196608);
            BS0 bs0 = BRg.A00;
            boolean zA1K = AnonymousClass003.A1K(bfm, aoqA01, aoqA012);
            Object objAaT5 = bfm.AaT();
            if (zA1K || objAaT5 == C78N.A00) {
                objAaT5 = new HatchMessageLongPressMenuHostKt$HatchInlineReactionBar$1$1(aoqA01, aoqA012);
                bfm.Ai0(objAaT5);
            }
            AuraElevatedSurfaceKt.m2622AuraElevatedPillSurfaceDzVHIIc(AnonymousClass001.A0W(bs0, objAaT5), 28.0f, null, B1V.A00(bfm, new AnonymousClass2(strA0i, c0dxA0T, function0, ahd, g0u), 1568329601), bfm, 3120, 4);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(aoi, ahd, g0u, function0, i);
        }
    }

    public static final long HatchMessageLongPressMenuHost$lambda$36(MutableState<AWx> mutableState) {
        return mutableState.getValue().A00;
    }

    public static final void InlineReactionMoreButton(String str, int i, Function0<Unit> function0, BRg bRg, BFM bfm, int i2, int i3) {
        bfm.AgG(325428637);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, i);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i4 != 0) {
                bRg = BRg.A00;
            }
            boolean zA1B = AnonymousClass003.A1B(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new HatchMessageLongPressMenuHostKt$InlineReactionMoreButton$1$1(str);
                bfm.Ai0(objAaT);
            }
            InlineReactionButtonSurface(false, i, function0, ARD.A01(bRg, (G0U) objAaT, false), ComposableSingletons$HatchMessageLongPressMenuHostKt.f30lambda$256049209, bfm, (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 24582 | (iA0d & 896), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114952(str, i, function0, bRg, i2, i3);
        }
    }

    public static final /* synthetic */ AWx access$HatchMessageLongPressMenuHost$lambda$39(MutableState mutableState) {
        return (AWx) mutableState.getValue();
    }

    public static final /* synthetic */ AaC access$HatchMessageLongPressMenuHost$lambda$45(MutableState mutableState) {
        return (AaC) mutableState.getValue();
    }

    public static final BRg hatchBubbleGestures(BRg bRg, G0U<? super AWx, Unit> g0u, Function0<Unit> function0, final BubbleChildTapTracker bubbleChildTapTracker, BFM bfm, int i) {
        final MutableState mutableStateA00 = C1er.A00(bfm, g0u);
        final MutableState mutableStateA002 = C1er.A00(bfm, function0);
        final boolean zA1X = AnonymousClass002.A1X(function0);
        Boolean boolValueOf = Boolean.valueOf(zA1X);
        boolean zA1W = AnonymousClass004.A1W(bfm, mutableStateA002, zA1X, AnonymousClass003.A1N(bfm, bubbleChildTapTracker, mutableStateA00));
        Object objAaT = bfm.AaT();
        if (zA1W || objAaT == C78N.A00) {
            objAaT = new PointerInputEventHandler() { // from class: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$hatchBubbleGestures$1$1

                @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$hatchBubbleGestures$1$1$1", f = "HatchMessageLongPressMenuHost.kt", l = {1026, 1028, 1034, 1045, 1050, 1060}, m = "invokeSuspend", v = 2)
                /* renamed from: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$hatchBubbleGestures$1$1$1, reason: invalid class name */
                public final class AnonymousClass1 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Unit>, Object> {
                    public final /* synthetic */ BubbleChildTapTracker $childTapTracker;
                    public final /* synthetic */ C1BO<Function0<Unit>> $currentDoubleTap$delegate;
                    public final /* synthetic */ C1BO<G0U<AWx, Unit>> $currentLongPress$delegate;
                    public final /* synthetic */ boolean $doubleTapEnabled;
                    public /* synthetic */ Object L$0;
                    public Object L$1;
                    public Object L$2;
                    public Object L$3;
                    public int label;

                    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$hatchBubbleGestures$1$1$1$1", f = "HatchMessageLongPressMenuHost.kt", l = {1029}, m = "invokeSuspend", v = 2)
                    /* renamed from: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$hatchBubbleGestures$1$1$1$1, reason: invalid class name and collision with other inner class name */
                    public final class C01121 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super C1299Agk>, Object> {
                        public /* synthetic */ Object L$0;
                        public int label;

                        public C01121(HtJ<? super C01121> htJ) {
                            super(2, htJ);
                        }

                        @Override // X.AbstractC8884Fsp
                        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                            C01121 c01121 = new C01121(htJ);
                            c01121.L$0 = obj;
                            return c01121;
                        }

                        @Override // X.AbstractC8884Fsp
                        public final Object invokeSuspend(Object obj) {
                            InterfaceC1074AXb interfaceC1074AXb = (InterfaceC1074AXb) this.L$0;
                            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                            int i = this.label;
                            if (i == 0) {
                                Hwg.A00(obj);
                                EnumC1080AXj enumC1080AXj = EnumC1080AXj.A03;
                                this.L$0 = null;
                                this.label = 1;
                                obj = TapGestureDetectorKt.A03(interfaceC1074AXb, enumC1080AXj, this);
                                if (obj == enumC10460Hji) {
                                    return enumC10460Hji;
                                }
                            } else {
                                if (i != 1) {
                                    throw AnonymousClass001.A0n();
                                }
                                Hwg.A00(obj);
                            }
                            return obj;
                        }

                        @Override // X.G0V
                        public final Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super C1299Agk> htJ) {
                            C01121 c01121 = new C01121(htJ);
                            c01121.L$0 = interfaceC1074AXb;
                            return c01121.invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public AnonymousClass1(BubbleChildTapTracker bubbleChildTapTracker, boolean z, C1BO<? extends G0U<? super AWx, Unit>> c1bo, C1BO<? extends Function0<Unit>> c1bo2, HtJ<? super AnonymousClass1> htJ) {
                        super(2, htJ);
                        this.$childTapTracker = bubbleChildTapTracker;
                        this.$doubleTapEnabled = z;
                        this.$currentLongPress$delegate = c1bo;
                        this.$currentDoubleTap$delegate = c1bo2;
                    }

                    @Override // X.AbstractC8884Fsp
                    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$childTapTracker, this.$doubleTapEnabled, this.$currentLongPress$delegate, this.$currentDoubleTap$delegate, htJ);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:31:0x0098, code lost:
                    
                        if (r11 == r6) goto L32;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
                    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
                    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
                    /* JADX WARN: Removed duplicated region for block: B:49:0x00e3  */
                    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
                    /* JADX WARN: Removed duplicated region for block: B:59:0x0134 A[RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:72:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    @Override // X.AbstractC8884Fsp
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                        /*
                            Method dump skipped, instructions count: 366
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$hatchBubbleGestures$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    @Override // X.G0V
                    public final Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Unit> htJ) {
                        return ((AnonymousClass1) create(interfaceC1074AXb, htJ)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                    return AnonymousClass006.A0l(bRr, htJ, new AnonymousClass1(bubbleChildTapTracker, zA1X, mutableStateA00, mutableStateA002, null));
                }
            };
            bfm.Ai0(objAaT);
        }
        return AaM.A01(bRg, (PointerInputEventHandler) objAaT, boolValueOf, bubbleChildTapTracker);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0367 A[PHI: r53
  0x0367: PHI (r53v1 boolean) = (r53v0 boolean), (r53v4 boolean), (r53v4 boolean) binds: [B:162:0x035b, B:164:0x035f, B:166:0x0365] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchMessageLongPressMenuHost(com.facebook.aura.conversation.viewmodel.HatchMessageUiModel r69, kotlin.jvm.functions.Function0<kotlin.Unit> r70, boolean r71, X.G0U<? super com.facebook.aura.file.view.api.ContentItem, kotlin.Unit> r72, X.G2j<? super X.BRg, ? super java.lang.Boolean, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r73, X.BFM r74, int r75, int r76) {
        /*
            Method dump skipped, instructions count: 2817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt.HatchMessageLongPressMenuHost(com.facebook.aura.conversation.viewmodel.HatchMessageUiModel, kotlin.jvm.functions.Function0, boolean, X.G0U, X.G2j, X.BFM, int, int):void");
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$reactionTrayEdgeFade$1, reason: invalid class name and case insensitive filesystem */
    public final class C114971 extends AbstractC7559F3s implements G0U<C2av, Unit> {
        public static final C114971 INSTANCE = new C114971();

        public C114971() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C2av c2av) {
            C7384Etj.A0Y(c2av, 0);
            c2av.Ad7(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
            invoke2(c2av);
            return Unit.INSTANCE;
        }
    }
}
