package X;

import androidx.glance.appwidget.GlanceAppWidget;

/* renamed from: X.FtS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8910FtS extends HzP {
    public final int $t;
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8910FtS(int i, HtJ<? super C8910FtS> htJ) {
        super(htJ);
        this.$t = i;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        switch (this.$t) {
            case 0:
                this.A05 = obj;
                this.A01 |= Integer.MIN_VALUE;
                return ((GlanceAppWidget) this.A06).deleted$glance_appwidget(null, 0, this);
            case 1:
            case 2:
            case 4:
            default:
                this.A05 = obj;
                this.A01 |= Integer.MIN_VALUE;
                return ((C10647I0r) this.A06).emit(null, this);
            case 3:
                this.A06 = obj;
                this.A01 |= Integer.MIN_VALUE;
                return AbstractC9777Gfy.A02(null, this);
            case 5:
                this.A06 = obj;
                this.A01 |= Integer.MIN_VALUE;
                return AbstractC9777Gfy.A03(null, this);
            case 6:
                this.A05 = obj;
                this.A01 |= Integer.MIN_VALUE;
                return ((BSS) this.A06).emit(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8910FtS(Object obj, GlanceAppWidget glanceAppWidget, HtJ<? super C8910FtS> htJ) {
        super(glanceAppWidget);
        this.$t = htJ;
        this.A06 = obj;
    }
}
