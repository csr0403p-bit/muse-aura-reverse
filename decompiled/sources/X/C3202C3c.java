package X;

import java.util.zip.ZipEntry;

/* renamed from: X.C3c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3202C3c extends C30 implements Comparable<C3202C3c> {
    public final int A00;
    public final ZipEntry A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C3202C3c c3202C3c = (C3202C3c) obj;
                if (!this.A01.equals(c3202C3c.A01) || this.A00 != c3202C3c.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C3202C3c c3202C3c) {
        return super.A01.compareTo(((C30) c3202C3c).A01);
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, this.A00 * 31);
    }

    public C3202C3c(String str, ZipEntry zipEntry, int i) {
        super(str, String.valueOf(zipEntry.getCrc()));
        this.A01 = zipEntry;
        this.A00 = i;
    }
}
