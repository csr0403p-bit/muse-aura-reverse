package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C20Q;
import X.G0U;
import X.G0V;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.model.HatchMessageChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationContentKt$HatchConversationContent$9 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$changed2;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ HatchMessageChannel $channel;
    public final /* synthetic */ String $composerHintText;
    public final /* synthetic */ BRg $composerModifier;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $emptyContent;
    public final /* synthetic */ HighlightRequest $highlightRequest;
    public final /* synthetic */ boolean $isArchived;
    public final /* synthetic */ boolean $isMainTab;
    public final /* synthetic */ boolean $isReadOnly;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<String, Unit> $onArtifactVisible;
    public final /* synthetic */ Function0<Unit> $onClearHighlightedMessageIndex;
    public final /* synthetic */ Function0<Unit> $onDeeplinkConsumed;
    public final /* synthetic */ Function0<Unit> $onFirstChatViewFinished;
    public final /* synthetic */ Function0<Unit> $onFirstConversationContentDrawn;
    public final /* synthetic */ Function0<Unit> $onHighlightConsumed;
    public final /* synthetic */ G0U<String, Unit> $onMediaDeleted;
    public final /* synthetic */ Function0<Unit> $onMicPermissionDenied;
    public final /* synthetic */ G0U<G0U<? super String, Unit>, Unit> $onProvideScrollToMessage;
    public final /* synthetic */ G0U<String, Unit> $onRichFormatOpenCTAClick;
    public final /* synthetic */ Function0<Unit> $onViewFinished;
    public final /* synthetic */ C20Q<Unit> $tabReselectedFlow;
    public final /* synthetic */ float $topPadding;
    public final /* synthetic */ HatchConversationViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationContentKt$HatchConversationContent$9(HatchConversationViewModel hatchConversationViewModel, float f, float f2, BRg bRg, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, Function0<Unit> function0, HighlightRequest highlightRequest, Function0<Unit> function02, Function0<Unit> function03, G0U<? super G0U<? super String, Unit>, Unit> g0u4, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Function0<Unit> function07, BRg bRg2, String str, G0V<? super BFM, ? super Integer, Unit> g0v, boolean z, boolean z2, HatchMessageChannel hatchMessageChannel, boolean z3, C20Q<Unit> c20q, int i, int i2, int i3, int i4) {
        super(2);
        this.$viewModel = hatchConversationViewModel;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$modifier = bRg;
        this.$onRichFormatOpenCTAClick = g0u;
        this.$onArtifactVisible = g0u2;
        this.$onMediaDeleted = g0u3;
        this.$onMicPermissionDenied = function0;
        this.$highlightRequest = highlightRequest;
        this.$onDeeplinkConsumed = function02;
        this.$onHighlightConsumed = function03;
        this.$onProvideScrollToMessage = g0u4;
        this.$onClearHighlightedMessageIndex = function04;
        this.$onViewFinished = function05;
        this.$onFirstChatViewFinished = function06;
        this.$onFirstConversationContentDrawn = function07;
        this.$composerModifier = bRg2;
        this.$composerHintText = str;
        this.$emptyContent = g0v;
        this.$isMainTab = z;
        this.$isArchived = z2;
        this.$channel = hatchMessageChannel;
        this.$isReadOnly = z3;
        this.$tabReselectedFlow = c20q;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$changed2 = i3;
        this.$$default = i4;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchConversationContentKt.m546HatchConversationContent4y9YqzQ(this.$viewModel, this.$topPadding, this.$bottomPadding, this.$modifier, this.$onRichFormatOpenCTAClick, this.$onArtifactVisible, this.$onMediaDeleted, this.$onMicPermissionDenied, this.$highlightRequest, this.$onDeeplinkConsumed, this.$onHighlightConsumed, this.$onProvideScrollToMessage, this.$onClearHighlightedMessageIndex, this.$onViewFinished, this.$onFirstChatViewFinished, this.$onFirstConversationContentDrawn, this.$composerModifier, this.$composerHintText, this.$emptyContent, this.$isMainTab, this.$isArchived, this.$channel, this.$isReadOnly, this.$tabReselectedFlow, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), this.$$default);
    }
}
