package com.facebook.aura.conversation.view;

import X.AHD;
import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1D3;
import X.C3Ue;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.ui.Alignment;
import com.facebook.aura.conversation.view.InlineWidgetRenderItem;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.model.HatchSendMessage;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.navigation.AuraNavigator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationWidgetsKt$InlineWidgets$3 extends AbstractC7559F3s implements G0W<Integer, BFM, Integer, Unit> {
    public final /* synthetic */ long $containerBackgroundColor;
    public final /* synthetic */ C1D3 $containerShape;
    public final /* synthetic */ boolean $inBubble;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onFocusComposer;
    public final /* synthetic */ G0U<String, Integer> $onGetWidgetHeight;
    public final /* synthetic */ G0V<String, Integer, Unit> $onSetWidgetHeight;
    public final /* synthetic */ G0U<HatchSendMessage, Unit> $onWidgetSendMessage;
    public final /* synthetic */ G0W<String, String, String, Unit> $onWidgetSetState;
    public final /* synthetic */ List<InlineWidgetRenderItem> $renderItems;
    public final /* synthetic */ Alignment $widgetAlignment;
    public final /* synthetic */ BRg $widgetWidthModifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationWidgetsKt$InlineWidgets$3(Alignment alignment, List<? extends InlineWidgetRenderItem> list, AuraNavigator auraNavigator, long j, C1D3 c1d3, HatchMessageUiModel hatchMessageUiModel, BRg bRg, G0U<? super HatchSendMessage, Unit> g0u, G0W<? super String, ? super String, ? super String, Unit> g0w, Function0<Unit> function0, G0U<? super String, Integer> g0u2, G0V<? super String, ? super Integer, Unit> g0v, boolean z) {
        super(3);
        this.$widgetAlignment = alignment;
        this.$renderItems = list;
        this.$navigator = auraNavigator;
        this.$containerBackgroundColor = j;
        this.$containerShape = c1d3;
        this.$message = hatchMessageUiModel;
        this.$widgetWidthModifier = bRg;
        this.$onWidgetSendMessage = g0u;
        this.$onWidgetSetState = g0w;
        this.$onFocusComposer = function0;
        this.$onGetWidgetHeight = g0u2;
        this.$onSetWidgetHeight = g0v;
        this.$inBubble = z;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, BFM bfm, Integer num2) {
        invoke(AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
        return Unit.INSTANCE;
    }

    public final void invoke(int i, BFM bfm, int i2) {
        int iA0D = i2;
        if ((i2 & 6) == 0) {
            iA0D = i2 | AnonymousClass004.A0D(bfm, i);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0D), bfm, iA0D)) {
            C1062ATq c1062ATq = C10G.A02;
            Alignment alignment = this.$widgetAlignment;
            List<InlineWidgetRenderItem> list = this.$renderItems;
            AuraNavigator auraNavigator = this.$navigator;
            long j = this.$containerBackgroundColor;
            C1D3 c1d3 = this.$containerShape;
            HatchMessageUiModel hatchMessageUiModel = this.$message;
            BRg bRg = this.$widgetWidthModifier;
            G0U<HatchSendMessage, Unit> g0u = this.$onWidgetSendMessage;
            G0W<String, String, String, Unit> g0w = this.$onWidgetSetState;
            Function0<Unit> function0 = this.$onFocusComposer;
            G0U<String, Integer> g0u2 = this.$onGetWidgetHeight;
            G0V<String, Integer, Unit> g0v = this.$onSetWidgetHeight;
            boolean z = this.$inBubble;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, c1062ATq);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
            InlineWidgetRenderItem inlineWidgetRenderItem = list.get(i);
            if (inlineWidgetRenderItem instanceof InlineWidgetRenderItem.IdeaGroup) {
                bfm.AgE(32167335);
                AHD<HatchIdeaCardRow> ahd = ((InlineWidgetRenderItem.IdeaGroup) inlineWidgetRenderItem).rows;
                boolean zA67 = bfm.A67(auraNavigator);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchConversationWidgetsKt$InlineWidgets$3$1$1$1(auraNavigator);
                    bfm.Ai0(objAaT);
                }
                G0U g0u3 = (G0U) objAaT;
                boolean zA672 = bfm.A67(auraNavigator);
                Object objAaT2 = bfm.AaT();
                if (zA672 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchConversationWidgetsKt$InlineWidgets$3$1$2$1(auraNavigator);
                    bfm.Ai0(objAaT2);
                }
                G0U g0u4 = (G0U) objAaT2;
                C1D3 c1d32 = null;
                if (!z) {
                    c1d32 = c1d3;
                }
                HatchIdeaRowCardKt.m607HatchIdeaRowCardFHprtrg(ahd, g0u3, g0u4, null, j, c1d32, bfm, 0, 8);
            } else if (inlineWidgetRenderItem instanceof InlineWidgetRenderItem.Single) {
                bfm.AgE(997789872);
                HatchWidget hatchWidget = ((InlineWidgetRenderItem.Single) inlineWidgetRenderItem).widget;
                String str = hatchMessageUiModel.id;
                HatchConversationWidgetsKt.m575HatchWidgetNjCylvU(hatchWidget, bRg, str, str, null, null, g0u, g0w, function0, g0u2, g0v, j, c1d3, hatchMessageUiModel.isStreaming, z, null, bfm, HatchWidget.$stable, 0, 32816);
            } else {
                throw AnonymousClass003.A0k(bfm, bbi, 32165047);
            }
            AnonymousClass003.A0q(bbi);
            return;
        }
        bfm.Afo();
    }
}
