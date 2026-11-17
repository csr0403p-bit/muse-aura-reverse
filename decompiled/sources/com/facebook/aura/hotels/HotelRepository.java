package com.facebook.aura.hotels;

import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.C06H;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C78W;
import X.Hxb;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.network.AuraAcceptLanguage;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class HotelRepository implements HotelDataSource, InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public volatile boolean closed;
    public final SingleFlight flights;
    public final LinkedHashMap<String, HotelResults> initialResults;
    public ReadOwner readOwner;
    public final LinkedHashMap<HotelReviewRequestKey, HotelRequestTicket> reviewRequests;
    public final C3UX reviewScope;
    public final AbstractC3358CGz userSession;

    public final class ReadOwner {
        public final HotelReadCache<HotelReviewSource, HotelSelection> details;
        public final String gateway;
        public final String language;
        public final HotelReadCache<String, HotelResults> results;
        public volatile boolean retired;
        public final /* synthetic */ HotelRepository this$0;

        public final void close() {
            this.retired = true;
            this.results.close();
            this.details.close();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean canUse() {
            return !this.this$0.closed && !this.retired && C7384Etj.areEqual(this.gateway, C60O.A0m(HatchGatewayPrefsStore.Companion, this.this$0.userSession)) && C7384Etj.areEqual(this.language, AuraAcceptLanguage.INSTANCE.headerValue());
        }

        public final HotelReadCache<HotelReviewSource, HotelSelection> getDetails() {
            return this.details;
        }

        public final String getGateway() {
            return this.gateway;
        }

        public final String getLanguage() {
            return this.language;
        }

        public final HotelReadCache<String, HotelResults> getResults() {
            return this.results;
        }

        public ReadOwner(HotelRepository hotelRepository, String str, String str2) {
            AnonymousClass003.A0x(str, str2);
            this.this$0 = hotelRepository;
            this.gateway = str;
            this.language = str2;
            this.results = new HotelReadCache<>(hotelRepository.userSession, new HotelRepository$ReadOwner$results$1(this), new HotelRepository$ReadOwner$results$2(hotelRepository, this, null));
            this.details = new HotelReadCache<>(hotelRepository.userSession, new HotelRepository$ReadOwner$details$1(this), new HotelRepository$ReadOwner$details$2(hotelRepository, this, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f A[RETURN] */
    /* renamed from: performEvent-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1075performEventyxL6bBk(com.facebook.aura.hotels.HotelEventKind r11, java.lang.String r12, com.facebook.aura.hotels.HotelReviewSource r13, X.G0U<? super X.HtJ<? super X.HsJ<kotlin.Unit>>, ? extends java.lang.Object> r14, X.HtJ<? super X.HsJ<kotlin.Unit>> r15) {
        /*
            r10 = this;
            r4 = r15
            boolean r0 = r15 instanceof com.facebook.aura.hotels.HotelRepository$performEvent$1
            r6 = r10
            if (r0 == 0) goto L21
            r3 = r4
            com.facebook.aura.hotels.HotelRepository$performEvent$1 r3 = (com.facebook.aura.hotels.HotelRepository$performEvent$1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r3.label = r2
        L14:
            java.lang.Object r0 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r4 = r3.label
            r1 = 1
            if (r4 == 0) goto L2c
            if (r4 != r1) goto L27
            goto La0
        L21:
            com.facebook.aura.hotels.HotelRepository$performEvent$1 r3 = new com.facebook.aura.hotels.HotelRepository$performEvent$1
            r3.<init>(r10, r15)
            goto L14
        L27:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2c:
            X.Hwg.A00(r0)
            r8 = r13
            java.lang.String r4 = r13.searchRef
            java.lang.String r0 = r13.resultRef
            com.facebook.aura.hotels.HotelReviewRequestKey r10 = new com.facebook.aura.hotels.HotelReviewRequestKey
            r9 = r11
            r10.<init>(r11, r4, r0, r12)
            java.util.LinkedHashMap<com.facebook.aura.hotels.HotelReviewRequestKey, com.facebook.aura.hotels.HotelRequestTicket> r5 = r6.reviewRequests
            monitor-enter(r5)
            boolean r0 = r6.closed     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto L4c
            java.lang.String r0 = "Hotel user data was cleared"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)     // Catch: java.lang.Throwable -> Lb8
            X.Hud r0 = X.C3cG.A0s(r0)     // Catch: java.lang.Throwable -> Lb8
            goto L70
        L4c:
            java.util.LinkedHashMap<com.facebook.aura.hotels.HotelReviewRequestKey, com.facebook.aura.hotels.HotelRequestTicket> r0 = r6.reviewRequests     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r7 = r0.get(r10)     // Catch: java.lang.Throwable -> Lb8
            com.facebook.aura.hotels.HotelRequestTicket r7 = (com.facebook.aura.hotels.HotelRequestTicket) r7     // Catch: java.lang.Throwable -> Lb8
            if (r7 == 0) goto L5d
            X.HsJ<kotlin.Unit> r0 = r7.result     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r0.value     // Catch: java.lang.Throwable -> Lb8
            goto L70
        L5d:
            java.util.LinkedHashMap<com.facebook.aura.hotels.HotelReviewRequestKey, com.facebook.aura.hotels.HotelRequestTicket> r0 = r6.reviewRequests     // Catch: java.lang.Throwable -> Lb8
            int r4 = r0.size()     // Catch: java.lang.Throwable -> Lb8
            r0 = 128(0x80, float:1.794E-43)
            if (r4 < r0) goto L72
            com.facebook.aura.hotels.HotelReviewCapacityException r0 = new com.facebook.aura.hotels.HotelReviewCapacityException     // Catch: java.lang.Throwable -> Lb8
            r0.<init>()     // Catch: java.lang.Throwable -> Lb8
            X.Hud r0 = X.C3cG.A0s(r0)     // Catch: java.lang.Throwable -> Lb8
        L70:
            monitor-exit(r5)
            return r0
        L72:
            com.facebook.aura.hotels.HotelRequestTicket r7 = new com.facebook.aura.hotels.HotelRequestTicket     // Catch: java.lang.Throwable -> Lb8
            r7.<init>(r14)     // Catch: java.lang.Throwable -> Lb8
            java.util.LinkedHashMap<com.facebook.aura.hotels.HotelReviewRequestKey, com.facebook.aura.hotels.HotelRequestTicket> r0 = r6.reviewRequests     // Catch: java.lang.Throwable -> Lb8
            r0.put(r10, r7)     // Catch: java.lang.Throwable -> Lb8
        L7c:
            monitor-exit(r5)
            X.3UX r0 = r6.reviewScope
            r11 = 0
            com.facebook.aura.hotels.HotelRepository$performEvent$pending$1 r5 = new com.facebook.aura.hotels.HotelRepository$performEvent$pending$1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.Hrx r0 = X.AnonymousClass001.A10(r5, r0)
            r3.L$0 = r11     // Catch: java.util.concurrent.CancellationException -> La8
            r3.L$1 = r11     // Catch: java.util.concurrent.CancellationException -> La8
            r3.L$2 = r11     // Catch: java.util.concurrent.CancellationException -> La8
            r3.L$3 = r11     // Catch: java.util.concurrent.CancellationException -> La8
            r3.L$4 = r11     // Catch: java.util.concurrent.CancellationException -> La8
            r3.L$5 = r11     // Catch: java.util.concurrent.CancellationException -> La8
            r3.L$6 = r11     // Catch: java.util.concurrent.CancellationException -> La8
            r3.label = r1     // Catch: java.util.concurrent.CancellationException -> La8
            java.lang.Object r0 = r0.A0E(r3)     // Catch: java.util.concurrent.CancellationException -> La8
            if (r0 != r2) goto La3
            return r2
        La0:
            X.Hwg.A00(r0)     // Catch: java.util.concurrent.CancellationException -> La8
        La3:
            X.HsJ r0 = (X.HsJ) r0     // Catch: java.util.concurrent.CancellationException -> La8
            java.lang.Object r0 = r0.value     // Catch: java.util.concurrent.CancellationException -> La8
            return r0
        La8:
            r2 = move-exception
            X.C3cG.A1H(r3)
            java.lang.String r1 = "Hotel user data was cleared"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            X.Hud r0 = X.C3cG.A0s(r0)
            return r0
        Lb8:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelRepository.m1075performEventyxL6bBk(com.facebook.aura.hotels.HotelEventKind, java.lang.String, com.facebook.aura.hotels.HotelReviewSource, X.G0U, X.HtJ):java.lang.Object");
    }

    public final void prefetchDetails(List<HotelReviewSource> list) {
        C7384Etj.A0Y(list, 0);
        synchronized (this.reviewRequests) {
            if (!this.closed) {
                currentReadOwner().details.prefetch(list);
            }
        }
    }

    public final void rememberInitialResults(HotelResults hotelResults) {
        C7384Etj.A0Y(hotelResults, 0);
        synchronized (this.reviewRequests) {
            if (!this.closed) {
                this.initialResults.remove(hotelResults.searchRef);
                this.initialResults.put(hotelResults.searchRef, hotelResults);
                LinkedHashMap<String, HotelResults> linkedHashMap = this.initialResults;
                if (linkedHashMap.size() > 16) {
                    Set<String> setKeySet = linkedHashMap.keySet();
                    C7384Etj.A0U(setKeySet);
                    linkedHashMap.remove(AbstractC0878AGe.A0B(setKeySet));
                }
            }
        }
    }

    public final HotelResults takeInitialResults(String str) {
        HotelResults hotelResultsRemove;
        C7384Etj.A0Y(str, 0);
        synchronized (this.reviewRequests) {
            hotelResultsRemove = this.closed ? null : this.initialResults.remove(str);
        }
        return hotelResultsRemove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReadOwner currentReadOwner() {
        ReadOwner readOwner;
        synchronized (this.reviewRequests) {
            if (this.closed) {
                throw C3cG.A0Q("Hotel user data was cleared");
            }
            String strA0m = C60O.A0m(HatchGatewayPrefsStore.Companion, this.userSession);
            String strHeaderValue = AuraAcceptLanguage.INSTANCE.headerValue();
            readOwner = this.readOwner;
            if (readOwner == null || !C7384Etj.areEqual(readOwner.gateway, strA0m) || !C7384Etj.areEqual(readOwner.language, strHeaderValue)) {
                readOwner = new ReadOwner(this, strA0m, strHeaderValue);
                ReadOwner readOwner2 = this.readOwner;
                if (readOwner2 != null) {
                    readOwner2.close();
                }
                this.readOwner = readOwner;
            }
        }
        return readOwner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* renamed from: postBookingReview-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1076postBookingReview0E7RQCE(java.lang.String r6, java.lang.String r7, X.HtJ<? super X.HsJ<kotlin.Unit>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.facebook.aura.hotels.HotelRepository$postBookingReview$1
            if (r0 == 0) goto L38
            r4 = r8
            com.facebook.aura.hotels.HotelRepository$postBookingReview$1 r4 = (com.facebook.aura.hotels.HotelRepository$postBookingReview$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L38
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L22
            if (r0 != r2) goto L3e
            java.lang.Object r0 = X.AnonymousClass001.A0q(r1)
        L21:
            return r0
        L22:
            X.Hwg.A00(r1)
            r1 = 0
            com.facebook.aura.hotels.HotelRepository$postBookingReview$2 r0 = new com.facebook.aura.hotels.HotelRepository$postBookingReview$2
            r0.<init>(r6, r7, r5, r1)
            r4.L$0 = r1
            r4.L$1 = r1
            r4.label = r2
            java.lang.Object r0 = r5.m1078requestgIAlus(r0, r4)
            if (r0 != r3) goto L21
            return r3
        L38:
            com.facebook.aura.hotels.HotelRepository$postBookingReview$1 r4 = new com.facebook.aura.hotels.HotelRepository$postBookingReview$1
            r4.<init>(r5, r8)
            goto L12
        L3e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelRepository.m1076postBookingReview0E7RQCE(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* renamed from: postRoomDiscussion-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1077postRoomDiscussion0E7RQCE(java.lang.String r6, java.lang.String r7, X.HtJ<? super X.HsJ<kotlin.Unit>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.facebook.aura.hotels.HotelRepository$postRoomDiscussion$1
            if (r0 == 0) goto L38
            r4 = r8
            com.facebook.aura.hotels.HotelRepository$postRoomDiscussion$1 r4 = (com.facebook.aura.hotels.HotelRepository$postRoomDiscussion$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L38
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L22
            if (r0 != r2) goto L3e
            java.lang.Object r0 = X.AnonymousClass001.A0q(r1)
        L21:
            return r0
        L22:
            X.Hwg.A00(r1)
            r1 = 0
            com.facebook.aura.hotels.HotelRepository$postRoomDiscussion$2 r0 = new com.facebook.aura.hotels.HotelRepository$postRoomDiscussion$2
            r0.<init>(r6, r7, r5, r1)
            r4.L$0 = r1
            r4.L$1 = r1
            r4.label = r2
            java.lang.Object r0 = r5.m1078requestgIAlus(r0, r4)
            if (r0 != r3) goto L21
            return r3
        L38:
            com.facebook.aura.hotels.HotelRepository$postRoomDiscussion$1 r4 = new com.facebook.aura.hotels.HotelRepository$postRoomDiscussion$1
            r4.<init>(r5, r8)
            goto L12
        L3e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelRepository.m1077postRoomDiscussion0E7RQCE(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* renamed from: request-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object m1078requestgIAlus(X.G0U<? super X.HtJ<? super X.HsJ<? extends T>>, ? extends java.lang.Object> r6, X.HtJ<? super X.HsJ<? extends T>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.hotels.HotelRepository$request$1
            if (r0 == 0) goto L1e
            r4 = r7
            com.facebook.aura.hotels.HotelRepository$request$1 r4 = (com.facebook.aura.hotels.HotelRepository$request$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L24
            goto L38
        L1e:
            com.facebook.aura.hotels.HotelRepository$request$1 r4 = new com.facebook.aura.hotels.HotelRepository$request$1
            r4.<init>(r5, r7)
            goto L12
        L24:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L46
            r4.label = r1     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L46
            java.lang.Object r3 = r6.invoke(r4)     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L46
            if (r3 != r2) goto L3b
            return r2
        L38:
            X.Hwg.A00(r3)     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L46
        L3b:
            X.HsJ r3 = (X.HsJ) r3     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L46
            java.lang.Object r2 = r3.value     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L46
            return r2
        L40:
            r0 = move-exception
            X.Hud r0 = X.C3cG.A0s(r0)
            return r0
        L46:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelRepository.m1078requestgIAlus(X.G0U, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    @Override // com.facebook.aura.hotels.HotelDataSource
    /* renamed from: askAboutRooms-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo1058askAboutRoomsBWLJW6A(java.lang.String r10, java.lang.String r11, com.facebook.aura.hotels.HotelReviewSource r12, X.HtJ<? super X.HsJ<kotlin.Unit>> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.facebook.aura.hotels.HotelRepository$askAboutRooms$1
            r4 = r9
            if (r0 == 0) goto L3f
            r9 = r13
            com.facebook.aura.hotels.HotelRepository$askAboutRooms$1 r9 = (com.facebook.aura.hotels.HotelRepository$askAboutRooms$1) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r9.label = r2
        L13:
            java.lang.Object r3 = r9.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r9.label
            r1 = 1
            if (r0 == 0) goto L23
            if (r0 != r1) goto L45
            java.lang.Object r0 = X.AnonymousClass001.A0q(r3)
        L22:
            return r0
        L23:
            X.Hwg.A00(r3)
            com.facebook.aura.hotels.HotelEventKind r5 = com.facebook.aura.hotels.HotelEventKind.ROOM_DISCUSSION
            r0 = 0
            com.facebook.aura.hotels.HotelRepository$askAboutRooms$2 r8 = new com.facebook.aura.hotels.HotelRepository$askAboutRooms$2
            r6 = r11
            r8.<init>(r4, r10, r11, r0)
            r9.L$0 = r0
            r9.L$1 = r0
            r9.L$2 = r0
            r9.label = r1
            r7 = r12
            java.lang.Object r0 = r4.m1075performEventyxL6bBk(r5, r6, r7, r8, r9)
            if (r0 != r2) goto L22
            return r2
        L3f:
            com.facebook.aura.hotels.HotelRepository$askAboutRooms$1 r9 = new com.facebook.aura.hotels.HotelRepository$askAboutRooms$1
            r9.<init>(r4, r13)
            goto L13
        L45:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelRepository.mo1058askAboutRoomsBWLJW6A(java.lang.String, java.lang.String, com.facebook.aura.hotels.HotelReviewSource, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        synchronized (this.reviewRequests) {
            this.closed = true;
            this.reviewRequests.clear();
            this.initialResults.clear();
            ReadOwner readOwner = this.readOwner;
            if (readOwner != null) {
                readOwner.close();
            }
            this.readOwner = null;
        }
        Hxb.A03(null, this.reviewScope);
        this.flights.clearAndCancelAll();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    @Override // com.facebook.aura.hotels.HotelDataSource
    /* renamed from: details-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo1059detailsBWLJW6A(java.lang.String r7, java.lang.String r8, boolean r9, X.HtJ<? super X.HsJ<com.facebook.aura.hotels.HotelSelection>> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.facebook.aura.hotels.HotelRepository$details$1
            if (r0 == 0) goto L3a
            r4 = r10
            com.facebook.aura.hotels.HotelRepository$details$1 r4 = (com.facebook.aura.hotels.HotelRepository$details$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L22
            if (r1 != r0) goto L40
            java.lang.Object r0 = X.AnonymousClass001.A0q(r3)
        L21:
            return r0
        L22:
            X.Hwg.A00(r3)
            r10 = 0
            com.facebook.aura.hotels.HotelRepository$details$2 r5 = new com.facebook.aura.hotels.HotelRepository$details$2
            r5.<init>(r6, r7, r8, r9, r10)
            r4.L$0 = r10
            r4.L$1 = r10
            r4.Z$0 = r9
            r4.label = r0
            java.lang.Object r0 = r6.m1078requestgIAlus(r5, r4)
            if (r0 != r2) goto L21
            return r2
        L3a:
            com.facebook.aura.hotels.HotelRepository$details$1 r4 = new com.facebook.aura.hotels.HotelRepository$details$1
            r4.<init>(r6, r10)
            goto L12
        L40:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelRepository.mo1059detailsBWLJW6A(java.lang.String, java.lang.String, boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    @Override // com.facebook.aura.hotels.HotelDataSource
    /* renamed from: requestBookingReview-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo1060requestBookingReviewBWLJW6A(java.lang.String r10, java.lang.String r11, com.facebook.aura.hotels.HotelReviewSource r12, X.HtJ<? super X.HsJ<kotlin.Unit>> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.facebook.aura.hotels.HotelRepository$requestBookingReview$1
            r4 = r9
            if (r0 == 0) goto L3f
            r9 = r13
            com.facebook.aura.hotels.HotelRepository$requestBookingReview$1 r9 = (com.facebook.aura.hotels.HotelRepository$requestBookingReview$1) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r9.label = r2
        L13:
            java.lang.Object r3 = r9.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r9.label
            r1 = 1
            if (r0 == 0) goto L23
            if (r0 != r1) goto L45
            java.lang.Object r0 = X.AnonymousClass001.A0q(r3)
        L22:
            return r0
        L23:
            X.Hwg.A00(r3)
            com.facebook.aura.hotels.HotelEventKind r5 = com.facebook.aura.hotels.HotelEventKind.BOOKING_REVIEW
            r0 = 0
            com.facebook.aura.hotels.HotelRepository$requestBookingReview$2 r8 = new com.facebook.aura.hotels.HotelRepository$requestBookingReview$2
            r6 = r11
            r8.<init>(r4, r10, r11, r0)
            r9.L$0 = r0
            r9.L$1 = r0
            r9.L$2 = r0
            r9.label = r1
            r7 = r12
            java.lang.Object r0 = r4.m1075performEventyxL6bBk(r5, r6, r7, r8, r9)
            if (r0 != r2) goto L22
            return r2
        L3f:
            com.facebook.aura.hotels.HotelRepository$requestBookingReview$1 r9 = new com.facebook.aura.hotels.HotelRepository$requestBookingReview$1
            r9.<init>(r4, r13)
            goto L13
        L45:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelRepository.mo1060requestBookingReviewBWLJW6A(java.lang.String, java.lang.String, com.facebook.aura.hotels.HotelReviewSource, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    @Override // com.facebook.aura.hotels.HotelDataSource
    /* renamed from: results-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo1061results0E7RQCE(java.lang.String r6, boolean r7, X.HtJ<? super X.HsJ<com.facebook.aura.hotels.HotelResults>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.facebook.aura.hotels.HotelRepository$results$1
            if (r0 == 0) goto L38
            r4 = r8
            com.facebook.aura.hotels.HotelRepository$results$1 r4 = (com.facebook.aura.hotels.HotelRepository$results$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L38
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L22
            if (r0 != r2) goto L3e
            java.lang.Object r0 = X.AnonymousClass001.A0q(r1)
        L21:
            return r0
        L22:
            X.Hwg.A00(r1)
            r1 = 0
            com.facebook.aura.hotels.HotelRepository$results$2 r0 = new com.facebook.aura.hotels.HotelRepository$results$2
            r0.<init>(r5, r6, r7, r1)
            r4.L$0 = r1
            r4.Z$0 = r7
            r4.label = r2
            java.lang.Object r0 = r5.m1078requestgIAlus(r0, r4)
            if (r0 != r3) goto L21
            return r3
        L38:
            com.facebook.aura.hotels.HotelRepository$results$1 r4 = new com.facebook.aura.hotels.HotelRepository$results$1
            r4.<init>(r5, r8)
            goto L12
        L3e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelRepository.mo1061results0E7RQCE(java.lang.String, boolean, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final HotelRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HotelRepository) abstractC3358CGz.A03(HotelRepository.class, new HotelRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HotelRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.reviewScope = C78W.A03();
        this.flights = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, true);
        this.reviewRequests = C3cG.A0j();
        this.initialResults = C3cG.A0j();
    }

    @Override // com.facebook.aura.hotels.HotelDataSource
    public void invalidateDetails(String str, String str2) {
        HotelReadCache<HotelReviewSource, HotelSelection> hotelReadCache;
        AnonymousClass003.A0u(str, str2);
        synchronized (this.reviewRequests) {
            ReadOwner readOwner = this.readOwner;
            if (readOwner != null && (hotelReadCache = readOwner.details) != null) {
                hotelReadCache.invalidate(new HotelReviewSource(str, str2));
            }
        }
    }

    public /* synthetic */ HotelRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
