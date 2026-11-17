package X;

/* renamed from: X.9zi, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9zi {
    public static final C9zi A03;
    public static final C9zi A04;
    public final C9zj A00;
    public final C9zk A01;
    public final boolean A02;

    static {
        C9zj c9zj = C9zj.A02;
        C9zk c9zk = C9zk.A00;
        A03 = new C9zi(c9zj, c9zk, false);
        A04 = new C9zi(c9zj, c9zk, true);
    }

    public C9zi(C9zj c9zj, C9zk c9zk, boolean z) {
        this.A02 = z;
        this.A00 = c9zj;
        this.A01 = c9zk;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append("HexFormat(\n    upperCase = ");
        sbA0w.append(this.A02);
        sbA0w.append(",\n    bytes = BytesHexFormat(\n");
        this.A00.A00(sbA0w, "        ");
        sbA0w.append('\n');
        sbA0w.append("    ),");
        sbA0w.append('\n');
        sbA0w.append("    number = NumberHexFormat(");
        sbA0w.append('\n');
        this.A01.A00(sbA0w, "        ");
        sbA0w.append('\n');
        sbA0w.append("    )");
        sbA0w.append('\n');
        return AnonymousClass001.A0v(")", sbA0w);
    }
}
