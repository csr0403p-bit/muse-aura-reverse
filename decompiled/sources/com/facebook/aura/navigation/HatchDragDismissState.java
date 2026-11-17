package com.facebook.aura.navigation;

import X.AGE;
import X.AGF;
import X.AWx;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.C00q;
import X.C2HU;
import X.C3UX;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.HtJ;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.facebook.aura.common.video.HatchTransportHttpDataSourceKt;
import com.facebook.aura.ui.sharedelement.HatchSharedElementTransform;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchDragDismissState implements HatchSharedElementTransform {
    public static final int $stable = 0;
    public final MutableState completesToSharedElementDestination$delegate;
    public final C00q destinationProgressValue$delegate;
    public final float dismissDistancePx;
    public final float dismissFlingDistancePx;
    public final float dismissFlingVelocityPx;
    public final MutableState dragOffset$delegate;
    public final float fadeDistancePx;
    public final MutableState hasSharedElementDestination$delegate;
    public final HatchInteractiveBackController interactiveBack;
    public boolean isNavigationStarted;
    public final C00q mediaAlpha$delegate;
    public final C00q navigationProgress$delegate;
    public final Function0<Unit> onDismissed;
    public final MutableState phase$delegate;
    public final C00q revealProgress$delegate;
    public final C3UX scope;

    @DebugMetadata(c = "com.facebook.aura.navigation.HatchDragDismissState$settle$1", f = "HatchDragDismissState.kt", l = {147, 149, 168, 191, 202, HatchTransportHttpDataSourceKt.HTTP_PARTIAL_CONTENT}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.navigation.HatchDragDismissState$settle$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $complete;
        public final /* synthetic */ float $startDestinationProgress;
        public final /* synthetic */ long $startOffset;
        public final /* synthetic */ float $startRevealProgress;
        public float F$0;
        public long J$0;
        public boolean Z$0;
        public int label;
        public final /* synthetic */ HatchDragDismissState this$0;

        /* renamed from: com.facebook.aura.navigation.HatchDragDismissState$settle$1$3, reason: invalid class name */
        public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<Float, Float, Unit> {
            public final /* synthetic */ boolean $complete;
            public final /* synthetic */ boolean $hasDestination;
            public final /* synthetic */ float $startDestinationProgress;
            public final /* synthetic */ long $startOffset;
            public final /* synthetic */ float $startRevealProgress;
            public final /* synthetic */ long $targetOffset;
            public final /* synthetic */ float $terminalNavigationProgress;
            public final /* synthetic */ HatchDragDismissState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(HatchDragDismissState hatchDragDismissState, long j, long j2, float f, boolean z, float f2, boolean z2, float f3) {
                super(2);
                this.this$0 = hatchDragDismissState;
                this.$startOffset = j;
                this.$targetOffset = j2;
                this.$startRevealProgress = f;
                this.$complete = z;
                this.$startDestinationProgress = f2;
                this.$hasDestination = z2;
                this.$terminalNavigationProgress = f3;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(Float f, Float f2) {
                invoke(AnonymousClass001.A02(f), AnonymousClass001.A02(f2));
                return Unit.INSTANCE;
            }

            public final void invoke(float f, float f2) {
                float fTransform = C2HU.A01.transform(f);
                HatchDragDismissState hatchDragDismissState = this.this$0;
                long j = this.$startOffset;
                hatchDragDismissState.m1450setDragOffsetk4lQ0M(AWx.A05(j, AWx.A02(AWx.A04(this.$targetOffset, j), fTransform)));
                HatchDragDismissState hatchDragDismissState2 = this.this$0;
                float f3 = this.$startRevealProgress;
                float f4 = 1.0f;
                hatchDragDismissState2.setRevealProgress(f3 + ((AnonymousClass006.A00(this.$complete ? 1 : 0) - f3) * fTransform));
                HatchDragDismissState hatchDragDismissState3 = this.this$0;
                boolean z = this.$complete;
                float f5 = this.$startDestinationProgress;
                if (!z) {
                    f5 *= 1.0f - fTransform;
                }
                hatchDragDismissState3.setDestinationProgressValue(f5);
                HatchDragDismissState hatchDragDismissState4 = this.this$0;
                if (this.$complete && !this.$hasDestination) {
                    f4 = 1.0f - fTransform;
                }
                hatchDragDismissState4.setMediaAlpha(f4);
                this.this$0.setNavigationProgress(this.$terminalNavigationProgress * f);
                HatchDragDismissState hatchDragDismissState5 = this.this$0;
                hatchDragDismissState5.interactiveBack.seek(hatchDragDismissState5.navigationProgress$delegate.AFn());
            }
        }

        /* renamed from: com.facebook.aura.navigation.HatchDragDismissState$settle$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02411 extends AbstractC7559F3s implements G0U<Long, Unit> {
            public static final C02411 INSTANCE = new C02411();

            public C02411() {
                super(1);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                return AnonymousClass001.A0x(l);
            }

            public final void invoke(long j) {
            }
        }

        /* renamed from: com.facebook.aura.navigation.HatchDragDismissState$settle$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<Long, Unit> {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            public AnonymousClass2() {
                super(1);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                return AnonymousClass001.A0x(l);
            }

            public final void invoke(long j) {
            }
        }

        /* renamed from: com.facebook.aura.navigation.HatchDragDismissState$settle$1$4, reason: invalid class name */
        public final class AnonymousClass4 extends AbstractC7559F3s implements G0U<Long, Unit> {
            public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

            public AnonymousClass4() {
                super(1);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                return AnonymousClass001.A0x(l);
            }

            public final void invoke(long j) {
            }
        }

        /* renamed from: com.facebook.aura.navigation.HatchDragDismissState$settle$1$5, reason: invalid class name */
        public final class AnonymousClass5 extends AbstractC7559F3s implements G0U<Long, Unit> {
            public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

            public AnonymousClass5() {
                super(1);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                return AnonymousClass001.A0x(l);
            }

            public final void invoke(long j) {
            }
        }

        /* renamed from: com.facebook.aura.navigation.HatchDragDismissState$settle$1$6, reason: invalid class name */
        public final class AnonymousClass6 extends AbstractC7559F3s implements G0U<Long, Unit> {
            public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

            public AnonymousClass6() {
                super(1);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                return AnonymousClass001.A0x(l);
            }

            public final void invoke(long j) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, HatchDragDismissState hatchDragDismissState, long j, float f, float f2, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$complete = z;
            this.this$0 = hatchDragDismissState;
            this.$startOffset = j;
            this.$startRevealProgress = f;
            this.$startDestinationProgress = f2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$complete, this.this$0, this.$startOffset, this.$startRevealProgress, this.$startDestinationProgress, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00f1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0143  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 376
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.navigation.HatchDragDismissState.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void settle(boolean z) {
        setPhase(z ? DragDismissPhase.COMPLETING : DragDismissPhase.CANCELLING);
        AnonymousClass001.A1J(new AnonymousClass1(z, this, m1449getDragOffsetF1C5BW0(), this.revealProgress$delegate.AFn(), this.destinationProgressValue$delegate.AFn(), null), this.scope);
    }

    @Override // com.facebook.aura.ui.sharedelement.HatchSharedElementTransform
    public void onSharedElementDestinationReady() {
        setHasSharedElementDestination(true);
    }

    private final boolean getCompletesToSharedElementDestination() {
        return MutableState.A0A(this.completesToSharedElementDestination$delegate);
    }

    private final float getDestinationProgressValue() {
        return this.destinationProgressValue$delegate.AFn();
    }

    /* renamed from: getDragOffset-F1C5BW0, reason: not valid java name */
    private final long m1449getDragOffsetF1C5BW0() {
        return ((AWx) this.dragOffset$delegate.getValue()).A00;
    }

    private final boolean getHasSharedElementDestination() {
        return MutableState.A0A(this.hasSharedElementDestination$delegate);
    }

    private final float getMediaAlpha() {
        return this.mediaAlpha$delegate.AFn();
    }

    private final float getNavigationProgress() {
        return this.navigationProgress$delegate.AFn();
    }

    private final DragDismissPhase getPhase() {
        return (DragDismissPhase) this.phase$delegate.getValue();
    }

    private final float getRevealProgress() {
        return this.revealProgress$delegate.AFn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reset() {
        setPhase(DragDismissPhase.IDLE);
        this.isNavigationStarted = false;
        setHasSharedElementDestination(false);
        m1450setDragOffsetk4lQ0M(0L);
        setRevealProgress(0.0f);
        setDestinationProgressValue(0.0f);
        setNavigationProgress(0.0f);
        setMediaAlpha(1.0f);
        setCompletesToSharedElementDestination(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCompletesToSharedElementDestination(boolean z) {
        MutableState.A09(z, this.completesToSharedElementDestination$delegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDestinationProgressValue(float f) {
        this.destinationProgressValue$delegate.AdS(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDragOffset-k-4lQ0M, reason: not valid java name */
    public final void m1450setDragOffsetk4lQ0M(long j) {
        this.dragOffset$delegate.Af8(new AWx(j));
    }

    private final void setHasSharedElementDestination(boolean z) {
        MutableState.A09(z, this.hasSharedElementDestination$delegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMediaAlpha(float f) {
        this.mediaAlpha$delegate.AdS(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setNavigationProgress(float f) {
        this.navigationProgress$delegate.AdS(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPhase(DragDismissPhase dragDismissPhase) {
        this.phase$delegate.Af8(dragDismissPhase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRevealProgress(float f) {
        this.revealProgress$delegate.AdS(f);
    }

    @Override // com.facebook.aura.ui.sharedelement.HatchSharedElementTransform
    public float getAlpha() {
        return this.mediaAlpha$delegate.AFn();
    }

    @Override // com.facebook.aura.ui.sharedelement.HatchSharedElementTransform
    public float getDestinationProgress() {
        return this.destinationProgressValue$delegate.AFn();
    }

    @Override // com.facebook.aura.ui.sharedelement.HatchSharedElementTransform
    public int getInteractiveTransitionDurationMillis() {
        return 240;
    }

    @Override // com.facebook.aura.ui.sharedelement.HatchSharedElementTransform
    public float getInteractiveTransitionProgress() {
        return this.navigationProgress$delegate.AFn();
    }

    public final float getSurroundingContentAlpha() {
        return 1.0f - this.revealProgress$delegate.AFn();
    }

    public HatchDragDismissState(C3UX c3ux, HatchInteractiveBackController hatchInteractiveBackController, float f, float f2, float f3, float f4, Function0<Unit> function0) {
        boolean zA1b = AnonymousClass004.A1b(c3ux, hatchInteractiveBackController);
        C7384Etj.A0Y(function0, 6);
        this.scope = c3ux;
        this.interactiveBack = hatchInteractiveBackController;
        this.dismissDistancePx = f;
        this.dismissFlingDistancePx = f2;
        this.dismissFlingVelocityPx = f3;
        this.fadeDistancePx = f4;
        this.onDismissed = function0;
        DragDismissPhase dragDismissPhase = DragDismissPhase.IDLE;
        AGE ageA01 = AGF.A01();
        this.phase$delegate = new ParcelableSnapshotMutableState(ageA01, dragDismissPhase);
        this.dragOffset$delegate = new ParcelableSnapshotMutableState(ageA01, new AWx(0L));
        this.revealProgress$delegate = new ParcelableSnapshotMutableFloatState(0.0f);
        this.destinationProgressValue$delegate = new ParcelableSnapshotMutableFloatState(0.0f);
        this.navigationProgress$delegate = new ParcelableSnapshotMutableFloatState(0.0f);
        this.mediaAlpha$delegate = new ParcelableSnapshotMutableFloatState(1.0f);
        Boolean boolValueOf = Boolean.valueOf(zA1b);
        this.completesToSharedElementDestination$delegate = new ParcelableSnapshotMutableState(ageA01, boolValueOf);
        this.hasSharedElementDestination$delegate = new ParcelableSnapshotMutableState(ageA01, boolValueOf);
    }

    public final void cancelDrag() {
        if (getPhase() == DragDismissPhase.DRAGGING) {
            settle(false);
        }
    }

    /* renamed from: dragBy-k-4lQ0M, reason: not valid java name */
    public final void m1451dragByk4lQ0M(long j) {
        if (getPhase() == DragDismissPhase.DRAGGING) {
            m1450setDragOffsetk4lQ0M(AWx.A05(m1449getDragOffsetF1C5BW0(), j));
            setRevealProgress(AnonymousClass003.A00(AWx.A00(m1449getDragOffsetF1C5BW0()) / this.fadeDistancePx));
            setDestinationProgressValue(this.revealProgress$delegate.AFn());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /* renamed from: endDrag-TH1AsA0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1452endDragTH1AsA0(long r7) {
        /*
            r6 = this;
            com.facebook.aura.navigation.DragDismissPhase r1 = r6.getPhase()
            com.facebook.aura.navigation.DragDismissPhase r0 = com.facebook.aura.navigation.DragDismissPhase.DRAGGING
            if (r1 != r0) goto L4c
            long r0 = r6.m1449getDragOffsetF1C5BW0()
            float r5 = X.AWx.A00(r0)
            r4 = 0
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 <= 0) goto L31
            float r4 = X.AnonymousClass001.A00(r7)
            long r0 = r6.m1449getDragOffsetF1C5BW0()
            float r0 = X.AnonymousClass001.A00(r0)
            float r4 = r4 * r0
            float r2 = X.AnonymousClass004.A00(r7)
            long r0 = r6.m1449getDragOffsetF1C5BW0()
            float r0 = X.AnonymousClass004.A00(r0)
            float r2 = r2 * r0
            float r4 = r4 + r2
            float r4 = r4 / r5
        L31:
            float r0 = r6.dismissFlingDistancePx
            r3 = 1
            r2 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L40
            float r0 = r6.dismissFlingVelocityPx
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r1 = 1
            if (r0 >= 0) goto L41
        L40:
            r1 = 0
        L41:
            float r0 = r6.dismissDistancePx
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L4d
            if (r1 != 0) goto L4d
            r6.settle(r2)
        L4c:
            return
        L4d:
            r6.settle(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.navigation.HatchDragDismissState.m1452endDragTH1AsA0(long):void");
    }

    public final boolean getShouldFillSharedElementBounds() {
        return isActive() && MutableState.A0A(this.hasSharedElementDestination$delegate);
    }

    @Override // com.facebook.aura.ui.sharedelement.HatchSharedElementTransform
    /* renamed from: getTranslation-F1C5BW0, reason: not valid java name */
    public long mo1453getTranslationF1C5BW0() {
        if (getPhase() == DragDismissPhase.IDLE) {
            return 0L;
        }
        return (getPhase() == DragDismissPhase.COMPLETING && MutableState.A0A(this.completesToSharedElementDestination$delegate)) ? AWx.A02(m1449getDragOffsetF1C5BW0(), 1.0f - this.navigationProgress$delegate.AFn()) : m1449getDragOffsetF1C5BW0();
    }

    @Override // com.facebook.aura.ui.sharedelement.HatchSharedElementTransform
    public boolean isActive() {
        return AnonymousClass006.A1Z(getPhase(), DragDismissPhase.IDLE);
    }

    public final void onBackHandlerReleased() {
        if (getPhase() != DragDismissPhase.DRAGGING || this.isNavigationStarted) {
            return;
        }
        if (this.interactiveBack.start()) {
            this.isNavigationStarted = true;
        } else {
            reset();
        }
    }

    public final boolean startDrag() {
        if (getPhase() != DragDismissPhase.IDLE) {
            return false;
        }
        reset();
        setPhase(DragDismissPhase.DRAGGING);
        return true;
    }
}
