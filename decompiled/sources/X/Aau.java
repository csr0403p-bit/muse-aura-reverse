package X;

/* loaded from: classes4.dex */
public final class Aau implements Aar {
    public final float A00;
    public final C1124Aav A01;

    /* JADX WARN: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016a A[EDGE_INSN: B:92:0x016a->B:56:0x016a BREAK  A[LOOP:2: B:80:0x01f3->B:95:?], SYNTHETIC] */
    @Override // X.Aar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long AEv(float r28, float r29, float r30) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Aau.AEv(float, float, float):long");
    }

    @Override // X.AOc
    public final /* bridge */ /* synthetic */ InterfaceC0999AOh vectorize(C31w c31w) {
        return new C1122Aan(new Aax(this));
    }

    public Aau(float f, float f2, float f3) {
        this.A00 = f3;
        C1124Aav c1124Aav = new C1124Aav();
        c1124Aav.A02 = 1.0f;
        double dSqrt = Math.sqrt(50.0d);
        c1124Aav.A00 = dSqrt;
        c1124Aav.A01 = 1.0f;
        if (f < 0.0f) {
            throw C60O.A0i("Damping ratio must be non-negative");
        }
        c1124Aav.A01 = f;
        if (((float) (dSqrt * dSqrt)) <= 0.0f) {
            throw C60O.A0i("Spring stiffness constant must be positive.");
        }
        c1124Aav.A00 = Math.sqrt(f2);
        this.A01 = c1124Aav;
    }

    @Override // X.Aar
    public final float AMT(float f, float f2, float f3, long j) {
        C1124Aav c1124Aav = this.A01;
        c1124Aav.A02 = f2;
        return AnonymousClass003.A03(c1124Aav.A00(f, f3, j / 1000000));
    }

    @Override // X.Aar
    public final float AMZ(float f, float f2, float f3, long j) {
        C1124Aav c1124Aav = this.A01;
        c1124Aav.A02 = f2;
        return AnonymousClass004.A00(c1124Aav.A00(f, f3, j / 1000000));
    }

    @Override // X.Aar
    public final float AFD(float f, float f2, float f3) {
        return 0.0f;
    }

    public Aau() {
        this(1.0f, 1500.0f, 0.01f);
    }
}
