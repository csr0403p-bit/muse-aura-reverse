package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.6x5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6x5 {
    public static final Set<String> A0A = Collections.unmodifiableSet(new HashSet(Arrays.asList("Desktop", "Automotive", "Mobile", "Tablet", "XR", "EInk", "Watch")));
    public int A00;
    public boolean A01;
    public boolean A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List<C6x6> A08;
    public final List<String> A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6x5) {
                C6x5 c6x5 = (C6x5) obj;
                if (this.A01 != c6x5.A01 || this.A00 != c6x5.A00 || this.A02 != c6x5.A02 || !C6xC.A00(this.A08, c6x5.A08) || !C6xC.A00(this.A04, c6x5.A04) || !C6xC.A00(this.A06, c6x5.A06) || !C6xC.A00(this.A07, c6x5.A07) || !C6xC.A00(this.A03, c6x5.A03) || !C6xC.A00(this.A05, c6x5.A05) || !C6xC.A00(this.A09, c6x5.A09)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A08, this.A04, this.A06, this.A07, this.A03, this.A05, Boolean.valueOf(this.A01), Integer.valueOf(this.A00), Boolean.valueOf(this.A02), this.A09});
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<LX/6x6;>;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIZLjava/util/List<Ljava/lang/String;>;)V */
    public C6x5(String str, String str2, String str3, String str4, String str5, List list, List list2, int i, boolean z, boolean z2) {
        this.A08 = list;
        this.A04 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A03 = str4;
        this.A05 = str5;
        this.A01 = z;
        this.A00 = i;
        this.A02 = z2;
        this.A09 = list2;
    }
}
