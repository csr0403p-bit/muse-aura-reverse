package X;

/* renamed from: X.9zk, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9zk {
    public static final C9zk A00 = new C9zk();

    public C9zk() {
        if (C9zl.A00("")) {
            return;
        }
        C9zl.A00("");
    }

    public final void A00(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("prefix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("suffix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("removeLeadingZeros = ");
        sb.append(false);
        sb.append(',');
        sb.append('\n');
        sb.append(str);
        sb.append("minLength = ");
        sb.append(1);
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append("NumberHexFormat(\n");
        A00(sbA0w, "    ");
        sbA0w.append('\n');
        return AnonymousClass001.A0v(")", sbA0w);
    }
}
