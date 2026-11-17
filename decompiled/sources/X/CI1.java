package X;

import java.io.OutputStream;
import java.io.Writer;

/* loaded from: classes5.dex */
public abstract class CI1 {
    public int A00;
    public final C4C A01;
    public final CI3 A02;
    public final Writer A03;
    public final /* synthetic */ CI5 A04;

    public CI1(C4C c4c, CI5 ci5, OutputStream outputStream) {
        this.A04 = ci5;
        this.A01 = c4c;
        CFU cfu = new CFU(new CFT(outputStream, ci5.A05), ci5.A08);
        this.A03 = cfu;
        this.A02 = new CI3(cfu);
    }
}
