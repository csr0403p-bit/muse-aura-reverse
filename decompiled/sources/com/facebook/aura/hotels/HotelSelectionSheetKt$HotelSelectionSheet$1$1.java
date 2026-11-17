package com.facebook.aura.hotels;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.conversation.viewmodel.HatchConversationScrollController;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.hotels.HotelSelectionSheetKt$HotelSelectionSheet$1$1", f = "HotelSelectionSheet.kt", l = {LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HotelSelectionSheetKt$HotelSelectionSheet$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HotelSelectionSheetKey $key;
    public final /* synthetic */ HotelSelectionViewModel $model;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelSelectionSheetKt$HotelSelectionSheet$1$1(HotelSelectionViewModel hotelSelectionViewModel, AbstractC3358CGz abstractC3358CGz, HotelSelectionSheetKey hotelSelectionSheetKey, AuraNavigator auraNavigator, HtJ<? super HotelSelectionSheetKt$HotelSelectionSheet$1$1> htJ) {
        super(2, htJ);
        this.$model = hotelSelectionViewModel;
        this.$userSession = abstractC3358CGz;
        this.$key = hotelSelectionSheetKey;
        this.$navigator = auraNavigator;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HotelSelectionSheetKt$HotelSelectionSheet$1$1(this.$model, this.$userSession, this.$key, this.$navigator, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            final HotelSelectionViewModel hotelSelectionViewModel = this.$model;
            C20Q<Unit> c20q = hotelSelectionViewModel.completionEvents;
            final AbstractC3358CGz abstractC3358CGz = this.$userSession;
            final HotelSelectionSheetKey hotelSelectionSheetKey = this.$key;
            final AuraNavigator auraNavigator = this.$navigator;
            C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.hotels.HotelSelectionSheetKt$HotelSelectionSheet$1$1.1

                /* renamed from: com.facebook.aura.hotels.HotelSelectionSheetKt$HotelSelectionSheet$1$1$1$1, reason: invalid class name and collision with other inner class name */
                public final class C01851 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
                    public final /* synthetic */ HotelSelectionSheetKey $key;

                    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
                    @Override // X.G0U
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Boolean invoke(com.facebook.aura.navigation.AuraNavKey r3) {
                        /*
                            r2 = this;
                            r0 = 0
                            X.C7384Etj.A0Y(r3, r0)
                            boolean r0 = r3 instanceof com.facebook.aura.hotels.HotelResultsScreenKey
                            if (r0 == 0) goto L17
                            com.facebook.aura.hotels.HotelResultsScreenKey r3 = (com.facebook.aura.hotels.HotelResultsScreenKey) r3
                            java.lang.String r1 = r3.sessionId
                            com.facebook.aura.hotels.HotelSelectionSheetKey r0 = r2.$key
                            java.lang.String r0 = r0.sessionId
                            boolean r1 = X.C7384Etj.areEqual(r1, r0)
                            r0 = 1
                            if (r1 != 0) goto L18
                        L17:
                            r0 = 0
                        L18:
                            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelSelectionSheetKt$HotelSelectionSheet$1$1.AnonymousClass1.C01851.invoke(com.facebook.aura.navigation.AuraNavKey):java.lang.Boolean");
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C01851(HotelSelectionSheetKey hotelSelectionSheetKey) {
                        super(1);
                        this.$key = hotelSelectionSheetKey;
                    }
                }

                public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                    HatchConversationScrollController companion = HatchConversationScrollController.Companion.getInstance(abstractC3358CGz);
                    String str = hotelSelectionSheetKey.sessionId;
                    if (str == null) {
                        str = "primary_session_id";
                    }
                    companion.requestScrollToBottom(str);
                    auraNavigator.back();
                    auraNavigator.popAll(new C01851(hotelSelectionSheetKey));
                    hotelSelectionViewModel.onCompletionHandled();
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((Unit) obj2, (HtJ<? super Unit>) htJ);
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
        return ((HotelSelectionSheetKt$HotelSelectionSheet$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
