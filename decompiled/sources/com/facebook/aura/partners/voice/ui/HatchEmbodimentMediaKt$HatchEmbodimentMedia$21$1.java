package com.facebook.aura.partners.voice.ui;

import X.AWA;
import X.AbstractC7559F3s;
import X.B1T;
import X.InterfaceC2178B0w;
import android.graphics.Bitmap;
import android.view.Surface;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$21$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $activityVideoCovering;
    public final /* synthetic */ Surface $renderedRtcSurface;
    public final /* synthetic */ AWA $retainedFrameSize;
    public final /* synthetic */ EmbodimentFrameRetention $retention;
    public final /* synthetic */ boolean $retentionMeasured;
    public final /* synthetic */ MutableState<Function0<Bitmap>> $rtcCapture$delegate;
    public final /* synthetic */ boolean $rtcCovering;
    public final /* synthetic */ boolean $rtcFrameFallbackAllowed;
    public final /* synthetic */ boolean $rtcFrameRetentionEnabled;
    public final /* synthetic */ MutableState<Surface> $rtcSurface$delegate;
    public final /* synthetic */ MutableState<Boolean> $rtcSurfacePainted$delegate;
    public final /* synthetic */ boolean $rtcVisible;

    /* renamed from: com.facebook.aura.partners.voice.ui.HatchEmbodimentMediaKt$HatchEmbodimentMedia$21$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<InterfaceC2178B0w> {
        public final /* synthetic */ boolean $retentionMeasured;
        public final /* synthetic */ MutableState<Function0<Bitmap>> $rtcCapture$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, MutableState<Function0<Bitmap>> mutableState) {
            super(0);
            this.$retentionMeasured = z;
            this.$rtcCapture$delegate = mutableState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC2178B0w invoke() {
            Function0<Bitmap> value;
            Bitmap bitmapInvoke;
            if (!this.$retentionMeasured || (value = this.$rtcCapture$delegate.getValue()) == null || (bitmapInvoke = value.invoke()) == null) {
                return null;
            }
            return new B1T(bitmapInvoke);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$21$1(Surface surface, EmbodimentFrameRetention embodimentFrameRetention, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, AWA awa, MutableState<Surface> mutableState, MutableState<Boolean> mutableState2, boolean z6, MutableState<Function0<Bitmap>> mutableState3) {
        super(0);
        this.$renderedRtcSurface = surface;
        this.$retention = embodimentFrameRetention;
        this.$rtcFrameRetentionEnabled = z;
        this.$rtcVisible = z2;
        this.$rtcCovering = z3;
        this.$activityVideoCovering = z4;
        this.$rtcFrameFallbackAllowed = z5;
        this.$retainedFrameSize = awa;
        this.$rtcSurface$delegate = mutableState;
        this.$rtcSurfacePainted$delegate = mutableState2;
        this.$retentionMeasured = z6;
        this.$rtcCapture$delegate = mutableState3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2() {
        /*
            r8 = this;
            androidx.compose.runtime.MutableState<android.view.Surface> r0 = r8.$rtcSurface$delegate
            java.lang.Object r1 = r0.getValue()
            android.view.Surface r0 = r8.$renderedRtcSurface
            if (r1 != r0) goto L13
            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r8.$rtcSurfacePainted$delegate
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r0)
            r1 = 1
            if (r0 != 0) goto L14
        L13:
            r1 = 0
        L14:
            com.facebook.aura.partners.voice.ui.EmbodimentFrameRetention r2 = r8.$retention
            boolean r3 = r8.$rtcFrameRetentionEnabled
            boolean r0 = r8.$rtcVisible
            if (r0 == 0) goto L1f
            r4 = 1
            if (r1 != 0) goto L20
        L1f:
            r4 = 0
        L20:
            boolean r0 = r8.$rtcCovering
            if (r0 == 0) goto L26
            if (r1 != 0) goto L2b
        L26:
            boolean r0 = r8.$activityVideoCovering
            r5 = 0
            if (r0 == 0) goto L2c
        L2b:
            r5 = 1
        L2c:
            boolean r6 = r8.$rtcFrameFallbackAllowed
            X.AWA r7 = r8.$retainedFrameSize
            boolean r1 = r8.$retentionMeasured
            androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<android.graphics.Bitmap>> r0 = r8.$rtcCapture$delegate
            com.facebook.aura.partners.voice.ui.HatchEmbodimentMediaKt$HatchEmbodimentMedia$21$1$1 r8 = new com.facebook.aura.partners.voice.ui.HatchEmbodimentMediaKt$HatchEmbodimentMedia$21$1$1
            r8.<init>(r1, r0)
            r2.m1800updatefSIHrko(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.ui.HatchEmbodimentMediaKt$HatchEmbodimentMedia$21$1.invoke2():void");
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
