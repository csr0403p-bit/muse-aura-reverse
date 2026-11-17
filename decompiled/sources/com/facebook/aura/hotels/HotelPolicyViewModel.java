package com.facebook.aura.hotels;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BLG;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C9286GCn;
import X.G0V;
import X.HnJ;
import X.HtJ;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.hotels.HotelLoadState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HotelPolicyViewModel extends AEs {
    public static final int $stable = 8;
    public final HotelSelectionSheetKey key;
    public final HotelDataSource repository;
    public final C1BN<HotelLoadState<HotelSelection>> selection;
    public final BLG<HotelLoadState<HotelSelection>> state;

    @DebugMetadata(c = "com.facebook.aura.hotels.HotelPolicyViewModel$1", f = "HotelBrowseViewModels.kt", l = {301}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.hotels.HotelPolicyViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HotelPolicyViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HotelPolicyViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.Hji r6 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r5 = 1
                if (r0 == 0) goto L4f
                if (r0 != r5) goto L6a
                java.lang.Object r4 = r7.L$0
                X.BLG r4 = (X.BLG) r4
                java.lang.Object r2 = X.AnonymousClass001.A0q(r8)
            L11:
                boolean r1 = r2 instanceof X.C10571Hud
                r0 = 0
                if (r1 == 0) goto L17
                r2 = r0
            L17:
                com.facebook.aura.hotels.HotelSelection r2 = (com.facebook.aura.hotels.HotelSelection) r2
                if (r2 == 0) goto L4c
                com.facebook.aura.hotels.HotelPolicyViewModel r3 = com.facebook.aura.hotels.HotelPolicyViewModel.this
                java.lang.String r1 = r2.hotelId
                com.facebook.aura.hotels.HotelSelectionSheetKey r0 = r3.key
                java.lang.String r0 = r0.hotelId
                boolean r0 = X.C7384Etj.areEqual(r1, r0)
                if (r0 == 0) goto L4c
                java.lang.String r1 = r2.offerId
                com.facebook.aura.hotels.HotelSelectionSheetKey r0 = r3.key
                java.lang.String r0 = r0.offerId
                boolean r0 = X.C7384Etj.areEqual(r1, r0)
                if (r0 == 0) goto L4c
                java.lang.String r1 = r2.rateId
                com.facebook.aura.hotels.HotelSelectionSheetKey r0 = r3.key
                java.lang.String r0 = r0.rateId
                boolean r0 = X.C7384Etj.areEqual(r1, r0)
                if (r0 == 0) goto L4c
                com.facebook.aura.hotels.HotelLoadState$Loaded r0 = new com.facebook.aura.hotels.HotelLoadState$Loaded
                r0.<init>(r2)
            L46:
                r4.Af8(r0)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L4c:
                com.facebook.aura.hotels.HotelLoadState$Unavailable r0 = com.facebook.aura.hotels.HotelLoadState.Unavailable.INSTANCE
                goto L46
            L4f:
                X.Hwg.A00(r8)
                com.facebook.aura.hotels.HotelPolicyViewModel r0 = com.facebook.aura.hotels.HotelPolicyViewModel.this
                X.BLG<com.facebook.aura.hotels.HotelLoadState<com.facebook.aura.hotels.HotelSelection>> r4 = r0.state
                com.facebook.aura.hotels.HotelDataSource r3 = r0.repository
                com.facebook.aura.hotels.HotelSelectionSheetKey r0 = r0.key
                java.lang.String r2 = r0.searchRef
                java.lang.String r1 = r0.resultRef
                r7.L$0 = r4
                r7.label = r5
                r0 = 0
                java.lang.Object r2 = r3.mo1059detailsBWLJW6A(r2, r1, r0, r7)
                if (r2 != r6) goto L11
                return r6
            L6a:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelPolicyViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final class Factory extends AuraViewModelFactory<HotelPolicyViewModel> {
        public static final int $stable = 8;
        public final HotelSelectionSheetKey key;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HotelPolicyViewModel create() {
            return new HotelPolicyViewModel(this.key, HotelRepository.Companion.getInstance(this.userSession));
        }

        public Factory(HotelSelectionSheetKey hotelSelectionSheetKey, AbstractC3358CGz abstractC3358CGz) {
            AnonymousClass003.A0u(hotelSelectionSheetKey, abstractC3358CGz);
            this.key = hotelSelectionSheetKey;
            this.userSession = abstractC3358CGz;
        }
    }

    public final C1BN<HotelLoadState<HotelSelection>> getSelection() {
        return this.selection;
    }

    public HotelPolicyViewModel(HotelSelectionSheetKey hotelSelectionSheetKey, HotelDataSource hotelDataSource) {
        AnonymousClass003.A0u(hotelSelectionSheetKey, hotelDataSource);
        this.key = hotelSelectionSheetKey;
        this.repository = hotelDataSource;
        C9286GCn c9286GCnA01 = HnJ.A01(HotelLoadState.Loading.INSTANCE);
        this.state = c9286GCnA01;
        this.selection = C3cG.A11(c9286GCnA01);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(null), AEu.A00(this));
    }
}
