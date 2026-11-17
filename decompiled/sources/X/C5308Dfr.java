package X;

/* renamed from: X.Dfr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5308Dfr extends AbstractC5306Dfp<T>.ObserverWrapper implements Dg3 {
    public final C1HY A00;
    public final /* synthetic */ AbstractC5306Dfp A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5308Dfr(C1HY c1hy, C1HY c1hy2, Bs1<? super T> bs1) {
        super(c1hy2, bs1);
        this.A01 = c1hy2;
        this.A00 = c1hy;
    }

    @Override // X.Dg3
    public final void onStateChanged(C1HY c1hy, EnumC3085Bxl enumC3085Bxl) {
        C1HY c1hy2 = this.A00;
        EnumC10573Huf enumC10573HufA0m = C8j3.A0m(c1hy2);
        EnumC10573Huf enumC10573Huf = enumC10573HufA0m;
        if (enumC10573HufA0m == EnumC10573Huf.A03) {
            this.A01.A07(this.A02);
            return;
        }
        EnumC10573Huf enumC10573Huf2 = null;
        while (enumC10573Huf2 != enumC10573HufA0m) {
            A00(C8j3.A0m(c1hy2).A00(EnumC10573Huf.A06));
            enumC10573HufA0m = C8j3.A0m(c1hy2);
            enumC10573Huf2 = enumC10573Huf;
            enumC10573Huf = enumC10573HufA0m;
        }
    }
}
