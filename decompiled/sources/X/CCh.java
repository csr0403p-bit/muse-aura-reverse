package X;

import android.net.Uri;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.util.NavigableSet;

/* loaded from: classes5.dex */
public final class CCh implements InterfaceC5923DsA {
    public final DDR A00;

    @Override // X.InterfaceC5923DsA
    public final long AE8(long j, long j2, String str) {
        long jMin;
        C0J c0jFloor;
        long jA00;
        long j3 = j2;
        C3157C0f c3157C0fA02 = this.A00.A02();
        if (c3157C0fA02 != null) {
            C0a c0a = c3157C0fA02.A00;
            if (c0a instanceof C0M) {
                C0M c0m = (C0M) c0a;
                if (!c0m.A02 || c0m.A0I) {
                    if (j < 0 || j3 == 0 || j3 < -1) {
                        return 0L;
                    }
                    if (j3 == -1) {
                        j3 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                    }
                    long j4 = j3;
                    synchronized (c0a) {
                        if (j3 == -1) {
                            j4 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                        }
                        C0H c0hA0D = C0a.A0D(c0m, str);
                        jA00 = c0hA0D != null ? c0hA0D.A00(j, j4) : -j4;
                    }
                    if (jA00 > 0) {
                        return Math.min(j3, jA00);
                    }
                    return 0L;
                }
            } else {
                C0N c0n = (C0N) c0a;
                if (!c0n.A03 || c0n.A0N) {
                    synchronized (c0a) {
                        jMin = 0;
                        if (j >= 0 && j3 != 0 && j3 >= -1) {
                            long j5 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                            if (j3 == -1) {
                                j3 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                            }
                            NavigableSet<C0J> navigableSet = ((C0a) c0n).A01.get(str);
                            if (navigableSet != null && (c0jFloor = navigableSet.floor(C0E.A02(str, j))) != null) {
                                long j6 = c0jFloor.A03;
                                long j7 = c0jFloor.A04;
                                long jMax = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                                if (j6 <= LinkEncryptedPairingKt.LINK_COUNTER_MAX - j7) {
                                    jMax = j7 + j6;
                                }
                                if (jMax > j) {
                                    if (j3 <= LinkEncryptedPairingKt.LINK_COUNTER_MAX - j) {
                                        j5 = j + j3;
                                    }
                                    if (jMax < j5) {
                                        for (C0J c0j : navigableSet.tailSet(c0jFloor, false)) {
                                            long j8 = c0j.A04;
                                            if (j8 > jMax) {
                                                break;
                                            }
                                            long j9 = c0j.A03;
                                            long j10 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                                            if (j9 <= LinkEncryptedPairingKt.LINK_COUNTER_MAX - j8) {
                                                j10 = j8 + j9;
                                            }
                                            jMax = Math.max(jMax, j10);
                                            if (jMax >= j5) {
                                                break;
                                            }
                                        }
                                    }
                                    jMin = Math.min(j3, jMax - j);
                                }
                            }
                        }
                    }
                    return jMin;
                }
            }
        }
        return -1L;
    }

    @Override // X.InterfaceC5923DsA
    public final boolean AOB(Uri uri, String str, String str2, long j, long j2) {
        C3157C0f c3157C0fA02 = this.A00.A02();
        if (c3157C0fA02 != null) {
            return c3157C0fA02.AOC(str, j, j2);
        }
        return false;
    }

    public CCh(DDR ddr) {
        this.A00 = ddr;
    }

    @Override // X.InterfaceC5923DsA
    public final void AeC(String str, String str2) {
    }
}
