package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Matcher;

/* renamed from: X.7lE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C06857lE extends AbstractC0890AGr implements Collection, BOA {
    public final /* synthetic */ C06847l8 A00;

    public C06857lE(C06847l8 c06847l8) {
        this.A00 = c06847l8;
    }

    @Override // X.AbstractC0890AGr
    public final int A0D() {
        return this.A00.A01.groupCount() + 1;
    }

    public final C1YK A0E(int i) {
        Matcher matcher = this.A00.A01;
        ADq aDqA0C = ATD.A0C(matcher.start(i), matcher.end(i));
        if (aDqA0C.A00 < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        C7384Etj.A0U(strGroup);
        return new C1YK(strGroup, aDqA0C);
    }

    @Override // X.AbstractC0890AGr, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof C1YK)) {
            return super.contains(obj);
        }
        return false;
    }

    @Override // X.AbstractC0890AGr, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // X.AbstractC0890AGr, java.util.Collection, java.lang.Iterable
    public final Iterator<C1YK> iterator() {
        C8iN c8iNA06 = AbstractC0878AGe.A06(AbstractC0885AGm.A12(this));
        C8i5 c8i5 = new C8i5(this, 5);
        AnonymousClass003.A0u(c8iNA06, c8i5);
        return new C7AH(new C7AG(c8i5, c8iNA06));
    }
}
