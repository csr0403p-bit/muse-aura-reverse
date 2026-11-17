package X;

/* renamed from: X.Byf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3115Byf implements InterfaceC5403Dhw {
    public final float A00;
    public final float A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C3115Byf c3115Byf = (C3115Byf) obj;
                if (this.A00 != c3115Byf.A00 || this.A01 != c3115Byf.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC5403Dhw
    public final /* synthetic */ byte[] AMp() {
        return null;
    }

    @Override // X.InterfaceC5403Dhw
    public final /* synthetic */ C6154Dwx AMq() {
        return null;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(Float.valueOf(this.A01), BV8.A09(Float.valueOf(this.A00)));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3115Byf(float r3, float r4) {
        /*
            r2 = this;
            r2.<init>()
            r0 = -1028390912(0xffffffffc2b40000, float:-90.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L1c
            r0 = 1119092736(0x42b40000, float:90.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L1c
            r0 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L1c
            r0 = 1127481344(0x43340000, float:180.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L1d
        L1c:
            r1 = 0
        L1d:
            java.lang.String r0 = "Invalid latitude or longitude"
            X.C1G.A09(r1, r0)
            r2.A00 = r3
            r2.A01 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3115Byf.<init>(float, float):void");
    }

    @Override // X.InterfaceC5403Dhw
    public final /* synthetic */ void AY7(C10389Has c10389Has) {
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("xyz: latitude=");
        sbA0x.append(this.A00);
        sbA0x.append(AbstractC7606F5t.A00(20));
        sbA0x.append(this.A01);
        return sbA0x.toString();
    }
}
