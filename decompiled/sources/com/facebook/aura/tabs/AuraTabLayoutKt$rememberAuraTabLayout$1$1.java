package com.facebook.aura.tabs;

import X.AHD;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.C7384Etj;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.spaces.repo.PinnedItemsRepository;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.tabs.AuraTabLayoutKt$rememberAuraTabLayout$1$1", f = "AuraTabLayout.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AuraTabLayoutKt$rememberAuraTabLayout$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Boolean> $artifactsLoaded$delegate;
    public final /* synthetic */ boolean $persistNormalizedOrder;
    public final /* synthetic */ PinnedItemsRepository $pinnedItemsRepository;
    public final /* synthetic */ List<String> $resolvedOrder;
    public final /* synthetic */ boolean $sortingEnabled;
    public final /* synthetic */ boolean $spacesEnabled;
    public final /* synthetic */ C1BO<AHD<String>> $storedOrder$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraTabLayoutKt$rememberAuraTabLayout$1$1(boolean z, boolean z2, boolean z3, List<String> list, PinnedItemsRepository pinnedItemsRepository, C1BO<Boolean> c1bo, C1BO<? extends AHD<String>> c1bo2, HtJ<? super AuraTabLayoutKt$rememberAuraTabLayout$1$1> htJ) {
        super(2, htJ);
        this.$persistNormalizedOrder = z;
        this.$sortingEnabled = z2;
        this.$spacesEnabled = z3;
        this.$resolvedOrder = list;
        this.$pinnedItemsRepository = pinnedItemsRepository;
        this.$artifactsLoaded$delegate = c1bo;
        this.$storedOrder$delegate = c1bo2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraTabLayoutKt$rememberAuraTabLayout$1$1(this.$persistNormalizedOrder, this.$sortingEnabled, this.$spacesEnabled, this.$resolvedOrder, this.$pinnedItemsRepository, this.$artifactsLoaded$delegate, this.$storedOrder$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (this.$persistNormalizedOrder && this.$sortingEnabled && this.$spacesEnabled && C1BO.A0F(this.$artifactsLoaded$delegate) && !C7384Etj.areEqual(this.$resolvedOrder, this.$storedOrder$delegate.getValue())) {
            this.$pinnedItemsRepository.setNavigationOrder(this.$resolvedOrder);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AuraTabLayoutKt$rememberAuraTabLayout$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
