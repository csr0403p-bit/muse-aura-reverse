package com.facebook.aura.settings;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.app.Application;
import com.facebook.aura.devices.intf.LinkDeviceTokenRevokeOutcome;
import com.facebook.aura.devices.intf.NodeRemovalHandler;
import com.facebook.aura.nodes.json.NodeListEntry;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.settings.HatchConnectedDevicesViewModel$unpairDevice$2$1", f = "HatchConnectedDevicesViewModel.kt", l = {526}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConnectedDevicesViewModel$unpairDevice$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ NodeListEntry $device;
    public final /* synthetic */ NodeRemovalHandler $handler;
    public final /* synthetic */ LinkDeviceTokenRevokeOutcome $revoke;
    public final /* synthetic */ boolean $unpairSuccessful;
    public int label;
    public final /* synthetic */ HatchConnectedDevicesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectedDevicesViewModel$unpairDevice$2$1(NodeRemovalHandler nodeRemovalHandler, HatchConnectedDevicesViewModel hatchConnectedDevicesViewModel, NodeListEntry nodeListEntry, LinkDeviceTokenRevokeOutcome linkDeviceTokenRevokeOutcome, boolean z, HtJ<? super HatchConnectedDevicesViewModel$unpairDevice$2$1> htJ) {
        super(2, htJ);
        this.$handler = nodeRemovalHandler;
        this.this$0 = hatchConnectedDevicesViewModel;
        this.$device = nodeListEntry;
        this.$revoke = linkDeviceTokenRevokeOutcome;
        this.$unpairSuccessful = z;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConnectedDevicesViewModel$unpairDevice$2$1(this.$handler, this.this$0, this.$device, this.$revoke, this.$unpairSuccessful, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            NodeRemovalHandler nodeRemovalHandler = this.$handler;
            HatchConnectedDevicesViewModel hatchConnectedDevicesViewModel = this.this$0;
            Application application = hatchConnectedDevicesViewModel.application;
            AbstractC3358CGz abstractC3358CGz = hatchConnectedDevicesViewModel.userSession;
            String str = this.$device.nodeId;
            LinkDeviceTokenRevokeOutcome linkDeviceTokenRevokeOutcome = this.$revoke;
            boolean z = this.$unpairSuccessful;
            this.label = 1;
            if (nodeRemovalHandler.onNodeRemovalFinished(application, abstractC3358CGz, str, linkDeviceTokenRevokeOutcome, z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchConnectedDevicesViewModel$unpairDevice$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
