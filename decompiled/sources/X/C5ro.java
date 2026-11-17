package X;

import java.util.Map;
import kotlin.Unit;

/* renamed from: X.5ro, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C5ro<K> {
    public final G0U<K, Object> A00;
    public final G0U<K, Map<String, Object>> A01;
    public final G0W<K, BFM, Integer, Unit> A02;
    public final C9uG<K> A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5ro) {
                C5ro c5ro = (C5ro) obj;
                if (!this.A03.equals(c5ro.A03) || !C7384Etj.areEqual(this.A00, c5ro.A00) || !C7384Etj.areEqual(this.A01, c5ro.A01) || !C7384Etj.areEqual(this.A02, c5ro.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, AnonymousClass005.A0F(this.A01, AnonymousClass005.A0F(this.A00, this.A03.hashCode() * 31)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EntryClassProvider(clazz=");
        sb.append(this.A03);
        sb.append(", clazzContentKey=");
        sb.append(this.A00);
        sb.append(AbstractC7606F5t.A00(7));
        sb.append(this.A01);
        sb.append(", content=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Incorrect types in method signature: (LX/9uG<TK;>;LX/G0U<-TK;+Ljava/lang/Object;>;LX/G0U<-TK;+Ljava/util/Map<Ljava/lang/String;+Ljava/lang/Object;>;>;LX/G0W<-TK;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;)V */
    public C5ro(G0U g0u, G0U g0u2, G0W g0w, C9uG c9uG) {
        this.A03 = c9uG;
        this.A00 = g0u;
        this.A01 = g0u2;
        this.A02 = g0w;
    }
}
