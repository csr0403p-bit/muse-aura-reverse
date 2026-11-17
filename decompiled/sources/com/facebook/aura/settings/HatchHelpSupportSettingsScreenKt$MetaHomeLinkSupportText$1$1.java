package com.facebook.aura.settings;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.ApQ;
import X.C1733ApU;
import X.C1OR;
import X.G0U;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchComponent;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchHelpSupportSettingsScreenKt$MetaHomeLinkSupportText$1$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ ApQ $annotatedSupportText;
    public final /* synthetic */ String $contactUsText;
    public final /* synthetic */ G0V<String, String, Unit> $onOpenHelpCenter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchHelpSupportSettingsScreenKt$MetaHomeLinkSupportText$1$1(ApQ apQ, G0V<? super String, ? super String, Unit> g0v, String str) {
        super(1);
        this.$annotatedSupportText = apQ;
        this.$onOpenHelpCenter = g0v;
        this.$contactUsText = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(int i) {
        C1733ApU c1733ApU = (C1733ApU) AbstractC0878AGe.A0G(this.$annotatedSupportText.A04(i, i));
        if (c1733ApU != null) {
            G0V<String, String, Unit> g0v = this.$onOpenHelpCenter;
            String str = this.$contactUsText;
            HatchHelpSupportSettingsScreenKt.logHelpSupportClick(HatchComponent.GET_HELP_BUTTON);
            g0v.invoke(((C1OR) c1733ApU.A02).A00, str);
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
