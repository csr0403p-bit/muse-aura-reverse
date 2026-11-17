package com.facebook.aura.startup.coordinator;

import X.AHD;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C10571Hud;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.spaces.repo.PinnedItemsRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob$execute$navigationOrder$1", f = "HatchTabPrefetchCoordinatorStartupJob.kt", l = {115}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchTabPrefetchCoordinatorStartupJob$execute$navigationOrder$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super AHD<? extends String>>, Object> {
    public final /* synthetic */ PinnedItemsRepository $pinnedItemsRepository;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTabPrefetchCoordinatorStartupJob$execute$navigationOrder$1(PinnedItemsRepository pinnedItemsRepository, HtJ<? super HatchTabPrefetchCoordinatorStartupJob$execute$navigationOrder$1> htJ) {
        super(2, htJ);
        this.$pinnedItemsRepository = pinnedItemsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchTabPrefetchCoordinatorStartupJob$execute$navigationOrder$1(this.$pinnedItemsRepository, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super AHD<? extends String>> htJ) {
        return invoke2(c3ux, (HtJ<? super AHD<String>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM2183refreshNavigationOrderIoAF18A;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            PinnedItemsRepository pinnedItemsRepository = this.$pinnedItemsRepository;
            this.label = 1;
            objM2183refreshNavigationOrderIoAF18A = pinnedItemsRepository.m2183refreshNavigationOrderIoAF18A(this);
            if (objM2183refreshNavigationOrderIoAF18A == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM2183refreshNavigationOrderIoAF18A = AnonymousClass001.A0q(obj);
        }
        if (objM2183refreshNavigationOrderIoAF18A instanceof C10571Hud) {
            return null;
        }
        return objM2183refreshNavigationOrderIoAF18A;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super AHD<String>> htJ) {
        return new HatchTabPrefetchCoordinatorStartupJob$execute$navigationOrder$1(this.$pinnedItemsRepository, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
