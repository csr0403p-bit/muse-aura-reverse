package com.facebook.aura.permissions.defaults;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G2j;
import X.HtJ;
import X.Hwg;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.permissions.defaults.PermissionSettingsRepository$confidentialVmSettings$1", f = "PermissionSettingsRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class PermissionSettingsRepository$confidentialVmSettings$1 extends AbstractC07127nr implements G2j<LoadedConfidentialVm, Map<String, ? extends Boolean>, String, HtJ<? super ConfidentialVmSettings>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public int label;
    public final /* synthetic */ PermissionSettingsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionSettingsRepository$confidentialVmSettings$1(PermissionSettingsRepository permissionSettingsRepository, HtJ<? super PermissionSettingsRepository$confidentialVmSettings$1> htJ) {
        super(4, htJ);
        this.this$0 = permissionSettingsRepository;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(LoadedConfidentialVm loadedConfidentialVm, Map<String, Boolean> map, String str, HtJ<? super ConfidentialVmSettings> htJ) {
        PermissionSettingsRepository$confidentialVmSettings$1 permissionSettingsRepository$confidentialVmSettings$1 = new PermissionSettingsRepository$confidentialVmSettings$1(this.this$0, htJ);
        permissionSettingsRepository$confidentialVmSettings$1.L$0 = loadedConfidentialVm;
        permissionSettingsRepository$confidentialVmSettings$1.L$1 = map;
        permissionSettingsRepository$confidentialVmSettings$1.L$2 = str;
        return permissionSettingsRepository$confidentialVmSettings$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        LoadedConfidentialVm loadedConfidentialVm = (LoadedConfidentialVm) this.L$0;
        Map map = (Map) this.L$1;
        Object obj2 = this.L$2;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        ConfidentialVmSettings confidentialVmSettings = loadedConfidentialVm.settings;
        if (confidentialVmSettings == null || !C7384Etj.areEqual(loadedConfidentialVm.vmId, obj2)) {
            return null;
        }
        return this.this$0.withPending(confidentialVmSettings, map);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Object invoke(LoadedConfidentialVm loadedConfidentialVm, Map<String, ? extends Boolean> map, String str, HtJ<? super ConfidentialVmSettings> htJ) {
        return invoke2(loadedConfidentialVm, (Map<String, Boolean>) map, str, htJ);
    }
}
