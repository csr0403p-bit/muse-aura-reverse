package com.facebook.aura.vmdisabled.content;

import X.AbstractC7559F3s;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.toast.api.ToastApi;
import com.facebook.aura.vmdisabled.VmReconnectViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class VmRecoverySheetsKt$VmRecoveryReconnectSheet$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ boolean $preview;
    public final /* synthetic */ VmReconnectViewModel $reconnectViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VmRecoverySheetsKt$VmRecoveryReconnectSheet$2$1$1(boolean z, AuraNavigator auraNavigator, VmReconnectViewModel vmReconnectViewModel) {
        super(0);
        this.$preview = z;
        this.$navigator = auraNavigator;
        this.$reconnectViewModel = vmReconnectViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (!this.$preview) {
            this.$reconnectViewModel.onReconnect();
        } else {
            ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f12112c);
            this.$navigator.back();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
