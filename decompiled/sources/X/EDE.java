package X;

import java.io.File;

/* loaded from: classes5.dex */
public final class EDE implements Runnable {
    public static final String __redex_internal_original_name = "DefaultTempFilePluginController$onPathRequested$1";
    public final /* synthetic */ EDW A00;
    public final /* synthetic */ EDD<T> A01;
    public final /* synthetic */ EDQ A02;
    public final /* synthetic */ File A03;

    /* JADX WARN: Incorrect types in method signature: (LX/EDD<TT;>;LX/EDW;LX/EDQ;Ljava/io/File;)V */
    public EDE(EDW edw, EDD edd, EDQ edq, File file) {
        this.A01 = edd;
        this.A00 = edw;
        this.A02 = edq;
        this.A03 = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.storeData(this.A00, this.A02, this.A03);
    }
}
