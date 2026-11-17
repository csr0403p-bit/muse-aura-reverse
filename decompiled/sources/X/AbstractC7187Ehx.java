package X;

import java.io.Closeable;
import java.util.Map;

/* renamed from: X.Ehx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7187Ehx<K, T extends Closeable> implements InterfaceC7015EeM<T> {
    public final C7110EgO A00;
    public final InterfaceC7015EeM<T> A01;
    public final String A02;
    public final String A03;
    public final Map<K, AbstractC7187Ehx<K, T>.Multiplexer> A04 = BV4.A0u();

    /* JADX WARN: Incorrect inner types in method signature: (TK;LX/Ehx<TK;TT;>.Multiplexer;)V */
    public final synchronized void A00(C7186Ehw c7186Ehw, Object obj) {
        Map<K, AbstractC7187Ehx<K, T>.Multiplexer> map = this.A04;
        if (map.get(obj) == c7186Ehw) {
            map.remove(obj);
        }
    }

    public AbstractC7187Ehx(C7110EgO c7110EgO, InterfaceC7015EeM interfaceC7015EeM, String str, String str2) {
        this.A01 = interfaceC7015EeM;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = c7110EgO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.InterfaceC7015EeM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AYc(X.InterfaceC7028EeZ<T> r11, X.InterfaceC7029Eea r12) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC7187Ehx.AYc(X.EeZ, X.Eea):void");
    }
}
