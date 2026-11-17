package com.facebook.aura.commands.core;

import X.AbstractC7559F3s;
import X.BRg;
import X.BS0;
import X.C7384Etj;
import X.CFK;
import X.FGI;
import X.G0U;
import android.content.Intent;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupStyleByScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class NodePermissionActivity$onCreate$3$1$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupStyleByScope, Unit> {
    public final /* synthetic */ String $allowText;
    public final /* synthetic */ String $notNowText;
    public final /* synthetic */ Intent $settingsIntent;
    public final /* synthetic */ NodePermissionActivity this$0;

    /* renamed from: com.facebook.aura.commands.core.NodePermissionActivity$onCreate$3$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Intent $settingsIntent;
        public final /* synthetic */ NodePermissionActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NodePermissionActivity nodePermissionActivity, Intent intent) {
            super(0);
            this.this$0 = nodePermissionActivity;
            this.$settingsIntent = intent;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            NodePermissionActivity nodePermissionActivity = this.this$0;
            int i = NodePermissionActivity.$stable;
            MutableState.A09(false, nodePermissionActivity.showSettingsDialog);
            try {
                NodePermissionActivity nodePermissionActivity2 = this.this$0;
                nodePermissionActivity2.waitingForSettings = true;
                nodePermissionActivity2.settingsLauncher.A01(null, this.$settingsIntent);
            } catch (Exception e) {
                CFK.A04(NodePermissionActivityKt.TAG, FGI.A0M("Failed to launch settings: ", e.getMessage()));
                this.this$0.deliverResult(false);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.commands.core.NodePermissionActivity$onCreate$3$1$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ NodePermissionActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(NodePermissionActivity nodePermissionActivity) {
            super(0);
            this.this$0 = nodePermissionActivity;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.deliverResult(false);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupStyleByScope auraButtonGroupStyleByScope) {
        C7384Etj.A0Y(auraButtonGroupStyleByScope, 0);
        String str = this.$allowText;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$settingsIntent);
        BS0 bs0 = BRg.A00;
        int i = AuraHaptics.BUTTON_TAP;
        auraButtonGroupStyleByScope.mo2449buttonLKWACpY(str, null, null, true, false, null, anonymousClass1, null, bs0, i);
        auraButtonGroupStyleByScope.mo2449buttonLKWACpY(this.$notNowText, null, null, true, false, null, new AnonymousClass2(this.this$0), null, bs0, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodePermissionActivity$onCreate$3$1$1$1(String str, String str2, NodePermissionActivity nodePermissionActivity, Intent intent) {
        super(1);
        this.$allowText = str;
        this.$notNowText = str2;
        this.this$0 = nodePermissionActivity;
        this.$settingsIntent = intent;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupStyleByScope auraButtonGroupStyleByScope) {
        invoke2(auraButtonGroupStyleByScope);
        return Unit.INSTANCE;
    }
}
