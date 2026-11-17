package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0U;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchWalletRepository$getCatalog$2$result$1", f = "HatchWalletRepository.kt", l = {114}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchWalletRepository$getCatalog$2$result$1 extends AbstractC07127nr implements G0U<HtJ<? super HsJ<? extends WalletCatalog>>, Object> {
    public int label;
    public final /* synthetic */ HatchWalletRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWalletRepository$getCatalog$2$result$1(HatchWalletRepository hatchWalletRepository, HtJ<? super HatchWalletRepository$getCatalog$2$result$1> htJ) {
        super(1, htJ);
        this.this$0 = hatchWalletRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HatchWalletRepository$getCatalog$2$result$1(this.this$0, htJ);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(HtJ<? super HsJ<WalletCatalog>> htJ) {
        return new HatchWalletRepository$getCatalog$2$result$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM968fetchCatalogIoAF18A;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchWalletRepository hatchWalletRepository = this.this$0;
            this.label = 1;
            objM968fetchCatalogIoAF18A = hatchWalletRepository.m968fetchCatalogIoAF18A(this);
            if (objM968fetchCatalogIoAF18A == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM968fetchCatalogIoAF18A = AnonymousClass001.A0q(obj);
        }
        return C3cG.A0t(objM968fetchCatalogIoAF18A);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Object invoke(HtJ<? super HsJ<? extends WalletCatalog>> htJ) {
        return invoke2((HtJ<? super HsJ<WalletCatalog>>) htJ);
    }
}
