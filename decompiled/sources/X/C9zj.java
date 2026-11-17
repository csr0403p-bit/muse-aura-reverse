package X;

/* renamed from: X.9zj, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9zj {
    public static final C9zj A02 = new C9zj();
    public final boolean A00;
    public final boolean A01;

    public C9zj() {
        this.A01 = "".length() == 0;
        this.A00 = C9zl.A00("  ") || C9zl.A00("") || C9zl.A00("") || C9zl.A00("");
    }

    public final void A00(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("bytesPerLine = ");
        sb.append(Integer.MAX_VALUE);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("bytesPerGroup = ");
        sb.append(Integer.MAX_VALUE);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("groupSeparator = \"");
        sb.append("  ");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSeparator = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("bytePrefix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSuffix = \"");
        sb.append("");
        sb.append("\"");
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append("BytesHexFormat(\n");
        A00(sbA0w, "    ");
        sbA0w.append('\n');
        return AnonymousClass001.A0v(")", sbA0w);
    }
}
