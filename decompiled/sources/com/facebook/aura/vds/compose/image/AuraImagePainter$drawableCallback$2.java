package com.facebook.aura.vds.compose.image;

import X.AbstractC7559F3s;
import X.C7384Etj;
import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraImagePainter$drawableCallback$2 extends AbstractC7559F3s implements Function0<AnonymousClass1> {
    public final /* synthetic */ AuraImagePainter this$0;

    /* renamed from: com.facebook.aura.vds.compose.image.AuraImagePainter$drawableCallback$2$1, reason: invalid class name */
    public final class AnonymousClass1 implements Drawable.Callback {
        public final /* synthetic */ AuraImagePainter this$0;

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C7384Etj.A0Y(runnable, 1);
            AuraImagePainter.MAIN_HANDLER$delegate.getValue().postAtTime(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C7384Etj.A0Y(runnable, 1);
            AuraImagePainter.MAIN_HANDLER$delegate.getValue().removeCallbacks(runnable);
        }

        public AnonymousClass1(AuraImagePainter auraImagePainter) {
            this.this$0 = auraImagePainter;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            AuraImagePainter auraImagePainter = this.this$0;
            int i = AuraImagePainter.$stable;
            this.this$0.setDrawInvalidateCount(auraImagePainter.drawInvalidateCount$delegate.AGd() + 1);
            AuraImagePainter auraImagePainter2 = this.this$0;
            auraImagePainter2.m2582setDrawableIntrinsicSizeuvyYCjk(auraImagePainter2.m2581getIntrinsicSizeOrUnspecified7Ah8Wj8(auraImagePainter2.drawableAsDrawable));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraImagePainter$drawableCallback$2(AuraImagePainter auraImagePainter) {
        super(0);
        this.this$0 = auraImagePainter;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1 invoke() {
        return new AnonymousClass1(this.this$0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ AnonymousClass1 invoke() {
        return new AnonymousClass1(this.this$0);
    }
}
