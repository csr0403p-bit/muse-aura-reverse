package X;

import X.AOd;
import androidx.compose.runtime.MutableState;

/* renamed from: X.ASu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1050ASu<T, V extends AOd> implements C1BO<T> {
    public long A00;
    public AOc<T> A01;
    public C0997AOa<T, V> A02;
    public T A03;
    public T A04;
    public boolean A05;
    public boolean A06;
    public final C31w<T, V> A07;
    public final MutableState A08;
    public final /* synthetic */ C1049ASt A09;

    /* JADX WARN: Incorrect types in method signature: (TT;TT;LX/31w<TT;TV;>;LX/AOc<TT;>;Ljava/lang/String;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public C1050ASu(AOc aOc, C1049ASt c1049ASt, C31w c31w, Object obj, Object obj2) {
        this.A09 = c1049ASt;
        this.A03 = obj;
        this.A04 = obj2;
        this.A07 = c31w;
        this.A08 = AbstractC1798ArH.A06(obj);
        this.A01 = aOc;
        this.A02 = new C0997AOa<>(aOc, null, c31w, this.A03, this.A04);
    }

    @Override // X.C1BO
    public final T getValue() {
        return (T) this.A08.getValue();
    }
}
