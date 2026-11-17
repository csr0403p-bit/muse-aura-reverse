package com.facebook.aura.ui;

import X.C00r;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;

/* loaded from: classes4.dex */
public final class MutableHatchWindowGeometry implements HatchWindowGeometry {
    public static final int $stable = 0;
    public final C00r navigationBarLeftPxState$delegate = new ParcelableSnapshotMutableIntState(0);
    public final C00r navigationBarRightPxState$delegate = new ParcelableSnapshotMutableIntState(0);
    public final C00r navigationBarBottomPxState$delegate = new ParcelableSnapshotMutableIntState(0);
    public final C00r latestGeneration$delegate = new ParcelableSnapshotMutableIntState(0);
    public final C00r laidOutGeneration$delegate = new ParcelableSnapshotMutableIntState(0);

    public final void updateNavigationBarInsets(int i, int i2, int i3) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (this.latestGeneration$delegate.AGd() != 0 && this.navigationBarLeftPxState$delegate.AGd() == i && this.navigationBarRightPxState$delegate.AGd() == i2 && this.navigationBarBottomPxState$delegate.AGd() == i3) {
            return;
        }
        setNavigationBarLeftPxState(i);
        setNavigationBarRightPxState(i2);
        setNavigationBarBottomPxState(i3);
        setLatestGeneration(this.latestGeneration$delegate.AGd() + 1);
    }

    private final int getLaidOutGeneration() {
        return this.laidOutGeneration$delegate.AGd();
    }

    private final int getLatestGeneration() {
        return this.latestGeneration$delegate.AGd();
    }

    private final int getNavigationBarBottomPxState() {
        return this.navigationBarBottomPxState$delegate.AGd();
    }

    private final int getNavigationBarLeftPxState() {
        return this.navigationBarLeftPxState$delegate.AGd();
    }

    private final int getNavigationBarRightPxState() {
        return this.navigationBarRightPxState$delegate.AGd();
    }

    private final void setLaidOutGeneration(int i) {
        this.laidOutGeneration$delegate.AdX(i);
    }

    private final void setLatestGeneration(int i) {
        this.latestGeneration$delegate.AdX(i);
    }

    private final void setNavigationBarBottomPxState(int i) {
        this.navigationBarBottomPxState$delegate.AdX(i);
    }

    private final void setNavigationBarLeftPxState(int i) {
        this.navigationBarLeftPxState$delegate.AdX(i);
    }

    private final void setNavigationBarRightPxState(int i) {
        this.navigationBarRightPxState$delegate.AdX(i);
    }

    public final int getLayoutGeneration$fbandroid_express_aura_java_com_facebook_aura_ui_ui() {
        return this.latestGeneration$delegate.AGd();
    }

    @Override // com.facebook.aura.ui.HatchWindowGeometry
    public int getNavigationBarBottomPx() {
        return this.navigationBarBottomPxState$delegate.AGd();
    }

    @Override // com.facebook.aura.ui.HatchWindowGeometry
    public int getNavigationBarLeftPx() {
        return this.navigationBarLeftPxState$delegate.AGd();
    }

    @Override // com.facebook.aura.ui.HatchWindowGeometry
    public int getNavigationBarRightPx() {
        return this.navigationBarRightPxState$delegate.AGd();
    }

    public final boolean isInsetAwareRootLayoutComplete() {
        return this.latestGeneration$delegate.AGd() > 0 && this.laidOutGeneration$delegate.AGd() >= this.latestGeneration$delegate.AGd();
    }

    public final void markRootLayoutComplete$fbandroid_express_aura_java_com_facebook_aura_ui_ui(int i) {
        if (i > this.laidOutGeneration$delegate.AGd()) {
            setLaidOutGeneration(i);
        }
    }
}
