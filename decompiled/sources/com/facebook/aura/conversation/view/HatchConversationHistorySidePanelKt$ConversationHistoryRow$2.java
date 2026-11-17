package com.facebook.aura.conversation.view;

import X.AaC;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C3TQ;
import X.G0U;
import X.G0V;
import com.facebook.aura.conversation.repo.ThreadsView;
import com.facebook.aura.gateway.HatchSessionItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$ConversationHistoryRow$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $accountUsername;
    public final /* synthetic */ C3TQ $contentPadding;
    public final /* synthetic */ boolean $isSelected;
    public final /* synthetic */ float $minHeight;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ G0U<AaC, Unit> $onLongPress;
    public final /* synthetic */ G0U<AaC, Unit> $onMoreClick;
    public final /* synthetic */ HatchSessionItem $session;
    public final /* synthetic */ boolean $useFigmaStyle;
    public final /* synthetic */ ThreadsView $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationHistorySidePanelKt$ConversationHistoryRow$2(ThreadsView threadsView, HatchSessionItem hatchSessionItem, String str, C3TQ c3tq, Function0<Unit> function0, G0U<? super AaC, Unit> g0u, G0U<? super AaC, Unit> g0u2, boolean z, BRg bRg, boolean z2, float f, int i, int i2, int i3) {
        super(2);
        this.$view = threadsView;
        this.$session = hatchSessionItem;
        this.$accountUsername = str;
        this.$contentPadding = c3tq;
        this.$onClick = function0;
        this.$onLongPress = g0u;
        this.$onMoreClick = g0u2;
        this.$isSelected = z;
        this.$modifier = bRg;
        this.$useFigmaStyle = z2;
        this.$minHeight = f;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchConversationHistorySidePanelKt.m550ConversationHistoryRowyKJFJhA(this.$view, this.$session, this.$accountUsername, this.$contentPadding, this.$onClick, this.$onLongPress, this.$onMoreClick, this.$isSelected, this.$modifier, this.$useFigmaStyle, this.$minHeight, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
