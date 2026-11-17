package com.facebook.aura.hotels;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.C7384Etj;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.hotels.HotelLoadState;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.hotels.HotelPolicySheetKt$HotelPolicySheet$1$1", f = "HotelPolicySheet.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HotelPolicySheetKt$HotelPolicySheet$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HotelPolicyCopy $policy;
    public final /* synthetic */ C1BO<HotelLoadState<HotelSelection>> $state$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HotelPolicySheetKt$HotelPolicySheet$1$1(HotelPolicyCopy hotelPolicyCopy, AuraNavigator auraNavigator, C1BO<? extends HotelLoadState<HotelSelection>> c1bo, HtJ<? super HotelPolicySheetKt$HotelPolicySheet$1$1> htJ) {
        super(2, htJ);
        this.$policy = hotelPolicyCopy;
        this.$navigator = auraNavigator;
        this.$state$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HotelPolicySheetKt$HotelPolicySheet$1$1(this.$policy, this.$navigator, this.$state$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (!C7384Etj.areEqual(this.$state$delegate.getValue(), HotelLoadState.Loading.INSTANCE) && this.$policy == null) {
            this.$navigator.back();
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HotelPolicySheetKt$HotelPolicySheet$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
