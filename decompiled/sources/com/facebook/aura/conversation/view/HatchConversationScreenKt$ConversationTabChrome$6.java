package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.C1DG;
import X.G0U;
import X.G0V;
import X.G2j;
import com.facebook.aura.header.api.HeaderAction;
import com.facebook.aura.header.view.HeaderButton;
import com.facebook.aura.header.view.HeaderLeadingButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationScreenKt$ConversationTabChrome$6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ HeaderButton $badgedHeaderButton;
    public final /* synthetic */ G2j<C1DG, C1DG, BFM, Integer, Unit> $content;
    public final /* synthetic */ AHD<HeaderAction> $headerActions;
    public final /* synthetic */ AHD<HeaderButton> $headerButtons;
    public final /* synthetic */ boolean $isTitleCompact;
    public final /* synthetic */ HeaderLeadingButton $leadingButton;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<HeaderButton, Unit> $onHeaderButtonClick;
    public final /* synthetic */ G0U<HeaderLeadingButton, Unit> $onLeadingButtonClick;
    public final /* synthetic */ Function0<Unit> $onTabReselected;
    public final /* synthetic */ B6A $scrimColor;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ String $subtitle;
    public final /* synthetic */ String $title;
    public final /* synthetic */ float $titleAlpha;
    public final /* synthetic */ BRg $titleModifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationScreenKt$ConversationTabChrome$6(String str, BRg bRg, B6A b6a, String str2, BRg bRg2, float f, boolean z, String str3, AHD<? extends HeaderButton> ahd, HeaderButton headerButton, HeaderLeadingButton headerLeadingButton, Function0<Unit> function0, G0U<? super HeaderLeadingButton, Unit> g0u, G0U<? super HeaderButton, Unit> g0u2, AHD<HeaderAction> ahd2, G2j<? super C1DG, ? super C1DG, ? super BFM, ? super Integer, Unit> g2j, int i, int i2, int i3) {
        super(2);
        this.$sessionId = str;
        this.$modifier = bRg;
        this.$scrimColor = b6a;
        this.$title = str2;
        this.$titleModifier = bRg2;
        this.$titleAlpha = f;
        this.$isTitleCompact = z;
        this.$subtitle = str3;
        this.$headerButtons = ahd;
        this.$badgedHeaderButton = headerButton;
        this.$leadingButton = headerLeadingButton;
        this.$onTabReselected = function0;
        this.$onLeadingButtonClick = g0u;
        this.$onHeaderButtonClick = g0u2;
        this.$headerActions = ahd2;
        this.$content = g2j;
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
        HatchConversationScreenKt.m567ConversationTabChromemgnxx2k(this.$sessionId, this.$modifier, this.$scrimColor, this.$title, this.$titleModifier, this.$titleAlpha, this.$isTitleCompact, this.$subtitle, this.$headerButtons, this.$badgedHeaderButton, this.$leadingButton, this.$onTabReselected, this.$onLeadingButtonClick, this.$onHeaderButtonClick, this.$headerActions, this.$content, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
