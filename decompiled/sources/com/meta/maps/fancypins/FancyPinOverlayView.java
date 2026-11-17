package com.meta.maps.fancypins;

import X.ATD;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC7559F3s;
import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7610F5x;
import X.AbstractC8060FRo;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BAV;
import X.BNt;
import X.BV4;
import X.BV5;
import X.BV6;
import X.BV7;
import X.C06H;
import X.C0968AJv;
import X.C0KA;
import X.C2197BAc;
import X.C2FI;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C60O;
import X.C60Q;
import X.C7354EnR;
import X.C7384Etj;
import X.C7438Evz;
import X.C7BY;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import X.C9jH;
import X.CU7;
import X.F60;
import X.G0U;
import X.G0V;
import X.Ht9;
import X.InterfaceC2349BUy;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FancyPinOverlayView extends ViewGroup {

    @Deprecated
    public static final String ACCESSIBILITY_TRACE_SECTION = "FancyPins#accessibility";

    @Deprecated
    public static final String APPLY_ENTRIES_TRACE_SECTION = "FancyPins#applyEntries";

    @Deprecated
    public static final String APPLY_FRAME_TRACE_SECTION = "FancyPins#applyFrame";

    @Deprecated
    public static final String BROADPHASE_TRACE_SECTION = "FancyPins#broadphase";

    @Deprecated
    public static final String CAPTURE_POSITIONS_TRACE_SECTION = "FancyPins#capturePositions";

    @Deprecated
    public static final String COMMIT_POSITIONS_TRACE_SECTION = "FancyPins#commitPositions";

    @Deprecated
    public static final float DEFAULT_BROADPHASE_EXTENT = 200.0f;

    @Deprecated
    public static final long HULL_FADE_DURATION_MILLIS = 200;

    @Deprecated
    public static final int INITIAL_SLOT_CAPACITY = 64;

    @Deprecated
    public static final int POSITION_FRAME_HISTORY_SIZE = 4;

    @Deprecated
    public static final String REPORT_RESIDENCY_TRACE_SECTION = "FancyPins#reportResidency";

    @Deprecated
    public static final String RETIRE_HULLS_TRACE_SECTION = "FancyPins#retireHulls";
    public final RectF accessibilityDescendantBounds;
    public int accessibilityInvalidationCount;
    public final AccessibilityManager accessibilityManager;
    public final SparseArray<String> accessibilityPinIdsByVirtualId;
    public final Rect accessibilityRoundedBounds;
    public boolean accessibilitySemanticsStale;
    public final AccessibilityManager.AccessibilityStateChangeListener accessibilityStateListener;
    public long accessibilitySynchronizationGeneration;
    public final LinkedHashMap<String, Integer> accessibilityVirtualIdsByPinId;
    public final ArrayList<AccessiblePin> accessiblePins;
    public long acknowledgedRenderGeneration;
    public ActiveTransitionBatch activeTransitionBatch;
    public final SparseArray<HullAnimation> appearingHulls;
    public int appliedFrameGeneration;
    public FancyPinAppliedFrameListener appliedFrameListener;
    public long appliedLifecycleGeneration;
    public final RectF appliedPresentationBounds;
    public final SparseArray<Float> broadphaseExtents;
    public final SparseArray<FancyPinPresentation> broadphasePresentations;
    public final SparseArray<CachedAccessibilityLabel> cachedAccessibilityLabels;
    public final Runnable commitUncapturedPositions;
    public int[] currentFrameVariantGenerations;
    public int[] currentFrameVariantIndices;
    public final boolean defaultFocusable;
    public final int defaultImportantForAccessibility;
    public final boolean deferExistingPositionsUntilFrameCommit;
    public final FancyPinDrawingOrder drawingOrder;
    public boolean drawingOrderDirty;
    public final FancyPinOverlayEngineController<FancyPinFrameConnectionFactory> engineController;
    public final Executor frameConsumerExecutor;
    public int frameGeneration;
    public boolean hasAppliedFrame;
    public boolean hasPendingHullLayoutChange;
    public boolean[] hasZOrderOverrideBySlot;
    public final FancyPinHitTestMapper hitTestMapper;
    public FancyPinHullAnimationScheduler hullAnimationScheduler;
    public double[] keysByChildIndex;
    public final SparseArray<String> lastAppliedPinIds;
    public final SparseArray<FancyPinPresentation> lastAppliedPresentations;
    public int[] lastAppliedVariantIndices;
    public double[] lastDrawingKeysBySlot;
    public int[] lastEffectiveRanksBySlot;
    public int[] lastOverlapKeys;
    public float[] lastRowScreenXs;
    public float[] lastRowScreenYs;
    public float[] lastScreenYBySlot;
    public long lifecycleGeneration;
    public int nextAccessibilityVirtualId;
    public long nextTransitionGeneration;
    public final FancyPinOrderingObserver orderingObserver;
    public int[] outsideBroadphaseGenerations;
    public final SparseArray<Map<String, MutablePartRenderState>> partRenderStates;
    public final SparseArray<String> pendingHullAppearances;
    public final ArrayDeque<PendingPositions> pendingPositionFrames;
    public PendingPositions pendingPositions;
    public FancyPinAccessibilityDelegate pinAccessibilityDelegate;
    public PinAccessibilityHelper pinAccessibilityHelper;
    public final FancyPinHullPool pool;
    public final FancyPinPresentationEpoch presentationEpoch;
    public final SparseArray<FancyPinHullView> realizedHulls;
    public final SparseArray<FancyPinHullReuseKey> realizedReuseKeys;
    public final ArrayDeque<PendingPositions> recycledPositions;
    public final FancyPinViewRegistry registry;
    public int[] reportedResidentSlots;
    public FancyPinResidencyReporter residencyReporter;
    public byte[] residentSlotReport;
    public int[] residentSlotScratch;
    public G0U<? super String, Unit> retirementCompletionHandler;
    public final FancyPinRetirementPresenter retirementPresenter;
    public final SparseArray<RetiringHull> retiringHulls;
    public final float screenCoordinateScale;
    public int[] seenGeneration;
    public int[] slotsByChildIndex;
    public final IdentityHashMap<View, Integer> slotsByHull;
    public FancyPinTransitionObserver transitionObserver;
    public final Executor uiExecutor;
    public final SparseArray<Float> visualExtents;
    public FancyPinZOrderMode zOrderMode;
    public float[] zOrderOverridesBySlot;
    public static final Companion Companion = new Companion();
    public static final PathInterpolator HULL_FADE_INTERPOLATOR = new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f);

    public final class ActiveTransitionBatch {
        public boolean finished;
        public final long generation;
        public int nextTokenOrdinal;
        public final FancyPinTransitionObserver observer;
        public final LinkedHashSet<String> pinIds;
        public FancyPinTransitionBatch snapshot;
        public boolean started;
        public final /* synthetic */ FancyPinOverlayView this$0;
        public final LinkedHashSet<FancyPinTransitionToken> tokens;
        public final FancyPinTransitionCompletionTracker tracker;

        public ActiveTransitionBatch(FancyPinOverlayView fancyPinOverlayView, long j, FancyPinTransitionObserver fancyPinTransitionObserver) {
            C7384Etj.A0Y(fancyPinTransitionObserver, 2);
            this.this$0 = fancyPinOverlayView;
            this.generation = j;
            this.observer = fancyPinTransitionObserver;
            this.pinIds = C3cG.A0k();
            this.tokens = C3cG.A0k();
            this.tracker = new FancyPinTransitionCompletionTracker(new FancyPinOverlayView$ActiveTransitionBatch$tracker$1(fancyPinOverlayView, this), new FancyPinOverlayView$ActiveTransitionBatch$tracker$2(this));
        }

        public final FancyPinPendingCompletion beginPart(String str, String str2, FancyPinPartAnimationHint fancyPinPartAnimationHint, FancyPinPartRenderState fancyPinPartRenderState) {
            AnonymousClass005.A14(str, str2, fancyPinPartAnimationHint, fancyPinPartRenderState);
            int i = this.nextTokenOrdinal;
            this.nextTokenOrdinal = i + 1;
            FancyPinTransitionToken fancyPinTransitionToken = new FancyPinTransitionToken(i, str, str2, fancyPinPartAnimationHint, fancyPinPartRenderState.isVisible, fancyPinPartRenderState.placementIndex, fancyPinPartRenderState.variantIndex);
            this.tokens.add(fancyPinTransitionToken);
            return this.tracker.beginPart(new FancyPinOverlayView$ActiveTransitionBatch$beginPart$1(this, fancyPinTransitionToken));
        }

        public final void cancel() {
            supersede(false);
        }

        public final void recordPin(String str) {
            C7384Etj.A0Y(str, 0);
            this.pinIds.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void complete() {
            FancyPinOverlayView fancyPinOverlayView = this.this$0;
            float f = FancyPinOverlayView.DEFAULT_BROADPHASE_EXTENT;
            if (fancyPinOverlayView.activeTransitionBatch != this || this.finished) {
                return;
            }
            this.finished = true;
            fancyPinOverlayView.activeTransitionBatch = null;
            FancyPinTransitionObserver fancyPinTransitionObserver = this.observer;
            FancyPinTransitionBatchStatus fancyPinTransitionBatchStatus = FancyPinTransitionBatchStatus.COMPLETED;
            FancyPinTransitionBatch fancyPinTransitionBatch = this.snapshot;
            if (fancyPinTransitionBatch == null) {
                C7384Etj.A0b("snapshot");
                throw F60.createAndThrow();
            }
            fancyPinTransitionObserver.onTransition(fancyPinTransitionBatchStatus, fancyPinTransitionBatch);
        }

        public final void seal() {
            FancyPinOverlayView fancyPinOverlayView = this.this$0;
            float f = FancyPinOverlayView.DEFAULT_BROADPHASE_EXTENT;
            if (fancyPinOverlayView.activeTransitionBatch != this || this.finished) {
                return;
            }
            int i = 0;
            List listA0c = AbstractC0878AGe.A0c(this.tokens, new C2FI(new G0U[]{new C7354EnR() { // from class: com.meta.maps.fancypins.FancyPinOverlayView$ActiveTransitionBatch$seal$orderedTokens$1
                @Override // X.C7354EnR, X.InterfaceC7356EnT
                public Object get(Object obj) {
                    return ((FancyPinTransitionToken) obj).pinId;
                }
            }, new C7354EnR() { // from class: com.meta.maps.fancypins.FancyPinOverlayView$ActiveTransitionBatch$seal$orderedTokens$2
                @Override // X.C7354EnR, X.InterfaceC7356EnT
                public Object get(Object obj) {
                    return ((FancyPinTransitionToken) obj).partId;
                }
            }}));
            ArrayList arrayListA0i = AnonymousClass003.A0i(listA0c);
            int i2 = 0;
            for (Object obj : listA0c) {
                i++;
                if (i2 < 0) {
                    AbstractC0885AGm.A14();
                    throw F60.createAndThrow();
                }
                FancyPinTransitionToken fancyPinTransitionToken = (FancyPinTransitionToken) obj;
                arrayListA0i.add(fancyPinTransitionToken.copy(i2, fancyPinTransitionToken.pinId, fancyPinTransitionToken.partId, fancyPinTransitionToken.animationHint, fancyPinTransitionToken.isVisible, fancyPinTransitionToken.placementIndex, fancyPinTransitionToken.variantIndex));
                i2 = i;
            }
            long j = this.generation;
            List listA0W = AbstractC0878AGe.A0W(this.pinIds);
            LinkedHashSet linkedHashSetA0k = C3cG.A0k();
            AbstractC0878AGe.A0j(listA0W, linkedHashSetA0k);
            LinkedHashSet linkedHashSetA0k2 = C3cG.A0k();
            AbstractC0878AGe.A0j(arrayListA0i, linkedHashSetA0k2);
            FancyPinTransitionBatch fancyPinTransitionBatch = new FancyPinTransitionBatch(j, linkedHashSetA0k, linkedHashSetA0k2);
            this.snapshot = fancyPinTransitionBatch;
            this.started = true;
            try {
                this.observer.onTransition(FancyPinTransitionBatchStatus.STARTED, fancyPinTransitionBatch);
                if (this.this$0.activeTransitionBatch != this || this.finished) {
                    return;
                }
                this.tracker.seal();
            } finally {
            }
        }

        public final Function0<Unit> supersede(boolean z) {
            if (this.finished) {
                return null;
            }
            this.finished = true;
            FancyPinOverlayView fancyPinOverlayView = this.this$0;
            float f = FancyPinOverlayView.DEFAULT_BROADPHASE_EXTENT;
            if (fancyPinOverlayView.activeTransitionBatch == this) {
                fancyPinOverlayView.activeTransitionBatch = null;
            }
            if (!this.started) {
                return null;
            }
            FancyPinOverlayView$ActiveTransitionBatch$supersede$notify$1 fancyPinOverlayView$ActiveTransitionBatch$supersede$notify$1 = new FancyPinOverlayView$ActiveTransitionBatch$supersede$notify$1(this);
            if (z) {
                return fancyPinOverlayView$ActiveTransitionBatch$supersede$notify$1;
            }
            fancyPinOverlayView$ActiveTransitionBatch$supersede$notify$1.invoke();
            return null;
        }
    }

    public final class Companion {
        public final PathInterpolator getHULL_FADE_INTERPOLATOR() {
            return FancyPinOverlayView.HULL_FADE_INTERPOLATOR;
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public final class HullAnimation {
        public final ValueAnimator animator;
        public final FancyPinHullView hull;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof HullAnimation) {
                    HullAnimation hullAnimation = (HullAnimation) obj;
                    if (!C7384Etj.areEqual(this.hull, hullAnimation.hull) || !C7384Etj.areEqual(this.animator, hullAnimation.animator)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ HullAnimation copy$default(HullAnimation hullAnimation, FancyPinHullView fancyPinHullView, ValueAnimator valueAnimator, int i, Object obj) {
            if ((i & 1) != 0) {
                fancyPinHullView = hullAnimation.hull;
            }
            if ((i & 2) != 0) {
                valueAnimator = hullAnimation.animator;
            }
            AnonymousClass003.A0u(fancyPinHullView, valueAnimator);
            return new HullAnimation(fancyPinHullView, valueAnimator);
        }

        public final FancyPinHullView component1() {
            return this.hull;
        }

        public final ValueAnimator component2() {
            return this.animator;
        }

        public final ValueAnimator getAnimator() {
            return this.animator;
        }

        public final FancyPinHullView getHull() {
            return this.hull;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.animator, AnonymousClass005.A0E(this.hull));
        }

        public String toString() {
            return C3cJ.A0L(this.animator, ", animator=", C3cG.A0f(this.hull, "HullAnimation(hull="));
        }

        public HullAnimation(FancyPinHullView fancyPinHullView, ValueAnimator valueAnimator) {
            AnonymousClass003.A0u(fancyPinHullView, valueAnimator);
            this.hull = fancyPinHullView;
            this.animator = valueAnimator;
        }

        public final HullAnimation copy(FancyPinHullView fancyPinHullView, ValueAnimator valueAnimator) {
            AnonymousClass003.A0u(fancyPinHullView, valueAnimator);
            return new HullAnimation(fancyPinHullView, valueAnimator);
        }
    }

    public final class PendingRetirement {
        public final FancyPinHullView hull;
        public final String removedPinId;
        public final FancyPinRetirement retirement;
        public final int slotIndex;
        public final boolean updatesRemovalIdentity;

        public PendingRetirement(int i, FancyPinHullView fancyPinHullView, FancyPinRetirement fancyPinRetirement, String str, boolean z) {
            C7384Etj.A0Y(fancyPinHullView, 1);
            this.slotIndex = i;
            this.hull = fancyPinHullView;
            this.retirement = fancyPinRetirement;
            this.removedPinId = str;
            this.updatesRemovalIdentity = z;
        }

        public final PendingRetirement copy(int i, FancyPinHullView fancyPinHullView, FancyPinRetirement fancyPinRetirement, String str, boolean z) {
            C7384Etj.A0Y(fancyPinHullView, 1);
            return new PendingRetirement(i, fancyPinHullView, fancyPinRetirement, str, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PendingRetirement) {
                    PendingRetirement pendingRetirement = (PendingRetirement) obj;
                    if (this.slotIndex != pendingRetirement.slotIndex || !C7384Etj.areEqual(this.hull, pendingRetirement.hull) || !C7384Etj.areEqual(this.retirement, pendingRetirement.retirement) || !C7384Etj.areEqual(this.removedPinId, pendingRetirement.removedPinId) || this.updatesRemovalIdentity != pendingRetirement.updatesRemovalIdentity) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ PendingRetirement copy$default(PendingRetirement pendingRetirement, int i, FancyPinHullView fancyPinHullView, FancyPinRetirement fancyPinRetirement, String str, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = pendingRetirement.slotIndex;
            }
            if ((i2 & 2) != 0) {
                fancyPinHullView = pendingRetirement.hull;
            }
            if ((i2 & 4) != 0) {
                fancyPinRetirement = pendingRetirement.retirement;
            }
            if ((i2 & 8) != 0) {
                str = pendingRetirement.removedPinId;
            }
            if ((i2 & 16) != 0) {
                z = pendingRetirement.updatesRemovalIdentity;
            }
            return pendingRetirement.copy(i, fancyPinHullView, fancyPinRetirement, str, z);
        }

        public final int component1() {
            return this.slotIndex;
        }

        public final FancyPinHullView component2() {
            return this.hull;
        }

        public final FancyPinRetirement component3() {
            return this.retirement;
        }

        public final String component4() {
            return this.removedPinId;
        }

        public final boolean component5() {
            return this.updatesRemovalIdentity;
        }

        public final FancyPinHullView getHull() {
            return this.hull;
        }

        public final String getRemovedPinId() {
            return this.removedPinId;
        }

        public final FancyPinRetirement getRetirement() {
            return this.retirement;
        }

        public final int getSlotIndex() {
            return this.slotIndex;
        }

        public final boolean getUpdatesRemovalIdentity() {
            return this.updatesRemovalIdentity;
        }

        public int hashCode() {
            return C0KA.A00((((AnonymousClass005.A0F(this.hull, this.slotIndex * 31) + AnonymousClass006.A0D(this.retirement)) * 31) + AnonymousClass005.A0H(this.removedPinId)) * 31, this.updatesRemovalIdentity);
        }

        public String toString() {
            int i = this.slotIndex;
            FancyPinHullView fancyPinHullView = this.hull;
            FancyPinRetirement fancyPinRetirement = this.retirement;
            String str = this.removedPinId;
            boolean z = this.updatesRemovalIdentity;
            StringBuilder sbA0y = C60O.A0y("PendingRetirement(slotIndex=", i);
            sbA0y.append(", hull=");
            sbA0y.append(fancyPinHullView);
            sbA0y.append(", retirement=");
            sbA0y.append(fancyPinRetirement);
            sbA0y.append(", removedPinId=");
            sbA0y.append(str);
            return C8j5.A0W(", updatesRemovalIdentity=", sbA0y, z);
        }
    }

    public final class PinAccessibilityHelper extends BAV {
        public final Rect nodeBounds;
        public final Rect visibilityBounds;

        @Override // X.BAV
        public void getVisibleVirtualViews(List<Integer> list) {
            C7384Etj.A0Y(list, 0);
            FancyPinOverlayView.this.synchronizeStaleAccessibilitySemantics();
            Iterator<AccessiblePin> it = FancyPinOverlayView.this.accessiblePins.iterator();
            C7384Etj.A0U(it);
            while (it.hasNext()) {
                AccessiblePin accessiblePin = (AccessiblePin) C7384Etj.A0F(it);
                if (FancyPinOverlayView.this.accessibilityBoundsInParent(accessiblePin.hull, this.visibilityBounds)) {
                    AbstractC7608F5v.A1A(accessiblePin.virtualId, list);
                }
            }
        }

        @Override // X.BAV
        public void onPopulateNodeForVirtualView(int i, C2197BAc c2197BAc) {
            AccessiblePin next;
            C7384Etj.A0Y(c2197BAc, 1);
            FancyPinOverlayView.this.synchronizeStaleAccessibilitySemantics();
            Iterator<AccessiblePin> it = FancyPinOverlayView.this.accessiblePins.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (next.virtualId == i) {
                        break;
                    }
                }
            }
            AccessiblePin accessiblePin = next;
            if (accessiblePin == null || !FancyPinOverlayView.this.accessibilityBoundsInParent(accessiblePin.hull, this.nodeBounds)) {
                AccessibilityNodeInfo accessibilityNodeInfo = c2197BAc.A02;
                accessibilityNodeInfo.setContentDescription("");
                accessibilityNodeInfo.setBoundsInParent(new Rect(0, 0, 1, 1));
                accessibilityNodeInfo.setVisibleToUser(false);
                return;
            }
            String str = accessiblePin.label;
            AccessibilityNodeInfo accessibilityNodeInfo2 = c2197BAc.A02;
            accessibilityNodeInfo2.setContentDescription(str);
            accessibilityNodeInfo2.setClassName("android.widget.Button");
            accessibilityNodeInfo2.setBoundsInParent(this.nodeBounds);
            accessibilityNodeInfo2.setClickable(true);
            accessibilityNodeInfo2.setFocusable(true);
            FancyPinAccessibilityDelegate fancyPinAccessibilityDelegate = FancyPinOverlayView.this.pinAccessibilityDelegate;
            accessibilityNodeInfo2.setSelected(fancyPinAccessibilityDelegate != null && fancyPinAccessibilityDelegate.isPinSelected(accessiblePin.pinId));
            accessibilityNodeInfo2.addAction(16);
        }

        public PinAccessibilityHelper() {
            super(FancyPinOverlayView.this);
            this.visibilityBounds = AbstractC7607F5u.A0X();
            this.nodeBounds = AbstractC7607F5u.A0X();
        }

        @Override // X.BAV
        public int getVirtualViewAt(float f, float f2) {
            FancyPinOverlayView.this.synchronizeStaleAccessibilitySemantics();
            int size = FancyPinOverlayView.this.accessiblePins.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    return Integer.MIN_VALUE;
                }
                AccessiblePin accessiblePin = FancyPinOverlayView.this.accessiblePins.get(size);
                C7384Etj.A0U(accessiblePin);
                AccessiblePin accessiblePin2 = accessiblePin;
                FancyPinOverlayView fancyPinOverlayView = FancyPinOverlayView.this;
                if (fancyPinOverlayView.hitTestMapper.mapToChild(fancyPinOverlayView, accessiblePin2.hull, f, f2)) {
                    FancyPinHullView fancyPinHullView = accessiblePin2.hull;
                    FancyPinHitTestMapper fancyPinHitTestMapper = FancyPinOverlayView.this.hitTestMapper;
                    if (fancyPinHullView.containsVisiblePartAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(fancyPinHitTestMapper.localX, fancyPinHitTestMapper.localY, fancyPinHitTestMapper)) {
                        return accessiblePin2.virtualId;
                    }
                }
            }
        }

        public final int keyboardFocusedVirtualViewIdForTesting() {
            return this.mKeyboardFocusedVirtualViewId;
        }

        @Override // X.BAV
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (i2 == 16) {
                FancyPinOverlayView fancyPinOverlayView = FancyPinOverlayView.this;
                float f = FancyPinOverlayView.DEFAULT_BROADPHASE_EXTENT;
                String str = fancyPinOverlayView.accessibilityPinIdsByVirtualId.get(i);
                if (str != null) {
                    ArrayList<AccessiblePin> arrayList = fancyPinOverlayView.accessiblePins;
                    if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                        Iterator<AccessiblePin> it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            AccessiblePin next = it.next();
                            if (next.virtualId == i && str.equals(next.pinId)) {
                                FancyPinAccessibilityDelegate fancyPinAccessibilityDelegate = FancyPinOverlayView.this.pinAccessibilityDelegate;
                                if (fancyPinAccessibilityDelegate == null || !fancyPinAccessibilityDelegate.activatePin(str)) {
                                    break;
                                }
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }

        public final int virtualViewAt(float f, float f2) {
            return getVirtualViewAt(f, f2);
        }
    }

    public final class RetiringHull {
        public final ValueAnimator animator;
        public final FancyPinHullView hull;
        public FancyPinRetirement removal;
        public String removedPinId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof RetiringHull) {
                    RetiringHull retiringHull = (RetiringHull) obj;
                    if (!C7384Etj.areEqual(this.hull, retiringHull.hull) || !C7384Etj.areEqual(this.animator, retiringHull.animator) || !C7384Etj.areEqual(this.removal, retiringHull.removal) || !C7384Etj.areEqual(this.removedPinId, retiringHull.removedPinId)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ RetiringHull copy$default(RetiringHull retiringHull, FancyPinHullView fancyPinHullView, ValueAnimator valueAnimator, FancyPinRetirement fancyPinRetirement, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                fancyPinHullView = retiringHull.hull;
            }
            if ((i & 2) != 0) {
                valueAnimator = retiringHull.animator;
            }
            if ((i & 4) != 0) {
                fancyPinRetirement = retiringHull.removal;
            }
            if ((i & 8) != 0) {
                str = retiringHull.removedPinId;
            }
            AnonymousClass003.A0u(fancyPinHullView, valueAnimator);
            return new RetiringHull(fancyPinHullView, valueAnimator, fancyPinRetirement, str);
        }

        public final FancyPinHullView component1() {
            return this.hull;
        }

        public final ValueAnimator component2() {
            return this.animator;
        }

        public final FancyPinRetirement component3() {
            return this.removal;
        }

        public final String component4() {
            return this.removedPinId;
        }

        public final ValueAnimator getAnimator() {
            return this.animator;
        }

        public final FancyPinHullView getHull() {
            return this.hull;
        }

        public final FancyPinRetirement getRemoval() {
            return this.removal;
        }

        public final String getRemovedPinId() {
            return this.removedPinId;
        }

        public int hashCode() {
            return ((AnonymousClass005.A0F(this.animator, AnonymousClass005.A0E(this.hull)) + AnonymousClass006.A0D(this.removal)) * 31) + AnonymousClass005.A0H(this.removedPinId);
        }

        public final void setRemoval(FancyPinRetirement fancyPinRetirement) {
            this.removal = fancyPinRetirement;
        }

        public final void setRemovedPinId(String str) {
            this.removedPinId = str;
        }

        public String toString() {
            FancyPinHullView fancyPinHullView = this.hull;
            ValueAnimator valueAnimator = this.animator;
            FancyPinRetirement fancyPinRetirement = this.removal;
            String str = this.removedPinId;
            StringBuilder sbA0f = C3cG.A0f(fancyPinHullView, "RetiringHull(hull=");
            sbA0f.append(", animator=");
            sbA0f.append(valueAnimator);
            sbA0f.append(", removal=");
            sbA0f.append(fancyPinRetirement);
            return C3cJ.A0N(", removedPinId=", str, sbA0f);
        }

        public RetiringHull(FancyPinHullView fancyPinHullView, ValueAnimator valueAnimator, FancyPinRetirement fancyPinRetirement, String str) {
            AnonymousClass003.A0u(fancyPinHullView, valueAnimator);
            this.hull = fancyPinHullView;
            this.animator = valueAnimator;
            this.removal = fancyPinRetirement;
            this.removedPinId = str;
        }

        public final RetiringHull copy(FancyPinHullView fancyPinHullView, ValueAnimator valueAnimator, FancyPinRetirement fancyPinRetirement, String str) {
            AnonymousClass003.A0u(fancyPinHullView, valueAnimator);
            return new RetiringHull(fancyPinHullView, valueAnimator, fancyPinRetirement, str);
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinOverlayView$applyContextForPart$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements G0U<Integer, FancyPinPresentation> {
        public AnonymousClass1(Object obj) {
            super(1, obj, FancyPinViewRegistry.class, "typedPresentationForSlot", "typedPresentationForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(I)Lcom/meta/maps/fancypins/FancyPinPresentation;", 0);
        }

        public final FancyPinPresentation invoke(int i) {
            return ((FancyPinViewRegistry) this.receiver).typedPresentationForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(i);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ FancyPinPresentation invoke(Integer num) {
            return invoke(AnonymousClass001.A0F(num));
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinOverlayView$applyContextForPart$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends C7438Evz implements G0U<Integer, Integer> {
        public AnonymousClass2(Object obj) {
            super(1, obj, FancyPinOverlayView.class, "currentFrameVariantIndexForSlot", "currentFrameVariantIndexForSlot(I)Ljava/lang/Integer;", 0);
        }

        public final Integer invoke(int i) {
            return ((FancyPinOverlayView) this.receiver).currentFrameVariantIndexForSlot(i);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(AnonymousClass001.A0F(num));
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinOverlayView$applyContextForPart$3, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass3 extends C7438Evz implements G0U<Integer, Integer> {
        public AnonymousClass3(Object obj) {
            super(1, obj, FancyPinOverlayView.class, "lastAppliedVariantIndexForSlot", "lastAppliedVariantIndexForSlot(I)Ljava/lang/Integer;", 0);
        }

        public final Integer invoke(int i) {
            return ((FancyPinOverlayView) this.receiver).lastAppliedVariantIndexForSlot(i);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(AnonymousClass001.A0F(num));
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinOverlayView$applyTypedPresentation$1, reason: invalid class name and case insensitive filesystem */
    public final class C144721 extends AbstractC7559F3s implements G0V<String, Integer, FancyPinPartAnimationHint> {
        public final /* synthetic */ int $applyingFrameGeneration;
        public final /* synthetic */ int $clampedVariantIndex;
        public final /* synthetic */ Map<String, MutablePartRenderState> $nextStates;
        public final /* synthetic */ VariantLayout $resolvedVariant;

        public final FancyPinPartAnimationHint invoke(String str, int i) {
            boolean z;
            int i2;
            List<PartLayout> list;
            C7384Etj.A0Y(str, 0);
            VariantLayout variantLayout = this.$resolvedVariant;
            PartLayout partLayout = null;
            if (variantLayout != null && (list = variantLayout.layout) != null) {
                Iterator<PartLayout> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    PartLayout next = it.next();
                    if (str.equals(next.id)) {
                        partLayout = next;
                        break;
                    }
                }
                partLayout = partLayout;
            }
            Map<String, MutablePartRenderState> map = this.$nextStates;
            MutablePartRenderState mutablePartRenderState = map.get(str);
            if (mutablePartRenderState == null) {
                mutablePartRenderState = new MutablePartRenderState();
                map.put(str, mutablePartRenderState);
            }
            MutablePartRenderState mutablePartRenderState2 = mutablePartRenderState;
            int i3 = this.$applyingFrameGeneration;
            if (partLayout != null) {
                z = true;
                i2 = partLayout.placementIndex;
            } else {
                z = false;
                i2 = -1;
                if (mutablePartRenderState2.hasCommittedState) {
                    i2 = mutablePartRenderState2.placementIndex;
                }
            }
            return mutablePartRenderState2.stage(i3, z, i2, this.$clampedVariantIndex);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144721(VariantLayout variantLayout, Map<String, MutablePartRenderState> map, int i, int i2) {
            super(2);
            this.$resolvedVariant = variantLayout;
            this.$nextStates = map;
            this.$applyingFrameGeneration = i;
            this.$clampedVariantIndex = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ FancyPinPartAnimationHint invoke(String str, Integer num) {
            return invoke(str, AnonymousClass001.A0F(num));
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinOverlayView$applyTypedPresentation$2, reason: invalid class name and case insensitive filesystem */
    public final class C144732 extends AbstractC7559F3s implements G0V<String, Integer, FancyPinPartApplyContext> {
        public final /* synthetic */ FancyPinRenderFrame $frame;
        public final /* synthetic */ int $slotIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144732(FancyPinRenderFrame fancyPinRenderFrame, int i) {
            super(2);
            this.$frame = fancyPinRenderFrame;
            this.$slotIndex = i;
        }

        public final FancyPinPartApplyContext invoke(String str, int i) {
            return FancyPinOverlayView.this.applyContextForPart(this.$frame, this.$slotIndex, i);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ FancyPinPartApplyContext invoke(String str, Integer num) {
            return invoke(str, AnonymousClass001.A0F(num));
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinOverlayView$bindProductionEngine$1, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C144781 implements InterfaceC2349BUy, FancyPinResidencyReporter {
        public final /* synthetic */ FancyPinEngine $tmp0;

        @Override // com.meta.maps.fancypins.FancyPinResidencyReporter
        public final void report(byte[] bArr, long j) {
            C7384Etj.A0Y(bArr, 0);
            this.$tmp0.reportResidentSlots(bArr, j);
        }

        public C144781(FancyPinEngine fancyPinEngine) {
            this.$tmp0 = fancyPinEngine;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof FancyPinResidencyReporter) && (obj instanceof InterfaceC2349BUy)) {
                return C3cI.A1V(obj, getFunctionDelegate());
            }
            return false;
        }

        @Override // X.InterfaceC2349BUy
        public final Ht9<?> getFunctionDelegate() {
            return new C7438Evz(2, this.$tmp0, FancyPinEngine.class, "reportResidentSlots", "reportResidentSlots([BJ)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinOverlayView$clear$1, reason: invalid class name and case insensitive filesystem */
    public final class C144791 extends AbstractC7559F3s implements Function0<Unit> {

        /* renamed from: com.meta.maps.fancypins.FancyPinOverlayView$clear$1$1, reason: invalid class name and collision with other inner class name */
        public final class C04521 extends AbstractC7559F3s implements Function0<Unit> {
            public static final C04521 INSTANCE = new C04521();

            public C04521() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        public C144791() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() throws Throwable {
            FancyPinOverlayView fancyPinOverlayView;
            FancyPinOverlayView fancyPinOverlayView2;
            ArrayList arrayListA0h = C3cG.A0h();
            FancyPinOverlayView fancyPinOverlayView3 = FancyPinOverlayView.this;
            float f = FancyPinOverlayView.DEFAULT_BROADPHASE_EXTENT;
            int size = fancyPinOverlayView3.realizedHulls.size() - 1;
            Throwable th = null;
            while (true) {
                fancyPinOverlayView = FancyPinOverlayView.this;
                if (-1 >= size) {
                    break;
                }
                try {
                    fancyPinOverlayView.recycleAt(size, arrayListA0h);
                } catch (Throwable th2) {
                    if (th != null) {
                        CU7.A01(th, th2);
                    } else {
                        th = th2;
                    }
                }
                size--;
            }
            fancyPinOverlayView.lastAppliedPresentations.clear();
            FancyPinOverlayView.this.lastAppliedPinIds.clear();
            FancyPinOverlayView.this.partRenderStates.clear();
            FancyPinOverlayView.this.pendingHullAppearances.clear();
            FancyPinOverlayView.this.discardPendingPositions();
            while (true) {
                boolean zIsEmpty = FancyPinOverlayView.this.pendingPositionFrames.isEmpty();
                fancyPinOverlayView2 = FancyPinOverlayView.this;
                if (zIsEmpty) {
                    break;
                } else {
                    fancyPinOverlayView2.recycledPositions.addLast(fancyPinOverlayView2.pendingPositionFrames.removeFirst());
                }
            }
            fancyPinOverlayView2.removeCallbacks(fancyPinOverlayView2.commitUncapturedPositions);
            FancyPinOverlayView fancyPinOverlayView4 = FancyPinOverlayView.this;
            fancyPinOverlayView4.hasPendingHullLayoutChange = false;
            fancyPinOverlayView4.broadphasePresentations.clear();
            FancyPinOverlayView.this.broadphaseExtents.clear();
            FancyPinOverlayView.this.visualExtents.clear();
            FancyPinOverlayView fancyPinOverlayView5 = FancyPinOverlayView.this;
            fancyPinOverlayView5.registry.clearAnimatedAppearances$xplat_maps_sdk_packages_fancypins_fancypins_kotlin();
            int[] iArr = fancyPinOverlayView5.lastAppliedVariantIndices;
            Arrays.fill(iArr, 0, iArr.length, -1);
            int[] iArr2 = FancyPinOverlayView.this.lastOverlapKeys;
            Arrays.fill(iArr2, 0, iArr2.length, 0);
            Iterator it = arrayListA0h.iterator();
            while (it.hasNext()) {
                try {
                    FancyPinOverlayView.this.recycleThenCompleteRetirement((RetiringHull) it.next(), C04521.INSTANCE);
                } catch (Throwable th3) {
                    if (th != null) {
                        CU7.A01(th, th3);
                    } else {
                        th = th3;
                    }
                }
            }
            FancyPinOverlayView.synchronizeAccessibilitySemantics$default(FancyPinOverlayView.this, false, 1, null);
            FancyPinOverlayView.this.reportResidentSlots();
            FancyPinOverlayView.this.invalidateAppliedFrame();
            if (th != null) {
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws Throwable {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinOverlayView$finishRetirement$1, reason: invalid class name and case insensitive filesystem */
    public final class C144801 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ RetiringHull $retirement;
        public final /* synthetic */ FancyPinOverlayView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144801(RetiringHull retiringHull, FancyPinOverlayView fancyPinOverlayView) {
            super(0);
            this.$retirement = retiringHull;
            this.this$0 = fancyPinOverlayView;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ViewParent parent = this.$retirement.hull.getParent();
            FancyPinOverlayView fancyPinOverlayView = this.this$0;
            if (parent == fancyPinOverlayView) {
                fancyPinOverlayView.detachHull(this.$retirement.hull);
            }
            this.$retirement.hull.prepareForReuse();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinOverlayView$finishRetirement$2, reason: invalid class name and case insensitive filesystem */
    public final class C144812 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ String $removedPinId;
        public final /* synthetic */ int $slotIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144812(int i, String str) {
            super(0);
            this.$slotIndex = i;
            this.$removedPinId = str;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() throws Throwable {
            FancyPinOverlayView.this.recycleSlot(this.$slotIndex, false, AnonymousClass002.A1X(this.$removedPinId));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws Throwable {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinOverlayView$finishRetirementOutsideViewport$1, reason: invalid class name and case insensitive filesystem */
    public final class C144821 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ RetiringHull $retirement;
        public final /* synthetic */ int $slotIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144821(int i, RetiringHull retiringHull) {
            super(0);
            this.$slotIndex = i;
            this.$retirement = retiringHull;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() throws Throwable {
            FancyPinOverlayView.this.recycleSlot(this.$slotIndex, false, AnonymousClass002.A1X(this.$retirement.removedPinId));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws Throwable {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinOverlayView$overlapKey$1, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C144831 extends C7438Evz implements G0U<Integer, FancyPinPresentation> {
        public C144831(Object obj) {
            super(1, obj, FancyPinViewRegistry.class, "typedPresentationForSlot", "typedPresentationForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(I)Lcom/meta/maps/fancypins/FancyPinPresentation;", 0);
        }

        public final FancyPinPresentation invoke(int i) {
            return ((FancyPinViewRegistry) this.receiver).typedPresentationForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(i);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ FancyPinPresentation invoke(Integer num) {
            return invoke(AnonymousClass001.A0F(num));
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinOverlayView$overlapKey$2, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C144842 extends C7438Evz implements G0U<Integer, Integer> {
        public C144842(Object obj) {
            super(1, obj, FancyPinOverlayView.class, "currentFrameVariantIndexForSlot", "currentFrameVariantIndexForSlot(I)Ljava/lang/Integer;", 0);
        }

        public final Integer invoke(int i) {
            return ((FancyPinOverlayView) this.receiver).currentFrameVariantIndexForSlot(i);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(AnonymousClass001.A0F(num));
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinOverlayView$overlapKey$3, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C144853 extends C7438Evz implements G0U<Integer, Integer> {
        public C144853(Object obj) {
            super(1, obj, FancyPinOverlayView.class, "lastAppliedVariantIndexForSlot", "lastAppliedVariantIndexForSlot(I)Ljava/lang/Integer;", 0);
        }

        public final Integer invoke(int i) {
            return ((FancyPinOverlayView) this.receiver).lastAppliedVariantIndexForSlot(i);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(AnonymousClass001.A0F(num));
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinOverlayView$prewarm$1, reason: invalid class name and case insensitive filesystem */
    public final class C144861 extends AbstractC7559F3s implements Function0<FancyPinHullView> {
        public C144861() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final FancyPinHullView invoke() {
            return new FancyPinHullView(AbstractC7608F5v.A0E(FancyPinOverlayView.this), null);
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinOverlayView$productionConnectionFactory$1, reason: invalid class name and case insensitive filesystem */
    public final class C144871 implements FancyPinFrameConnectionFactory {
        public final /* synthetic */ FancyPinDataController $dataController;
        public final /* synthetic */ FancyPinEngine $engine;
        public final /* synthetic */ FancyPinOverlayView this$0;

        /* renamed from: com.meta.maps.fancypins.FancyPinOverlayView$productionConnectionFactory$1$1, reason: invalid class name and collision with other inner class name */
        public final class C04531 extends AbstractC7559F3s implements G0U<FancyPinRenderFrame, Boolean> {
            public final /* synthetic */ FancyPinDataController $dataController;

            @Override // X.G0U
            public final Boolean invoke(FancyPinRenderFrame fancyPinRenderFrame) {
                C7384Etj.A0Y(fancyPinRenderFrame, 0);
                FancyPinDataController fancyPinDataController = this.$dataController;
                boolean z = false;
                if (fancyPinDataController != null && !fancyPinDataController.onRenderFrame$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(fancyPinRenderFrame)) {
                    z = true;
                }
                return C3cG.A0P(z);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04531(FancyPinDataController fancyPinDataController) {
                super(1);
                this.$dataController = fancyPinDataController;
            }
        }

        /* renamed from: com.meta.maps.fancypins.FancyPinOverlayView$productionConnectionFactory$1$2, reason: invalid class name */
        public final /* synthetic */ class AnonymousClass2 implements InterfaceC2349BUy, FancyPinRenderFrameConsumer {
            public final /* synthetic */ FancyPinOverlayView $tmp0;

            @Override // com.meta.maps.fancypins.FancyPinRenderFrameConsumer
            public final void apply(FancyPinRenderFrame fancyPinRenderFrame) {
                C7384Etj.A0Y(fancyPinRenderFrame, 0);
                this.$tmp0.applyFrame(fancyPinRenderFrame);
            }

            public AnonymousClass2(FancyPinOverlayView fancyPinOverlayView) {
                this.$tmp0 = fancyPinOverlayView;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FancyPinRenderFrameConsumer) && (obj instanceof InterfaceC2349BUy)) {
                    return C3cI.A1V(obj, getFunctionDelegate());
                }
                return false;
            }

            @Override // X.InterfaceC2349BUy
            public final Ht9<?> getFunctionDelegate() {
                return new C7438Evz(1, this.$tmp0, FancyPinOverlayView.class, "applyFrame", "applyFrame(Lcom/meta/maps/fancypins/FancyPinRenderFrame;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* renamed from: com.meta.maps.fancypins.FancyPinOverlayView$productionConnectionFactory$1$3, reason: invalid class name */
        public final /* synthetic */ class AnonymousClass3 implements InterfaceC2349BUy, FancyPinVariantTableConsumer {
            public final /* synthetic */ FancyPinViewRegistry $tmp0;

            @Override // com.meta.maps.fancypins.FancyPinVariantTableConsumer
            public final void apply(List<String> list) {
                C7384Etj.A0Y(list, 0);
                this.$tmp0.onVariantTableUpdated$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(list);
            }

            public AnonymousClass3(FancyPinViewRegistry fancyPinViewRegistry) {
                this.$tmp0 = fancyPinViewRegistry;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FancyPinVariantTableConsumer) && (obj instanceof InterfaceC2349BUy)) {
                    return C3cI.A1V(obj, getFunctionDelegate());
                }
                return false;
            }

            @Override // X.InterfaceC2349BUy
            public final Ht9<?> getFunctionDelegate() {
                return new C7438Evz(1, this.$tmp0, FancyPinViewRegistry.class, "onVariantTableUpdated", "onVariantTableUpdated$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(Ljava/util/List;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        public C144871(FancyPinEngine fancyPinEngine, FancyPinOverlayView fancyPinOverlayView, FancyPinDataController fancyPinDataController) {
            this.$engine = fancyPinEngine;
            this.this$0 = fancyPinOverlayView;
            this.$dataController = fancyPinDataController;
        }

        @Override // com.meta.maps.fancypins.FancyPinFrameConnectionFactory
        public final FancyPinFrameConnection create() {
            FancyPinEngine fancyPinEngine = this.$engine;
            FancyPinOverlayView fancyPinOverlayView = this.this$0;
            float f = FancyPinOverlayView.DEFAULT_BROADPHASE_EXTENT;
            Executor executor = fancyPinOverlayView.frameConsumerExecutor;
            if (executor == null) {
                executor = fancyPinOverlayView.uiExecutor;
            }
            FancyPinRenderFrameRouter fancyPinRenderFrameRouter = new FancyPinRenderFrameRouter(new C04531(this.$dataController), new AnonymousClass2(fancyPinOverlayView));
            FancyPinOverlayView fancyPinOverlayView2 = this.this$0;
            return new FancyPinEngineFrameDelegate(fancyPinEngine, executor, fancyPinRenderFrameRouter, new AnonymousClass3(fancyPinOverlayView2.registry), fancyPinOverlayView2.presentationEpoch);
        }
    }

    public FancyPinOverlayView(Context context, FancyPinViewRegistry fancyPinViewRegistry) {
        this(context, fancyPinViewRegistry, 1.0f, null, AnonymousClass004.A1b(context, fancyPinViewRegistry));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FancyPinPartApplyContext applyContextForPart(FancyPinRenderFrame fancyPinRenderFrame, int i, int i2) {
        return (i < 0 || i >= fancyPinRenderFrame.overlapMaskRowCount || i2 < 0 || i2 >= fancyPinRenderFrame.overlapMaskStride || fancyPinRenderFrame.overlapMaskAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(i, i2) == 0) ? FancyPinPartApplyContext.CLEAR : FancyPinApplyContextResolver.INSTANCE.resolve(fancyPinRenderFrame, i, i2, new AnonymousClass1(this.registry), new AnonymousClass2(this), new AnonymousClass3(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void evictHiddenHullOutsideViewport(int i, FancyPinRetirement fancyPinRetirement, String str, boolean z) throws Throwable {
        try {
            recycleSlot(i, z, true);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            completeRemoval(fancyPinRetirement, str);
            if (th == null) {
                return;
            }
        } catch (Throwable th2) {
            if (th == null) {
                throw th2;
            }
            CU7.A01(th, th2);
        }
        throw th;
    }

    private final void finishRetirementOutsideViewport(int i, FancyPinHullView fancyPinHullView) throws Throwable {
        RetiringHull retiringHullCancelRetirement = cancelRetirement(i, fancyPinHullView, false);
        if (retiringHullCancelRetirement != null) {
            recycleThenCompleteRetirement(retiringHullCancelRetirement, new C144821(i, retiringHullCancelRetirement));
        }
    }

    private final int overlapKey(FancyPinRenderFrame fancyPinRenderFrame, int i) {
        int i2 = fancyPinRenderFrame.overlapMaskStride;
        if (i2 == 0) {
            return 0;
        }
        int iSemanticKey = 1;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = (iSemanticKey * 31) + i3;
            iSemanticKey = (i < 0 || i >= fancyPinRenderFrame.overlapMaskRowCount || fancyPinRenderFrame.overlapMaskAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(i, i3) != 0) ? (i4 * 31) + FancyPinApplyContextResolver.INSTANCE.semanticKey(fancyPinRenderFrame, i, i3, new C144831(this.registry), new C144842(this), new C144853(this)) : i4 * 31;
        }
        return iSemanticKey;
    }

    private final void publishAppliedFrame() {
        this.hasAppliedFrame = true;
        this.appliedFrameGeneration = this.frameGeneration;
        this.appliedLifecycleGeneration = this.lifecycleGeneration;
        FancyPinAppliedFrameListener fancyPinAppliedFrameListener = this.appliedFrameListener;
        if (fancyPinAppliedFrameListener != null) {
            fancyPinAppliedFrameListener.onAppliedFrame(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recycleAt(int i, List<RetiringHull> list) throws Throwable {
        int iKeyAt = this.realizedHulls.keyAt(i);
        FancyPinHullView fancyPinHullViewValueAt = this.realizedHulls.valueAt(i);
        FancyPinHullReuseKey fancyPinHullReuseKeyValueAt = this.realizedReuseKeys.valueAt(i);
        C7384Etj.A0X(fancyPinHullViewValueAt);
        RetiringHull retiringHullCancelRetirement = cancelRetirement(iKeyAt, fancyPinHullViewValueAt, false);
        cancelAppearance(iKeyAt, fancyPinHullViewValueAt, false);
        FancyPinOverlayView$recycleAt$recycle$1 fancyPinOverlayView$recycleAt$recycle$1 = new FancyPinOverlayView$recycleAt$recycle$1(this, i, iKeyAt, fancyPinHullViewValueAt, fancyPinHullReuseKeyValueAt);
        if (list == null) {
            recycleThenCompleteRetirement(retiringHullCancelRetirement, fancyPinOverlayView$recycleAt$recycle$1);
            return;
        }
        if (retiringHullCancelRetirement != null) {
            list.add(retiringHullCancelRetirement);
        }
        fancyPinOverlayView$recycleAt$recycle$1.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recycleSlot(int i, boolean z, boolean z2) throws Throwable {
        FancyPinHullReuseKey fancyPinHullReuseKey;
        FancyPinHullView fancyPinHullView = this.realizedHulls.get(i);
        if (fancyPinHullView == null || (fancyPinHullReuseKey = this.realizedReuseKeys.get(i)) == null) {
            return;
        }
        FancyPinOverlayView$recycleSlot$recycle$1 fancyPinOverlayView$recycleSlot$recycle$1 = new FancyPinOverlayView$recycleSlot$recycle$1(this, i, fancyPinHullView, z2, fancyPinHullReuseKey);
        if (z) {
            runAfterSupersedingActiveTransition(fancyPinOverlayView$recycleSlot$recycle$1);
        } else {
            fancyPinOverlayView$recycleSlot$recycle$1.invoke();
        }
    }

    private final void resolveAccessibilitySemantics(boolean z) {
        boolean z2;
        RetiringHull retiringHullA0b;
        FancyPinHullView fancyPinHullView;
        Number numberA0j;
        RetiringHull retiringHullA0b2;
        FancyPinPresentation fancyPinPresentation;
        String string;
        int i = 0;
        this.accessibilitySemanticsStale = false;
        long j = this.accessibilitySynchronizationGeneration + 1;
        this.accessibilitySynchronizationGeneration = j;
        FancyPinAccessibilityDelegate fancyPinAccessibilityDelegate = this.pinAccessibilityDelegate;
        if (fancyPinAccessibilityDelegate != null) {
            rebuildDrawingOrderIfNeeded(getChildCount());
            int childCount = getChildCount();
            int i2 = 0;
            z2 = false;
            while (i < childCount) {
                View childAt = getChildAt(this.drawingOrder.get(i));
                if ((childAt instanceof FancyPinHullView) && (fancyPinHullView = (FancyPinHullView) childAt) != null && (numberA0j = BV6.A0j(fancyPinHullView, this.slotsByHull)) != null) {
                    int iIntValue = numberA0j.intValue();
                    if (fancyPinHullView.getVisibility() == 0 && (((retiringHullA0b2 = AbstractC7608F5v.A0b(this, iIntValue)) == null || retiringHullA0b2.hull != fancyPinHullView) && accessibilityBoundsInParent(fancyPinHullView, this.accessibilityRoundedBounds) && (fancyPinPresentation = this.lastAppliedPresentations.get(iIntValue)) != null)) {
                        CachedAccessibilityLabel cachedAccessibilityLabel = this.cachedAccessibilityLabels.get(iIntValue);
                        if (cachedAccessibilityLabel == null || cachedAccessibilityLabel.presentation != fancyPinPresentation) {
                            CharSequence charSequenceLabelForPin = fancyPinAccessibilityDelegate.labelForPin(fancyPinPresentation.pin.id);
                            if (charSequenceLabelForPin == null || (string = charSequenceLabelForPin.toString()) == null || C7BY.A0j(string)) {
                                string = null;
                            }
                            if (j != this.accessibilitySynchronizationGeneration || fancyPinAccessibilityDelegate != this.pinAccessibilityDelegate) {
                                return;
                            } else {
                                this.cachedAccessibilityLabels.put(iIntValue, new CachedAccessibilityLabel(fancyPinPresentation, string));
                            }
                        } else {
                            string = cachedAccessibilityLabel.label;
                        }
                        if (string != null) {
                            String str = fancyPinPresentation.pin.id;
                            LinkedHashMap<String, Integer> linkedHashMap = this.accessibilityVirtualIdsByPinId;
                            Integer numValueOf = linkedHashMap.get(str);
                            if (numValueOf == null) {
                                int i3 = this.nextAccessibilityVirtualId;
                                this.nextAccessibilityVirtualId = i3 + 1;
                                this.accessibilityPinIdsByVirtualId.put(i3, str);
                                numValueOf = Integer.valueOf(i3);
                                linkedHashMap.put(str, numValueOf);
                            }
                            int iA0F = AnonymousClass001.A0F(numValueOf);
                            AccessiblePin accessiblePin = (AccessiblePin) AbstractC0878AGe.A0A(i2, this.accessiblePins);
                            if (accessiblePin == null || accessiblePin.virtualId != iA0F || !C7384Etj.areEqual(accessiblePin.pinId, str) || !string.equals(accessiblePin.label) || accessiblePin.hull != fancyPinHullView) {
                                AccessiblePin accessiblePin2 = new AccessiblePin(iA0F, str, string, fancyPinHullView);
                                ArrayList<AccessiblePin> arrayList = this.accessiblePins;
                                if (accessiblePin == null) {
                                    arrayList.add(accessiblePin2);
                                } else {
                                    arrayList.set(i2, accessiblePin2);
                                }
                                z2 = true;
                            }
                            i2++;
                        }
                    }
                }
                i++;
            }
            i = i2;
        } else {
            z2 = false;
        }
        while (true) {
            ArrayList<AccessiblePin> arrayList2 = this.accessiblePins;
            if (arrayList2.size() <= i) {
                break;
            }
            arrayList2.remove(C60O.A00(arrayList2));
            z2 = true;
        }
        for (int size = this.cachedAccessibilityLabels.size() - 1; -1 < size; size--) {
            int iKeyAt = this.cachedAccessibilityLabels.keyAt(size);
            FancyPinHullView fancyPinHullView2 = this.realizedHulls.get(iKeyAt);
            if (fancyPinAccessibilityDelegate == null || fancyPinHullView2 == null || fancyPinHullView2.getVisibility() != 0 || (((retiringHullA0b = AbstractC7608F5v.A0b(this, iKeyAt)) != null && retiringHullA0b.hull == fancyPinHullView2) || this.lastAppliedPresentations.get(iKeyAt) != this.cachedAccessibilityLabels.valueAt(size).presentation)) {
                this.cachedAccessibilityLabels.removeAt(size);
            }
        }
        int size2 = this.accessibilityVirtualIdsByPinId.size();
        ArrayList<AccessiblePin> arrayList3 = this.accessiblePins;
        if (size2 > arrayList3.size()) {
            HashSet hashSetA13 = C60O.A13();
            Iterator<AccessiblePin> it = arrayList3.iterator();
            while (it.hasNext()) {
                hashSetA13.add(it.next().pinId);
            }
            Iterator itA0i = C3cG.A0i(this.accessibilityVirtualIdsByPinId);
            while (itA0i.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0i);
                if (!hashSetA13.contains(entryA0l.getKey())) {
                    this.accessibilityPinIdsByVirtualId.remove(AnonymousClass001.A0F(entryA0l.getValue()));
                    itA0i.remove();
                }
            }
        }
        updateHostAccessibilityExposure(!this.accessiblePins.isEmpty());
        if (z || z2) {
            this.accessibilityInvalidationCount++;
            PinAccessibilityHelper pinAccessibilityHelper = this.pinAccessibilityHelper;
            if (pinAccessibilityHelper != null) {
                pinAccessibilityHelper.invalidateRoot();
            }
        }
    }

    public final Integer accessibilityVirtualIdForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(String str) {
        C7384Etj.A0Y(str, 0);
        synchronizeStaleAccessibilitySemantics();
        return this.accessibilityVirtualIdsByPinId.get(str);
    }

    public final void applyFrame(FancyPinRenderFrame fancyPinRenderFrame) {
        C7384Etj.A0Y(fancyPinRenderFrame, 0);
        checkMainThread("applyFrame");
        discardPendingPositions();
        if (applyFrameContents(fancyPinRenderFrame)) {
            this.acknowledgedRenderGeneration = Math.max(this.acknowledgedRenderGeneration, fancyPinRenderFrame.renderBufferGeneration);
            reportResidentSlots();
            this.registry.expireFrameScopedAppearanceIntent$xplat_maps_sdk_packages_fancypins_fancypins_kotlin();
        }
    }

    public final void bindConnectionFactory$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(FancyPinFrameConnectionFactory fancyPinFrameConnectionFactory, FancyPinResidencyReporter fancyPinResidencyReporter) {
        C7384Etj.A0Y(fancyPinFrameConnectionFactory, 0);
        checkMainThread("bindEngine");
        this.engineController.bind(fancyPinFrameConnectionFactory);
        this.acknowledgedRenderGeneration = 0L;
        if (fancyPinResidencyReporter != null) {
            this.residencyReporter = fancyPinResidencyReporter;
        }
    }

    public final void bindEngine(FancyPinEngine fancyPinEngine) {
        C7384Etj.A0Y(fancyPinEngine, 0);
        bindProductionEngine(fancyPinEngine, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        PinAccessibilityHelper pinAccessibilityHelper;
        C7384Etj.A0Y(motionEvent, 0);
        if (this.pinAccessibilityDelegate == null || (pinAccessibilityHelper = this.pinAccessibilityHelper) == null || !pinAccessibilityHelper.dispatchHoverEvent(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        PinAccessibilityHelper pinAccessibilityHelper;
        C7384Etj.A0Y(keyEvent, 0);
        if (this.pinAccessibilityDelegate == null || (pinAccessibilityHelper = this.pinAccessibilityHelper) == null || !pinAccessibilityHelper.dispatchKeyEvent(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public final void forEachAppliedPresentation(FancyPinAppliedPresentationVisitor fancyPinAppliedPresentationVisitor) {
        RetiringHull retiringHullA0b;
        FancyPinPresentation fancyPinPresentation;
        String str;
        C7384Etj.A0Y(fancyPinAppliedPresentationVisitor, 0);
        checkMainThread("forEachAppliedPresentation");
        if (this.hasAppliedFrame) {
            int i = this.appliedFrameGeneration;
            long j = this.appliedLifecycleGeneration;
            int size = this.realizedHulls.size();
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = this.realizedHulls.keyAt(i2);
                FancyPinHullView fancyPinHullViewValueAt = this.realizedHulls.valueAt(i2);
                int[] iArr = this.seenGeneration;
                if (iKeyAt < iArr.length && iArr[iKeyAt] == i && this.outsideBroadphaseGenerations[iKeyAt] != i && fancyPinHullViewValueAt.getVisibility() == 0 && (((retiringHullA0b = AbstractC7608F5v.A0b(this, iKeyAt)) == null || retiringHullA0b.hull != fancyPinHullViewValueAt) && (fancyPinPresentation = this.lastAppliedPresentations.get(iKeyAt)) != null && (str = fancyPinHullViewValueAt.currentVariantId) != null && fancyPinHullViewValueAt.appliedPartBoundsInParent$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(this.appliedPresentationBounds))) {
                    RectF rectF = this.appliedPresentationBounds;
                    float f = rectF.left;
                    float f2 = rectF.top;
                    float fWidth = rectF.width();
                    float fHeight = this.appliedPresentationBounds.height();
                    FancyPin fancyPin = fancyPinPresentation.pin;
                    fancyPinAppliedPresentationVisitor.onPresentation(fancyPin.id, str, fancyPin.coordinates, f, f2, fWidth, fHeight);
                    if (this.appliedFrameGeneration != i || this.appliedLifecycleGeneration != j) {
                        return;
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    public final void markHullLayoutChanged$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        this.hasPendingHullLayoutChange = true;
        forceLayout();
    }

    public final void prewarm(String str, int i) {
        C7384Etj.A0Y(str, 0);
        checkMainThread("prewarm");
        Long lRegistrationRevision$xplat_maps_sdk_packages_fancypins_fancypins_kotlin = this.registry.registrationRevision$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(str);
        if (lRegistrationRevision$xplat_maps_sdk_packages_fancypins_fancypins_kotlin == null) {
            throw BV5.A0V("No typed part registration is registered for '", str, "'");
        }
        this.pool.prewarm(i, new FancyPinHullReuseKey(str, lRegistrationRevision$xplat_maps_sdk_packages_fancypins_fancypins_kotlin.longValue()), new C144861());
    }

    public final void replaceResidentHullForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i, FancyPinHullView fancyPinHullView) {
        C7384Etj.A0Y(fancyPinHullView, 1);
        this.realizedHulls.put(i, fancyPinHullView);
    }

    public final void setHullAnimationSchedulerForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(FancyPinHullAnimationScheduler fancyPinHullAnimationScheduler) {
        C7384Etj.A0Y(fancyPinHullAnimationScheduler, 0);
        checkMainThread("setHullAnimationSchedulerForTesting");
        if (this.retiringHulls.size() != 0 || this.appearingHulls.size() != 0) {
            throw C3cG.A0Q("Cannot replace the hull animation scheduler while animations are active");
        }
        this.hullAnimationScheduler = fancyPinHullAnimationScheduler;
    }

    public final void setZOrderMode(FancyPinZOrderMode fancyPinZOrderMode) {
        C7384Etj.A0Y(fancyPinZOrderMode, 0);
        checkMainThread("zOrderMode");
        if (this.zOrderMode != fancyPinZOrderMode) {
            this.zOrderMode = fancyPinZOrderMode;
            refreshActiveDrawingKeys();
        }
    }

    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FancyPinZOrderMode.values().length];
            try {
                AnonymousClass002.A13(FancyPinZOrderMode.CUSTOM, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(FancyPinZOrderMode.SCREEN_Y, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(FancyPinZOrderMode.INSERTION_ORDER, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(FancyPinZOrderMode.RANK_PRIORITY, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ Throwable access$combineFailures(FancyPinOverlayView fancyPinOverlayView, Throwable th, Throwable th2) {
        if (th == null) {
            return th2;
        }
        CU7.A01(th, th2);
        return th;
    }

    private final FancyPinHullView acquireCompatibleHull(int i, FancyPinHullReuseKey fancyPinHullReuseKey, FancyPinHullView fancyPinHullView, boolean z, boolean z2) throws Throwable {
        FancyPinHullView fancyPinHullView2;
        if (fancyPinHullView != null && C7384Etj.areEqual(this.realizedReuseKeys.get(i), fancyPinHullReuseKey)) {
            return fancyPinHullView;
        }
        RetiringHull retiringHullA0b = AbstractC7608F5v.A0b(this, i);
        Float fValueOf = (retiringHullA0b == null || (fancyPinHullView2 = retiringHullA0b.hull) != fancyPinHullView || fancyPinHullView2 == null) ? null : Float.valueOf(fancyPinHullView2.presentationAlpha);
        if (fancyPinHullView != null) {
            if (fValueOf != null) {
                cancelRetirement(i, fancyPinHullView, false);
            }
            recycleSlot(i, z, true);
        }
        FancyPinHullView fancyPinHullViewDequeue = this.pool.dequeue(fancyPinHullReuseKey);
        if (fancyPinHullViewDequeue == null) {
            fancyPinHullViewDequeue = new FancyPinHullView(AbstractC7608F5v.A0E(this), null);
        }
        SparseArray<FancyPinHullView> sparseArray = this.realizedHulls;
        sparseArray.put(i, fancyPinHullViewDequeue);
        this.realizedReuseKeys.put(i, fancyPinHullReuseKey);
        attachHull(fancyPinHullViewDequeue, i, sparseArray.indexOfKey(i));
        SparseArray<String> sparseArray2 = this.pendingHullAppearances;
        String str = sparseArray2.get(i);
        sparseArray2.remove(i);
        FancyPin fancyPinPinForSlot = this.registry.pinForSlot(i);
        boolean zAreEqual = C7384Etj.areEqual(str, fancyPinPinForSlot != null ? fancyPinPinForSlot.id : null);
        float fFloatValue = 0.0f;
        if (fValueOf != null) {
            fFloatValue = fValueOf.floatValue();
        } else if (!zAreEqual) {
            if (z2) {
                fancyPinHullViewDequeue.setPresentationAlpha$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(0.0f);
            }
            return fancyPinHullViewDequeue;
        }
        fancyPinHullViewDequeue.setPresentationAlpha$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(fFloatValue);
        beginAppearance(i, fancyPinHullViewDequeue);
        return fancyPinHullViewDequeue;
    }

    private final void advanceLifecycleGeneration() {
        long j = this.lifecycleGeneration;
        this.lifecycleGeneration = j != LinkEncryptedPairingKt.LINK_COUNTER_MAX ? 1 + j : 1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x01c0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean applyFrameContents(com.meta.maps.fancypins.FancyPinRenderFrame r29) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.maps.fancypins.FancyPinOverlayView.applyFrameContents(com.meta.maps.fancypins.FancyPinRenderFrame):boolean");
    }

    private final boolean applyTypedPresentation(FancyPinHullView fancyPinHullView, int i, int i2, FancyPinRenderFrame fancyPinRenderFrame, FancyPinPresentation fancyPinPresentation, int i3, long j, ActiveTransitionBatch activeTransitionBatch) {
        int i4;
        FancyPin fancyPin;
        String str = (String) AbstractC0878AGe.A0A(i2, fancyPinRenderFrame.variantIds);
        if (str == null) {
            str = fancyPinPresentation.blueprint.defaultVariantId;
        }
        PinLayout pinLayoutResolve = FancyPinPlacementResolver.INSTANCE.resolve(fancyPinPresentation.layout, str, fancyPinPresentation.blueprint, i, fancyPinRenderFrame);
        Map<String, MutablePartRenderState> map = this.partRenderStates.get(i);
        FancyPinPresentation fancyPinPresentation2 = this.lastAppliedPresentations.get(i);
        if (!C7384Etj.areEqual((fancyPinPresentation2 == null || (fancyPin = fancyPinPresentation2.pin) == null) ? null : fancyPin.id, fancyPinPresentation.pin.id)) {
            map = null;
        }
        Map<String, MutablePartRenderState> mapA0j = map;
        if (mapA0j == null) {
            mapA0j = C3cG.A0j();
        }
        VariantLayout variantLayout = pinLayoutResolve.variants.get(str);
        if (i2 < 0) {
            i4 = 0;
        } else {
            i4 = i2;
            if (i2 > 255) {
                i4 = 255;
            }
        }
        String str2 = fancyPinPresentation.pin.id;
        FancyPinBlueprint fancyPinBlueprint = fancyPinPresentation.blueprint;
        Map<String, ? extends Object> map2 = fancyPinPresentation.properties;
        FancyPinViewRegistry fancyPinViewRegistry = this.registry;
        FancyPinRuntimeClusterContext fancyPinRuntimeClusterContext = fancyPinPresentation.runtimeCluster;
        Map<String, FancyPinErasedPartConfiguration> map3 = fancyPinPresentation.getResolvedPartConfigurations().get(str);
        if (map3 == null) {
            map3 = C9jH.A00;
        }
        fancyPinHullView.applyParts$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(pinLayoutResolve, str, str2, fancyPinBlueprint, map2, fancyPinViewRegistry, fancyPinRuntimeClusterContext, map3, new C144721(variantLayout, mapA0j, i3, i4), new C144732(fancyPinRenderFrame, i), activeTransitionBatch != null ? new FancyPinOverlayView$applyTypedPresentation$3$1(mapA0j, i3, activeTransitionBatch, fancyPinPresentation) : null, null, null);
        if (this.frameGeneration != i3 || this.lifecycleGeneration != j) {
            return false;
        }
        Iterator itA10 = BV5.A10(mapA0j);
        while (itA10.hasNext()) {
            ((MutablePartRenderState) itA10.next()).commit(i3);
        }
        this.partRenderStates.put(i, mapA0j);
        fancyPinHullView.markApplied$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(i, fancyPinPresentation.blueprint.id, i2);
        this.registry.didApply$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(i);
        return true;
    }

    private final void beginAppearance(final int i, final FancyPinHullView fancyPinHullView) {
        float f = fancyPinHullView.presentationAlpha;
        if (f >= 1.0f) {
            fancyPinHullView.setPresentationAlpha$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(1.0f);
            return;
        }
        HullAnimation hullAnimation = this.appearingHulls.get(i);
        if (hullAnimation == null || hullAnimation.hull != fancyPinHullView) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 1.0f);
            C7384Etj.A0X(valueAnimatorOfFloat);
            final HullAnimation hullAnimation2 = new HullAnimation(fancyPinHullView, valueAnimatorOfFloat);
            this.appearingHulls.put(i, hullAnimation2);
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.setInterpolator(HULL_FADE_INTERPOLATOR);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.meta.maps.fancypins.FancyPinOverlayView.beginAppearance.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C7384Etj.A0Y(valueAnimator, 0);
                    fancyPinHullView.setPresentationAlpha$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(AbstractC7610F5x.A03(valueAnimator));
                }
            });
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.meta.maps.fancypins.FancyPinOverlayView.beginAppearance.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    FancyPinOverlayView fancyPinOverlayView = FancyPinOverlayView.this;
                    float f2 = FancyPinOverlayView.DEFAULT_BROADPHASE_EXTENT;
                    SparseArray<HullAnimation> sparseArray = fancyPinOverlayView.appearingHulls;
                    int i2 = i;
                    if (sparseArray.get(i2) == hullAnimation2) {
                        sparseArray.remove(i2);
                        fancyPinHullView.setPresentationAlpha$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(1.0f);
                    }
                }
            });
            this.hullAnimationScheduler.start(valueAnimatorOfFloat);
        }
    }

    private final void beginFrame(FancyPinRenderFrame fancyPinRenderFrame) {
        int i = this.frameGeneration;
        int i2 = 1;
        if (i == Integer.MAX_VALUE) {
            int[] iArr = this.seenGeneration;
            Arrays.fill(iArr, 0, iArr.length, 0);
            int[] iArr2 = this.currentFrameVariantGenerations;
            Arrays.fill(iArr2, 0, iArr2.length, 0);
            int[] iArr3 = this.outsideBroadphaseGenerations;
            Arrays.fill(iArr3, 0, iArr3.length, 0);
        } else {
            i2 = i + 1;
        }
        this.frameGeneration = i2;
        int i3 = fancyPinRenderFrame.count;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = fancyPinRenderFrame.slotIndices[i4];
            if (i5 >= 0) {
                ensureSlotCapacity(i5);
                this.currentFrameVariantIndices[i5] = fancyPinRenderFrame.variantIndices[i4];
                this.currentFrameVariantGenerations[i5] = this.frameGeneration;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void beginRetirement(final int i, final FancyPinHullView fancyPinHullView, FancyPinRetirement fancyPinRetirement, String str, boolean z) throws Throwable {
        SparseArray<RetiringHull> sparseArray = this.retiringHulls;
        RetiringHull retiringHull = sparseArray.get(i);
        if (retiringHull != null) {
            if (retiringHull.hull == fancyPinHullView) {
                if (z) {
                    retiringHull.removal = fancyPinRetirement;
                    retiringHull.removedPinId = str;
                    return;
                }
                return;
            }
            sparseArray.remove(i);
            retiringHull.animator.removeAllListeners();
            retiringHull.animator.cancel();
            recycleThenCompleteRetirement(retiringHull, new FancyPinOverlayView$beginRetirement$1$1(retiringHull, this));
            if (this.realizedHulls.get(i) != fancyPinHullView) {
                return;
            }
        }
        cancelAppearance(i, fancyPinHullView, false);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fancyPinHullView.presentationAlpha, 0.0f);
        C7384Etj.A0X(valueAnimatorOfFloat);
        final RetiringHull retiringHull2 = new RetiringHull(fancyPinHullView, valueAnimatorOfFloat, fancyPinRetirement, str);
        this.retiringHulls.put(i, retiringHull2);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(HULL_FADE_INTERPOLATOR);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.meta.maps.fancypins.FancyPinOverlayView.beginRetirement.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C7384Etj.A0Y(valueAnimator, 0);
                fancyPinHullView.setPresentationAlpha$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(AbstractC7610F5x.A03(valueAnimator));
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.meta.maps.fancypins.FancyPinOverlayView.beginRetirement.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) throws Throwable {
                FancyPinOverlayView.this.finishRetirement(i, retiringHull2);
            }
        });
        this.hullAnimationScheduler.start(valueAnimatorOfFloat);
    }

    public static /* synthetic */ void bindConnectionFactory$xplat_maps_sdk_packages_fancypins_fancypins_kotlin$default(FancyPinOverlayView fancyPinOverlayView, FancyPinFrameConnectionFactory fancyPinFrameConnectionFactory, FancyPinResidencyReporter fancyPinResidencyReporter, int i, Object obj) {
        if ((i & 2) != 0) {
            fancyPinResidencyReporter = null;
        }
        fancyPinOverlayView.bindConnectionFactory$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(fancyPinFrameConnectionFactory, fancyPinResidencyReporter);
    }

    private final void bindProductionEngine(FancyPinEngine fancyPinEngine, FancyPinDataController fancyPinDataController) {
        bindConnectionFactory$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(new C144871(fancyPinEngine, this, fancyPinDataController), new C144781(fancyPinEngine));
    }

    private final void cacheExtents(int i, FancyPinPresentation fancyPinPresentation) {
        if (this.broadphasePresentations.get(i) != fancyPinPresentation) {
            Iterator itA10 = BV5.A10(fancyPinPresentation.layout.variants);
            float fMax = 0.0f;
            while (itA10.hasNext()) {
                LayoutRect layoutRect = ((VariantLayout) itA10.next()).boundingBox;
                double d = layoutRect.x;
                float fAbs = (float) Math.abs(d);
                float fAbs2 = (float) Math.abs(d + layoutRect.width);
                double d2 = layoutRect.y;
                float fAbs3 = (float) Math.abs(d2);
                float fAbs4 = (float) Math.abs(d2 + layoutRect.height);
                float[] fArr = new float[4];
                AbstractC7607F5u.A1S(fArr, fAbs, fAbs2, fAbs3);
                fArr[3] = fAbs4;
                int i2 = 0;
                do {
                    fMax = Math.max(fMax, fArr[i2]);
                    i2++;
                } while (i2 < 4);
            }
            this.broadphasePresentations.put(i, fancyPinPresentation);
            SparseArray<Float> sparseArray = this.broadphaseExtents;
            float fMax2 = Math.max(200.0f, fMax);
            float f = this.screenCoordinateScale;
            sparseArray.put(i, Float.valueOf(fMax2 * f));
            this.visualExtents.put(i, Float.valueOf(fMax * f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelAppearance(int i, FancyPinHullView fancyPinHullView, boolean z) {
        SparseArray<HullAnimation> sparseArray = this.appearingHulls;
        HullAnimation hullAnimation = sparseArray.get(i);
        if (hullAnimation == null || hullAnimation.hull != fancyPinHullView) {
            return;
        }
        sparseArray.remove(i);
        hullAnimation.animator.removeAllListeners();
        hullAnimation.animator.cancel();
        if (z) {
            fancyPinHullView.setPresentationAlpha$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RetiringHull cancelRetirement(int i, FancyPinHullView fancyPinHullView, boolean z) {
        SparseArray<RetiringHull> sparseArray = this.retiringHulls;
        RetiringHull retiringHull = sparseArray.get(i);
        if (retiringHull == null || retiringHull.hull != fancyPinHullView) {
            return null;
        }
        sparseArray.remove(i);
        retiringHull.animator.removeAllListeners();
        retiringHull.animator.cancel();
        if (z) {
            beginAppearance(i, fancyPinHullView);
        }
        return retiringHull;
    }

    public static /* synthetic */ RetiringHull cancelRetirement$default(FancyPinOverlayView fancyPinOverlayView, int i, FancyPinHullView fancyPinHullView, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return fancyPinOverlayView.cancelRetirement(i, fancyPinHullView, z);
    }

    private final PendingPositions capturePendingPositions(FancyPinRenderFrame fancyPinRenderFrame) {
        FancyPinHullView fancyPinHullView;
        PendingPositions pendingPositionsPollLast = this.recycledPositions.pollLast();
        if (pendingPositionsPollLast == null) {
            pendingPositionsPollLast = new PendingPositions();
        }
        int i = fancyPinRenderFrame.count;
        SparseArray<FancyPinHullView> sparseArray = this.realizedHulls;
        int iMin = Math.min(i, sparseArray.size());
        pendingPositionsPollLast.reset(iMin);
        int i2 = 0;
        for (int i3 = 0; i3 < i && i2 != iMin; i3++) {
            int i4 = fancyPinRenderFrame.slotIndices[i3];
            if (i4 >= 0 && (fancyPinHullView = sparseArray.get(i4)) != null) {
                pendingPositionsPollLast.slotIndices[i2] = i4;
                pendingPositionsPollLast.pinIds[i2] = fancyPinHullView.currentPinId;
                float[] fArr = pendingPositionsPollLast.screenXs;
                float f = fancyPinRenderFrame.screenXs[i3];
                float f2 = this.screenCoordinateScale;
                fArr[i2] = f * f2;
                pendingPositionsPollLast.screenYs[i2] = fancyPinRenderFrame.screenYs[i3] * f2;
                i2++;
            }
        }
        pendingPositionsPollLast.count = i2;
        return pendingPositionsPollLast;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearPresentationHistory(int i) {
        this.lastAppliedPinIds.remove(i);
        this.partRenderStates.remove(i);
        this.broadphasePresentations.remove(i);
        this.broadphaseExtents.remove(i);
        this.visualExtents.remove(i);
        float[] fArr = this.lastRowScreenXs;
        if (i < fArr.length) {
            fArr[i] = Float.NaN;
            this.lastRowScreenYs[i] = Float.NaN;
        }
    }

    private final Throwable combineFailures(Throwable th, Throwable th2) {
        if (th == null) {
            return th2;
        }
        CU7.A01(th, th2);
        return th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void commitPositions(PendingPositions pendingPositions) {
        int i = pendingPositions.count;
        for (int i2 = 0; i2 < i; i2++) {
            FancyPinHullView fancyPinHullView = this.realizedHulls.get(pendingPositions.slotIndices[i2]);
            if (fancyPinHullView != null && C7384Etj.areEqual(fancyPinHullView.currentPinId, pendingPositions.pinIds[i2])) {
                fancyPinHullView.positionAnchorAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(pendingPositions.screenXs[i2], pendingPositions.screenYs[i2]);
            }
        }
    }

    private final void completeRemoval(FancyPinRetirement fancyPinRetirement, String str) {
        G0U<? super String, Unit> g0u;
        if (fancyPinRetirement != null) {
            fancyPinRetirement.complete();
        } else {
            if (str == null || (g0u = this.retirementCompletionHandler) == null) {
                return;
            }
            g0u.invoke(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer currentFrameVariantIndexForSlot(int i) {
        int[] iArr = this.currentFrameVariantIndices;
        C7384Etj.A0Y(iArr, 0);
        Integer numValueOf = (i < 0 || i >= iArr.length) ? null : Integer.valueOf(iArr[i]);
        if (numValueOf == null || this.currentFrameVariantGenerations[i] != this.frameGeneration) {
            return null;
        }
        return numValueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void detachHull(FancyPinHullView fancyPinHullView) {
        this.slotsByHull.remove(fancyPinHullView);
        removeView(fancyPinHullView);
        markDrawingOrderDirty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void discardPendingPositions() {
        PendingPositions pendingPositions = this.pendingPositions;
        if (pendingPositions != null) {
            this.recycledPositions.addLast(pendingPositions);
        }
        this.pendingPositions = null;
    }

    private final void ensureChildOrderCapacity(int i) {
        int length = this.slotsByChildIndex.length;
        if (length < i) {
            int iMax = Math.max(1, length);
            while (iMax < i) {
                int i2 = iMax;
                iMax *= 2;
                if (i2 > 1073741823) {
                    iMax = i;
                }
            }
            this.slotsByChildIndex = new int[iMax];
            this.keysByChildIndex = new double[iMax];
        }
    }

    private final void ensureSlotCapacity(int i) {
        int[] iArr = this.seenGeneration;
        int length = iArr.length;
        if (i < length) {
            return;
        }
        while (length <= i) {
            length *= 2;
        }
        this.seenGeneration = AbstractC7607F5u.A1a(iArr, length);
        this.currentFrameVariantIndices = AbstractC7607F5u.A1a(this.currentFrameVariantIndices, length);
        this.currentFrameVariantGenerations = AbstractC7607F5u.A1a(this.currentFrameVariantGenerations, length);
        this.outsideBroadphaseGenerations = AbstractC7607F5u.A1a(this.outsideBroadphaseGenerations, length);
        float[] fArr = this.lastRowScreenXs;
        int length2 = fArr.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length);
        C7384Etj.A0U(fArrCopyOf);
        this.lastRowScreenXs = fArrCopyOf;
        Arrays.fill(fArrCopyOf, length2, length, Float.NaN);
        float[] fArrCopyOf2 = Arrays.copyOf(this.lastRowScreenYs, length);
        C7384Etj.A0U(fArrCopyOf2);
        this.lastRowScreenYs = fArrCopyOf2;
        Arrays.fill(fArrCopyOf2, length2, length, Float.NaN);
        float[] fArrCopyOf3 = Arrays.copyOf(this.lastScreenYBySlot, length);
        C7384Etj.A0U(fArrCopyOf3);
        this.lastScreenYBySlot = fArrCopyOf3;
        double[] dArrCopyOf = Arrays.copyOf(this.lastDrawingKeysBySlot, length);
        C7384Etj.A0U(dArrCopyOf);
        this.lastDrawingKeysBySlot = dArrCopyOf;
        float[] fArrCopyOf4 = Arrays.copyOf(this.zOrderOverridesBySlot, length);
        C7384Etj.A0U(fArrCopyOf4);
        this.zOrderOverridesBySlot = fArrCopyOf4;
        boolean[] zArrCopyOf = Arrays.copyOf(this.hasZOrderOverrideBySlot, length);
        C7384Etj.A0U(zArrCopyOf);
        this.hasZOrderOverrideBySlot = zArrCopyOf;
        int[] iArr2 = this.lastEffectiveRanksBySlot;
        int length3 = iArr2.length;
        int[] iArrA1a = AbstractC7607F5u.A1a(iArr2, length);
        this.lastEffectiveRanksBySlot = iArrA1a;
        Arrays.fill(iArrA1a, length3, length, Integer.MAX_VALUE);
        int[] iArr3 = this.lastAppliedVariantIndices;
        int length4 = iArr3.length;
        int[] iArrA1a2 = AbstractC7607F5u.A1a(iArr3, length);
        this.lastAppliedVariantIndices = iArrA1a2;
        Arrays.fill(iArrA1a2, length4, length, -1);
        this.lastOverlapKeys = AbstractC7607F5u.A1a(this.lastOverlapKeys, length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishRetirement(int i, RetiringHull retiringHull) throws Throwable {
        String str;
        SparseArray<RetiringHull> sparseArray = this.retiringHulls;
        if (sparseArray.get(i) == retiringHull) {
            if (this.realizedHulls.get(i) != retiringHull.hull) {
                sparseArray.remove(i);
                recycleThenCompleteRetirement(retiringHull, new C144801(retiringHull, this));
                return;
            }
            sparseArray.remove(i);
            String str2 = retiringHull.removedPinId;
            try {
                recycleThenCompleteRetirement(retiringHull, new C144812(i, str2));
            } finally {
                if (str2 == null && (str = this.lastAppliedPinIds.get(i)) != null) {
                    this.pendingHullAppearances.put(i, str);
                }
            }
        }
    }

    private final void forgetAppearanceIntent(int i) {
        this.pendingHullAppearances.remove(i);
        FancyPinViewRegistry fancyPinViewRegistry = this.registry;
        FancyPin fancyPinPinForSlot = fancyPinViewRegistry.pinForSlot(i);
        if (fancyPinPinForSlot != null) {
            fancyPinViewRegistry.discardAnimatedAppearance$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(fancyPinPinForSlot.id);
        }
    }

    private final boolean hasActivePinCandidate() {
        RetiringHull retiringHull;
        int size = this.realizedHulls.size();
        for (int i = 0; i < size; i++) {
            FancyPinHullView fancyPinHullViewValueAt = this.realizedHulls.valueAt(i);
            if (fancyPinHullViewValueAt.getVisibility() == 0 && ((retiringHull = this.retiringHulls.get(this.realizedHulls.keyAt(i))) == null || retiringHull.hull != fancyPinHullViewValueAt)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateAppliedFrame() {
        if (this.hasAppliedFrame) {
            this.hasAppliedFrame = false;
            FancyPinAppliedFrameListener fancyPinAppliedFrameListener = this.appliedFrameListener;
            if (fancyPinAppliedFrameListener != null) {
                fancyPinAppliedFrameListener.onAppliedFrame(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer lastAppliedVariantIndexForSlot(int i) {
        FancyPinPresentation fancyPinPresentationTypedPresentationForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin = this.registry.typedPresentationForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(i);
        if (fancyPinPresentationTypedPresentationForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin != null && this.lastAppliedPresentations.get(i) == fancyPinPresentationTypedPresentationForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin) {
            int[] iArr = this.lastAppliedVariantIndices;
            C7384Etj.A0Y(iArr, 0);
            if (i >= 0 && i < iArr.length) {
                int i2 = iArr[i];
                Integer numValueOf = Integer.valueOf(i2);
                if (i2 != -1) {
                    return numValueOf;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean lastRowOutsideViewport(int i) {
        float[] fArr = this.lastRowScreenXs;
        return i < fArr.length && isOutsideViewport(i, fArr[i], this.lastRowScreenYs[i]);
    }

    private final void markDrawingOrderDirty() {
        if (this.drawingOrderDirty) {
            return;
        }
        this.drawingOrderDirty = true;
        invalidate();
    }

    private final boolean prepareBroadphase(FancyPinRenderFrame fancyPinRenderFrame, int i, long j) throws Throwable {
        FancyPinPresentation fancyPinPresentationTypedPresentationForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin;
        int i2 = fancyPinRenderFrame.count;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = fancyPinRenderFrame.slotIndices[i3];
            if (i4 >= 0) {
                ensureSlotCapacity(i4);
                int i5 = fancyPinRenderFrame.stateFlags[i3];
                if ((i5 & 1) == 0 && (i5 & 2) == 0 && (fancyPinPresentationTypedPresentationForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin = this.registry.typedPresentationForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(i4)) != null && isOutsideBroadphase(i3, i4, fancyPinRenderFrame, fancyPinPresentationTypedPresentationForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin)) {
                    this.outsideBroadphaseGenerations[i4] = this.frameGeneration;
                    this.registry.discardAnimatedAppearance$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(fancyPinPresentationTypedPresentationForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin.pin.id);
                    FancyPinHullView fancyPinHullView = this.realizedHulls.get(i4);
                    if (fancyPinHullView == null) {
                        continue;
                    } else if (isRetiringForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(i4, fancyPinHullView) || isAppearingForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(i4, fancyPinHullView)) {
                        this.seenGeneration[i4] = this.frameGeneration;
                        if (!this.deferExistingPositionsUntilFrameCommit) {
                            float f = fancyPinRenderFrame.screenXs[i3];
                            float f2 = this.screenCoordinateScale;
                            fancyPinHullView.positionAnchorAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(f * f2, fancyPinRenderFrame.screenYs[i3] * f2);
                        }
                    } else {
                        recycleSlot(i4, true, true);
                        if (this.frameGeneration != i || this.lifecycleGeneration != j) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e A[PHI: r8
  0x005e: PHI (r8v1 boolean) = (r8v0 boolean), (r8v3 boolean) binds: [B:18:0x0056, B:20:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean prepareViewportBoundary(com.meta.maps.fancypins.FancyPinRenderFrame r12, int r13, long r14) throws java.lang.Throwable {
        /*
            r11 = this;
            android.util.SparseArray<java.lang.String> r0 = r11.pendingHullAppearances
            int r0 = r0.size()
            r10 = 0
            r4 = 1
            if (r0 > 0) goto L17
            com.meta.maps.fancypins.FancyPinViewRegistry r0 = r11.registry
            java.util.LinkedHashSet<java.lang.String> r0 = r0.pendingAnimatedAppearancePinIds
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            r9 = 0
            if (r0 == 0) goto L18
        L17:
            r9 = 1
        L18:
            int r3 = r12.count
            r2 = 0
        L1b:
            if (r2 >= r3) goto La8
            int[] r0 = r12.slotIndices
            r6 = r0[r2]
            if (r6 < 0) goto La4
            r11.ensureSlotCapacity(r6)
            float[] r0 = r12.screenXs
            r7 = r0[r2]
            float r5 = r11.screenCoordinateScale
            float r7 = r7 * r5
            float[] r0 = r12.screenYs
            r1 = r0[r2]
            float r1 = r1 * r5
            float[] r0 = r11.lastRowScreenXs
            r0[r6] = r7
            float[] r0 = r11.lastRowScreenYs
            r0[r6] = r1
            boolean r0 = r11.isOutsideViewport(r6, r7, r1)
            if (r0 == 0) goto La4
            if (r9 == 0) goto L45
            r11.forgetAppearanceIntent(r6)
        L45:
            android.util.SparseArray<com.meta.maps.fancypins.FancyPinHullView> r0 = r11.realizedHulls
            java.lang.Object r1 = r0.get(r6)
            com.meta.maps.fancypins.FancyPinHullView r1 = (com.meta.maps.fancypins.FancyPinHullView) r1
            if (r1 == 0) goto La4
            int[] r0 = r12.stateFlags
            r5 = r0[r2]
            r0 = r5 & 2
            r8 = 1
            if (r0 != 0) goto L5e
            r8 = 0
            r0 = r5 & 1
            r7 = 0
            if (r0 == 0) goto L5f
        L5e:
            r7 = 1
        L5f:
            com.meta.maps.fancypins.FancyPinOverlayView$RetiringHull r0 = X.AbstractC7608F5v.A0b(r11, r6)
            r5 = 0
            if (r0 == 0) goto L78
            com.meta.maps.fancypins.FancyPinHullView r0 = r0.hull
            if (r0 != r1) goto L78
            r11.finishRetirementOutsideViewport(r6, r1)
        L6d:
            int r0 = r11.frameGeneration
            if (r0 != r13) goto L77
            long r0 = r11.lifecycleGeneration
            int r5 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r5 == 0) goto La4
        L77:
            return r10
        L78:
            android.util.SparseArray<com.meta.maps.fancypins.FancyPinOverlayView$HullAnimation> r0 = r11.appearingHulls
            java.lang.Object r0 = r0.get(r6)
            com.meta.maps.fancypins.FancyPinOverlayView$HullAnimation r0 = (com.meta.maps.fancypins.FancyPinOverlayView.HullAnimation) r0
            if (r0 == 0) goto L8a
            com.meta.maps.fancypins.FancyPinHullView r0 = r0.hull
            if (r0 != r1) goto L8a
            r11.cancelAppearance(r6, r1, r4)
            goto L6d
        L8a:
            if (r7 == 0) goto La4
            com.meta.maps.fancypins.FancyPinViewRegistry r0 = r11.registry
            com.meta.maps.fancypins.FancyPinRetirement r1 = r0.retirementForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(r6)
            if (r8 != 0) goto L95
            r1 = r5
        L95:
            android.util.SparseArray<java.lang.String> r0 = r11.lastAppliedPinIds
            java.lang.Object r0 = r0.get(r6)
            if (r8 == 0) goto L9e
            r5 = r0
        L9e:
            java.lang.String r5 = (java.lang.String) r5
            r11.evictHiddenHullOutsideViewport(r6, r1, r5, r4)
            goto L6d
        La4:
            int r2 = r2 + 1
            goto L1b
        La8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.maps.fancypins.FancyPinOverlayView.prepareViewportBoundary(com.meta.maps.fancypins.FancyPinRenderFrame, int, long):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<FancyPinRetirement> presentRetirements(List<FancyPinRetirement> list) throws Throwable {
        checkMainThread("presentRetirements");
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(list));
        for (FancyPinRetirement fancyPinRetirement : list) {
            BV6.A1E(fancyPinRetirement, linkedHashMapA15, fancyPinRetirement.slotIndex);
        }
        int size = this.retiringHulls.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = this.retiringHulls.keyAt(i);
            RetiringHull retiringHullValueAt = this.retiringHulls.valueAt(i);
            if (retiringHullValueAt.removal != null && BV7.A0r(linkedHashMapA15, iKeyAt) != retiringHullValueAt.removal) {
                retiringHullValueAt.removal = null;
                retiringHullValueAt.removedPinId = null;
            }
        }
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        ArrayList arrayListA0h = C3cG.A0h();
        for (FancyPinRetirement fancyPinRetirement2 : list) {
            SparseArray<FancyPinHullView> sparseArray = this.realizedHulls;
            int i2 = fancyPinRetirement2.slotIndex;
            FancyPinHullView fancyPinHullView = sparseArray.get(i2);
            if (fancyPinHullView != null && C7384Etj.areEqual(this.lastAppliedPinIds.get(i2), fancyPinRetirement2.pinId)) {
                linkedHashSetA0k.add(fancyPinRetirement2);
                arrayListA0h.add(new PendingRetirement(fancyPinRetirement2.slotIndex, fancyPinHullView, fancyPinRetirement2, fancyPinRetirement2.pinId, true));
            }
        }
        retireHulls(arrayListA0h, true);
        return linkedHashSetA0k;
    }

    private final FancyPinFrameConnectionFactory productionConnectionFactory(FancyPinEngine fancyPinEngine, FancyPinDataController fancyPinDataController) {
        return new C144871(fancyPinEngine, this, fancyPinDataController);
    }

    public static /* synthetic */ FancyPinFrameConnectionFactory productionConnectionFactory$default(FancyPinOverlayView fancyPinOverlayView, FancyPinEngine fancyPinEngine, FancyPinDataController fancyPinDataController, int i, Object obj) {
        if ((i & 2) != 0) {
            fancyPinDataController = null;
        }
        return new C144871(fancyPinEngine, fancyPinOverlayView, fancyPinDataController);
    }

    private final void queueCapturedPositions(PendingPositions pendingPositions, long j) {
        pendingPositions.frameIdentity = j;
        this.pendingPositionFrames.addLast(pendingPositions);
        while (this.pendingPositionFrames.size() > 4) {
            this.recycledPositions.addLast(this.pendingPositionFrames.removeFirst());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void rebuildDrawingOrderIfNeeded(int r7) {
        /*
            r6 = this;
            boolean r0 = r6.drawingOrderDirty
            if (r0 == 0) goto L41
            r6.ensureChildOrderCapacity(r7)
            r4 = 0
            r5 = 0
        L9:
            if (r5 >= r7) goto L36
            java.util.IdentityHashMap<android.view.View, java.lang.Integer> r1 = r6.slotsByHull
            android.view.View r0 = r6.getChildAt(r5)
            java.lang.Number r0 = X.BV6.A0j(r0, r1)
            if (r0 == 0) goto L32
            int r3 = r0.intValue()
        L1b:
            int[] r0 = r6.slotsByChildIndex
            r0[r5] = r3
            double[] r2 = r6.keysByChildIndex
            if (r3 < 0) goto L2f
            double[] r1 = r6.lastDrawingKeysBySlot
            int r0 = r1.length
            if (r3 >= r0) goto L2f
            r0 = r1[r3]
        L2a:
            r2[r5] = r0
            int r5 = r5 + 1
            goto L9
        L2f:
            r0 = 0
            goto L2a
        L32:
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L1b
        L36:
            com.meta.maps.fancypins.FancyPinDrawingOrder r2 = r6.drawingOrder
            int[] r1 = r6.slotsByChildIndex
            double[] r0 = r6.keysByChildIndex
            r2.rebuild(r7, r1, r0)
            r6.drawingOrderDirty = r4
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.maps.fancypins.FancyPinOverlayView.rebuildDrawingOrderIfNeeded(int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void recycleAt$default(FancyPinOverlayView fancyPinOverlayView, int i, List list, int i2, Object obj) throws Throwable {
        if ((i2 & 2) != 0) {
            list = null;
        }
        fancyPinOverlayView.recycleAt(i, list);
    }

    public static /* synthetic */ void recycleSlot$default(FancyPinOverlayView fancyPinOverlayView, int i, boolean z, boolean z2, int i2, Object obj) throws Throwable {
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        fancyPinOverlayView.recycleSlot(i, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshActiveDrawingKeys() {
        checkMainThread("refreshActiveDrawingKeys");
        int size = this.realizedHulls.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            int iKeyAt = this.realizedHulls.keyAt(i);
            FancyPinHullView fancyPinHullViewValueAt = this.realizedHulls.valueAt(i);
            RetiringHull retiringHullA0b = AbstractC7608F5v.A0b(this, iKeyAt);
            if ((retiringHullA0b != null ? retiringHullA0b.hull : null) != fancyPinHullViewValueAt) {
                ensureSlotCapacity(iKeyAt);
                int[] iArr = this.lastEffectiveRanksBySlot;
                iArr[iKeyAt] = this.registry.effectiveRankForSlotOrDefault$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(iKeyAt, iArr[iKeyAt]);
                updateZOrderOverride(iKeyAt);
                updateDrawingKey(iKeyAt, resolvedDrawingKey(iKeyAt));
            }
            i++;
        }
        if (this.pinAccessibilityDelegate != null) {
            synchronizeAccessibilitySemantics(false);
        }
    }

    private final void rememberAppliedPresentation(int i, int i2) {
        this.lastAppliedVariantIndices[i] = i2;
        FancyPinPresentation fancyPinPresentationTypedPresentationForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin = this.registry.typedPresentationForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(i);
        SparseArray<FancyPinPresentation> sparseArray = this.lastAppliedPresentations;
        if (fancyPinPresentationTypedPresentationForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin != null) {
            sparseArray.put(i, fancyPinPresentationTypedPresentationForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin);
        } else {
            sparseArray.remove(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportResidentSlots() {
        FancyPinResidencyReporter fancyPinResidencyReporter = this.residencyReporter;
        if (fancyPinResidencyReporter != null) {
            int size = this.realizedHulls.size();
            if (this.residentSlotScratch.length < size) {
                this.residentSlotScratch = new int[size];
            }
            for (int i = 0; i < size; i++) {
                this.residentSlotScratch[i] = this.realizedHulls.keyAt(i);
            }
            if (!residentSlotsMatchReport(size)) {
                this.reportedResidentSlots = AbstractC7607F5u.A1a(this.residentSlotScratch, size);
                byte[] bArr = new byte[size * 4];
                this.residentSlotReport = bArr;
                ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder()).asIntBuffer().put(this.reportedResidentSlots);
            }
            fancyPinResidencyReporter.report(this.residentSlotReport, this.acknowledgedRenderGeneration);
        }
    }

    private final boolean residentSlotsMatchReport(int i) {
        int[] iArr = this.reportedResidentSlots;
        if (i != iArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (this.residentSlotScratch[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    private final double resolvedDrawingKey(int i) {
        float[] fArr;
        if (this.hasZOrderOverrideBySlot[i]) {
            fArr = this.zOrderOverridesBySlot;
        } else {
            int iOrdinal = this.zOrderMode.ordinal();
            if (iOrdinal == 0) {
                return 0.0d;
            }
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return i;
                }
                if (iOrdinal == 3) {
                    return -this.lastEffectiveRanksBySlot[i];
                }
                throw C3cG.A0q();
            }
            fArr = this.lastScreenYBySlot;
        }
        return fArr[i];
    }

    private final void retireHulls(List<PendingRetirement> list, boolean z) throws Throwable {
        boolean z2 = true;
        C0968AJv c0968AJv = new C0968AJv(this.realizedHulls.size() - 1, 0, -1);
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<Integer> it = c0968AJv.iterator();
        while (it.hasNext()) {
            int iA00 = ((BNt) it).A00();
            int iKeyAt = this.realizedHulls.keyAt(iA00);
            int[] iArr = this.seenGeneration;
            if (iKeyAt >= iArr.length || iArr[iKeyAt] != this.frameGeneration) {
                FancyPinHullView fancyPinHullViewValueAt = this.realizedHulls.valueAt(iA00);
                C7384Etj.A0U(fancyPinHullViewValueAt);
                arrayListA0h.add(new PendingRetirement(iKeyAt, fancyPinHullViewValueAt, null, null, false));
            }
        }
        ArrayList arrayListA0P = AbstractC0878AGe.A0P(arrayListA0h, list);
        if (arrayListA0P.isEmpty()) {
            return;
        }
        if ((arrayListA0P instanceof Collection) && arrayListA0P.isEmpty()) {
            z2 = false;
        } else {
            Iterator it2 = arrayListA0P.iterator();
            while (it2.hasNext()) {
                PendingRetirement pendingRetirement = (PendingRetirement) it2.next();
                RetiringHull retiringHull = this.retiringHulls.get(pendingRetirement.slotIndex);
                if ((retiringHull != null ? retiringHull.hull : null) != pendingRetirement.hull) {
                    break;
                }
            }
            z2 = false;
        }
        FancyPinOverlayView$retireHulls$retire$1 fancyPinOverlayView$retireHulls$retire$1 = new FancyPinOverlayView$retireHulls$retire$1(arrayListA0P, this);
        if (z && z2) {
            runAfterSupersedingActiveTransition(fancyPinOverlayView$retireHulls$retire$1);
        } else {
            fancyPinOverlayView$retireHulls$retire$1.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void runAfterSupersedingActiveTransition(kotlin.jvm.functions.Function0<kotlin.Unit> r3) throws java.lang.Throwable {
        /*
            r2 = this;
            com.meta.maps.fancypins.FancyPinOverlayView$ActiveTransitionBatch r2 = r2.activeTransitionBatch
            r1 = 0
            if (r2 == 0) goto Lb
            r0 = 1
            kotlin.jvm.functions.Function0 r0 = r2.supersede(r0)
            goto Lc
        Lb:
            r0 = r1
        Lc:
            r3.invoke()     // Catch: java.lang.Throwable -> L10
            goto L11
        L10:
            r1 = move-exception
        L11:
            if (r0 == 0) goto L16
            r0.invoke()     // Catch: java.lang.Throwable -> L19
        L16:
            if (r1 != 0) goto L1f
            return
        L19:
            r0 = move-exception
            if (r1 == 0) goto L20
            X.CU7.A01(r1, r0)
        L1f:
            throw r1
        L20:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.maps.fancypins.FancyPinOverlayView.runAfterSupersedingActiveTransition(kotlin.jvm.functions.Function0):void");
    }

    private final ActiveTransitionBatch startTransitionBatch(int i, long j) {
        FancyPinTransitionObserver fancyPinTransitionObserver;
        if (this.transitionObserver == null) {
            return null;
        }
        ActiveTransitionBatch activeTransitionBatch = this.activeTransitionBatch;
        if (activeTransitionBatch != null) {
            activeTransitionBatch.supersede(false);
        }
        if (this.frameGeneration != i || this.lifecycleGeneration != j || (fancyPinTransitionObserver = this.transitionObserver) == null) {
            return null;
        }
        long j2 = this.nextTransitionGeneration;
        long j3 = j2 != LinkEncryptedPairingKt.LINK_COUNTER_MAX ? 1 + j2 : 1L;
        this.nextTransitionGeneration = j3;
        ActiveTransitionBatch activeTransitionBatch2 = new ActiveTransitionBatch(this, j3, fancyPinTransitionObserver);
        this.activeTransitionBatch = activeTransitionBatch2;
        return activeTransitionBatch2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void synchronizeAccessibilitySemantics(boolean z) {
        AccessibilityManager accessibilityManager;
        if (this.pinAccessibilityDelegate == null || ((accessibilityManager = this.accessibilityManager) != null && accessibilityManager.isEnabled())) {
            resolveAccessibilitySemantics(z);
        } else {
            this.accessibilitySemanticsStale = true;
            updateHostAccessibilityExposure(hasActivePinCandidate());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void synchronizeStaleAccessibilitySemantics() {
        if (this.accessibilitySemanticsStale) {
            resolveAccessibilitySemantics(false);
        }
    }

    private final void updateDrawingKey(int i, double d) {
        double[] dArr = this.lastDrawingKeysBySlot;
        if (dArr[i] != d) {
            dArr[i] = d;
            markDrawingOrderDirty();
        }
    }

    private final void updateHostAccessibilityExposure(boolean z) {
        int i;
        if (z) {
            i = 1;
            setFocusable(true);
        } else {
            setFocusable(this.defaultFocusable);
            i = this.defaultImportantForAccessibility;
        }
        setImportantForAccessibility(i);
    }

    private final void updateHullAccessibilityImportance(FancyPinHullView fancyPinHullView) {
        fancyPinHullView.setImportantForAccessibility(this.pinAccessibilityDelegate == null ? 0 : 4);
    }

    private final void updateOrderingMetadata(int i, float f, boolean z) {
        this.lastScreenYBySlot[i] = f;
        if (!z) {
            int[] iArr = this.lastEffectiveRanksBySlot;
            iArr[i] = this.registry.effectiveRankForSlotOrDefault$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(i, iArr[i]);
            updateZOrderOverride(i);
        }
        updateDrawingKey(i, resolvedDrawingKey(i));
    }

    private final void updateZOrderOverride(int i) {
        Float fZOrderOverrideForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin = this.registry.zOrderOverrideForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(i);
        this.hasZOrderOverrideBySlot[i] = AnonymousClass002.A1X(fZOrderOverrideForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin);
        if (fZOrderOverrideForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin != null) {
            this.zOrderOverridesBySlot[i] = fZOrderOverrideForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin.floatValue();
        }
    }

    public final String accessibilityPinIdAtForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(float f, float f2) {
        PinAccessibilityHelper pinAccessibilityHelper = this.pinAccessibilityHelper;
        if (pinAccessibilityHelper == null || this.pinAccessibilityDelegate == null) {
            return null;
        }
        return this.accessibilityPinIdsByVirtualId.get(pinAccessibilityHelper.getVirtualViewAt(f, f2));
    }

    public final void clear() throws Throwable {
        checkMainThread("clear");
        advanceLifecycleGeneration();
        runAfterSupersedingActiveTransition(new C144791());
    }

    public final void commitPositionsForFrame(long j) {
        checkMainThread("commitPositionsForFrame");
        Iterator<PendingPositions> it = this.pendingPositionFrames.iterator();
        PendingPositions pendingPositions = null;
        while (it.hasNext()) {
            PendingPositions next = it.next();
            if (next.frameIdentity <= j) {
                pendingPositions = next;
            }
        }
        PendingPositions pendingPositions2 = pendingPositions;
        if (pendingPositions2 == null) {
            return;
        }
        commitPositions(pendingPositions2);
        while (true) {
            PendingPositions pendingPositionsPeekFirst = this.pendingPositionFrames.peekFirst();
            if (pendingPositionsPeekFirst == null || pendingPositionsPeekFirst.frameIdentity > j) {
                return;
            } else {
                this.recycledPositions.addLast(this.pendingPositionFrames.removeFirst());
            }
        }
    }

    public final void completeAllRetirementsForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        while (true) {
            SparseArray<RetiringHull> sparseArray = this.retiringHulls;
            if (sparseArray.size() <= 0) {
                return;
            } else {
                setRetirementFractionForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(sparseArray.keyAt(0), 1.0f);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final int getAccessibilityInvalidationCountForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.accessibilityInvalidationCount;
    }

    public final String getAccessibilityKeyboardFocusedPinIdForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        PinAccessibilityHelper pinAccessibilityHelper = this.pinAccessibilityHelper;
        if (pinAccessibilityHelper == null) {
            return null;
        }
        return this.accessibilityPinIdsByVirtualId.get(pinAccessibilityHelper.mKeyboardFocusedVirtualViewId);
    }

    public final boolean getHasActiveHullTransitionForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.retiringHulls.size() > 0 || this.appearingHulls.size() > 0;
    }

    public final boolean getHasActiveTransitionBatchForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return AnonymousClass002.A1X(this.activeTransitionBatch);
    }

    public final long getHullFadeDurationMillisForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return 200L;
    }

    public final int getPooledHullCount() {
        return this.pool.getCount();
    }

    public final int getRealizedHullCount() {
        SparseArray<FancyPinHullView> sparseArray = this.realizedHulls;
        int size = sparseArray.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RetiringHull retiringHullA0b = AbstractC7608F5v.A0b(this, sparseArray.keyAt(i2));
            FancyPinHullView fancyPinHullView = retiringHullA0b != null ? retiringHullA0b.hull : null;
            sparseArray = this.realizedHulls;
            if (fancyPinHullView != sparseArray.valueAt(i2)) {
                i++;
            }
        }
        return i;
    }

    public final int getResidentHullCountForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.realizedHulls.size();
    }

    public final G0U<String, Unit> getRetirementCompletionHandler$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.retirementCompletionHandler;
    }

    public final FancyPinTransitionObserver getTransitionObserver$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.transitionObserver;
    }

    public final int getTransitionRenderGenerationForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.frameGeneration;
    }

    public final FancyPinZOrderMode getZOrderMode() {
        return this.zOrderMode;
    }

    public final FancyPinHullView hullForSlot(int i) {
        RetiringHull retiringHullA0b;
        FancyPinHullView fancyPinHullView = this.realizedHulls.get(i);
        if (fancyPinHullView == null || ((retiringHullA0b = AbstractC7608F5v.A0b(this, i)) != null && retiringHullA0b.hull == fancyPinHullView)) {
            return null;
        }
        return fancyPinHullView;
    }

    public final boolean isAppearingForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        return C8j3.A1Q(this.appearingHulls.indexOfKey(i));
    }

    public final boolean isRetiringForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        return C8j3.A1Q(this.retiringHulls.indexOfKey(i));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() throws Throwable {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this.accessibilityStateListener);
        }
        try {
            this.engineController.onDetached();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            clear();
        } catch (Throwable th2) {
            if (th != null) {
                CU7.A01(th, th2);
            } else {
                th = th2;
            }
        }
        this.registry.detachOverlayObservers$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(this);
        try {
            super.onDetachedFromWindow();
            if (th != null) {
                throw th;
            }
        } catch (Throwable th3) {
            if (th == null) {
                throw th3;
            }
            CU7.A01(th, th3);
            throw th;
        }
    }

    public final String pinIdAt(float f, float f2) {
        FancyPinHullView fancyPinHullView;
        Number numberA0j;
        RetiringHull retiringHullA0b;
        checkMainThread("pinIdAt");
        rebuildDrawingOrderIfNeeded(getChildCount());
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return null;
            }
            View childAt = getChildAt(this.drawingOrder.get(childCount));
            if ((childAt instanceof FancyPinHullView) && (fancyPinHullView = (FancyPinHullView) childAt) != null && (numberA0j = BV6.A0j(fancyPinHullView, this.slotsByHull)) != null) {
                int iIntValue = numberA0j.intValue();
                if (fancyPinHullView.getVisibility() == 0 && ((retiringHullA0b = AbstractC7608F5v.A0b(this, iIntValue)) == null || retiringHullA0b.hull != fancyPinHullView)) {
                    if (this.hitTestMapper.mapToChild(this, fancyPinHullView, f, f2)) {
                        FancyPinHitTestMapper fancyPinHitTestMapper = this.hitTestMapper;
                        if (fancyPinHullView.containsVisiblePartAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(fancyPinHitTestMapper.localX, fancyPinHitTestMapper.localY, fancyPinHitTestMapper)) {
                            String str = this.lastAppliedPinIds.get(iIntValue);
                            return str == null ? fancyPinHullView.currentPinId : str;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    public final FancyPinHullView residentHullForSlotForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        return this.realizedHulls.get(i);
    }

    public final void setAppearanceFractionForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i, float f) {
        HullAnimation hullAnimation = this.appearingHulls.get(i);
        if (hullAnimation != null) {
            hullAnimation.animator.setCurrentPlayTime((long) (200.0f * ATD.A03(f, 0.0f, 1.0f)));
            ValueAnimator valueAnimator = hullAnimation.animator;
            if (f >= 1.0f) {
                valueAnimator.end();
            } else {
                valueAnimator.pause();
            }
        }
    }

    public final void setAppliedFrameListener(FancyPinAppliedFrameListener fancyPinAppliedFrameListener) {
        checkMainThread("setAppliedFrameListener");
        this.appliedFrameListener = fancyPinAppliedFrameListener;
        if (fancyPinAppliedFrameListener == null || !this.hasAppliedFrame) {
            return;
        }
        fancyPinAppliedFrameListener.onAppliedFrame(this);
    }

    public final void setPinAccessibilityDelegate(FancyPinAccessibilityDelegate fancyPinAccessibilityDelegate) {
        checkMainThread("setPinAccessibilityDelegate");
        this.pinAccessibilityDelegate = fancyPinAccessibilityDelegate;
        if (fancyPinAccessibilityDelegate != null) {
            PinAccessibilityHelper pinAccessibilityHelper = this.pinAccessibilityHelper;
            if (pinAccessibilityHelper == null) {
                pinAccessibilityHelper = new PinAccessibilityHelper();
                this.pinAccessibilityHelper = pinAccessibilityHelper;
            }
            AbstractC8060FRo.A06(this, pinAccessibilityHelper);
        }
        this.cachedAccessibilityLabels.clear();
        int size = this.realizedHulls.size();
        for (int i = 0; i < size; i++) {
            FancyPinHullView fancyPinHullViewValueAt = this.realizedHulls.valueAt(i);
            C7384Etj.A0U(fancyPinHullViewValueAt);
            updateHullAccessibilityImportance(fancyPinHullViewValueAt);
        }
        synchronizeAccessibilitySemantics(true);
        if (fancyPinAccessibilityDelegate == null) {
            AbstractC8060FRo.A06(this, null);
            setFocusable(this.defaultFocusable);
            setImportantForAccessibility(this.defaultImportantForAccessibility);
            this.pinAccessibilityHelper = null;
        }
    }

    public final void setResidencyReporterForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(FancyPinResidencyReporter fancyPinResidencyReporter) {
        this.residencyReporter = fancyPinResidencyReporter;
    }

    public final void setRetirementCompletionHandler$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(G0U<? super String, Unit> g0u) {
        this.retirementCompletionHandler = g0u;
    }

    public final void setTransitionObserver$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(FancyPinTransitionObserver fancyPinTransitionObserver) {
        this.transitionObserver = fancyPinTransitionObserver;
    }

    public final void unbindEngine() {
        checkMainThread("unbindEngine");
        try {
            this.engineController.unbind();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            clear();
        } catch (Throwable th2) {
            if (th != null) {
                CU7.A01(th, th2);
            } else {
                th = th2;
            }
        }
        this.residencyReporter = null;
        if (th != null) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean accessibilityBoundsInParent(FancyPinHullView fancyPinHullView, Rect rect) {
        rect.setEmpty();
        Iterator itA0x = BV5.A0x(fancyPinHullView.partViews);
        boolean z = false;
        while (itA0x.hasNext()) {
            View view = ((FancyPinErasedPartView) C7384Etj.A0F(itA0x)).getView();
            if (view.getVisibility() == 0 && view.getWidth() > 0 && view.getHeight() > 0) {
                this.accessibilityDescendantBounds.set(0.0f, 0.0f, AbstractC7607F5u.A02(view), AbstractC7607F5u.A03(view));
                view.getMatrix().mapRect(this.accessibilityDescendantBounds);
                this.accessibilityDescendantBounds.offset(view.getLeft() - fancyPinHullView.getScrollX(), view.getTop() - fancyPinHullView.getScrollY());
                fancyPinHullView.getMatrix().mapRect(this.accessibilityDescendantBounds);
                this.accessibilityDescendantBounds.offset(fancyPinHullView.getLeft() - getScrollX(), fancyPinHullView.getTop() - getScrollY());
                Rect rect2 = this.accessibilityRoundedBounds;
                RectF rectF = this.accessibilityDescendantBounds;
                rect2.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), C8j3.A08(rectF.right), C8j3.A08(rectF.bottom));
                Rect rect3 = this.accessibilityRoundedBounds;
                if (z) {
                    rect.union(rect3);
                } else {
                    rect.set(rect3);
                    z = true;
                }
            }
        }
        return z && !rect.isEmpty();
    }

    private final void attachHull(FancyPinHullView fancyPinHullView, int i, int i2) {
        if (fancyPinHullView.getParent() != null) {
            throw C3cG.A0Q("FancyPin hull is already attached");
        }
        C8j4.A1O(fancyPinHullView, this.slotsByHull, i);
        updateHullAccessibilityImportance(fancyPinHullView);
        addView(fancyPinHullView, i2);
        markDrawingOrderDirty();
    }

    private final <Value> Value cancelOnFailure(ActiveTransitionBatch activeTransitionBatch, Function0<? extends Value> function0) {
        try {
            return function0.invoke();
        } catch (Throwable th) {
            if (activeTransitionBatch != null) {
                try {
                    activeTransitionBatch.supersede(false);
                    throw th;
                } catch (Throwable th2) {
                    CU7.A01(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    private final void checkMainThread(String str) {
        if (!C3cH.A1K()) {
            throw BV5.A0V("FancyPinOverlayView.", str, " must run on the main thread");
        }
    }

    private final boolean isOutsideBroadphase(int i, int i2, FancyPinRenderFrame fancyPinRenderFrame, FancyPinPresentation fancyPinPresentation) {
        if (getWidth() <= 0 || getHeight() <= 0) {
            return false;
        }
        cacheExtents(i2, fancyPinPresentation);
        Float f = this.broadphaseExtents.get(i2);
        float fFloatValue = f != null ? f.floatValue() : 200.0f;
        float f2 = fancyPinRenderFrame.screenXs[i];
        float f3 = this.screenCoordinateScale;
        float f4 = f2 * f3;
        float f5 = fancyPinRenderFrame.screenYs[i] * f3;
        float f6 = -fFloatValue;
        return f4 < f6 || f4 > AbstractC7607F5u.A02(this) + fFloatValue || f5 < f6 || f5 > AbstractC7607F5u.A03(this) + fFloatValue;
    }

    private final boolean isOutsideViewport(int i, float f, float f2) {
        if (getWidth() <= 0 || getHeight() <= 0 || Float.isNaN(f) || Float.isNaN(f2)) {
            return false;
        }
        FancyPinPresentation fancyPinPresentationTypedPresentationForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin = this.registry.typedPresentationForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(i);
        if (fancyPinPresentationTypedPresentationForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin != null) {
            cacheExtents(i, fancyPinPresentationTypedPresentationForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin);
        }
        Float f3 = this.visualExtents.get(i);
        float fFloatValue = (f3 == null && (f3 = this.broadphaseExtents.get(i)) == null) ? 200.0f : f3.floatValue();
        float f4 = -fFloatValue;
        return f < f4 || f > AbstractC7607F5u.A02(this) + fFloatValue || f2 < f4 || f2 > AbstractC7607F5u.A03(this) + fFloatValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void recycleThenCompleteRetirement(com.meta.maps.fancypins.FancyPinOverlayView.RetiringHull r4, kotlin.jvm.functions.Function0<kotlin.Unit> r5) throws java.lang.Throwable {
        /*
            r3 = this;
            r5.invoke()     // Catch: java.lang.Throwable -> L4
            goto L6
        L4:
            r2 = move-exception
            goto L7
        L6:
            r2 = 0
        L7:
            if (r4 == 0) goto L10
            com.meta.maps.fancypins.FancyPinRetirement r1 = r4.removal     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = r4.removedPinId     // Catch: java.lang.Throwable -> L13
            r3.completeRemoval(r1, r0)     // Catch: java.lang.Throwable -> L13
        L10:
            if (r2 != 0) goto L19
            return
        L13:
            r0 = move-exception
            if (r2 == 0) goto L1a
            X.CU7.A01(r2, r0)
        L19:
            throw r2
        L1a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.maps.fancypins.FancyPinOverlayView.recycleThenCompleteRetirement(com.meta.maps.fancypins.FancyPinOverlayView$RetiringHull, kotlin.jvm.functions.Function0):void");
    }

    private final void resumeRetirement(int i, FancyPinHullView fancyPinHullView) {
        RetiringHull retiringHullA0b = AbstractC7608F5v.A0b(this, i);
        if ((retiringHullA0b != null ? retiringHullA0b.hull : null) == fancyPinHullView) {
            cancelRetirement(i, fancyPinHullView, true);
        }
    }

    public static /* synthetic */ void synchronizeAccessibilitySemantics$default(FancyPinOverlayView fancyPinOverlayView, boolean z, int i, Object obj) {
        fancyPinOverlayView.synchronizeAccessibilitySemantics(AnonymousClass001.A1P(i, z));
    }

    public final List<Integer> drawingSlotsForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        rebuildDrawingOrderIfNeeded(getChildCount());
        int childCount = getChildCount();
        ArrayList arrayListA11 = C60O.A11(childCount);
        for (int i = 0; i < childCount; i++) {
            Number numberA0j = BV6.A0j(getChildAt(this.drawingOrder.get(i)), this.slotsByHull);
            C60Q.A1P(arrayListA11, numberA0j != null ? numberA0j.intValue() : Integer.MAX_VALUE);
        }
        return arrayListA11;
    }

    public final List<String> getAccessibilityPinIdsInTraversalOrderForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        synchronizeStaleAccessibilitySemantics();
        ArrayList<AccessiblePin> arrayList = this.accessiblePins;
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayList);
        Iterator<AccessiblePin> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().pinId);
        }
        return arrayListA0i;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        rebuildDrawingOrderIfNeeded(i);
        return this.drawingOrder.get(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this.accessibilityStateListener);
        }
        this.registry.attachOverlayObservers$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(this, this.retirementPresenter, this.orderingObserver);
        try {
            refreshActiveDrawingKeys();
            this.engineController.onAttached();
        } catch (Throwable th) {
            this.registry.detachOverlayObservers$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(this);
            throw th;
        }
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        PinAccessibilityHelper pinAccessibilityHelper;
        super.onFocusChanged(z, i, rect);
        if (this.pinAccessibilityDelegate == null || (pinAccessibilityHelper = this.pinAccessibilityHelper) == null) {
            return;
        }
        pinAccessibilityHelper.onFocusChanged(z, i, rect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
        if (this.pinAccessibilityDelegate != null) {
            synchronizeAccessibilitySemantics(false);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            measureChild(getChildAt(i3), i, i2);
        }
        setMeasuredDimension(View.resolveSize(getSuggestedMinimumWidth(), i), View.resolveSize(getSuggestedMinimumHeight(), i2));
    }

    public final Function0<Unit> retirementCompletionForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        RetiringHull retiringHullA0b = AbstractC7608F5v.A0b(this, i);
        if (retiringHullA0b != null) {
            return new FancyPinOverlayView$retirementCompletionForTesting$1$1(this, i, retiringHullA0b);
        }
        return null;
    }

    public final void setRetirementFractionForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i, float f) {
        RetiringHull retiringHullA0b = AbstractC7608F5v.A0b(this, i);
        if (retiringHullA0b != null) {
            retiringHullA0b.animator.setCurrentPlayTime((long) (200.0f * ATD.A03(f, 0.0f, 1.0f)));
            ValueAnimator valueAnimator = retiringHullA0b.animator;
            if (f >= 1.0f) {
                valueAnimator.end();
            } else {
                valueAnimator.pause();
            }
        }
    }

    public FancyPinOverlayView(Context context, FancyPinViewRegistry fancyPinViewRegistry, float f) {
        this(context, fancyPinViewRegistry, f, null, AnonymousClass004.A1b(context, fancyPinViewRegistry));
    }

    public final void bindEngine(FancyPinEngine fancyPinEngine, FancyPinDataController fancyPinDataController) {
        AnonymousClass003.A0u(fancyPinEngine, fancyPinDataController);
        bindProductionEngine(fancyPinEngine, fancyPinDataController);
    }

    public final boolean isAppearingForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i, FancyPinHullView fancyPinHullView) {
        C7384Etj.A0Y(fancyPinHullView, 1);
        HullAnimation hullAnimation = this.appearingHulls.get(i);
        if (hullAnimation != null && hullAnimation.hull == fancyPinHullView) {
            return true;
        }
        return false;
    }

    public final boolean isRetiringForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i, FancyPinHullView fancyPinHullView) {
        C7384Etj.A0Y(fancyPinHullView, 1);
        RetiringHull retiringHullA0b = AbstractC7608F5v.A0b(this, i);
        if (retiringHullA0b != null && retiringHullA0b.hull == fancyPinHullView) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FancyPinOverlayView(Context context, FancyPinViewRegistry fancyPinViewRegistry, float f, Executor executor, boolean z) {
        super(context);
        boolean zA1a = AnonymousClass002.A1a(context, fancyPinViewRegistry);
        this.registry = fancyPinViewRegistry;
        this.screenCoordinateScale = f;
        this.frameConsumerExecutor = executor;
        this.deferExistingPositionsUntilFrameCommit = z;
        this.hullAnimationScheduler = FancyPinRealTimeHullAnimationScheduler.INSTANCE;
        this.realizedHulls = BV4.A0B();
        this.realizedReuseKeys = BV4.A0B();
        this.lastAppliedPresentations = BV4.A0B();
        this.lastAppliedPinIds = BV4.A0B();
        this.partRenderStates = BV4.A0B();
        this.retiringHulls = BV4.A0B();
        this.appearingHulls = BV4.A0B();
        this.pendingHullAppearances = BV4.A0B();
        this.broadphasePresentations = BV4.A0B();
        this.broadphaseExtents = BV4.A0B();
        this.visualExtents = BV4.A0B();
        this.slotsByHull = new IdentityHashMap<>();
        this.pool = new FancyPinHullPool();
        this.presentationEpoch = fancyPinViewRegistry.presentationEpoch;
        this.uiExecutor = new Executor() { // from class: com.meta.maps.fancypins.FancyPinOverlayView$uiExecutor$1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                if (C3cH.A1K()) {
                    runnable.run();
                } else if (!this.this$0.post(runnable)) {
                    throw new RejectedExecutionException("FancyPin overlay rejected a frame");
                }
            }
        };
        this.engineController = new FancyPinOverlayEngineController<>(FancyPinOverlayView$engineController$1.INSTANCE);
        this.reportedResidentSlots = new int[0];
        this.residentSlotScratch = new int[0];
        this.residentSlotReport = new byte[0];
        this.pendingPositionFrames = new ArrayDeque<>();
        this.recycledPositions = new ArrayDeque<>();
        this.commitUncapturedPositions = new Runnable() { // from class: com.meta.maps.fancypins.FancyPinOverlayView$commitUncapturedPositions$1
            @Override // java.lang.Runnable
            public final void run() {
                FancyPinOverlayView fancyPinOverlayView = this.this$0;
                float f2 = FancyPinOverlayView.DEFAULT_BROADPHASE_EXTENT;
                PendingPositions pendingPositions = fancyPinOverlayView.pendingPositions;
                if (pendingPositions != null) {
                    fancyPinOverlayView.pendingPositions = null;
                    fancyPinOverlayView.commitPositions(pendingPositions);
                    fancyPinOverlayView.recycledPositions.addLast(pendingPositions);
                    while (!fancyPinOverlayView.pendingPositionFrames.isEmpty()) {
                        fancyPinOverlayView.recycledPositions.addLast(fancyPinOverlayView.pendingPositionFrames.removeFirst());
                    }
                }
            }
        };
        this.retirementPresenter = new FancyPinOverlayView$retirementPresenter$1(this);
        this.orderingObserver = new FancyPinOverlayView$orderingObserver$1(this);
        this.seenGeneration = new int[64];
        this.currentFrameVariantIndices = new int[64];
        this.currentFrameVariantGenerations = new int[64];
        this.outsideBroadphaseGenerations = new int[64];
        float[] fArr = new float[64];
        for (int i = 0; i < 64; i++) {
            fArr[i] = Float.NaN;
        }
        this.lastRowScreenXs = fArr;
        float[] fArr2 = new float[64];
        int i2 = 0;
        do {
            fArr2[i2] = Float.NaN;
            i2++;
        } while (i2 < 64);
        this.lastRowScreenYs = fArr2;
        int[] iArr = new int[64];
        int i3 = 0;
        do {
            iArr[i3] = -1;
            i3++;
        } while (i3 < 64);
        this.lastAppliedVariantIndices = iArr;
        this.lastOverlapKeys = new int[64];
        this.lastScreenYBySlot = new float[64];
        int[] iArr2 = new int[64];
        int i4 = 0;
        do {
            iArr2[i4] = Integer.MAX_VALUE;
            i4++;
        } while (i4 < 64);
        this.lastEffectiveRanksBySlot = iArr2;
        this.zOrderOverridesBySlot = new float[64];
        this.hasZOrderOverrideBySlot = new boolean[64];
        this.lastDrawingKeysBySlot = new double[64];
        this.drawingOrder = new FancyPinDrawingOrder();
        this.hitTestMapper = new FancyPinHitTestMapper();
        this.defaultFocusable = isFocusable();
        this.defaultImportantForAccessibility = getImportantForAccessibility();
        this.cachedAccessibilityLabels = BV4.A0B();
        this.appliedPresentationBounds = AbstractC7607F5u.A0Y();
        this.accessibilityVirtualIdsByPinId = C3cG.A0j();
        this.accessibilityPinIdsByVirtualId = BV4.A0B();
        this.accessibilityDescendantBounds = AbstractC7607F5u.A0Y();
        this.accessibilityRoundedBounds = AbstractC7607F5u.A0X();
        this.accessiblePins = C3cG.A0h();
        this.nextAccessibilityVirtualId = zA1a ? 1 : 0;
        this.accessibilityManager = (AccessibilityManager) context.getSystemService(AccessibilityManager.class);
        this.accessibilityStateListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: com.meta.maps.fancypins.FancyPinOverlayView$accessibilityStateListener$1
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z2) {
                if (z2) {
                    FancyPinOverlayView fancyPinOverlayView = this.this$0;
                    float f2 = FancyPinOverlayView.DEFAULT_BROADPHASE_EXTENT;
                    if (fancyPinOverlayView.accessibilitySemanticsStale) {
                        fancyPinOverlayView.synchronizeAccessibilitySemantics(true);
                    }
                }
            }
        };
        this.slotsByChildIndex = new int[0];
        this.keysByChildIndex = new double[0];
        this.drawingOrderDirty = zA1a;
        this.zOrderMode = FancyPinZOrderMode.CUSTOM;
        float f2 = this.screenCoordinateScale;
        if (Math.abs(f2) <= Float.MAX_VALUE && f2 > 0.0f) {
            setClipChildren(false);
            setClipToPadding(false);
            setChildrenDrawingOrderEnabled(zA1a);
            this.registry.validatesPresentationLayouts = (context.getApplicationInfo().flags & 2) != 0;
            return;
        }
        throw C60O.A0i("screenCoordinateScale must be finite and positive");
    }

    public /* synthetic */ FancyPinOverlayView(Context context, FancyPinViewRegistry fancyPinViewRegistry, float f, Executor executor, boolean z, int i, C06H c06h) {
        this(context, fancyPinViewRegistry, (i & 4) != 0 ? 1.0f : f, (i & 8) != 0 ? null : executor, C3cG.A1K(i & 16, z));
    }

    public FancyPinOverlayView(Context context, FancyPinViewRegistry fancyPinViewRegistry, float f, Executor executor) {
        this(context, fancyPinViewRegistry, f, executor, AnonymousClass004.A1b(context, fancyPinViewRegistry));
    }
}
