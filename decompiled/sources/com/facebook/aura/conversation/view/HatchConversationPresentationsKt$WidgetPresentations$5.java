package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.C1D3;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.model.HatchSendMessage;
import com.facebook.aura.model.HatchWidgetPresentation;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationPresentationsKt$WidgetPresentations$5 extends AbstractC7559F3s implements G0W<Integer, BFM, Integer, Unit> {
    public final /* synthetic */ boolean $allowLiveEntry;
    public final /* synthetic */ float $bubbleCornerRadius;
    public final /* synthetic */ long $containerBackgroundColor;
    public final /* synthetic */ PresentationEntryTracker $entryTracker;
    public final /* synthetic */ boolean $hasBlockAbove;
    public final /* synthetic */ InlineContentCallbacks $inlineContentCallbacks;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ Function0<Unit> $onFocusComposer;
    public final /* synthetic */ G0U<String, Integer> $onGetWidgetHeight;
    public final /* synthetic */ G0V<String, Integer, Unit> $onSetWidgetHeight;
    public final /* synthetic */ G0U<HatchSendMessage, Unit> $onWidgetSendMessage;
    public final /* synthetic */ G0W<String, String, String, Unit> $onWidgetSetState;
    public final /* synthetic */ List<HatchWidgetPresentation> $presentations;
    public final /* synthetic */ String $sideChatSessionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationPresentationsKt$WidgetPresentations$5(List<HatchWidgetPresentation> list, PresentationEntryTracker presentationEntryTracker, HatchMessageUiModel hatchMessageUiModel, boolean z, float f, String str, G0U<? super HatchSendMessage, Unit> g0u, G0W<? super String, ? super String, ? super String, Unit> g0w, Function0<Unit> function0, G0U<? super String, Integer> g0u2, G0V<? super String, ? super Integer, Unit> g0v, long j, InlineContentCallbacks inlineContentCallbacks, boolean z2) {
        super(3);
        this.$presentations = list;
        this.$entryTracker = presentationEntryTracker;
        this.$message = hatchMessageUiModel;
        this.$hasBlockAbove = z;
        this.$bubbleCornerRadius = f;
        this.$sideChatSessionId = str;
        this.$onWidgetSendMessage = g0u;
        this.$onWidgetSetState = g0w;
        this.$onFocusComposer = function0;
        this.$onGetWidgetHeight = g0u2;
        this.$onSetWidgetHeight = g0v;
        this.$containerBackgroundColor = j;
        this.$inlineContentCallbacks = inlineContentCallbacks;
        this.$allowLiveEntry = z2;
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
        boolean z = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 19, 18), bfm, iA0D)) {
            HatchWidgetPresentation hatchWidgetPresentation = this.$presentations.get(i);
            boolean zA65 = bfm.A65(hatchWidgetPresentation.presentationId);
            boolean z2 = this.$allowLiveEntry;
            PresentationEntryTracker presentationEntryTracker = this.$entryTracker;
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                if (!z2 || presentationEntryTracker == null || !presentationEntryTracker.shouldAnimate(hatchWidgetPresentation.presentationId)) {
                    z = false;
                }
                objAaT = AnonymousClass001.A0j(bfm, z);
            }
            boolean zA1X = AnonymousClass001.A1X(objAaT);
            String str = hatchWidgetPresentation.presentationId;
            boolean zA1M = AnonymousClass003.A1M(bfm, this.$entryTracker, hatchWidgetPresentation);
            PresentationEntryTracker presentationEntryTracker2 = this.$entryTracker;
            Object objAaT2 = bfm.AaT();
            if (zA1M || objAaT2 == C78N.A00) {
                objAaT2 = new HatchConversationPresentationsKt$WidgetPresentations$5$1$1(presentationEntryTracker2, hatchWidgetPresentation);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, str);
            String str2 = hatchWidgetPresentation.hostMessageId;
            if (str2 == null) {
                str2 = this.$message.id;
            }
            HatchMessageUiModel hatchMessageUiModel = this.$message;
            C1D3 c1d3M565presentationShapeJTrpX9M = HatchConversationPresentationsKt.m565presentationShapeJTrpX9M(hatchMessageUiModel.role, hatchMessageUiModel.groupPosition, i, this.$presentations.size(), this.$hasBlockAbove, this.$bubbleCornerRadius);
            BRg bRgPresentationEntryAnimation = HatchMessageEntryAnimationsKt.presentationEntryAnimation(BRg.A00, hatchWidgetPresentation.presentationId, zA1X, bfm, 6);
            HatchConversationPresentationsKt.m562HatchPresentation9EmdrwA(hatchWidgetPresentation, this.$sideChatSessionId, str2, this.$message.id, this.$onWidgetSendMessage, this.$onWidgetSetState, this.$onFocusComposer, this.$onGetWidgetHeight, this.$onSetWidgetHeight, this.$containerBackgroundColor, c1d3M565presentationShapeJTrpX9M, this.$inlineContentCallbacks, bRgPresentationEntryAnimation, bfm, HatchWidgetPresentation.$stable, InlineContentCallbacks.$stable << 3, 0);
            return;
        }
        bfm.Afo();
    }
}
