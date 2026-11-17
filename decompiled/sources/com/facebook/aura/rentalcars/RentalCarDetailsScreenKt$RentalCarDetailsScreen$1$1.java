package com.facebook.aura.rentalcars;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C1BO;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.toast.api.ToastApi;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.rentalcars.RentalCarDetailsScreenKt$RentalCarDetailsScreen$1$1", f = "RentalCarDetailsScreen.kt", l = {64}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class RentalCarDetailsScreenKt$RentalCarDetailsScreen$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<String> $bookingMessage$delegate;
    public final /* synthetic */ String $chatUnavailable;
    public final /* synthetic */ RentalCarDetailsScreenKey $key;
    public final /* synthetic */ RentalCarDetailsViewModel $model;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RentalCarDetailsScreenKt$RentalCarDetailsScreen$1$1(RentalCarDetailsViewModel rentalCarDetailsViewModel, AbstractC3358CGz abstractC3358CGz, AuraNavigator auraNavigator, RentalCarDetailsScreenKey rentalCarDetailsScreenKey, String str, C1BO<String> c1bo, HtJ<? super RentalCarDetailsScreenKt$RentalCarDetailsScreen$1$1> htJ) {
        super(2, htJ);
        this.$model = rentalCarDetailsViewModel;
        this.$userSession = abstractC3358CGz;
        this.$navigator = auraNavigator;
        this.$key = rentalCarDetailsScreenKey;
        this.$chatUnavailable = str;
        this.$bookingMessage$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new RentalCarDetailsScreenKt$RentalCarDetailsScreen$1$1(this.$model, this.$userSession, this.$navigator, this.$key, this.$chatUnavailable, this.$bookingMessage$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            final RentalCarDetailsViewModel rentalCarDetailsViewModel = this.$model;
            C20Q<RentalCarRate> c20q = rentalCarDetailsViewModel.bookings;
            final AbstractC3358CGz abstractC3358CGz = this.$userSession;
            final AuraNavigator auraNavigator = this.$navigator;
            final RentalCarDetailsScreenKey rentalCarDetailsScreenKey = this.$key;
            final String str = this.$chatUnavailable;
            final C1BO<String> c1bo = this.$bookingMessage$delegate;
            C20Z<? super RentalCarRate> c20z = new C20Z() { // from class: com.facebook.aura.rentalcars.RentalCarDetailsScreenKt$RentalCarDetailsScreen$1$1.1
                public final Object emit(RentalCarRate rentalCarRate, HtJ<? super Unit> htJ) {
                    String strA08 = C1BO.A08(c1bo);
                    if (strA08 == null || !RentalCarBookingKt.sendRentalCarBookingMessage(abstractC3358CGz, auraNavigator, rentalCarDetailsScreenKey, strA08)) {
                        rentalCarDetailsViewModel.bookingSent = false;
                        ToastApi.INSTANCE.showToast(str);
                    }
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((RentalCarRate) obj2, (HtJ<? super Unit>) htJ);
                }
            };
            this.label = 1;
            if (c20q.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((RentalCarDetailsScreenKt$RentalCarDetailsScreen$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
