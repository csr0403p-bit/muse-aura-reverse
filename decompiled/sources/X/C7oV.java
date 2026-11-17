package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/* renamed from: X.7oV, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7oV {
    public static InterfaceC07167oS A00;
    public static final C7oN<Object> A01;
    public static final InterfaceC07167oS A02;
    public static final InterfaceC07167oS A03 = new InterfaceC07167oS() { // from class: X.7oU
        @Override // X.InterfaceC07167oS
        public final C7oL[] AEY() {
            return new C7oL[0];
        }

        @Override // X.InterfaceC07167oS
        public final C07147oQ[] AGe() {
            return new C07147oQ[0];
        }

        @Override // X.InterfaceC07167oS
        public final boolean AfN() {
            return false;
        }
    };

    static {
        InterfaceC07167oS interfaceC07167oS = new InterfaceC07167oS() { // from class: X.7oR
            @Override // X.InterfaceC07167oS
            public final C7oL[] AEY() {
                return C7oV.A02().AEY();
            }

            @Override // X.InterfaceC07167oS
            public final C07147oQ[] AGe() {
                return C7oV.A02().AGe();
            }

            @Override // X.InterfaceC07167oS
            public final boolean AfN() {
                return C7oV.A02().AfN();
            }
        };
        A02 = interfaceC07167oS;
        A01 = new C7oN<>(interfaceC07167oS);
    }

    public static SharedPreferences A00(Context context) {
        try {
            return context.getSharedPreferences("com.facebook.secure.switchoff", 0);
        } catch (Throwable th) {
            Log.w("DefaultSwitchOffs", "Could not load SharedPreferences", th);
            return null;
        }
    }

    public static synchronized C7oN<Object> A01() {
        return A01;
    }

    public static synchronized InterfaceC07167oS A02() {
        InterfaceC07167oS interfaceC07167oS;
        interfaceC07167oS = A00;
        if (interfaceC07167oS == null) {
            throw new IllegalStateException();
        }
        return interfaceC07167oS;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x010f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067 A[Catch: all -> 0x01a1, PHI: r3
  0x0067: PHI (r3v3 android.content.SharedPreferences) = 
  (r3v1 android.content.SharedPreferences)
  (r3v0 android.content.SharedPreferences)
  (r3v6 android.content.SharedPreferences)
 binds: [B:24:0x0059, B:17:0x003b, B:10:0x001c] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x01a1, blocks: (B:7:0x0010, B:9:0x0018, B:11:0x001e, B:25:0x0067, B:26:0x007b, B:28:0x0081, B:29:0x0085, B:31:0x008c, B:66:0x0128, B:68:0x0137, B:69:0x0140, B:71:0x0146, B:73:0x0154, B:74:0x0157, B:76:0x015d, B:77:0x0160, B:78:0x016f, B:80:0x0175, B:81:0x0185, B:82:0x018e, B:33:0x0095, B:35:0x00a0, B:37:0x00a8, B:38:0x00ad, B:58:0x0107, B:39:0x00b0, B:59:0x010a, B:63:0x011c, B:51:0x00d9, B:52:0x00de, B:57:0x0101, B:55:0x00e6, B:56:0x00eb, B:62:0x0115, B:46:0x00c5, B:48:0x00cb, B:60:0x010f, B:32:0x0090, B:65:0x011e, B:12:0x0027, B:14:0x002d, B:16:0x0033, B:20:0x0043, B:24:0x0059, B:22:0x0050, B:18:0x003d), top: B:95:0x0010, outer: #2, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081 A[Catch: IOException | IllegalArgumentException -> 0x011d, all -> 0x01a1, TryCatch #1 {IOException | IllegalArgumentException -> 0x011d, blocks: (B:26:0x007b, B:28:0x0081, B:29:0x0085, B:31:0x008c, B:33:0x0095, B:35:0x00a0, B:37:0x00a8, B:38:0x00ad, B:58:0x0107, B:58:0x0107, B:39:0x00b0, B:59:0x010a, B:59:0x010a, B:63:0x011c, B:63:0x011c, B:51:0x00d9, B:52:0x00de, B:57:0x0101, B:57:0x0101, B:55:0x00e6, B:56:0x00eb, B:56:0x00eb, B:62:0x0115, B:62:0x0115, B:46:0x00c5, B:48:0x00cb, B:60:0x010f, B:60:0x010f, B:32:0x0090), top: B:96:0x007b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c A[Catch: IOException | IllegalArgumentException -> 0x011d, all -> 0x01a1, TryCatch #1 {IOException | IllegalArgumentException -> 0x011d, blocks: (B:26:0x007b, B:28:0x0081, B:29:0x0085, B:31:0x008c, B:33:0x0095, B:35:0x00a0, B:37:0x00a8, B:38:0x00ad, B:58:0x0107, B:58:0x0107, B:39:0x00b0, B:59:0x010a, B:59:0x010a, B:63:0x011c, B:63:0x011c, B:51:0x00d9, B:52:0x00de, B:57:0x0101, B:57:0x0101, B:55:0x00e6, B:56:0x00eb, B:56:0x00eb, B:62:0x0115, B:62:0x0115, B:46:0x00c5, B:48:0x00cb, B:60:0x010f, B:60:0x010f, B:32:0x0090), top: B:96:0x007b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090 A[Catch: IOException | IllegalArgumentException -> 0x011d, all -> 0x01a1, TryCatch #1 {IOException | IllegalArgumentException -> 0x011d, blocks: (B:26:0x007b, B:28:0x0081, B:29:0x0085, B:31:0x008c, B:33:0x0095, B:35:0x00a0, B:37:0x00a8, B:38:0x00ad, B:58:0x0107, B:58:0x0107, B:39:0x00b0, B:59:0x010a, B:59:0x010a, B:63:0x011c, B:63:0x011c, B:51:0x00d9, B:52:0x00de, B:57:0x0101, B:57:0x0101, B:55:0x00e6, B:56:0x00eb, B:56:0x00eb, B:62:0x0115, B:62:0x0115, B:46:0x00c5, B:48:0x00cb, B:60:0x010f, B:60:0x010f, B:32:0x0090), top: B:96:0x007b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095 A[Catch: IOException | IllegalArgumentException -> 0x011d, all -> 0x01a1, TryCatch #1 {IOException | IllegalArgumentException -> 0x011d, blocks: (B:26:0x007b, B:28:0x0081, B:29:0x0085, B:31:0x008c, B:33:0x0095, B:35:0x00a0, B:37:0x00a8, B:38:0x00ad, B:58:0x0107, B:58:0x0107, B:39:0x00b0, B:59:0x010a, B:59:0x010a, B:63:0x011c, B:63:0x011c, B:51:0x00d9, B:52:0x00de, B:57:0x0101, B:57:0x0101, B:55:0x00e6, B:56:0x00eb, B:56:0x00eb, B:62:0x0115, B:62:0x0115, B:46:0x00c5, B:48:0x00cb, B:60:0x010f, B:60:0x010f, B:32:0x0090), top: B:96:0x007b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb A[Catch: IOException | IllegalArgumentException -> 0x011d, all -> 0x01a1, TryCatch #1 {IOException | IllegalArgumentException -> 0x011d, blocks: (B:26:0x007b, B:28:0x0081, B:29:0x0085, B:31:0x008c, B:33:0x0095, B:35:0x00a0, B:37:0x00a8, B:38:0x00ad, B:58:0x0107, B:58:0x0107, B:39:0x00b0, B:59:0x010a, B:59:0x010a, B:63:0x011c, B:63:0x011c, B:51:0x00d9, B:52:0x00de, B:57:0x0101, B:57:0x0101, B:55:0x00e6, B:56:0x00eb, B:56:0x00eb, B:62:0x0115, B:62:0x0115, B:46:0x00c5, B:48:0x00cb, B:60:0x010f, B:60:0x010f, B:32:0x0090), top: B:96:0x007b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6 A[Catch: IOException | IllegalArgumentException -> 0x011d, all -> 0x01a1, TRY_LEAVE, TryCatch #1 {IOException | IllegalArgumentException -> 0x011d, blocks: (B:26:0x007b, B:28:0x0081, B:29:0x0085, B:31:0x008c, B:33:0x0095, B:35:0x00a0, B:37:0x00a8, B:38:0x00ad, B:58:0x0107, B:58:0x0107, B:39:0x00b0, B:59:0x010a, B:59:0x010a, B:63:0x011c, B:63:0x011c, B:51:0x00d9, B:52:0x00de, B:57:0x0101, B:57:0x0101, B:55:0x00e6, B:56:0x00eb, B:56:0x00eb, B:62:0x0115, B:62:0x0115, B:46:0x00c5, B:48:0x00cb, B:60:0x010f, B:60:0x010f, B:32:0x0090), top: B:96:0x007b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019c A[Catch: all -> 0x01a8, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x000c, B:83:0x0195, B:85:0x019c, B:87:0x01a2, B:88:0x01a5, B:7:0x0010, B:9:0x0018, B:11:0x001e, B:25:0x0067, B:26:0x007b, B:28:0x0081, B:29:0x0085, B:31:0x008c, B:66:0x0128, B:68:0x0137, B:69:0x0140, B:71:0x0146, B:73:0x0154, B:74:0x0157, B:76:0x015d, B:77:0x0160, B:78:0x016f, B:80:0x0175, B:81:0x0185, B:82:0x018e, B:33:0x0095, B:35:0x00a0, B:37:0x00a8, B:38:0x00ad, B:58:0x0107, B:39:0x00b0, B:59:0x010a, B:63:0x011c, B:51:0x00d9, B:52:0x00de, B:57:0x0101, B:55:0x00e6, B:56:0x00eb, B:62:0x0115, B:46:0x00c5, B:48:0x00cb, B:60:0x010f, B:32:0x0090, B:65:0x011e, B:12:0x0027, B:14:0x002d, B:16:0x0033, B:20:0x0043, B:24:0x0059, B:22:0x0050, B:18:0x003d), top: B:97:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void A03(android.content.Context r16) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7oV.A03(android.content.Context):void");
    }
}
