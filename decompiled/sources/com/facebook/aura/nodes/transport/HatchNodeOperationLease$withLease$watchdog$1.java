package com.facebook.aura.nodes.transport;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7Bq;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.nodes.transport.HatchNodeOperationLease$withLease$watchdog$1", f = "HatchNodeOperationLease.kt", l = {64}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchNodeOperationLease$withLease$watchdog$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $reason;
    public final /* synthetic */ AtomicBoolean $released;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNodeOperationLease$withLease$watchdog$1(AtomicBoolean atomicBoolean, String str, HtJ<? super HatchNodeOperationLease$withLease$watchdog$1> htJ) {
        super(2, htJ);
        this.$released = atomicBoolean;
        this.$reason = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchNodeOperationLease$withLease$watchdog$1(this.$released, this.$reason, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            this.label = 1;
            if (C7Bq.A01(600000L, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        if (HatchNodeOperationLease.INSTANCE.releaseOnce(this.$released, this.$reason)) {
            CFK.A06(HatchNodeOperationLeaseKt.TAG, FGI.A0U("lease '", this.$reason, "' held past 600000ms; released, work left running"));
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchNodeOperationLease$withLease$watchdog$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
