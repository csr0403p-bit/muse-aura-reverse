package X;

import com.google.gson.JsonIOException;

/* loaded from: classes5.dex */
public final class F5X implements InterfaceC6739EXx {
    public final int $t;
    public final String A00;

    public F5X(String str, int i) {
        this.$t = i;
        this.A00 = str;
    }

    @Override // X.InterfaceC6739EXx
    public final Object A6t() {
        int i = this.$t;
        throw new JsonIOException(this.A00);
    }
}
