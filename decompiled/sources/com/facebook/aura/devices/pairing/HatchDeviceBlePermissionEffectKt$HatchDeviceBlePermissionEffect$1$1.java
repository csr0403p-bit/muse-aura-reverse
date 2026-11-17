package com.facebook.aura.devices.pairing;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C06787bB;
import X.C1BO;
import X.C7384Etj;
import X.C7OU;
import X.G0U;
import X.InterfaceC06807bD;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchDeviceBlePermissionEffectKt$HatchDeviceBlePermissionEffect$1$1 extends AbstractC7559F3s implements G0U<C06787bB, InterfaceC06807bD> {
    public final /* synthetic */ boolean $autoRequestPermissions;
    public final /* synthetic */ C7OU<String[], Map<String, Boolean>> $blePermissionLauncher;
    public final /* synthetic */ String[] $blePermissions;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C1BO<G0U<Boolean, Unit>> $currentOnBlePermissionsResult$delegate;
    public final /* synthetic */ MutableState<Boolean> $hasRequestedPermission$delegate;

    @Override // X.G0U
    public final InterfaceC06807bD invoke(final C06787bB c06787bB) {
        C7384Etj.A0Y(c06787bB, 0);
        if (HatchDeviceBlePermissionEffectKt.hasHatchDeviceBlePermissions(this.$context)) {
            AnonymousClass001.A1K(true, C1BO.A0B(this.$currentOnBlePermissionsResult$delegate));
        } else if (this.$autoRequestPermissions && !MutableState.A0A((MutableState) this.$hasRequestedPermission$delegate)) {
            MutableState.A09(true, this.$hasRequestedPermission$delegate);
            A01(null, this.$blePermissions);
        }
        return new InterfaceC06807bD() { // from class: com.facebook.aura.devices.pairing.HatchDeviceBlePermissionEffectKt$HatchDeviceBlePermissionEffect$1$1$invoke$$inlined$onPauseOrDispose$1
            @Override // X.InterfaceC06807bD
            public void runPauseOrOnDisposeEffect() {
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchDeviceBlePermissionEffectKt$HatchDeviceBlePermissionEffect$1$1(Context context, boolean z, C7OU<String[], Map<String, Boolean>> c7ou, String[] strArr, C1BO<? extends G0U<? super Boolean, Unit>> c1bo, MutableState<Boolean> mutableState) {
        super(1);
        this.$context = context;
        this.$autoRequestPermissions = z;
        this.$blePermissionLauncher = c7ou;
        this.$blePermissions = strArr;
        this.$currentOnBlePermissionsResult$delegate = c1bo;
        this.$hasRequestedPermission$delegate = mutableState;
    }
}
