package com.facebook.aura.spaces.repo;

import X.AGH;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AII;
import X.AIM;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.BzK;
import X.C06H;
import X.C1BN;
import X.C20Z;
import X.C22I;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C4oT;
import X.C60O;
import X.C6ys;
import X.C7384Etj;
import X.C78T;
import X.C79;
import X.C7BY;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzC;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.common.prefs.AuraVMPrefStore;
import com.facebook.aura.common.prefs.AuraVMPrefs;
import com.facebook.aura.devices.pairing.HatchDeviceBleManagerKt;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.navigation.key.SpaceNavigationIdKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class PinnedItemsRepository implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public static final AHD<String> DEFAULT_PINNED_IDS = AGI.A0E("explore", "goals", "library");
    public static final String KEY_NAVIGATION_NAVBAR_COUNT = "navigation_navbar_count";
    public static final String KEY_NAVIGATION_ORDER = "navigation_order";
    public static final String KEY_PINNED_IDS = "pinned_ids";
    public static final String KEY_SPACES_ORDER = "spaces_order";
    public static final int MAX_PINNED_ITEMS = 3;
    public static final int MIN_PINNED_ITEMS = 3;
    public static final String SEPARATOR = ",";
    public static final String TAG = "PinnedItemsRepository";
    public final BLG<Integer> _navigationNavbarCount;
    public final BLG<AHD<String>> _navigationOrder;
    public final BLG<AHD<String>> _pinnedItemIds;
    public final BLG<AHD<String>> _spacesOrder;
    public boolean hasDeferredNavigationOrderRefresh;
    public final C3UX invalidationScope;
    public NavigationOrderPayload lastPersistedServerOrder;
    public final C1BN<Integer> navigationNavbarCount;
    public final C1BN<AHD<String>> navigationOrder;
    public final Object navigationOrderPersistenceLock;
    public SingleFlight navigationOrderRefreshSingleFlight;
    public volatile long navigationOrderRevision;
    public final Object navigationOrderStateLock;
    public long navigationOrderSyncGeneration;
    public SingleFlight navigationOrderSyncSingleFlight;
    public NavigationOrderPayload pendingServerOrder;
    public final C1BN<AHD<String>> pinnedItemIds;
    public final C3Em<Unit> refreshRequests;
    public C3UX scope;
    public final C1BN<AHD<String>> spacesOrder;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.spaces.repo.PinnedItemsRepository$1", f = "PinnedItemsRepository.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.repo.PinnedItemsRepository$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        /* renamed from: com.facebook.aura.spaces.repo.PinnedItemsRepository$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03821<T> implements C20Z {
            public final /* synthetic */ PinnedItemsRepository this$0;

            public C03821(PinnedItemsRepository pinnedItemsRepository) {
                this.this$0 = pinnedItemsRepository;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(kotlin.Unit r6, X.HtJ<? super kotlin.Unit> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.facebook.aura.spaces.repo.PinnedItemsRepository$1$1$emit$1
                    if (r0 == 0) goto L34
                    r4 = r7
                    com.facebook.aura.spaces.repo.PinnedItemsRepository$1$1$emit$1 r4 = (com.facebook.aura.spaces.repo.PinnedItemsRepository$1$1$emit$1) r4
                    int r2 = r4.label
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r2 & r1
                    if (r0 == 0) goto L34
                    int r2 = r2 - r1
                    r4.label = r2
                L12:
                    java.lang.Object r1 = r4.result
                    X.Hji r3 = X.EnumC10460Hji.A02
                    int r0 = r4.label
                    r2 = 1
                    if (r0 == 0) goto L23
                    if (r0 != r2) goto L3a
                    X.Hwg.A00(r1)
                L20:
                    kotlin.Unit r3 = kotlin.Unit.INSTANCE
                    return r3
                L23:
                    X.Hwg.A00(r1)
                    com.facebook.aura.spaces.repo.PinnedItemsRepository r1 = r5.this$0
                    r0 = 0
                    r4.L$0 = r0
                    r4.label = r2
                    java.lang.Object r0 = r1.m2183refreshNavigationOrderIoAF18A(r4)
                    if (r0 != r3) goto L20
                    return r3
                L34:
                    com.facebook.aura.spaces.repo.PinnedItemsRepository$1$1$emit$1 r4 = new com.facebook.aura.spaces.repo.PinnedItemsRepository$1$1$emit$1
                    r4.<init>(r5, r7)
                    goto L12
                L3a:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.repo.PinnedItemsRepository.AnonymousClass1.C03821.emit(kotlin.Unit, X.HtJ):java.lang.Object");
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
                return emit((Unit) obj, (HtJ<? super Unit>) htJ);
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PinnedItemsRepository.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return PinnedItemsRepository.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                PinnedItemsRepository pinnedItemsRepository = PinnedItemsRepository.this;
                int i2 = PinnedItemsRepository.MAX_PINNED_ITEMS;
                C3Em<Unit> c3Em = pinnedItemsRepository.refreshRequests;
                C03821 c03821 = new C03821(pinnedItemsRepository);
                this.label = 1;
                if (c3Em.collect(c03821, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.repo.PinnedItemsRepository$2", f = "PinnedItemsRepository.kt", l = {114}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.repo.PinnedItemsRepository$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchGatewayConnection $gateway;
        public int label;
        public final /* synthetic */ PinnedItemsRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchGatewayConnection hatchGatewayConnection, PinnedItemsRepository pinnedItemsRepository, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$gateway = hatchGatewayConnection;
            this.this$0 = pinnedItemsRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$gateway, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C22I<Unit> c22i = this.$gateway.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().navigationTabOrderUpdated;
                final PinnedItemsRepository pinnedItemsRepository = this.this$0;
                C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.spaces.repo.PinnedItemsRepository.2.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        pinnedItemsRepository.invalidateOrder();
                        return Unit.INSTANCE;
                    }

                    public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                        pinnedItemsRepository.invalidateOrder();
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c22i.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.repo.PinnedItemsRepository$3", f = "PinnedItemsRepository.kt", l = {117}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.repo.PinnedItemsRepository$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchGatewayConnection $gateway;
        public int label;
        public final /* synthetic */ PinnedItemsRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchGatewayConnection hatchGatewayConnection, PinnedItemsRepository pinnedItemsRepository, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$gateway = hatchGatewayConnection;
            this.this$0 = pinnedItemsRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass3(this.$gateway, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C22I<JsonObject> c22i = this.$gateway.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().artifactsSnapshotEvents;
                final PinnedItemsRepository pinnedItemsRepository = this.this$0;
                C20Z<? super JsonObject> c20z = new C20Z() { // from class: com.facebook.aura.spaces.repo.PinnedItemsRepository.3.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        pinnedItemsRepository.invalidateOrder();
                        return Unit.INSTANCE;
                    }

                    public final Object emit(JsonObject jsonObject, HtJ<? super Unit> htJ) {
                        pinnedItemsRepository.invalidateOrder();
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c22i.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Companion {
        public final PinnedItemsRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (PinnedItemsRepository) abstractC3358CGz.A03(PinnedItemsRepository.class, new PinnedItemsRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public final AHD<String> getDEFAULT_PINNED_IDS() {
            return PinnedItemsRepository.DEFAULT_PINNED_IDS;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final class NavigationOrderPreferenceSnapshot {
        public final Integer navbarCount;
        public final AHD<String> order;
        public final long revision;

        public NavigationOrderPreferenceSnapshot(AHD<String> ahd, Integer num, long j) {
            C7384Etj.A0Y(ahd, 0);
            this.order = ahd;
            this.navbarCount = num;
            this.revision = j;
        }

        public final Integer getNavbarCount() {
            return this.navbarCount;
        }

        public final AHD<String> getOrder() {
            return this.order;
        }

        public final long getRevision() {
            return this.revision;
        }
    }

    public final class NavigationOrderRefreshCancelledException extends Exception {
        public NavigationOrderRefreshCancelledException() {
            super("Navigation order refresh was cancelled");
        }
    }

    public final class NavigationOrderStateSnapshot {
        public final Integer navbarCount;
        public final AHD<String> order;
        public final long revision;
        public final long syncGeneration;

        public NavigationOrderStateSnapshot(long j, long j2, AHD<String> ahd, Integer num) {
            C7384Etj.A0Y(ahd, 2);
            this.revision = j;
            this.syncGeneration = j2;
            this.order = ahd;
            this.navbarCount = num;
        }

        public final Integer getNavbarCount() {
            return this.navbarCount;
        }

        public final AHD<String> getOrder() {
            return this.order;
        }

        public final long getRevision() {
            return this.revision;
        }

        public final long getSyncGeneration() {
            return this.syncGeneration;
        }
    }

    public final class NavigationOrderSyncLaunch {
        public final long generation;
        public final NavigationOrderPayload order;
        public final C3UX scope;
        public final SingleFlight singleFlight;

        public NavigationOrderSyncLaunch(long j, NavigationOrderPayload navigationOrderPayload, C3UX c3ux, SingleFlight singleFlight) {
            AnonymousClass005.A11(navigationOrderPayload, c3ux, singleFlight, 1);
            this.generation = j;
            this.order = navigationOrderPayload;
            this.scope = c3ux;
            this.singleFlight = singleFlight;
        }

        public final long getGeneration() {
            return this.generation;
        }

        public final NavigationOrderPayload getOrder() {
            return this.order;
        }

        public final C3UX getScope() {
            return this.scope;
        }

        public final SingleFlight getSingleFlight() {
            return this.singleFlight;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.repo.PinnedItemsRepository", f = "PinnedItemsRepository.kt", l = {HatchMessageShareDocumentRenderer.MIN_IMAGE_HEIGHT_PX}, m = "persistNavigationOrderToServer", v = 2)
    /* renamed from: com.facebook.aura.spaces.repo.PinnedItemsRepository$persistNavigationOrderToServer$1, reason: invalid class name and case insensitive filesystem */
    public final class C139251 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;
        public /* synthetic */ Object result;

        public C139251(HtJ<? super C139251> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PinnedItemsRepository.this.persistNavigationOrderToServer(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.repo.PinnedItemsRepository$setNavigationOrderFromUser$2", f = "PinnedItemsRepository.kt", l = {HatchDeviceBleManagerKt.REQUESTED_MTU}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.repo.PinnedItemsRepository$setNavigationOrderFromUser$2, reason: invalid class name and case insensitive filesystem */
    public final class C139262 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ NavigationOrderSyncLaunch $syncLaunch;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public final /* synthetic */ PinnedItemsRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139262(NavigationOrderSyncLaunch navigationOrderSyncLaunch, PinnedItemsRepository pinnedItemsRepository, HtJ<? super C139262> htJ) {
            super(2, htJ);
            this.$syncLaunch = navigationOrderSyncLaunch;
            this.this$0 = pinnedItemsRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C139262(this.$syncLaunch, this.this$0, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x004a A[Catch: all -> 0x0095, TryCatch #2 {all -> 0x0095, blocks: (B:10:0x0041, B:11:0x0044, B:13:0x004a, B:14:0x0052, B:15:0x0055, B:31:0x0090, B:32:0x0094), top: B:67:0x0041 }] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0055 A[Catch: all -> 0x0095, TryCatch #2 {all -> 0x0095, blocks: (B:10:0x0041, B:11:0x0044, B:13:0x004a, B:14:0x0052, B:15:0x0055, B:31:0x0090, B:32:0x0094), top: B:67:0x0041 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[Catch: all -> 0x00e2, TRY_ENTER, TryCatch #1 {, blocks: (B:20:0x0068, B:22:0x0070, B:24:0x007a, B:26:0x0080, B:27:0x0084, B:29:0x0088, B:30:0x008d, B:44:0x00ad, B:46:0x00b5, B:48:0x00bf, B:50:0x00c5, B:51:0x00c9, B:53:0x00cd), top: B:66:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00ad A[Catch: all -> 0x00e2, TRY_ENTER, TryCatch #1 {, blocks: (B:20:0x0068, B:22:0x0070, B:24:0x007a, B:26:0x0080, B:27:0x0084, B:29:0x0088, B:30:0x008d, B:44:0x00ad, B:46:0x00b5, B:48:0x00bf, B:50:0x00c5, B:51:0x00c9, B:53:0x00cd), top: B:66:0x0006 }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 229
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.repo.PinnedItemsRepository.C139262.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C139262) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final int coerceNavigationNavbarCount(int i, int i2) {
        if (i2 > 0 && i >= 0) {
            return i > i2 ? i2 : i;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* renamed from: refreshNavigationOrderOnce-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2182refreshNavigationOrderOnceIoAF18A(X.HtJ<? super X.HsJ<? extends X.AHD<java.lang.String>>> r31) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.repo.PinnedItemsRepository.m2182refreshNavigationOrderOnceIoAF18A(X.HtJ):java.lang.Object");
    }

    public final void pin(String str) {
        AHD<String> value;
        AHD<String> ahdA07;
        C7384Etj.A0Y(str, 0);
        BLG<AHD<String>> blg = this._pinnedItemIds;
        do {
            value = blg.getValue();
            ahdA07 = value;
            if (!ahdA07.contains(str)) {
                ArrayList arrayList = new ArrayList(ahdA07);
                if (arrayList.size() >= 3) {
                    arrayList.remove(arrayList.size() - 1);
                }
                ahdA07 = AGI.A07(AbstractC0878AGe.A0P(arrayList, Collections.singletonList(str)));
            }
        } while (!blg.A6e(value, ahdA07));
        persistPinnedIds();
    }

    public final void setNavigationOrder(List<String> list) {
        C7384Etj.A0Y(list, 0);
        ArrayList arrayListA0h = C3cG.A0h();
        for (String str : list) {
            AnonymousClass006.A1F(str, str, arrayListA0h);
        }
        AHD<String> ahdA07 = AGI.A07(C3cG.A0m(arrayListA0h));
        synchronized (this.navigationOrderStateLock) {
            Integer value = this._navigationNavbarCount.getValue();
            Integer numCoerceNavigationNavbarCountOrNull = value != null ? coerceNavigationNavbarCountOrNull(value.intValue(), ahdA07.size()) : null;
            if (C7384Etj.areEqual(this._navigationOrder.getValue(), ahdA07) && C7384Etj.areEqual(this._navigationNavbarCount.getValue(), numCoerceNavigationNavbarCountOrNull)) {
                return;
            }
            this.navigationOrderRevision++;
            this._navigationOrder.Af8(ahdA07);
            this._navigationNavbarCount.Af8(numCoerceNavigationNavbarCountOrNull);
            long j = this.navigationOrderRevision;
            C7384Etj.A0Y(ahdA07, 0);
            A00(this, numCoerceNavigationNavbarCountOrNull, ahdA07, j);
        }
    }

    public final void unpin(String str) {
        AHD<String> value;
        ArrayList arrayList;
        C7384Etj.A0Y(str, 0);
        BLG<AHD<String>> blg = this._pinnedItemIds;
        do {
            value = blg.getValue();
            ArrayList arrayListA0h = C3cG.A0h();
            for (Object obj : value) {
                if (!str.equals(obj)) {
                    arrayListA0h.add(obj);
                }
            }
            arrayList = new ArrayList(arrayListA0h);
            int size = 3 - arrayList.size();
            if (size > 0) {
                AHD<String> ahd = DEFAULT_PINNED_IDS;
                ArrayList arrayListA0h2 = C3cG.A0h();
                for (Object obj2 : ahd) {
                    if (!arrayList.contains(obj2)) {
                        arrayListA0h2.add(obj2);
                    }
                }
                List listA0a = AbstractC0878AGe.A0a(arrayListA0h2, size);
                ArrayList arrayListA0h3 = C3cG.A0h();
                for (Object obj3 : ahd) {
                    if (arrayList.contains(obj3) || listA0a.contains(obj3)) {
                        arrayListA0h3.add(obj3);
                    }
                }
                ArrayList arrayListA0h4 = C3cG.A0h();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!ahd.contains(next)) {
                        arrayListA0h4.add(next);
                    }
                }
                arrayList = AbstractC0878AGe.A0P(arrayListA0h4, arrayListA0h3);
            }
        } while (!blg.A6e(value, AGI.A07(arrayList)));
        persistPinnedIds();
    }

    public static void A00(PinnedItemsRepository pinnedItemsRepository, Integer num, AHD ahd, long j) {
        synchronized (pinnedItemsRepository.navigationOrderPersistenceLock) {
            if (pinnedItemsRepository.navigationOrderRevision == j && C7384Etj.areEqual(pinnedItemsRepository._navigationOrder.getValue(), ahd) && C7384Etj.areEqual(pinnedItemsRepository._navigationNavbarCount.getValue(), num)) {
                BzK bzKA9q = pinnedItemsRepository.getPrefs().A9q();
                bzKA9q.AYr(KEY_NAVIGATION_ORDER, C3cH.A0e(",", ahd));
                if (num != null) {
                    bzKA9q.AYo(KEY_NAVIGATION_NAVBAR_COUNT, num.intValue());
                } else {
                    bzKA9q.Aae(KEY_NAVIGATION_NAVBAR_COUNT);
                }
                bzKA9q.apply();
            }
        }
    }

    private final Integer coerceNavigationNavbarCountOrNull(int i, int i2) {
        if (i2 <= 0) {
            return null;
        }
        if (i < 0) {
            i = 0;
        } else if (i > i2) {
            i = i2;
        }
        return Integer.valueOf(i);
    }

    private final C4oT getPrefs() {
        return AuraVMPrefs.INSTANCE.get(C3cH.A0a(HatchGatewayPrefsStore.Companion, this.userSession), AuraVMPrefStore.PINNED_ITEMS);
    }

    private final void persistNavigationOrderPreference(NavigationOrderPreferenceSnapshot navigationOrderPreferenceSnapshot) {
        synchronized (this.navigationOrderPersistenceLock) {
            if (this.navigationOrderRevision == navigationOrderPreferenceSnapshot.revision && C7384Etj.areEqual(this._navigationOrder.getValue(), navigationOrderPreferenceSnapshot.order) && C7384Etj.areEqual(this._navigationNavbarCount.getValue(), navigationOrderPreferenceSnapshot.navbarCount)) {
                BzK bzKA9q = getPrefs().A9q();
                bzKA9q.AYr(KEY_NAVIGATION_ORDER, C3cH.A0e(",", navigationOrderPreferenceSnapshot.order));
                Integer num = navigationOrderPreferenceSnapshot.navbarCount;
                if (num != null) {
                    bzKA9q.AYo(KEY_NAVIGATION_NAVBAR_COUNT, num.intValue());
                } else {
                    bzKA9q.Aae(KEY_NAVIGATION_NAVBAR_COUNT);
                }
                bzKA9q.apply();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object persistNavigationOrderToServer(com.facebook.aura.spaces.repo.NavigationOrderPayload r27, X.HtJ<? super java.lang.Boolean> r28) {
        /*
            r26 = this;
            r4 = r28
            boolean r0 = r4 instanceof com.facebook.aura.spaces.repo.PinnedItemsRepository.C139251
            r5 = r26
            if (r0 == 0) goto L9f
            r3 = r4
            com.facebook.aura.spaces.repo.PinnedItemsRepository$persistNavigationOrderToServer$1 r3 = (com.facebook.aura.spaces.repo.PinnedItemsRepository.C139251) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9f
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r4 = r3.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r2 = 1
            if (r0 == 0) goto L39
            if (r0 != r2) goto La6
            java.lang.Object r3 = X.AnonymousClass001.A0q(r4)
        L25:
            java.lang.Throwable r2 = X.HsJ.A00(r3)
            if (r2 == 0) goto L32
            java.lang.String r1 = "PinnedItemsRepository"
            java.lang.String r0 = "Failed to persist navigation order"
            X.CFK.A08(r1, r0, r2)
        L32:
            boolean r0 = r3 instanceof X.C10571Hud
            java.lang.Boolean r1 = X.C3cG.A0P(r0)
            return r1
        L39:
            X.Hwg.A00(r4)
            com.facebook.aura.network.http.HatchHttpApi r6 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.spaces.repo.SpacesJarvisPath$NavigationTabOrder r10 = com.facebook.aura.spaces.repo.SpacesJarvisPath.NavigationTabOrder.INSTANCE
            r0 = r27
            java.util.List<com.facebook.aura.spaces.repo.NavigationTabReferenceJson> r4 = r0.navbar
            java.util.List<com.facebook.aura.spaces.repo.NavigationTabReferenceJson> r0 = r0.spaces
            com.facebook.aura.spaces.repo.NavigationSectionedOrderJson r11 = new com.facebook.aura.spaces.repo.NavigationSectionedOrderJson
            r11.<init>(r4, r0)
            com.facebook.aura.network.http.RequestType r12 = com.facebook.aura.network.http.RequestType.PUT
            X.CGz r13 = r5.userSession
            r9 = 0
            X.HxE[] r0 = new X.HxE[r9]
            java.util.Set r17 = X.AnonymousClass004.A18()
            X.9jH r20 = X.AGH.A0E()
            com.facebook.aura.spaces.repo.PinnedItemsRepository$persistNavigationOrderToServer$$inlined$executeJarvisRequest-Z6QaZII$default$1 r7 = com.facebook.aura.spaces.repo.PinnedItemsRepository$persistNavigationOrderToServer$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.spaces.repo.PinnedItemsRepository$persistNavigationOrderToServer$$inlined$executeJarvisRequest-Z6QaZII$default$2 r8 = com.facebook.aura.spaces.repo.PinnedItemsRepository$persistNavigationOrderToServer$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r14 = 0
            r3.L$0 = r14
            r3.L$1 = r14
            r3.L$2 = r14
            r3.L$3 = r14
            r3.L$4 = r14
            r3.L$5 = r14
            r3.L$6 = r14
            r3.L$7 = r14
            r3.L$8 = r14
            r3.I$0 = r2
            r3.I$1 = r2
            r3.I$2 = r9
            r3.I$3 = r2
            r3.I$4 = r9
            r3.I$5 = r9
            r3.I$6 = r9
            r3.label = r2
            r15 = r14
            r19 = r2
            r21 = r14
            r22 = r9
            r23 = r2
            r24 = r9
            r25 = r9
            r26 = r14
            r27 = r9
            r28 = r3
            r18 = r2
            r16 = r0
            java.lang.Object r3 = r6.m1599executeJarvisRequestWithFof5HsY(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            if (r3 != r1) goto L25
            return r1
        L9f:
            com.facebook.aura.spaces.repo.PinnedItemsRepository$persistNavigationOrderToServer$1 r3 = new com.facebook.aura.spaces.repo.PinnedItemsRepository$persistNavigationOrderToServer$1
            r3.<init>(r4)
            goto L16
        La6:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.repo.PinnedItemsRepository.persistNavigationOrderToServer(com.facebook.aura.spaces.repo.NavigationOrderPayload, X.HtJ):java.lang.Object");
    }

    public final C1BN<Integer> getNavigationNavbarCount() {
        return this.navigationNavbarCount;
    }

    public final C1BN<AHD<String>> getNavigationOrder() {
        return this.navigationOrder;
    }

    public final C1BN<AHD<String>> getPinnedItemIds() {
        return this.pinnedItemIds;
    }

    public final C1BN<AHD<String>> getSpacesOrder() {
        return this.spacesOrder;
    }

    public final void invalidateOrder() {
        C3cG.A1I(this.refreshRequests);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* renamed from: refreshNavigationOrder-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2183refreshNavigationOrderIoAF18A(X.HtJ<? super X.HsJ<? extends X.AHD<java.lang.String>>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.facebook.aura.spaces.repo.PinnedItemsRepository$refreshNavigationOrder$1
            if (r0 == 0) goto L1e
            r6 = r8
            com.facebook.aura.spaces.repo.PinnedItemsRepository$refreshNavigationOrder$1 r6 = (com.facebook.aura.spaces.repo.PinnedItemsRepository$refreshNavigationOrder$1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r0 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r1 = r6.label
            r4 = 1
            if (r1 == 0) goto L29
            if (r1 != r4) goto L24
            goto L4b
        L1e:
            com.facebook.aura.spaces.repo.PinnedItemsRepository$refreshNavigationOrder$1 r6 = new com.facebook.aura.spaces.repo.PinnedItemsRepository$refreshNavigationOrder$1
            r6.<init>(r7, r8)
            goto L12
        L24:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            X.Hwg.A00(r0)
            java.lang.Object r1 = r7.navigationOrderStateLock
            monitor-enter(r1)
            X.3UX r3 = r7.scope     // Catch: java.lang.Throwable -> L60
            com.facebook.aura.common.coroutines.SingleFlight r2 = r7.navigationOrderRefreshSingleFlight     // Catch: java.lang.Throwable -> L60
            monitor-exit(r1)
            r1 = 0
            com.facebook.aura.spaces.repo.PinnedItemsRepository$refreshNavigationOrder$3 r0 = new com.facebook.aura.spaces.repo.PinnedItemsRepository$refreshNavigationOrder$3     // Catch: java.util.concurrent.CancellationException -> L53
            r0.<init>(r2, r7, r1)     // Catch: java.util.concurrent.CancellationException -> L53
            X.Hrx r0 = X.AnonymousClass001.A10(r0, r3)     // Catch: java.util.concurrent.CancellationException -> L53
            r6.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L53
            r6.L$1 = r1     // Catch: java.util.concurrent.CancellationException -> L53
            r6.label = r4     // Catch: java.util.concurrent.CancellationException -> L53
            java.lang.Object r0 = r0.A0E(r6)     // Catch: java.util.concurrent.CancellationException -> L53
            if (r0 != r5) goto L4e
            return r5
        L4b:
            X.Hwg.A00(r0)     // Catch: java.util.concurrent.CancellationException -> L53
        L4e:
            X.HsJ r0 = (X.HsJ) r0     // Catch: java.util.concurrent.CancellationException -> L53
            java.lang.Object r5 = r0.value     // Catch: java.util.concurrent.CancellationException -> L53
            return r5
        L53:
            X.C3cG.A1H(r6)
            com.facebook.aura.spaces.repo.PinnedItemsRepository$NavigationOrderRefreshCancelledException r0 = new com.facebook.aura.spaces.repo.PinnedItemsRepository$NavigationOrderRefreshCancelledException
            r0.<init>()
            X.Hud r0 = X.C3cG.A0s(r0)
            return r0
        L60:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.repo.PinnedItemsRepository.m2183refreshNavigationOrderIoAF18A(X.HtJ):java.lang.Object");
    }

    public PinnedItemsRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        C9286GCn c9286GCnA01 = HnJ.A01(loadPinnedIds());
        this._pinnedItemIds = c9286GCnA01;
        this.pinnedItemIds = C3cG.A11(c9286GCnA01);
        C9286GCn c9286GCnA012 = HnJ.A01(loadSpacesOrder());
        this._spacesOrder = c9286GCnA012;
        this.spacesOrder = C3cG.A11(c9286GCnA012);
        C9286GCn c9286GCnA013 = HnJ.A01(loadNavigationOrder());
        this._navigationOrder = c9286GCnA013;
        this.navigationOrder = C3cG.A11(c9286GCnA013);
        C9286GCn c9286GCnA014 = HnJ.A01(loadNavigationNavbarCount());
        this._navigationNavbarCount = c9286GCnA014;
        this.navigationNavbarCount = C3cG.A11(c9286GCnA014);
        this.navigationOrderStateLock = C3cG.A0T();
        this.navigationOrderPersistenceLock = C3cG.A0T();
        this.navigationOrderRefreshSingleFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
        this.navigationOrderSyncSingleFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Cancel.INSTANCE, false);
        this.scope = C78T.A00();
        this.refreshRequests = C3cG.A12(C79.A01, 0, 1);
        HzC hzCA01 = C78T.A01(AnonymousClass001.A0y(), null);
        this.invalidationScope = hzCA01;
        HatchGatewayConnection hatchGatewayConnectionA05 = C60O.A05(abstractC3358CGz);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        C6ys c6ys = C6ys.A00;
        Integer num = C79.A00;
        GAo.A02(num, c6ys, anonymousClass1, hzCA01);
        GAo.A02(num, c6ys, new AnonymousClass2(hatchGatewayConnectionA05, this, null), hzCA01);
        GAo.A02(num, c6ys, new AnonymousClass3(hatchGatewayConnectionA05, this, null), hzCA01);
    }

    private final Integer loadNavigationNavbarCount() {
        int i = getPrefs().getInt(KEY_NAVIGATION_NAVBAR_COUNT, -1);
        Integer numValueOf = Integer.valueOf(i);
        if (i < 0) {
            return null;
        }
        return numValueOf;
    }

    private final AHD<String> loadNavigationOrder() {
        String strA00 = C4oT.A00(getPrefs(), KEY_NAVIGATION_ORDER);
        if (strA00 == null) {
            return AHI.A01;
        }
        List listA0e = C7BY.A0e(strA00, ",");
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : listA0e) {
            if (!C7BY.A0j((String) obj)) {
                arrayListA0h.add(obj);
            }
        }
        return AGI.A07(C3cG.A0m(arrayListA0h));
    }

    private final AHD<String> loadPinnedIds() {
        String strA00 = C4oT.A00(getPrefs(), KEY_PINNED_IDS);
        if (strA00 != null) {
            List listA0e = C7BY.A0e(strA00, ",");
            ArrayList arrayListA0h = C3cG.A0h();
            for (Object obj : listA0e) {
                if (!C7BY.A0j((String) obj)) {
                    arrayListA0h.add(obj);
                }
            }
            if (!arrayListA0h.isEmpty()) {
                if (arrayListA0h.size() >= 3) {
                    return AGI.A07(arrayListA0h);
                }
                ArrayList arrayList = new ArrayList(arrayListA0h);
                AHD<String> ahd = DEFAULT_PINNED_IDS;
                ArrayList arrayListA0h2 = C3cG.A0h();
                for (Object obj2 : ahd) {
                    if (!arrayList.contains(obj2)) {
                        arrayListA0h2.add(obj2);
                    }
                }
                arrayList.addAll(AbstractC0878AGe.A0a(arrayListA0h2, 3 - arrayList.size()));
                return AGI.A07(arrayList);
            }
        }
        return DEFAULT_PINNED_IDS;
    }

    private final AHD<String> loadSpacesOrder() {
        String strA00 = C4oT.A00(getPrefs(), KEY_SPACES_ORDER);
        if (strA00 == null) {
            return AHI.A01;
        }
        List listA0e = C7BY.A0e(strA00, ",");
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : listA0e) {
            if (!C7BY.A0j((String) obj)) {
                arrayListA0h.add(obj);
            }
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h);
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(C7BY.A0K(SpaceNavigationIdKt.SPACE_NAVIGATION_ID_PREFIX, (String) it.next()));
        }
        return AGI.A07(C3cG.A0m(arrayListA0i));
    }

    private final AHD<String> mergeServerOrderPreservingLocalOnlyPlacement(List<String> list, List<String> list2) {
        Set setA0g = AbstractC0878AGe.A0g(list);
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        LinkedHashMap linkedHashMapA0j2 = C3cG.A0j();
        ArrayList arrayListA0h = C3cG.A0h();
        String str = null;
        for (String str2 : list2) {
            if (setA0g.contains(str2)) {
                if (str == null && !arrayListA0h.isEmpty()) {
                    Object arrayList = linkedHashMapA0j.get(str2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMapA0j.put(str2, arrayList);
                    }
                    ((List) arrayList).addAll(arrayListA0h);
                    arrayListA0h.clear();
                }
                str = str2;
            } else if (str == null) {
                arrayListA0h.add(str2);
            } else {
                Object arrayList2 = linkedHashMapA0j2.get(str);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMapA0j2.put(str, arrayList2);
                }
                ((List) arrayList2).add(str2);
            }
        }
        AII aiiA17 = AIM.A17();
        for (String str3 : list) {
            Collection collection = (Collection) linkedHashMapA0j.get(str3);
            if (collection != null) {
                aiiA17.addAll(collection);
            }
            aiiA17.add(str3);
            Collection collection2 = (Collection) linkedHashMapA0j2.get(str3);
            if (collection2 != null) {
                aiiA17.addAll(collection2);
            }
        }
        aiiA17.addAll(arrayListA0h);
        return AGI.A07(AIM.A18(aiiA17));
    }

    private final C3UX newNavigationOrderScope() {
        return C78T.A00();
    }

    private final void persistPinnedIds() {
        BzK bzKA9q = getPrefs().A9q();
        bzKA9q.AYr(KEY_PINNED_IDS, C3cH.A0e(",", this._pinnedItemIds.getValue()));
        bzKA9q.apply();
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        C3UX c3ux;
        SingleFlight singleFlight;
        SingleFlight singleFlight2;
        AHI ahi;
        HzC hzCA00 = C78T.A00();
        SingleFlight SingleFlight = SingleFlightKt.SingleFlight(this.userSession, OnDuplicateCall.Join.INSTANCE, false);
        SingleFlight SingleFlight2 = SingleFlightKt.SingleFlight(this.userSession, OnDuplicateCall.Cancel.INSTANCE, false);
        synchronized (this.navigationOrderStateLock) {
            c3ux = this.scope;
            singleFlight = this.navigationOrderRefreshSingleFlight;
            singleFlight2 = this.navigationOrderSyncSingleFlight;
            this.navigationOrderRevision++;
            this.navigationOrderSyncGeneration++;
            this.pendingServerOrder = null;
            this.lastPersistedServerOrder = null;
            this.scope = hzCA00;
            this.navigationOrderRefreshSingleFlight = SingleFlight;
            this.navigationOrderSyncSingleFlight = SingleFlight2;
            BLG<AHD<String>> blg = this._navigationOrder;
            ahi = AHI.A01;
            blg.Af8(ahi);
            this._navigationNavbarCount.Af8(null);
        }
        this._pinnedItemIds.Af8(DEFAULT_PINNED_IDS);
        this._spacesOrder.Af8(ahi);
        synchronized (this.navigationOrderPersistenceLock) {
            BzK bzKA9q = getPrefs().A9q();
            bzKA9q.Aae(KEY_PINNED_IDS);
            bzKA9q.Aae(KEY_SPACES_ORDER);
            bzKA9q.Aae(KEY_NAVIGATION_ORDER);
            bzKA9q.Aae(KEY_NAVIGATION_NAVBAR_COUNT);
            bzKA9q.apply();
        }
        singleFlight.clearAndCancelAll();
        singleFlight2.clearAndCancelAll();
        Hxb.A03(null, c3ux);
        Hxb.A03(null, this.invalidationScope);
    }

    public final void setNavigationOrderFromUser(List<String> list, List<NavigationTabReference> list2, int i) {
        NavigationOrderPreferenceSnapshot navigationOrderPreferenceSnapshot;
        NavigationOrderSyncLaunch navigationOrderSyncLaunch;
        String navigationId;
        AnonymousClass003.A0u(list, list2);
        ArrayList arrayListA0h = C3cG.A0h();
        for (String str : list) {
            AnonymousClass006.A1F(str, str, arrayListA0h);
        }
        AHD ahdA07 = AGI.A07(C3cG.A0m(arrayListA0h));
        synchronized (this.navigationOrderStateLock) {
            Integer numCoerceNavigationNavbarCountOrNull = coerceNavigationNavbarCountOrNull(i, ahdA07.size());
            ArrayList arrayListA0h2 = C3cG.A0h();
            Iterator<NavigationTabReference> it = list2.iterator();
            while (it.hasNext()) {
                NavigationTabReferenceJson json = PinnedItemsRepositoryJsonKt.toJson(it.next());
                if (json != null && (navigationId = json.toNavigationId()) != null) {
                    AnonymousClass002.A1J(navigationId, json, arrayListA0h2);
                }
            }
            Map mapA06 = AGH.A06(arrayListA0h2);
            if (C7384Etj.areEqual(this._navigationOrder.getValue(), ahdA07) && C7384Etj.areEqual(this._navigationNavbarCount.getValue(), numCoerceNavigationNavbarCountOrNull)) {
                navigationOrderPreferenceSnapshot = null;
            } else {
                this.navigationOrderRevision++;
                AnonymousClass001.A1E(this._navigationOrder, null, ahdA07);
                this._navigationNavbarCount.Af8(numCoerceNavigationNavbarCountOrNull);
                navigationOrderPreferenceSnapshot = new NavigationOrderPreferenceSnapshot(ahdA07, numCoerceNavigationNavbarCountOrNull, this.navigationOrderRevision);
            }
            int iIntValue = numCoerceNavigationNavbarCountOrNull != null ? numCoerceNavigationNavbarCountOrNull.intValue() : 0;
            List listA0a = AbstractC0878AGe.A0a(ahdA07, iIntValue);
            ArrayList arrayListA0h3 = C3cG.A0h();
            Iterator it2 = listA0a.iterator();
            while (it2.hasNext()) {
                NavigationTabReferenceJson navigationTabReferenceJson = (NavigationTabReferenceJson) mapA06.get(AnonymousClass005.A0j(it2));
                if (navigationTabReferenceJson != null) {
                    arrayListA0h3.add(navigationTabReferenceJson);
                }
            }
            List listA0m = C3cG.A0m(arrayListA0h3);
            List listA0Z = AbstractC0878AGe.A0Z(ahdA07, iIntValue);
            ArrayList arrayListA0h4 = C3cG.A0h();
            Iterator it3 = listA0Z.iterator();
            while (it3.hasNext()) {
                NavigationTabReferenceJson navigationTabReferenceJson2 = (NavigationTabReferenceJson) mapA06.get(AnonymousClass005.A0j(it3));
                if (navigationTabReferenceJson2 != null) {
                    arrayListA0h4.add(navigationTabReferenceJson2);
                }
            }
            List listA0m2 = C3cG.A0m(arrayListA0h4);
            ArrayList arrayListA0h5 = C3cG.A0h();
            for (Object obj : listA0m2) {
                if (!listA0m.contains((NavigationTabReferenceJson) obj)) {
                    arrayListA0h5.add(obj);
                }
            }
            NavigationOrderPayload navigationOrderPayload = new NavigationOrderPayload(listA0m, arrayListA0h5);
            if (navigationOrderPayload.equals(this.lastPersistedServerOrder)) {
                navigationOrderSyncLaunch = null;
            } else {
                long j = this.navigationOrderSyncGeneration + 1;
                this.navigationOrderSyncGeneration = j;
                this.pendingServerOrder = navigationOrderPayload;
                navigationOrderSyncLaunch = new NavigationOrderSyncLaunch(j, navigationOrderPayload, this.scope, this.navigationOrderSyncSingleFlight);
            }
        }
        if (navigationOrderPreferenceSnapshot != null) {
            persistNavigationOrderPreference(navigationOrderPreferenceSnapshot);
        }
        if (navigationOrderSyncLaunch != null) {
            AnonymousClass001.A1J(new C139262(navigationOrderSyncLaunch, this, null), navigationOrderSyncLaunch.scope);
        }
    }

    public /* synthetic */ PinnedItemsRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
