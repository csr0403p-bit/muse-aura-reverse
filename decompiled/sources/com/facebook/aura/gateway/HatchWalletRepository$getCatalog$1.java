package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import com.facebook.acra.util.minidump.MinidumpReader;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchWalletRepository", f = "HatchWalletRepository.kt", l = {MinidumpReader.MODULE_FULL_SIZE}, m = "getCatalog-gIAlu-s", v = 2)
/* loaded from: classes2.dex */
public final class HatchWalletRepository$getCatalog$1 extends HzP {
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchWalletRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWalletRepository$getCatalog$1(HatchWalletRepository hatchWalletRepository, HtJ<? super HatchWalletRepository$getCatalog$1> htJ) {
        super(htJ);
        this.this$0 = hatchWalletRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m969getCataloggIAlus(false, this));
    }
}
