package com.facebook.aura.widgets;

import X.Ab3;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C10543Hqv;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C6O2;
import X.C6PP;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.F1F;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC2261BLa;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.datastore.preferences.core.Preferences;
import com.facebook.aura.feed.view.FeedEditHapticsKt;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.library.repo.PeerSpaceAccess;
import com.facebook.aura.spaces.repo.SpaceCard;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class SpaceWidgetRefresher {
    public static final int $stable = 0;
    public static final SpaceWidgetRefresher INSTANCE = new SpaceWidgetRefresher();
    public static final ConcurrentHashMap<Integer, InterfaceC2261BLa> refreshLocks = C60O.A1C();

    @DebugMetadata(c = "com.facebook.aura.widgets.SpaceWidgetRefresher", f = "SpaceWidgetRefresher.kt", l = {223, 103}, m = "refresh", v = 2)
    /* renamed from: com.facebook.aura.widgets.SpaceWidgetRefresher$refresh$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public boolean Z$0;
        public boolean Z$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpaceWidgetRefresher.this.refresh(null, 0, false, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.SpaceWidgetRefresher", f = "SpaceWidgetRefresher.kt", l = {113, AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS, 130, 132, FeedEditHapticsKt.ZIP_PULSE_AMPLITUDE, 133, FeedEditHapticsKt.ZIP_PULSE_AMPLITUDE, 138, FeedEditHapticsKt.ZIP_PULSE_AMPLITUDE, 151, FeedEditHapticsKt.ZIP_PULSE_AMPLITUDE, 163, 167, FeedEditHapticsKt.ZIP_PULSE_AMPLITUDE, FeedEditHapticsKt.ZIP_PULSE_AMPLITUDE, FeedEditHapticsKt.ZIP_PULSE_AMPLITUDE}, m = "refreshLocked", v = 2)
    /* renamed from: com.facebook.aura.widgets.SpaceWidgetRefresher$refreshLocked$1, reason: invalid class name and case insensitive filesystem */
    public final class C144121 extends HzP {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public boolean Z$0;
        public boolean Z$1;
        public int label;
        public /* synthetic */ Object result;

        public C144121(HtJ<? super C144121> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpaceWidgetRefresher.this.refreshLocked(null, 0, false, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.SpaceWidgetRefresher$refreshLocked$3", f = "SpaceWidgetRefresher.kt", l = {168}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.widgets.SpaceWidgetRefresher$refreshLocked$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
        public final /* synthetic */ int $appWidgetId;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ Bitmap $snapshot;
        public final /* synthetic */ long $snapshotGeneration;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Context context, int i, Bitmap bitmap, long j, HtJ<? super AnonymousClass3> htJ) {
            super(1, htJ);
            this.$context = context;
            this.$appWidgetId = i;
            this.$snapshot = bitmap;
            this.$snapshotGeneration = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass3(this.$context, this.$appWidgetId, this.$snapshot, this.$snapshotGeneration, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SpaceWidgetStore spaceWidgetStore = SpaceWidgetStore.INSTANCE;
                Context context = this.$context;
                int i2 = this.$appWidgetId;
                Bitmap bitmap = this.$snapshot;
                long j = this.$snapshotGeneration;
                this.label = 1;
                obj = spaceWidgetStore.saveSnapshot(context, i2, bitmap, j, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Boolean> htJ) {
            return ((AnonymousClass3) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.SpaceWidgetRefresher$refreshLocked$4", f = "SpaceWidgetRefresher.kt", l = {182}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.widgets.SpaceWidgetRefresher$refreshLocked$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ int $appWidgetId;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ C6PP $glanceId;
        public final /* synthetic */ F1F $isUnavailable;
        public final /* synthetic */ C10543Hqv<Long> $savedAtMs;
        public final /* synthetic */ SpaceWidgetSize $size;
        public final /* synthetic */ Preferences $state;
        public final /* synthetic */ C10543Hqv<String> $vmUrl;
        public int I$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.widgets.SpaceWidgetRefresher$refreshLocked$4$1", f = "SpaceWidgetRefresher.kt", l = {184, 200}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.widgets.SpaceWidgetRefresher$refreshLocked$4$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ int $appWidgetId;
            public final /* synthetic */ Context $context;
            public final /* synthetic */ boolean $dropsOtherVmSnapshot;
            public final /* synthetic */ C6PP $glanceId;
            public final /* synthetic */ F1F $isUnavailable;
            public final /* synthetic */ C10543Hqv<Long> $savedAtMs;
            public final /* synthetic */ SpaceWidgetSize $size;
            public final /* synthetic */ C10543Hqv<String> $vmUrl;
            public int label;

            /* renamed from: com.facebook.aura.widgets.SpaceWidgetRefresher$refreshLocked$4$1$1, reason: invalid class name and collision with other inner class name */
            public final class C04501 extends AbstractC7559F3s implements G0U<C6O2, Unit> {
                public final /* synthetic */ boolean $dropsOtherVmSnapshot;
                public final /* synthetic */ F1F $isUnavailable;
                public final /* synthetic */ C10543Hqv<Long> $savedAtMs;
                public final /* synthetic */ SpaceWidgetSize $size;
                public final /* synthetic */ C10543Hqv<String> $vmUrl;

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(C6O2 c6o2) {
                    C7384Etj.A0Y(c6o2, 0);
                    C6O2.A02(c6o2, SpaceWidgetStore.REFRESHING, false);
                    C6O2.A02(c6o2, SpaceWidgetStore.UNAVAILABLE, this.$isUnavailable.element);
                    if (this.$isUnavailable.element || this.$dropsOtherVmSnapshot) {
                        c6o2.A07(SpaceWidgetStore.UPDATED_AT_MS);
                    }
                    if (this.$dropsOtherVmSnapshot) {
                        c6o2.A07(SpaceWidgetStore.SNAPSHOT_WIDTH_PX);
                        c6o2.A07(SpaceWidgetStore.SNAPSHOT_HEIGHT_PX);
                    }
                    String str = this.$vmUrl.element;
                    if (str != null) {
                        c6o2.A08(SpaceWidgetStore.VM_URL, str);
                    }
                    Long l = this.$savedAtMs.element;
                    if (l != null) {
                        SpaceWidgetSize spaceWidgetSize = this.$size;
                        c6o2.A08(SpaceWidgetStore.UPDATED_AT_MS, l);
                        c6o2.A08(SpaceWidgetStore.SNAPSHOT_WIDTH_PX, Integer.valueOf(spaceWidgetSize.widthPx));
                        c6o2.A08(SpaceWidgetStore.SNAPSHOT_HEIGHT_PX, Integer.valueOf(spaceWidgetSize.heightPx));
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C04501(F1F f1f, boolean z, C10543Hqv<String> c10543Hqv, C10543Hqv<Long> c10543Hqv2, SpaceWidgetSize spaceWidgetSize) {
                    super(1);
                    this.$isUnavailable = f1f;
                    this.$dropsOtherVmSnapshot = z;
                    this.$vmUrl = c10543Hqv;
                    this.$savedAtMs = c10543Hqv2;
                    this.$size = spaceWidgetSize;
                }

                @Override // X.G0U
                public /* bridge */ /* synthetic */ Unit invoke(C6O2 c6o2) {
                    invoke2(c6o2);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(boolean z, Context context, int i, C6PP c6pp, F1F f1f, C10543Hqv<String> c10543Hqv, C10543Hqv<Long> c10543Hqv2, SpaceWidgetSize spaceWidgetSize, HtJ<? super AnonymousClass1> htJ) {
                super(1, htJ);
                this.$dropsOtherVmSnapshot = z;
                this.$context = context;
                this.$appWidgetId = i;
                this.$glanceId = c6pp;
                this.$isUnavailable = f1f;
                this.$vmUrl = c10543Hqv;
                this.$savedAtMs = c10543Hqv2;
                this.$size = spaceWidgetSize;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new AnonymousClass1(this.$dropsOtherVmSnapshot, this.$context, this.$appWidgetId, this.$glanceId, this.$isUnavailable, this.$vmUrl, this.$savedAtMs, this.$size, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    if (this.$dropsOtherVmSnapshot) {
                        SpaceWidgetStore.INSTANCE.deleteSnapshot(this.$context, this.$appWidgetId);
                    }
                    SpaceWidgetStore spaceWidgetStore = SpaceWidgetStore.INSTANCE;
                    Context context = this.$context;
                    C6PP c6pp = this.$glanceId;
                    C04501 c04501 = new C04501(this.$isUnavailable, this.$dropsOtherVmSnapshot, this.$vmUrl, this.$savedAtMs, this.$size);
                    this.label = 1;
                    if (spaceWidgetStore.edit(context, c6pp, c04501, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                        return Unit.INSTANCE;
                    }
                    Hwg.A00(obj);
                }
                SpaceWidget spaceWidget = new SpaceWidget();
                Context context2 = this.$context;
                C6PP c6pp2 = this.$glanceId;
                this.label = 2;
                if (spaceWidget.update(context2, c6pp2, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(C10543Hqv<String> c10543Hqv, C10543Hqv<Long> c10543Hqv2, Preferences preferences, Context context, int i, C6PP c6pp, F1F f1f, SpaceWidgetSize spaceWidgetSize, HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
            this.$vmUrl = c10543Hqv;
            this.$savedAtMs = c10543Hqv2;
            this.$state = preferences;
            this.$context = context;
            this.$appWidgetId = i;
            this.$glanceId = c6pp;
            this.$isUnavailable = f1f;
            this.$size = spaceWidgetSize;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass4(this.$vmUrl, this.$savedAtMs, this.$state, this.$context, this.$appWidgetId, this.$glanceId, this.$isUnavailable, this.$size, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0052 A[RETURN] */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r5v2 */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r14.label
                r2 = 1
                if (r0 == 0) goto Ld
                if (r0 != r2) goto L53
                X.Hwg.A00(r15)
            Lc:
                return r15
            Ld:
                X.Hwg.A00(r15)
                X.Hqv<java.lang.String> r0 = r14.$vmUrl
                T r0 = r0.element
                if (r0 == 0) goto L2f
                X.Hqv<java.lang.Long> r0 = r14.$savedAtMs
                T r0 = r0.element
                if (r0 != 0) goto L2f
                androidx.datastore.preferences.core.Preferences r1 = r14.$state
                X.6JZ<java.lang.String> r0 = com.facebook.aura.widgets.SpaceWidgetStore.VM_URL
                java.lang.Object r1 = r1.A06(r0)
                X.Hqv<java.lang.String> r0 = r14.$vmUrl
                T r0 = r0.element
                boolean r0 = X.C7384Etj.areEqual(r1, r0)
                r5 = 1
                if (r0 == 0) goto L30
            L2f:
                r5 = 0
            L30:
                com.facebook.aura.widgets.WidgetContentLock r1 = com.facebook.aura.widgets.WidgetContentLock.INSTANCE
                android.content.Context r6 = r14.$context
                java.lang.Class<com.facebook.aura.widgets.SpaceWidgetReceiver> r0 = com.facebook.aura.widgets.SpaceWidgetReceiver.class
                int r7 = r14.$appWidgetId
                X.6PP r8 = r14.$glanceId
                X.F1F r9 = r14.$isUnavailable
                X.Hqv<java.lang.String> r10 = r14.$vmUrl
                X.Hqv<java.lang.Long> r11 = r14.$savedAtMs
                com.facebook.aura.widgets.SpaceWidgetSize r12 = r14.$size
                r13 = 0
                com.facebook.aura.widgets.SpaceWidgetRefresher$refreshLocked$4$1 r4 = new com.facebook.aura.widgets.SpaceWidgetRefresher$refreshLocked$4$1
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                r14.I$0 = r5
                r14.label = r2
                java.lang.Object r15 = r1.writeIfEnabled(r6, r0, r4, r14)
                if (r15 != r3) goto Lc
                return r3
            L53:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.SpaceWidgetRefresher.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass4) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.SpaceWidgetRefresher", f = "SpaceWidgetRefresher.kt", l = {74, 80}, m = "saveSelection", v = 2)
    /* renamed from: com.facebook.aura.widgets.SpaceWidgetRefresher$saveSelection$1, reason: invalid class name and case insensitive filesystem */
    public final class C144141 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C144141(HtJ<? super C144141> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpaceWidgetRefresher.this.saveSelection(null, 0, null, null, this);
        }
    }

    /* renamed from: com.facebook.aura.widgets.SpaceWidgetRefresher$saveSelection$2, reason: invalid class name and case insensitive filesystem */
    public final class C144152 extends AbstractC7559F3s implements G0U<C6O2, Unit> {
        public final /* synthetic */ String $slug;
        public final /* synthetic */ String $title;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C6O2 c6o2) {
            C7384Etj.A0Y(c6o2, 0);
            c6o2.A08(SpaceWidgetStore.SLUG, this.$slug);
            c6o2.A08(SpaceWidgetStore.TITLE, this.$title);
            C6O2.A02(c6o2, SpaceWidgetStore.UNAVAILABLE, false);
            c6o2.A08(SpaceWidgetStore.REFRESHING, AnonymousClass001.A0i());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144152(String str, String str2) {
            super(1);
            this.$slug = str;
            this.$title = str2;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C6O2 c6o2) {
            invoke2(c6o2);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.SpaceWidgetRefresher", f = "SpaceWidgetRefresher.kt", l = {68}, m = "select", v = 2)
    /* renamed from: com.facebook.aura.widgets.SpaceWidgetRefresher$select$2, reason: invalid class name and case insensitive filesystem */
    public final class C144162 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C144162(HtJ<? super C144162> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpaceWidgetRefresher.this.select(null, 0, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.SpaceWidgetRefresher", f = "SpaceWidgetRefresher.kt", l = {86, 89}, m = "staleWidgetIds", v = 2)
    /* renamed from: com.facebook.aura.widgets.SpaceWidgetRefresher$staleWidgetIds$1, reason: invalid class name and case insensitive filesystem */
    public final class C144171 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;
        public /* synthetic */ Object result;

        public C144171(HtJ<? super C144171> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpaceWidgetRefresher.this.staleWidgetIds(null, 0L, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refresh(android.content.Context r8, int r9, boolean r10, boolean r11, X.HtJ<? super kotlin.Unit> r12) throws java.lang.Throwable {
        /*
            r7 = this;
            r3 = r12
            boolean r0 = r12 instanceof com.facebook.aura.widgets.SpaceWidgetRefresher.AnonymousClass1
            if (r0 == 0) goto L27
            r12 = r3
            com.facebook.aura.widgets.SpaceWidgetRefresher$refresh$1 r12 = (com.facebook.aura.widgets.SpaceWidgetRefresher.AnonymousClass1) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r12.label = r2
        L13:
            java.lang.Object r2 = r12.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r12.label
            r6 = 2
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L43
            if (r0 == r4) goto L32
            if (r0 != r6) goto L2d
            java.lang.Object r1 = r12.L$1
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            goto L7f
        L27:
            com.facebook.aura.widgets.SpaceWidgetRefresher$refresh$1 r12 = new com.facebook.aura.widgets.SpaceWidgetRefresher$refresh$1
            r12.<init>(r3)
            goto L13
        L2d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L32:
            boolean r11 = r12.Z$1
            boolean r10 = r12.Z$0
            int r9 = r12.I$0
            java.lang.Object r1 = r12.L$1
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            java.lang.Object r0 = r12.L$0
            android.content.Context r8 = X.C60P.A02(r0, r2)
            goto L6a
        L43:
            X.Hwg.A00(r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, X.BLa> r2 = com.facebook.aura.widgets.SpaceWidgetRefresher.refreshLocks
            java.lang.Integer r1 = X.C3cG.A0R(r9)
            com.facebook.aura.widgets.SpaceWidgetRefresher$refresh$2<T, R> r0 = new java.util.function.Function() { // from class: com.facebook.aura.widgets.SpaceWidgetRefresher.refresh.2
                static {
                    /*
                        com.facebook.aura.widgets.SpaceWidgetRefresher$refresh$2 r0 = new com.facebook.aura.widgets.SpaceWidgetRefresher$refresh$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.facebook.aura.widgets.SpaceWidgetRefresher$refresh$2<T, R>) com.facebook.aura.widgets.SpaceWidgetRefresher.refresh.2.INSTANCE com.facebook.aura.widgets.SpaceWidgetRefresher$refresh$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.SpaceWidgetRefresher.AnonymousClass2.<clinit>():void");
                }

                public final X.InterfaceC2261BLa apply(java.lang.Integer r1) {
                    /*
                        r0 = this;
                        X.GBl r0 = new X.GBl
                        r0.<init>()
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.SpaceWidgetRefresher.AnonymousClass2.apply(java.lang.Integer):X.BLa");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.SpaceWidgetRefresher.AnonymousClass2.<init>():void");
                }

                @Override // java.util.function.Function
                public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1) {
                    /*
                        r0 = this;
                        X.GBl r0 = new X.GBl
                        r0.<init>()
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.SpaceWidgetRefresher.AnonymousClass2.apply(java.lang.Object):java.lang.Object");
                }
            }
            java.lang.Object r1 = r2.computeIfAbsent(r1, r0)
            X.C7384Etj.A0U(r1)
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            r12.L$0 = r8
            r12.L$1 = r1
            r12.I$0 = r9
            r12.Z$0 = r10
            r12.Z$1 = r11
            r12.label = r4
            java.lang.Object r0 = r1.APs(r3, r12)
            if (r0 != r5) goto L6a
            return r5
        L6a:
            com.facebook.aura.widgets.SpaceWidgetRefresher r7 = com.facebook.aura.widgets.SpaceWidgetRefresher.INSTANCE     // Catch: java.lang.Throwable -> L88
            r12.L$0 = r3     // Catch: java.lang.Throwable -> L88
            r12.L$1 = r1     // Catch: java.lang.Throwable -> L88
            r12.I$0 = r9     // Catch: java.lang.Throwable -> L88
            r12.Z$0 = r10     // Catch: java.lang.Throwable -> L88
            r12.Z$1 = r11     // Catch: java.lang.Throwable -> L88
            r12.label = r6     // Catch: java.lang.Throwable -> L88
            java.lang.Object r0 = r7.refreshLocked(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L88
            if (r0 != r5) goto L82
            return r5
        L7f:
            X.Hwg.A00(r2)     // Catch: java.lang.Throwable -> L8a
        L82:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L8a
            r1.Ahe(r3)
            return r0
        L88:
            r0 = move-exception
            goto L8b
        L8a:
            r0 = move-exception
        L8b:
            r1.Ahe(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.SpaceWidgetRefresher.refresh(android.content.Context, int, boolean, boolean, X.HtJ):java.lang.Object");
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PeerSpaceAccess.values().length];
            try {
                AnonymousClass002.A13(PeerSpaceAccess.AVAILABLE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(PeerSpaceAccess.UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(PeerSpaceAccess.UNREACHABLE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveSelection(android.content.Context r8, int r9, java.lang.String r10, java.lang.String r11, X.HtJ<? super kotlin.Unit> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.facebook.aura.widgets.SpaceWidgetRefresher.C144141
            if (r0 == 0) goto L6d
            r5 = r12
            com.facebook.aura.widgets.SpaceWidgetRefresher$saveSelection$1 r5 = (com.facebook.aura.widgets.SpaceWidgetRefresher.C144141) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6d
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r7 = 2
            r4 = 1
            if (r0 == 0) goto L26
            if (r0 == r4) goto L48
            if (r0 != r7) goto L73
            X.Hwg.A00(r1)
        L23:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L26:
            X.Hwg.A00(r1)
            com.facebook.aura.widgets.SpaceWidgetStore r3 = com.facebook.aura.widgets.SpaceWidgetStore.INSTANCE
            X.6PP r2 = r3.glanceId(r8, r9)
            com.facebook.aura.widgets.SpaceWidgetRefresher$saveSelection$2 r1 = new com.facebook.aura.widgets.SpaceWidgetRefresher$saveSelection$2
            r1.<init>(r10, r11)
            r5.L$0 = r8
            r0 = 0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.L$3 = r2
            r5.I$0 = r9
            r5.label = r4
            java.lang.Object r0 = r3.edit(r8, r2, r1, r5)
            if (r0 != r6) goto L54
            return r6
        L48:
            int r9 = r5.I$0
            java.lang.Object r2 = r5.L$3
            X.6PP r2 = (X.C6PP) r2
            java.lang.Object r0 = r5.L$0
            android.content.Context r8 = X.C60P.A02(r0, r1)
        L54:
            com.facebook.aura.widgets.SpaceWidget r1 = new com.facebook.aura.widgets.SpaceWidget
            r1.<init>()
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.L$3 = r0
            r5.I$0 = r9
            r5.label = r7
            java.lang.Object r0 = r1.update(r8, r2, r5)
            if (r0 != r6) goto L23
            return r6
        L6d:
            com.facebook.aura.widgets.SpaceWidgetRefresher$saveSelection$1 r5 = new com.facebook.aura.widgets.SpaceWidgetRefresher$saveSelection$1
            r5.<init>(r12)
            goto L12
        L73:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.SpaceWidgetRefresher.saveSelection(android.content.Context, int, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    public final Object select(Context context, int i, SpaceCard spaceCard, HtJ<? super Unit> htJ) {
        return C3cG.A0U(select(context, i, spaceCard.id, spaceCard.title, htJ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        if (r4 == r3) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d1  */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.Hji, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0078 -> B:12:0x0036). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object staleWidgetIds(android.content.Context r13, long r14, X.HtJ<? super java.util.List<java.lang.Integer>> r16) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r12 = this;
            r3 = r16
            boolean r0 = r3 instanceof com.facebook.aura.widgets.SpaceWidgetRefresher.C144171
            if (r0 == 0) goto Ld1
            r6 = r3
            com.facebook.aura.widgets.SpaceWidgetRefresher$staleWidgetIds$1 r6 = (com.facebook.aura.widgets.SpaceWidgetRefresher.C144171) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Ld1
            int r2 = r2 - r1
            r6.label = r2
        L14:
            java.lang.Object r4 = r6.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r7 = 2
            r2 = 1
            if (r0 == 0) goto La3
            if (r0 == r2) goto Lbc
            if (r0 != r7) goto Ldf
            long r14 = r6.J$0
            java.lang.Object r10 = r6.L$6
            java.lang.Object r9 = r6.L$5
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r8 = r6.L$4
            java.util.Collection r8 = (java.util.Collection) r8
            java.lang.Object r1 = r6.L$1
            java.lang.Object r0 = r6.L$0
            android.content.Context r13 = X.C60P.A02(r0, r4)
        L36:
            androidx.datastore.preferences.core.Preferences r4 = (androidx.datastore.preferences.core.Preferences) r4
            X.6JZ<java.lang.Long> r0 = com.facebook.aura.widgets.SpaceWidgetStore.UPDATED_AT_MS
            java.lang.Object r0 = r4.A06(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r11 = X.C60P.A01(r0)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r11
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 < 0) goto L50
            r8.add(r10)
        L50:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L7b
            java.lang.Object r10 = r9.next()
            r2 = r10
            X.6PP r2 = (X.C6PP) r2
            r6.L$0 = r13
            r6.L$1 = r1
            r0 = 0
            r6.L$2 = r0
            r6.L$3 = r0
            r6.L$4 = r8
            r6.L$5 = r9
            r6.L$6 = r10
            r6.L$7 = r0
            r6.J$0 = r14
            r6.label = r7
            X.6PE r0 = X.C6PE.A00
            java.lang.Object r4 = X.C6yr.A00(r13, r2, r0, r6)
            if (r4 != r3) goto L36
        L7a:
            return r3
        L7b:
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r3 = X.AnonymousClass003.A0i(r8)
            java.util.Iterator r2 = r8.iterator()
        L85:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r1 = r2.next()
            X.6PP r1 = (X.C6PP) r1
            X.31u<android.content.Context, X.6JO<androidx.datastore.preferences.core.Preferences>> r0 = androidx.glance.appwidget.GlanceAppWidgetManager.A06
            boolean r0 = r1 instanceof X.C6vW
            if (r0 == 0) goto Ld8
            X.6vW r1 = (X.C6vW) r1
            int r0 = r1.A00
            java.lang.Integer r0 = X.C3cG.A0R(r0)
            r3.add(r0)
            goto L85
        La3:
            X.Hwg.A00(r4)
            androidx.glance.appwidget.GlanceAppWidgetManager r1 = new androidx.glance.appwidget.GlanceAppWidgetManager
            r1.<init>(r13)
            java.lang.Class<com.facebook.aura.widgets.SpaceWidget> r0 = com.facebook.aura.widgets.SpaceWidget.class
            r6.L$0 = r13
            r6.L$1 = r1
            r6.J$0 = r14
            r6.label = r2
            java.lang.Object r4 = r1.A01(r0, r6)
            if (r4 != r3) goto Lc6
            return r3
        Lbc:
            long r14 = r6.J$0
            java.lang.Object r1 = r6.L$1
            java.lang.Object r0 = r6.L$0
            android.content.Context r13 = X.C60P.A02(r0, r4)
        Lc6:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r8 = X.C3cG.A0h()
            java.util.Iterator r9 = r4.iterator()
            goto L50
        Ld1:
            com.facebook.aura.widgets.SpaceWidgetRefresher$staleWidgetIds$1 r6 = new com.facebook.aura.widgets.SpaceWidgetRefresher$staleWidgetIds$1
            r6.<init>(r3)
            goto L14
        Ld8:
            java.lang.String r0 = "This method only accepts App Widget Glance Id"
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        Ldf:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.SpaceWidgetRefresher.staleWidgetIds(android.content.Context, long, X.HtJ):java.lang.Object");
    }

    private final SpaceWidgetSize snapshotSize(Context context, int i) {
        Bundle appWidgetOptions = AppWidgetManager.getInstance(context).getAppWidgetOptions(i);
        float f = C60Q.A0B(context).density;
        int i2 = appWidgetOptions.getInt("appWidgetMinWidth");
        int i3 = appWidgetOptions.getInt("appWidgetMaxHeight") - 64;
        if (i2 < 100) {
            i2 = 100;
        }
        int iA01 = Ab3.A01(i2 * f);
        if (i3 < 100) {
            i3 = 100;
        }
        return new SpaceWidgetSize(iA01, Ab3.A01(i3 * f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x04f6, code lost:
    
        if (r7 == r23) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x02aa, code lost:
    
        if (r0.intValue() == r1) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0461 A[Catch: Exception -> 0x0596, CancellationException -> 0x05bc, all -> 0x05c2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x05c2, blocks: (B:128:0x0577, B:129:0x057a, B:131:0x0581, B:14:0x008d, B:121:0x0529, B:123:0x052d, B:125:0x0533, B:30:0x01e9, B:16:0x00ca, B:104:0x0461, B:106:0x0467, B:108:0x046b, B:109:0x0470, B:118:0x04f9, B:74:0x0388, B:75:0x038b, B:81:0x039a, B:132:0x0591, B:133:0x0595, B:83:0x03ce, B:84:0x03d4, B:87:0x03e4, B:64:0x0312, B:65:0x0315, B:67:0x031b, B:69:0x034a, B:71:0x0354, B:88:0x03eb, B:89:0x0407, B:20:0x0160, B:58:0x02e8, B:60:0x02ec, B:61:0x02f0, B:22:0x018f, B:24:0x01bf), top: B:169:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04f9 A[Catch: Exception -> 0x0596, CancellationException -> 0x05bc, all -> 0x05c2, TRY_ENTER, TryCatch #1 {all -> 0x05c2, blocks: (B:128:0x0577, B:129:0x057a, B:131:0x0581, B:14:0x008d, B:121:0x0529, B:123:0x052d, B:125:0x0533, B:30:0x01e9, B:16:0x00ca, B:104:0x0461, B:106:0x0467, B:108:0x046b, B:109:0x0470, B:118:0x04f9, B:74:0x0388, B:75:0x038b, B:81:0x039a, B:132:0x0591, B:133:0x0595, B:83:0x03ce, B:84:0x03d4, B:87:0x03e4, B:64:0x0312, B:65:0x0315, B:67:0x031b, B:69:0x034a, B:71:0x0354, B:88:0x03eb, B:89:0x0407, B:20:0x0160, B:58:0x02e8, B:60:0x02ec, B:61:0x02f0, B:22:0x018f, B:24:0x01bf), top: B:169:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x052d A[Catch: Exception -> 0x0596, CancellationException -> 0x05bf, all -> 0x05c2, TryCatch #0 {CancellationException -> 0x05bf, blocks: (B:121:0x0529, B:123:0x052d, B:125:0x0533, B:58:0x02e8, B:61:0x02f0), top: B:167:0x02e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0581 A[Catch: Exception -> 0x0596, CancellationException -> 0x05bc, all -> 0x05c2, TryCatch #1 {all -> 0x05c2, blocks: (B:128:0x0577, B:129:0x057a, B:131:0x0581, B:14:0x008d, B:121:0x0529, B:123:0x052d, B:125:0x0533, B:30:0x01e9, B:16:0x00ca, B:104:0x0461, B:106:0x0467, B:108:0x046b, B:109:0x0470, B:118:0x04f9, B:74:0x0388, B:75:0x038b, B:81:0x039a, B:132:0x0591, B:133:0x0595, B:83:0x03ce, B:84:0x03d4, B:87:0x03e4, B:64:0x0312, B:65:0x0315, B:67:0x031b, B:69:0x034a, B:71:0x0354, B:88:0x03eb, B:89:0x0407, B:20:0x0160, B:58:0x02e8, B:60:0x02ec, B:61:0x02f0, B:22:0x018f, B:24:0x01bf), top: B:169:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0265 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02ec A[Catch: Exception -> 0x0596, CancellationException -> 0x05bc, all -> 0x05c2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x05c2, blocks: (B:128:0x0577, B:129:0x057a, B:131:0x0581, B:14:0x008d, B:121:0x0529, B:123:0x052d, B:125:0x0533, B:30:0x01e9, B:16:0x00ca, B:104:0x0461, B:106:0x0467, B:108:0x046b, B:109:0x0470, B:118:0x04f9, B:74:0x0388, B:75:0x038b, B:81:0x039a, B:132:0x0591, B:133:0x0595, B:83:0x03ce, B:84:0x03d4, B:87:0x03e4, B:64:0x0312, B:65:0x0315, B:67:0x031b, B:69:0x034a, B:71:0x0354, B:88:0x03eb, B:89:0x0407, B:20:0x0160, B:58:0x02e8, B:60:0x02ec, B:61:0x02f0, B:22:0x018f, B:24:0x01bf), top: B:169:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02f0 A[Catch: Exception -> 0x0596, CancellationException -> 0x05bf, all -> 0x05c2, TRY_ENTER, TryCatch #0 {CancellationException -> 0x05bf, blocks: (B:121:0x0529, B:123:0x052d, B:125:0x0533, B:58:0x02e8, B:61:0x02f0), top: B:167:0x02e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x031b A[Catch: Exception -> 0x0596, CancellationException -> 0x05bc, all -> 0x05c2, TRY_LEAVE, TryCatch #1 {all -> 0x05c2, blocks: (B:128:0x0577, B:129:0x057a, B:131:0x0581, B:14:0x008d, B:121:0x0529, B:123:0x052d, B:125:0x0533, B:30:0x01e9, B:16:0x00ca, B:104:0x0461, B:106:0x0467, B:108:0x046b, B:109:0x0470, B:118:0x04f9, B:74:0x0388, B:75:0x038b, B:81:0x039a, B:132:0x0591, B:133:0x0595, B:83:0x03ce, B:84:0x03d4, B:87:0x03e4, B:64:0x0312, B:65:0x0315, B:67:0x031b, B:69:0x034a, B:71:0x0354, B:88:0x03eb, B:89:0x0407, B:20:0x0160, B:58:0x02e8, B:60:0x02ec, B:61:0x02f0, B:22:0x018f, B:24:0x01bf), top: B:169:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x034a A[Catch: Exception -> 0x0596, CancellationException -> 0x05bc, all -> 0x05c2, TRY_ENTER, TryCatch #1 {all -> 0x05c2, blocks: (B:128:0x0577, B:129:0x057a, B:131:0x0581, B:14:0x008d, B:121:0x0529, B:123:0x052d, B:125:0x0533, B:30:0x01e9, B:16:0x00ca, B:104:0x0461, B:106:0x0467, B:108:0x046b, B:109:0x0470, B:118:0x04f9, B:74:0x0388, B:75:0x038b, B:81:0x039a, B:132:0x0591, B:133:0x0595, B:83:0x03ce, B:84:0x03d4, B:87:0x03e4, B:64:0x0312, B:65:0x0315, B:67:0x031b, B:69:0x034a, B:71:0x0354, B:88:0x03eb, B:89:0x0407, B:20:0x0160, B:58:0x02e8, B:60:0x02ec, B:61:0x02f0, B:22:0x018f, B:24:0x01bf), top: B:169:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03d4 A[Catch: Exception -> 0x0596, CancellationException -> 0x05bc, all -> 0x05c2, TryCatch #1 {all -> 0x05c2, blocks: (B:128:0x0577, B:129:0x057a, B:131:0x0581, B:14:0x008d, B:121:0x0529, B:123:0x052d, B:125:0x0533, B:30:0x01e9, B:16:0x00ca, B:104:0x0461, B:106:0x0467, B:108:0x046b, B:109:0x0470, B:118:0x04f9, B:74:0x0388, B:75:0x038b, B:81:0x039a, B:132:0x0591, B:133:0x0595, B:83:0x03ce, B:84:0x03d4, B:87:0x03e4, B:64:0x0312, B:65:0x0315, B:67:0x031b, B:69:0x034a, B:71:0x0354, B:88:0x03eb, B:89:0x0407, B:20:0x0160, B:58:0x02e8, B:60:0x02ec, B:61:0x02f0, B:22:0x018f, B:24:0x01bf), top: B:169:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0454 A[Catch: Exception -> 0x01e7, CancellationException -> 0x05c4, all -> 0x05c6, TryCatch #3 {all -> 0x05c6, blocks: (B:146:0x05c5, B:92:0x0433, B:94:0x0444, B:96:0x0448, B:97:0x044c, B:99:0x0454, B:55:0x02c9, B:25:0x01c3, B:136:0x0599), top: B:170:0x0599 }] */
    /* JADX WARN: Type inference failed for: r0v101, types: [T] */
    /* JADX WARN: Type inference failed for: r0v104, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v112, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v119, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v120, types: [T] */
    /* JADX WARN: Type inference failed for: r0v122, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [T] */
    /* JADX WARN: Type inference failed for: r0v72, types: [T] */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [com.facebook.aura.widgets.SpaceWidgetStore] */
    /* JADX WARN: Type inference failed for: r27v0, types: [androidx.datastore.preferences.core.Preferences] */
    /* JADX WARN: Type inference failed for: r27v1, types: [androidx.datastore.preferences.core.Preferences] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.6PP, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r4v34, types: [int] */
    /* JADX WARN: Type inference failed for: r4v35, types: [int] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v9, types: [androidx.datastore.preferences.core.Preferences, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshLocked(android.content.Context r29, int r30, boolean r31, boolean r32, X.HtJ<? super kotlin.Unit> r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.SpaceWidgetRefresher.refreshLocked(android.content.Context, int, boolean, boolean, X.HtJ):java.lang.Object");
    }

    /* renamed from: com.facebook.aura.widgets.SpaceWidgetRefresher$refreshLocked$2, reason: invalid class name and case insensitive filesystem */
    public final class C144132 extends AbstractC7559F3s implements G0U<C6O2, Unit> {
        public static final C144132 INSTANCE = new C144132();

        public C144132() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C6O2 c6o2) {
            C7384Etj.A0Y(c6o2, 0);
            c6o2.A08(SpaceWidgetStore.REFRESHING, AnonymousClass001.A0i());
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C6O2 c6o2) {
            invoke2(c6o2);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object select(android.content.Context r8, int r9, java.lang.String r10, java.lang.String r11, X.HtJ<? super kotlin.Unit> r12) {
        /*
            r7 = this;
            r5 = r8
            r6 = r9
            boolean r0 = r12 instanceof com.facebook.aura.widgets.SpaceWidgetRefresher.C144162
            r4 = r7
            if (r0 == 0) goto L47
            r9 = r12
            com.facebook.aura.widgets.SpaceWidgetRefresher$select$2 r9 = (com.facebook.aura.widgets.SpaceWidgetRefresher.C144162) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r9.label = r2
        L15:
            java.lang.Object r3 = r9.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r9.label
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L4d
            int r6 = r9.I$0
            java.lang.Object r0 = r9.L$0
            android.content.Context r5 = X.C60P.A02(r0, r3)
        L28:
            com.facebook.aura.widgets.SpaceWidgetRefreshWorker$Companion r0 = com.facebook.aura.widgets.SpaceWidgetRefreshWorker.Companion
            r0.enqueue(r5, r6)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L30:
            X.Hwg.A00(r3)
            r9.L$0 = r8
            r0 = 0
            r9.L$1 = r0
            r9.L$2 = r0
            r9.I$0 = r6
            r9.label = r1
            r7 = r10
            r8 = r11
            java.lang.Object r0 = r4.saveSelection(r5, r6, r7, r8, r9)
            if (r0 != r2) goto L28
            return r2
        L47:
            com.facebook.aura.widgets.SpaceWidgetRefresher$select$2 r9 = new com.facebook.aura.widgets.SpaceWidgetRefresher$select$2
            r9.<init>(r12)
            goto L15
        L4d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.SpaceWidgetRefresher.select(android.content.Context, int, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }
}
