package X;

import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.EWl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC6706EWl implements Runnable {
    public static final String __redex_internal_original_name = "PttRequestImpl$3$1";
    public final /* synthetic */ EWI A00;
    public final /* synthetic */ C6709EWo A01;
    public final /* synthetic */ C6703EWg A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ Executor A04;

    public RunnableC6706EWl(EWI ewi, C6709EWo c6709EWo, C6703EWg c6703EWg, Map map, Executor executor) {
        this.A02 = c6703EWg;
        this.A03 = map;
        this.A00 = ewi;
        this.A04 = executor;
        this.A01 = c6709EWo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EWe.A02(this.A00, this.A01.A01, this.A02, this.A03, this.A04);
    }
}
