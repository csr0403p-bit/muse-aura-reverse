package X;

import androidx.glance.appwidget.LayoutConfiguration$Companion;
import androidx.work.CoroutineWorker;

/* renamed from: X.8iQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8iQ extends HzP {
    public final int $t;
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8iQ(Object obj, LayoutConfiguration$Companion layoutConfiguration$Companion, HtJ<? super C8iQ> htJ) {
        super(layoutConfiguration$Companion);
        this.$t = htJ;
        this.A04 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        switch (this.$t) {
            case 0:
                this.A03 = obj;
                this.A01 |= Integer.MIN_VALUE;
                return ((LayoutConfiguration$Companion) this.A04).A01(null, 0, this);
            case 1:
                this.A03 = obj;
                this.A01 |= Integer.MIN_VALUE;
                return ((CoroutineWorker) this.A04).doWork(this);
            default:
                this.A04 = obj;
                this.A01 |= Integer.MIN_VALUE;
                return C8fm.A00(this, null, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8iQ(HtJ<? super C8iQ> htJ) {
        super(htJ);
        this.$t = 2;
    }
}
