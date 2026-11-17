package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0V;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.agentpermission.LocalDeviceConnector;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchSkillDetailScreenKt$LocalDeviceConnectorDetailContent$1$1$1$1 extends AbstractC7559F3s implements G0V<String, String, Unit> {
    public final /* synthetic */ Function0<Unit> $dismissMenu;
    public final /* synthetic */ LocalDeviceConnector $localConnector;
    public final /* synthetic */ MutableState<String> $menuGroupKey$delegate;
    public final /* synthetic */ MutableState<String> $menuMethodKey$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        if (str.equals(this.$menuGroupKey$delegate.getValue()) && C7384Etj.areEqual(this.$menuMethodKey$delegate.getValue(), str2)) {
            this.$dismissMenu.invoke();
            return;
        }
        ConnectorSettingsAnalytics.INSTANCE.logDeviceMenuClick(this.$localConnector.connectorId, str2);
        this.$menuGroupKey$delegate.Af8(str);
        this.$menuMethodKey$delegate.Af8(str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSkillDetailScreenKt$LocalDeviceConnectorDetailContent$1$1$1$1(Function0<Unit> function0, LocalDeviceConnector localDeviceConnector, MutableState<String> mutableState, MutableState<String> mutableState2) {
        super(2);
        this.$dismissMenu = function0;
        this.$localConnector = localDeviceConnector;
        this.$menuGroupKey$delegate = mutableState;
        this.$menuMethodKey$delegate = mutableState2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.INSTANCE;
    }
}
