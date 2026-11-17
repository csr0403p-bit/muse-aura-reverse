package X;

import android.content.ComponentName;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.75P, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C75P {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final ComponentName A05;
    public final Context A06;
    public final C063975v A07;
    public final C75T A08;
    public final C75j A09;
    public final Integer A0A;
    public final AtomicBoolean A0B;
    public final AtomicInteger A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C75P) {
                C75P c75p = (C75P) obj;
                if (!C7384Etj.areEqual(this.A06, c75p.A06) || this.A00 != c75p.A00 || this.A0F != c75p.A0F || !C7384Etj.areEqual(this.A09, c75p.A09) || this.A01 != c75p.A01 || this.A0E != c75p.A0E || !C7384Etj.areEqual(this.A0C, c75p.A0C) || !C7384Etj.areEqual(this.A08, c75p.A08) || !C7384Etj.areEqual(this.A0B, c75p.A0B) || this.A04 != c75p.A04 || this.A03 != c75p.A03 || this.A02 != c75p.A02 || this.A0D != c75p.A0D || !C7384Etj.areEqual(this.A0A, c75p.A0A) || !C7384Etj.areEqual(this.A05, c75p.A05) || !C7384Etj.areEqual(this.A07, c75p.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final C75P A00() {
        Context context = this.A06;
        int i = this.A00;
        boolean z = this.A0F;
        C75j c75j = this.A09;
        int i2 = this.A01;
        boolean z2 = this.A0E;
        AtomicInteger atomicInteger = this.A0C;
        C75T c75t = this.A08;
        AtomicBoolean atomicBoolean = this.A0B;
        long j = this.A04;
        int i3 = this.A03;
        int i4 = this.A02;
        return new C75P(this.A05, context, this.A07, c75t, c75j, this.A0A, atomicBoolean, atomicInteger, i, i2, i3, i4, j, z, z2, true);
    }

    public final C75P A01(C75T c75t, int i) {
        Context context = this.A06;
        int i2 = this.A00;
        boolean z = this.A0F;
        C75j c75j = this.A09;
        boolean z2 = this.A0E;
        AtomicInteger atomicInteger = this.A0C;
        AtomicBoolean atomicBoolean = this.A0B;
        long j = this.A04;
        int i3 = this.A03;
        int i4 = this.A02;
        boolean z3 = this.A0D;
        return new C75P(this.A05, context, this.A07, c75t, c75j, this.A0A, atomicBoolean, atomicInteger, i2, i, i3, i4, j, z, z2, z3);
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A07, (((C0KA.A01((((C60R.A00(this.A04, AnonymousClass005.A0F(this.A0B, AnonymousClass005.A0F(this.A08, AnonymousClass005.A0F(this.A0C, C0KA.A01((((C0KA.A01((AnonymousClass005.A0E(this.A06) + this.A00) * 31, this.A0F) + AnonymousClass006.A0D(this.A09)) * 31) + this.A01) * 31, this.A0E))))) + this.A03) * 31) + this.A02) * 31, this.A0D) + AnonymousClass006.A0D(this.A0A)) * 31) + C3cH.A02(this.A05)) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("TranslationContext(context=");
        sbA0x.append(this.A06);
        sbA0x.append(", appWidgetId=");
        sbA0x.append(this.A00);
        sbA0x.append(", isRtl=");
        sbA0x.append(this.A0F);
        sbA0x.append(", layoutConfiguration=");
        sbA0x.append(this.A09);
        sbA0x.append(", itemPosition=");
        sbA0x.append(this.A01);
        sbA0x.append(", isLazyCollectionDescendant=");
        sbA0x.append(this.A0E);
        sbA0x.append(", lastViewId=");
        sbA0x.append(this.A0C);
        sbA0x.append(", parentContext=");
        sbA0x.append(this.A08);
        sbA0x.append(", isBackgroundSpecified=");
        sbA0x.append(this.A0B);
        sbA0x.append(", layoutSize=");
        sbA0x.append((Object) C73O.A01(this.A04));
        sbA0x.append(", layoutCollectionViewId=");
        sbA0x.append(this.A03);
        sbA0x.append(", layoutCollectionItemId=");
        sbA0x.append(this.A02);
        sbA0x.append(", canUseSelectableGroup=");
        sbA0x.append(this.A0D);
        sbA0x.append(", actionTargetId=");
        sbA0x.append(this.A0A);
        sbA0x.append(", actionBroadcastReceiver=");
        sbA0x.append(this.A05);
        sbA0x.append(", glanceComponents=");
        return AnonymousClass007.A0Z(this.A07, sbA0x);
    }

    public C75P(ComponentName componentName, Context context, C063975v c063975v, C75T c75t, C75j c75j, Integer num, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, int i, int i2, int i3, int i4, long j, boolean z, boolean z2, boolean z3) {
        this.A06 = context;
        this.A00 = i;
        this.A0F = z;
        this.A09 = c75j;
        this.A01 = i2;
        this.A0E = z2;
        this.A0C = atomicInteger;
        this.A08 = c75t;
        this.A0B = atomicBoolean;
        this.A04 = j;
        this.A03 = i3;
        this.A02 = i4;
        this.A0D = z3;
        this.A0A = num;
        this.A05 = componentName;
        this.A07 = c063975v;
    }
}
