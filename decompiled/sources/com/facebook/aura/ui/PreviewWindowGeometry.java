package com.facebook.aura.ui;

/* loaded from: classes3.dex */
public final class PreviewWindowGeometry implements HatchWindowGeometry {
    public static final PreviewWindowGeometry INSTANCE = new PreviewWindowGeometry();
    public static final int navigationBarBottomPx = 0;
    public static final int navigationBarLeftPx = 0;
    public static final int navigationBarRightPx = 0;

    @Override // com.facebook.aura.ui.HatchWindowGeometry
    public int getNavigationBarBottomPx() {
        return navigationBarBottomPx;
    }

    @Override // com.facebook.aura.ui.HatchWindowGeometry
    public int getNavigationBarLeftPx() {
        return navigationBarLeftPx;
    }

    @Override // com.facebook.aura.ui.HatchWindowGeometry
    public int getNavigationBarRightPx() {
        return navigationBarRightPx;
    }
}
