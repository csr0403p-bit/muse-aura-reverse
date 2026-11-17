package com.facebook.aura.gateway.store;

import X.A64;
import X.C0881AGi;
import X.C10571Hud;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9sU;
import X.F0C;
import X.Hr7;
import X.HsJ;
import com.facebook.aura.gateway.HatcheryVMIdUtilsKt;
import com.facebook.aura.gateway.HatchlingVmType;
import com.facebook.aura.json.HatchJsonKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class VmEntryV2JsonKt {
    public static final long LEGACY_MIGRATION_COMPLETED_AT_MS = 1792306800000L;
    public static final String MIGRATION_STATE_FAILED = "failed";
    public static final String MIGRATION_STATE_SUCCEEDED = "succeeded";

    public static final VmEntryV2Json cachedVmFor(String str, String str2) {
        VmEntryV2Json vmEntryV2Json = null;
        if (str2 == null || str2.length() == 0) {
            return null;
        }
        Iterator<VmEntryV2Json> it = decodeCachedVmList(str).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            VmEntryV2Json next = it.next();
            if (str2.equals(HatcheryVMIdUtilsKt.extractHatcheryVMId(next.vm_ws_url))) {
                vmEntryV2Json = next;
                break;
            }
        }
        return vmEntryV2Json;
    }

    public static final Long migrationCompletedAtMs(VmEntryV2Json vmEntryV2Json) {
        C7384Etj.A0Y(vmEntryV2Json, 0);
        Long lValueOf = vmEntryV2Json.migration_completed_at_ms;
        if (lValueOf == null || lValueOf.longValue() <= 0) {
            lValueOf = Long.valueOf(LEGACY_MIGRATION_COMPLETED_AT_MS);
            String str = vmEntryV2Json.migration_state;
            if (!"succeeded".equals(str) && !"failed".equals(str)) {
                return null;
            }
        }
        return lValueOf;
    }

    public static final List<VmEntryV2Json> decodeCachedVmList(String str) {
        Object c10571Hud;
        if (str == null || C7BY.A0j(str)) {
            return C0881AGi.A00;
        }
        try {
            C9sU c9sU = HatchJsonKt.HatchJson;
            F0C<C9hr<Object>>[] f0cArr = VmEntryV2Json.$childSerializers;
            c10571Hud = (List) c9sU.A00(str, new A64(VmEntryV2Json$$serializer.INSTANCE));
        } catch (Throwable th) {
            c10571Hud = new C10571Hud(th);
        }
        if (HsJ.A00(c10571Hud) != null) {
            c10571Hud = C0881AGi.A00;
        }
        Iterable iterable = (Iterable) c10571Hud;
        ArrayList arrayList = new ArrayList(Hr7.A1D(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(VmEntryV2Json.copy$default((VmEntryV2Json) it.next(), null, null, null, null, false, null, null, null, null, null, null, null, null, 831, null));
        }
        return arrayList;
    }

    public static final HatchlingVmType cachedVmTypeFor(String str, String str2) {
        VmEntryV2Json vmEntryV2JsonCachedVmFor = cachedVmFor(str, str2);
        if (vmEntryV2JsonCachedVmFor != null) {
            return HatchlingVmType.Companion.fromResponseWire(vmEntryV2JsonCachedVmFor.vm_type);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r2.hasNext() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r1 = r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (X.AnonymousClass003.A1X(r1, r6) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        r2 = r4.iterator();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T currentOrDefault(java.util.List<? extends T> r4, X.G0U<? super T, java.lang.Boolean> r5, X.G0U<? super T, java.lang.Boolean> r6) {
        /*
            X.AnonymousClass005.A0x(r4, r5, r6)
            java.util.Iterator r2 = r4.iterator()
        L7:
            boolean r0 = r2.hasNext()
            r3 = 0
            if (r0 == 0) goto L1a
            java.lang.Object r1 = r2.next()
            boolean r0 = X.AnonymousClass003.A1X(r1, r5)
            if (r0 == 0) goto L7
            if (r1 != 0) goto L2e
        L1a:
            java.util.Iterator r2 = r4.iterator()
        L1e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r1 = r2.next()
            boolean r0 = X.AnonymousClass003.A1X(r1, r6)
            if (r0 == 0) goto L1e
        L2e:
            return r1
        L2f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.store.VmEntryV2JsonKt.currentOrDefault(java.util.List, X.G0U, X.G0U):java.lang.Object");
    }
}
