package com.facebook.aura.permissions.defaults;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HsJ;
import X.HtJ;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.permissions.defaults.PermissionSettingsRepository$setConfidentialVmAllowed$result$1", f = "PermissionSettingsRepository.kt", l = {HatchIdeaShareImageRenderer.ILLUSTRATION_SIZE, 257}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class PermissionSettingsRepository$setConfidentialVmAllowed$result$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends PermissionSettingsResponseJson>>, Object> {
    public final /* synthetic */ boolean $allowed;
    public final /* synthetic */ ConfidentialVmToggle $toggle;
    public final /* synthetic */ String $vmId;
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public int I$4;
    public int I$5;
    public int I$6;
    public Object L$0;
    public Object L$1;
    public Object L$10;
    public Object L$11;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ PermissionSettingsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionSettingsRepository$setConfidentialVmAllowed$result$1(PermissionSettingsRepository permissionSettingsRepository, ConfidentialVmToggle confidentialVmToggle, boolean z, String str, HtJ<? super PermissionSettingsRepository$setConfidentialVmAllowed$result$1> htJ) {
        super(2, htJ);
        this.this$0 = permissionSettingsRepository;
        this.$toggle = confidentialVmToggle;
        this.$allowed = z;
        this.$vmId = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new PermissionSettingsRepository$setConfidentialVmAllowed$result$1(this.this$0, this.$toggle, this.$allowed, this.$vmId, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf A[Catch: all -> 0x00e3, TryCatch #2 {all -> 0x00e3, blocks: (B:21:0x00c9, B:23:0x00cf, B:24:0x00d5), top: B:40:0x00c9 }] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.permissions.defaults.PermissionSettingsRepository$setConfidentialVmAllowed$result$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<PermissionSettingsResponseJson>> htJ) {
        return ((PermissionSettingsRepository$setConfidentialVmAllowed$result$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends PermissionSettingsResponseJson>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<PermissionSettingsResponseJson>>) htJ);
    }
}
