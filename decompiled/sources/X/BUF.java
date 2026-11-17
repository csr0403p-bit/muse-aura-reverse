package X;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.foundation.gestures.DragGestureNode;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BUF extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        int i2;
        Object obj9;
        int i3;
        Object obj10;
        Object obj11;
        int i4;
        Object obj12;
        Object obj13;
        Object obj14;
        int i5;
        switch (this.$t) {
            case 0:
                obj5 = this.A01;
                obj8 = this.A03;
                obj6 = this.A02;
                obj7 = this.A04;
                i2 = 0;
                return new BUF(obj6, obj7, obj5, obj8, htJ, i2);
            case 1:
                obj10 = this.A01;
                obj11 = this.A04;
                i4 = 1;
                BUF buf = new BUF(obj11, obj10, htJ, i4);
                buf.A02 = obj;
                return buf;
            case 2:
                obj10 = this.A01;
                obj11 = this.A04;
                i4 = 2;
                BUF buf2 = new BUF(obj11, obj10, htJ, i4);
                buf2.A02 = obj;
                return buf2;
            case 3:
                obj9 = this.A04;
                i3 = 3;
                BUF buf3 = new BUF(obj9, htJ, i3);
                buf3.A01 = obj;
                return buf3;
            case 4:
                obj9 = this.A04;
                i3 = 4;
                BUF buf32 = new BUF(obj9, htJ, i3);
                buf32.A01 = obj;
                return buf32;
            case 5:
                obj12 = this.A03;
                obj13 = this.A02;
                obj14 = this.A01;
                i5 = 5;
                BUF buf4 = new BUF(obj12, obj13, obj14, htJ, (HtJ<? super BUF>) i5);
                buf4.A04 = obj;
                return buf4;
            case 6:
                obj2 = this.A01;
                obj3 = this.A04;
                obj4 = this.A02;
                i = 6;
                BUF buf5 = new BUF(obj3, (G0U<? super AuT, Unit>) obj4, (AuP) htJ, (InterfaceC1766AqJ) obj2, (HtJ<? super BUF>) i);
                buf5.A03 = obj;
                return buf5;
            case 7:
                obj7 = this.A04;
                obj8 = this.A03;
                obj6 = this.A02;
                obj5 = this.A01;
                i2 = 7;
                return new BUF(obj6, obj7, obj5, obj8, htJ, i2);
            case 8:
                obj7 = this.A04;
                obj8 = this.A03;
                obj5 = this.A01;
                obj6 = this.A02;
                i2 = 8;
                return new BUF(obj6, obj7, obj5, obj8, htJ, i2);
            case 9:
                obj5 = this.A01;
                obj6 = this.A02;
                obj7 = this.A04;
                obj8 = this.A03;
                i2 = 9;
                return new BUF(obj6, obj7, obj5, obj8, htJ, i2);
            case 10:
                obj2 = this.A01;
                obj3 = this.A04;
                obj4 = this.A02;
                i = 10;
                BUF buf52 = new BUF(obj3, (G0U<? super AuT, Unit>) obj4, (AuP) htJ, (InterfaceC1766AqJ) obj2, (HtJ<? super BUF>) i);
                buf52.A03 = obj;
                return buf52;
            default:
                obj12 = this.A03;
                obj14 = this.A01;
                obj13 = this.A02;
                i5 = 11;
                BUF buf42 = new BUF(obj12, obj13, obj14, htJ, (HtJ<? super BUF>) i5);
                buf42.A04 = obj;
                return buf42;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BUF(Object obj, DragGestureNode dragGestureNode, HtJ<? super BUF> htJ) {
        super(2, dragGestureNode);
        this.$t = htJ;
        this.A04 = obj;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:131:0x02b0 -> B:123:0x027e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00ac -> B:27:0x007f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c6 -> B:27:0x007f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0115 -> B:43:0x00f1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0121 -> B:43:0x00f1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x019d -> B:69:0x0175). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x01ec -> B:69:0x0175). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x01f1 -> B:69:0x0175). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x0202 -> B:69:0x0175). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x0214 -> B:69:0x0175). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BUF.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BUF) C8j3.A1E(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BUF(Object obj, MutableState<C1BO<Long>> mutableState, C1049ASt c1049ASt, HtJ<? super BUF> htJ) {
        super(2, c1049ASt);
        this.$t = htJ;
        this.A01 = mutableState;
        this.A04 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BUF(Object obj, G0U<? super AuT, Unit> g0u, AuP auP, InterfaceC1766AqJ interfaceC1766AqJ, HtJ<? super BUF> htJ) {
        super(2, auP);
        this.$t = htJ;
        this.A01 = interfaceC1766AqJ;
        this.A04 = obj;
        this.A02 = g0u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BUF(Object obj, AT5<AaC, AT9> at5, AaC aaC, AP0 ap0, ARF arf, HtJ<? super BUF> htJ) {
        super(2, arf);
        this.$t = htJ;
        this.A01 = aaC;
        this.A03 = ap0;
        this.A02 = obj;
        this.A04 = at5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BUF(Object obj, SeekableTransitionState<AMP<T>> seekableTransitionState, AMP<T> amp, AOP<AMP<T>> aop, HtJ<? super BUF> htJ) {
        super(2, aop);
        this.$t = htJ;
        this.A03 = obj;
        this.A01 = amp;
        this.A02 = seekableTransitionState;
    }
}
