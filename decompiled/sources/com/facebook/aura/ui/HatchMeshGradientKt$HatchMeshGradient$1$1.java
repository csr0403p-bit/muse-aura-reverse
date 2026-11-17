package com.facebook.aura.ui;

import X.AT3;
import X.AW9;
import X.AbstractC1290Aga;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchMeshGradientKt$HatchMeshGradient$1$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ Paint $paint;
    public final /* synthetic */ C1BO<Integer> $quantizedTime$delegate;
    public final /* synthetic */ Bitmap $renderedBitmap;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        C1BO.A02(this.$quantizedTime$delegate);
        Bitmap bitmap = this.$renderedBitmap;
        Paint paint = this.$paint;
        Canvas canvasA00 = AbstractC1290Aga.A00(AW9.A01(at3));
        long jAKb = at3.AKb();
        canvasA00.drawBitmap(bitmap, (Rect) null, new RectF(0.0f, 0.0f, AnonymousClass003.A03(jAKb), AnonymousClass004.A00(jAKb)), paint);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMeshGradientKt$HatchMeshGradient$1$1(C1BO<Integer> c1bo, Bitmap bitmap, Paint paint) {
        super(1);
        this.$quantizedTime$delegate = c1bo;
        this.$renderedBitmap = bitmap;
        this.$paint = paint;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
