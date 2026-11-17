package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchHelpSupportSettingsScreenKt$HelpCenterCard$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $helpCenterTitle;
    public final /* synthetic */ G0V<String, String, Unit> $onOpenHelpCenter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchHelpSupportSettingsScreenKt$HelpCenterCard$1$1(G0V<? super String, ? super String, Unit> g0v, String str) {
        super(0);
        this.$onOpenHelpCenter = g0v;
        this.$helpCenterTitle = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchHelpSupportSettingsScreenKt.logHelpSupportClick(HatchComponent.HELP_CENTER_BUTTON);
        G0V<String, String, Unit> g0v = this.$onOpenHelpCenter;
        String string = AuraExternalUriRegistry.INSTANCE.getHelpCenterUri().uri.toString();
        C7384Etj.A0U(string);
        g0v.invoke(string, this.$helpCenterTitle);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
