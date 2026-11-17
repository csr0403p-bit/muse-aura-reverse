package com.facebook.aura.conversation.view;

import X.AHD;
import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.B1U;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C0z7;
import X.C10G;
import X.C1515AkP;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.conversation.view.richcontent.HatchInlineImageData;
import com.facebook.aura.conversation.view.richcontent.MessageSenderSemanticsKt;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageBubbleContentKt$HatchMessageBubbleContent$6$mediaGrid$1 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, Unit> {
    public final /* synthetic */ Function0<Float> $alpha;
    public final /* synthetic */ boolean $hasBubbleContent;
    public final /* synthetic */ InlineContentCallbacks $inlineContentCallbacks;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ String $sender;
    public final /* synthetic */ AHD<HatchInlineImageData> $userMediaImages;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageBubbleContentKt$HatchMessageBubbleContent$6$mediaGrid$1(boolean z, Function0<Float> function0, HatchMessageUiModel hatchMessageUiModel, AHD<HatchInlineImageData> ahd, InlineContentCallbacks inlineContentCallbacks, String str) {
        super(3);
        this.$hasBubbleContent = z;
        this.$alpha = function0;
        this.$message = hatchMessageUiModel;
        this.$userMediaImages = ahd;
        this.$inlineContentCallbacks = inlineContentCallbacks;
        this.$sender = str;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, BFM bfm, Integer num) {
        invoke(bRg, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BRg bRg, BFM bfm, int i) {
        int iA0d = i;
        C7384Etj.A0Y(bRg, 0);
        if ((iA0d & 6) == 0) {
            iA0d |= AnonymousClass004.A0d(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            B1U b1uA00 = B1V.A00(bfm, new HatchMessageBubbleContentKt$HatchMessageBubbleContent$6$mediaGrid$1$imageGrid$1(this.$userMediaImages, this.$inlineContentCallbacks, this.$message), 1462413848);
            if (this.$hasBubbleContent) {
                bfm.AgE(-62796365);
                BRg bRgA0D = C10G.A0D(bRg, Float.NaN, HatchMessageBubbleKt.bubbleMaxWidthDp(bfm, 0));
                boolean zA65 = bfm.A65(this.$alpha);
                Function0<Float> function0 = this.$alpha;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchMessageBubbleContentKt$HatchMessageBubbleContent$6$mediaGrid$1$1$1(function0);
                    bfm.Ai0(objAaT);
                }
                b1uA00.invoke(AnonymousClass001.A0W(bRgA0D, objAaT), bfm, 48);
            } else {
                bfm.AgE(-62679712);
                BRg bRgM636bubbleMaxWidthrAjV9yQ = HatchMessageBubbleKt.m636bubbleMaxWidthrAjV9yQ(HatchMessageBubbleKt.reactionBadgeOverflowPadding(bRg, !this.$message.reactions.isEmpty()), 0.0f, bfm, 0, 1);
                boolean zA652 = bfm.A65(this.$alpha);
                Function0<Float> function02 = this.$alpha;
                Object objAaT2 = bfm.AaT();
                if (zA652 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchMessageBubbleContentKt$HatchMessageBubbleContent$6$mediaGrid$1$2$1(function02);
                    bfm.Ai0(objAaT2);
                }
                BRg bRgA0W = AnonymousClass001.A0W(bRgM636bubbleMaxWidthrAjV9yQ, objAaT2);
                String str = this.$sender;
                HatchMessageUiModel hatchMessageUiModel = this.$message;
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0W);
                Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function03);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
                C0z7 c0z7 = C0z7.A00;
                b1uA00.invoke(MessageSenderSemanticsKt.messageSenderSemantics(BRg.A00, str), bfm, 48);
                HatchMessageBubbleKt.ReactionBadge(c0z7, hatchMessageUiModel.reactions, hatchMessageUiModel.id, hatchMessageUiModel.serverMessageId, bfm, 6, 0);
                BBI.A0R(bbi, true);
            }
            AnonymousClass001.A1D(bfm);
            return;
        }
        bfm.Afo();
    }
}
