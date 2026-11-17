package X;

/* renamed from: X.1D3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1D3 extends C1DE {
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1D3) {
                C1DE c1de = (C1DE) obj;
                if (!C7384Etj.areEqual(this.A03, c1de.A03) || !C7384Etj.areEqual(this.A02, c1de.A02) || !C7384Etj.areEqual(this.A00, c1de.A00) || !C7384Etj.areEqual(this.A01, c1de.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.APS
    public final Object APb(Object obj, final float f) {
        if (C7384Etj.areEqual(obj, C1OM.A00) || obj == null) {
            C1DA c1da = new C1DA();
            obj = new C1D3(c1da, c1da, c1da, c1da);
        }
        if (!(obj instanceof C1D3)) {
            return null;
        }
        C1DE c1de = (C1DE) obj;
        final C1D5 c1d5 = this.A03;
        final C1D5 c1d52 = c1de.A03;
        C1D5 c1d53 = new C1D5() { // from class: X.1D4
            @Override // X.C1D5
            /* renamed from: toPx-TmRCtEA */
            public final float mo1toPxTmRCtEA(long j, AXN axn) {
                return AnonymousClass003.A01(f, c1d5.mo1toPxTmRCtEA(j, axn), c1d52.mo1toPxTmRCtEA(j, axn));
            }
        };
        final C1D5 c1d54 = this.A02;
        final C1D5 c1d55 = c1de.A02;
        C1D5 c1d56 = new C1D5() { // from class: X.1D4
            @Override // X.C1D5
            /* renamed from: toPx-TmRCtEA */
            public final float mo1toPxTmRCtEA(long j, AXN axn) {
                return AnonymousClass003.A01(f, c1d54.mo1toPxTmRCtEA(j, axn), c1d55.mo1toPxTmRCtEA(j, axn));
            }
        };
        final C1D5 c1d57 = this.A00;
        final C1D5 c1d58 = c1de.A00;
        C1D5 c1d59 = new C1D5() { // from class: X.1D4
            @Override // X.C1D5
            /* renamed from: toPx-TmRCtEA */
            public final float mo1toPxTmRCtEA(long j, AXN axn) {
                return AnonymousClass003.A01(f, c1d57.mo1toPxTmRCtEA(j, axn), c1d58.mo1toPxTmRCtEA(j, axn));
            }
        };
        final C1D5 c1d510 = this.A01;
        final C1D5 c1d511 = c1de.A01;
        return new C1D3(c1d53, c1d56, c1d59, new C1D5() { // from class: X.1D4
            @Override // X.C1D5
            /* renamed from: toPx-TmRCtEA */
            public final float mo1toPxTmRCtEA(long j, AXN axn) {
                return AnonymousClass003.A01(f, c1d510.mo1toPxTmRCtEA(j, axn), c1d511.mo1toPxTmRCtEA(j, axn));
            }
        });
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass005.A0F(this.A00, AnonymousClass005.A0F(this.A02, AnonymousClass005.A0E(this.A03))));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedCornerShape(topStart = ");
        sb.append(this.A03);
        sb.append(", topEnd = ");
        sb.append(this.A02);
        sb.append(", bottomEnd = ");
        sb.append(this.A00);
        sb.append(", bottomStart = ");
        return AnonymousClass007.A0Z(this.A01, sb);
    }
}
