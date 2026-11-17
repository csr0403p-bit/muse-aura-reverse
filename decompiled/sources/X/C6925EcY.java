package X;

import androidx.room.coroutines.PassthroughConnection;

/* renamed from: X.EcY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6925EcY extends HzP {
    public final int $t;
    public int A00;
    public int A01;
    public Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C6925EcY(Object obj, PassthroughConnection passthroughConnection, HtJ<? super C6925EcY> htJ) {
        super(passthroughConnection);
        this.$t = htJ;
        this.A03 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i = this.$t;
        this.A02 = obj;
        this.A01 |= Integer.MIN_VALUE;
        Object obj2 = this.A03;
        return i != 0 ? ((F5A) obj2).A00(0, this) : PassthroughConnection.A00(null, (PassthroughConnection) obj2, this, null);
    }
}
