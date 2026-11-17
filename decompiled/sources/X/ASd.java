package X;

/* loaded from: classes4.dex */
public final class ASd extends Ab8<ASc> {
    public final C06m A04;
    public final int A03 = Integer.MAX_VALUE;
    public final int A01 = 1200;
    public final int A02 = 1200;
    public final float A00 = 30.0f;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ASd) {
                ASd aSd = (ASd) obj;
                if (this.A03 != aSd.A03 || this.A01 != aSd.A01 || this.A02 != aSd.A02 || !C7384Etj.areEqual(this.A04, aSd.A04) || !C1DG.A08(this.A00, aSd.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        return new ASc(this.A04, this.A00, this.A03, this.A01, this.A02);
    }

    @Override // X.Ab8
    public final int hashCode() {
        return C8j4.A06(AnonymousClass005.A0F(this.A04, ((((this.A03 * 31 * 31) + this.A01) * 31) + this.A02) * 31), this.A00);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "basicMarquee";
        BHD bhd = asf.A02;
        bhd.A01("iterations", Integer.valueOf(this.A03));
        bhd.A01("animationMode", new C1037ASe());
        bhd.A01("delayMillis", Integer.valueOf(this.A01));
        bhd.A01("initialDelayMillis", Integer.valueOf(this.A02));
        bhd.A01("spacing", this.A04);
        bhd.A01("velocity", C8j3.A0k(this.A00));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("MarqueeModifierElement(iterations=");
        sbA0x.append(this.A03);
        sbA0x.append(", animationMode=");
        sbA0x.append((Object) "Immediately");
        sbA0x.append(", delayMillis=");
        sbA0x.append(this.A01);
        sbA0x.append(", initialDelayMillis=");
        sbA0x.append(this.A02);
        sbA0x.append(", spacing=");
        sbA0x.append(this.A04);
        sbA0x.append(", velocity=");
        return AnonymousClass007.A0Z(C1DG.A05(this.A00), sbA0x);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        ASc aSc = (ASc) abstractC1439Aj8;
        int i = this.A03;
        int i2 = this.A01;
        int i3 = this.A02;
        C06m c06m = this.A04;
        float f = this.A00;
        aSc.A0B.Af8(c06m);
        aSc.A09.Af8(new C1037ASe());
        if (aSc.A03 == i && aSc.A01 == i2 && aSc.A02 == i3 && C1DG.A08(aSc.A00, f)) {
            return;
        }
        aSc.A03 = i;
        aSc.A01 = i2;
        aSc.A02 = i3;
        aSc.A00 = f;
        ASc.A00(aSc);
    }

    public ASd(C06m c06m) {
        this.A04 = c06m;
    }
}
