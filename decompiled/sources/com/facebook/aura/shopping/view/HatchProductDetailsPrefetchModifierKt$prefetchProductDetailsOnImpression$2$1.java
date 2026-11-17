package com.facebook.aura.shopping.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.BL5;
import X.C2BR;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.shopping.repo.HatchProductDetailsRepository;
import com.facebook.aura.shopping.repo.ProductDetailsHydrationTarget;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchProductDetailsPrefetchModifierKt$prefetchProductDetailsOnImpression$2$1 extends AbstractC7559F3s implements G0U {
    public final /* synthetic */ MutableState<Boolean> $prefetched$delegate;
    public final /* synthetic */ HatchProductDetailsRepository $repository;
    public final /* synthetic */ AHD<ProductDetailsHydrationTarget> $targets;

    /* renamed from: com.facebook.aura.shopping.view.HatchProductDetailsPrefetchModifierKt$prefetchProductDetailsOnImpression$2$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @Override // X.G0U
    public final BL5 invoke(C2BR c2br) {
        C7384Etj.A0Y(c2br, 0);
        if (!MutableState.A0A((MutableState) this.$prefetched$delegate) && HatchProductDetailsPrefetchModifierKt.getShoppingResultPdpEnabled() && HatchProductDetailsPrefetchModifierKt.getProductDetailsPrefetchEnabled()) {
            MutableState.A09(true, this.$prefetched$delegate);
            AHD<ProductDetailsHydrationTarget> ahd = this.$targets;
            HatchProductDetailsRepository hatchProductDetailsRepository = this.$repository;
            Iterator it = ahd.iterator();
            while (it.hasNext()) {
                hatchProductDetailsRepository.prefetch((ProductDetailsHydrationTarget) it.next());
            }
        }
        AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
        C7384Etj.A0Y(anonymousClass2, 0);
        return new BL5(anonymousClass2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchProductDetailsPrefetchModifierKt$prefetchProductDetailsOnImpression$2$1(AHD<ProductDetailsHydrationTarget> ahd, MutableState<Boolean> mutableState, HatchProductDetailsRepository hatchProductDetailsRepository) {
        super(1);
        this.$targets = ahd;
        this.$prefetched$delegate = mutableState;
        this.$repository = hatchProductDetailsRepository;
    }
}
