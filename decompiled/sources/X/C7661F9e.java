package X;

/* renamed from: X.F9e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7661F9e extends AbstractC7629F7m {
    public final Object A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7661F9e) {
                C7661F9e c7661F9e = (C7661F9e) obj;
                if (!C7384Etj.areEqual(this.A02, c7661F9e.A02) || !C7384Etj.areEqual(this.A00, c7661F9e.A00) || !C7384Etj.areEqual(this.A03, c7661F9e.A03) || !C7384Etj.areEqual(this.A01, c7661F9e.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0I(this.A03, AnonymousClass005.A0F(this.A00, AnonymousClass001.A0G(this.A02))) + AnonymousClass006.A0D(this.A01);
    }

    public final String toString() {
        String str = this.A02;
        Object obj = this.A00;
        String str2 = this.A03;
        Object obj2 = this.A01;
        StringBuilder sbA0x = C3cI.A0x("SnapshotAndVariableUpdate(dataModuleType=", str);
        sbA0x.append(", snapshot=");
        sbA0x.append(obj);
        sbA0x.append(", variableIdentifier=");
        sbA0x.append(str2);
        return C3cJ.A0L(obj2, ", value=", sbA0x);
    }

    public C7661F9e(Object obj, Object obj2, String str, String str2) {
        AnonymousClass005.A0x(str, obj, str2);
        this.A02 = str;
        this.A00 = obj;
        this.A03 = str2;
        this.A01 = obj2;
    }
}
