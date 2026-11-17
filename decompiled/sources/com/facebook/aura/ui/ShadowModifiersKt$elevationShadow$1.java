package com.facebook.aura.ui;

import X.ASR;
import X.AST;
import X.AT3;
import X.AW6;
import X.AW9;
import X.AaC;
import X.AbstractC1555AlK;
import X.AbstractC1561Alb;
import X.AbstractC7559F3s;
import X.B6A;
import X.C1069ATz;
import X.C1097AYh;
import X.C1710Aot;
import X.C1776AqX;
import X.C1DM;
import X.C3cG;
import X.C7384Etj;
import X.G0U;
import X.HDi;
import X.HxS;
import X.InterfaceC1068ATy;
import X.InterfaceC1327AhE;
import X.InterfaceC1330AhH;
import android.graphics.Paint;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ShadowModifiersKt$elevationShadow$1 extends AbstractC7559F3s implements G0U<AST, ASR> {
    public final /* synthetic */ float $alpha;
    public final /* synthetic */ long $color;
    public final /* synthetic */ float $elevation;
    public final /* synthetic */ C1DM $shape;

    /* renamed from: com.facebook.aura.ui.ShadowModifiersKt$elevationShadow$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
        public final /* synthetic */ AbstractC1555AlK $outline;
        public final /* synthetic */ InterfaceC1330AhH $paint;
        public final /* synthetic */ InterfaceC1068ATy $roundedPath;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AT3 at3) {
            C7384Etj.A0Y(at3, 0);
            AbstractC1555AlK abstractC1555AlK = this.$outline;
            InterfaceC1330AhH interfaceC1330AhH = this.$paint;
            InterfaceC1068ATy interfaceC1068ATy = this.$roundedPath;
            InterfaceC1327AhE interfaceC1327AhEA01 = AW9.A01(at3);
            if (abstractC1555AlK instanceof C1097AYh) {
                AaC aaC = ((C1097AYh) abstractC1555AlK).A00;
                interfaceC1327AhEA01.A9e(interfaceC1330AhH, aaC.A01, aaC.A03, aaC.A02, aaC.A00);
                return;
            }
            if (abstractC1555AlK instanceof AW6) {
                if (interfaceC1068ATy == null) {
                    return;
                }
            } else {
                if (!(abstractC1555AlK instanceof C1069ATz)) {
                    throw C3cG.A0q();
                }
                interfaceC1068ATy = ((C1069ATz) abstractC1555AlK).A00;
            }
            interfaceC1327AhEA01.A9b(interfaceC1330AhH, interfaceC1068ATy);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC1555AlK abstractC1555AlK, InterfaceC1330AhH interfaceC1330AhH, InterfaceC1068ATy interfaceC1068ATy) {
            super(1);
            this.$outline = abstractC1555AlK;
            this.$paint = interfaceC1330AhH;
            this.$roundedPath = interfaceC1068ATy;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
            invoke2(at3);
            return Unit.INSTANCE;
        }
    }

    @Override // X.G0U
    public final ASR invoke(AST ast) {
        AW6 aw6;
        C7384Etj.A0Y(ast, 0);
        C1776AqX c1776AqX = new C1776AqX();
        Paint paint = c1776AqX.A01;
        long j = this.$color;
        paint.setColor(HxS.A01(HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.0f)));
        float fAEm = this.$elevation * ast.AEm();
        long j2 = this.$color;
        paint.setShadowLayer(fAEm, 0.0f, 0.0f, HxS.A01(HxS.A04(HDi.A0O[(int) (j2 & 63)], B6A.A03(j2), B6A.A02(j2), B6A.A01(j2), this.$alpha)));
        AbstractC1555AlK abstractC1555AlKMo2createOutlinePq9zytI = this.$shape.mo2createOutlinePq9zytI(ast.A00.AKb(), ast.A00.getLayoutDirection(), ast);
        C1710Aot c1710AotA00 = null;
        if ((abstractC1555AlKMo2createOutlinePq9zytI instanceof AW6) && (aw6 = (AW6) abstractC1555AlKMo2createOutlinePq9zytI) != null) {
            c1710AotA00 = AbstractC1561Alb.A00();
            c1710AotA00.A3t(aw6.A00);
        }
        return ast.A00(new AnonymousClass1(abstractC1555AlKMo2createOutlinePq9zytI, c1776AqX, c1710AotA00));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowModifiersKt$elevationShadow$1(long j, float f, float f2, C1DM c1dm) {
        super(1);
        this.$color = j;
        this.$elevation = f;
        this.$alpha = f2;
        this.$shape = c1dm;
    }
}
