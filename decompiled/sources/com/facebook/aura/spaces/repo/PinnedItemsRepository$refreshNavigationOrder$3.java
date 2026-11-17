package com.facebook.aura.spaces.repo;

import X.AHD;
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

@DebugMetadata(c = "com.facebook.aura.spaces.repo.PinnedItemsRepository$refreshNavigationOrder$3", f = "PinnedItemsRepository.kt", l = {283}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class PinnedItemsRepository$refreshNavigationOrder$3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends AHD<? extends String>>>, Object> {
    public final /* synthetic */ SingleFlight $refreshSingleFlight;
    public int label;
    public final /* synthetic */ PinnedItemsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinnedItemsRepository$refreshNavigationOrder$3(SingleFlight singleFlight, PinnedItemsRepository pinnedItemsRepository, HtJ<? super PinnedItemsRepository$refreshNavigationOrder$3> htJ) {
        super(2, htJ);
        this.$refreshSingleFlight = singleFlight;
        this.this$0 = pinnedItemsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new PinnedItemsRepository$refreshNavigationOrder$3(this.$refreshSingleFlight, this.this$0, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object value;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            SingleFlight singleFlight = this.$refreshSingleFlight;
            PinnedItemsRepository$refreshNavigationOrder$3$result$1 pinnedItemsRepository$refreshNavigationOrder$3$result$1 = new PinnedItemsRepository$refreshNavigationOrder$3$result$1(this.this$0, null);
            this.label = 1;
            obj = singleFlight.invoke(Unit.INSTANCE, pinnedItemsRepository$refreshNavigationOrder$3$result$1, this);
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
        if (singleFlightResult instanceof SingleFlightResult.Result) {
            value = ((HsJ) ((SingleFlightResult.Result) singleFlightResult).value).value;
        } else {
            if (!C7384Etj.areEqual(singleFlightResult, SingleFlightResult.Skipped.INSTANCE)) {
                throw C3cG.A0q();
            }
            PinnedItemsRepository pinnedItemsRepository = this.this$0;
            int i2 = PinnedItemsRepository.MAX_PINNED_ITEMS;
            value = pinnedItemsRepository._navigationOrder.getValue();
        }
        return C3cG.A0t(value);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<? extends AHD<String>>> htJ) {
        return ((PinnedItemsRepository$refreshNavigationOrder$3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends AHD<? extends String>>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<? extends AHD<String>>>) htJ);
    }
}
