package X;

/* loaded from: classes4.dex */
public abstract class AOd {
    public float A01(int i) {
        if (this instanceof AT9) {
            AT9 at9 = (AT9) this;
            if (i == 0) {
                return at9.A00;
            }
            if (i == 1) {
                return at9.A01;
            }
            if (i == 2) {
                return at9.A02;
            }
            if (i == 3) {
                return at9.A03;
            }
            return 0.0f;
        }
        if (!(this instanceof ATA)) {
            ARY ary = (ARY) this;
            if (i == 0) {
                return ary.A00;
            }
            if (i == 1) {
                return ary.A01;
            }
            return 0.0f;
        }
        ATA ata = (ATA) this;
        if (i == 0) {
            return ata.A00;
        }
        if (i == 1) {
            return ata.A01;
        }
        if (i == 2) {
            return ata.A02;
        }
        return 0.0f;
    }

    public int A02() {
        if (this instanceof AT9) {
            return 4;
        }
        return this instanceof ATA ? 3 : 2;
    }

    public AOd A03() {
        if (this instanceof AT9) {
            AT9 at9 = new AT9();
            at9.A00 = 0.0f;
            at9.A01 = 0.0f;
            at9.A02 = 0.0f;
            at9.A03 = 0.0f;
            return at9;
        }
        if (!(this instanceof ATA)) {
            return new ARY(0.0f, 0.0f);
        }
        ATA ata = new ATA();
        ata.A00 = 0.0f;
        ata.A01 = 0.0f;
        ata.A02 = 0.0f;
        return ata;
    }

    public void A04() {
        if (!(this instanceof AT9)) {
            ATA ata = (ATA) this;
            ata.A00 = 0.0f;
            ata.A01 = 0.0f;
            ata.A02 = 0.0f;
            return;
        }
        AT9 at9 = (AT9) this;
        at9.A00 = 0.0f;
        at9.A01 = 0.0f;
        at9.A02 = 0.0f;
        at9.A03 = 0.0f;
    }

    public void A05(int i, float f) {
        if (this instanceof AT9) {
            AT9 at9 = (AT9) this;
            if (i == 0) {
                at9.A00 = f;
                return;
            }
            if (i == 1) {
                at9.A01 = f;
                return;
            } else if (i == 2) {
                at9.A02 = f;
                return;
            } else {
                if (i == 3) {
                    at9.A03 = f;
                    return;
                }
                return;
            }
        }
        if (!(this instanceof ATA)) {
            ARY ary = (ARY) this;
            if (i == 0) {
                ary.A00 = f;
                return;
            } else {
                if (i == 1) {
                    ary.A01 = f;
                    return;
                }
                return;
            }
        }
        ATA ata = (ATA) this;
        if (i == 0) {
            ata.A00 = f;
        } else if (i == 1) {
            ata.A01 = f;
        } else if (i == 2) {
            ata.A02 = f;
        }
    }
}
