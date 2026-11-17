package com.facebook.aura.mobileconfig.emergencypush;

import X.AnonymousClass004;
import X.BV5;
import X.BV8;
import X.C3cG;
import X.C4992DKo;
import X.C4994DKs;
import X.C4995DKw;
import X.C60Q;
import X.C7384Etj;
import X.CFK;
import X.DKr;
import X.DKu;
import X.DRZ;
import X.DSU;
import com.facebook.aura.mobileconfig.emergencypush.MC;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes5.dex */
public final class AuraMobileConfigEmergencyPushHandler {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C4994DKs decide(int r12, X.DKu r13, X.DRZ r14) {
        /*
            r11 = this;
            r9 = r12
            X.DSU r3 = r14.A07(r12)
            java.util.Map r0 = r3.getEmergencyPushInfo()
            if (r0 != 0) goto Ld
            r2 = 0
            return r2
        Ld:
            int r5 = r13.A01
            java.lang.Object r0 = X.BV5.A0f(r0, r5)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L5e
            int r7 = r0.intValue()
        L1b:
            X.DSU r4 = r14.A08(r12)
            int r8 = r13.A03
            if (r7 >= r8) goto L32
            java.util.Set<java.lang.Long> r1 = r13.A00
            X.C7384Etj.A0T(r1)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L3f
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L3f
        L32:
            r12 = 0
        L33:
            boolean r10 = r13.A05
            int r6 = r13.A02
            boolean r11 = r13.A04
            X.DKs r2 = new X.DKs
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r2
        L3f:
            java.util.Iterator r2 = r1.iterator()
        L43:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            X.C7384Etj.A0X(r0)
            long r0 = r0.longValue()
            boolean r0 = r11.isSameValue(r0, r3, r4)
            if (r0 != 0) goto L43
            r12 = 1
            goto L33
        L5e:
            r7 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.mobileconfig.emergencypush.AuraMobileConfigEmergencyPushHandler.decide(int, X.DKu, X.DRZ):X.DKs");
    }

    private final boolean isSameValue(long j, DSU dsu, DSU dsu2) {
        int i;
        int iA04 = BV8.A04(j);
        if (iA04 != 1) {
            if (iA04 != 2) {
                if (iA04 == 3) {
                    C4992DKo c4992DKo = C4992DKo.A06;
                    return C7384Etj.areEqual(dsu.getStringWithOptions(j, c4992DKo), dsu2.getStringWithOptions(j, c4992DKo));
                }
                if (iA04 == 4) {
                    C4992DKo c4992DKo2 = C4992DKo.A06;
                    i = (dsu.getDoubleWithOptions(j, c4992DKo2) > dsu2.getDoubleWithOptions(j, c4992DKo2) ? 1 : (dsu.getDoubleWithOptions(j, c4992DKo2) == dsu2.getDoubleWithOptions(j, c4992DKo2) ? 0 : -1));
                }
                return true;
            }
            C4992DKo c4992DKo3 = C4992DKo.A06;
            i = (dsu.getLongWithOptions(j, c4992DKo3) > dsu2.getLongWithOptions(j, c4992DKo3) ? 1 : (dsu.getLongWithOptions(j, c4992DKo3) == dsu2.getLongWithOptions(j, c4992DKo3) ? 0 : -1));
            if (i == 0) {
                return true;
            }
        } else {
            C4992DKo c4992DKo4 = C4992DKo.A06;
            if (dsu.getBooleanWithOptions(j, c4992DKo4) == dsu2.getBooleanWithOptions(j, c4992DKo4)) {
                return true;
            }
        }
        return false;
    }

    public boolean onEpConfigChanged(C4995DKw c4995DKw, DRZ drz) {
        C4994DKs c4994DKsDecide;
        boolean zA1b = AnonymousClass004.A1b(c4995DKw, drz);
        if (!drz.getBoolean(MC.hatch_android.enable_emergency_push)) {
            return zA1b;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        LinkedHashSet linkedHashSetA0k2 = C3cG.A0k();
        int size = c4995DKw.A00.size();
        int iMin = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            int iKeyAt = c4995DKw.A00.keyAt(i);
            DKu dKuValueAt = c4995DKw.A00.valueAt(i);
            if (dKuValueAt != null && (c4994DKsDecide = decide(iKeyAt, dKuValueAt, drz)) != null) {
                arrayListA0h.add(c4994DKsDecide);
                if (!c4994DKsDecide.A0A) {
                    continue;
                } else if (dKuValueAt.A05) {
                    C60Q.A1P(linkedHashSetA0k, dKuValueAt.A01);
                    iMin = Math.min(iMin, dKuValueAt.A02);
                } else if (dKuValueAt.A04) {
                    if (iKeyAt < 0 || iKeyAt >= drz.A0V.length()) {
                        CFK.A0H("MobileConfigFactoryImpl", "Cannot refresh config index(%d) from config caches", BV5.A1Y(iKeyAt));
                    } else {
                        synchronized (drz) {
                            drz.A0V.set(iKeyAt, null);
                            AtomicReferenceArray<DSU> atomicReferenceArray = drz.A0U;
                            if (atomicReferenceArray != null) {
                                atomicReferenceArray.set(iKeyAt, null);
                            }
                        }
                    }
                    C60Q.A1P(linkedHashSetA0k2, dKuValueAt.A01);
                } else {
                    continue;
                }
            }
        }
        boolean zIsEmpty = linkedHashSetA0k.isEmpty();
        boolean z = !zIsEmpty;
        if (zIsEmpty) {
            iMin = 0;
        }
        CFK.A02(Integer.valueOf(linkedHashSetA0k2.size()), Integer.valueOf(linkedHashSetA0k.size()), AuraMobileConfigEmergencyPushHandlerKt.TAG, "Emergency push applied: %d refreshed, %d requesting restart");
        AuraMobileConfigEmergencyPushLogger.INSTANCE.log(drz, new DKr(linkedHashSetA0k, linkedHashSetA0k2, iMin, iMin, z, z), arrayListA0h);
        if (!zIsEmpty && drz.getBoolean(MC.hatch_android.enable_emergency_push_restart)) {
            AuraMobileConfigEmergencyPushRestarter.INSTANCE.scheduleRestart(iMin, linkedHashSetA0k);
        }
        return z;
    }
}
