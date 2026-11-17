package X;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class EKi {
    public final BeM<Throwable> A00;
    public final ED6 A01;
    public final END A02;
    public final ENJ A03;
    public final ENF A04;
    public final CGI A05;
    public final Executor A06;
    public final Executor A07;
    public final C78T A08;

    public EKi(BeM beM, CGI cgi, Executor executor) {
        GBK gbk = AbstractC9266GBt.A00;
        this.A06 = Hu0.A00(gbk.limitedParallelism(BV5.A02(BV5.A00() - 1, 4, 1), null));
        this.A08 = gbk;
        this.A07 = executor == null ? Hu0.A00(gbk) : executor;
        this.A01 = new ENB();
        this.A05 = cgi == null ? CIC.A00 : cgi;
        this.A02 = END.A00;
        this.A03 = new C6633ELd();
        this.A00 = beM;
        this.A04 = new EN6();
    }
}
