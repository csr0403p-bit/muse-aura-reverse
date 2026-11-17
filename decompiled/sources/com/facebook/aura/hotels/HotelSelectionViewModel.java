package com.facebook.aura.hotels;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC10623Hzj;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BLG;
import X.BLL;
import X.C1BN;
import X.C20Q;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C7438Evz;
import X.C79;
import X.C9286GCn;
import X.G0U;
import X.G0V;
import X.G2j;
import X.GAo;
import X.GCV;
import X.HoC;
import X.HsJ;
import X.HtJ;
import X.Hu1;
import X.HzR;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.hotels.HotelLoadState;
import com.facebook.aura.hotels.HotelReserveAction;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HotelSelectionViewModel extends AEs {
    public static final int $stable = 8;
    public final C20Q<HotelBookingRequest> chatBookingRequests;
    public final HzR<HotelBookingRequest> chatBookings;
    public final HzR<Unit> completed;
    public final C20Q<Unit> completionEvents;
    public final HotelSelectionSheetKey key;
    public final HotelDataSource repository;
    public HoC request;
    public final BLG<HotelSelectionUiState> state;
    public final C1BN<HotelSelectionUiState> uiState;

    public final class Factory extends AuraViewModelFactory<HotelSelectionViewModel> {
        public static final int $stable = 8;
        public final HotelSelectionSheetKey key;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HotelSelectionViewModel create() {
            return new HotelSelectionViewModel(this.key, HotelRepository.Companion.getInstance(this.userSession));
        }

        public Factory(HotelSelectionSheetKey hotelSelectionSheetKey, AbstractC3358CGz abstractC3358CGz) {
            AnonymousClass003.A0u(hotelSelectionSheetKey, abstractC3358CGz);
            this.key = hotelSelectionSheetKey;
            this.userSession = abstractC3358CGz;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionViewModel$askAboutRooms$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<HotelSelection, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(HotelSelection hotelSelection) {
            C7384Etj.A0Y(hotelSelection, 0);
            return Boolean.valueOf(hotelSelection.canAskAboutRooms);
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionViewModel$askAboutRooms$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends C7438Evz implements G2j {
        public AnonymousClass2(Object obj) {
            super(4, obj, HotelDataSource.class, "askAboutRooms", "askAboutRooms-BWLJW6A(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/aura/hotels/HotelReviewSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
        @Override // X.G2j
        /* renamed from: invoke-BWLJW6A, reason: not valid java name and merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(java.lang.String r6, java.lang.String r7, com.facebook.aura.hotels.HotelReviewSource r8, X.HtJ<? super X.HsJ<kotlin.Unit>> r9) {
            /*
                r5 = this;
                boolean r0 = r9 instanceof com.facebook.aura.hotels.HotelSelectionViewModel$askAboutRooms$2$invokeBWLJW6A$1
                if (r0 == 0) goto L3d
                r4 = r9
                com.facebook.aura.hotels.HotelSelectionViewModel$askAboutRooms$2$invoke-BWLJW6A$1 r4 = (com.facebook.aura.hotels.HotelSelectionViewModel$askAboutRooms$2$invokeBWLJW6A$1) r4
                int r2 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L3d
                int r2 = r2 - r1
                r4.label = r2
            L12:
                java.lang.Object r1 = r4.result
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r4.label
                r2 = 1
                if (r0 == 0) goto L26
                if (r0 != r2) goto L43
                java.lang.Object r0 = X.AnonymousClass001.A0q(r1)
            L21:
                X.HsJ r3 = X.C3cG.A0t(r0)
                return r3
            L26:
                X.Hwg.A00(r1)
                java.lang.Object r1 = r5.receiver
                com.facebook.aura.hotels.HotelDataSource r1 = (com.facebook.aura.hotels.HotelDataSource) r1
                r0 = 0
                r4.L$0 = r0
                r4.L$1 = r0
                r4.L$2 = r0
                r4.label = r2
                java.lang.Object r0 = r1.mo1058askAboutRoomsBWLJW6A(r6, r7, r8, r4)
                if (r0 != r3) goto L21
                return r3
            L3d:
                com.facebook.aura.hotels.HotelSelectionViewModel$askAboutRooms$2$invoke-BWLJW6A$1 r4 = new com.facebook.aura.hotels.HotelSelectionViewModel$askAboutRooms$2$invoke-BWLJW6A$1
                r4.<init>(r5, r9)
                goto L12
            L43:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelSelectionViewModel.AnonymousClass2.invoke(java.lang.String, java.lang.String, com.facebook.aura.hotels.HotelReviewSource, X.HtJ):java.lang.Object");
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionViewModel$askAboutRooms$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<HotelSelectionUiState, HotelReviewState, HotelSelectionUiState> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(2);
        }

        @Override // X.G0V
        public final HotelSelectionUiState invoke(HotelSelectionUiState hotelSelectionUiState, HotelReviewState hotelReviewState) {
            AnonymousClass003.A0u(hotelSelectionUiState, hotelReviewState);
            return hotelSelectionUiState.copy(hotelSelectionUiState.detail, hotelSelectionUiState.review, hotelReviewState, hotelSelectionUiState.visitWebsiteUrl, hotelSelectionUiState.reserveAction);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.hotels.HotelSelectionViewModel$load$2", f = "HotelBrowseViewModels.kt", l = {162}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.hotels.HotelSelectionViewModel$load$2, reason: invalid class name and case insensitive filesystem */
    public final class C122272 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $forceRefresh;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122272(boolean z, HtJ<? super C122272> htJ) {
            super(2, htJ);
            this.$forceRefresh = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HotelSelectionViewModel.this.new C122272(this.$forceRefresh, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00aa A[PHI: r11
  0x00aa: PHI (r11v2 java.lang.String) = (r11v1 java.lang.String), (r11v8 java.lang.String), (r11v8 java.lang.String) binds: [B:48:0x00a7, B:32:0x007b, B:34:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00ae A[PHI: r11 r12
  0x00ae: PHI (r11v3 java.lang.String) = (r11v2 java.lang.String), (r11v7 java.lang.String) binds: [B:51:0x00ab, B:37:0x008b] A[DONT_GENERATE, DONT_INLINE]
  0x00ae: PHI (r12v2 com.facebook.aura.hotels.HotelReserveAction) = (r12v1 com.facebook.aura.hotels.HotelReserveAction), (r12v6 com.facebook.aura.hotels.HotelReserveAction) binds: [B:51:0x00ab, B:37:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00b3 A[PHI: r9 r11 r12
  0x00b3: PHI (r9v1 com.facebook.aura.hotels.HotelReviewState) = (r9v0 com.facebook.aura.hotels.HotelReviewState), (r9v3 com.facebook.aura.hotels.HotelReviewState) binds: [B:54:0x00b0, B:40:0x0093] A[DONT_GENERATE, DONT_INLINE]
  0x00b3: PHI (r11v4 java.lang.String) = (r11v3 java.lang.String), (r11v6 java.lang.String) binds: [B:54:0x00b0, B:40:0x0093] A[DONT_GENERATE, DONT_INLINE]
  0x00b3: PHI (r12v3 com.facebook.aura.hotels.HotelReserveAction) = (r12v2 com.facebook.aura.hotels.HotelReserveAction), (r12v5 com.facebook.aura.hotels.HotelReserveAction) binds: [B:54:0x00b0, B:40:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 249
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelSelectionViewModel.C122272.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C122272) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionViewModel$requestBookingReview$1, reason: invalid class name and case insensitive filesystem */
    public final class C122281 extends AbstractC7559F3s implements G0U<HotelSelection, Boolean> {
        public static final C122281 INSTANCE = new C122281();

        public C122281() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(HotelSelection hotelSelection) {
            C7384Etj.A0Y(hotelSelection, 0);
            HotelBookingAction hotelBookingAction = hotelSelection.bookingAction;
            return Boolean.valueOf(AnonymousClass002.A1Z(hotelBookingAction != null ? hotelBookingAction.type : null, HotelBookingActionType.REQUEST_BOOKING_REVIEW));
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionViewModel$requestBookingReview$2, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C122292 extends C7438Evz implements G2j {
        public C122292(Object obj) {
            super(4, obj, HotelDataSource.class, "requestBookingReview", "requestBookingReview-BWLJW6A(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/aura/hotels/HotelReviewSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
        @Override // X.G2j
        /* renamed from: invoke-BWLJW6A, reason: not valid java name and merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(java.lang.String r6, java.lang.String r7, com.facebook.aura.hotels.HotelReviewSource r8, X.HtJ<? super X.HsJ<kotlin.Unit>> r9) {
            /*
                r5 = this;
                boolean r0 = r9 instanceof com.facebook.aura.hotels.HotelSelectionViewModel$requestBookingReview$2$invokeBWLJW6A$1
                if (r0 == 0) goto L3d
                r4 = r9
                com.facebook.aura.hotels.HotelSelectionViewModel$requestBookingReview$2$invoke-BWLJW6A$1 r4 = (com.facebook.aura.hotels.HotelSelectionViewModel$requestBookingReview$2$invokeBWLJW6A$1) r4
                int r2 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L3d
                int r2 = r2 - r1
                r4.label = r2
            L12:
                java.lang.Object r1 = r4.result
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r4.label
                r2 = 1
                if (r0 == 0) goto L26
                if (r0 != r2) goto L43
                java.lang.Object r0 = X.AnonymousClass001.A0q(r1)
            L21:
                X.HsJ r3 = X.C3cG.A0t(r0)
                return r3
            L26:
                X.Hwg.A00(r1)
                java.lang.Object r1 = r5.receiver
                com.facebook.aura.hotels.HotelDataSource r1 = (com.facebook.aura.hotels.HotelDataSource) r1
                r0 = 0
                r4.L$0 = r0
                r4.L$1 = r0
                r4.L$2 = r0
                r4.label = r2
                java.lang.Object r0 = r1.mo1060requestBookingReviewBWLJW6A(r6, r7, r8, r4)
                if (r0 != r3) goto L21
                return r3
            L3d:
                com.facebook.aura.hotels.HotelSelectionViewModel$requestBookingReview$2$invoke-BWLJW6A$1 r4 = new com.facebook.aura.hotels.HotelSelectionViewModel$requestBookingReview$2$invoke-BWLJW6A$1
                r4.<init>(r5, r9)
                goto L12
            L43:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelSelectionViewModel.C122292.invoke(java.lang.String, java.lang.String, com.facebook.aura.hotels.HotelReviewSource, X.HtJ):java.lang.Object");
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionViewModel$requestBookingReview$3, reason: invalid class name and case insensitive filesystem */
    public final class C122303 extends AbstractC7559F3s implements G0V<HotelSelectionUiState, HotelReviewState, HotelSelectionUiState> {
        public static final C122303 INSTANCE = new C122303();

        public C122303() {
            super(2);
        }

        @Override // X.G0V
        public final HotelSelectionUiState invoke(HotelSelectionUiState hotelSelectionUiState, HotelReviewState hotelReviewState) {
            AnonymousClass003.A0u(hotelSelectionUiState, hotelReviewState);
            return hotelSelectionUiState.copy(hotelSelectionUiState.detail, hotelReviewState, hotelSelectionUiState.roomDiscussion, hotelSelectionUiState.visitWebsiteUrl, hotelSelectionUiState.reserveAction);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.hotels.HotelSelectionViewModel$requestEvent$2", f = "HotelBrowseViewModels.kt", l = {257}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.hotels.HotelSelectionViewModel$requestEvent$2, reason: invalid class name and case insensitive filesystem */
    public final class C122312 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HotelSelection $selection;
        public final /* synthetic */ G2j<String, String, HotelReviewSource, HtJ<? super HsJ<Unit>>, Object> $send;
        public final /* synthetic */ G0V<HotelSelectionUiState, HotelReviewState, HotelSelectionUiState> $updateState;
        public int label;
        public final /* synthetic */ HotelSelectionViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C122312(G2j<? super String, ? super String, ? super HotelReviewSource, ? super HtJ<? super HsJ<Unit>>, ? extends Object> g2j, HotelSelection hotelSelection, HotelSelectionViewModel hotelSelectionViewModel, G0V<? super HotelSelectionUiState, ? super HotelReviewState, HotelSelectionUiState> g0v, HtJ<? super C122312> htJ) {
            super(2, htJ);
            this.$send = g2j;
            this.$selection = hotelSelection;
            this.this$0 = hotelSelectionViewModel;
            this.$updateState = g0v;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C122312(this.$send, this.$selection, this.this$0, this.$updateState, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                X.Hji r7 = X.EnumC10460Hji.A02
                int r0 = r8.label
                r6 = 1
                r2 = 0
                if (r0 == 0) goto L6e
                if (r0 != r6) goto L9b
                X.Hwg.A00(r9)
            Ld:
                X.HsJ r9 = (X.HsJ) r9
                java.lang.Object r4 = r9.value
                boolean r0 = r4 instanceof X.C10571Hud
                r0 = r0 ^ 1
                if (r0 == 0) goto L3f
                com.facebook.aura.hotels.HotelReviewState r5 = com.facebook.aura.hotels.HotelReviewState.ACCEPTED
            L19:
                com.facebook.aura.hotels.HotelSelectionViewModel r0 = r8.this$0
                X.BLG<com.facebook.aura.hotels.HotelSelectionUiState> r3 = r0.state
                X.G0V<com.facebook.aura.hotels.HotelSelectionUiState, com.facebook.aura.hotels.HotelReviewState, com.facebook.aura.hotels.HotelSelectionUiState> r2 = r8.$updateState
            L1f:
                java.lang.Object r1 = r3.getValue()
                java.lang.Object r0 = r2.invoke(r1, r5)
                boolean r0 = r3.A6e(r1, r0)
                if (r0 == 0) goto L1f
                boolean r0 = r4 instanceof X.C10571Hud
                r0 = r0 ^ 1
                if (r0 == 0) goto L3c
                com.facebook.aura.hotels.HotelSelectionViewModel r0 = r8.this$0
                X.HzR<kotlin.Unit> r1 = r0.completed
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                r1.AhZ(r0)
            L3c:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            L3f:
                java.lang.Throwable r3 = X.HsJ.A00(r4)
                boolean r0 = r3 instanceof com.facebook.aura.hotels.HotelReviewCapacityException
                if (r0 != 0) goto L68
                r2 = 400(0x190, float:5.6E-43)
                r0 = 499(0x1f3, float:6.99E-43)
                X.ADq r1 = new X.ADq
                r1.<init>(r2, r0)
                boolean r0 = r3 instanceof com.facebook.aura.json.NetworkException
                if (r0 == 0) goto L6b
                com.facebook.aura.json.NetworkException r3 = (com.facebook.aura.json.NetworkException) r3
                if (r3 == 0) goto L6b
                int r0 = r3.httpResponseCode
                java.lang.Integer r0 = X.C3cG.A0R(r0)
                int r0 = r0.intValue()
                boolean r0 = r1.A00(r0)
                if (r0 == 0) goto L6b
            L68:
                com.facebook.aura.hotels.HotelReviewState r5 = com.facebook.aura.hotels.HotelReviewState.REJECTED
                goto L19
            L6b:
                com.facebook.aura.hotels.HotelReviewState r5 = com.facebook.aura.hotels.HotelReviewState.UNCERTAIN
                goto L19
            L6e:
                X.Hwg.A00(r9)
                X.G2j<java.lang.String, java.lang.String, com.facebook.aura.hotels.HotelReviewSource, X.HtJ<? super X.HsJ<kotlin.Unit>>, java.lang.Object> r5 = r8.$send
                com.facebook.aura.hotels.HotelSelection r0 = r8.$selection
                java.lang.String r4 = r0.selectionRef
                com.facebook.aura.hotels.HotelSelectionViewModel r0 = r8.this$0
                com.facebook.aura.hotels.HotelSelectionSheetKey r1 = r0.key
                java.lang.String r3 = r1.sessionId
                if (r3 == 0) goto L99
                java.lang.String r0 = "primary_session_id"
                boolean r0 = r3.equals(r0)
                if (r0 != 0) goto L99
            L87:
                java.lang.String r2 = r1.searchRef
                java.lang.String r1 = r1.resultRef
                com.facebook.aura.hotels.HotelReviewSource r0 = new com.facebook.aura.hotels.HotelReviewSource
                r0.<init>(r2, r1)
                r8.label = r6
                java.lang.Object r9 = r5.invoke(r4, r3, r0, r8)
                if (r9 != r7) goto Ld
                return r7
            L99:
                r3 = r2
                goto L87
            L9b:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelSelectionViewModel.C122312.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C122312) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestEvent(G0U<? super HotelSelection, Boolean> g0u, G2j<? super String, ? super String, ? super HotelReviewSource, ? super HtJ<? super HsJ<Unit>>, ? extends Object> g2j, G0V<? super HotelSelectionUiState, ? super HotelReviewState, HotelSelectionUiState> g0v) {
        HotelLoadState.Loaded loaded;
        HotelSelection hotelSelection;
        HotelSelectionUiState value;
        HotelSelectionUiState value2 = this.state.getValue();
        HotelReviewState hotelReviewState = value2.review;
        HotelReviewState hotelReviewState2 = HotelReviewState.IDLE;
        if (hotelReviewState == hotelReviewState2 && value2.roomDiscussion == hotelReviewState2) {
            HotelLoadState<HotelSelection> hotelLoadState = value2.detail;
            if (!(hotelLoadState instanceof HotelLoadState.Loaded) || (loaded = (HotelLoadState.Loaded) hotelLoadState) == null || (hotelSelection = (HotelSelection) loaded.value) == null || !AnonymousClass003.A1X(hotelSelection, g0u)) {
                return;
            }
            BLG<HotelSelectionUiState> blg = this.state;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, g0v.invoke(value, HotelReviewState.REQUESTING)));
            AnonymousClass001.A1I(AnonymousClass001.A0y(), new C122312(g2j, hotelSelection, this, g0v, null), AEu.A00(this));
        }
    }

    private final void requestBookingReview() {
        requestEvent(C122281.INSTANCE, new C122292(this.repository), C122303.INSTANCE);
    }

    public final void askAboutRooms() {
        requestEvent(AnonymousClass1.INSTANCE, new AnonymousClass2(this.repository), AnonymousClass3.INSTANCE);
    }

    public final C20Q<HotelBookingRequest> getChatBookingRequests() {
        return this.chatBookingRequests;
    }

    public final C20Q<Unit> getCompletionEvents() {
        return this.completionEvents;
    }

    public final C1BN<HotelSelectionUiState> getUiState() {
        return this.uiState;
    }

    public final void load(boolean z) {
        HotelSelectionUiState value;
        HotelSelectionUiState hotelSelectionUiState;
        HotelReviewState hotelReviewState = this.state.getValue().review;
        HotelReviewState hotelReviewState2 = HotelReviewState.REQUESTING;
        if (hotelReviewState == hotelReviewState2 || this.state.getValue().roomDiscussion == hotelReviewState2) {
            return;
        }
        HoC hoC = this.request;
        if (hoC != null) {
            hoC.A5w(null);
        }
        BLG<HotelSelectionUiState> blg = this.state;
        do {
            value = blg.getValue();
            hotelSelectionUiState = value;
        } while (!blg.A6e(value, hotelSelectionUiState.copy(HotelLoadState.Loading.INSTANCE, hotelSelectionUiState.review, hotelSelectionUiState.roomDiscussion, null, null)));
        BLL bllA00 = AEu.A00(this);
        this.request = GAo.A02(C79.A00, AnonymousClass001.A0y(), new C122272(z, null), bllA00);
    }

    public final void onCompletionHandled() {
        HotelSelectionUiState value;
        HotelSelectionUiState hotelSelectionUiStateCopy;
        BLG<HotelSelectionUiState> blg = this.state;
        do {
            value = blg.getValue();
            hotelSelectionUiStateCopy = value;
            if (hotelSelectionUiStateCopy.roomDiscussion == HotelReviewState.ACCEPTED) {
                hotelSelectionUiStateCopy = hotelSelectionUiStateCopy.copy(hotelSelectionUiStateCopy.detail, hotelSelectionUiStateCopy.review, HotelReviewState.IDLE, hotelSelectionUiStateCopy.visitWebsiteUrl, hotelSelectionUiStateCopy.reserveAction);
            }
        } while (!blg.A6e(value, hotelSelectionUiStateCopy));
    }

    public final void reserve() {
        HotelSelectionUiState value = this.state.getValue();
        if (value.getReserveEnabled()) {
            HotelReserveAction hotelReserveAction = value.reserveAction;
            if (C7384Etj.areEqual(hotelReserveAction, HotelReserveAction.NativeReview.INSTANCE)) {
                requestBookingReview();
            } else if (hotelReserveAction instanceof HotelReserveAction.Chat) {
                this.chatBookings.AhZ(((HotelReserveAction.Chat) hotelReserveAction).request);
            } else if (hotelReserveAction != null) {
                throw C3cG.A0q();
            }
        }
    }

    public HotelSelectionViewModel(HotelSelectionSheetKey hotelSelectionSheetKey, HotelDataSource hotelDataSource) {
        boolean zA1b = AnonymousClass004.A1b(hotelSelectionSheetKey, hotelDataSource);
        this.key = hotelSelectionSheetKey;
        this.repository = hotelDataSource;
        HotelLoadState.Loading loading = HotelLoadState.Loading.INSTANCE;
        HotelReviewState hotelReviewState = HotelReviewState.IDLE;
        C9286GCn c9286GCnA14 = C3cG.A14(new HotelSelectionUiState(loading, hotelReviewState, hotelReviewState, null, null));
        this.state = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        Integer num = C79.A00;
        GCV gcvA00 = AbstractC10623Hzj.A00(num, -2);
        this.completed = gcvA00;
        this.completionEvents = Hu1.A01(gcvA00);
        GCV gcvA002 = AbstractC10623Hzj.A00(num, -2);
        this.chatBookings = gcvA002;
        this.chatBookingRequests = Hu1.A01(gcvA002);
        load(zA1b);
    }
}
