package com.facebook.aura.conversation.view;

import X.AT3;
import X.AWA;
import X.AaJ;
import X.AbstractC1561Alb;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.B6A;
import X.C16a;
import X.C1710Aot;
import X.C7384Etj;
import X.G0U;
import android.graphics.Path;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchActivityCardKt$StatusCircle$1$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ long $color;
    public final /* synthetic */ boolean $isDone;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        float fA01 = AWA.A01(at3.AKb()) / 2.0f;
        boolean z = this.$isDone;
        long j = this.$color;
        if (!z) {
            at3.A9N(null, AaJ.A00(null, at3.Ah4(1.0f), 0), fA01 - at3.Ah4(0.5f), 1.0f, 3, j, at3.ADU());
            return;
        }
        at3.A9N(null, C16a.A00, fA01, 1.0f, 3, j, at3.ADU());
        C1710Aot c1710AotA00 = AbstractC1561Alb.A00();
        long jAKb = at3.AKb();
        float fA00 = AnonymousClass001.A00(jAKb) * 0.28f;
        float fA012 = AnonymousClass001.A01(jAKb, 4294967295L) * 0.5f;
        Path path = c1710AotA00.A03;
        path.moveTo(fA00, fA012);
        long jAKb2 = at3.AKb();
        path.lineTo(AnonymousClass001.A00(jAKb2) * 0.44f, AnonymousClass001.A01(jAKb2, 4294967295L) * 0.66f);
        long jAKb3 = at3.AKb();
        path.lineTo(AnonymousClass001.A00(jAKb3) * 0.72f, AnonymousClass001.A01(jAKb3, 4294967295L) * 0.36f);
        at3.A9d(null, c1710AotA00, new AaJ(null, at3.Ah4(1.5f), 4.0f, 1, 0), 1.0f, 3, B6A.A08);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchActivityCardKt$StatusCircle$1$1(boolean z, long j) {
        super(1);
        this.$isDone = z;
        this.$color = j;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
