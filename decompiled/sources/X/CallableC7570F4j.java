package X;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: X.F4j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class CallableC7570F4j implements Callable {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public CallableC7570F4j(Object obj, Object obj2, Object obj3, String str, String str2, String str3, int i, boolean z) {
        this.$t = i;
        this.A00 = obj;
        this.A01 = obj3;
        this.A02 = obj2;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.$t;
        C9Y c9y = (C9Y) this.A00;
        return i != 0 ? c9y.m22x7584b71b(this.A03, (Map) this.A01, (List) this.A02, this.A04, this.A05, this.A06) : c9y.m23xb88d2233((Map) this.A01, (File) this.A02, this.A03, this.A04, this.A05, this.A06);
    }
}
