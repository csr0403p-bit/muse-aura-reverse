package X;

/* renamed from: X.DjZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5497DjZ extends AbstractC5438DiZ {
    public final C5382DhZ A00;

    @Override // X.InterfaceC5481DjJ
    public final C5382DhZ ALt() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5497DjZ) {
            return this.A00.equals(((C5497DjZ) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return 527 + this.A00.hashCode();
    }

    public C5497DjZ(C5382DhZ c5382DhZ, InterfaceC5441Dic interfaceC5441Dic) {
        super(interfaceC5441Dic);
        this.A00 = c5382DhZ;
    }
}
