package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$37$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<Function0<Bitmap>> $capture$delegate;
    public final /* synthetic */ C1BO<G0U<Function0<Bitmap>, Unit>> $currentOnFrameCaptureAvailable$delegate;

    /* renamed from: com.facebook.aura.partners.voice.ui.HatchEmbodimentMediaKt$HatchEmbodimentMedia$37$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Bitmap> {
        public final /* synthetic */ C1BO<Function0<Bitmap>> $capture$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(C1BO<? extends Function0<Bitmap>> c1bo) {
            super(0);
            this.$capture$delegate = c1bo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Bitmap invoke() {
            return (Bitmap) C1BO.A0A(this.$capture$delegate).invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$37$1(C1BO<? extends G0U<? super Function0<Bitmap>, Unit>> c1bo, C1BO<? extends Function0<Bitmap>> c1bo2) {
        super(1);
        this.$currentOnFrameCaptureAvailable$delegate = c1bo;
        this.$capture$delegate = c1bo2;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        C1BO.A0B(this.$currentOnFrameCaptureAvailable$delegate).invoke(new AnonymousClass1(this.$capture$delegate));
        final C1BO<G0U<Function0<Bitmap>, Unit>> c1bo = this.$currentOnFrameCaptureAvailable$delegate;
        return new C78g() { // from class: com.facebook.aura.partners.voice.ui.HatchEmbodimentMediaKt$HatchEmbodimentMedia$37$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                C1BO.A0B(c1bo).invoke(null);
            }
        };
    }
}
