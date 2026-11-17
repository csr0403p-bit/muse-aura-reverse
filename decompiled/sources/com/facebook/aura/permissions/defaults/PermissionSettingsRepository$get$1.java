package com.facebook.aura.permissions.defaults;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import com.facebook.aura.composer.util.ImageCompressor;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.permissions.defaults.PermissionSettingsRepository", f = "PermissionSettingsRepository.kt", l = {ImageCompressor.IMAGE_COMPRESSION_QUALITY}, m = "get-IoAF18A", v = 2)
/* loaded from: classes3.dex */
public final class PermissionSettingsRepository$get$1 extends HzP {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PermissionSettingsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionSettingsRepository$get$1(PermissionSettingsRepository permissionSettingsRepository, HtJ<? super PermissionSettingsRepository$get$1> htJ) {
        super(htJ);
        this.this$0 = permissionSettingsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m1848getIoAF18A(this));
    }
}
