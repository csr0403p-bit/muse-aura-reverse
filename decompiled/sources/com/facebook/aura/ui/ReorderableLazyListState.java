package com.facebook.aura.ui;

import X.A3q;
import X.AGE;
import X.AGF;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLW;
import X.BO7;
import X.C00q;
import X.C06H;
import X.C1051ASv;
import X.C1160Acs;
import X.C1161Act;
import X.C16C;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.GCV;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HzR;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ReorderableLazyListState {
    public static final int $stable = 8;
    public static final long ACCELERATION_LIMIT_TIME_MS = 1500;
    public static final Companion Companion = new Companion();
    public HoC autoscroller;
    public final G0V<ItemPosition, Object, Boolean> canNestInto;
    public long dragSession;
    public final MutableState draggingDelta$delegate;
    public final MutableState draggingItemIndex$delegate;
    public float draggingItemInitialOffset;
    public float dwellAnchor;
    public HoC dwellJob;
    public final float dwellMovementThreshold;
    public Object dwellRoomBeforeKey;
    public Object dwellTargetKey;
    public final C00q externalDragDelta$delegate;
    public final MutableState externalDragHostKey$delegate;
    public final MutableState externalDragKey$delegate;
    public float externalDragLastTranslationY;
    public int externalDragSize;
    public float externalDragStartTop;
    public float externalDragTopInHost;
    public Object hoveredTargetKey;
    public final HzR<StartDrag> interactions;
    public final LazyListState listState;
    public final float maxScrollPerFrame;
    public final MutableState nestTargetKey$delegate;
    public final G0U<DragRelease, Boolean> onDragEnd;
    public final Function0<Unit> onDragSettled;
    public final Function0<Unit> onDragStarted;
    public final Function0<Unit> onRoomOpened;
    public final G0W<ItemPosition, Object, Boolean, Object> roomBeforeFor;
    public final MutableState roomBeforeKey$delegate;
    public Float roomTopHint;
    public final G2j<ItemPosition, Integer, Integer, Boolean, Integer> roomTopHintFor;
    public final C3UX scope;
    public final HzR<Float> scrollChannel;
    public final MutableState selected$delegate;
    public final MutableState settlement$delegate;
    public HoC settlementJob;
    public HoC suppressionJob;
    public final G0V<ItemPosition, Integer, Integer> targetSize;

    @DebugMetadata(c = "com.facebook.aura.ui.ReorderableLazyListState$autoscroll$1", f = "ReorderableList.kt", l = {634}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ui.ReorderableLazyListState$autoscroll$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ float $scrollOffset;
        public Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ ReorderableLazyListState this$0;

        /* renamed from: com.facebook.aura.ui.ReorderableLazyListState$autoscroll$1$1, reason: invalid class name and collision with other inner class name */
        public final class C04111 extends AbstractC7559F3s implements G0U<Long, Unit> {
            public final /* synthetic */ C1051ASv $scroll;
            public final /* synthetic */ BO7 $start;
            public final /* synthetic */ ReorderableLazyListState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04111(BO7 bo7, C1051ASv c1051ASv, ReorderableLazyListState reorderableLazyListState) {
                super(1);
                this.$start = bo7;
                this.$scroll = c1051ASv;
                this.this$0 = reorderableLazyListState;
            }

            public final void invoke(long j) {
                BO7 bo7 = this.$start;
                long j2 = bo7.element;
                if (j2 == 0) {
                    bo7.element = j;
                    return;
                }
                C1051ASv c1051ASv = this.$scroll;
                ReorderableLazyListState reorderableLazyListState = this.this$0;
                c1051ASv.element = reorderableLazyListState.calcAutoScrollOffset(j - j2, reorderableLazyListState.maxScrollPerFrame);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                invoke(C3cG.A05(l));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f, ReorderableLazyListState reorderableLazyListState, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$scrollOffset = f;
            this.this$0 = reorderableLazyListState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$scrollOffset, this.this$0, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0046 -> B:6:0x0014). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r3 = 1
                if (r0 == 0) goto L49
                if (r0 != r3) goto L5e
                java.lang.Object r5 = r7.L$1
                X.BO7 r5 = (X.BO7) r5
                java.lang.Object r2 = r7.L$0
                X.ASv r2 = (X.C1051ASv) r2
                X.Hwg.A00(r8)
            L14:
                com.facebook.aura.ui.ReorderableLazyListState r0 = r7.this$0
                X.HzR<java.lang.Float> r6 = r0.scrollChannel
                float r1 = r2.element
                java.lang.Float r0 = new java.lang.Float
                r0.<init>(r1)
                r6.AhZ(r0)
            L22:
                float r1 = r2.element
                r0 = 0
                int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                if (r0 == 0) goto L5b
                com.facebook.aura.ui.ReorderableLazyListState r0 = r7.this$0
                X.HoC r0 = r0.autoscroller
                if (r0 == 0) goto L5b
                boolean r0 = r0.isActive()
                if (r0 != r3) goto L5b
                com.facebook.aura.ui.ReorderableLazyListState r1 = r7.this$0
                com.facebook.aura.ui.ReorderableLazyListState$autoscroll$1$1 r0 = new com.facebook.aura.ui.ReorderableLazyListState$autoscroll$1$1
                r0.<init>(r5, r2, r1)
                r7.L$0 = r2
                r7.L$1 = r5
                r7.label = r3
                java.lang.Object r0 = X.AvW.A00(r0, r7)
                if (r0 != r4) goto L14
                return r4
            L49:
                X.Hwg.A00(r8)
                X.ASv r2 = new X.ASv
                r2.<init>()
                float r0 = r7.$scrollOffset
                r2.element = r0
                X.BO7 r5 = new X.BO7
                r5.<init>()
                goto L22
            L5b:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            L5e:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.ReorderableLazyListState.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ui.ReorderableLazyListState$scheduleSettlementTimeout$1", f = "ReorderableList.kt", l = {432}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ui.ReorderableLazyListState$scheduleSettlementTimeout$1, reason: invalid class name and case insensitive filesystem */
    public final class C142471 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ DragSettlementPhase $expectedPhase;
        public final /* synthetic */ long $session;
        public final /* synthetic */ long $timeoutMs;
        public int label;
        public final /* synthetic */ ReorderableLazyListState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142471(long j, ReorderableLazyListState reorderableLazyListState, long j2, DragSettlementPhase dragSettlementPhase, HtJ<? super C142471> htJ) {
            super(2, htJ);
            this.$timeoutMs = j;
            this.this$0 = reorderableLazyListState;
            this.$session = j2;
            this.$expectedPhase = dragSettlementPhase;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C142471(this.$timeoutMs, this.this$0, this.$session, this.$expectedPhase, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    long j = this.$timeoutMs;
                    this.label = 1;
                    if (C7Bq.A01(j, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                DragSettlement settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui = this.this$0.getSettlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui();
                if (settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui != null && settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.session == this.$session && settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.phase == this.$expectedPhase) {
                    this.this$0.enterSuppression(settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui);
                }
                return Unit.INSTANCE;
            } finally {
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C142471) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ui.ReorderableLazyListState$scheduleSuppressionClear$1", f = "ReorderableList.kt", l = {463}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ui.ReorderableLazyListState$scheduleSuppressionClear$1, reason: invalid class name and case insensitive filesystem */
    public final class C142481 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $session;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142481(long j, HtJ<? super C142481> htJ) {
            super(2, htJ);
            this.$session = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ReorderableLazyListState.this.new C142481(this.$session, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(250L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            DragSettlement settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui = ReorderableLazyListState.this.getSettlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui();
            if (settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui != null && settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.session == this.$session && settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.phase == DragSettlementPhase.SUPPRESSING) {
                ReorderableLazyListState.this.setSettlement(null);
                ReorderableLazyListState.this.externalDragLastTranslationY = 0.0f;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C142481) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ui.ReorderableLazyListState$startDwell$1", f = "ReorderableList.kt", l = {587}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ui.ReorderableLazyListState$startDwell$1, reason: invalid class name and case insensitive filesystem */
    public final class C142491 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Object $nextRoomBeforeKey;
        public final /* synthetic */ boolean $placeAfterTarget;
        public final /* synthetic */ long $session;
        public final /* synthetic */ Object $targetKey;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142491(long j, Object obj, Object obj2, boolean z, HtJ<? super C142491> htJ) {
            super(2, htJ);
            this.$session = j;
            this.$targetKey = obj;
            this.$nextRoomBeforeKey = obj2;
            this.$placeAfterTarget = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ReorderableLazyListState.this.new C142491(this.$session, this.$targetKey, this.$nextRoomBeforeKey, this.$placeAfterTarget, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Float fCalculateRoomTopHint;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(350L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            ReorderableLazyListState reorderableLazyListState = ReorderableLazyListState.this;
            if (reorderableLazyListState.dragSession == this.$session && reorderableLazyListState.getDraggingItemKey() != null && C7384Etj.areEqual(ReorderableLazyListState.this.dwellTargetKey, this.$targetKey) && C7384Etj.areEqual(ReorderableLazyListState.this.dwellRoomBeforeKey, this.$nextRoomBeforeKey) && (fCalculateRoomTopHint = ReorderableLazyListState.this.calculateRoomTopHint(this.$targetKey, this.$placeAfterTarget)) != null) {
                float fFloatValue = fCalculateRoomTopHint.floatValue();
                ReorderableLazyListState reorderableLazyListState2 = ReorderableLazyListState.this;
                reorderableLazyListState2.dwellJob = null;
                reorderableLazyListState2.roomTopHint = new Float(fFloatValue);
                ReorderableLazyListState.this.setRoomBeforeKey(this.$nextRoomBeforeKey);
                ReorderableLazyListState.this.setNestTargetKey(null);
                Function0<Unit> function0 = ReorderableLazyListState.this.onRoomOpened;
                if (function0 != null) {
                    function0.invoke();
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C142491) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final boolean beginDrag(C16C c16c) {
        if (c16c == null || getSelected() != null || this.externalDragKey$delegate.getValue() != null) {
            return false;
        }
        setSelected(c16c);
        setDraggingItemIndex(Integer.valueOf(((C1160Acs) c16c).A07));
        this.draggingItemInitialOffset = r3.A02;
        setDraggingDelta(0.0f);
        beginSession();
        Function0<Unit> function0 = this.onDragStarted;
        if (function0 != null) {
            function0.invoke();
        }
        return true;
    }

    private final void beginSession() {
        setSettlement(null);
        HoC hoC = this.settlementJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.settlementJob = null;
        HoC hoC2 = this.suppressionJob;
        if (hoC2 != null) {
            hoC2.A5w(null);
        }
        this.suppressionJob = null;
        this.externalDragLastTranslationY = 0.0f;
        this.dragSession++;
        clearDropIntent();
    }

    private final void resetDrag() {
        setSelected(null);
        setExternalDragKey(null);
        setExternalDragHostKey(null);
        this.externalDragSize = 0;
        this.externalDragStartTop = 0.0f;
        setExternalDragDelta(0.0f);
        this.externalDragTopInHost = 0.0f;
        setDraggingDelta(0.0f);
        this.draggingItemInitialOffset = 0.0f;
        setDraggingItemIndex(null);
        clearDropIntent();
        cancelAutoScroll();
    }

    private final void scheduleSettlementTimeout(long j, DragSettlementPhase dragSettlementPhase, long j2) {
        AnonymousClass002.A1K(this.settlementJob);
        this.settlementJob = AnonymousClass001.A11(new C142471(j2, this, j, dragSettlementPhase, null), this.scope);
    }

    private final void startDwell(Object obj, Object obj2, float f, boolean z) {
        AnonymousClass002.A1K(this.dwellJob);
        this.dwellTargetKey = obj;
        this.dwellRoomBeforeKey = obj2;
        this.dwellAnchor = f;
        long j = this.dragSession;
        this.dwellJob = AnonymousClass001.A11(new C142491(j, obj, obj2, z, null), this.scope);
    }

    public final boolean onDragStart$fbandroid_express_aura_java_com_facebook_aura_ui_ui(Object obj) {
        Object next;
        C7384Etj.A0Y(obj, 0);
        Iterator itA0O = C3cJ.A0O(this);
        while (true) {
            if (!itA0O.hasNext()) {
                next = null;
                break;
            }
            next = itA0O.next();
            if (C7384Etj.areEqual(((C1160Acs) ((C16C) next)).A0B, obj)) {
                break;
            }
        }
        return beginDrag((C16C) next);
    }

    public final void onSettlementAnimationFinished$fbandroid_express_aura_java_com_facebook_aura_ui_ui(DragSettlement dragSettlement) {
        C7384Etj.A0Y(dragSettlement, 0);
        DragSettlement settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui = getSettlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui();
        if (settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui != null) {
            long j = settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.session;
            if (j == dragSettlement.session && settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.phase == DragSettlementPhase.ANIMATING) {
                completeSettlement(j);
            }
        }
    }

    public final Float settlementDestinationTop$fbandroid_express_aura_java_com_facebook_aura_ui_ui(DragSettlement dragSettlement) {
        Object next;
        C7384Etj.A0Y(dragSettlement, 0);
        DragSettlement settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui = getSettlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui();
        if (settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui == null || settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.session != dragSettlement.session || settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.phase != DragSettlementPhase.ANIMATING) {
            return null;
        }
        Iterator itA0O = C3cJ.A0O(this);
        while (true) {
            if (!itA0O.hasNext()) {
                next = null;
                break;
            }
            next = itA0O.next();
            if (C7384Etj.areEqual(((C1160Acs) ((C16C) next)).A0B, dragSettlement.draggedKey)) {
                break;
            }
        }
        if (((C16C) next) != null) {
            return Float.valueOf(((C1160Acs) r2).A02);
        }
        return null;
    }

    public final float settlementTranslationY$fbandroid_express_aura_java_com_facebook_aura_ui_ui(DragSettlement dragSettlement, float f) {
        C7384Etj.A0Y(dragSettlement, 0);
        Float f2 = settlementDestinationTop$fbandroid_express_aura_java_com_facebook_aura_ui_ui(dragSettlement);
        return (dragSettlement.releaseTop - (f2 != null ? f2.floatValue() : dragSettlement.destinationTop)) * (1.0f - f);
    }

    public final boolean startExternalDrag(Object obj, Object obj2, int i, float f) {
        Object next;
        boolean zA1a = AnonymousClass002.A1a(obj, obj2);
        if (this.externalDragKey$delegate.getValue() == null && getSelected() == null) {
            Iterator itA0O = C3cJ.A0O(this);
            while (true) {
                if (!itA0O.hasNext()) {
                    next = null;
                    break;
                }
                next = itA0O.next();
                if (C7384Etj.areEqual(((C1160Acs) ((C16C) next)).A0B, obj2)) {
                    break;
                }
            }
            C16C c16c = (C16C) next;
            if (c16c != null) {
                C1160Acs c1160Acs = (C1160Acs) c16c;
                float f2 = c1160Acs.A09 - f;
                beginSession();
                setExternalDragKey(obj);
                setExternalDragHostKey(obj2);
                this.externalDragSize = i;
                this.externalDragStartTop = c1160Acs.A02 + f2;
                setExternalDragDelta(0.0f);
                this.externalDragTopInHost = f2;
                this.externalDragLastTranslationY = 0.0f;
                Function0<Unit> function0 = this.onDragStarted;
                if (function0 != null) {
                    function0.invoke();
                }
                return zA1a;
            }
        }
        return false;
    }

    public final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        public final float interpolateOutOfBoundsScroll(int i, float f, long j, float f2) {
            if (f == 0.0f) {
                return 0.0f;
            }
            float fMin = 1.0f - Math.min(1.0f, Math.abs(f) / i);
            float fSignum = Math.signum(f) * f2 * (1.0f - (((fMin * fMin) * fMin) * fMin));
            float f3 = j <= 1500 ? j / 1500.0f : 1.0f;
            return fSignum * f3 * f3 * f3 * f3 * f3;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final void autoscroll(float f) {
        HoC hoC = this.autoscroller;
        if (hoC == null || !hoC.isActive()) {
            this.autoscroller = AnonymousClass001.A11(new AnonymousClass1(f, this, null), this.scope);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Float calculateRoomTopHint(java.lang.Object r9, boolean r10) {
        /*
            r8 = this;
            androidx.compose.foundation.lazy.LazyListState r0 = r8.listState
            X.2A9 r0 = r0.A04()
            X.Act r0 = (X.C1161Act) r0
            java.util.List<X.Acs> r6 = r0.A0D
            java.util.Iterator r1 = r6.iterator()
        Le:
            boolean r0 = r1.hasNext()
            r4 = 0
            if (r0 == 0) goto L2b
            java.lang.Object r7 = r1.next()
            r0 = r7
            X.16C r0 = (X.C16C) r0
            X.Acs r0 = (X.C1160Acs) r0
            java.lang.Object r0 = r0.A0B
            boolean r0 = X.C7384Etj.areEqual(r0, r9)
            if (r0 == 0) goto Le
        L26:
            X.16C r7 = (X.C16C) r7
            if (r7 != 0) goto L2d
            return r4
        L2b:
            r7 = r4
            goto L26
        L2d:
            X.G2j<com.facebook.aura.ui.ItemPosition, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Integer> r5 = r8.roomTopHintFor
            X.Acs r7 = (X.C1160Acs) r7
            int r1 = r7.A07
            java.lang.Object r0 = r7.A0B
            com.facebook.aura.ui.ItemPosition r3 = new com.facebook.aura.ui.ItemPosition
            r3.<init>(r1, r0)
            int r0 = r7.A02
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r7.A09
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            java.lang.Object r0 = r5.invoke(r3, r2, r1, r0)
            int r3 = X.AnonymousClass001.A0F(r0)
            X.16C r0 = r8.getSelected()
            if (r0 == 0) goto L5e
            X.Acs r0 = (X.C1160Acs) r0
            java.lang.Object r5 = r0.A0B
            if (r5 != 0) goto L64
        L5e:
            androidx.compose.runtime.MutableState r0 = r8.externalDragHostKey$delegate
            java.lang.Object r5 = r0.getValue()
        L64:
            java.util.Iterator r2 = r6.iterator()
        L68:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L80
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.16C r0 = (X.C16C) r0
            X.Acs r0 = (X.C1160Acs) r0
            java.lang.Object r0 = r0.A0B
            boolean r0 = X.C7384Etj.areEqual(r0, r5)
            if (r0 == 0) goto L68
            r4 = r1
        L80:
            X.16C r4 = (X.C16C) r4
            androidx.compose.runtime.MutableState r0 = r8.externalDragKey$delegate
            java.lang.Object r0 = r0.getValue()
            r2 = 0
            if (r0 == 0) goto L9d
            int r0 = r8.externalDragSize
            if (r4 == 0) goto L96
        L8f:
            X.Acs r4 = (X.C1160Acs) r4
            int r1 = r4.A02
            if (r1 >= r3) goto L96
            r2 = r0
        L96:
            int r3 = r3 - r2
            float r0 = (float) r3
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L9d:
            if (r4 == 0) goto L96
            r0 = r4
            X.Acs r0 = (X.C1160Acs) r0
            int r0 = r0.A09
            goto L8f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.ReorderableLazyListState.calculateRoomTopHint(java.lang.Object, boolean):java.lang.Float");
    }

    private final void cancelAutoScroll() {
        this.autoscroller = C3cI.A15(this.autoscroller);
    }

    private final void cancelDwell() {
        HoC hoCA15 = C3cI.A15(this.dwellJob);
        this.dwellJob = hoCA15;
        this.dwellTargetKey = hoCA15;
        this.dwellRoomBeforeKey = hoCA15;
    }

    private final void clearDropIntent() {
        HoC hoC = this.dwellJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.dwellJob = null;
        this.dwellTargetKey = null;
        this.dwellRoomBeforeKey = null;
        this.hoveredTargetKey = null;
        setNestTargetKey(null);
        setRoomBeforeKey(null);
        this.roomTopHint = null;
    }

    private final float currentDragVisualTop() {
        float f;
        float draggingDelta;
        if (this.externalDragKey$delegate.getValue() != null) {
            f = this.externalDragStartTop;
            draggingDelta = this.externalDragDelta$delegate.AFn();
        } else {
            f = this.draggingItemInitialOffset;
            draggingDelta = getDraggingDelta();
        }
        return f + draggingDelta;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enterSuppression(DragSettlement dragSettlement) {
        setSettlement(dragSettlement.copy(dragSettlement.session, dragSettlement.draggedKey, dragSettlement.releaseTop, dragSettlement.destinationTop, dragSettlement.sourceHostKey, dragSettlement.sourceTopInHost, dragSettlement.settlingKeys, DragSettlementPhase.SUPPRESSING));
        resetDrag();
        Function0<Unit> function0 = this.onDragSettled;
        if (function0 != null) {
            function0.invoke();
        }
        scheduleSuppressionClear(dragSettlement.session);
    }

    private final float getDraggingDelta() {
        return AnonymousClass001.A02(this.draggingDelta$delegate.getValue());
    }

    private final float getExternalDragDelta() {
        return this.externalDragDelta$delegate.AFn();
    }

    private final Object getExternalDragKey() {
        return this.externalDragKey$delegate.getValue();
    }

    private final C16C getSelected() {
        return (C16C) this.selected$delegate.getValue();
    }

    private final void scheduleSuppressionClear(long j) {
        HtJ htJA13 = AnonymousClass006.A13(this.suppressionJob);
        this.suppressionJob = AnonymousClass001.A11(new C142481(j, htJA13), this.scope);
    }

    private final void setDraggingDelta(float f) {
        this.draggingDelta$delegate.Af8(Float.valueOf(f));
    }

    private final void setDraggingItemIndex(Integer num) {
        this.draggingItemIndex$delegate.Af8(num);
    }

    private final void setExternalDragDelta(float f) {
        this.externalDragDelta$delegate.AdS(f);
    }

    private final void setExternalDragHostKey(Object obj) {
        this.externalDragHostKey$delegate.Af8(obj);
    }

    private final void setExternalDragKey(Object obj) {
        this.externalDragKey$delegate.Af8(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setNestTargetKey(Object obj) {
        this.nestTargetKey$delegate.Af8(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRoomBeforeKey(Object obj) {
        this.roomBeforeKey$delegate.Af8(obj);
    }

    private final void setSelected(C16C c16c) {
        this.selected$delegate.Af8(c16c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSettlement(DragSettlement dragSettlement) {
        this.settlement$delegate.Af8(dragSettlement);
    }

    public final void abortExternalDrag() {
        if (this.externalDragKey$delegate.getValue() != null) {
            setSettlement(null);
            HoC hoC = this.settlementJob;
            if (hoC != null) {
                hoC.A5w(null);
            }
            this.settlementJob = null;
            HoC hoC2 = this.suppressionJob;
            if (hoC2 != null) {
                hoC2.A5w(null);
            }
            this.suppressionJob = null;
            setExternalDragKey(null);
            setExternalDragHostKey(null);
            this.externalDragSize = 0;
            this.externalDragStartTop = 0.0f;
            setExternalDragDelta(0.0f);
            this.externalDragTopInHost = 0.0f;
            this.externalDragLastTranslationY = 0.0f;
            clearDropIntent();
            Function0<Unit> function0 = this.onDragSettled;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public final void acknowledgePlacement(boolean z) {
        Object next;
        DragSettlement settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui = getSettlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui();
        if (settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui == null || settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.phase != DragSettlementPhase.AWAITING_PLACEMENT) {
            return;
        }
        if (!z) {
            completeSettlement(settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.session);
            return;
        }
        Iterator itA0O = C3cJ.A0O(this);
        while (true) {
            if (!itA0O.hasNext()) {
                next = null;
                break;
            } else {
                next = itA0O.next();
                if (C7384Etj.areEqual(((C1160Acs) ((C16C) next)).A0B, ReorderableListKt.REORDERABLE_ROOM_ITEM_KEY)) {
                    break;
                }
            }
        }
        float f = ((C16C) next) != null ? ((C1160Acs) r3).A02 : settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.destinationTop;
        DragSettlementPhase dragSettlementPhase = DragSettlementPhase.ANIMATING;
        setSettlement(settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.copy(settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.session, settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.draggedKey, settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.releaseTop, f, settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.sourceHostKey, settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.sourceTopInHost, settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.settlingKeys, dragSettlementPhase));
        HoC hoC = this.settlementJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.settlementJob = null;
        resetDrag();
        scheduleSettlementTimeout(settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.session, dragSettlementPhase, 500L);
    }

    public final boolean endDrag$fbandroid_express_aura_java_com_facebook_aura_ui_ui() {
        Object next;
        float fFloatValue;
        boolean zA1b;
        Object obj;
        Object draggingItemKey = getDraggingItemKey();
        DragRelease dragRelease = draggingItemKey != null ? new DragRelease(draggingItemKey, this.hoveredTargetKey, this.nestTargetKey$delegate.getValue(), this.roomBeforeKey$delegate.getValue()) : null;
        long j = this.dragSession;
        float fCurrentDragVisualTop = currentDragVisualTop();
        Iterator itA0O = C3cJ.A0O(this);
        while (true) {
            if (!itA0O.hasNext()) {
                next = null;
                break;
            }
            next = itA0O.next();
            if (C7384Etj.areEqual(((C1160Acs) ((C16C) next)).A0B, ReorderableListKt.REORDERABLE_ROOM_ITEM_KEY)) {
                break;
            }
        }
        C16C c16c = (C16C) next;
        if (c16c != null) {
            fFloatValue = ((C1160Acs) c16c).A02;
        } else if (this.roomBeforeKey$delegate.getValue() != null) {
            Float f = this.roomTopHint;
            if (f == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = fCurrentDragVisualTop;
        }
        Set setA05 = BLW.A05(getDraggingItemKey(), this.externalDragHostKey$delegate.getValue(), this.nestTargetKey$delegate.getValue());
        if (dragRelease != null) {
            G0U<DragRelease, Boolean> g0u = this.onDragEnd;
            zA1b = AnonymousClass002.A1b(g0u != null ? g0u.invoke(dragRelease) : null, true);
        } else {
            zA1b = false;
        }
        cancelAutoScroll();
        AnonymousClass002.A1K(this.settlementJob);
        if (!zA1b || (obj = dragRelease.key) == null) {
            setSettlement(null);
            resetDrag();
            Function0<Unit> function0 = this.onDragSettled;
            if (function0 != null) {
                function0.invoke();
            }
            return false;
        }
        Object value = this.externalDragHostKey$delegate.getValue();
        Float fValueOf = this.externalDragKey$delegate.getValue() != null ? Float.valueOf(this.externalDragTopInHost) : null;
        DragSettlementPhase dragSettlementPhase = DragSettlementPhase.AWAITING_PLACEMENT;
        setSettlement(new DragSettlement(j, obj, fCurrentDragVisualTop, fFloatValue, value, fValueOf, setA05, dragSettlementPhase));
        scheduleSettlementTimeout(j, dragSettlementPhase, 2000L);
        return true;
    }

    public final boolean endExternalDrag() {
        return this.externalDragKey$delegate.getValue() != null && endDrag$fbandroid_express_aura_java_com_facebook_aura_ui_ui();
    }

    public final Integer getDraggingItemIndex() {
        return (Integer) this.draggingItemIndex$delegate.getValue();
    }

    public final Object getExternalDragHostKey() {
        return this.externalDragHostKey$delegate.getValue();
    }

    public final HzR<StartDrag> getInteractions$fbandroid_express_aura_java_com_facebook_aura_ui_ui() {
        return this.interactions;
    }

    public final LazyListState getListState() {
        return this.listState;
    }

    public final Object getNestTargetKey() {
        return this.nestTargetKey$delegate.getValue();
    }

    public final Object getRoomBeforeKey() {
        return this.roomBeforeKey$delegate.getValue();
    }

    public final Object getRoomItemKey() {
        return ReorderableListKt.REORDERABLE_ROOM_ITEM_KEY;
    }

    public final HzR<Float> getScrollChannel$fbandroid_express_aura_java_com_facebook_aura_ui_ui() {
        return this.scrollChannel;
    }

    public final DragSettlement getSettlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui() {
        return (DragSettlement) this.settlement$delegate.getValue();
    }

    public final boolean onDragStartAt$fbandroid_express_aura_java_com_facebook_aura_ui_ui(int i) {
        Object next;
        int i2 = i + ((C1161Act) this.listState.A04()).A07;
        Iterator itA0O = C3cJ.A0O(this);
        while (true) {
            if (!itA0O.hasNext()) {
                next = null;
                break;
            }
            next = itA0O.next();
            C1160Acs c1160Acs = (C1160Acs) ((C16C) next);
            int i3 = c1160Acs.A02;
            if (i2 <= c1160Acs.A09 + i3 && i3 <= i2) {
                break;
            }
        }
        return beginDrag((C16C) next);
    }

    public final boolean onExternalDrag(float f) {
        if (this.externalDragKey$delegate.getValue() != null) {
            List<C1160Acs> list = ((C1161Act) this.listState.A04()).A0D;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<C1160Acs> it = list.iterator();
                while (it.hasNext()) {
                    if (C7384Etj.areEqual(it.next().A0B, this.externalDragHostKey$delegate.getValue())) {
                        setExternalDragDelta(f);
                        float fCurrentDragVisualTop = currentDragVisualTop();
                        updateDropIntent(fCurrentDragVisualTop, this.externalDragSize + fCurrentDragVisualTop);
                        float fCalcAutoScrollOffset = calcAutoScrollOffset(0L, this.maxScrollPerFrame);
                        if (fCalcAutoScrollOffset == 0.0f) {
                            cancelAutoScroll();
                            return true;
                        }
                        autoscroll(fCalcAutoScrollOffset);
                        return true;
                    }
                }
            }
            abortExternalDrag();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReorderableLazyListState(LazyListState lazyListState, C3UX c3ux, float f, float f2, G0V<? super ItemPosition, ? super Integer, Integer> g0v, G0W<? super ItemPosition, Object, ? super Boolean, ? extends Object> g0w, G2j<? super ItemPosition, ? super Integer, ? super Integer, ? super Boolean, Integer> g2j, G0V<? super ItemPosition, Object, Boolean> g0v2, G0U<? super DragRelease, Boolean> g0u, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        boolean zA1b = AnonymousClass004.A1b(lazyListState, c3ux);
        C7384Etj.A0Y(g0v, 4);
        AnonymousClass005.A0z(g0w, g2j, g0v2);
        this.listState = lazyListState;
        this.scope = c3ux;
        this.maxScrollPerFrame = f;
        this.dwellMovementThreshold = f2;
        this.targetSize = g0v;
        this.roomBeforeFor = g0w;
        this.roomTopHintFor = g2j;
        this.canNestInto = g0v2;
        this.onDragEnd = g0u;
        this.onDragStarted = function0;
        this.onRoomOpened = function02;
        this.onDragSettled = function03;
        AGE ageA01 = AGF.A01();
        this.draggingItemIndex$delegate = C3cG.A08(ageA01, null);
        this.nestTargetKey$delegate = C3cG.A08(ageA01, null);
        this.roomBeforeKey$delegate = C3cG.A08(ageA01, null);
        this.settlement$delegate = C3cG.A08(ageA01, null);
        this.interactions = new GCV(zA1b ? 1 : 0, null);
        this.scrollChannel = new GCV(zA1b ? 1 : 0, null);
        this.draggingDelta$delegate = C3cG.A08(ageA01, Float.valueOf(0.0f));
        this.selected$delegate = C3cG.A08(ageA01, null);
        this.externalDragKey$delegate = C3cG.A08(ageA01, null);
        this.externalDragDelta$delegate = new ParcelableSnapshotMutableFloatState(0.0f);
        this.externalDragHostKey$delegate = C3cG.A08(ageA01, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[PHI: r2
  0x0059: PHI (r2v3 float) = (r2v2 float), (r2v4 float) binds: [B:19:0x0056, B:13:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float calcAutoScrollOffset(long r8, float r10) {
        /*
            r7 = this;
            int r1 = r7.getDraggingItemSize()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r1 > 0) goto Lb
            r0 = 0
        Lb:
            r5 = 0
            if (r0 == 0) goto L60
            int r4 = r0.intValue()
            float r3 = r7.currentDragVisualTop()
            float r2 = (float) r4
            float r2 = r2 + r3
            androidx.compose.runtime.MutableState r0 = r7.externalDragKey$delegate
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L5b
            X.00q r0 = r7.externalDragDelta$delegate
            float r1 = r0.AFn()
        L26:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L43
            androidx.compose.foundation.lazy.LazyListState r0 = r7.listState
            X.2A9 r0 = r0.A04()
            X.Act r0 = (X.C1161Act) r0
            int r0 = r0.A06
            float r0 = (float) r0
            float r2 = r2 - r0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L59
        L3a:
            com.facebook.aura.ui.ReorderableLazyListState$Companion r3 = com.facebook.aura.ui.ReorderableLazyListState.Companion
            r6 = r8
            r8 = r10
            float r0 = com.facebook.aura.ui.ReorderableLazyListState.Companion.access$interpolateOutOfBoundsScroll(r3, r4, r5, r6, r8)
            return r0
        L43:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L3a
            androidx.compose.foundation.lazy.LazyListState r0 = r7.listState
            X.2A9 r0 = r0.A04()
            X.Act r0 = (X.C1161Act) r0
            int r0 = r0.A07
            float r0 = (float) r0
            float r2 = r3 - r0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L59
            goto L3a
        L59:
            r5 = r2
            goto L3a
        L5b:
            float r1 = r7.getDraggingDelta()
            goto L26
        L60:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.ReorderableLazyListState.calcAutoScrollOffset(long, float):float");
    }

    private final void completeSettlement(long j) {
        DragSettlement settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui = getSettlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui();
        if (settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui != null) {
            long j2 = settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.session;
            if (j2 == j) {
                setSettlement(settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.copy(j2, settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.draggedKey, settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.releaseTop, settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.destinationTop, settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.sourceHostKey, settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.sourceTopInHost, settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.settlingKeys, DragSettlementPhase.SUPPRESSING));
                HoC hoC = this.settlementJob;
                if (hoC != null) {
                    hoC.A5w(null);
                }
                this.settlementJob = null;
                resetDrag();
                Function0<Unit> function0 = this.onDragSettled;
                if (function0 != null) {
                    function0.invoke();
                }
                scheduleSuppressionClear(j);
            }
        }
    }

    private final C16C getDraggingLayoutInfo() {
        Object draggingItemKey = getDraggingItemKey();
        Object obj = null;
        if (draggingItemKey == null) {
            return null;
        }
        Iterator itA0O = C3cJ.A0O(this);
        while (true) {
            if (!itA0O.hasNext()) {
                break;
            }
            Object next = itA0O.next();
            if (C7384Etj.areEqual(((C1160Acs) ((C16C) next)).A0B, draggingItemKey)) {
                obj = next;
                break;
            }
        }
        return (C16C) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (X.C7384Etj.areEqual(r7 != null ? ((X.C1160Acs) r7).A0B : null, r10.dwellTargetKey) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateDropIntent(float r11, float r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.ReorderableLazyListState.updateDropIntent(float, float):void");
    }

    public final void abortDrag$fbandroid_express_aura_java_com_facebook_aura_ui_ui() {
        if (getSelected() == null && getDraggingItemIndex() == null) {
            return;
        }
        setSettlement(null);
        HoC hoC = this.settlementJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.settlementJob = null;
        HoC hoC2 = this.suppressionJob;
        if (hoC2 != null) {
            hoC2.A5w(null);
        }
        this.suppressionJob = null;
        resetDrag();
        Function0<Unit> function0 = this.onDragSettled;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final DragSettlement activeSettlementFor$fbandroid_express_aura_java_com_facebook_aura_ui_ui(Object obj) {
        DragSettlement settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui = getSettlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui();
        if (settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui != null && settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.phase == DragSettlementPhase.ANIMATING && C7384Etj.areEqual(settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.draggedKey, obj)) {
            return settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui;
        }
        return null;
    }

    public final Object getDraggingItemKey() {
        Object obj;
        C16C selected = getSelected();
        return (selected == null || (obj = ((C1160Acs) selected).A0B) == null) ? this.externalDragKey$delegate.getValue() : obj;
    }

    public final int getDraggingItemSize() {
        C16C selected = getSelected();
        return selected != null ? ((C1160Acs) selected).A09 : this.externalDragSize;
    }

    public final float getDraggingItemTop() {
        float f;
        float draggingDelta;
        DragSettlement settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui = getSettlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui();
        Object obj = null;
        if (settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui == null || settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.phase == DragSettlementPhase.AWAITING_PLACEMENT) {
            f = getDraggingLayoutInfo() != null ? ((C1160Acs) r0).A02 : this.draggingItemInitialOffset;
            draggingDelta = this.draggingItemInitialOffset + getDraggingDelta();
        } else {
            Iterator itA0O = C3cJ.A0O(this);
            while (true) {
                if (!itA0O.hasNext()) {
                    break;
                }
                Object next = itA0O.next();
                if (C7384Etj.areEqual(((C1160Acs) ((C16C) next)).A0B, settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.draggedKey)) {
                    obj = next;
                    break;
                }
            }
            f = ((C16C) obj) != null ? ((C1160Acs) r4).A02 : settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.destinationTop;
            draggingDelta = settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.releaseTop;
        }
        return draggingDelta - f;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b A[PHI: r4 r5
  0x001b: PHI (r4v0 java.lang.Object) = (r4v3 java.lang.Object), (r4v4 java.lang.Object) binds: [B:10:0x0019, B:7:0x000f] A[DONT_GENERATE, DONT_INLINE]
  0x001b: PHI (r5v2 com.facebook.aura.ui.DragSettlement) = (r5v5 com.facebook.aura.ui.DragSettlement), (r5v0 com.facebook.aura.ui.DragSettlement) binds: [B:10:0x0019, B:7:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056 A[PHI: r4 r5
  0x0056: PHI (r4v2 java.lang.Object) = (r4v0 java.lang.Object), (r4v3 java.lang.Object) binds: [B:12:0x001d, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r5v4 com.facebook.aura.ui.DragSettlement) = (r5v2 com.facebook.aura.ui.DragSettlement), (r5v5 com.facebook.aura.ui.DragSettlement) binds: [B:12:0x001d, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float getExternalDragTranslationY() {
        /*
            r7 = this;
            com.facebook.aura.ui.DragSettlement r5 = r7.getSettlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui()
            r6 = 0
            if (r5 == 0) goto L59
            com.facebook.aura.ui.DragSettlementPhase r1 = r5.phase
            com.facebook.aura.ui.DragSettlementPhase r0 = com.facebook.aura.ui.DragSettlementPhase.AWAITING_PLACEMENT
            if (r1 == r0) goto L59
            java.lang.Object r4 = r5.sourceHostKey
            if (r4 != 0) goto L1b
        L11:
            androidx.compose.runtime.MutableState r0 = r7.externalDragHostKey$delegate
            java.lang.Object r4 = r0.getValue()
            if (r4 == 0) goto L5b
            if (r5 == 0) goto L56
        L1b:
            java.lang.Float r0 = r5.sourceTopInHost
            if (r0 == 0) goto L56
            float r3 = r0.floatValue()
        L23:
            java.util.Iterator r2 = X.C3cJ.A0O(r7)
        L27:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.16C r0 = (X.C16C) r0
            X.Acs r0 = (X.C1160Acs) r0
            java.lang.Object r0 = r0.A0B
            boolean r0 = X.C7384Etj.areEqual(r0, r4)
            if (r0 == 0) goto L27
            r6 = r1
        L3f:
            X.16C r6 = (X.C16C) r6
            if (r6 == 0) goto L5b
            X.Acs r6 = (X.C1160Acs) r6
            int r0 = r6.A02
            float r1 = (float) r0
            if (r5 == 0) goto L51
            float r0 = r5.releaseTop
        L4c:
            float r0 = r0 - r1
            float r0 = r0 - r3
            r7.externalDragLastTranslationY = r0
            return r0
        L51:
            float r0 = r7.currentDragVisualTop()
            goto L4c
        L56:
            float r3 = r7.externalDragTopInHost
            goto L23
        L59:
            r5 = r6
            goto L11
        L5b:
            float r0 = r7.externalDragLastTranslationY
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.ReorderableLazyListState.getExternalDragTranslationY():float");
    }

    public final Set<Object> getSettlingItemKeys$fbandroid_express_aura_java_com_facebook_aura_ui_ui() {
        Set<Object> set;
        DragSettlement settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui = getSettlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui();
        return (settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui == null || (set = settlement$fbandroid_express_aura_java_com_facebook_aura_ui_ui.settlingKeys) == null) ? A3q.A00 : set;
    }

    public final void onDrag$fbandroid_express_aura_java_com_facebook_aura_ui_ui(float f) {
        if (getSelected() != null) {
            setDraggingDelta(getDraggingDelta() + f);
            float draggingDelta = this.draggingItemInitialOffset + getDraggingDelta();
            updateDropIntent(draggingDelta, ((C1160Acs) r2).A09 + draggingDelta);
            float fCalcAutoScrollOffset = calcAutoScrollOffset(0L, this.maxScrollPerFrame);
            if (fCalcAutoScrollOffset == 0.0f) {
                cancelAutoScroll();
            } else {
                autoscroll(fCalcAutoScrollOffset);
            }
        }
    }

    public final void onListScrolled$fbandroid_express_aura_java_com_facebook_aura_ui_ui() {
        float fCurrentDragVisualTop = currentDragVisualTop();
        int draggingItemSize = getDraggingItemSize();
        if (getDraggingItemKey() == null || draggingItemSize <= 0) {
            return;
        }
        updateDropIntent(fCurrentDragVisualTop, draggingItemSize + fCurrentDragVisualTop);
    }

    public /* synthetic */ ReorderableLazyListState(LazyListState lazyListState, C3UX c3ux, float f, float f2, G0V g0v, G0W g0w, G2j g2j, G0V g0v2, G0U g0u, Function0 function0, Function0 function02, Function0 function03, int i, C06H c06h) {
        this(lazyListState, c3ux, f, f2, g0v, g0w, g2j, g0v2, g0u, (i & 512) != 0 ? null : function0, (i & 1024) != 0 ? null : function02, (i & 2048) != 0 ? null : function03);
    }
}
