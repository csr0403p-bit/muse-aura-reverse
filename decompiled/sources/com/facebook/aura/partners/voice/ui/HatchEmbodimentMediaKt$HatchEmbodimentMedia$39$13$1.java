package com.facebook.aura.partners.voice.ui;

import X.AWA;
import X.AbstractC7559F3s;
import X.B1T;
import X.G0U;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$39$13$1 extends AbstractC7559F3s implements G0U<Bitmap, Unit> {
    public final /* synthetic */ boolean $retainOnSurfaceLoss;
    public final /* synthetic */ AWA $retainedFrameSize;
    public final /* synthetic */ EmbodimentFrameRetention $retention;
    public final /* synthetic */ boolean $retentionMeasured;
    public final /* synthetic */ boolean $rtcFrameFallbackAllowed;
    public final /* synthetic */ boolean $rtcFrameRetentionEnabled;
    public final /* synthetic */ MutableState<Boolean> $rtcSurfaceLost$delegate;
    public final /* synthetic */ MutableState<Boolean> $rtcSurfacePainted$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$39$13$1(boolean z, boolean z2, boolean z3, EmbodimentFrameRetention embodimentFrameRetention, AWA awa, boolean z4, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
        super(1);
        this.$rtcFrameRetentionEnabled = z;
        this.$rtcFrameFallbackAllowed = z2;
        this.$retentionMeasured = z3;
        this.$retention = embodimentFrameRetention;
        this.$retainedFrameSize = awa;
        this.$retainOnSurfaceLoss = z4;
        this.$rtcSurfacePainted$delegate = mutableState;
        this.$rtcSurfaceLost$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Bitmap bitmap) {
        if (this.$rtcFrameRetentionEnabled && this.$rtcFrameFallbackAllowed && this.$retentionMeasured) {
            this.$retention.m1799onSurfaceLostVyH8yc(bitmap != null ? new B1T(bitmap) : null, this.$retainedFrameSize);
        }
        MutableState.A09(false, this.$rtcSurfacePainted$delegate);
        if (this.$retainOnSurfaceLoss) {
            MutableState.A09(true, this.$rtcSurfaceLost$delegate);
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.INSTANCE;
    }
}
