package com.facebook.aura.conversation.view.richcontent;

import X.ASR;
import X.AST;
import X.AT3;
import X.AaI;
import X.AbstractC1290Aga;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C10343HBh;
import X.C1DO;
import X.C60O;
import X.C7384Etj;
import X.C79;
import X.G0U;
import X.HBA;
import X.HBD;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RectF;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class HatchMermaidContentKt$MermaidSvgCanvas$1$1 extends AbstractC7559F3s implements G0U<AST, ASR> {
    public final /* synthetic */ HBA $svg;

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchMermaidContentKt$MermaidSvgCanvas$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
        public final /* synthetic */ float $offsetX;
        public final /* synthetic */ float $offsetY;
        public final /* synthetic */ Picture $picture;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AT3 at3) {
            C7384Etj.A0Y(at3, 0);
            Canvas canvasA00 = AbstractC1290Aga.A00(((AaI) at3.AEq()).A02.A02.A01);
            float f = this.$offsetX;
            float f2 = this.$offsetY;
            Picture picture = this.$picture;
            canvasA00.save();
            canvasA00.translate(f, f2);
            canvasA00.drawPicture(picture);
            canvasA00.restore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f, float f2, Picture picture) {
            super(1);
            this.$offsetX = f;
            this.$offsetY = f2;
            this.$picture = picture;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
            invoke2(at3);
            return Unit.INSTANCE;
        }
    }

    @Override // X.G0U
    public final ASR invoke(AST ast) {
        float fA00;
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        C7384Etj.A0Y(ast, 0);
        RectF rectFA03 = this.$svg.A03();
        float fA002 = 0.0f;
        if (rectFA03 == null || rectFA03.width() <= 0.0f || rectFA03.height() <= 0.0f) {
            fA00 = C1DO.A00(ast);
            fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & ast.A00.AKb()));
            fIntBitsToFloat2 = 0.0f;
        } else {
            float fWidth = rectFA03.width() / rectFA03.height();
            float fA003 = C1DO.A00(ast) / Float.intBitsToFloat((int) (ast.A00.AKb() & 4294967295L));
            long jAKb = ast.A00.AKb();
            if (fWidth > fA003) {
                fA00 = AnonymousClass001.A00(jAKb);
                fIntBitsToFloat = C1DO.A00(ast) / fWidth;
            } else {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jAKb & 4294967295L));
                fA00 = Float.intBitsToFloat((int) (ast.A00.AKb() & 4294967295L)) * fWidth;
            }
            fA002 = (C1DO.A00(ast) - fA00) / 2.0f;
            fIntBitsToFloat2 = (Float.intBitsToFloat((int) (4294967295L & ast.A00.AKb())) - fIntBitsToFloat) / 2.0f;
        }
        HBA hba = this.$svg;
        C10343HBh c10343HBh = hba.A01;
        if (c10343HBh == null) {
            throw C60O.A0i("SVG document is empty");
        }
        HBD hbd = new HBD();
        hbd.A00 = fA00;
        Integer num = C79.A00;
        hbd.A01 = num;
        c10343HBh.A01 = hbd;
        HBD hbd2 = new HBD();
        hbd2.A00 = fIntBitsToFloat;
        hbd2.A01 = num;
        c10343HBh.A00 = hbd2;
        return ast.A00(new AnonymousClass1(fA002, fIntBitsToFloat2, hba.A02((int) fA00, (int) fIntBitsToFloat)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMermaidContentKt$MermaidSvgCanvas$1$1(HBA hba) {
        super(1);
        this.$svg = hba;
    }
}
