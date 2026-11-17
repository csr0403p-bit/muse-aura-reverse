package com.facebook.aura.widgets;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C10543Hqv;
import X.C3UX;
import X.C60O;
import X.C6O2;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC2261BLa;
import android.content.Context;
import androidx.glance.appwidget.GlanceAppWidgetReceiver;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class ListWidgetRefresher {
    public static final int $stable = 0;
    public static final ListWidgetRefresher INSTANCE = new ListWidgetRefresher();
    public static final ConcurrentHashMap<String, InterfaceC2261BLa> refreshLocks = C60O.A1C();

    @DebugMetadata(c = "com.facebook.aura.widgets.ListWidgetRefresher", f = "ListWidgetRefresher.kt", l = {18, 19}, m = "isStale", v = 2)
    /* renamed from: com.facebook.aura.widgets.ListWidgetRefresher$isStale$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ListWidgetRefresher.this.isStale(null, null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.ListWidgetRefresher", f = "ListWidgetRefresher.kt", l = {81, 26}, m = "refresh", v = 2)
    /* renamed from: com.facebook.aura.widgets.ListWidgetRefresher$refresh$1, reason: invalid class name and case insensitive filesystem */
    public final class C143941 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C143941(HtJ<? super C143941> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ListWidgetRefresher.this.refresh(null, null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.ListWidgetRefresher", f = "ListWidgetRefresher.kt", l = {31, 33, 35, R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight, 48, 55, 55}, m = "refreshLocked", v = 2)
    /* renamed from: com.facebook.aura.widgets.ListWidgetRefresher$refreshLocked$1, reason: invalid class name and case insensitive filesystem */
    public final class C143951 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C143951(HtJ<? super C143951> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ListWidgetRefresher.this.refreshLocked(null, null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.ListWidgetRefresher$refreshLocked$4", f = "ListWidgetRefresher.kt", l = {56}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.widgets.ListWidgetRefresher$refreshLocked$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $batch;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ long $iconGeneration;
        public final /* synthetic */ C10543Hqv<List<ListWidgetItemJson>> $items;
        public final /* synthetic */ ListWidgetStore $store;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public final /* synthetic */ String $vmUrl;
        public final /* synthetic */ ListWidget $widget;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.widgets.ListWidgetRefresher$refreshLocked$4$1", f = "ListWidgetRefresher.kt", l = {59}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.widgets.ListWidgetRefresher$refreshLocked$4$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ String $batch;
            public final /* synthetic */ Context $context;
            public final /* synthetic */ long $iconGeneration;
            public final /* synthetic */ C10543Hqv<List<ListWidgetItemJson>> $items;
            public final /* synthetic */ ListWidgetStore $store;
            public final /* synthetic */ AbstractC3358CGz $userSession;
            public final /* synthetic */ String $vmUrl;
            public int I$0;
            public int label;

            /* renamed from: com.facebook.aura.widgets.ListWidgetRefresher$refreshLocked$4$1$1, reason: invalid class name and collision with other inner class name */
            public final class C04471 extends AbstractC7559F3s implements G0U<C6O2, Unit> {
                public final /* synthetic */ boolean $isCurrent;
                public final /* synthetic */ C10543Hqv<List<ListWidgetItemJson>> $items;
                public final /* synthetic */ ListWidgetStore $store;
                public final /* synthetic */ String $vmUrl;

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(C6O2 c6o2) {
                    C7384Etj.A0Y(c6o2, 0);
                    c6o2.A08(ListWidgetStore.REFRESHING, false);
                    if (this.$isCurrent) {
                        c6o2.A08(ListWidgetStore.SIGNED_OUT, false);
                        List<ListWidgetItemJson> list = this.$items.element;
                        if (list != null) {
                            ListWidgetStore listWidgetStore = this.$store;
                            String str = this.$vmUrl;
                            c6o2.A08(ListWidgetStore.ITEMS, listWidgetStore.encodeItems(list));
                            c6o2.A08(ListWidgetStore.UPDATED_AT_MS, C60O.A0k());
                            c6o2.A08(ListWidgetStore.VM_URL, str);
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C04471(boolean z, C10543Hqv<List<ListWidgetItemJson>> c10543Hqv, ListWidgetStore listWidgetStore, String str) {
                    super(1);
                    this.$isCurrent = z;
                    this.$items = c10543Hqv;
                    this.$store = listWidgetStore;
                    this.$vmUrl = str;
                }

                @Override // X.G0U
                public /* bridge */ /* synthetic */ Unit invoke(C6O2 c6o2) {
                    invoke2(c6o2);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AbstractC3358CGz abstractC3358CGz, ListWidgetStore listWidgetStore, long j, Context context, C10543Hqv<List<ListWidgetItemJson>> c10543Hqv, String str, String str2, HtJ<? super AnonymousClass1> htJ) {
                super(1, htJ);
                this.$userSession = abstractC3358CGz;
                this.$store = listWidgetStore;
                this.$iconGeneration = j;
                this.$context = context;
                this.$items = c10543Hqv;
                this.$batch = str;
                this.$vmUrl = str2;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new AnonymousClass1(this.$userSession, this.$store, this.$iconGeneration, this.$context, this.$items, this.$batch, this.$vmUrl, htJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r5v2 */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    X.Hji r6 = X.EnumC10460Hji.A02
                    int r0 = r8.label
                    r7 = 1
                    if (r0 == 0) goto L22
                    if (r0 != r7) goto L55
                    int r5 = r8.I$0
                    X.Hwg.A00(r9)
                Le:
                    if (r5 == 0) goto L1f
                    X.Hqv<java.util.List<com.facebook.aura.widgets.ListWidgetItemJson>> r0 = r8.$items
                    T r0 = r0.element
                    if (r0 == 0) goto L1f
                    com.facebook.aura.widgets.ListWidgetStore r2 = r8.$store
                    android.content.Context r1 = r8.$context
                    java.lang.String r0 = r8.$batch
                    r2.deleteIconsExcept(r1, r0)
                L1f:
                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                    return r6
                L22:
                    X.Hwg.A00(r9)
                    X.CGz r0 = r8.$userSession
                    boolean r0 = com.facebook.aura.widgets.WidgetSessionKt.isCurrentWidgetSession(r0)
                    if (r0 == 0) goto L3c
                    com.facebook.aura.widgets.ListWidgetStore r0 = r8.$store
                    com.facebook.aura.widgets.WidgetFileStore r0 = r0.icons
                    long r3 = r0.generation()
                    long r1 = r8.$iconGeneration
                    int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    r5 = 1
                    if (r0 == 0) goto L3d
                L3c:
                    r5 = 0
                L3d:
                    com.facebook.aura.widgets.ListWidgetStore r4 = r8.$store
                    android.content.Context r3 = r8.$context
                    X.Hqv<java.util.List<com.facebook.aura.widgets.ListWidgetItemJson>> r2 = r8.$items
                    java.lang.String r1 = r8.$vmUrl
                    com.facebook.aura.widgets.ListWidgetRefresher$refreshLocked$4$1$1 r0 = new com.facebook.aura.widgets.ListWidgetRefresher$refreshLocked$4$1$1
                    r0.<init>(r5, r2, r4, r1)
                    r8.I$0 = r5
                    r8.label = r7
                    java.lang.Object r0 = r4.editAll(r3, r0, r8)
                    if (r0 != r6) goto Le
                    return r6
                L55:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.ListWidgetRefresher.AnonymousClass4.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Context context, ListWidget listWidget, AbstractC3358CGz abstractC3358CGz, ListWidgetStore listWidgetStore, long j, C10543Hqv<List<ListWidgetItemJson>> c10543Hqv, String str, String str2, HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$widget = listWidget;
            this.$userSession = abstractC3358CGz;
            this.$store = listWidgetStore;
            this.$iconGeneration = j;
            this.$items = c10543Hqv;
            this.$batch = str;
            this.$vmUrl = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass4(this.$context, this.$widget, this.$userSession, this.$store, this.$iconGeneration, this.$items, this.$batch, this.$vmUrl, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objWriteIfEnabled = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objWriteIfEnabled);
                WidgetContentLock widgetContentLock = WidgetContentLock.INSTANCE;
                Context context = this.$context;
                Class<? extends GlanceAppWidgetReceiver> receiver = this.$widget.getReceiver();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$userSession, this.$store, this.$iconGeneration, this.$context, this.$items, this.$batch, this.$vmUrl, null);
                this.label = 1;
                objWriteIfEnabled = widgetContentLock.writeIfEnabled(context, receiver, anonymousClass1, this);
                if (objWriteIfEnabled == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objWriteIfEnabled);
            }
            return objWriteIfEnabled;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass4) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static /* synthetic */ Object refresh$default(ListWidgetRefresher listWidgetRefresher, Context context, ListWidget listWidget, boolean z, HtJ htJ, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return listWidgetRefresher.refresh(context, listWidget, z, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c2, code lost:
    
        if (r10.editAll(r7, r1, r3) == r2) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076 A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:19:0x00a4, B:20:0x00a7, B:13:0x006d, B:14:0x0070, B:16:0x0076, B:38:0x0156), top: B:52:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0145 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshLocked(android.content.Context r18, com.facebook.aura.widgets.ListWidget r19, boolean r20, X.HtJ<? super kotlin.Unit> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.ListWidgetRefresher.refreshLocked(android.content.Context, com.facebook.aura.widgets.ListWidget, boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b A[PHI: r5 r9 r10 r11
  0x007b: PHI (r5v1 java.util.Iterator) = (r5v0 java.util.Iterator), (r5v2 java.util.Iterator) binds: [B:26:0x0077, B:13:0x0044] A[DONT_GENERATE, DONT_INLINE]
  0x007b: PHI (r9v2 android.content.Context) = (r9v1 android.content.Context), (r9v3 android.content.Context) binds: [B:26:0x0077, B:13:0x0044] A[DONT_GENERATE, DONT_INLINE]
  0x007b: PHI (r10v2 java.lang.Object) = (r10v8 java.lang.Object), (r10v9 java.lang.Object) binds: [B:26:0x0077, B:13:0x0044] A[DONT_GENERATE, DONT_INLINE]
  0x007b: PHI (r11v2 long) = (r11v1 long), (r11v3 long) binds: [B:26:0x0077, B:13:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x009e -> B:12:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object isStale(android.content.Context r9, com.facebook.aura.widgets.ListWidget r10, long r11, X.HtJ<? super java.lang.Boolean> r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof com.facebook.aura.widgets.ListWidgetRefresher.AnonymousClass1
            if (r0 == 0) goto La1
            r2 = r13
            com.facebook.aura.widgets.ListWidgetRefresher$isStale$1 r2 = (com.facebook.aura.widgets.ListWidgetRefresher.AnonymousClass1) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto La1
            int r3 = r3 - r1
            r2.label = r3
        L12:
            java.lang.Object r6 = r2.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r2.label
            r8 = 0
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L4c
            if (r0 == r1) goto L60
            if (r0 != r3) goto La8
            long r11 = r2.J$0
            java.lang.Object r5 = r2.L$3
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r10 = r2.L$1
            java.lang.Object r0 = r2.L$0
            android.content.Context r9 = X.C60P.A02(r0, r6)
        L2f:
            androidx.datastore.preferences.core.Preferences r6 = (androidx.datastore.preferences.core.Preferences) r6
            X.6JZ<java.lang.Long> r0 = com.facebook.aura.widgets.ListWidgetStore.UPDATED_AT_MS
            java.lang.Object r0 = r6.A06(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r6 = java.lang.System.currentTimeMillis()
            long r0 = X.C60P.A01(r0)
            long r6 = r6 - r0
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 < 0) goto L7b
            r8 = 1
        L47:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            return r0
        L4c:
            X.Hwg.A00(r6)
            com.facebook.aura.widgets.ListWidgetStore r0 = r10.store
            r2.L$0 = r9
            r2.L$1 = r10
            r2.J$0 = r11
            r2.label = r1
            java.lang.Object r6 = r0.glanceIds(r9, r2)
            if (r6 != r4) goto L6a
            return r4
        L60:
            long r11 = r2.J$0
            java.lang.Object r10 = r2.L$1
            java.lang.Object r0 = r2.L$0
            android.content.Context r9 = X.C60P.A02(r0, r6)
        L6a:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L77
            boolean r0 = X.C3cG.A1N(r6)
            if (r0 == 0) goto L77
            goto L47
        L77:
            java.util.Iterator r5 = r6.iterator()
        L7b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L47
            java.lang.Object r1 = r5.next()
            X.6PP r1 = (X.C6PP) r1
            r2.L$0 = r9
            r2.L$1 = r10
            r0 = 0
            r2.L$2 = r0
            r2.L$3 = r5
            r2.L$4 = r0
            r2.L$5 = r0
            r2.J$0 = r11
            r2.label = r3
            X.6PE r0 = X.C6PE.A00
            java.lang.Object r6 = X.C6yr.A00(r9, r1, r0, r2)
            if (r6 != r4) goto L2f
            return r4
        La1:
            com.facebook.aura.widgets.ListWidgetRefresher$isStale$1 r2 = new com.facebook.aura.widgets.ListWidgetRefresher$isStale$1
            r2.<init>(r13)
            goto L12
        La8:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.ListWidgetRefresher.isStale(android.content.Context, com.facebook.aura.widgets.ListWidget, long, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refresh(android.content.Context r8, com.facebook.aura.widgets.ListWidget r9, boolean r10, X.HtJ<? super kotlin.Unit> r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.facebook.aura.widgets.ListWidgetRefresher.C143941
            if (r0 == 0) goto L26
            r6 = r11
            com.facebook.aura.widgets.ListWidgetRefresher$refresh$1 r6 = (com.facebook.aura.widgets.ListWidgetRefresher.C143941) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r2 = r6.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r5 = 2
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L42
            if (r0 == r4) goto L31
            if (r0 != r5) goto L2c
            java.lang.Object r1 = r6.L$2
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            goto L7a
        L26:
            com.facebook.aura.widgets.ListWidgetRefresher$refresh$1 r6 = new com.facebook.aura.widgets.ListWidgetRefresher$refresh$1
            r6.<init>(r11)
            goto L12
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            boolean r10 = r6.Z$0
            java.lang.Object r1 = r6.L$2
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            java.lang.Object r9 = r6.L$1
            com.facebook.aura.widgets.ListWidget r9 = (com.facebook.aura.widgets.ListWidget) r9
            java.lang.Object r0 = r6.L$0
            android.content.Context r8 = X.C60P.A02(r0, r2)
            goto L67
        L42:
            X.Hwg.A00(r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.BLa> r2 = com.facebook.aura.widgets.ListWidgetRefresher.refreshLocks
            java.lang.String r1 = r9.getKey()
            com.facebook.aura.widgets.ListWidgetRefresher$refresh$2<T, R> r0 = new java.util.function.Function() { // from class: com.facebook.aura.widgets.ListWidgetRefresher.refresh.2
                static {
                    /*
                        com.facebook.aura.widgets.ListWidgetRefresher$refresh$2 r0 = new com.facebook.aura.widgets.ListWidgetRefresher$refresh$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.facebook.aura.widgets.ListWidgetRefresher$refresh$2<T, R>) com.facebook.aura.widgets.ListWidgetRefresher.refresh.2.INSTANCE com.facebook.aura.widgets.ListWidgetRefresher$refresh$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.ListWidgetRefresher.AnonymousClass2.<clinit>():void");
                }

                public final X.InterfaceC2261BLa apply(java.lang.String r1) {
                    /*
                        r0 = this;
                        X.GBl r0 = new X.GBl
                        r0.<init>()
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.ListWidgetRefresher.AnonymousClass2.apply(java.lang.String):X.BLa");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.ListWidgetRefresher.AnonymousClass2.<init>():void");
                }

                @Override // java.util.function.Function
                public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1) {
                    /*
                        r0 = this;
                        X.GBl r0 = new X.GBl
                        r0.<init>()
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.ListWidgetRefresher.AnonymousClass2.apply(java.lang.Object):java.lang.Object");
                }
            }
            java.lang.Object r1 = r2.computeIfAbsent(r1, r0)
            X.C7384Etj.A0U(r1)
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            r6.L$0 = r8
            r6.L$1 = r9
            r6.L$2 = r1
            r6.Z$0 = r10
            r6.label = r4
            java.lang.Object r0 = r1.APs(r3, r6)
            if (r0 != r7) goto L67
            return r7
        L67:
            com.facebook.aura.widgets.ListWidgetRefresher r0 = com.facebook.aura.widgets.ListWidgetRefresher.INSTANCE     // Catch: java.lang.Throwable -> L83
            r6.L$0 = r3     // Catch: java.lang.Throwable -> L83
            r6.L$1 = r3     // Catch: java.lang.Throwable -> L83
            r6.L$2 = r1     // Catch: java.lang.Throwable -> L83
            r6.Z$0 = r10     // Catch: java.lang.Throwable -> L83
            r6.label = r5     // Catch: java.lang.Throwable -> L83
            java.lang.Object r0 = r0.refreshLocked(r8, r9, r10, r6)     // Catch: java.lang.Throwable -> L83
            if (r0 != r7) goto L7d
            return r7
        L7a:
            X.Hwg.A00(r2)     // Catch: java.lang.Throwable -> L85
        L7d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L85
            r1.Ahe(r3)
            return r0
        L83:
            r0 = move-exception
            goto L86
        L85:
            r0 = move-exception
        L86:
            r1.Ahe(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.ListWidgetRefresher.refresh(android.content.Context, com.facebook.aura.widgets.ListWidget, boolean, X.HtJ):java.lang.Object");
    }

    /* renamed from: com.facebook.aura.widgets.ListWidgetRefresher$refreshLocked$2, reason: invalid class name and case insensitive filesystem */
    public final class C143962 extends AbstractC7559F3s implements G0U<C6O2, Unit> {
        public static final C143962 INSTANCE = new C143962();

        public C143962() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C6O2 c6o2) {
            C7384Etj.A0Y(c6o2, 0);
            c6o2.A08(ListWidgetStore.REFRESHING, AnonymousClass001.A0i());
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C6O2 c6o2) {
            invoke2(c6o2);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.ListWidgetRefresher$refreshLocked$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<C6O2, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C6O2 c6o2) {
            C7384Etj.A0Y(c6o2, 0);
            c6o2.A07(ListWidgetStore.ITEMS);
            c6o2.A08(ListWidgetStore.SIGNED_OUT, AnonymousClass001.A0i());
            C6O2.A02(c6o2, ListWidgetStore.REFRESHING, false);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C6O2 c6o2) {
            invoke2(c6o2);
            return Unit.INSTANCE;
        }
    }
}
