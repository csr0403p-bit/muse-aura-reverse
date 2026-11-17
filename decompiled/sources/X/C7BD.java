package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.7BD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7BD implements Iterator<String>, BOA {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final CharSequence A04;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException(C8j2.A00(0));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.A02;
        if (i == 0) {
            int i2 = 2;
            if (this.A00 >= 0) {
                CharSequence charSequence = this.A04;
                int length = charSequence.length();
                int length2 = charSequence.length();
                for (int i3 = this.A03; i3 < length2; i3++) {
                    char cCharAt = charSequence.charAt(i3);
                    if (cCharAt != '\n') {
                        if (cCharAt == '\r') {
                            int i4 = i3 + 1;
                            if (i4 >= charSequence.length() || charSequence.charAt(i4) != '\n') {
                            }
                            length = i3;
                            break;
                        }
                    }
                    i2 = 1;
                    length = i3;
                    break;
                }
                i2 = -1;
                this.A02 = 1;
                this.A00 = i2;
                this.A01 = length;
                return true;
            }
            this.A02 = 2;
        } else if (i == 1) {
            return true;
        }
        return false;
    }

    public C7BD(CharSequence charSequence) {
        this.A04 = charSequence;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.A02 = 0;
        int i = this.A01;
        int i2 = this.A03;
        this.A03 = this.A00 + i;
        return this.A04.subSequence(i2, i).toString();
    }
}
