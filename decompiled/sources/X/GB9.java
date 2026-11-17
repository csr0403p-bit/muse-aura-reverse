package X;

/* loaded from: classes6.dex */
public abstract class GB9 extends GBK {
    @Override // X.GBK
    public final GBK limitedParallelism(int i, String str) {
        GBA.A00(i);
        return str != null ? new GBE(str, this) : this;
    }
}
