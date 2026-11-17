package X;

import java.util.List;

/* renamed from: X.DoG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5721DoG implements Runnable {
    public static final String __redex_internal_original_name = "GrootPlayerLogger$logPausedEvent$1";
    public final /* synthetic */ C5643DmX A00;
    public final /* synthetic */ C6060Duv A01;
    public final /* synthetic */ Dq8 A02;
    public final /* synthetic */ C5623Dm6 A03;
    public final /* synthetic */ List<C3067Bwp> A04;

    /* JADX WARN: Failed to parse method signature: (Ljava/util/List<LX/Bwp;>;LX/DmX;LX/Dm6;Ljava/lang/String;Ljava/lang/String;LX/Dq8;LX/Duv;ILX/Dnz;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;)V
    jadx.core.utils.exceptions.JadxRuntimeException: Arguments count limit reached: 16
    	at jadx.core.dex.nodes.parser.SignatureParser.consumeMethodArgs(SignatureParser.java:342)
    	at jadx.core.dex.visitors.SignatureProcessor.parseMethodSignature(SignatureProcessor.java:187)
    	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:40)
     */
    public RunnableC5721DoG(C5643DmX c5643DmX, C6060Duv c6060Duv, Dq8 dq8, C5623Dm6 c5623Dm6, List list) {
        this.A04 = list;
        this.A00 = c5643DmX;
        this.A03 = c5623Dm6;
        this.A02 = dq8;
        this.A01 = c6060Duv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<C3067Bwp> list = this.A04;
        if (list != null) {
            C3066Bwo.A02(list, 0, list.size());
        }
    }
}
