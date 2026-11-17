package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;

/* renamed from: X.3Es, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3Es implements C3Ej {
    public final long A00;
    public final long A01;

    @Override // X.C3Ej
    public final C20Q<C3Eq> A6Z(C1BN<Integer> c1bn) {
        return GDB.A01(new C3Et(new C05363bi(null), AbstractC05633ui.A00(new C3Er(null, this), c1bn)));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [E[], java.lang.Object[]] */
    public final String toString() {
        AII aii = new AII();
        aii.backing = new Object[2];
        long j = this.A01;
        if (j > 0) {
            aii.add(FGI.A0J("stopTimeout=", j, "ms"));
        }
        long j2 = this.A00;
        if (j2 < LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            aii.add(FGI.A0J("replayExpiration=", j2, "ms"));
        }
        return FGI.A0N("SharingStarted.WhileSubscribed(", AbstractC0878AGe.A0L(", ", "", "", AIM.A18(aii), null), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3Es) {
            C3Es c3Es = (C3Es) obj;
            if (this.A01 == c3Es.A01 && this.A00 == c3Es.A00) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((int) this.A01) * 31;
        long j = this.A00;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public C3Es(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
        if (j < 0) {
            throw new IllegalArgumentException(FGI.A0J("stopTimeout(", j, " ms) cannot be negative"));
        }
        if (j2 < 0) {
            throw new IllegalArgumentException(FGI.A0J("replayExpiration(", j2, " ms) cannot be negative"));
        }
    }
}
