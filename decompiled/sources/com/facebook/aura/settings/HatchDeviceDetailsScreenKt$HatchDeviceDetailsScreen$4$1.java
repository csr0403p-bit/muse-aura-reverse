package com.facebook.aura.settings;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HtJ;
import com.facebook.aura.nodes.json.NodeListEntry;
import com.facebook.aura.settings.ConnectedDevicesUiState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.settings.HatchDeviceDetailsScreenKt$HatchDeviceDetailsScreen$4$1", f = "HatchDeviceDetailsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchDeviceDetailsScreenKt$HatchDeviceDetailsScreen$4$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ NodeListEntry $device;
    public final /* synthetic */ boolean $isCurrentDevice;
    public final /* synthetic */ ConnectedDevicesUiState.Loaded $loadedState;
    public final /* synthetic */ String $nodeId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDeviceDetailsScreenKt$HatchDeviceDetailsScreen$4$1(String str, ConnectedDevicesUiState.Loaded loaded, boolean z, NodeListEntry nodeListEntry, HtJ<? super HatchDeviceDetailsScreenKt$HatchDeviceDetailsScreen$4$1> htJ) {
        super(2, htJ);
        this.$nodeId = str;
        this.$loadedState = loaded;
        this.$isCurrentDevice = z;
        this.$device = nodeListEntry;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchDeviceDetailsScreenKt$HatchDeviceDetailsScreen$4$1(this.$nodeId, this.$loadedState, this.$isCurrentDevice, this.$device, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0061 A[PHI: r4
  0x0061: PHI (r4v1 boolean) = (r4v0 boolean), (r4v3 boolean) binds: [B:8:0x0011, B:10:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            if (r0 != 0) goto L65
            X.Hwg.A00(r9)
            java.lang.String r7 = r8.$nodeId
            com.facebook.aura.settings.ConnectedDevicesUiState$Loaded r0 = r8.$loadedState
            if (r0 == 0) goto L63
            java.lang.String r6 = r0.localNodeId
        Lf:
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L61
            r4 = 1
            java.util.List<com.facebook.aura.nodes.json.NodeListEntry> r0 = r0.devices
            if (r0 == 0) goto L61
            int r3 = r0.size()
        L1c:
            boolean r2 = r8.$isCurrentDevice
            com.facebook.aura.nodes.json.NodeListEntry r0 = r8.$device
            if (r0 != 0) goto L23
            r5 = 0
        L23:
            java.lang.String r0 = "render nodeId="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r7)
            java.lang.String r0 = " localNodeId="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " loaded="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " deviceCount="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " isCurrentDevice="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " deviceFound="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "HatchDeviceDetails"
            X.CFK.A05(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L61:
            r3 = 0
            goto L1c
        L63:
            r6 = 0
            goto Lf
        L65:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchDeviceDetailsScreenKt$HatchDeviceDetailsScreen$4$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchDeviceDetailsScreenKt$HatchDeviceDetailsScreen$4$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
