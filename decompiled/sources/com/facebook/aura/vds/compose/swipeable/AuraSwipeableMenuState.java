package com.facebook.aura.vds.compose.swipeable;

import X.ASj;
import X.AZz;
import X.AbstractC0886AGn;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.BBP;
import X.C06H;
import X.C1BO;
import X.C1YC;
import X.C2HU;
import X.C3cG;
import X.C7384Etj;
import X.G0U;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraSwipeableMenuState {
    public static final int $stable = 0;
    public final float anchorWidth;
    public final AnchoredDraggableState<AuraSwipeableMenuStateDragAnchors> anchoredDraggableState;
    public final C1BO isActive$delegate;
    public final C1BO isPastThreshold$delegate;
    public int layoutWidth;
    public final boolean peek;
    public final C1BO progressToThreshold$delegate;
    public final boolean supportEndToStart;
    public final boolean supportStartToEnd;
    public final Float thresholdOffset;
    public final float velocityThreshold;

    /* renamed from: com.facebook.aura.vds.compose.swipeable.AuraSwipeableMenuState$isActive$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Boolean> {
        public AnonymousClass2() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return C3cG.A0P(AnonymousClass002.A1M((AuraSwipeableMenuState.this.getOffset() > 0.0f ? 1 : (AuraSwipeableMenuState.this.getOffset() == 0.0f ? 0 : -1))));
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.swipeable.AuraSwipeableMenuState$isPastThreshold$2, reason: invalid class name and case insensitive filesystem */
    public final class C143072 extends AbstractC7559F3s implements Function0<Boolean> {
        public C143072() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            float fAbs = Math.abs(AuraSwipeableMenuState.this.getOffset());
            Float f = AuraSwipeableMenuState.this.thresholdOffset;
            return Boolean.valueOf(AnonymousClass002.A1N((fAbs > (f != null ? f.floatValue() : r1.layoutWidth * 0.3f) ? 1 : (fAbs == (f != null ? f.floatValue() : r1.layoutWidth * 0.3f) ? 0 : -1))));
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.swipeable.AuraSwipeableMenuState$updateAnchors$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AZz<AuraSwipeableMenuStateDragAnchors>, Unit> {
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AZz<AuraSwipeableMenuStateDragAnchors> aZz) {
            C7384Etj.A0Y(aZz, 0);
            aZz.A00(AuraSwipeableMenuStateDragAnchors.IDLE, 0.0f);
            if (AuraSwipeableMenuState.this.supportEndToStart) {
                aZz.A00(AuraSwipeableMenuStateDragAnchors.END_DISMISS, -r2.layoutWidth);
                if (AuraSwipeableMenuState.this.peek) {
                    aZz.A00(AuraSwipeableMenuStateDragAnchors.PEEK_END, -200.0f);
                }
            }
            AuraSwipeableMenuState auraSwipeableMenuState = AuraSwipeableMenuState.this;
            if (auraSwipeableMenuState.supportStartToEnd) {
                aZz.A00(AuraSwipeableMenuStateDragAnchors.START_ACTION, auraSwipeableMenuState.anchorWidth);
            }
        }

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AZz<AuraSwipeableMenuStateDragAnchors> aZz) {
            invoke2(aZz);
            return Unit.INSTANCE;
        }
    }

    public AuraSwipeableMenuState(float f, float f2, C1YC<Float> c1yc, boolean z, boolean z2, G0U<? super AuraSwipeableMenuStateDragAnchors, Boolean> g0u, boolean z3, Float f3) {
        AnonymousClass002.A1D(c1yc, 2, g0u);
        this.anchorWidth = f;
        this.velocityThreshold = f2;
        this.supportEndToStart = z;
        this.supportStartToEnd = z2;
        this.peek = z3;
        this.thresholdOffset = f3;
        AuraSwipeableMenuStateDragAnchors auraSwipeableMenuStateDragAnchors = AuraSwipeableMenuStateDragAnchors.IDLE;
        AuraSwipeableMenuState$anchoredDraggableState$1 auraSwipeableMenuState$anchoredDraggableState$1 = AuraSwipeableMenuState$anchoredDraggableState$1.INSTANCE;
        AuraSwipeableMenuState$anchoredDraggableState$2 auraSwipeableMenuState$anchoredDraggableState$2 = new AuraSwipeableMenuState$anchoredDraggableState$2(this);
        ASj aSj = new ASj(C2HU.A01, 300, 0);
        AnchoredDraggableState<AuraSwipeableMenuStateDragAnchors> anchoredDraggableState = new AnchoredDraggableState<>(g0u, auraSwipeableMenuStateDragAnchors);
        anchoredDraggableState.A04 = auraSwipeableMenuState$anchoredDraggableState$1;
        anchoredDraggableState.A02 = auraSwipeableMenuState$anchoredDraggableState$2;
        anchoredDraggableState.A00 = aSj;
        anchoredDraggableState.A01 = c1yc;
        this.anchoredDraggableState = anchoredDraggableState;
        this.isActive$delegate = new BBP(null, new AnonymousClass2());
        this.isPastThreshold$delegate = new BBP(null, new C143072());
        this.progressToThreshold$delegate = new BBP(null, new AuraSwipeableMenuState$progressToThreshold$2(this));
    }

    private final void updateAnchors() {
        AbstractC0886AGn.A02(this.anchoredDraggableState, new AnonymousClass1());
    }

    public final AnchoredDraggableState<AuraSwipeableMenuStateDragAnchors> getAnchoredDraggableState$fbandroid_express_aura_java_com_facebook_aura_vds_compose_swipeable_swipeable() {
        return this.anchoredDraggableState;
    }

    public final int getLayoutWidth() {
        return this.layoutWidth;
    }

    public final float getOffset() {
        float fAFn = this.anchoredDraggableState.A08.AFn();
        if (Float.isNaN(fAFn)) {
            return 0.0f;
        }
        return fAFn;
    }

    public final float getProgressToThreshold() {
        return C1BO.A01(this.progressToThreshold$delegate);
    }

    public final boolean isActive() {
        return C1BO.A0F(this.isActive$delegate);
    }

    public final boolean isPastThreshold() {
        return C1BO.A0F(this.isPastThreshold$delegate);
    }

    public final void setLayoutWidth(int i) {
        this.layoutWidth = i;
        updateAnchors();
    }

    public /* synthetic */ AuraSwipeableMenuState(float f, float f2, C1YC c1yc, boolean z, boolean z2, G0U g0u, boolean z3, Float f3, int i, C06H c06h) {
        this(f, f2, c1yc, (i & 8) != 0 ? true : z, (i & 16) != 0 ? true : z2, g0u, z3, (i & 128) != 0 ? null : f3);
    }
}
