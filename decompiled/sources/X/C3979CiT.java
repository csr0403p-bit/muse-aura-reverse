package X;

import android.content.Context;
import com.facebook.pushlite.model.PushInfraMetaData;

/* renamed from: X.CiT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3979CiT extends C06G {
    public Integer A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final C3972CiK A07;
    public final PushInfraMetaData A08;
    public final InterfaceC3985Cia A09;
    public final InterfaceC3985Cia A0A;
    public final Integer A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;

    public C3979CiT(Context context, C3972CiK c3972CiK, PushInfraMetaData pushInfraMetaData, InterfaceC3985Cia interfaceC3985Cia, InterfaceC3985Cia interfaceC3985Cia2, Integer num, Integer num2, String str, String str2, String str3, String str4, int i, int i2, boolean z, boolean z2, boolean z3) {
        C7384Etj.A0Y(pushInfraMetaData, 3);
        this.A06 = context;
        this.A0A = interfaceC3985Cia;
        this.A09 = interfaceC3985Cia2;
        this.A08 = pushInfraMetaData;
        this.A0F = str;
        this.A00 = num;
        this.A03 = z;
        this.A02 = z2;
        this.A0E = str2;
        this.A0D = str3;
        this.A0C = str4;
        this.A01 = z3;
        this.A05 = i;
        this.A04 = i2;
        this.A07 = c3972CiK;
        this.A0B = num2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3979CiT) {
                C3979CiT c3979CiT = (C3979CiT) obj;
                if (!C7384Etj.areEqual(this.A06, c3979CiT.A06) || !C7384Etj.areEqual(this.A0A, c3979CiT.A0A) || !C7384Etj.areEqual(this.A09, c3979CiT.A09) || !C7384Etj.areEqual(this.A08, c3979CiT.A08) || !C7384Etj.areEqual(this.A0F, c3979CiT.A0F) || !C7384Etj.areEqual(this.A00, c3979CiT.A00) || this.A03 != c3979CiT.A03 || this.A02 != c3979CiT.A02 || !C7384Etj.areEqual(this.A0E, c3979CiT.A0E) || !C7384Etj.areEqual(this.A0D, c3979CiT.A0D) || !C7384Etj.areEqual(this.A0C, c3979CiT.A0C) || this.A01 != c3979CiT.A01 || this.A05 != c3979CiT.A05 || this.A04 != c3979CiT.A04 || !C7384Etj.areEqual(this.A07, c3979CiT.A07) || !C7384Etj.areEqual(this.A0B, c3979CiT.A0B)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0F(this.A07, (((C0KA.A01((((((C0KA.A01(C0KA.A01((AnonymousClass005.A0I(this.A0F, AnonymousClass005.A0F(this.A08, (((AnonymousClass005.A0E(this.A06) + AnonymousClass006.A0D(this.A0A)) * 31) + AnonymousClass006.A0D(this.A09)) * 31)) + AnonymousClass006.A0D(this.A00)) * 31, this.A03), this.A02) + AnonymousClass006.A0G(this.A0E)) * 31) + AnonymousClass006.A0G(this.A0D)) * 31) + AnonymousClass006.A0G(this.A0C)) * 31, this.A01) + this.A05) * 31) + this.A04) * 31) + C3cH.A02(this.A0B);
    }
}
