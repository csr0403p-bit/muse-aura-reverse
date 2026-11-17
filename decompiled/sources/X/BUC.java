package X;

import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.PressGestureScopeImpl;
import androidx.compose.foundation.gestures.ScrollingLogic;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BUC extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BUC(Object obj, AOH<T> aoh, HtJ<? super BUC> htJ) {
        super(2, aoh);
        this.$t = htJ;
        this.A01 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        Object obj5;
        Object obj6;
        int i2;
        Object obj7;
        int i3;
        Object obj8;
        int i4;
        BUC buc;
        Object obj9;
        Object obj10;
        int i5;
        BUC buc2;
        Object obj11;
        Object obj12;
        int i6;
        G0W g0w;
        PressGestureScopeImpl pressGestureScopeImpl;
        C1299Agk c1299Agk;
        int i7;
        Object obj13;
        Object obj14;
        int i8;
        switch (this.$t) {
            case 0:
                obj7 = this.A01;
                i3 = 0;
                return new BUC(obj7, htJ, i3);
            case 1:
                obj4 = this.A03;
                obj3 = this.A01;
                obj2 = this.A02;
                i = 1;
                return new BUC(obj4, obj2, obj3, (AMS<AMN>) htJ, (HtJ<? super BUC>) i);
            case 2:
                obj3 = this.A01;
                obj2 = this.A02;
                obj4 = this.A03;
                i = 2;
                return new BUC(obj4, obj2, obj3, (AMS<AMN>) htJ, (HtJ<? super BUC>) i);
            case 3:
                obj3 = this.A01;
                obj2 = this.A02;
                obj4 = this.A03;
                i = 3;
                return new BUC(obj4, obj2, obj3, (AMS<AMN>) htJ, (HtJ<? super BUC>) i);
            case 4:
                obj4 = this.A03;
                obj2 = this.A02;
                obj3 = this.A01;
                i = 4;
                return new BUC(obj4, obj2, obj3, (AMS<AMN>) htJ, (HtJ<? super BUC>) i);
            case 5:
                obj8 = this.A03;
                i4 = 5;
                BUC buc3 = new BUC(obj8, htJ, i4, 42);
                buc3.A01 = obj;
                return buc3;
            case 6:
                obj11 = this.A01;
                obj12 = this.A03;
                i6 = 6;
                buc2 = new BUC(obj12, htJ, obj11, (HtJ<? super BUC>) i6);
                buc2.A02 = obj;
                return buc2;
            case 7:
                obj11 = this.A01;
                obj12 = this.A03;
                i6 = 7;
                buc2 = new BUC(obj12, htJ, obj11, (HtJ<? super BUC>) i6);
                buc2.A02 = obj;
                return buc2;
            case 8:
                obj11 = this.A01;
                obj12 = this.A03;
                i6 = 8;
                buc2 = new BUC(obj12, htJ, obj11, (HtJ<? super BUC>) i6);
                buc2.A02 = obj;
                return buc2;
            case 9:
                buc = new BUC((ScrollingLogic) this.A02, (G0V<? super G0U<? super C1257Aft, Unit>, ? super HtJ<? super Unit>, ? extends Object>) htJ, (ScrollingLogic) this.A01, (HtJ<? super BUC>) 9);
                buc.A03 = obj;
                return buc;
            case 10:
                buc2 = new BUC((ScrollingLogic) this.A03, (G0V<? super G0U<? super C1257Aft, Unit>, ? super HtJ<? super Unit>, ? extends Object>) htJ, (ScrollingLogic) this.A01, (HtJ<? super BUC>) 10);
                buc2.A02 = obj;
                return buc2;
            case 11:
                g0w = (G0W) this.A02;
                pressGestureScopeImpl = (PressGestureScopeImpl) this.A03;
                c1299Agk = (C1299Agk) this.A01;
                i7 = 11;
                return new BUC(pressGestureScopeImpl, (G0W<? super AWo, ? super AWx, ? super HtJ<? super Unit>, ? extends Object>) c1299Agk, (PressGestureScopeImpl) htJ, (C1299Agk) g0w, (HtJ<? super BUC>) i7);
            case 12:
                g0w = (G0W) this.A02;
                pressGestureScopeImpl = (PressGestureScopeImpl) this.A03;
                c1299Agk = (C1299Agk) this.A01;
                i7 = 12;
                return new BUC(pressGestureScopeImpl, (G0W<? super AWo, ? super AWx, ? super HtJ<? super Unit>, ? extends Object>) c1299Agk, (PressGestureScopeImpl) htJ, (C1299Agk) g0w, (HtJ<? super BUC>) i7);
            case 13:
                g0w = (G0W) this.A01;
                pressGestureScopeImpl = (PressGestureScopeImpl) this.A02;
                c1299Agk = (C1299Agk) this.A03;
                i7 = 13;
                return new BUC(pressGestureScopeImpl, (G0W<? super AWo, ? super AWx, ? super HtJ<? super Unit>, ? extends Object>) c1299Agk, (PressGestureScopeImpl) htJ, (C1299Agk) g0w, (HtJ<? super BUC>) i7);
            case 14:
                obj11 = this.A01;
                obj12 = this.A03;
                i6 = 14;
                buc2 = new BUC(obj12, htJ, obj11, (HtJ<? super BUC>) i6);
                buc2.A02 = obj;
                return buc2;
            case 15:
                obj4 = this.A03;
                obj2 = this.A02;
                obj3 = this.A01;
                i = 15;
                return new BUC(obj4, obj2, obj3, (AMS<AMN>) htJ, (HtJ<? super BUC>) i);
            case 16:
                obj4 = this.A03;
                obj2 = this.A02;
                obj3 = this.A01;
                i = 16;
                return new BUC(obj4, obj2, obj3, (AMS<AMN>) htJ, (HtJ<? super BUC>) i);
            case 17:
                buc = new BUC(this.A01, (BRr) this.A02, (InterfaceC2045AxD) htJ, (HtJ<? super BUC>) 17);
                buc.A03 = obj;
                return buc;
            case 18:
                obj13 = this.A03;
                obj14 = this.A01;
                i8 = 18;
                return new BUC(obj13, htJ, obj14, (HtJ<? super BUC>) i8);
            case 19:
                obj4 = this.A03;
                obj2 = this.A02;
                obj3 = this.A01;
                i = 19;
                return new BUC(obj4, obj2, obj3, (AMS<AMN>) htJ, (HtJ<? super BUC>) i);
            case 20:
                obj9 = this.A03;
                obj10 = this.A01;
                i5 = 20;
                buc2 = new BUC(obj9, htJ, obj10, (HtJ<? super BUC>) i5);
                buc2.A02 = obj;
                return buc2;
            case 21:
                obj9 = this.A03;
                obj10 = this.A01;
                i5 = 21;
                buc2 = new BUC(obj9, htJ, obj10, (HtJ<? super BUC>) i5);
                buc2.A02 = obj;
                return buc2;
            case 22:
                obj9 = this.A03;
                obj10 = this.A01;
                i5 = 22;
                buc2 = new BUC(obj9, htJ, obj10, (HtJ<? super BUC>) i5);
                buc2.A02 = obj;
                return buc2;
            case 23:
                obj2 = this.A02;
                obj4 = this.A03;
                obj3 = this.A01;
                i = 23;
                return new BUC(obj4, obj2, obj3, (AMS<AMN>) htJ, (HtJ<? super BUC>) i);
            case 24:
                obj5 = this.A01;
                obj6 = this.A02;
                i2 = 24;
                buc = new BUC(obj5, (BRr) obj6, (InterfaceC2045AxD) htJ, (HtJ<? super BUC>) i2);
                buc.A03 = obj;
                return buc;
            case 25:
                obj8 = this.A03;
                i4 = 25;
                BUC buc32 = new BUC(obj8, htJ, i4, 42);
                buc32.A01 = obj;
                return buc32;
            case 26:
                obj7 = this.A01;
                i3 = 26;
                return new BUC(obj7, htJ, i3);
            case 27:
                obj4 = this.A03;
                obj3 = this.A01;
                obj2 = this.A02;
                i = 27;
                return new BUC(obj4, obj2, obj3, (AMS<AMN>) htJ, (HtJ<? super BUC>) i);
            case 28:
                obj5 = this.A01;
                obj6 = this.A02;
                i2 = 28;
                buc = new BUC(obj5, (BRr) obj6, (InterfaceC2045AxD) htJ, (HtJ<? super BUC>) i2);
                buc.A03 = obj;
                return buc;
            case 29:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 29;
                return new BUC(obj4, obj2, obj3, (AMS<AMN>) htJ, (HtJ<? super BUC>) i);
            default:
                obj13 = this.A03;
                obj14 = this.A01;
                i8 = 30;
                return new BUC(obj13, htJ, obj14, (HtJ<? super BUC>) i8);
        }
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        HtJ htJ;
        Object obj3;
        int i;
        BUC buc;
        switch (this.$t) {
            case 0:
                htJ = (HtJ) obj2;
                obj3 = this.A01;
                i = 0;
                buc = new BUC(obj3, htJ, i);
                break;
            case 26:
                htJ = (HtJ) obj2;
                obj3 = this.A01;
                i = 26;
                buc = new BUC(obj3, htJ, i);
                break;
            default:
                buc = (BUC) C8j3.A1E(obj2, obj, this);
                break;
        }
        return buc.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:377:0x0872, code lost:
    
        if (r0 == r1) goto L378;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0753 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0178 A[Catch: all -> 0x018c, TryCatch #4 {all -> 0x018c, blocks: (B:68:0x016f, B:69:0x0172, B:71:0x0178, B:65:0x0162, B:73:0x0186, B:64:0x015e), top: B:394:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0186 A[Catch: all -> 0x018c, TRY_LEAVE, TryCatch #4 {all -> 0x018c, blocks: (B:68:0x016f, B:69:0x0172, B:71:0x0178, B:65:0x0162, B:73:0x0186, B:64:0x015e), top: B:394:0x0145 }] */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.BUC, X.HtJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x016c -> B:69:0x0172). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BUC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BUC(ScrollingLogic scrollingLogic, G0V<? super G0U<? super C1257Aft, Unit>, ? super HtJ<? super Unit>, ? extends Object> g0v, ScrollingLogic scrollingLogic2, HtJ<? super BUC> htJ) {
        super(2, g0v);
        this.$t = htJ;
        if (9 - htJ != 0) {
            this.A03 = scrollingLogic;
            this.A01 = scrollingLogic2;
        } else {
            this.A01 = scrollingLogic2;
            this.A02 = scrollingLogic;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BUC(PressGestureScopeImpl pressGestureScopeImpl, G0W<? super AWo, ? super AWx, ? super HtJ<? super Unit>, ? extends Object> g0w, PressGestureScopeImpl pressGestureScopeImpl2, C1299Agk c1299Agk, HtJ<? super BUC> htJ) {
        super(2, pressGestureScopeImpl2);
        this.$t = htJ;
        switch (htJ) {
            case 11:
            case 12:
                this.A02 = c1299Agk;
                this.A03 = pressGestureScopeImpl;
                this.A01 = g0w;
                break;
            default:
                this.A01 = c1299Agk;
                this.A02 = pressGestureScopeImpl;
                this.A03 = g0w;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BUC(Object obj, G0W<? super AcX, ? super InterfaceC1153Acj<T>, ? super HtJ<? super Unit>, ? extends Object> g0w, AnchoredDraggableState<T> anchoredDraggableState, HtJ<? super BUC> htJ) {
        super(2, g0w);
        this.$t = htJ;
        this.A01 = anchoredDraggableState;
        this.A03 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BUC(Object obj, AOP<AMP<T>> aop, C0981AMm<AMN, AMP<T>> c0981AMm, AMS<AMN> ams, HtJ<? super BUC> htJ) {
        super(2, ams);
        this.$t = htJ;
        this.A02 = aop;
        this.A01 = c0981AMm;
        this.A03 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BUC(Object obj, BRr bRr, InterfaceC2045AxD interfaceC2045AxD, HtJ<? super BUC> htJ) {
        super(2, interfaceC2045AxD);
        this.$t = htJ;
        this.A02 = bRr;
        this.A01 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BUC(Object obj, HtJ htJ, int i, int i2) {
        super(2, htJ);
        this.$t = i;
        this.A03 = obj;
    }
}
