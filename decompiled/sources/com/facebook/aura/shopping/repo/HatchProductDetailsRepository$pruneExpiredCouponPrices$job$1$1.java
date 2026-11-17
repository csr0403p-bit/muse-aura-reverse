package com.facebook.aura.shopping.repo;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7Bq;
import X.C8j5;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.shopping.repo.HatchProductDetailsRepository$pruneExpiredCouponPrices$job$1$1", f = "HatchProductDetailsRepository.kt", l = {321}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchProductDetailsRepository$pruneExpiredCouponPrices$job$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ double $expiresAt;
    public int label;
    public final /* synthetic */ HatchProductDetailsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchProductDetailsRepository$pruneExpiredCouponPrices$job$1$1(double d, HatchProductDetailsRepository hatchProductDetailsRepository, HtJ<? super HatchProductDetailsRepository$pruneExpiredCouponPrices$job$1$1> htJ) {
        super(2, htJ);
        this.$expiresAt = d;
        this.this$0 = hatchProductDetailsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchProductDetailsRepository$pruneExpiredCouponPrices$job$1$1(this.$expiresAt, this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            long jA00 = (long) ((this.$expiresAt - C8j5.A00()) * 1000.0d);
            if (jA00 < 1) {
                jA00 = 1;
            }
            this.label = 1;
            if (C7Bq.A01(jA00, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        this.this$0.pruneExpiredCouponPrices();
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchProductDetailsRepository$pruneExpiredCouponPrices$job$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
