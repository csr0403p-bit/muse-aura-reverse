package X;

import java.util.Collections;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.5qq, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C5qq<T> implements AMP<T> {
    public final BRL<T> A00;
    public final Object A01;
    public final List<BRL<T>> A02;
    public final List<BRL<T>> A03;
    public final G0V<BFM, Integer, Unit> A04 = AnonymousClass001.A0M(new AnonymousClass608(this, 2), -322904035);

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C5qq c5qq = (C5qq) obj;
                if (!C7384Etj.areEqual(this.A01, c5qq.A01) || !C7384Etj.areEqual(this.A00, c5qq.A00) || !C7384Etj.areEqual(this.A03, c5qq.A03) || !C7384Etj.areEqual(this.A02, c5qq.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AMP
    public final G0V<BFM, Integer, Unit> getContent() {
        return this.A04;
    }

    @Override // X.AMP
    public final List<BRL<T>> getEntries() {
        return this.A02;
    }

    @Override // X.AMP
    public final Object getKey() {
        return this.A01;
    }

    @Override // X.AMP
    public final List<BRL<T>> getPreviousEntries() {
        return this.A03;
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A01) + AnonymousClass005.A0E(this.A00) + AnonymousClass005.A0E(this.A03) + AnonymousClass005.A0E(this.A02);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SinglePaneScene(key=");
        sb.append(this.A01);
        sb.append(", entry=");
        sb.append(this.A00);
        sb.append(", previousEntries=");
        sb.append(this.A03);
        sb.append(", entries=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5qq(Object obj, BRL<T> brl, List<BRL<T>> list) {
        this.A01 = brl;
        this.A00 = obj;
        this.A03 = list;
        this.A02 = Collections.singletonList(obj);
    }
}
