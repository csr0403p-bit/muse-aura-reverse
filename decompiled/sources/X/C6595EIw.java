package X;

import java.util.List;

/* renamed from: X.EIw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6595EIw {
    public List<String> A00;
    public final String A01;
    public final List<String> A02;
    public final boolean A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public C6595EIw(String str, boolean z, List<String> list, List<String> list2) {
        AnonymousClass005.A11(str, list, list2, 0);
        this.A01 = str;
        this.A03 = z;
        this.A02 = list;
        this.A00 = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = C60O.A11(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.A00 = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6595EIw)) {
            return false;
        }
        C6595EIw c6595EIw = (C6595EIw) obj;
        if (this.A03 != c6595EIw.A03 || !this.A02.equals(c6595EIw.A02) || !this.A00.equals(c6595EIw.A00)) {
            return false;
        }
        String str = this.A01;
        return str.startsWith("index_") ? c6595EIw.A01.startsWith("index_") : str.equals(c6595EIw.A01);
    }

    public final int hashCode() {
        String str = this.A01;
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0F(this.A02, (((str.startsWith("index_") ? -1184239155 : str.hashCode()) * 31) + (this.A03 ? 1 : 0)) * 31));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("\n            |Index {\n            |   name = '");
        sbA0x.append(this.A01);
        sbA0x.append("',\n            |   unique = '");
        sbA0x.append(this.A03);
        sbA0x.append("',\n            |   columns = {");
        sbA0x.append(FGI.A0M(C6tn.A07(AbstractC0878AGe.A0L(",", "", "", this.A02, null), "    "), C6tn.A07("},", "    ")));
        sbA0x.append("\n            |   orders = {");
        sbA0x.append(FGI.A0M(C6tn.A07(AbstractC0878AGe.A0L(",", "", "", this.A00, null), "    "), C6tn.A07(" }", "    ")));
        return C6tn.A07(C6tn.A04(AnonymousClass001.A0v("\n            |}\n        ", sbA0x)), "    ");
    }
}
