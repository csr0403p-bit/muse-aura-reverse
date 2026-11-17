package com.facebook.aura.main;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G2k;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConversationScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSidePanelHostKt$ConversationHistoryPanel$3$1 extends AbstractC7559F3s implements G2k<String, String, Boolean, String, Long, Unit> {
    public final /* synthetic */ Function0<Unit> $closePanel;
    public final /* synthetic */ AuraNavigator $navigator;

    public final void invoke(String str, String str2, boolean z, String str3, Long l) {
        C7384Etj.A0Y(str, 0);
        this.$closePanel.invoke();
        HatchSidePanelHostKt.openChatFromSidePanel(this.$navigator, new ConversationScreenKey(str, str2, z, str3, l, false));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSidePanelHostKt$ConversationHistoryPanel$3$1(Function0<Unit> function0, AuraNavigator auraNavigator) {
        super(5);
        this.$closePanel = function0;
        this.$navigator = auraNavigator;
    }

    @Override // X.G2k
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, Boolean bool, String str3, Long l) {
        invoke(str, str2, AnonymousClass001.A1X(bool), str3, l);
        return Unit.INSTANCE;
    }
}
