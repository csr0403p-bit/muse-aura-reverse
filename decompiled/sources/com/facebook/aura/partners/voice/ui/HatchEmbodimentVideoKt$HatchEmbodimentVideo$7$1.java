package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C7438Evz;
import X.C78g;
import X.G0U;
import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchEmbodimentVideoKt$HatchEmbodimentVideo$7$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<G0U<Function0<Bitmap>, Unit>> $currentOnFrameCaptureAvailable$delegate;
    public final /* synthetic */ HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1 $listener;

    /* renamed from: com.facebook.aura.partners.voice.ui.HatchEmbodimentVideoKt$HatchEmbodimentVideo$7$1$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements Function0<Bitmap> {
        public AnonymousClass1(Object obj) {
            super(0, obj, HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1.class, "captureFrame", "captureFrame()Landroid/graphics/Bitmap;", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Bitmap invoke() {
            return ((HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1) this.receiver).captureFrame();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchEmbodimentVideoKt$HatchEmbodimentVideo$7$1(HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1 hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1, C1BO<? extends G0U<? super Function0<Bitmap>, Unit>> c1bo) {
        super(1);
        this.$listener = hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1;
        this.$currentOnFrameCaptureAvailable$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        C1BO.A0B(this.$currentOnFrameCaptureAvailable$delegate).invoke(new AnonymousClass1(this.$listener));
        final C1BO<G0U<Function0<Bitmap>, Unit>> c1bo = this.$currentOnFrameCaptureAvailable$delegate;
        return new C78g() { // from class: com.facebook.aura.partners.voice.ui.HatchEmbodimentVideoKt$HatchEmbodimentVideo$7$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                C1BO.A0B(c1bo).invoke(null);
            }
        };
    }
}
