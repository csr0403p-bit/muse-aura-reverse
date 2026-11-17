package com.facebook.aura.conversation.view;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.uicontrol.UiAction;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchNavigationWidgetKt$NavigationWidgetCardContent$2$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ UiAction $action;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNavigationWidgetKt$NavigationWidgetCardContent$2$3(UiAction uiAction) {
        super(2);
        this.$action = uiAction;
    }

    public final void invoke(BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            bfm.Afo();
            return;
        }
        UiAction uiAction = this.$action;
        if ((uiAction instanceof UiAction.NavigateScheduledTask) || C7384Etj.areEqual(uiAction, UiAction.NavigateScheduledTasks.INSTANCE)) {
            bfm.AgE(1109910304);
            HatchInternalLinkActionCardKt.InternalLinkCardSubtitleText(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120876), null, bfm, 0, 2);
        } else {
            bfm.AgE(1110070791);
        }
        AnonymousClass001.A1D(bfm);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
