package com.facebook.aura.devices.pairing;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BO;
import X.C3cG;
import X.C7384Etj;
import X.G0U;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchDeviceBlePermissionEffectKt$HatchDeviceBlePermissionEffect$blePermissionLauncher$1$1 extends AbstractC7559F3s implements G0U<Map<String, Boolean>, Unit> {
    public final /* synthetic */ String[] $blePermissions;
    public final /* synthetic */ C1BO<G0U<Boolean, Unit>> $currentOnBlePermissionsResult$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, Boolean> map) {
        C7384Etj.A0Y(map, 0);
        G0U g0uA0B = C1BO.A0B(this.$currentOnBlePermissionsResult$delegate);
        String[] strArr = this.$blePermissions;
        int length = strArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            } else if (!C3cG.A1P(map.get(strArr[i]), true)) {
                break;
            } else {
                i++;
            }
        }
        AnonymousClass001.A1K(z, g0uA0B);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchDeviceBlePermissionEffectKt$HatchDeviceBlePermissionEffect$blePermissionLauncher$1$1(String[] strArr, C1BO<? extends G0U<? super Boolean, Unit>> c1bo) {
        super(1);
        this.$blePermissions = strArr;
        this.$currentOnBlePermissionsResult$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Map<String, Boolean> map) {
        invoke2(map);
        return Unit.INSTANCE;
    }
}
