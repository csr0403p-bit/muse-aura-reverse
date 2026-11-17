package com.facebook.aura.maps;

import X.AFR;
import X.AL9;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.C1BN;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C7438Evz;
import X.C9286GCn;
import X.C9n4;
import X.G0U;
import X.HnJ;
import X.I0V;
import android.graphics.PointF;
import android.util.SizeF;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache;
import com.facebook.aura.maps.model.HatchMapCoordinate;
import com.facebook.aura.maps.model.HatchMapElement;
import com.facebook.aura.maps.model.HatchMapScene;
import com.facebook.aura.maps.scene.HatchMapCameraDerivation;
import com.facebook.aura.maps.scene.HatchMapCameraTarget;
import com.facebook.aura.maps.scene.HatchMapContentKt;
import com.facebook.aura.maps.scene.HatchMapSceneIndex;
import com.facebook.aura.maps.scene.HatchMapTheme;
import com.meta.maps.core.GeoCoordinates;
import com.meta.maps.display.AnimationTween;
import com.meta.maps.display.FeatureInteraction;
import com.meta.maps.display.FeatureInteractionCallback;
import com.meta.maps.display.FeatureInteractionData;
import com.meta.maps.display.GeoJsonMapContent;
import com.meta.maps.display.SDKInsets;
import com.meta.maps.display.SelectedFeature;
import com.meta.maps.display.SelectionChangedCallback;
import com.meta.maps.display.SelectionController;
import com.meta.maps.display.camera.CameraAnimationPlugin;
import com.meta.maps.display.camera.CameraBounds;
import com.meta.maps.display.camera.CameraFraming;
import com.meta.maps.display.camera.CameraPose;
import com.meta.maps.display.camera.CameraReveal;
import com.meta.maps.display.camera.CameraTransition;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchMapAgenticSceneFlow implements HatchMapNavigationFlow {
    public static final int $stable = 8;
    public final HatchMapAgenticSceneFlowCache cache;
    public Object callbackOwner;
    public SDKInsets cameraInsets;
    public HatchMapDisplayMode displayMode;
    public C9n4 framedSession;
    public boolean hasEntered;
    public HatchMapMarkerImageProvider imageProvider;
    public final HatchMapCameraTarget.Point initialCamera;
    public boolean isDarkMode;
    public boolean isVisible;
    public HatchMapMarkerRenderer markerRenderer;
    public final BLG<HatchMapAgenticScenePresentation> mutablePresentation;
    public final HatchMapNavigationController navigationController;
    public G0U<? super String, Unit> onExpand;
    public G0U<? super String, Unit> onMarkerTapped;
    public G0U<? super String, Unit> onPlaceDetailsRequested;
    public G0U<? super String, Unit> onSelectedArtifactIdChanged;
    public GeoJsonMapContent pinContent;
    public final C1BN<HatchMapFlowPresentation> presentation;
    public final HatchMapScene scene;
    public final HatchMapSceneIndex sceneIndex;
    public final AtomicLong selectionCallbackGeneration;
    public SelectionChangedCallback selectionChangedCallback;
    public C9n4 session;
    public final HatchMapTheme theme;

    /* renamed from: com.facebook.aura.maps.HatchMapAgenticSceneFlow$presentation$1, reason: invalid class name and case insensitive filesystem */
    public final class C126701 extends AbstractC7559F3s implements G0U<String, Unit> {
        public C126701() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            G0U<? super String, Unit> g0u = HatchMapAgenticSceneFlow.this.onExpand;
            if (g0u != null) {
                g0u.invoke(str);
            }
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchMapAgenticSceneFlow$presentation$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<String, Unit> {
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C7384Etj.A0Y(str, 0);
            G0U<? super String, Unit> g0u = HatchMapAgenticSceneFlow.this.onPlaceDetailsRequested;
            if (g0u != null) {
                g0u.invoke(str);
            }
        }

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchMapAgenticSceneFlow$presentation$3, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass3 extends C7438Evz implements G0U<String, Unit> {
        public AnonymousClass3(Object obj) {
            super(1, obj, HatchMapAgenticSceneFlow.class, "onCarouselPageChanged", "onCarouselPageChanged(Ljava/lang/String;)V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            ((HatchMapAgenticSceneFlow) AnonymousClass006.A0o(str, this)).selectArtifactFromCarousel(str);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchMapAgenticSceneFlow$scheduleCameraFit$1, reason: invalid class name and case insensitive filesystem */
    public final class C126711 extends AbstractC7559F3s implements Function0<Unit> {
        public C126711() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HatchMapAgenticSceneFlow hatchMapAgenticSceneFlow = HatchMapAgenticSceneFlow.this;
            if (hatchMapAgenticSceneFlow.isVisible) {
                hatchMapAgenticSceneFlow.applyInitialCamera();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyInitialCamera() {
        C9n4 c9n4 = this.session;
        if (c9n4 != null) {
            if (this.displayMode == HatchMapDisplayMode.FULLSCREEN && this.framedSession == c9n4) {
                return;
            }
            this.framedSession = c9n4;
            SizeF selectedMarkerSize = this.markerRenderer.getSelectedMarkerSize();
            HatchMapCameraTarget hatchMapCameraTargetCamera = HatchMapCameraDerivation.INSTANCE.camera(this.scene);
            if (hatchMapCameraTargetCamera instanceof HatchMapCameraTarget.Bounds) {
                SDKInsets sDKInsets = new SDKInsets(selectedMarkerSize.getWidth() / 2.0d, selectedMarkerSize.getHeight(), selectedMarkerSize.getWidth() / 2.0d, selectedMarkerSize.getHeight() / (this.displayMode == HatchMapDisplayMode.INLINE ? 4 : 2));
                CameraAnimationPlugin cameraAnimationPluginA01 = c9n4.A01();
                CameraBounds cameraBounds = new CameraBounds(((HatchMapCameraTarget.Bounds) hatchMapCameraTargetCamera).bounds);
                cameraBounds.padding = sDKInsets;
                cameraAnimationPluginA01.fitCameraTo(cameraBounds);
                return;
            }
            if (!(hatchMapCameraTargetCamera instanceof HatchMapCameraTarget.Point)) {
                if (hatchMapCameraTargetCamera != null) {
                    throw C3cG.A0q();
                }
                return;
            }
            CameraPose cameraPose = new CameraPose();
            HatchMapCameraTarget.Point point = (HatchMapCameraTarget.Point) hatchMapCameraTargetCamera;
            HatchMapCoordinate hatchMapCoordinate = point.coordinate;
            cameraPose.center = new GeoCoordinates(hatchMapCoordinate.latitude, hatchMapCoordinate.longitude);
            cameraPose.zoomLevel = Double.valueOf(point.zoom);
            cameraPose.framing = CameraFraming.VISIBLE_VIEWPORT;
            c9n4.A01().moveCameraTo(cameraPose, CameraTransition.instant());
        }
    }

    public final void acquireHostCallbacks(Object obj, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, G0U<? super String, Unit> g0u4) {
        C7384Etj.A0Y(obj, 0);
        this.callbackOwner = obj;
        this.onSelectedArtifactIdChanged = g0u;
        this.onMarkerTapped = g0u4;
        setPresentationCallbacks(g0u2, g0u3);
    }

    @Override // com.facebook.aura.maps.HatchMapNavigationFlow
    public void appear() {
        this.isVisible = true;
        installMapContentIfNeeded();
        scheduleCameraFit();
    }

    public final void clearSelection() {
        SelectionController selectionController;
        updateSelection(null, false);
        C9n4 c9n4 = this.session;
        if (c9n4 == null || (selectionController = c9n4.A00().getSelectionController()) == null) {
            return;
        }
        selectionController.clearSelection();
    }

    @Override // com.facebook.aura.maps.HatchMapNavigationFlow
    public void disappear() {
        this.isVisible = false;
        releaseMapContent();
    }

    @Override // com.facebook.aura.maps.HatchMapNavigationFlow
    public void enter() {
        this.hasEntered = true;
        this.cache.startDetailsResolution();
    }

    @Override // com.facebook.aura.maps.HatchMapNavigationFlow
    public void exit() {
        this.hasEntered = false;
        this.isVisible = false;
        releaseMapContent();
    }

    public final void onCarouselPageChanged(String str) {
        C7384Etj.A0Y(str, 0);
        selectArtifactFromCarousel(str);
    }

    @Override // com.facebook.aura.maps.HatchMapNavigationFlow
    public void reappear() {
        this.isVisible = true;
        installMapContentIfNeeded();
        scheduleCameraFit();
    }

    public final void releaseHostCallbacks(Object obj) {
        C7384Etj.A0Y(obj, 0);
        if (this.callbackOwner == obj) {
            this.callbackOwner = null;
            this.onSelectedArtifactIdChanged = null;
            this.onMarkerTapped = null;
            setPresentationCallbacks(null, null);
        }
    }

    public final void selectArtifact(String str) {
        SelectionController selectionController;
        C7384Etj.A0Y(str, 0);
        updateSelection(str, false);
        C9n4 c9n4 = this.session;
        if (c9n4 == null || (selectionController = c9n4.A00().getSelectionController()) == null) {
            return;
        }
        selectionController.selectById(str);
    }

    public final void selectArtifactFromCarousel(String str) {
        HatchMapElement next;
        HatchMapCoordinate coordinate;
        SelectionController selectionController;
        C7384Etj.A0Y(str, 0);
        if (!str.equals(this.mutablePresentation.getValue().selectedArtifactId)) {
            updateSelection(str, true);
            C9n4 c9n4 = this.session;
            if (c9n4 != null && (selectionController = c9n4.A00().getSelectionController()) != null) {
                selectionController.selectById(str);
            }
        }
        if (this.displayMode == HatchMapDisplayMode.FULLSCREEN) {
            Iterator<HatchMapElement> it = this.scene.elements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (str.equals(next.getArtifactId())) {
                        break;
                    }
                }
            }
            HatchMapElement hatchMapElement = next;
            if (hatchMapElement == null || (coordinate = hatchMapElement.getCoordinate()) == null) {
                return;
            }
            reveal(new GeoCoordinates(coordinate.latitude, coordinate.longitude));
        }
    }

    private final void installMapContentIfNeeded() {
        final C9n4 c9n4;
        if (this.hasEntered && this.isVisible && this.session == null && (c9n4 = this.navigationController.session) != null) {
            final GeoJsonMapContent geoJsonMapContent = new GeoJsonMapContent(HatchMapContentKt.HATCH_MAP_PIN_LAYER_ID, HatchMapContentKt.toGeoJsonObject(this.scene), pinLayerDefinition(this.isDarkMode));
            geoJsonMapContent.setFeatureInteractionCallback(new FeatureInteractionCallback() { // from class: com.facebook.aura.maps.HatchMapAgenticSceneFlow.installMapContentIfNeeded.1

                /* renamed from: com.facebook.aura.maps.HatchMapAgenticSceneFlow$installMapContentIfNeeded$1$1, reason: invalid class name and collision with other inner class name */
                public final class C02371 extends AbstractC7559F3s implements Function0<Unit> {
                    public final /* synthetic */ String $artifactId;
                    public final /* synthetic */ GeoJsonMapContent $content;
                    public final /* synthetic */ C9n4 $session;
                    public final /* synthetic */ HatchMapAgenticSceneFlow this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C02371(HatchMapAgenticSceneFlow hatchMapAgenticSceneFlow, C9n4 c9n4, GeoJsonMapContent geoJsonMapContent, String str) {
                        super(0);
                        this.this$0 = hatchMapAgenticSceneFlow;
                        this.$session = c9n4;
                        this.$content = geoJsonMapContent;
                        this.$artifactId = str;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        HatchMapAgenticSceneFlow hatchMapAgenticSceneFlow = this.this$0;
                        if (hatchMapAgenticSceneFlow.session == this.$session && hatchMapAgenticSceneFlow.pinContent == this.$content) {
                            if (hatchMapAgenticSceneFlow.displayMode == HatchMapDisplayMode.FULLSCREEN) {
                                hatchMapAgenticSceneFlow.updateSelection(this.$artifactId, true);
                                G0U<? super String, Unit> g0u = this.this$0.onPlaceDetailsRequested;
                                if (g0u != null) {
                                    g0u.invoke(this.$artifactId);
                                }
                            }
                            G0U<? super String, Unit> g0u2 = this.this$0.onMarkerTapped;
                            if (g0u2 != null) {
                                g0u2.invoke(this.$artifactId);
                            }
                        }
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }

                @Override // com.meta.maps.display.FeatureInteractionCallback
                public final boolean apply(FeatureInteraction featureInteraction) {
                    FeatureInteractionData featureInteractionData;
                    C7384Etj.A0Y(featureInteraction, 0);
                    HatchMapAgenticSceneFlow hatchMapAgenticSceneFlow = HatchMapAgenticSceneFlow.this;
                    if (hatchMapAgenticSceneFlow.session != c9n4 || hatchMapAgenticSceneFlow.pinContent != geoJsonMapContent || (featureInteractionData = featureInteraction.feature) == null || hatchMapAgenticSceneFlow.sceneIndex.element(featureInteractionData.featureId) == null) {
                        return false;
                    }
                    String str = featureInteractionData.featureId;
                    HatchMapAgenticSceneFlow hatchMapAgenticSceneFlow2 = HatchMapAgenticSceneFlow.this;
                    if (hatchMapAgenticSceneFlow2.displayMode == HatchMapDisplayMode.FULLSCREEN) {
                        hatchMapAgenticSceneFlow2.reveal(featureInteraction.position);
                    }
                    c9n4.A00().getSelectionController().select(featureInteractionData, geoJsonMapContent.getIdentifier(), featureInteraction.position);
                    HatchMapAgenticSceneFlow hatchMapAgenticSceneFlow3 = HatchMapAgenticSceneFlow.this;
                    hatchMapAgenticSceneFlow3.runOnMain(new C02371(hatchMapAgenticSceneFlow3, c9n4, geoJsonMapContent, str));
                    return true;
                }
            }, false);
            this.session = c9n4;
            c9n4.A01().setMapContentInset(this.cameraInsets);
            c9n4.A01().setMapContentPadding(new SDKInsets());
            this.pinContent = geoJsonMapContent;
            HatchMapMarkerImageProvider hatchMapMarkerImageProvider = new HatchMapMarkerImageProvider(this.cache.placeImageProvider);
            this.imageProvider = hatchMapMarkerImageProvider;
            c9n4.A00().addImageProvider(hatchMapMarkerImageProvider);
            c9n4.A00().addMapContent(geoJsonMapContent);
            SelectionController selectionController = c9n4.A00().getSelectionController();
            final SelectionChangedCallback[] selectionChangedCallbackArr = {selectionChangedCallback};
            SelectionChangedCallback selectionChangedCallback = new SelectionChangedCallback() { // from class: com.facebook.aura.maps.HatchMapAgenticSceneFlow$installMapContentIfNeeded$newCallback$1

                /* renamed from: com.facebook.aura.maps.HatchMapAgenticSceneFlow$installMapContentIfNeeded$newCallback$1$1, reason: invalid class name */
                public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
                    public final /* synthetic */ String $artifactId;
                    public final /* synthetic */ SelectionChangedCallback[] $callbackSlot;
                    public final /* synthetic */ long $generation;
                    public final /* synthetic */ C9n4 $session;
                    public final /* synthetic */ HatchMapAgenticSceneFlow this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(long j, HatchMapAgenticSceneFlow hatchMapAgenticSceneFlow, C9n4 c9n4, SelectionChangedCallback[] selectionChangedCallbackArr, String str) {
                        super(0);
                        this.$generation = j;
                        this.this$0 = hatchMapAgenticSceneFlow;
                        this.$session = c9n4;
                        this.$callbackSlot = selectionChangedCallbackArr;
                        this.$artifactId = str;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (this.$generation == this.this$0.selectionCallbackGeneration.get()) {
                            HatchMapAgenticSceneFlow hatchMapAgenticSceneFlow = this.this$0;
                            if (hatchMapAgenticSceneFlow.session == this.$session && hatchMapAgenticSceneFlow.selectionChangedCallback == this.$callbackSlot[0]) {
                                hatchMapAgenticSceneFlow.updateSelection(this.$artifactId, true);
                            }
                        }
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }

                @Override // com.meta.maps.display.SelectionChangedCallback
                public final void apply(SelectedFeature selectedFeature, SelectedFeature selectedFeature2) {
                    FeatureInteractionData featureInteractionData;
                    String str = (selectedFeature2 == null || (featureInteractionData = selectedFeature2.feature) == null) ? null : featureInteractionData.featureId;
                    long jIncrementAndGet = this.this$0.selectionCallbackGeneration.incrementAndGet();
                    HatchMapAgenticSceneFlow hatchMapAgenticSceneFlow = this.this$0;
                    hatchMapAgenticSceneFlow.runOnMain(new AnonymousClass1(jIncrementAndGet, hatchMapAgenticSceneFlow, c9n4, selectionChangedCallbackArr, str));
                }
            };
            this.selectionChangedCallback = selectionChangedCallback;
            selectionController.addSelectionChangedCallback(selectionChangedCallback);
            String str = this.mutablePresentation.getValue().selectedArtifactId;
            if (str != null) {
                selectionController.selectById(str);
            }
        }
    }

    private final String pinLayerDefinition(boolean z) {
        PointF pointFIconOffset = this.markerRenderer.iconOffset(false, z);
        PointF pointFIconOffset2 = this.markerRenderer.iconOffset(true, z);
        return HatchMapContentKt.pinLayerDefinition(this.theme, z, AnonymousClass002.A1Z(this.displayMode, HatchMapDisplayMode.FULLSCREEN), pointFIconOffset.x, pointFIconOffset.y, pointFIconOffset2.x, pointFIconOffset2.y);
    }

    private final HatchMapAgenticScenePresentation presentation(String str) {
        return new HatchMapAgenticScenePresentation(this.scene, this.cache, this.displayMode, str, this.onExpand == null ? null : new C126701(), this.onPlaceDetailsRequested != null ? new AnonymousClass2() : null, new AnonymousClass3(this));
    }

    private final void releaseMapContent() {
        C9n4 c9n4 = this.session;
        SelectionChangedCallback selectionChangedCallback = this.selectionChangedCallback;
        if (c9n4 != null && selectionChangedCallback != null) {
            c9n4.A00().getSelectionController().removeSelectionChangedCallback(selectionChangedCallback);
        }
        GeoJsonMapContent geoJsonMapContent = this.pinContent;
        if (geoJsonMapContent != null) {
            geoJsonMapContent.setFeatureInteractionCallback(null, false);
        }
        if (c9n4 != null && geoJsonMapContent != null) {
            c9n4.A00().removeMapContent(geoJsonMapContent);
        }
        HatchMapMarkerImageProvider hatchMapMarkerImageProvider = this.imageProvider;
        if (c9n4 != null) {
            if (hatchMapMarkerImageProvider != null) {
                c9n4.A00().removeImageProvider(hatchMapMarkerImageProvider);
                hatchMapMarkerImageProvider.close();
            }
        } else if (hatchMapMarkerImageProvider != null) {
            hatchMapMarkerImageProvider.close();
        }
        this.session = null;
        this.pinContent = null;
        this.imageProvider = null;
        this.selectionChangedCallback = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reveal(GeoCoordinates geoCoordinates) {
        C9n4 c9n4 = this.session;
        if (c9n4 != null) {
            CameraReveal cameraReveal = new CameraReveal(geoCoordinates);
            cameraReveal.padding = new SDKInsets(64.0d, 32.0d, 64.0d, 32.0d);
            cameraReveal.framing = CameraFraming.VISIBLE_VIEWPORT;
            c9n4.A01().revealCoordinate(cameraReveal, CameraTransition.tween(new AnimationTween()));
        }
    }

    private final void scheduleCameraFit() {
        AFR afr = this.navigationController.retainedMap;
        if (afr == null) {
            applyInitialCamera();
            return;
        }
        C126711 c126711 = new C126711();
        if (!afr.A00) {
            final AL9 al9 = afr.A02;
            if (al9.A0b) {
                return;
            }
            if (al9.getWidth() > 0 && al9.getHeight() > 0 && !al9.isLayoutRequested()) {
                c126711.invoke();
                return;
            }
            al9.A0Y.add(c126711);
            if (al9.A00 == null) {
                I0V i0v = new I0V(al9, 1);
                al9.A00 = i0v;
                al9.addOnLayoutChangeListener(i0v);
                al9.post(new Runnable() { // from class: X.9mV
                    public static final String __redex_internal_original_name = "BaseMapView$runWhenLaidOut$1";

                    @Override // java.lang.Runnable
                    public final void run() {
                        AL9 al92 = al9;
                        if (al92.A0b || al92.getWidth() <= 0 || al92.getHeight() <= 0 || al92.isLayoutRequested()) {
                            return;
                        }
                        AL9.A0F(al92);
                    }
                });
            }
        }
    }

    private final void setPresentationCallbacks(G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2) {
        boolean z = true;
        if (AnonymousClass002.A1Y(this.onExpand) == AnonymousClass002.A1Y(g0u) && AnonymousClass002.A1Y(this.onPlaceDetailsRequested) == AnonymousClass002.A1Y(g0u2)) {
            z = false;
        }
        this.onExpand = g0u;
        this.onPlaceDetailsRequested = g0u2;
        if (z) {
            BLG<HatchMapAgenticScenePresentation> blg = this.mutablePresentation;
            blg.Af8(presentation(blg.getValue().selectedArtifactId));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelection(String str, boolean z) {
        G0U<? super String, Unit> g0u;
        if (C7384Etj.areEqual(this.mutablePresentation.getValue().selectedArtifactId, str)) {
            return;
        }
        this.mutablePresentation.Af8(presentation(str));
        if (!z || (g0u = this.onSelectedArtifactIdChanged) == null) {
            return;
        }
        g0u.invoke(str);
    }

    public final HatchMapDisplayMode getDisplayMode() {
        return this.displayMode;
    }

    public final HatchMapCameraTarget.Point getInitialCamera() {
        return this.initialCamera;
    }

    @Override // com.facebook.aura.maps.HatchMapNavigationFlow
    public C1BN<HatchMapFlowPresentation> getPresentation() {
        return this.presentation;
    }

    public final HatchMapScene getScene() {
        return this.scene;
    }

    public final HatchMapSceneIndex getSceneIndex() {
        return this.sceneIndex;
    }

    @Override // com.facebook.aura.maps.HatchMapNavigationFlow
    public void mapAttached() {
        if (this.session != this.navigationController.session) {
            releaseMapContent();
        }
        installMapContentIfNeeded();
        if (this.isVisible) {
            scheduleCameraFit();
        }
    }

    public final void updateTheme(boolean z) {
        this.isDarkMode = z;
        GeoJsonMapContent geoJsonMapContent = this.pinContent;
        if (geoJsonMapContent != null) {
            geoJsonMapContent.updateLayerDefinitions(pinLayerDefinition(z));
        }
    }

    public HatchMapAgenticSceneFlow(HatchMapNavigationController hatchMapNavigationController, HatchMapScene hatchMapScene, HatchMapTheme hatchMapTheme, HatchMapDisplayMode hatchMapDisplayMode, SDKInsets sDKInsets, boolean z, HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache, boolean z2) {
        HatchMapElement hatchMapElement;
        AnonymousClass005.A17(hatchMapNavigationController, hatchMapScene, hatchMapTheme, hatchMapDisplayMode, sDKInsets);
        C7384Etj.A0Y(hatchMapAgenticSceneFlowCache, 6);
        this.navigationController = hatchMapNavigationController;
        this.scene = hatchMapScene;
        this.theme = hatchMapTheme;
        this.cache = hatchMapAgenticSceneFlowCache;
        this.sceneIndex = new HatchMapSceneIndex(hatchMapScene);
        this.initialCamera = HatchMapCameraDerivation.INSTANCE.initialPoint(hatchMapScene);
        this.displayMode = hatchMapDisplayMode;
        this.cameraInsets = sDKInsets;
        this.markerRenderer = new HatchMapMarkerRenderer(hatchMapDisplayMode);
        this.isDarkMode = z;
        this.selectionCallbackGeneration = new AtomicLong();
        String artifactId = null;
        if (z2 && (hatchMapElement = (HatchMapElement) AbstractC0878AGe.A0G(hatchMapScene.elements)) != null) {
            artifactId = hatchMapElement.getArtifactId();
        }
        C9286GCn c9286GCnA01 = HnJ.A01(presentation(artifactId));
        this.mutablePresentation = c9286GCnA01;
        this.presentation = c9286GCnA01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runOnMain(final Function0<Unit> function0) {
        if (C3cH.A1K()) {
            function0.invoke();
        } else {
            AuraExecutors.INSTANCE.getUiThreadHandler().post(new Runnable(function0) { // from class: com.facebook.aura.maps.HatchMapAgenticSceneFlow$sam$java_lang_Runnable$0
                public final /* synthetic */ Function0 function;

                {
                    C7384Etj.A0Y(function0, 0);
                    this.function = function0;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.function.invoke();
                }
            });
        }
    }

    @Override // com.facebook.aura.maps.HatchMapNavigationFlow
    public void mapDetached() {
        releaseMapContent();
    }

    public final void updateDisplayMode(HatchMapDisplayMode hatchMapDisplayMode, SDKInsets sDKInsets) {
        AnonymousClass003.A0u(hatchMapDisplayMode, sDKInsets);
        boolean z = true;
        if (this.displayMode == hatchMapDisplayMode) {
            z = false;
            if (C7384Etj.areEqual(this.cameraInsets, sDKInsets)) {
                return;
            }
        }
        this.displayMode = hatchMapDisplayMode;
        this.cameraInsets = new SDKInsets(sDKInsets.left, sDKInsets.top, sDKInsets.right, sDKInsets.bottom);
        if (z) {
            this.markerRenderer = new HatchMapMarkerRenderer(hatchMapDisplayMode);
            GeoJsonMapContent geoJsonMapContent = this.pinContent;
            if (geoJsonMapContent != null) {
                geoJsonMapContent.updateLayerDefinitions(pinLayerDefinition(this.isDarkMode));
            }
            BLG<HatchMapAgenticScenePresentation> blg = this.mutablePresentation;
            blg.Af8(presentation(blg.getValue().selectedArtifactId));
        }
        C9n4 c9n4 = this.session;
        if (c9n4 != null) {
            c9n4.A01().setMapContentInset(this.cameraInsets);
            if (this.isVisible) {
                scheduleCameraFit();
            }
        }
    }
}
