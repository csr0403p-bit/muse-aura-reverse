package com.facebook.aura.status.view;

import X.AnonymousClass003;
import X.C06H;

/* loaded from: classes.dex */
public final class StatusPillAvatarPanel {
    public static final int $stable = 0;
    public final float avatarSize;
    public final float bottom;
    public final float clipBottom;
    public final float layerTop;
    public final float offsetY;
    public final float progress;
    public final float restingAvatarSize;

    /* renamed from: getAvatarSize-D9Ej5fM, reason: not valid java name */
    public final float m2247getAvatarSizeD9Ej5fM() {
        return this.avatarSize;
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m2248getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getClipBottom-D9Ej5fM, reason: not valid java name */
    public final float m2249getClipBottomD9Ej5fM() {
        return this.clipBottom;
    }

    /* renamed from: getLayerTop-D9Ej5fM, reason: not valid java name */
    public final float m2250getLayerTopD9Ej5fM() {
        return this.layerTop;
    }

    /* renamed from: getOffsetY-D9Ej5fM, reason: not valid java name */
    public final float m2251getOffsetYD9Ej5fM() {
        return this.offsetY;
    }

    public final float getProgress() {
        return this.progress;
    }

    /* renamed from: getRestingAvatarSize-D9Ej5fM, reason: not valid java name */
    public final float m2252getRestingAvatarSizeD9Ej5fM() {
        return this.restingAvatarSize;
    }

    public StatusPillAvatarPanel(float f, float f2, float f3, float f4, float f5) {
        this.progress = f;
        this.avatarSize = f2;
        this.restingAvatarSize = f3;
        this.layerTop = f4;
        this.bottom = f5;
        float fA01 = AnonymousClass003.A01(f, 0.0f, -f4);
        this.offsetY = fA01;
        this.clipBottom = (f5 - f4) - fA01;
    }

    public /* synthetic */ StatusPillAvatarPanel(float f, float f2, float f3, float f4, float f5, C06H c06h) {
        this(f, f2, f3, f4, f5);
    }
}
