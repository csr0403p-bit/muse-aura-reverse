package com.facebook.aura.header.view;

import X.AGE;
import X.AGF;
import X.AaC;
import X.AnonymousClass001;
import X.C00q;
import X.C1DG;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class HatchStatusPillMetrics {
    public static final int $stable = 0;
    public final MutableState avatarBoundsInWindow$delegate;
    public final MutableState avatarExpanded$delegate;
    public final MutableState avatarPanelAllowed$delegate;
    public final C00q avatarPanelBottomPx$delegate;
    public final MutableState avatarPanelDragProgress$delegate;
    public final MutableState avatarPanelOwner$delegate;
    public final C00q avatarPanelProgress$delegate;
    public final MutableState avatarPanelSettleVelocity$delegate;
    public final HatchAvatarPlaybackState avatarPlayback = new HatchAvatarPlaybackState();
    public final MutableState contentTopReservation$delegate;
    public final MutableState headerRowBottom$delegate;
    public final MutableState headerRowOwner$delegate;
    public final MutableState leadingChromeCenterY$delegate;
    public final MutableState pillBoundsInWindow$delegate;
    public final MutableState renderedPillBottom$delegate;
    public final MutableState trailingChromeCenterY$delegate;
    public final MutableState trailingChromeOwner$delegate;
    public final MutableState trailingChromeWidth$delegate;

    public final AaC getAvatarBoundsInWindow() {
        return (AaC) this.avatarBoundsInWindow$delegate.getValue();
    }

    public final boolean getAvatarExpanded() {
        return MutableState.A0A(this.avatarExpanded$delegate);
    }

    public final boolean getAvatarPanelAllowed() {
        return MutableState.A0A(this.avatarPanelAllowed$delegate);
    }

    public final float getAvatarPanelBottomPx() {
        return this.avatarPanelBottomPx$delegate.AFn();
    }

    public final Float getAvatarPanelDragProgress() {
        return (Float) this.avatarPanelDragProgress$delegate.getValue();
    }

    public final Object getAvatarPanelOwner() {
        return this.avatarPanelOwner$delegate.getValue();
    }

    public final float getAvatarPanelProgress() {
        return this.avatarPanelProgress$delegate.AFn();
    }

    public final Float getAvatarPanelSettleVelocity() {
        return (Float) this.avatarPanelSettleVelocity$delegate.getValue();
    }

    public final HatchAvatarPlaybackState getAvatarPlayback() {
        return this.avatarPlayback;
    }

    /* renamed from: getContentTopReservation-lTKBWiU, reason: not valid java name */
    public final C1DG m1000getContentTopReservationlTKBWiU() {
        return (C1DG) this.contentTopReservation$delegate.getValue();
    }

    /* renamed from: getHeaderRowBottom-lTKBWiU, reason: not valid java name */
    public final C1DG m1001getHeaderRowBottomlTKBWiU() {
        return (C1DG) this.headerRowBottom$delegate.getValue();
    }

    public final Object getHeaderRowOwner() {
        return this.headerRowOwner$delegate.getValue();
    }

    /* renamed from: getLeadingChromeCenterY-lTKBWiU, reason: not valid java name */
    public final C1DG m1002getLeadingChromeCenterYlTKBWiU() {
        return (C1DG) this.leadingChromeCenterY$delegate.getValue();
    }

    public final AaC getPillBoundsInWindow() {
        return (AaC) this.pillBoundsInWindow$delegate.getValue();
    }

    /* renamed from: getRenderedPillBottom-lTKBWiU, reason: not valid java name */
    public final C1DG m1003getRenderedPillBottomlTKBWiU() {
        return (C1DG) this.renderedPillBottom$delegate.getValue();
    }

    /* renamed from: getTrailingChromeCenterY-lTKBWiU, reason: not valid java name */
    public final C1DG m1004getTrailingChromeCenterYlTKBWiU() {
        return (C1DG) this.trailingChromeCenterY$delegate.getValue();
    }

    public final Object getTrailingChromeOwner() {
        return this.trailingChromeOwner$delegate.getValue();
    }

    /* renamed from: getTrailingChromeWidth-D9Ej5fM, reason: not valid java name */
    public final float m1005getTrailingChromeWidthD9Ej5fM() {
        return ((C1DG) this.trailingChromeWidth$delegate.getValue()).A00;
    }

    public final void setAvatarBoundsInWindow(AaC aaC) {
        this.avatarBoundsInWindow$delegate.Af8(aaC);
    }

    public final void setAvatarExpanded(boolean z) {
        MutableState.A09(z, this.avatarExpanded$delegate);
    }

    public final void setAvatarPanelAllowed(boolean z) {
        MutableState.A09(z, this.avatarPanelAllowed$delegate);
    }

    public final void setAvatarPanelBottomPx(float f) {
        this.avatarPanelBottomPx$delegate.AdS(f);
    }

    public final void setAvatarPanelDragProgress(Float f) {
        this.avatarPanelDragProgress$delegate.Af8(f);
    }

    public final void setAvatarPanelOwner(Object obj) {
        this.avatarPanelOwner$delegate.Af8(obj);
    }

    public final void setAvatarPanelProgress(float f) {
        this.avatarPanelProgress$delegate.AdS(f);
    }

    public final void setAvatarPanelSettleVelocity(Float f) {
        this.avatarPanelSettleVelocity$delegate.Af8(f);
    }

    /* renamed from: setContentTopReservation-YLDhkOg, reason: not valid java name */
    public final void m1006setContentTopReservationYLDhkOg(C1DG c1dg) {
        this.contentTopReservation$delegate.Af8(c1dg);
    }

    /* renamed from: setHeaderRowBottom-YLDhkOg, reason: not valid java name */
    public final void m1007setHeaderRowBottomYLDhkOg(C1DG c1dg) {
        this.headerRowBottom$delegate.Af8(c1dg);
    }

    public final void setHeaderRowOwner(Object obj) {
        this.headerRowOwner$delegate.Af8(obj);
    }

    /* renamed from: setLeadingChromeCenterY-YLDhkOg, reason: not valid java name */
    public final void m1008setLeadingChromeCenterYYLDhkOg(C1DG c1dg) {
        this.leadingChromeCenterY$delegate.Af8(c1dg);
    }

    public final void setPillBoundsInWindow(AaC aaC) {
        this.pillBoundsInWindow$delegate.Af8(aaC);
    }

    /* renamed from: setRenderedPillBottom-YLDhkOg, reason: not valid java name */
    public final void m1009setRenderedPillBottomYLDhkOg(C1DG c1dg) {
        this.renderedPillBottom$delegate.Af8(c1dg);
    }

    /* renamed from: setTrailingChromeCenterY-YLDhkOg, reason: not valid java name */
    public final void m1010setTrailingChromeCenterYYLDhkOg(C1DG c1dg) {
        this.trailingChromeCenterY$delegate.Af8(c1dg);
    }

    public final void setTrailingChromeOwner(Object obj) {
        this.trailingChromeOwner$delegate.Af8(obj);
    }

    /* renamed from: setTrailingChromeWidth-0680j_4, reason: not valid java name */
    public final void m1011setTrailingChromeWidth0680j_4(float f) {
        C1DG.A06(f, this.trailingChromeWidth$delegate);
    }

    public HatchStatusPillMetrics() {
        AGE ageA01 = AGF.A01();
        this.headerRowBottom$delegate = new ParcelableSnapshotMutableState(ageA01, null);
        this.headerRowOwner$delegate = new ParcelableSnapshotMutableState(ageA01, null);
        this.renderedPillBottom$delegate = new ParcelableSnapshotMutableState(ageA01, null);
        this.avatarBoundsInWindow$delegate = new ParcelableSnapshotMutableState(ageA01, null);
        this.pillBoundsInWindow$delegate = new ParcelableSnapshotMutableState(ageA01, null);
        this.avatarPanelOwner$delegate = new ParcelableSnapshotMutableState(ageA01, null);
        Boolean boolA0h = AnonymousClass001.A0h();
        this.avatarExpanded$delegate = new ParcelableSnapshotMutableState(ageA01, boolA0h);
        this.avatarPanelAllowed$delegate = new ParcelableSnapshotMutableState(ageA01, boolA0h);
        this.avatarPanelProgress$delegate = new ParcelableSnapshotMutableFloatState(0.0f);
        this.avatarPanelBottomPx$delegate = new ParcelableSnapshotMutableFloatState(0.0f);
        this.avatarPanelDragProgress$delegate = new ParcelableSnapshotMutableState(ageA01, null);
        this.avatarPanelSettleVelocity$delegate = new ParcelableSnapshotMutableState(ageA01, null);
        this.leadingChromeCenterY$delegate = new ParcelableSnapshotMutableState(ageA01, null);
        this.contentTopReservation$delegate = new ParcelableSnapshotMutableState(ageA01, null);
        this.trailingChromeWidth$delegate = new ParcelableSnapshotMutableState(ageA01, new C1DG(0.0f));
        this.trailingChromeCenterY$delegate = new ParcelableSnapshotMutableState(ageA01, null);
        this.trailingChromeOwner$delegate = new ParcelableSnapshotMutableState(ageA01, null);
    }
}
