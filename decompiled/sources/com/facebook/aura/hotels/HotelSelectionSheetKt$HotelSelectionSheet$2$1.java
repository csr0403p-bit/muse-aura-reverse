package com.facebook.aura.hotels;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.toast.api.ToastApi;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.hotels.HotelSelectionSheetKt$HotelSelectionSheet$2$1", f = "HotelSelectionSheet.kt", l = {75}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HotelSelectionSheetKt$HotelSelectionSheet$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HotelSelectionSheetKey $key;
    public final /* synthetic */ HotelSelectionViewModel $model;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelSelectionSheetKt$HotelSelectionSheet$2$1(HotelSelectionViewModel hotelSelectionViewModel, AbstractC3358CGz abstractC3358CGz, AuraNavigator auraNavigator, HotelSelectionSheetKey hotelSelectionSheetKey, Context context, HtJ<? super HotelSelectionSheetKt$HotelSelectionSheet$2$1> htJ) {
        super(2, htJ);
        this.$model = hotelSelectionViewModel;
        this.$userSession = abstractC3358CGz;
        this.$navigator = auraNavigator;
        this.$key = hotelSelectionSheetKey;
        this.$context = context;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HotelSelectionSheetKt$HotelSelectionSheet$2$1(this.$model, this.$userSession, this.$navigator, this.$key, this.$context, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q<HotelBookingRequest> c20q = this.$model.chatBookingRequests;
            final AbstractC3358CGz abstractC3358CGz = this.$userSession;
            final AuraNavigator auraNavigator = this.$navigator;
            final HotelSelectionSheetKey hotelSelectionSheetKey = this.$key;
            final Context context = this.$context;
            C20Z<? super HotelBookingRequest> c20z = new C20Z() { // from class: com.facebook.aura.hotels.HotelSelectionSheetKt$HotelSelectionSheet$2$1.1
                public final Object emit(HotelBookingRequest hotelBookingRequest, HtJ<? super Unit> htJ) {
                    if (!HotelRoomComposerActionsKt.sendHotelBookingMessage(abstractC3358CGz, auraNavigator, hotelSelectionSheetKey, HotelBookingFormattingKt.hotelBookingMessage(context, hotelBookingRequest))) {
                        ToastApi.INSTANCE.showToast(context.getString(R.string._name_removed__res_0x7f120355));
                    }
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((HotelBookingRequest) obj2, (HtJ<? super Unit>) htJ);
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
        return ((HotelSelectionSheetKt$HotelSelectionSheet$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
