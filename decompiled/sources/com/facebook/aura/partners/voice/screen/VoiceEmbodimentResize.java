package com.facebook.aura.partners.voice.screen;

import X.ATD;
import X.AXN;
import X.AaC;
import X.Ab3;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.C0dx;
import X.C3UT;
import X.C3cG;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC1497Ak4;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import com.facebook.aura.partners.voice.intf.VoiceCallControlLoggingKt;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentStateReason;
import com.facebook.aura.partners.voice.prefs.VoiceAvatarExpandedView;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentResize {
    public ResizeAxis axis;
    public float collapseDistance;
    public boolean commitsToNextSize;
    public InterfaceC1497Ak4 coordinates;
    public boolean fromFull;
    public final VoiceAvatarFullScreenState fullScreen;
    public final int gestureBottom;
    public final float handleInset;
    public final C0dx haptics;
    public final float holdVelocity;
    public long lastUptime;
    public final HatchStatusPillMetrics metrics;
    public final int navigationBottom;
    public final G0U<VoiceAvatarExpandedView, Unit> onSizeUsed;
    public Float panelDragValue;
    public Float pointerStartY;
    public long pressUptime;
    public long releaseUptime;
    public final float skipToAvatarVelocity;
    public float startProgress;
    public final VoiceCallStateHolder stateHolder;
    public final float touchHeight;
    public final float touchWidth;
    public float travel;
    public final C3UT velocity;
    public final int windowHeight;
    public final int windowWidth;

    /* renamed from: restingGeometry-TmRCtEA, reason: not valid java name */
    public final VoiceDragHandleRestingGeometry m1776restingGeometryTmRCtEA(long j, AaC aaC) {
        AaC aaC2 = aaC;
        if (MutableState.A0A(this.fullScreen.interactive$delegate) || this.fullScreen.getDragProgress() != null || this.fullScreen.progressAnimatable.A05() || this.metrics.getAvatarPanelDragProgress() != null) {
            return null;
        }
        if (this.metrics.getAvatarPanelProgress() != 1.0f && this.fullScreen.getProgress() != 1.0f) {
            return null;
        }
        AaC destination = this.fullScreen.getDestination();
        if (destination == null) {
            destination = new AaC(0.0f, 0.0f, this.windowWidth, this.windowHeight);
        }
        float fA00 = AnonymousClass001.A00(destination.A00());
        if (aaC == null) {
            float f = destination.A01;
            float avatarPanelBottomPx = this.metrics.getAvatarPanelBottomPx();
            float f2 = destination.A02;
            aaC2 = new AaC(f, avatarPanelBottomPx - (f2 - f), f2, this.metrics.getAvatarPanelBottomPx());
        }
        float fRestingHandleCenterY = restingHandleCenterY(this.metrics.getAvatarPanelBottomPx());
        long jFloatToRawIntBits = Float.floatToRawIntBits(fA00) << 32;
        return new VoiceDragHandleRestingGeometry(aaC2, destination, jFloatToRawIntBits | (Float.floatToRawIntBits(fRestingHandleCenterY) & 4294967295L), (Float.floatToRawIntBits(restingHandleCenterY(getFullBottom())) & 4294967295L) | jFloatToRawIntBits, j);
    }

    public final boolean step(boolean z) {
        boolean zExpandFromHalfScreen = false;
        if (z) {
            if (this.metrics.getAvatarExpanded() && !this.fullScreen.getActive() && (zExpandFromHalfScreen = this.fullScreen.expandFromHalfScreen(this.metrics))) {
                log(true, VoiceEmbodimentStateReason.HANDLE_TAP);
                this.onSizeUsed.invoke(VoiceAvatarExpandedView.FULL_SCREEN);
            }
        } else if (this.fullScreen.getExpanded()) {
            log(false, VoiceEmbodimentStateReason.HANDLE_TAP);
            this.fullScreen.collapse(this.metrics, false);
            this.onSizeUsed.invoke(VoiceAvatarExpandedView.HALF_SCREEN);
            return true;
        }
        return zExpandFromHalfScreen;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ResizeAxis.values().length];
            try {
                AnonymousClass002.A13(ResizeAxis.HALF_TO_FULL, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ResizeAxis.HALF_TO_AVATAR, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ResizeAxis.NONE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void beginFullScreenDrag(boolean z) {
        this.fromFull = z;
        this.startProgress = VoiceEmbodimentDragHandleKt.unbanded(this.fullScreen.getEdgeProgress());
        VoiceAvatarFullScreenState voiceAvatarFullScreenState = this.fullScreen;
        voiceAvatarFullScreenState.dragOwner = this;
        voiceAvatarFullScreenState.setInteractive(true);
    }

    private final void finishCollapseDrag(float f) {
        Float avatarPanelDragProgress = this.metrics.getAvatarPanelDragProgress();
        float fFloatValue = 1.0f - (avatarPanelDragProgress != null ? avatarPanelDragProgress.floatValue() : 1.0f);
        float fProjectedDistance = VoiceEmbodimentDragHandleKt.projectedDistance(f);
        float f2 = this.collapseDistance;
        if (releaseCommits(fFloatValue - (fProjectedDistance / f2), f)) {
            this.haptics.AXr(16);
            log(false, VoiceEmbodimentStateReason.HANDLE_DRAG);
            this.metrics.setAvatarExpanded(false);
        } else {
            this.metrics.setAvatarPanelSettleVelocity(Float.valueOf(VoiceEmbodimentDragHandleKt.relativeVelocity(f / f2)));
        }
        this.metrics.setAvatarPanelDragProgress(null);
        this.panelDragValue = null;
    }

    private final void finishFullScreenDrag(float f) {
        G0U<VoiceAvatarExpandedView, Unit> g0u;
        VoiceAvatarExpandedView voiceAvatarExpandedView;
        float progress = this.fullScreen.getProgress() + (VoiceEmbodimentDragHandleKt.projectedDistance(f) / getGrowDistance());
        if (this.fromFull) {
            float f2 = 1.0f - progress;
            float avatarPanelBottomPx = (this.metrics.getAvatarPanelBottomPx() * f2) + (progress * getFullBottom());
            AaC pillBoundsInWindow = this.metrics.getPillBoundsInWindow();
            float f3 = pillBoundsInWindow != null ? pillBoundsInWindow.A00 : 0.0f;
            if (f >= (-this.skipToAvatarVelocity) || avatarPanelBottomPx >= f3) {
                boolean zReleaseCommits = releaseCommits(f2, f);
                float growDistance = f / getGrowDistance();
                if (zReleaseCommits) {
                    settle(growDistance);
                    this.haptics.AXr(16);
                    log(false, VoiceEmbodimentStateReason.HANDLE_DRAG);
                    this.fullScreen.collapse(this.metrics, false);
                    g0u = this.onSizeUsed;
                    voiceAvatarExpandedView = VoiceAvatarExpandedView.HALF_SCREEN;
                    g0u.invoke(voiceAvatarExpandedView);
                } else {
                    settle(growDistance);
                }
            } else {
                float fullBottom = getFullBottom() - f3;
                if (fullBottom < 1.0f) {
                    fullBottom = 1.0f;
                }
                settle(f / fullBottom);
                HatchStatusPillMetrics hatchStatusPillMetrics = this.metrics;
                float avatarPanelBottomPx2 = hatchStatusPillMetrics.getAvatarPanelBottomPx() - f3;
                if (avatarPanelBottomPx2 < 1.0f) {
                    avatarPanelBottomPx2 = 1.0f;
                }
                hatchStatusPillMetrics.setAvatarPanelSettleVelocity(Float.valueOf(VoiceEmbodimentDragHandleKt.relativeVelocity(f / avatarPanelBottomPx2)));
                log(false, VoiceEmbodimentStateReason.HANDLE_DRAG);
                this.fullScreen.collapse(this.metrics, true);
            }
        } else if (releaseCommits(progress, f) && (this.fullScreen.getExpanded() || this.fullScreen.expandFromHalfScreen(this.metrics))) {
            settle(f / getGrowDistance());
            this.haptics.AXr(16);
            log(true, VoiceEmbodimentStateReason.HANDLE_DRAG);
            g0u = this.onSizeUsed;
            voiceAvatarExpandedView = VoiceAvatarExpandedView.FULL_SCREEN;
            g0u.invoke(voiceAvatarExpandedView);
        } else {
            settle(f / getGrowDistance());
            this.fullScreen.collapse(this.metrics, false);
        }
        VoiceAvatarFullScreenState voiceAvatarFullScreenState = this.fullScreen;
        voiceAvatarFullScreenState.dragOwner = null;
        voiceAvatarFullScreenState.setInteractive(false);
    }

    private final float getFullBottom() {
        AaC destination = this.fullScreen.getDestination();
        return (destination != null ? destination.A00 : this.windowHeight) - this.navigationBottom;
    }

    private final float getHalfBottom() {
        return this.metrics.getAvatarPanelBottomPx();
    }

    private final void log(boolean z, VoiceEmbodimentStateReason voiceEmbodimentStateReason) {
        this.stateHolder.noteEmbodimentStateReason(voiceEmbodimentStateReason);
        VoiceCallControlLoggingKt.logCallControlToggle(this.stateHolder, z, HatchComponent.EMBODIMENT_DRAG_HANDLE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r3.fullScreen.expandFromHalfScreen(r3.metrics) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.partners.voice.screen.ResizeAxis pickAxis() {
        /*
            r3 = this;
            com.facebook.aura.partners.voice.screen.VoiceAvatarFullScreenState r0 = r3.fullScreen
            boolean r0 = r0.getActive()
            if (r0 == 0) goto L1f
            com.facebook.aura.partners.voice.screen.VoiceAvatarFullScreenState r0 = r3.fullScreen
            boolean r0 = r0.getExpanded()
            if (r0 == 0) goto L1f
            com.facebook.aura.header.view.HatchStatusPillMetrics r0 = r3.metrics
            boolean r0 = r0.getAvatarExpanded()
            if (r0 == 0) goto L1f
            r2 = 1
        L19:
            r3.beginFullScreenDrag(r2)
            com.facebook.aura.partners.voice.screen.ResizeAxis r0 = com.facebook.aura.partners.voice.screen.ResizeAxis.HALF_TO_FULL
            return r0
        L1f:
            com.facebook.aura.partners.voice.screen.VoiceAvatarFullScreenState r0 = r3.fullScreen
            boolean r0 = r0.getActive()
            r2 = 0
            if (r0 == 0) goto L39
            com.facebook.aura.header.view.HatchStatusPillMetrics r0 = r3.metrics
            boolean r0 = r0.getAvatarExpanded()
            if (r0 == 0) goto L39
            com.facebook.aura.partners.voice.screen.VoiceAvatarFullScreenState r0 = r3.fullScreen
            boolean r0 = r0.getEnteredFromHalfScreen()
            if (r0 == 0) goto L39
            goto L19
        L39:
            com.facebook.aura.header.view.HatchStatusPillMetrics r0 = r3.metrics
            boolean r0 = r0.getAvatarExpanded()
            r1 = 0
            if (r0 == 0) goto L5b
            com.facebook.aura.partners.voice.screen.VoiceAvatarFullScreenState r0 = r3.fullScreen
            boolean r0 = r0.getActive()
            if (r0 != 0) goto L5b
            float r0 = r3.travel
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5b
            com.facebook.aura.partners.voice.screen.VoiceAvatarFullScreenState r1 = r3.fullScreen
            com.facebook.aura.header.view.HatchStatusPillMetrics r0 = r3.metrics
            boolean r0 = r1.expandFromHalfScreen(r0)
            if (r0 == 0) goto L98
            goto L19
        L5b:
            com.facebook.aura.header.view.HatchStatusPillMetrics r0 = r3.metrics
            boolean r0 = r0.getAvatarExpanded()
            if (r0 == 0) goto L98
            com.facebook.aura.partners.voice.screen.VoiceAvatarFullScreenState r0 = r3.fullScreen
            boolean r0 = r0.getActive()
            if (r0 != 0) goto L98
            float r0 = r3.travel
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L98
            com.facebook.aura.header.view.HatchStatusPillMetrics r0 = r3.metrics
            X.AaC r0 = r0.getPillBoundsInWindow()
            if (r0 == 0) goto L7b
            float r1 = r0.A00
        L7b:
            com.facebook.aura.header.view.HatchStatusPillMetrics r0 = r3.metrics
            float r2 = r0.getAvatarPanelBottomPx()
            float r2 = r2 - r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L8a
            r2 = 1065353216(0x3f800000, float:1.0)
        L8a:
            r3.collapseDistance = r2
            com.facebook.aura.header.view.HatchStatusPillMetrics r0 = r3.metrics
            float r0 = r0.getAvatarPanelProgress()
            float r1 = r1 - r0
            r3.startProgress = r1
            com.facebook.aura.partners.voice.screen.ResizeAxis r0 = com.facebook.aura.partners.voice.screen.ResizeAxis.HALF_TO_AVATAR
            return r0
        L98:
            com.facebook.aura.partners.voice.screen.ResizeAxis r0 = com.facebook.aura.partners.voice.screen.ResizeAxis.NONE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceEmbodimentResize.pickAxis():com.facebook.aura.partners.voice.screen.ResizeAxis");
    }

    private final float releaseSpeed() {
        if (this.releaseUptime - this.lastUptime > 120) {
            return 0.0f;
        }
        float fA00 = AnonymousClass004.A00(this.velocity.A00());
        long j = this.lastUptime - this.pressUptime;
        return (Math.abs(fA00) >= this.holdVelocity || 1 > j || j >= 251) ? fA00 : (this.travel * 1000.0f) / j;
    }

    private final float restingHandleCenterY(float f) {
        return Math.min(f - this.handleInset, (this.windowHeight - this.gestureBottom) - (this.touchHeight / 2.0f));
    }

    private final void settle(float f) {
        this.fullScreen.setSettleVelocity(Float.valueOf(VoiceEmbodimentDragHandleKt.relativeVelocity(f)));
    }

    private final void snapFullScreen(float f) {
        this.fullScreen.setDragProgress(Float.valueOf(f));
    }

    private final void updateCommit(float f) {
        boolean z = this.commitsToNextSize;
        boolean zA1N = AnonymousClass002.A1N((f > (z ? 0.4f : 0.5f) ? 1 : (f == (z ? 0.4f : 0.5f) ? 0 : -1)));
        if (zA1N != z) {
            this.commitsToNextSize = zA1N;
            this.haptics.AXr(26);
        }
    }

    public final void abandon() {
        int iOrdinal = this.axis.ordinal();
        if (iOrdinal == 1) {
            VoiceAvatarFullScreenState voiceAvatarFullScreenState = this.fullScreen;
            if (voiceAvatarFullScreenState.dragOwner == this) {
                if (!this.fromFull) {
                    voiceAvatarFullScreenState.collapse(this.metrics, false);
                }
                VoiceAvatarFullScreenState voiceAvatarFullScreenState2 = this.fullScreen;
                voiceAvatarFullScreenState2.dragOwner = null;
                voiceAvatarFullScreenState2.setInteractive(false);
            }
        } else if (iOrdinal != 2) {
            if (iOrdinal != 0) {
                throw C3cG.A0q();
            }
        } else if (this.panelDragValue != null) {
            Float avatarPanelDragProgress = this.metrics.getAvatarPanelDragProgress();
            Float f = this.panelDragValue;
            if (avatarPanelDragProgress != null ? !(f == null || avatarPanelDragProgress.floatValue() != f.floatValue()) : f == null) {
                this.metrics.setAvatarPanelDragProgress(null);
            }
        }
        this.panelDragValue = null;
        this.axis = ResizeAxis.NONE;
    }

    public final boolean drag(float f, long j) {
        float fFloatValue;
        float fA03;
        Float f2 = this.pointerStartY;
        if (f2 != null) {
            fFloatValue = f2.floatValue();
        } else {
            this.pointerStartY = Float.valueOf(f);
            fFloatValue = f;
        }
        this.travel = f - fFloatValue;
        this.lastUptime = j;
        C3UT c3ut = this.velocity;
        c3ut.A00.A3p(j, AnonymousClass007.A0A(0.0f, f));
        ResizeAxis resizeAxisPickAxis = this.axis;
        if (resizeAxisPickAxis == ResizeAxis.NONE) {
            resizeAxisPickAxis = pickAxis();
            this.axis = resizeAxisPickAxis;
        }
        int iOrdinal = resizeAxisPickAxis.ordinal();
        boolean z = true;
        if (iOrdinal == 1) {
            float fRubberBanded = VoiceEmbodimentDragHandleKt.rubberBanded(this.startProgress + (this.travel / getGrowDistance()));
            snapFullScreen(fRubberBanded);
            fA03 = ATD.A03(fRubberBanded, 0.0f, 1.0f);
            if (this.fromFull) {
                fA03 = 1.0f - fA03;
            }
        } else {
            if (iOrdinal != 2) {
                z = false;
                if (iOrdinal != 0) {
                    throw C3cG.A0q();
                }
                return z;
            }
            fA03 = ATD.A03(this.startProgress - (this.travel / this.collapseDistance), 0.0f, 1.0f);
            Float fValueOf = Float.valueOf(1.0f - fA03);
            this.panelDragValue = fValueOf;
            this.metrics.setAvatarPanelDragProgress(fValueOf);
        }
        updateCommit(fA03);
        return z;
    }

    public final void end(boolean z) {
        float fReleaseSpeed = z ? 0.0f : releaseSpeed();
        int iOrdinal = this.axis.ordinal();
        if (iOrdinal == 1) {
            finishFullScreenDrag(fReleaseSpeed);
        } else if (iOrdinal == 2) {
            finishCollapseDrag(fReleaseSpeed);
        } else if (iOrdinal != 0) {
            throw C3cG.A0q();
        }
        this.axis = ResizeAxis.NONE;
    }

    public final InterfaceC1497Ak4 getCoordinates() {
        return this.coordinates;
    }

    public final float handleAlpha() {
        return AnonymousClass003.A00((Math.max(this.metrics.getAvatarPanelProgress(), this.fullScreen.getProgress()) - 0.7f) / 0.3f);
    }

    /* renamed from: handleTopLeft-nOcc-ac, reason: not valid java name */
    public final long m1775handleTopLeftnOccac() {
        float avatarPanelBottomPx = this.metrics.getAvatarPanelBottomPx();
        float fullBottom = getFullBottom();
        float edgeProgress = this.fullScreen.getEdgeProgress();
        float f = ((1.0f - edgeProgress) * avatarPanelBottomPx) + (edgeProgress * fullBottom);
        AaC destination = this.fullScreen.getDestination();
        float fA00 = destination != null ? AnonymousClass001.A00(destination.A00()) : this.windowWidth / 2.0f;
        float f2 = f - this.handleInset;
        float f3 = this.windowHeight - this.gestureBottom;
        float f4 = this.touchHeight / 2.0f;
        return (Ab3.A01(fA00 - (this.touchWidth / 2.0f)) << 32) | (Ab3.A01(Math.min(f2, f3 - f4) - f4) & 4294967295L);
    }

    public final void press(Float f, long j) {
        this.pointerStartY = f;
        this.pressUptime = j;
        this.lastUptime = j;
        this.releaseUptime = j;
        this.velocity.A00.AbS();
        if (f != null) {
            C3UT c3ut = this.velocity;
            c3ut.A00.A3p(j, AnonymousClass007.A0A(0.0f, f.floatValue()));
        }
    }

    public final void release(Float f, long j) {
        Float f2 = this.pointerStartY;
        Float fValueOf = f2 != null ? Float.valueOf(f2.floatValue() + this.travel) : null;
        if (this.axis != ResizeAxis.NONE && f != null && fValueOf != null) {
            float fFloatValue = f.floatValue();
            if (Math.abs(fFloatValue - fValueOf.floatValue()) > 1.0f) {
                long j2 = this.lastUptime;
                if (j - j2 <= 120) {
                    j2 = j;
                }
                drag(fFloatValue, j2);
            }
        }
        this.releaseUptime = j;
    }

    /* renamed from: rootY-k-4lQ0M, reason: not valid java name */
    public final Float m1777rootYk4lQ0M(long j) {
        InterfaceC1497Ak4 interfaceC1497Ak4 = this.coordinates;
        if (interfaceC1497Ak4 == null || !interfaceC1497Ak4.isAttached()) {
            return null;
        }
        return Float.valueOf(AnonymousClass004.A00(interfaceC1497Ak4.APo(j)));
    }

    public final void setCoordinates(InterfaceC1497Ak4 interfaceC1497Ak4) {
        this.coordinates = interfaceC1497Ak4;
    }

    public final void start() {
        this.axis = ResizeAxis.NONE;
        this.travel = 0.0f;
        this.commitsToNextSize = false;
    }

    public final void tap() {
        step(!this.fullScreen.getExpanded());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VoiceEmbodimentResize(HatchStatusPillMetrics hatchStatusPillMetrics, VoiceAvatarFullScreenState voiceAvatarFullScreenState, VoiceCallStateHolder voiceCallStateHolder, G0U<? super VoiceAvatarExpandedView, Unit> g0u, C0dx c0dx, AXN axn, int i, int i2, int i3, int i4) {
        AnonymousClass005.A17(hatchStatusPillMetrics, voiceAvatarFullScreenState, voiceCallStateHolder, g0u, c0dx);
        C7384Etj.A0Y(axn, 5);
        this.metrics = hatchStatusPillMetrics;
        this.fullScreen = voiceAvatarFullScreenState;
        this.stateHolder = voiceCallStateHolder;
        this.onSizeUsed = g0u;
        this.haptics = c0dx;
        this.windowWidth = i;
        this.windowHeight = i2;
        this.navigationBottom = i3;
        this.gestureBottom = i4;
        this.touchWidth = axn.Ah4(VoiceEmbodimentDragHandleKt.HandleTouchWidth);
        this.touchHeight = axn.Ah4(VoiceEmbodimentDragHandleKt.HandleTouchHeight);
        this.handleInset = axn.Ah4(VoiceEmbodimentDragHandleKt.HandleBottomInset) + axn.Ah4(2.5f);
        this.holdVelocity = axn.Ah4(VoiceEmbodimentDragHandleKt.HoldVelocity);
        this.skipToAvatarVelocity = axn.Ah4(VoiceEmbodimentDragHandleKt.SkipToAvatarVelocity);
        this.velocity = new C3UT();
        this.axis = ResizeAxis.NONE;
        this.collapseDistance = 1.0f;
    }

    private final float getGrowDistance() {
        float fullBottom = getFullBottom() - this.metrics.getAvatarPanelBottomPx();
        if (fullBottom < 1.0f) {
            return 1.0f;
        }
        return fullBottom;
    }

    private final boolean releaseCommits(float f, float f2) {
        return Math.abs(f2) < this.holdVelocity ? this.commitsToNextSize : AnonymousClass002.A1N((f > 0.5f ? 1 : (f == 0.5f ? 0 : -1)));
    }
}
