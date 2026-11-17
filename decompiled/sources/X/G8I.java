package X;

import java.util.Collection;
import java.util.List;

/* loaded from: classes6.dex */
public final class G8I implements G8M {
    public final Collection<G7A> A00;
    public final Collection<List<ADq>> A01;
    public final G75 A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof G8I) {
                G8I g8i = (G8I) obj;
                if (!this.A02.equals(g8i.A02) || !this.A00.equals(g8i.A00) || !this.A01.equals(g8i.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.G8M
    public final Collection<G7A> AIc() {
        return this.A00;
    }

    @Override // X.G8M
    public final Collection<List<ADq>> AJN() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass005.A0F(this.A00, AnonymousClass005.A0E(this.A02)));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("LocalParsingResult(iteratorPosition=");
        sbA0x.append(this.A02);
        sbA0x.append(", parsedNodes=");
        sbA0x.append(this.A00);
        sbA0x.append(", rangesToProcessFurther=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/G75;Ljava/util/Collection<LX/G7A;>;Ljava/util/Collection<+Ljava/util/List<LX/ADq;>;>;)V */
    public G8I(Collection collection, Collection collection2, G75 g75) {
        AnonymousClass003.A0x(collection, collection2);
        this.A02 = g75;
        this.A00 = collection;
        this.A01 = collection2;
    }
}
