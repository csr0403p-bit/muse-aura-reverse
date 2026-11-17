package X;

import java.util.List;

/* renamed from: X.EIx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6596EIx {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List<String> A03;
    public final List<String> A04;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6596EIx)) {
            return false;
        }
        C6596EIx c6596EIx = (C6596EIx) obj;
        if (this.A02.equals(c6596EIx.A02) && this.A00.equals(c6596EIx.A00) && this.A01.equals(c6596EIx.A01) && C7384Etj.areEqual(this.A03, c6596EIx.A03)) {
            return C7384Etj.areEqual(this.A04, c6596EIx.A04);
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A04, AnonymousClass005.A0F(this.A03, AnonymousClass005.A0I(this.A01, AnonymousClass005.A0I(this.A00, AnonymousClass001.A0G(this.A02)))));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("\n            |ForeignKey {\n            |   referenceTable = '");
        sbA0x.append(this.A02);
        sbA0x.append("',\n            |   onDelete = '");
        sbA0x.append(this.A00);
        sbA0x.append("',\n            |   onUpdate = '");
        sbA0x.append(this.A01);
        sbA0x.append("',\n            |   columnNames = {");
        sbA0x.append(FGI.A0M(C6tn.A07(AbstractC0878AGe.A0L(",", "", "", AbstractC0878AGe.A0W(this.A03), null), "    "), C6tn.A07("},", "    ")));
        sbA0x.append("\n            |   referenceColumnNames = {");
        sbA0x.append(FGI.A0M(C6tn.A07(AbstractC0878AGe.A0L(",", "", "", AbstractC0878AGe.A0W(this.A04), null), "    "), C6tn.A07(" }", "    ")));
        return C6tn.A07(C6tn.A04(AnonymousClass001.A0v("\n            |}\n        ", sbA0x)), "    ");
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;Ljava/util/List<Ljava/lang/String;>;)V */
    public C6596EIx(List list, String str, List list2, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = list;
        this.A04 = list2;
    }
}
