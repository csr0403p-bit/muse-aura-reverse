package com.facebook.aura.library.view;

import X.AT3;
import X.AW9;
import X.AbstractC1290Aga;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.B6A;
import X.C7384Etj;
import X.G0U;
import X.HDi;
import X.HxS;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.aura.header.view.ScrimScrollState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$3$1$3$2$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ ScrimScrollState $scrimState;
    public final /* synthetic */ Paint $tabShadowPaint;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        ScrimScrollState scrimScrollState = this.$scrimState;
        float progress = (scrimScrollState != null ? scrimScrollState.getProgress() : 0.0f) * 0.08f;
        if (progress > 0.0f) {
            this.$tabShadowPaint.setColor(0);
            Paint paint = this.$tabShadowPaint;
            float fAh4 = at3.Ah4(HatchLibraryTabScreenKt.TAB_SHADOW_BLUR);
            long j = B6A.A01;
            paint.setShadowLayer(fAh4, 0.0f, 0.0f, HxS.A01(HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), progress)));
            float fA01 = AnonymousClass001.A01(at3.AKb(), 4294967295L) / 2.0f;
            Canvas canvasA00 = AbstractC1290Aga.A00(AW9.A01(at3));
            long jAKb = at3.AKb();
            canvasA00.drawRoundRect(0.0f, 0.0f, AnonymousClass003.A03(jAKb), AnonymousClass001.A01(jAKb, 4294967295L), fA01, fA01, this.$tabShadowPaint);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$3$1$3$2$1(ScrimScrollState scrimScrollState, Paint paint) {
        super(1);
        this.$scrimState = scrimScrollState;
        this.$tabShadowPaint = paint;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
