package com.facebook.aura.conversation.view;

import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C3UC;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.G0U;
import X.G0V;
import X.G0W;
import android.text.BidiFormatter;
import com.facebook.aura.R;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.conversation.viewmodel.ReplyAttributionUiModel;
import com.facebook.aura.gateway.HatchThumbnailDisplaySize;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.model.HatchMessageRole;
import com.facebook.aura.model.IdeaWidgetData;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageItemKt$HatchMessageItem$8$1$sections$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ G0U<String, Unit> $onScrollToMessage;
    public final /* synthetic */ ReplyAttributionUiModel $resolvedAttribution;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageItemKt$HatchMessageItem$8$1$sections$1$1(ReplyAttributionUiModel replyAttributionUiModel, AbstractC3358CGz abstractC3358CGz, HatchMessageUiModel hatchMessageUiModel, AuraNavigator auraNavigator, G0U<? super String, Unit> g0u) {
        super(2);
        this.$resolvedAttribution = replyAttributionUiModel;
        this.$userSession = abstractC3358CGz;
        this.$message = hatchMessageUiModel;
        this.$navigator = auraNavigator;
        this.$onScrollToMessage = g0u;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        String str;
        String str2;
        BBI bbiA0M;
        String previewText;
        String strA0f;
        Function0 function0;
        IdeaWidgetData ideaWidgetData;
        ReplyAttributionUiModel.Idea idea;
        ReplyAttributionUiModel.Idea idea2;
        IdeaWidgetData ideaWidgetData2;
        boolean z = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            ReplyAttributionUiModel replyAttributionUiModel = this.$resolvedAttribution;
            String strA01 = null;
            if (replyAttributionUiModel instanceof ReplyAttributionUiModel.Idea) {
                IdeaWidgetData ideaWidgetData3 = ((ReplyAttributionUiModel.Idea) replyAttributionUiModel).idea;
                str = ideaWidgetData3.previewImageUrl;
                if (ideaWidgetData3.iconUrl != null) {
                    str = null;
                }
            } else if (replyAttributionUiModel instanceof ReplyAttributionUiModel.Message) {
                str = ((ReplyAttributionUiModel.Message) replyAttributionUiModel).previewImagePath;
            } else {
                if (!(replyAttributionUiModel instanceof ReplyAttributionUiModel.FeedUnit) && !(replyAttributionUiModel instanceof ReplyAttributionUiModel.Goal) && !(replyAttributionUiModel instanceof ReplyAttributionUiModel.Product)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = null;
            }
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$userSession, bfm.A65(str));
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = WorkspaceUriResolver.INSTANCE.resolveThumbnailUrl(str, abstractC3358CGz, HatchThumbnailDisplaySize.MEDIUM);
                bfm.Ai0(objAaT);
            }
            String str3 = (String) objAaT;
            String str4 = this.$message.id;
            ReplyAttributionUiModel replyAttributionUiModel2 = this.$resolvedAttribution;
            if ((replyAttributionUiModel2 instanceof ReplyAttributionUiModel.Idea) && (idea2 = (ReplyAttributionUiModel.Idea) replyAttributionUiModel2) != null && (ideaWidgetData2 = idea2.idea) != null) {
                str2 = ideaWidgetData2.summary;
            } else {
                str2 = null;
            }
            if ((replyAttributionUiModel2 instanceof ReplyAttributionUiModel.Product) && C7BY.A0j(((ReplyAttributionUiModel.Product) replyAttributionUiModel2).getPreviewText())) {
                bfm.AgE(204503212);
                previewText = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205b5);
                bbiA0M = (BBI) bfm;
                BBI.A0R(bbiA0M, false);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, 204636264);
                previewText = this.$resolvedAttribution.getPreviewText();
            }
            ReplyAttributionUiModel replyAttributionUiModel3 = this.$resolvedAttribution;
            if (replyAttributionUiModel3 instanceof ReplyAttributionUiModel.Message) {
                bfm.AgE(283705242);
                BBI.A0R(bbiA0M, false);
                strA0f = ((ReplyAttributionUiModel.Message) this.$resolvedAttribution).label;
            } else if (replyAttributionUiModel3 instanceof ReplyAttributionUiModel.Product) {
                bfm.AgE(283709248);
                int i2 = ((ReplyAttributionUiModel.Product) this.$resolvedAttribution).labelResourceId;
                String strUnicodeWrap = BidiFormatter.getInstance().unicodeWrap(((ReplyAttributionUiModel.Product) this.$resolvedAttribution).agentName);
                C7384Etj.A0U(strUnicodeWrap);
                strA0f = AnonymousClass003.A0f(bfm, bbiA0M, strUnicodeWrap, i2);
            } else if (replyAttributionUiModel3 instanceof ReplyAttributionUiModel.FeedUnit) {
                bfm.AgE(283721530);
                BBI.A0R(bbiA0M, false);
                strA0f = ((ReplyAttributionUiModel.FeedUnit) this.$resolvedAttribution).label;
            } else if (replyAttributionUiModel3 instanceof ReplyAttributionUiModel.Goal) {
                bfm.AgE(283724570);
                BBI.A0R(bbiA0M, false);
                strA0f = ((ReplyAttributionUiModel.Goal) this.$resolvedAttribution).label;
            } else if (replyAttributionUiModel3 instanceof ReplyAttributionUiModel.Idea) {
                bfm.AgE(205601448);
                BBI.A0R(bbiA0M, false);
                strA0f = null;
            } else {
                throw AnonymousClass003.A0k(bfm, bbiA0M, 283702203);
            }
            ReplyAttributionUiModel replyAttributionUiModel4 = this.$resolvedAttribution;
            boolean z2 = replyAttributionUiModel4 instanceof ReplyAttributionUiModel.Idea;
            if (!z2) {
                if (!(replyAttributionUiModel4 instanceof ReplyAttributionUiModel.Message) && !(replyAttributionUiModel4 instanceof ReplyAttributionUiModel.Product) && !(replyAttributionUiModel4 instanceof ReplyAttributionUiModel.FeedUnit) && !(replyAttributionUiModel4 instanceof ReplyAttributionUiModel.Goal)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.$message.role != HatchMessageRole.USER) {
                    z = false;
                }
            }
            if (z2) {
                bfm.AgE(206379890);
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$navigator, bfm.A67(this.$resolvedAttribution));
                ReplyAttributionUiModel replyAttributionUiModel5 = this.$resolvedAttribution;
                AuraNavigator auraNavigator = this.$navigator;
                Object objAaT2 = bfm.AaT();
                if (zA1T || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchMessageItemKt$HatchMessageItem$8$1$sections$1$1$1$1(replyAttributionUiModel5, auraNavigator);
                    bfm.Ai0(objAaT2);
                }
                function0 = (Function0) objAaT2;
                BBI.A0R(bbiA0M, false);
            } else if (replyAttributionUiModel4 instanceof ReplyAttributionUiModel.Message) {
                bfm.AgE(207011732);
                String str5 = ((ReplyAttributionUiModel.Message) this.$resolvedAttribution).messageId;
                if (str5 == null) {
                    bfm.AgE(207011731);
                    BBI.A0R(bbiA0M, false);
                    function0 = null;
                } else {
                    bfm.AgE(207011732);
                    G0U<String, Unit> g0u = this.$onScrollToMessage;
                    boolean zA1K = AnonymousClass003.A1K(bfm, g0u, str5);
                    Object objAaT3 = bfm.AaT();
                    if (zA1K || objAaT3 == C78N.A00) {
                        objAaT3 = new HatchMessageItemKt$HatchMessageItem$8$1$sections$1$1$2$1$1(g0u, str5);
                        bfm.Ai0(objAaT3);
                    }
                    function0 = (Function0) objAaT3;
                    BBI.A0R(bbiA0M, false);
                }
                BBI.A0R(bbiA0M, false);
            } else if (replyAttributionUiModel4 instanceof ReplyAttributionUiModel.FeedUnit) {
                bfm.AgE(207241380);
                boolean zA1T2 = AnonymousClass001.A1T(bfm, this.$resolvedAttribution, bfm.A67(this.$navigator));
                AuraNavigator auraNavigator2 = this.$navigator;
                ReplyAttributionUiModel replyAttributionUiModel6 = this.$resolvedAttribution;
                Object objAaT4 = bfm.AaT();
                if (zA1T2 || objAaT4 == C78N.A00) {
                    objAaT4 = new HatchMessageItemKt$HatchMessageItem$8$1$sections$1$1$3$1(auraNavigator2, replyAttributionUiModel6);
                    bfm.Ai0(objAaT4);
                }
                function0 = (Function0) objAaT4;
                BBI.A0R(bbiA0M, false);
            } else if (replyAttributionUiModel4 instanceof ReplyAttributionUiModel.Goal) {
                bfm.AgE(207457760);
                boolean zA1T3 = AnonymousClass001.A1T(bfm, this.$resolvedAttribution, bfm.A67(this.$navigator));
                AuraNavigator auraNavigator3 = this.$navigator;
                ReplyAttributionUiModel replyAttributionUiModel7 = this.$resolvedAttribution;
                Object objAaT5 = bfm.AaT();
                if (zA1T3 || objAaT5 == C78N.A00) {
                    objAaT5 = new HatchMessageItemKt$HatchMessageItem$8$1$sections$1$1$4$1(auraNavigator3, replyAttributionUiModel7);
                    bfm.Ai0(objAaT5);
                }
                function0 = (Function0) objAaT5;
                BBI.A0R(bbiA0M, false);
            } else if (replyAttributionUiModel4 instanceof ReplyAttributionUiModel.Product) {
                bfm.AgE(208086502);
                String str6 = ((ReplyAttributionUiModel.Product) this.$resolvedAttribution).presentationEventId;
                if (str6 == null) {
                    bfm.AgE(208086501);
                    BBI.A0R(bbiA0M, false);
                    function0 = null;
                } else {
                    bfm.AgE(208086502);
                    G0U<String, Unit> g0u2 = this.$onScrollToMessage;
                    boolean zA1K2 = AnonymousClass003.A1K(bfm, g0u2, str6);
                    Object objAaT6 = bfm.AaT();
                    if (zA1K2 || objAaT6 == C78N.A00) {
                        objAaT6 = new HatchMessageItemKt$HatchMessageItem$8$1$sections$1$1$5$1$1(g0u2, str6);
                        bfm.Ai0(objAaT6);
                    }
                    function0 = (Function0) objAaT6;
                    BBI.A0R(bbiA0M, false);
                }
                BBI.A0R(bbiA0M, false);
            } else {
                throw AnonymousClass003.A0k(bfm, bbiA0M, 283750436);
            }
            ReplyAttributionUiModel replyAttributionUiModel8 = this.$resolvedAttribution;
            boolean z3 = replyAttributionUiModel8 instanceof ReplyAttributionUiModel.Idea;
            if (!z3 || (idea = (ReplyAttributionUiModel.Idea) replyAttributionUiModel8) == null || (ideaWidgetData = idea.idea) == null || ideaWidgetData.iconUrl == null) {
                ideaWidgetData = null;
            }
            if (!z3 && !(replyAttributionUiModel8 instanceof ReplyAttributionUiModel.Product) && !(replyAttributionUiModel8 instanceof ReplyAttributionUiModel.FeedUnit) && !(replyAttributionUiModel8 instanceof ReplyAttributionUiModel.Goal)) {
                if (replyAttributionUiModel8 instanceof ReplyAttributionUiModel.Message) {
                    bfm.AgE(283851081);
                    strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205b0);
                } else {
                    throw AnonymousClass003.A0k(bfm, bbiA0M, 283838064);
                }
            } else {
                bfm.AgE(209330376);
            }
            BBI.A0R(bbiA0M, false);
            BS0 bs0 = BRg.A00;
            Object objAaT7 = bfm.AaT();
            if (objAaT7 == C78N.A00) {
                objAaT7 = HatchMessageItemKt$HatchMessageItem$8$1$sections$1$1$7$1.INSTANCE;
                bfm.Ai0(objAaT7);
            }
            HatchMessageItemKt.ReplyContextHeader(previewText, strA0f, z, C3UC.A00(bs0, (G0W) objAaT7), function0, str3, strA01, str4, str2, ideaWidgetData, bfm, IdeaWidgetData.$stable << 27, 0);
            return;
        }
        bfm.Afo();
    }
}
