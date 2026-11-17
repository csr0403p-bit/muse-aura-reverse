package com.facebook.aura.storagerecovery.content;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class StorageRecoveryOverlayContentKt$StorageUsageBar$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $fillColor;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ double $usagePercentage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageRecoveryOverlayContentKt$StorageUsageBar$3(double d, long j, BRg bRg, int i, int i2) {
        super(2);
        this.$usagePercentage = d;
        this.$fillColor = j;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        StorageRecoveryOverlayContentKt.m2255StorageUsageBar3IgeMak(this.$usagePercentage, this.$fillColor, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
