package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ActivationBugReportScreenKey;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConfidentialVmOverflowMenuKt$ConfidentialVmOverflowMenu$1$2$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ MutableState<Boolean> $isMenuExpanded$delegate;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onLogOutClick;
    public final /* synthetic */ Function0<Unit> $onReportIssueClick;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        C7384Etj.A0Y(auraContextMenuItem, 0);
        MutableState.A09(false, this.$isMenuExpanded$delegate);
        int i = auraContextMenuItem.id;
        if (i == 0) {
            this.$onReportIssueClick.invoke();
            this.$navigator.navigate((AuraNavKey) new ActivationBugReportScreenKey(AnonymousClass002.A0k(), null, null), false);
        } else if (i == 1) {
            this.$onLogOutClick.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmOverflowMenuKt$ConfidentialVmOverflowMenu$1$2$1(Function0<Unit> function0, AuraNavigator auraNavigator, Function0<Unit> function02, MutableState<Boolean> mutableState) {
        super(1);
        this.$onReportIssueClick = function0;
        this.$navigator = auraNavigator;
        this.$onLogOutClick = function02;
        this.$isMenuExpanded$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
