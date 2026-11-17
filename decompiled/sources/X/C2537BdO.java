package X;

import android.content.Context;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import java.util.List;
import java.util.Map;

/* renamed from: X.BdO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2537BdO implements InterfaceC2541BdS {
    public final long A00;
    public final Context A01;
    public final Bb2 A02;
    public final C2538BdP A03;
    public final InterfaceC2794BlU A04;
    public final BjD A05;
    public final AbstractC2433BbJ A06;
    public final List<String> A07;
    public final Map<String, C2532BdJ> A08 = BV4.A0u();

    public final C2532BdJ A00(String str) throws CameraUnavailableException {
        try {
            Map<String, C2532BdJ> map = this.A08;
            C2532BdJ c2532BdJ = map.get(str);
            if (c2532BdJ != null) {
                return c2532BdJ;
            }
            C2532BdJ c2532BdJ2 = new C2532BdJ(this.A03, str);
            map.put(str, c2532BdJ2);
            return c2532BdJ2;
        } catch (CameraAccessExceptionCompat e) {
            throw AbstractC2494BcL.A00(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098 A[Catch: CameraUnavailableException -> 0x0123, CameraAccessExceptionCompat -> 0x012a, TryCatch #4 {CameraAccessExceptionCompat -> 0x012a, CameraUnavailableException -> 0x0123, blocks: (B:7:0x002c, B:8:0x0036, B:9:0x003c, B:11:0x0042, B:12:0x0046, B:14:0x004c, B:15:0x0050, B:17:0x0057, B:19:0x005f, B:21:0x0067, B:23:0x006e, B:32:0x008a, B:33:0x0092, B:35:0x0098, B:37:0x00a2, B:38:0x00aa, B:39:0x00b2, B:41:0x00b8, B:25:0x0079, B:56:0x011d, B:57:0x0122), top: B:69:0x002c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8 A[Catch: CameraUnavailableException -> 0x0123, CameraAccessExceptionCompat -> 0x012a, LOOP:3: B:39:0x00b2->B:41:0x00b8, LOOP_END, TRY_LEAVE, TryCatch #4 {CameraAccessExceptionCompat -> 0x012a, CameraUnavailableException -> 0x0123, blocks: (B:7:0x002c, B:8:0x0036, B:9:0x003c, B:11:0x0042, B:12:0x0046, B:14:0x004c, B:15:0x0050, B:17:0x0057, B:19:0x005f, B:21:0x0067, B:23:0x006e, B:32:0x008a, B:33:0x0092, B:35:0x0098, B:37:0x00a2, B:38:0x00aa, B:39:0x00b2, B:41:0x00b8, B:25:0x0079, B:56:0x011d, B:57:0x0122), top: B:69:0x002c, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2537BdO(android.content.Context r10, X.C2565Bdt r11, X.AbstractC2433BbJ r12, long r13) throws androidx.camera.core.InitializationException, androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2537BdO.<init>(android.content.Context, X.Bdt, X.BbJ, long):void");
    }
}
