package X;

import X.AOd;
import com.facebook.acra.util.JavaProcFileReader;

/* renamed from: X.AOa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0997AOa<T, V extends AOd> implements ATV<T, V> {
    public long A00;
    public V A01;
    public V A02;
    public V A03;
    public T A04;
    public T A05;
    public final V A06;
    public final C31w<T, V> A07;
    public final InterfaceC0999AOh<V> A08;

    @Override // X.ATV
    public final T AMR(long j) {
        if (AOR(j)) {
            return this.A05;
        }
        AOd valueFromNanos = this.A08.getValueFromNanos(j, this.A02, this.A03, this.A06);
        int iA02 = valueFromNanos.A02();
        for (int i = 0; i < iA02; i++) {
            if (Float.isNaN(valueFromNanos.A01(i))) {
                StringBuilder sb = new StringBuilder("AnimationVector cannot contain a NaN. ");
                sb.append(valueFromNanos);
                sb.append(". Animation: ");
                sb.append(this);
                sb.append(", playTimeNanos: ");
                sb.append(j);
                throw new IllegalStateException(sb.toString());
            }
        }
        return (T) ((AOl) this.A07).A00.invoke(valueFromNanos);
    }

    @Override // X.ATV
    public final V AMb(long j) {
        if (!AOR(j)) {
            return (V) this.A08.getVelocityFromNanos(j, this.A02, this.A03, this.A06);
        }
        V v = this.A01;
        if (v != null) {
            return v;
        }
        V v2 = (V) this.A08.getEndVelocity(this.A02, this.A03, this.A06);
        this.A01 = v2;
        return v2;
    }

    public final void A00(T t) {
        if (C7384Etj.areEqual(t, this.A04)) {
            return;
        }
        this.A04 = t;
        this.A02 = (V) AOl.A00(this.A07, t);
        this.A01 = null;
        this.A00 = -1L;
    }

    @Override // X.ATV
    public final long AEu() {
        long j = this.A00;
        if (j >= 0) {
            return j;
        }
        long durationNanos = this.A08.getDurationNanos(this.A02, this.A03, this.A06);
        this.A00 = durationNanos;
        return durationNanos;
    }

    @Override // X.ATV
    public final T ALY() {
        return this.A05;
    }

    @Override // X.ATV
    public final C31w<T, V> AMB() {
        return this.A07;
    }

    @Override // X.ATV
    public final boolean isInfinite() {
        return this.A08.isInfinite();
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("TargetBasedAnimation: ");
        sbA0x.append(this.A04);
        sbA0x.append(JavaProcFileReader.LS_SYMLINK_ARROW);
        sbA0x.append(this.A05);
        sbA0x.append(",initial velocity: ");
        sbA0x.append(this.A06);
        sbA0x.append(", duration: ");
        sbA0x.append(AEu() / 1000000);
        sbA0x.append(" ms,animationSpec: ");
        return C8j3.A14(this.A08, sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AOc<TT;>;LX/31w<TT;TV;>;TT;TT;TV;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public C0997AOa(AOc aOc, AOd aOd, C31w c31w, Object obj, Object obj2) {
        this.A08 = aOc.vectorize(c31w);
        this.A07 = c31w;
        this.A05 = obj2;
        this.A04 = obj;
        this.A02 = (V) AOl.A00(c31w, obj);
        this.A03 = (V) AOl.A00(this.A07, obj2);
        this.A06 = aOd != null ? (V) AOg.A00(aOd) : (V) AOl.A00(this.A07, obj).A03();
        this.A00 = -1L;
    }

    @Override // X.ATV
    public final /* synthetic */ boolean AOR(long j) {
        return j >= AEu();
    }
}
