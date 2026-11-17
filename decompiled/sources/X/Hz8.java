package X;

import java.util.Map;

/* loaded from: classes6.dex */
public final class Hz8 implements Runnable {
    public static final String __redex_internal_original_name = "IapBloksBridge$resolveBloksRequest$1";
    public final /* synthetic */ HyV A00;
    public final /* synthetic */ F6D A01;
    public final /* synthetic */ Map<String, Object> A02;

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<Ljava/lang/String;+Ljava/lang/Object;>;LX/HyV;LX/F6D;)V */
    public Hz8(HyV hyV, F6D f6d, Map map) {
        this.A02 = map;
        this.A00 = hyV;
        this.A01 = f6d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC7691FAk.A00(this.A01, C9115Fyg.A03(C9115Fyg.A00(), this.A02, 0), this.A00.A01);
    }
}
