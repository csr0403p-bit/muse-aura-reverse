package androidx.compose.runtime;

import X.Ab1;
import X.AbstractC07117nq;
import X.AnonymousClass001;
import X.AnonymousClass007;
import X.BOZ;
import X.C0862A6j;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.C8j3;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1", f = "PausableComposition.kt", l = {579}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class ComposePausableCompositionException$operationsSequence$1 extends AbstractC07117nq implements G0V<BOZ<? super String>, HtJ<? super Unit>, Object> {
    public int I$0;
    public int I$1;
    public int I$2;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ ComposePausableCompositionException this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposePausableCompositionException$operationsSequence$1(ComposePausableCompositionException composePausableCompositionException, HtJ<? super ComposePausableCompositionException$operationsSequence$1> htJ) {
        super(2, htJ);
        this.this$0 = composePausableCompositionException;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        ComposePausableCompositionException$operationsSequence$1 composePausableCompositionException$operationsSequence$1 = new ComposePausableCompositionException$operationsSequence$1(this.this$0, htJ);
        composePausableCompositionException$operationsSequence$1.L$0 = obj;
        return composePausableCompositionException$operationsSequence$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3;
        BOZ boz;
        String strA0a;
        int iA01;
        StringBuilder sbA0y;
        int i4;
        int iA012;
        int i5;
        Object objA03;
        String str;
        Object obj2 = EnumC10460Hji.A02;
        int i6 = this.label;
        if (i6 == 0) {
            Hwg.A00(obj);
            i = 0;
            i2 = 0;
            i3 = 0;
            boz = (BOZ) this.L$0;
        } else {
            if (i6 != 1) {
                throw AnonymousClass001.A0n();
            }
            i3 = this.I$2;
            i2 = this.I$1;
            i = this.I$0;
            BOZ boz2 = (BOZ) this.L$0;
            Hwg.A00(obj);
            boz = boz2;
        }
        while (true) {
            ComposePausableCompositionException composePausableCompositionException = this.this$0;
            int i7 = composePausableCompositionException.lastOperation + 10;
            Ab1 ab1 = composePausableCompositionException.operations;
            if (i >= Math.min(i7, ab1.A00)) {
                return Unit.INSTANCE;
            }
            int i8 = i + 1;
            int iA013 = ab1.A01(i);
            switch (iA013) {
                case 0:
                    strA0a = "up";
                    break;
                case 1:
                    strA0a = AnonymousClass007.A0a("down ", this.this$0.instances.A03(i2));
                    i2++;
                    break;
                case 2:
                    int iA014 = this.this$0.operations.A01(i8);
                    i8 = i + 3;
                    iA01 = this.this$0.operations.A01(i + 2);
                    sbA0y = C60O.A0y("remove ", iA014);
                    sbA0y.append(' ');
                    sbA0y.append(iA01);
                    strA0a = sbA0y.toString();
                    break;
                case 3:
                    int iA015 = this.this$0.operations.A01(i8);
                    int iA016 = this.this$0.operations.A01(i + 2);
                    i8 = i + 4;
                    iA01 = this.this$0.operations.A01(i + 3);
                    sbA0y = C60O.A0y("move ", iA015);
                    sbA0y.append(' ');
                    sbA0y.append(iA016);
                    sbA0y.append(' ');
                    sbA0y.append(iA01);
                    strA0a = sbA0y.toString();
                    break;
                case 4:
                    strA0a = "clear";
                    break;
                case 5:
                    i4 = i + 2;
                    iA012 = this.this$0.operations.A01(i8);
                    i5 = i2 + 1;
                    objA03 = this.this$0.instances.A03(i2);
                    str = "insertBottomUp ";
                    StringBuilder sbA0y2 = C60O.A0y(str, iA012);
                    sbA0y2.append(' ');
                    strA0a = C8j3.A14(objA03, sbA0y2);
                    i8 = i4;
                    i2 = i5;
                    break;
                case 6:
                    i4 = i + 2;
                    iA012 = this.this$0.operations.A01(i8);
                    i5 = i2 + 1;
                    objA03 = this.this$0.instances.A03(i2);
                    str = "insertTopDown ";
                    StringBuilder sbA0y22 = C60O.A0y(str, iA012);
                    sbA0y22.append(' ');
                    strA0a = C8j3.A14(objA03, sbA0y22);
                    i8 = i4;
                    i2 = i5;
                    break;
                case 7:
                    Object objA032 = this.this$0.instances.A03(i2);
                    C7384Etj.A0Z(objA032, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                    C0862A6j.A02(objA032, 2);
                    i2 += 2;
                    strA0a = AnonymousClass007.A0a("apply ", objA032);
                    break;
                case 8:
                    strA0a = C8j3.A14(this.this$0.reused.A03(i3), C60O.A0x("reuse "));
                    i3++;
                    break;
                case 9:
                    strA0a = "recompose pending";
                    break;
                default:
                    strA0a = FGI.A0H("unknown op: ", iA013);
                    break;
            }
            StringBuilder sbA0w = C60O.A0w();
            sbA0w.append(i);
            String strA1M = C60P.A1M(": ", strA0a, sbA0w);
            this.L$0 = boz;
            this.I$0 = i8;
            this.I$1 = i2;
            this.I$2 = i3;
            this.label = 1;
            if (boz.A00(strA1M, this) == obj2) {
                return obj2;
            }
            i = i8;
        }
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(BOZ<? super String> boz, HtJ<? super Unit> htJ) {
        return ((ComposePausableCompositionException$operationsSequence$1) C8j3.A1E(htJ, boz, this)).invokeSuspend(Unit.INSTANCE);
    }
}
