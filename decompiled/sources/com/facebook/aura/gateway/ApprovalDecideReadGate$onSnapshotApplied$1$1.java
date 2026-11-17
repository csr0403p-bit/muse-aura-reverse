package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.C3cG;
import X.G0U;

/* loaded from: classes2.dex */
public final class ApprovalDecideReadGate$onSnapshotApplied$1$1 extends AbstractC7559F3s implements G0U<Long, Boolean> {
    public final /* synthetic */ Long $readStartedAtEpoch;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApprovalDecideReadGate$onSnapshotApplied$1$1(Long l) {
        super(1);
        this.$readStartedAtEpoch = l;
    }

    public final Boolean invoke(long j) {
        return Boolean.valueOf(j <= this.$readStartedAtEpoch.longValue());
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Boolean invoke(Long l) {
        return invoke(C3cG.A05(l));
    }
}
