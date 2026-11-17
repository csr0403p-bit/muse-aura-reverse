package X;

/* renamed from: X.Dxy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6212Dxy extends Thread {
    public static final String __redex_internal_original_name = "SimpleDecoder$1";
    public final /* synthetic */ AbstractC6191Dxb A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6212Dxy(AbstractC6191Dxb abstractC6191Dxb) {
        super("ExoPlayer:SimpleDecoder");
        this.A00 = abstractC6191Dxb;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (AbstractC6191Dxb.A00(this.A00));
    }
}
