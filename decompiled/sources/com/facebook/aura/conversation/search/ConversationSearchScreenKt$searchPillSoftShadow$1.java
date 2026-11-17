package com.facebook.aura.conversation.search;

import X.ASR;
import X.AST;
import X.AT3;
import X.AW9;
import X.AWA;
import X.AbstractC1290Aga;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.C7384Etj;
import X.G0U;
import X.HxS;
import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ConversationSearchScreenKt$searchPillSoftShadow$1 extends AbstractC7559F3s implements G0U<AST, ASR> {
    public final /* synthetic */ float $blur;
    public final /* synthetic */ long $shadowColor;

    /* renamed from: com.facebook.aura.conversation.search.ConversationSearchScreenKt$searchPillSoftShadow$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
        public final /* synthetic */ Paint $paint;
        public final /* synthetic */ float $radiusPx;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AT3 at3) {
            C7384Etj.A0Y(at3, 0);
            float f = this.$radiusPx;
            Paint paint = this.$paint;
            Canvas canvasA00 = AbstractC1290Aga.A00(AW9.A01(at3));
            long jAKb = at3.AKb();
            canvasA00.drawRoundRect(0.0f, 0.0f, AnonymousClass003.A03(jAKb), AnonymousClass004.A00(jAKb), f, f, paint);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f, Paint paint) {
            super(1);
            this.$radiusPx = f;
            this.$paint = paint;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
            invoke2(at3);
            return Unit.INSTANCE;
        }
    }

    @Override // X.G0U
    public final ASR invoke(AST ast) {
        C7384Etj.A0Y(ast, 0);
        float fAEm = this.$blur * ast.AEm();
        float fA01 = AWA.A01(ast.A00.AKb()) / 2.0f;
        Paint paint = new Paint();
        long j = this.$shadowColor;
        paint.setAntiAlias(true);
        paint.setColor(HxS.A01(j));
        paint.setShadowLayer(fAEm, 0.0f, 0.0f, HxS.A01(j));
        return ast.A00(new AnonymousClass1(fA01, paint));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationSearchScreenKt$searchPillSoftShadow$1(float f, long j) {
        super(1);
        this.$blur = f;
        this.$shadowColor = j;
    }
}
