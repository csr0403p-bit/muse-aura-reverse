package com.facebook.aura.conversation.view;

import X.AHD;
import X.AKQ;
import X.AbstractC05192Wm;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0981AMm;
import X.C10G;
import X.C1515AkP;
import X.C1DM;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.ui.Alignment;
import com.facebook.aura.conversation.view.TranscriptBubbleItem;
import com.facebook.aura.conversation.view.TranscriptRow;
import com.facebook.aura.conversation.view.richcontent.HatchInlineImageData;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.conversation.viewmodel.HatchRenderSegment;
import com.facebook.aura.markdown.render.spacing.BlockSpacingKt;
import com.facebook.aura.model.HatchContentViewModelData;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchTranscriptRendererKt$HatchTranscriptRendererWithBubbles$1$bubbleContent$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $activeSequenceKey;
    public final /* synthetic */ long $bubbleBackground;
    public final /* synthetic */ C0981AMm<String, Boolean> $completedSequenceKeys;
    public final /* synthetic */ float $highlightGlowAlpha;
    public final /* synthetic */ InlineContentCallbacks $inlineContentCallbacks;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ G0U<String, Unit> $onFirstTokenRendered;
    public final /* synthetic */ G0U<HatchMessageUiModel, Unit> $onSelectionReply;
    public final /* synthetic */ Set<String> $renderableWidgetTokenIds;
    public final /* synthetic */ TranscriptRow $row;
    public final /* synthetic */ String $sender;
    public final /* synthetic */ boolean $sequenceActive;
    public final /* synthetic */ boolean $streamSettleActive;
    public final /* synthetic */ B6A $textColor;
    public final /* synthetic */ C1DM $textShape;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $trailingContent;
    public final /* synthetic */ List<TranscriptBubbleItem> $visibleItems;
    public final /* synthetic */ G2j<AHD<String>, Boolean, BFM, Integer, Unit> $widgetTokenContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchTranscriptRendererKt$HatchTranscriptRendererWithBubbles$1$bubbleContent$1(float f, long j, C1DM c1dm, TranscriptRow transcriptRow, boolean z, List<? extends TranscriptBubbleItem> list, boolean z2, String str, C0981AMm<String, Boolean> c0981AMm, HatchMessageUiModel hatchMessageUiModel, InlineContentCallbacks inlineContentCallbacks, G0U<? super HatchMessageUiModel, Unit> g0u, B6A b6a, String str2, Set<String> set, G2j<? super AHD<String>, ? super Boolean, ? super BFM, ? super Integer, Unit> g2j, G0V<? super BFM, ? super Integer, Unit> g0v, G0U<? super String, Unit> g0u2) {
        super(2);
        this.$highlightGlowAlpha = f;
        this.$bubbleBackground = j;
        this.$textShape = c1dm;
        this.$row = transcriptRow;
        this.$streamSettleActive = z;
        this.$visibleItems = list;
        this.$sequenceActive = z2;
        this.$activeSequenceKey = str;
        this.$completedSequenceKeys = c0981AMm;
        this.$message = hatchMessageUiModel;
        this.$inlineContentCallbacks = inlineContentCallbacks;
        this.$onSelectionReply = g0u;
        this.$textColor = b6a;
        this.$sender = str2;
        this.$renderableWidgetTokenIds = set;
        this.$widgetTokenContent = g2j;
        this.$trailingContent = g0v;
        this.$onFirstTokenRendered = g0u2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        boolean z;
        Function0 function0;
        boolean z2;
        Function0 function02;
        AHD<HatchContentViewModelData> ahd;
        String str;
        if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
            BS0 bs0 = BRg.A00;
            BRg bRgA03 = C1b8.A03(HatchMessageBubbleKt.bubbleHighlightGlow(AnonymousClass001.A0U(C10G.A0D(bs0, HatchMessageBubbleKt.BubbleMinWidth, HatchMessageBubbleKt.bubbleMaxWidthDp(bfm, 0)), HatchMessageBubbleKt.BubbleMinHeight), this.$highlightGlowAlpha, bfm, 0), this.$textShape, this.$bubbleBackground);
            TranscriptRow transcriptRow = this.$row;
            if (((TranscriptRow.Bubble) transcriptRow).hasStreamingLast && this.$streamSettleActive) {
                bRgA03 = bRgA03.then(AbstractC05192Wm.A00(HatchMessageBubbleKt.BubbleResizeAnimationSpec, bs0));
            }
            BRg bRgA0D = C3U4.A0D(bRgA03, HatchMessageBubbleKt.BubbleInnerPadding);
            Alignment alignment = C2VU.A09;
            List<TranscriptBubbleItem> list = this.$visibleItems;
            boolean z3 = this.$sequenceActive;
            String str2 = this.$activeSequenceKey;
            C0981AMm<String, Boolean> c0981AMm = this.$completedSequenceKeys;
            HatchMessageUiModel hatchMessageUiModel = this.$message;
            InlineContentCallbacks inlineContentCallbacks = this.$inlineContentCallbacks;
            G0U<HatchMessageUiModel, Unit> g0u = this.$onSelectionReply;
            B6A b6a = this.$textColor;
            String str3 = this.$sender;
            Set<String> set = this.$renderableWidgetTokenIds;
            G2j<AHD<String>, Boolean, BFM, Integer, Unit> g2j = this.$widgetTokenContent;
            G0V<BFM, Integer, Unit> g0v = this.$trailingContent;
            G0U<String, Unit> g0u2 = this.$onFirstTokenRendered;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i2 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0D);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v2 = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA01, g0v2);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v3 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v3, i2);
            G0U<InterfaceC1516AkQ, Unit> g0u3 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u3);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, BlockSpacingKt.RichComponentSpacing, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA0X, g0v2);
            BPg.A02(bfm, akqA042, g0v3);
            AnonymousClass003.A15(g0u3, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            Iterator itA0w = AnonymousClass001.A0w(bfm, list, -521725208);
            while (itA0w.hasNext()) {
                TranscriptBubbleItem transcriptBubbleItem = (TranscriptBubbleItem) itA0w.next();
                if (z3 && C7384Etj.areEqual(transcriptBubbleItem.getSequenceKey(), str2)) {
                    z = true;
                    bfm.AgE(1006482350);
                    boolean zA1S = AnonymousClass004.A1S(bfm, c0981AMm, transcriptBubbleItem, bfm.A66(z3));
                    Object objAaT = bfm.AaT();
                    if (zA1S || objAaT == C78N.A00) {
                        objAaT = new HatchTranscriptRendererKt$HatchTranscriptRendererWithBubbles$1$bubbleContent$1$2$1$onActiveItemCompleted$1$1(transcriptBubbleItem, z3, c0981AMm);
                        bfm.Ai0(objAaT);
                    }
                    function0 = (Function0) objAaT;
                    BBI.A0R(bbi, false);
                } else {
                    z = false;
                    bfm.AgE(1006577427);
                    BBI.A0R(bbi, false);
                    function0 = null;
                }
                if (transcriptBubbleItem instanceof TranscriptBubbleItem.Text) {
                    bfm.AgE(1006793528);
                    if (hatchMessageUiModel.isStreaming && ((TranscriptBubbleItem.Text) transcriptBubbleItem).isFirstNonEmpty && (str = hatchMessageUiModel.qplTurnId) != null && g0u2 != null) {
                        g0u2.invoke(str);
                    }
                    TranscriptBubbleItem.Text text = (TranscriptBubbleItem.Text) transcriptBubbleItem;
                    HatchRenderSegment.TextSegment textSegment = text.segment;
                    HatchMessageUiModel hatchMessageUiModelCopy$default = HatchMessageUiModel.copy$default(hatchMessageUiModel, null, null, null, null, textSegment.block.text, 0L, text.isStreamingLast, false, null, false, textSegment.richContent, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -66641, 127, null);
                    if (hatchMessageUiModelCopy$default.content.length() == 0 && ((ahd = hatchMessageUiModelCopy$default.richContent) == null || ahd.isEmpty())) {
                        bfm.AgE(1007462415);
                        HatchTranscriptRendererKt.CompleteSequencedContent(text.getSequenceKey(), function0, bfm, 0);
                        BBI.A0R(bbi, false);
                    } else {
                        bfm.AgE(1007751180);
                        G0V<String, String, Unit> g0v4 = inlineContentCallbacks.onImageClick;
                        G0V<AHD<HatchInlineImageData>, Integer, Unit> g0v5 = inlineContentCallbacks.onImageGridClick;
                        G0U<String, Unit> g0u4 = inlineContentCallbacks.onImageError;
                        G0V<String, String, Unit> g0v6 = inlineContentCallbacks.onFileClick;
                        G0V<String, String, Unit> g0v7 = inlineContentCallbacks.onSlidesClick;
                        G0V<String, String, Unit> g0v8 = inlineContentCallbacks.onVideoClick;
                        G0U<HatchContentViewModelData, Unit> g0u5 = inlineContentCallbacks.onRichFormatOpenCTAClick;
                        G0U<String, Unit> g0u6 = inlineContentCallbacks.onArtifactVisible;
                        String str4 = hatchMessageUiModel.id;
                        String strA0M = FGI.A0M("lobster_media_", str4);
                        if (z || (!z3 && text.isStreamingLast)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        boolean z4 = !hatchMessageUiModel.isStreaming;
                        String strSegmentRevealKey = HatchTranscriptRendererKt.segmentRevealKey(str4, text);
                        if (g0u == null) {
                            bfm.AgE(1009112606);
                            BBI.A0R(bbi, false);
                            function02 = null;
                        } else {
                            bfm.AgE(1009112607);
                            boolean zA1J = AnonymousClass003.A1J(bfm, g0u, hatchMessageUiModelCopy$default);
                            Object objAaT2 = bfm.AaT();
                            if (zA1J || objAaT2 == C78N.A00) {
                                objAaT2 = new HatchTranscriptRendererKt$HatchTranscriptRendererWithBubbles$1$bubbleContent$1$2$1$2$1$1(g0u, hatchMessageUiModelCopy$default);
                                bfm.Ai0(objAaT2);
                            }
                            function02 = (Function0) objAaT2;
                            BBI.A0R(bbi, false);
                        }
                        HatchMessageBubbleContentKt.m634HatchMessageContentZdSQAXI(hatchMessageUiModelCopy$default, null, null, null, g0v4, g0v5, g0u4, g0v6, g0v7, g0v8, g0u5, g0u6, strA0M, b6a, null, z2, strSegmentRevealKey, function0, function02, z4, null, false, str3, null, bfm, HatchMessageUiModel.$stable, 0, 0, 11550734);
                        BBI.A0R(bbi, false);
                    }
                    BBI.A0R(bbi, false);
                } else if (transcriptBubbleItem instanceof TranscriptBubbleItem.Cards) {
                    bfm.AgE(1009341635);
                    if (z && hatchMessageUiModel.isStreaming && !HatchTranscriptRendererKt.allRenderableIn(((TranscriptBubbleItem.Cards) transcriptBubbleItem).ids, set)) {
                        bfm.AgE(1009879113);
                    } else {
                        bfm.AgE(1009605228);
                        if (g2j == null) {
                            bfm.AgE(1009642706);
                        } else {
                            bfm.AgE(-521620209);
                            AnonymousClass001.A1F(((TranscriptBubbleItem.Cards) transcriptBubbleItem).ids, true, bfm, g2j, 48);
                        }
                        BBI.A0R(bbi, false);
                        HatchTranscriptRendererKt.CompleteSequencedContent(((TranscriptBubbleItem.Cards) transcriptBubbleItem).getSequenceKey(), function0, bfm, 0);
                    }
                    BBI.A0R(bbi, false);
                    BBI.A0R(bbi, false);
                } else {
                    throw AnonymousClass003.A0k(bfm, bbi, -521713508);
                }
            }
            BBI.A0R(bbi, false);
            if (((TranscriptRow.Bubble) transcriptRow).includeTrailingContent) {
                bfm.AgE(-521607903);
                if (g0v == null) {
                    bfm.AgE(1010024192);
                } else {
                    bfm.AgE(-521607903);
                    AnonymousClass001.A1H(bfm, g0v, 0);
                }
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1010049737);
            }
            AnonymousClass002.A10(bbi, false, true);
            return;
        }
        bfm.Afo();
    }
}
