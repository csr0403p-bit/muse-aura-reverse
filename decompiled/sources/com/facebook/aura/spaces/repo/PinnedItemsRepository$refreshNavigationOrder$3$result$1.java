package com.facebook.aura.spaces.repo;

import X.AHD;
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

@DebugMetadata(c = "com.facebook.aura.spaces.repo.PinnedItemsRepository$refreshNavigationOrder$3$result$1", f = "PinnedItemsRepository.kt", l = {283}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class PinnedItemsRepository$refreshNavigationOrder$3$result$1 extends AbstractC07127nr implements G0U<HtJ<? super HsJ<? extends AHD<? extends String>>>, Object> {
    public int label;
    public final /* synthetic */ PinnedItemsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinnedItemsRepository$refreshNavigationOrder$3$result$1(PinnedItemsRepository pinnedItemsRepository, HtJ<? super PinnedItemsRepository$refreshNavigationOrder$3$result$1> htJ) {
        super(1, htJ);
        this.this$0 = pinnedItemsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new PinnedItemsRepository$refreshNavigationOrder$3$result$1(this.this$0, htJ);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(HtJ<? super HsJ<? extends AHD<String>>> htJ) {
        return new PinnedItemsRepository$refreshNavigationOrder$3$result$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM2182refreshNavigationOrderOnceIoAF18A;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            PinnedItemsRepository pinnedItemsRepository = this.this$0;
            this.label = 1;
            objM2182refreshNavigationOrderOnceIoAF18A = pinnedItemsRepository.m2182refreshNavigationOrderOnceIoAF18A(this);
            if (objM2182refreshNavigationOrderOnceIoAF18A == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM2182refreshNavigationOrderOnceIoAF18A = AnonymousClass001.A0q(obj);
        }
        return C3cG.A0t(objM2182refreshNavigationOrderOnceIoAF18A);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Object invoke(HtJ<? super HsJ<? extends AHD<? extends String>>> htJ) {
        return invoke2((HtJ<? super HsJ<? extends AHD<String>>>) htJ);
    }
}
