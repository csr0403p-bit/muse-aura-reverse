package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightResult;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchWalletRepository$getCatalog$2", f = "HatchWalletRepository.kt", l = {114}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchWalletRepository$getCatalog$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends WalletCatalog>>, Object> {
    public final /* synthetic */ boolean $forceRefresh;
    public int label;
    public final /* synthetic */ HatchWalletRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWalletRepository$getCatalog$2(boolean z, HatchWalletRepository hatchWalletRepository, HtJ<? super HatchWalletRepository$getCatalog$2> htJ) {
        super(2, htJ);
        this.$forceRefresh = z;
        this.this$0 = hatchWalletRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchWalletRepository$getCatalog$2(this.$forceRefresh, this.this$0, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends WalletCatalog>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<WalletCatalog>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        WalletCatalog walletCatalog;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (!this.$forceRefresh && (walletCatalog = this.this$0.cachedCatalog) != null) {
                return C3cG.A0t(walletCatalog);
            }
            HatchWalletRepository hatchWalletRepository = this.this$0;
            SingleFlight singleFlight = hatchWalletRepository.catalogFetch;
            HatchWalletRepository$getCatalog$2$result$1 hatchWalletRepository$getCatalog$2$result$1 = new HatchWalletRepository$getCatalog$2$result$1(hatchWalletRepository, null);
            this.label = 1;
            obj = singleFlight.invoke(Unit.INSTANCE, hatchWalletRepository$getCatalog$2$result$1, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        SingleFlightResult singleFlightResult = (SingleFlightResult) obj;
        C7384Etj.A0Z(singleFlightResult, "null cannot be cast to non-null type com.facebook.aura.common.coroutines.SingleFlightResult.Result<kotlin.Result<com.facebook.aura.gateway.WalletCatalog>>");
        return ((SingleFlightResult.Result) singleFlightResult).value;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<WalletCatalog>> htJ) {
        return ((HatchWalletRepository$getCatalog$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
