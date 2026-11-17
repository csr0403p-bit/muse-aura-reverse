package X;

import android.os.Build;
import com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore;
import java.time.Instant;
import java.time.ZoneOffset;

/* renamed from: X.Fwc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8999Fwc implements InterfaceC9020Fwx {
    public static final C8993FwW<Long> A06 = C8993FwW.A01(C79.A0P, "Steps", AuraMetaFRLSecureTokenStore.JSON_KEY_COUNT);
    public final long A00;
    public final C9086FyD A01;
    public final Instant A02;
    public final Instant A03;
    public final ZoneOffset A04;
    public final ZoneOffset A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8999Fwc) {
                C8999Fwc c8999Fwc = (C8999Fwc) obj;
                if (this.A00 != c8999Fwc.A00 || !this.A03.equals(c8999Fwc.A03) || !C7384Etj.areEqual(this.A05, c8999Fwc.A05) || !this.A02.equals(c8999Fwc.A02) || !C7384Etj.areEqual(this.A04, c8999Fwc.A04) || !this.A01.equals(c8999Fwc.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC9020Fwx
    public final Instant AFC() {
        return this.A02;
    }

    @Override // X.InterfaceC9020Fwx
    public final ZoneOffset AFE() {
        return this.A04;
    }

    @Override // X.InterfaceC9011Fwo
    public final C9086FyD AHf() {
        return this.A01;
    }

    @Override // X.InterfaceC9020Fwx
    public final Instant AKy() {
        return this.A03;
    }

    @Override // X.InterfaceC9020Fwx
    public final ZoneOffset AKz() {
        return this.A05;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, (AnonymousClass005.A0F(this.A02, (C3cI.A01(this.A00) + C60R.A01(this.A05)) * 31) + C8j4.A0E(this.A04, 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("StepsRecord(startTime=");
        AbstractC7608F5v.A1T(sbA0x, this.A03);
        AbstractC7608F5v.A1P(sbA0x, this.A05);
        AbstractC7608F5v.A1S(sbA0x, this.A02);
        sbA0x.append(this.A04);
        sbA0x.append(", count=");
        sbA0x.append(this.A00);
        sbA0x.append(", metadata=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    public C8999Fwc(C9086FyD c9086FyD, Instant instant, Instant instant2, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, long j) {
        this.A03 = instant;
        this.A05 = zoneOffset;
        this.A02 = instant2;
        this.A04 = zoneOffset2;
        this.A00 = j;
        this.A01 = c9086FyD;
        if (!instant.isBefore(instant2)) {
            throw AbstractC7608F5v.A0d();
        }
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC9045FxR.A01(this);
            return;
        }
        Long lValueOf = Long.valueOf(j);
        AbstractC8873Frm.A01(lValueOf, 1L, AuraMetaFRLSecureTokenStore.JSON_KEY_COUNT);
        AbstractC8873Frm.A02(lValueOf, 1000000L, AuraMetaFRLSecureTokenStore.JSON_KEY_COUNT);
    }
}
