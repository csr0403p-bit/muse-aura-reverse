package X;

import java.lang.annotation.Annotation;
import java.util.List;

/* renamed from: X.9if, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C07709if implements C9iZ {
    public final String A00;
    public final AbstractC07679ic A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C07709if) {
                C07709if c07709if = (C07709if) obj;
                if (!this.A00.equals(c07709if.A00) || !this.A01.equals(c07709if.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    private final void A00() {
        throw C3cG.A0Q(FGI.A0U("Primitive descriptor ", this.A00, " does not have elements"));
    }

    @Override // X.C9iZ
    public final int AF6() {
        return 0;
    }

    @Override // X.C9iZ
    public final /* bridge */ /* synthetic */ BL8 AGs() {
        return this.A01;
    }

    @Override // X.C9iZ
    public final String AKP() {
        return this.A00;
    }

    @Override // X.C9iZ
    public final /* synthetic */ boolean AOo() {
        return false;
    }

    @Override // X.C9iZ
    public final /* synthetic */ List getAnnotations() {
        return C0881AGi.A00;
    }

    public final int hashCode() {
        return this.A00.hashCode() + AnonymousClass005.A0E(this.A01);
    }

    @Override // X.C9iZ
    public final /* synthetic */ boolean isInline() {
        return false;
    }

    public final String toString() {
        return C8j4.A0x("PrimitiveDescriptor(", this.A00);
    }

    public C07709if(String str, AbstractC07679ic abstractC07679ic) {
        this.A00 = str;
        this.A01 = abstractC07679ic;
    }

    @Override // X.C9iZ
    public final List<Annotation> AF2(int i) {
        A00();
        throw F60.createAndThrow();
    }

    @Override // X.C9iZ
    public final C9iZ AF3(int i) {
        A00();
        throw F60.createAndThrow();
    }

    @Override // X.C9iZ
    public final int AF4(String str) {
        A00();
        throw F60.createAndThrow();
    }

    @Override // X.C9iZ
    public final String AF5(int i) {
        A00();
        throw F60.createAndThrow();
    }

    @Override // X.C9iZ
    public final boolean AOL(int i) {
        A00();
        throw F60.createAndThrow();
    }
}
