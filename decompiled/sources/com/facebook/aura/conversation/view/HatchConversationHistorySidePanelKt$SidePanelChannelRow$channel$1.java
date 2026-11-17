package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.gateway.HatchSessionItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$SidePanelChannelRow$channel$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $accountUsername;
    public final /* synthetic */ boolean $isSelected;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ HatchSessionItem $session;
    public final /* synthetic */ boolean $useFigmaStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationHistorySidePanelKt$SidePanelChannelRow$channel$1(HatchSessionItem hatchSessionItem, String str, boolean z, Function0<Unit> function0, boolean z2, BRg bRg, int i, int i2) {
        super(2);
        this.$session = hatchSessionItem;
        this.$accountUsername = str;
        this.$isSelected = z;
        this.$onClick = function0;
        this.$useFigmaStyle = z2;
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
        HatchConversationHistorySidePanelKt.SidePanelChannelRow(this.$session, this.$accountUsername, this.$isSelected, this.$onClick, this.$useFigmaStyle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
