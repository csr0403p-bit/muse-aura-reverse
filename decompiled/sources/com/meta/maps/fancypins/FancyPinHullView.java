package com.meta.maps.fancypins;

import X.ATD;
import X.Ab3;
import X.AbstractC0878AGe;
import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV4;
import X.BV5;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;
import X.C8j3;
import X.C9jH;
import X.G0V;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meta.maps.fancypins.FancyPinPartAnimationHint;
import com.meta.maps.fancypins.FancyPinTransitionCompletionTracker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class FancyPinHullView extends FrameLayout {
    public static final Companion Companion = new Companion();
    public static final int NO_SLOT = -1;
    public static final int NO_VARIANT = -1;
    public float anchorX;
    public float anchorY;
    public final RectF appliedPartLocalBounds;
    public int applyCount;
    public long applyGeneration;
    public PinLayout cachedBoundsLayout;
    public int cachedLayoutBottom;
    public int cachedLayoutLeft;
    public int cachedLayoutRight;
    public int cachedLayoutTop;
    public String currentBlueprintId;
    public String currentPinId;
    public int currentSlotIndex;
    public String currentVariantId;
    public int currentVariantIndex;
    public final Rect descendantDrawingBounds;
    public boolean hasAppliedPartLocalBounds;
    public boolean hasPendingPartLayoutChange;
    public boolean hasScreenAnchor;
    public final LinkedHashMap<String, Integer> lastAppliedPartIndexes;
    public final LinkedHashMap<String, FancyPinErasedPartConfiguration> lastPreparedConfigurations;
    public final float layoutScale;
    public final HashMap<View, Float> loweredPartViewZ;
    public final LinkedHashMap<String, PartLayout> partLayouts;
    public final LinkedHashMap<String, FancyPinErasedPartRegistration> partRegistrations;
    public final LinkedHashMap<String, FancyPinErasedPartView> partViews;
    public float presentationAlpha;
    public final RectF presentationLayerBounds;
    public float screenAnchorX;
    public float screenAnchorY;
    public final IdentityHashMap<View, Float> softwareBaseAlphas;
    public boolean usesSoftwarePresentationAlpha;

    public final class DisappearingPartApply {
        public final FancyPinErasedPartConfiguration configuration;
        public final String partId;
        public final FancyPinErasedPartRegistration registration;
        public final FancyPinPartState state;
        public final FancyPinErasedPartView view;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof DisappearingPartApply) {
                    DisappearingPartApply disappearingPartApply = (DisappearingPartApply) obj;
                    if (!C7384Etj.areEqual(this.partId, disappearingPartApply.partId) || !C7384Etj.areEqual(this.view, disappearingPartApply.view) || !C7384Etj.areEqual(this.registration, disappearingPartApply.registration) || !C7384Etj.areEqual(this.configuration, disappearingPartApply.configuration) || !C7384Etj.areEqual(this.state, disappearingPartApply.state)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ DisappearingPartApply copy$default(DisappearingPartApply disappearingPartApply, String str, FancyPinErasedPartView fancyPinErasedPartView, FancyPinErasedPartRegistration fancyPinErasedPartRegistration, FancyPinErasedPartConfiguration fancyPinErasedPartConfiguration, FancyPinPartState fancyPinPartState, int i, Object obj) {
            if ((i & 1) != 0) {
                str = disappearingPartApply.partId;
            }
            if ((i & 2) != 0) {
                fancyPinErasedPartView = disappearingPartApply.view;
            }
            if ((i & 4) != 0) {
                fancyPinErasedPartRegistration = disappearingPartApply.registration;
            }
            if ((i & 8) != 0) {
                fancyPinErasedPartConfiguration = disappearingPartApply.configuration;
            }
            if ((i & 16) != 0) {
                fancyPinPartState = disappearingPartApply.state;
            }
            return disappearingPartApply.copy(str, fancyPinErasedPartView, fancyPinErasedPartRegistration, fancyPinErasedPartConfiguration, fancyPinPartState);
        }

        public final String component1() {
            return this.partId;
        }

        public final FancyPinErasedPartView component2() {
            return this.view;
        }

        public final FancyPinErasedPartRegistration component3() {
            return this.registration;
        }

        public final FancyPinErasedPartConfiguration component4() {
            return this.configuration;
        }

        public final FancyPinPartState component5() {
            return this.state;
        }

        public final FancyPinErasedPartConfiguration getConfiguration() {
            return this.configuration;
        }

        public final String getPartId() {
            return this.partId;
        }

        public final FancyPinErasedPartRegistration getRegistration() {
            return this.registration;
        }

        public final FancyPinPartState getState() {
            return this.state;
        }

        public final FancyPinErasedPartView getView() {
            return this.view;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.state, AnonymousClass005.A0F(this.configuration, AnonymousClass005.A0F(this.registration, AnonymousClass005.A0F(this.view, AnonymousClass001.A0G(this.partId)))));
        }

        public String toString() {
            String str = this.partId;
            FancyPinErasedPartView fancyPinErasedPartView = this.view;
            FancyPinErasedPartRegistration fancyPinErasedPartRegistration = this.registration;
            FancyPinErasedPartConfiguration fancyPinErasedPartConfiguration = this.configuration;
            FancyPinPartState fancyPinPartState = this.state;
            StringBuilder sbA0x = C3cI.A0x("DisappearingPartApply(partId=", str);
            sbA0x.append(", view=");
            sbA0x.append(fancyPinErasedPartView);
            sbA0x.append(", registration=");
            sbA0x.append(fancyPinErasedPartRegistration);
            sbA0x.append(", configuration=");
            sbA0x.append(fancyPinErasedPartConfiguration);
            return C3cJ.A0L(fancyPinPartState, ", state=", sbA0x);
        }

        public DisappearingPartApply(String str, FancyPinErasedPartView fancyPinErasedPartView, FancyPinErasedPartRegistration fancyPinErasedPartRegistration, FancyPinErasedPartConfiguration fancyPinErasedPartConfiguration, FancyPinPartState fancyPinPartState) {
            AnonymousClass005.A17(str, fancyPinErasedPartView, fancyPinErasedPartRegistration, fancyPinErasedPartConfiguration, fancyPinPartState);
            this.partId = str;
            this.view = fancyPinErasedPartView;
            this.registration = fancyPinErasedPartRegistration;
            this.configuration = fancyPinErasedPartConfiguration;
            this.state = fancyPinPartState;
        }

        public final DisappearingPartApply copy(String str, FancyPinErasedPartView fancyPinErasedPartView, FancyPinErasedPartRegistration fancyPinErasedPartRegistration, FancyPinErasedPartConfiguration fancyPinErasedPartConfiguration, FancyPinPartState fancyPinPartState) {
            AnonymousClass005.A17(str, fancyPinErasedPartView, fancyPinErasedPartRegistration, fancyPinErasedPartConfiguration, fancyPinPartState);
            return new DisappearingPartApply(str, fancyPinErasedPartView, fancyPinErasedPartRegistration, fancyPinErasedPartConfiguration, fancyPinPartState);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FancyPinHullView(Context context) {
        this(context, null);
        C7384Etj.A0Y(context, 0);
    }

    private final void applyDisappearingParts(List<DisappearingPartApply> list, long j, G0V<? super String, ? super FancyPinPartAnimationHint, FancyPinPendingCompletion> g0v, FancyPinTransitionCompletionTracker fancyPinTransitionCompletionTracker, FancyPinPartApplyCompletion fancyPinPartApplyCompletion) {
        FancyPinDisappearCompletionTracker fancyPinDisappearCompletionTracker;
        if (fancyPinPartApplyCompletion != null) {
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            Iterator<DisappearingPartApply> it = list.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(it.next().partId);
            }
            fancyPinDisappearCompletionTracker = new FancyPinDisappearCompletionTracker(arrayListA0i, new FancyPinHullView$applyDisappearingParts$tracker$1$2(this, j), fancyPinPartApplyCompletion);
        } else {
            fancyPinDisappearCompletionTracker = null;
        }
        for (DisappearingPartApply disappearingPartApply : list) {
            FancyPinPendingCompletion fancyPinPendingCompletionBeginPart = fancyPinTransitionCompletionTracker != null ? fancyPinTransitionCompletionTracker.beginPart(FancyPinTransitionCompletionTracker.AnonymousClass1.INSTANCE) : null;
            FancyPinPendingCompletion fancyPinPendingCompletionInvoke = g0v != null ? g0v.invoke(disappearingPartApply.partId, FancyPinPartAnimationHint.Disappear.INSTANCE) : null;
            FancyPinPartApplyCompletion fancyPinPartApplyCompletionCompletionFor = fancyPinDisappearCompletionTracker != null ? fancyPinDisappearCompletionTracker.completionFor(disappearingPartApply.partId) : null;
            FancyPinErasedPartRegistration fancyPinErasedPartRegistration = disappearingPartApply.registration;
            FancyPinErasedPartView fancyPinErasedPartView = disappearingPartApply.view;
            FancyPinErasedPartConfiguration fancyPinErasedPartConfiguration = disappearingPartApply.configuration;
            FancyPinPartState fancyPinPartState = disappearingPartApply.state;
            FancyPinPartAnimationHint.Disappear disappear = FancyPinPartAnimationHint.Disappear.INSTANCE;
            FancyPinPendingCompletion fancyPinPendingCompletion = fancyPinPendingCompletionBeginPart;
            if (fancyPinPendingCompletionBeginPart == null) {
                fancyPinPendingCompletion = fancyPinPendingCompletionInvoke;
            }
            boolean zApply = fancyPinErasedPartRegistration.apply(fancyPinErasedPartView, fancyPinErasedPartConfiguration, fancyPinErasedPartConfiguration, fancyPinPartState, disappear, combineCompletions(fancyPinPartApplyCompletionCompletionFor, fancyPinPendingCompletion));
            if (this.applyGeneration != j) {
                if (fancyPinPendingCompletionBeginPart != null) {
                    fancyPinPendingCompletionBeginPart.discard();
                }
                if (fancyPinPendingCompletionInvoke != null) {
                    fancyPinPendingCompletionInvoke.discard();
                    return;
                }
                return;
            }
            if (zApply) {
                if (fancyPinPendingCompletionBeginPart != null) {
                    fancyPinPendingCompletionBeginPart.accept();
                }
                if (fancyPinPendingCompletionInvoke != null) {
                    fancyPinPendingCompletionInvoke.accept();
                }
                lowerBeneathRemainingParts(disappearingPartApply.view.getView());
            } else {
                if (fancyPinPendingCompletionBeginPart != null) {
                    fancyPinPendingCompletionBeginPart.discard();
                }
                if (fancyPinPendingCompletionInvoke != null) {
                    fancyPinPendingCompletionInvoke.discard();
                }
            }
        }
    }

    public final boolean appliedPartBoundsInParent$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(RectF rectF) {
        C7384Etj.A0Y(rectF, 0);
        if (!this.hasAppliedPartLocalBounds) {
            rectF.setEmpty();
            return false;
        }
        rectF.set(this.appliedPartLocalBounds);
        rectF.offset(this.screenAnchorX, this.screenAnchorY);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsVisiblePartAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(float f, float f2, FancyPinHitTestMapper fancyPinHitTestMapper) {
        FancyPinPartView fancyPinPartView;
        C7384Etj.A0Y(fancyPinHitTestMapper, 2);
        Iterator itA0x = BV5.A0x(this.partViews);
        while (itA0x.hasNext()) {
            View view = ((FancyPinErasedPartView) C7384Etj.A0F(itA0x)).getView();
            if (view.getVisibility() == 0 && fancyPinHitTestMapper.isPointInside(this, view, f, f2) && (!(view instanceof FancyPinPartView) || (fancyPinPartView = (FancyPinPartView) view) == null || fancyPinPartView.containsTapPoint(fancyPinHitTestMapper.localX, fancyPinHitTestMapper.localY))) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        C7384Etj.A0Y(canvas, 0);
        float f = this.presentationAlpha;
        if (f >= 1.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        if (f > 0.0f) {
            if (!canvas.isHardwareAccelerated()) {
                if (!this.usesSoftwarePresentationAlpha) {
                    this.usesSoftwarePresentationAlpha = true;
                    applySoftwarePresentationAlpha(1.0f);
                }
                super.dispatchDraw(canvas);
                return;
            }
            restoreSoftwarePartAlphas();
            this.usesSoftwarePresentationAlpha = false;
            updatePresentationLayerBounds();
            RectF rectF = this.presentationLayerBounds;
            int iSaveLayerAlpha = canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, Ab3.A02(this.presentationAlpha, 255.0f));
            try {
                super.dispatchDraw(canvas);
            } finally {
                canvas.restoreToCount(iSaveLayerAlpha);
            }
        }
    }

    public final void markApplied$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i, String str, int i2) {
        C7384Etj.A0Y(str, 1);
        this.currentSlotIndex = i;
        this.currentBlueprintId = str;
        this.currentVariantIndex = i2;
        this.applyCount++;
    }

    public final void markPartLayoutChanged() {
        this.hasPendingPartLayoutChange = true;
        forceLayout();
    }

    public final PartLayout partLayoutForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(String str) {
        C7384Etj.A0Y(str, 0);
        return this.partLayouts.get(str);
    }

    public final void setPresentationAlpha$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(float f) {
        float fA03 = ATD.A03(f, 0.0f, 1.0f);
        float f2 = this.presentationAlpha;
        if (f2 != fA03) {
            this.presentationAlpha = fA03;
            if (this.usesSoftwarePresentationAlpha || !isHardwareAccelerated()) {
                this.usesSoftwarePresentationAlpha = true;
                applySoftwarePresentationAlpha(f2);
            } else {
                restoreSoftwarePartAlphas();
            }
            invalidate();
        }
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void applyHullBounds(com.meta.maps.fancypins.PinLayout r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.maps.fancypins.FancyPinHullView.applyHullBounds(com.meta.maps.fancypins.PinLayout, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void applyParts$xplat_maps_sdk_packages_fancypins_fancypins_kotlin$default(FancyPinHullView fancyPinHullView, PinLayout pinLayout, String str, String str2, FancyPinBlueprint fancyPinBlueprint, Map map, FancyPinViewRegistry fancyPinViewRegistry, FancyPinRuntimeClusterContext fancyPinRuntimeClusterContext, Map map2, G0V g0v, G0V g0v2, G0V g0v3, FancyPinPartApplyCompletion fancyPinPartApplyCompletion, FancyPinPartApplyCompletion fancyPinPartApplyCompletion2, int i, Object obj) {
        if ((i & 64) != 0) {
            fancyPinRuntimeClusterContext = null;
        }
        if ((i & 128) != 0) {
            map2 = C9jH.A00;
        }
        if ((i & 256) != 0) {
            g0v = FancyPinHullView$applyParts$1.INSTANCE;
        }
        if ((i & 512) != 0) {
            g0v2 = FancyPinHullView$applyParts$2.INSTANCE;
        }
        if ((i & 1024) != 0) {
            g0v3 = null;
        }
        if ((i & 2048) != 0) {
            fancyPinPartApplyCompletion = null;
        }
        if ((i & 4096) != 0) {
            fancyPinPartApplyCompletion2 = null;
        }
        fancyPinHullView.applyParts$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(pinLayout, str, str2, fancyPinBlueprint, map, fancyPinViewRegistry, fancyPinRuntimeClusterContext, map2, g0v, g0v2, g0v3, fancyPinPartApplyCompletion, fancyPinPartApplyCompletion2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void applySoftwarePresentationAlpha(float r7) {
        /*
            r6 = this;
            java.util.IdentityHashMap<android.view.View, java.lang.Float> r0 = r6.softwareBaseAlphas
            java.util.Iterator r1 = X.BV5.A0y(r0)
        L6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r1.next()
            android.view.View r0 = (android.view.View) r0
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == r6) goto L6
            r1.remove()
            goto L6
        L1c:
            int r5 = r6.getChildCount()
            r4 = 0
        L21:
            if (r4 >= r5) goto L5a
            android.view.View r3 = r6.getChildAt(r4)
            java.util.IdentityHashMap<android.view.View, java.lang.Float> r0 = r6.softwareBaseAlphas
            java.lang.Number r0 = X.BV6.A0j(r3, r0)
            if (r0 == 0) goto L44
            float r2 = r0.floatValue()
            float r1 = r2 * r7
            float r0 = r3.getAlpha()
            float r1 = X.C8j3.A01(r0, r1)
            r0 = 953267991(0x38d1b717, float:1.0E-4)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L48
        L44:
            float r2 = r3.getAlpha()
        L48:
            java.util.IdentityHashMap<android.view.View, java.lang.Float> r1 = r6.softwareBaseAlphas
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r1.put(r3, r0)
            float r0 = r6.presentationAlpha
            float r2 = r2 * r0
            r3.setAlpha(r2)
            int r4 = r4 + 1
            goto L21
        L5a:
            float r1 = r6.presentationAlpha
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L65
            r6.restoreSoftwarePartAlphas()
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.maps.fancypins.FancyPinHullView.applySoftwarePresentationAlpha(float):void");
    }

    private final FancyPinPartApplyCompletion combineCompletions(final FancyPinPartApplyCompletion fancyPinPartApplyCompletion, final FancyPinPartApplyCompletion fancyPinPartApplyCompletion2) {
        return fancyPinPartApplyCompletion == null ? fancyPinPartApplyCompletion2 : fancyPinPartApplyCompletion2 == null ? fancyPinPartApplyCompletion : new FancyPinPartApplyCompletion() { // from class: com.meta.maps.fancypins.FancyPinHullView.combineCompletions.1
            @Override // com.meta.maps.fancypins.FancyPinPartApplyCompletion
            public final void onComplete() {
                fancyPinPartApplyCompletion.onComplete();
                fancyPinPartApplyCompletion2.onComplete();
            }
        };
    }

    private final void lowerBeneathRemainingParts(View view) {
        Iterator itA0x = BV5.A0x(this.partViews);
        float fMin = Float.POSITIVE_INFINITY;
        while (itA0x.hasNext()) {
            View view2 = ((FancyPinErasedPartView) C7384Etj.A0F(itA0x)).getView();
            if (view2 != view && view2.getVisibility() == 0 && !this.loweredPartViewZ.containsKey(view2)) {
                fMin = Math.min(fMin, view2.getTranslationZ());
            }
        }
        if (fMin == Float.POSITIVE_INFINITY || view.getTranslationZ() < fMin) {
            return;
        }
        this.loweredPartViewZ.putIfAbsent(view, Float.valueOf(view.getTranslationZ()));
        view.setTranslationZ(fMin - 1.0f);
    }

    private final void refreshAppliedPartLocalBounds() {
        this.appliedPartLocalBounds.setEmpty();
        boolean z = false;
        this.hasAppliedPartLocalBounds = false;
        Iterator itA0x = BV5.A0x(this.partLayouts);
        while (itA0x.hasNext()) {
            PartLayout partLayout = (PartLayout) C7384Etj.A0F(itA0x);
            LayoutRect layoutRect = partLayout.rect;
            if (partLayout.alpha > 0.0d) {
                double d = layoutRect.x;
                if (Math.abs(d) <= Double.MAX_VALUE) {
                    double d2 = layoutRect.y;
                    if (Math.abs(d2) <= Double.MAX_VALUE) {
                        double d3 = layoutRect.width;
                        if (Math.abs(d3) <= Double.MAX_VALUE) {
                            double d4 = layoutRect.height;
                            if (Math.abs(d4) <= Double.MAX_VALUE && d3 > 0.0d && d4 > 0.0d) {
                                double d5 = this.layoutScale;
                                float f = (float) (d * d5);
                                float f2 = (float) (d2 * d5);
                                float f3 = ((float) (d3 * d5)) + f;
                                float f4 = ((float) (d4 * d5)) + f2;
                                boolean z2 = this.hasAppliedPartLocalBounds;
                                RectF rectF = this.appliedPartLocalBounds;
                                if (z2) {
                                    rectF.union(f, f2, f3, f4);
                                } else {
                                    rectF.set(f, f2, f3, f4);
                                    this.hasAppliedPartLocalBounds = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (this.hasAppliedPartLocalBounds && !this.appliedPartLocalBounds.isEmpty()) {
            z = true;
        }
        this.hasAppliedPartLocalBounds = z;
    }

    private final FancyPinPartApplyContext resolvedApplyContext(FancyPinPart fancyPinPart, PartLayout partLayout, FancyPinPartApplyContext fancyPinPartApplyContext, FancyPinRuntimeClusterContext fancyPinRuntimeClusterContext) {
        List<FancyPinPlacement> list;
        FancyPinPlacement fancyPinPlacement;
        return new FancyPinPartApplyContext(fancyPinPartApplyContext.occlusion, (fancyPinPart == null || (list = fancyPinPart.placements) == null || (fancyPinPlacement = (FancyPinPlacement) AbstractC0878AGe.A0A(partLayout.placementIndex, list)) == null) ? null : new FancyPinResolvedPlacement(partLayout.placementIndex, fancyPinPlacement.anchor, fancyPinPlacement.key), fancyPinRuntimeClusterContext);
    }

    private final void restoreSoftwarePartAlphas() {
        Iterator itA0i = C3cG.A0i(this.softwareBaseAlphas);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            View view = (View) entryA0l.getKey();
            Number number = (Number) entryA0l.getValue();
            C7384Etj.A0X(number);
            view.setAlpha(number.floatValue());
        }
        this.softwareBaseAlphas.clear();
        this.usesSoftwarePresentationAlpha = false;
    }

    private final void unionDescendantDrawingBounds(View view) {
        view.getDrawingRect(this.descendantDrawingBounds);
        offsetDescendantRectToMyCoords(view, this.descendantDrawingBounds);
        int i = -C8j3.A08(Math.max(0.0f, view.getElevation() + view.getTranslationZ()) * 2.0f);
        this.descendantDrawingBounds.inset(i, i);
        RectF rectF = this.presentationLayerBounds;
        Rect rect = this.descendantDrawingBounds;
        rectF.union(rect.left, rect.top, rect.right, rect.bottom);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                C7384Etj.A0U(childAt);
                unionDescendantDrawingBounds(childAt);
            }
        }
    }

    private final void updatePresentationLayerBounds() {
        this.presentationLayerBounds.set(getScrollX(), getScrollY(), getScrollX() + getWidth(), getScrollY() + getHeight());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C7384Etj.A0U(childAt);
            unionDescendantDrawingBounds(childAt);
        }
    }

    public final float getAnchorX() {
        return this.anchorX;
    }

    public final float getAnchorY() {
        return this.anchorY;
    }

    public final int getApplyCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.applyCount;
    }

    public final String getCurrentBlueprintId$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.currentBlueprintId;
    }

    public final String getCurrentPinId$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.currentPinId;
    }

    public final int getCurrentSlotIndex$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.currentSlotIndex;
    }

    public final String getCurrentVariantId$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.currentVariantId;
    }

    public final int getCurrentVariantIndex$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.currentVariantIndex;
    }

    public final LinkedHashMap<String, FancyPinErasedPartView> getPartViews$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.partViews;
    }

    public final float getPresentationAlpha$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.presentationAlpha;
    }

    public final Set<String> getVisiblePartIds$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return AbstractC0878AGe.A0g(AbstractC7608F5v.A17(this.partLayouts));
    }

    public final void positionAnchorAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(float f, float f2) {
        this.screenAnchorX = f;
        this.screenAnchorY = f2;
        this.hasScreenAnchor = true;
        setTranslationX(f - this.anchorX);
        setTranslationY(f2 - this.anchorY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void prepareForReuse() {
        checkMainThread("prepareForReuse");
        this.applyGeneration++;
        animate().cancel();
        clearAnimation();
        setAlpha(1.0f);
        setPresentationAlpha$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(1.0f);
        setScaleX(1.0f);
        setScaleY(1.0f);
        setRotation(0.0f);
        setRotationX(0.0f);
        setRotationY(0.0f);
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        setTranslationZ(0.0f);
        this.screenAnchorX = 0.0f;
        this.screenAnchorY = 0.0f;
        this.hasScreenAnchor = false;
        this.hasPendingPartLayoutChange = false;
        setVisibility(4);
        this.currentSlotIndex = -1;
        this.currentBlueprintId = null;
        this.currentVariantIndex = -1;
        this.currentVariantId = null;
        this.currentPinId = null;
        this.partLayouts.clear();
        this.appliedPartLocalBounds.setEmpty();
        this.hasAppliedPartLocalBounds = false;
        this.lastPreparedConfigurations.clear();
        this.lastAppliedPartIndexes.clear();
        this.loweredPartViewZ.clear();
        this.cachedBoundsLayout = null;
        this.applyCount = 0;
        Iterator itA0i = C3cG.A0i(this.partViews);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            Object key = entryA0l.getKey();
            FancyPinErasedPartView fancyPinErasedPartView = (FancyPinErasedPartView) entryA0l.getValue();
            FancyPinErasedPartRegistration fancyPinErasedPartRegistration = this.partRegistrations.get(key);
            if (fancyPinErasedPartRegistration != null) {
                fancyPinErasedPartRegistration.prepareForReuse(fancyPinErasedPartView);
            }
        }
        Collection<FancyPinErasedPartView> collectionValues = this.partViews.values();
        C7384Etj.A0U(collectionValues);
        HashSet hashSetA13 = C60O.A13();
        Iterator<FancyPinErasedPartView> it = collectionValues.iterator();
        while (it.hasNext()) {
            hashSetA13.add(it.next().getView());
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (!hashSetA13.contains(childAt) && (childAt instanceof FancyPinReusableView)) {
                ((FancyPinReusableView) childAt).prepareForReuse();
            }
            childAt.animate().cancel();
            childAt.clearAnimation();
            childAt.setAlpha(1.0f);
            childAt.setScaleX(1.0f);
            childAt.setScaleY(1.0f);
            childAt.setRotation(0.0f);
            childAt.setRotationX(0.0f);
            childAt.setRotationY(0.0f);
            childAt.setTranslationX(0.0f);
            childAt.setTranslationY(0.0f);
            childAt.setTranslationZ(0.0f);
            childAt.setVisibility(4);
        }
    }

    public final void refreshPresentationAlpha$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        if (this.usesSoftwarePresentationAlpha || !isHardwareAccelerated()) {
            float f = this.presentationAlpha;
            if (f < 1.0f) {
                applySoftwarePresentationAlpha(f);
            }
        }
    }

    public final void setAnchorPoint(float f, float f2) {
        this.anchorX = f;
        this.anchorY = f2;
        if (this.hasScreenAnchor) {
            positionAnchorAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(this.screenAnchorX, this.screenAnchorY);
        }
    }

    public final void setApplyCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        this.applyCount = i;
    }

    public final void setCurrentBlueprintId$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(String str) {
        this.currentBlueprintId = str;
    }

    public final void setCurrentSlotIndex$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        this.currentSlotIndex = i;
    }

    public final void setCurrentVariantIndex$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        this.currentVariantIndex = i;
    }

    private final void checkMainThread(String str) {
        if (!C3cH.A1K()) {
            throw BV5.A0V("FancyPinHullView.", str, " must run on the main thread");
        }
    }

    public final RectF getPresentationLayerBoundsForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        updatePresentationLayerBounds();
        return new RectF(this.presentationLayerBounds);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f3, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Type inference failed for: r42v0, types: [android.view.View, android.view.ViewGroup, com.meta.maps.fancypins.FancyPinHullView] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void applyParts$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(com.meta.maps.fancypins.PinLayout r43, java.lang.String r44, java.lang.String r45, com.meta.maps.fancypins.FancyPinBlueprint r46, java.util.Map<java.lang.String, ? extends java.lang.Object> r47, com.meta.maps.fancypins.FancyPinViewRegistry r48, com.meta.maps.fancypins.FancyPinRuntimeClusterContext r49, java.util.Map<java.lang.String, ? extends com.meta.maps.fancypins.FancyPinErasedPartConfiguration> r50, X.G0V<? super java.lang.String, ? super java.lang.Integer, ? extends com.meta.maps.fancypins.FancyPinPartAnimationHint> r51, X.G0V<? super java.lang.String, ? super java.lang.Integer, com.meta.maps.fancypins.FancyPinPartApplyContext> r52, X.G0V<? super java.lang.String, ? super com.meta.maps.fancypins.FancyPinPartAnimationHint, com.meta.maps.fancypins.FancyPinPendingCompletion> r53, com.meta.maps.fancypins.FancyPinPartApplyCompletion r54, com.meta.maps.fancypins.FancyPinPartApplyCompletion r55) {
        /*
            Method dump skipped, instructions count: 965
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.maps.fancypins.FancyPinHullView.applyParts$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(com.meta.maps.fancypins.PinLayout, java.lang.String, java.lang.String, com.meta.maps.fancypins.FancyPinBlueprint, java.util.Map, com.meta.maps.fancypins.FancyPinViewRegistry, com.meta.maps.fancypins.FancyPinRuntimeClusterContext, java.util.Map, X.G0V, X.G0V, X.G0V, com.meta.maps.fancypins.FancyPinPartApplyCompletion, com.meta.maps.fancypins.FancyPinPartApplyCompletion):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FancyPinHullView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C7384Etj.A0Y(context, 0);
        this.partViews = C3cG.A0j();
        this.partLayouts = C3cG.A0j();
        this.partRegistrations = C3cG.A0j();
        this.lastPreparedConfigurations = C3cG.A0j();
        this.lastAppliedPartIndexes = C3cG.A0j();
        this.loweredPartViewZ = BV4.A0u();
        this.presentationLayerBounds = AbstractC7607F5u.A0Y();
        this.appliedPartLocalBounds = AbstractC7607F5u.A0Y();
        this.descendantDrawingBounds = AbstractC7607F5u.A0X();
        this.softwareBaseAlphas = new IdentityHashMap<>();
        this.layoutScale = AbstractC7609F5w.A0S(this).density;
        this.currentSlotIndex = -1;
        this.currentVariantIndex = -1;
        this.presentationAlpha = 1.0f;
        setClipChildren(false);
        setClipToPadding(false);
        setVisibility(4);
    }

    public /* synthetic */ FancyPinHullView(Context context, AttributeSet attributeSet, int i, C06H c06h) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
