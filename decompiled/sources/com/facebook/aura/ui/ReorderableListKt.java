package com.facebook.aura.ui;

import X.AWx;
import X.AaM;
import X.AbstractC07117nq;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AnonymousClass037;
import X.BFM;
import X.BRg;
import X.BRr;
import X.C1299Agk;
import X.C1BO;
import X.C3Q0;
import X.C3UY;
import X.C3cG;
import X.C3cI;
import X.EnumC10460Hji;
import X.G0V;
import X.G0W;
import X.G2j;
import X.HtJ;
import X.Hwg;
import X.InterfaceC05151eP;
import X.InterfaceC1074AXb;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class ReorderableListKt {
    public static final long MAKE_ROOM_DWELL_MS = 350;
    public static final long PLACEMENT_ACK_TIMEOUT_MS = 2000;
    public static final String REORDERABLE_ROOM_ITEM_KEY = "__reorderable_room__";
    public static final int SETTLEMENT_ANIMATION_DURATION_MS = 120;
    public static final long SETTLEMENT_ANIMATION_TIMEOUT_MS = 500;
    public static final long SETTLEMENT_SUPPRESSION_MS = 250;

    /* renamed from: com.facebook.aura.ui.ReorderableListKt$ReorderableItem$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G2j<InterfaceC05151eP, Boolean, BFM, Integer, Unit> $content;
        public final /* synthetic */ Integer $index;
        public final /* synthetic */ Object $key;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ReorderableLazyListState $state;
        public final /* synthetic */ AnonymousClass037 $this_ReorderableItem;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(AnonymousClass037 anonymousClass037, ReorderableLazyListState reorderableLazyListState, Object obj, BRg bRg, Integer num, G2j<? super InterfaceC05151eP, ? super Boolean, ? super BFM, ? super Integer, Unit> g2j, int i, int i2) {
            super(2);
            this.$this_ReorderableItem = anonymousClass037;
            this.$state = reorderableLazyListState;
            this.$key = obj;
            this.$modifier = bRg;
            this.$index = num;
            this.$content = g2j;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ReorderableListKt.ReorderableItem(this.$this_ReorderableItem, this.$state, this.$key, this.$modifier, this.$index, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ui.ReorderableListKt$scrollBy$2", f = "ReorderableList.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ui.ReorderableListKt$scrollBy$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3Q0, HtJ<? super Unit>, Object> {
        public final /* synthetic */ float $value;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(float f, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$value = f;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$value, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C3Q0 c3q0 = (C3Q0) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            c3q0.AcG(this.$value);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3Q0 c3q0, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3q0, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: detectDrag-VnAYq1g, reason: not valid java name */
    public static final Object m2339detectDragVnAYq1g(BRr bRr, long j, Function0<Unit> function0, Function0<Unit> function02, G0V<? super C1299Agk, ? super AWx, Unit> g0v, HtJ<? super Unit> htJ) {
        return C3cG.A0U(bRr.A50(new ReorderableListKt$detectDrag$4(j, function0, function02, g0v, null), htJ));
    }

    public static final Object scrollBy(LazyListState lazyListState, float f, HtJ<? super Unit> htJ) {
        Object objAcF = lazyListState.AcF(C3UY.A02, htJ, new AnonymousClass2(f, null));
        return objAcF != EnumC10460Hji.A02 ? Unit.INSTANCE : objAcF;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ReorderableItem(X.AnonymousClass037 r23, com.facebook.aura.ui.ReorderableLazyListState r24, java.lang.Object r25, X.BRg r26, java.lang.Integer r27, X.G2j<? super X.InterfaceC05151eP, ? super java.lang.Boolean, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r28, X.BFM r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.ReorderableListKt.ReorderableItem(X.037, com.facebook.aura.ui.ReorderableLazyListState, java.lang.Object, X.BRg, java.lang.Integer, X.G2j, X.BFM, int, int):void");
    }

    /* renamed from: detectDrag-VnAYq1g$default, reason: not valid java name */
    public static /* synthetic */ Object m2340detectDragVnAYq1g$default(BRr bRr, long j, Function0 function0, Function0 function02, G0V g0v, HtJ htJ, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = ReorderableListKt$detectDrag$2.INSTANCE;
        }
        if ((i & 4) != 0) {
            function02 = ReorderableListKt$detectDrag$3.INSTANCE;
        }
        return m2339detectDragVnAYq1g(bRr, j, function0, function02, g0v, htJ);
    }

    public static final /* synthetic */ G0V access$rememberReorderableLazyListState_aqv2aB4$lambda$6(C1BO c1bo) {
        return (G0V) c1bo.getValue();
    }

    public static final /* synthetic */ G0W access$rememberReorderableLazyListState_aqv2aB4$lambda$7(C1BO c1bo) {
        return (G0W) c1bo.getValue();
    }

    public static final /* synthetic */ G2j access$rememberReorderableLazyListState_aqv2aB4$lambda$8(C1BO c1bo) {
        return (G2j) c1bo.getValue();
    }

    public static final /* synthetic */ G0V access$rememberReorderableLazyListState_aqv2aB4$lambda$9(C1BO c1bo) {
        return (G0V) c1bo.getValue();
    }

    public static final BRg detectReorder(BRg bRg, final ReorderableLazyListState reorderableLazyListState) {
        AnonymousClass003.A0u(bRg, reorderableLazyListState);
        return AaM.A00(bRg, new PointerInputEventHandler() { // from class: com.facebook.aura.ui.ReorderableListKt.detectReorder.1

            @DebugMetadata(c = "com.facebook.aura.ui.ReorderableListKt$detectReorder$1$1", f = "ReorderableList.kt", l = {789}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.ui.ReorderableListKt$detectReorder$1$1, reason: invalid class name and collision with other inner class name */
            public final class C04121 extends AbstractC07127nr implements G0V<BRr, HtJ<? super Unit>, Object> {
                public final /* synthetic */ ReorderableLazyListState $state;
                public /* synthetic */ Object L$0;
                public int label;

                @DebugMetadata(c = "com.facebook.aura.ui.ReorderableListKt$detectReorder$1$1$1", f = "ReorderableList.kt", l = {790, 791}, m = "invokeSuspend", v = 2)
                /* renamed from: com.facebook.aura.ui.ReorderableListKt$detectReorder$1$1$1, reason: invalid class name and collision with other inner class name */
                public final class C04131 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Unit>, Object> {
                    public final /* synthetic */ ReorderableLazyListState $state;
                    public /* synthetic */ Object L$0;
                    public Object L$1;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C04131(ReorderableLazyListState reorderableLazyListState, HtJ<? super C04131> htJ) {
                        super(2, htJ);
                        this.$state = reorderableLazyListState;
                    }

                    @Override // X.AbstractC8884Fsp
                    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                        C04131 c04131 = new C04131(this.$state, htJ);
                        c04131.L$0 = obj;
                        return c04131;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
                    @Override // X.AbstractC8884Fsp
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                        /*
                            r8 = this;
                            java.lang.Object r6 = r8.L$0
                            X.AXb r6 = (X.InterfaceC1074AXb) r6
                            X.Hji r5 = X.EnumC10460Hji.A02
                            int r1 = r8.label
                            r4 = 2
                            r0 = 1
                            if (r1 == 0) goto L4d
                            if (r1 == r0) goto L5e
                            if (r1 != r4) goto L75
                            X.Hwg.A00(r9)
                        L13:
                            X.Agk r9 = (X.C1299Agk) r9
                            if (r9 == 0) goto L4a
                            com.facebook.aura.ui.ReorderableLazyListState r0 = r8.$state
                            X.HzR<com.facebook.aura.ui.StartDrag> r8 = r0.interactions
                            long r2 = r9.A08
                            long r4 = X.AbstractC1078AXh.A00(r9)
                            r9 = 32
                            float r0 = X.AnonymousClass001.A00(r4)
                            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
                            float r1 = X.AnonymousClass001.A01(r4, r6)
                            int r0 = java.lang.Float.floatToRawIntBits(r0)
                            long r4 = (long) r0
                            int r0 = java.lang.Float.floatToRawIntBits(r1)
                            long r0 = (long) r0
                            long r4 = r4 << r9
                            long r6 = r6 & r0
                            long r4 = r4 | r6
                            X.AWx r1 = new X.AWx
                            r1.<init>(r4)
                            com.facebook.aura.ui.StartDrag r0 = new com.facebook.aura.ui.StartDrag
                            r0.<init>(r2, r1)
                            r8.AhZ(r0)
                        L4a:
                            kotlin.Unit r5 = kotlin.Unit.INSTANCE
                            return r5
                        L4d:
                            X.Hwg.A00(r9)
                            r8.L$0 = r6
                            r8.label = r0
                            r1 = 0
                            X.AXj r0 = X.EnumC1080AXj.A04
                            java.lang.Object r9 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A04(r6, r0, r8, r1)
                            if (r9 != r5) goto L61
                            return r5
                        L5e:
                            X.Hwg.A00(r9)
                        L61:
                            X.Agk r9 = (X.C1299Agk) r9
                            long r2 = r9.A08
                            com.facebook.aura.ui.ReorderableListKt$detectReorder$1$1$1$drag$1 r1 = com.facebook.aura.ui.ReorderableListKt$detectReorder$1$1$1$drag$1.INSTANCE
                            r0 = 0
                            r8.L$0 = r0
                            r8.L$1 = r0
                            r8.label = r4
                            java.lang.Object r9 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A0B(r6, r8, r1, r2)
                            if (r9 != r5) goto L13
                            return r5
                        L75:
                            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                            throw r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.ReorderableListKt.AnonymousClass1.C04121.C04131.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    @Override // X.G0V
                    public final Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Unit> htJ) {
                        return ((C04131) create(interfaceC1074AXb, htJ)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C04121(ReorderableLazyListState reorderableLazyListState, HtJ<? super C04121> htJ) {
                    super(2, htJ);
                    this.$state = reorderableLazyListState;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    C04121 c04121 = new C04121(this.$state, htJ);
                    c04121.L$0 = obj;
                    return c04121;
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    BRr bRr = (BRr) this.L$0;
                    EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                    int i = this.label;
                    if (i == 0) {
                        Hwg.A00(obj);
                        C04131 c04131 = new C04131(this.$state, null);
                        this.L$0 = null;
                        this.label = 1;
                        if (bRr.A50(c04131, this) == enumC10460Hji) {
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
                public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                    return ((C04121) create(bRr, htJ)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                return C3cG.A0U(ForEachGestureKt.A02(bRr, htJ, new C04121(reorderableLazyListState, null)));
            }
        }, Unit.INSTANCE);
    }

    public static final BRg detectReorderAfterLongPress(BRg bRg, final ReorderableLazyListState reorderableLazyListState, final Object obj, final MutableState<Object> mutableState) {
        AnonymousClass005.A14(bRg, reorderableLazyListState, obj, mutableState);
        return AaM.A01(bRg, new PointerInputEventHandler() { // from class: com.facebook.aura.ui.ReorderableListKt.detectReorderAfterLongPress.1

            @DebugMetadata(c = "com.facebook.aura.ui.ReorderableListKt$detectReorderAfterLongPress$1$1", f = "ReorderableList.kt", l = {823, 827}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.ui.ReorderableListKt$detectReorderAfterLongPress$1$1, reason: invalid class name and collision with other inner class name */
            public final class C04141 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Unit>, Object> {
                public final /* synthetic */ MutableState<Object> $armedKey;
                public final /* synthetic */ Object $key;
                public final /* synthetic */ ReorderableLazyListState $state;
                public int I$0;
                public /* synthetic */ Object L$0;
                public Object L$1;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C04141(MutableState<Object> mutableState, Object obj, ReorderableLazyListState reorderableLazyListState, HtJ<? super C04141> htJ) {
                    super(2, htJ);
                    this.$armedKey = mutableState;
                    this.$key = obj;
                    this.$state = reorderableLazyListState;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    C04141 c04141 = new C04141(this.$armedKey, this.$key, this.$state, htJ);
                    c04141.L$0 = obj;
                    return c04141;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Path cross not found for [B:29:0x0073, B:33:0x008b], limit reached: 64 */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:17:0x0048, B:18:0x004b, B:20:0x0056, B:22:0x0065, B:24:0x0069, B:26:0x006d, B:29:0x0073, B:14:0x0037, B:31:0x0081, B:33:0x008b, B:36:0x00a3, B:37:0x00af, B:39:0x00b5, B:41:0x00c1, B:42:0x00c5), top: B:55:0x0048 }] */
                /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:17:0x0048, B:18:0x004b, B:20:0x0056, B:22:0x0065, B:24:0x0069, B:26:0x006d, B:29:0x0073, B:14:0x0037, B:31:0x0081, B:33:0x008b, B:36:0x00a3, B:37:0x00af, B:39:0x00b5, B:41:0x00c1, B:42:0x00c5), top: B:55:0x0048 }] */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00a3 A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:17:0x0048, B:18:0x004b, B:20:0x0056, B:22:0x0065, B:24:0x0069, B:26:0x006d, B:29:0x0073, B:14:0x0037, B:31:0x0081, B:33:0x008b, B:36:0x00a3, B:37:0x00af, B:39:0x00b5, B:41:0x00c1, B:42:0x00c5), top: B:55:0x0048 }] */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x0068 A[SYNTHETIC] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0045 -> B:18:0x004b). Please report as a decompilation issue!!! */
                @Override // X.AbstractC8884Fsp
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r16) {
                    /*
                        Method dump skipped, instructions count: 252
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.ReorderableListKt.C142501.C04141.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // X.G0V
                public final Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Unit> htJ) {
                    return ((C04141) create(interfaceC1074AXb, htJ)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                return C3cG.A0U(ForEachGestureKt.A01(bRr, htJ, new C04141(mutableState, obj, reorderableLazyListState, null)));
            }
        }, reorderableLazyListState, obj);
    }

    public static final G0V<ItemPosition, Integer, Integer> rememberReorderableLazyListState_aqv2aB4$lambda$6(C1BO<? extends G0V<? super ItemPosition, ? super Integer, Integer>> c1bo) {
        return (G0V) c1bo.getValue();
    }

    public static final G0W<ItemPosition, Object, Boolean, Object> rememberReorderableLazyListState_aqv2aB4$lambda$7(C1BO<? extends G0W<? super ItemPosition, Object, ? super Boolean, ? extends Object>> c1bo) {
        return (G0W) c1bo.getValue();
    }

    public static final G2j<ItemPosition, Integer, Integer, Boolean, Integer> rememberReorderableLazyListState_aqv2aB4$lambda$8(C1BO<? extends G2j<? super ItemPosition, ? super Integer, ? super Integer, ? super Boolean, Integer>> c1bo) {
        return (G2j) c1bo.getValue();
    }

    public static final G0V<ItemPosition, Object, Boolean> rememberReorderableLazyListState_aqv2aB4$lambda$9(C1BO<? extends G0V<? super ItemPosition, Object, Boolean>> c1bo) {
        return (G0V) c1bo.getValue();
    }

    public static final BRg reorderable(BRg bRg, final ReorderableLazyListState reorderableLazyListState) {
        AnonymousClass003.A0u(bRg, reorderableLazyListState);
        return AaM.A00(bRg, new PointerInputEventHandler() { // from class: com.facebook.aura.ui.ReorderableListKt.reorderable.1

            @DebugMetadata(c = "com.facebook.aura.ui.ReorderableListKt$reorderable$1$1", f = "ReorderableList.kt", l = {763, 764, 769}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.ui.ReorderableListKt$reorderable$1$1, reason: invalid class name and collision with other inner class name */
            public final class C04151 extends AbstractC07127nr implements G0V<BRr, HtJ<? super Unit>, Object> {
                public final /* synthetic */ ReorderableLazyListState $state;
                public /* synthetic */ Object L$0;
                public Object L$1;
                public Object L$2;
                public int label;

                /* renamed from: com.facebook.aura.ui.ReorderableListKt$reorderable$1$1$2, reason: invalid class name */
                public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
                    public final /* synthetic */ ReorderableLazyListState $state;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(ReorderableLazyListState reorderableLazyListState) {
                        super(0);
                        this.$state = reorderableLazyListState;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.$state.endDrag$fbandroid_express_aura_java_com_facebook_aura_ui_ui();
                    }
                }

                /* renamed from: com.facebook.aura.ui.ReorderableListKt$reorderable$1$1$3, reason: invalid class name */
                public final class AnonymousClass3 extends AbstractC7559F3s implements Function0<Unit> {
                    public final /* synthetic */ ReorderableLazyListState $state;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass3(ReorderableLazyListState reorderableLazyListState) {
                        super(0);
                        this.$state = reorderableLazyListState;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.$state.abortDrag$fbandroid_express_aura_java_com_facebook_aura_ui_ui();
                    }
                }

                /* renamed from: com.facebook.aura.ui.ReorderableListKt$reorderable$1$1$4, reason: invalid class name */
                public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<C1299Agk, AWx, Unit> {
                    public final /* synthetic */ ReorderableLazyListState $state;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass4(ReorderableLazyListState reorderableLazyListState) {
                        super(2);
                        this.$state = reorderableLazyListState;
                    }

                    @Override // X.G0V
                    public /* bridge */ /* synthetic */ Unit invoke(C1299Agk c1299Agk, AWx aWx) {
                        m2344invokeUv8p0NA(c1299Agk, aWx.A00);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                    public final void m2344invokeUv8p0NA(C1299Agk c1299Agk, long j) {
                        C3cI.A1B(c1299Agk);
                        this.$state.onDrag$fbandroid_express_aura_java_com_facebook_aura_ui_ui(AnonymousClass004.A00(j));
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C04151(ReorderableLazyListState reorderableLazyListState, HtJ<? super C04151> htJ) {
                    super(2, htJ);
                    this.$state = reorderableLazyListState;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    C04151 c04151 = new C04151(this.$state, htJ);
                    c04151.L$0 = obj;
                    return c04151;
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0094 A[RETURN] */
                @Override // X.AbstractC8884Fsp
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                    /*
                        r14 = this;
                        java.lang.Object r8 = r14.L$0
                        X.BRr r8 = (X.BRr) r8
                        X.Hji r4 = X.EnumC10460Hji.A02
                        int r0 = r14.label
                        r5 = 3
                        r2 = 2
                        r1 = 1
                        if (r0 == 0) goto L19
                        if (r0 == r1) goto L2b
                        if (r0 == r2) goto L44
                        if (r0 != r5) goto L95
                        X.Hwg.A00(r15)
                    L16:
                        kotlin.Unit r4 = kotlin.Unit.INSTANCE
                        return r4
                    L19:
                        X.Hwg.A00(r15)
                        com.facebook.aura.ui.ReorderableLazyListState r0 = r14.$state
                        X.HzR<com.facebook.aura.ui.StartDrag> r0 = r0.interactions
                        r14.L$0 = r8
                        r14.label = r1
                        java.lang.Object r15 = r0.AZg(r14)
                        if (r15 != r4) goto L2e
                        return r4
                    L2b:
                        X.Hwg.A00(r15)
                    L2e:
                        r7 = r15
                        com.facebook.aura.ui.StartDrag r7 = (com.facebook.aura.ui.StartDrag) r7
                        r1 = 0
                        com.facebook.aura.ui.ReorderableListKt$reorderable$1$1$down$1 r0 = new com.facebook.aura.ui.ReorderableListKt$reorderable$1$1$down$1
                        r0.<init>(r7, r1)
                        r14.L$0 = r8
                        r14.L$1 = r7
                        r14.label = r2
                        java.lang.Object r15 = r8.A50(r0, r14)
                        if (r15 != r4) goto L4b
                        return r4
                    L44:
                        java.lang.Object r7 = r14.L$1
                        com.facebook.aura.ui.StartDrag r7 = (com.facebook.aura.ui.StartDrag) r7
                        X.Hwg.A00(r15)
                    L4b:
                        X.Agk r15 = (X.C1299Agk) r15
                        if (r15 == 0) goto L16
                        com.facebook.aura.ui.ReorderableLazyListState r6 = r14.$state
                        long r0 = r15.A0A
                        r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
                        float r0 = X.AnonymousClass001.A01(r0, r2)
                        int r0 = (int) r0
                        boolean r0 = r6.onDragStartAt$fbandroid_express_aura_java_com_facebook_aura_ui_ui(r0)
                        if (r0 == 0) goto L16
                        X.AWx r0 = r7.offset
                        if (r0 == 0) goto L72
                        com.facebook.aura.ui.ReorderableLazyListState r6 = r14.$state
                        long r0 = r0.A00
                        float r0 = X.AnonymousClass001.A01(r2, r0)
                        r6.onDrag$fbandroid_express_aura_java_com_facebook_aura_ui_ui(r0)
                    L72:
                        long r9 = r15.A08
                        com.facebook.aura.ui.ReorderableLazyListState r0 = r14.$state
                        com.facebook.aura.ui.ReorderableListKt$reorderable$1$1$2 r11 = new com.facebook.aura.ui.ReorderableListKt$reorderable$1$1$2
                        r11.<init>(r0)
                        com.facebook.aura.ui.ReorderableListKt$reorderable$1$1$3 r12 = new com.facebook.aura.ui.ReorderableListKt$reorderable$1$1$3
                        r12.<init>(r0)
                        com.facebook.aura.ui.ReorderableListKt$reorderable$1$1$4 r13 = new com.facebook.aura.ui.ReorderableListKt$reorderable$1$1$4
                        r13.<init>(r0)
                        r0 = 0
                        r14.L$0 = r0
                        r14.L$1 = r0
                        r14.L$2 = r0
                        r14.label = r5
                        java.lang.Object r0 = com.facebook.aura.ui.ReorderableListKt.m2339detectDragVnAYq1g(r8, r9, r11, r12, r13, r14)
                        if (r0 != r4) goto L16
                        return r4
                    L95:
                        java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.ReorderableListKt.C142511.C04151.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // X.G0V
                public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                    return ((C04151) create(bRr, htJ)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                return C3cG.A0U(ForEachGestureKt.A02(bRr, htJ, new C04151(reorderableLazyListState, null)));
            }
        }, Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d8  */
    /* renamed from: rememberReorderableLazyListState-aqv2aB4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.ui.ReorderableLazyListState m2341rememberReorderableLazyListStateaqv2aB4(androidx.compose.foundation.lazy.LazyListState r19, X.G0V<? super com.facebook.aura.ui.ItemPosition, ? super java.lang.Integer, java.lang.Integer> r20, X.G0W<? super com.facebook.aura.ui.ItemPosition, java.lang.Object, ? super java.lang.Boolean, ? extends java.lang.Object> r21, X.G2j<? super com.facebook.aura.ui.ItemPosition, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Boolean, java.lang.Integer> r22, X.G0V<? super com.facebook.aura.ui.ItemPosition, java.lang.Object, java.lang.Boolean> r23, X.G0U<? super com.facebook.aura.ui.DragRelease, java.lang.Boolean> r24, kotlin.jvm.functions.Function0<kotlin.Unit> r25, kotlin.jvm.functions.Function0<kotlin.Unit> r26, kotlin.jvm.functions.Function0<kotlin.Unit> r27, float r28, X.BFM r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.ReorderableListKt.m2341rememberReorderableLazyListStateaqv2aB4(androidx.compose.foundation.lazy.LazyListState, X.G0V, X.G0W, X.G2j, X.G0V, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, float, X.BFM, int, int):com.facebook.aura.ui.ReorderableLazyListState");
    }
}
