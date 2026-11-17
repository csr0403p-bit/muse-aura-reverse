package X;

/* renamed from: X.3bP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3bP implements Ht9, G0U {
    public final int $t;
    public final long A00;

    public C3bP(long j, int i) {
        this.$t = i;
        this.A00 = j;
    }

    @Override // X.G0U
    public final Object invoke(Object obj) {
        if (this.$t != 0) {
            return Long.valueOf(this.A00);
        }
        long j = this.A00;
        AST ast = (AST) obj;
        float fA03 = AnonymousClass003.A03(ast.A00.AKb()) / 2.0f;
        return ast.A01(new BTE(AnonymousClass002.A0S(j), AWB.A00(ast, fA03), fA03, 2));
    }
}
