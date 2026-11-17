package com.facebook.aura.spaces.repo;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.spaces.repo.PinnedItemsRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.spaces.repo.PinnedItemsRepository$setNavigationOrderFromUser$2$result$1", f = "PinnedItemsRepository.kt", l = {248}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class PinnedItemsRepository$setNavigationOrderFromUser$2$result$1 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
    public final /* synthetic */ PinnedItemsRepository.NavigationOrderSyncLaunch $syncLaunch;
    public int label;
    public final /* synthetic */ PinnedItemsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinnedItemsRepository$setNavigationOrderFromUser$2$result$1(PinnedItemsRepository pinnedItemsRepository, PinnedItemsRepository.NavigationOrderSyncLaunch navigationOrderSyncLaunch, HtJ<? super PinnedItemsRepository$setNavigationOrderFromUser$2$result$1> htJ) {
        super(1, htJ);
        this.this$0 = pinnedItemsRepository;
        this.$syncLaunch = navigationOrderSyncLaunch;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new PinnedItemsRepository$setNavigationOrderFromUser$2$result$1(this.this$0, this.$syncLaunch, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            PinnedItemsRepository pinnedItemsRepository = this.this$0;
            NavigationOrderPayload navigationOrderPayload = this.$syncLaunch.order;
            this.label = 1;
            obj = pinnedItemsRepository.persistNavigationOrderToServer(navigationOrderPayload, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super Boolean> htJ) {
        return ((PinnedItemsRepository$setNavigationOrderFromUser$2$result$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
