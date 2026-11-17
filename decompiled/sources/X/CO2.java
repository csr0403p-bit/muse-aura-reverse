package X;

/* loaded from: classes5.dex */
public final class CO2 extends COS {
    public final String A00;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        r1 = r4.A00;
        r3 = (r0 = ((X.CO2) r5).A00).length();
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r5) {
        /*
            r4 = this;
            X.COS r5 = (X.COS) r5
            int r3 = r5.A01()
            r2 = 3
            if (r2 != r3) goto L1e
            X.CO2 r5 = (X.CO2) r5
            java.lang.String r1 = r4.A00
            java.lang.String r0 = r5.A00
            int r3 = r0.length()
            int r2 = r1.length()
            if (r2 != r3) goto L1e
            int r2 = r1.compareTo(r0)
            return r2
        L1e:
            int r2 = r2 - r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CO2.compareTo(java.lang.Object):int");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((CO2) obj).A00);
    }

    public final String toString() {
        return FGI.A0U("\"", this.A00, "\"");
    }

    public CO2(String str) {
        this.A00 = str;
    }

    public final int hashCode() {
        return BV7.A0D(BV4.A0Y(), this.A00);
    }
}
