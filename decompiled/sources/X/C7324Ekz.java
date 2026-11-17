package X;

/* renamed from: X.Ekz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7324Ekz {
    public final int A00;
    public final InterfaceC7327El2<Throwable> A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        String str;
        String str2;
        Throwable th;
        Throwable th2;
        String str3;
        String str4;
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C7324Ekz c7324Ekz = (C7324Ekz) obj;
                if (this.A00 != c7324Ekz.A00 || (((str = this.A02) != (str2 = c7324Ekz.A02) && (str == null || !str.equals(str2))) || (((th = this.A01.get()) != (th2 = c7324Ekz.A01.get()) && (th == null || !th.equals(th2))) || ((str3 = this.A03) != (str4 = c7324Ekz.A03) && (str3 == null || !str3.equals(str4)))))) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV6.A0A(this.A02, this.A03, AnonymousClass001.A0h(), Integer.valueOf(this.A00));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("SoftError{mCategory='");
        sbA0x.append(this.A02);
        sbA0x.append("', mMessage='");
        sbA0x.append(this.A03);
        sbA0x.append("', mCause=");
        sbA0x.append(this.A01.get());
        sbA0x.append(", mFailHarder=");
        sbA0x.append(false);
        sbA0x.append(", mSamplingFrequency=");
        sbA0x.append(this.A00);
        sbA0x.append(", mOnlyIfEmployeeOrBetaBuild=");
        sbA0x.append(false);
        return C8j3.A15(sbA0x);
    }

    public C7324Ekz(final C7323Eky c7323Eky) {
        this.A02 = c7323Eky.A01;
        this.A03 = c7323Eky.A02;
        this.A00 = c7323Eky.A00;
        this.A01 = new C7325El0(new InterfaceC7327El2() { // from class: X.El1
            @Override // X.InterfaceC7327El2
            public final Object get() {
                Throwable th = c7323Eky.A03;
                if (th != null) {
                    return th;
                }
                return null;
            }
        });
    }
}
