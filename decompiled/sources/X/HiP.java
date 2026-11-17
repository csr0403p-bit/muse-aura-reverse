package X;

/* loaded from: classes6.dex */
public final class HiP {
    public final String A00;
    public final String A01;
    public final C9uG<? extends InterfaceC9011Fwo> A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HiP) {
                HiP hiP = (HiP) obj;
                if (!this.A02.equals(hiP.A02) || this.A03 != hiP.A03 || !this.A01.equals(hiP.A01) || !this.A00.equals(hiP.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A00, AnonymousClass005.A0I(this.A01, C0KA.A01(this.A02.hashCode() * 31, this.A03)));
    }

    public final String toString() {
        C9uG<? extends InterfaceC9011Fwo> c9uG = this.A02;
        boolean z = this.A03;
        String str = this.A01;
        String str2 = this.A00;
        StringBuilder sbA0f = C3cG.A0f(c9uG, "RecordMapping(recordClass=");
        sbA0f.append(", isCumulative=");
        sbA0f.append(z);
        sbA0f.append(", unitStr=");
        sbA0f.append(str);
        return C3cJ.A0N(", aggregateUnitStr=", str2, sbA0f);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/9uG<+LX/Fwo;>;ZLjava/lang/String;Ljava/lang/String;)V */
    public HiP(String str, String str2, C9uG c9uG, boolean z) {
        this.A02 = c9uG;
        this.A03 = z;
        this.A01 = str;
        this.A00 = str2;
    }
}
