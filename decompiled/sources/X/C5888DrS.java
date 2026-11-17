package X;

import kotlin.jvm.functions.Function0;

/* renamed from: X.DrS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5888DrS extends AbstractC7559F3s implements Function0 {
    public final int $t;
    public final Object A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5888DrS(String str, Object obj, int i) {
        super(0);
        this.$t = i;
        this.A01 = str;
        this.A00 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        return 1 - this.$t != 0 ? ((Function0) this.A00).invoke() : ((G0U) this.A00).invoke(this.A01);
    }
}
