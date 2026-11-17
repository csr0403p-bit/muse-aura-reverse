package com.facebook.aura.mobileconfig;

import X.BV4;
import X.BzX;
import X.C3143BzU;
import X.F18;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public final class AuraMobileConfigParams {
    public final F18<C3143BzU> provider = new F18() { // from class: com.facebook.aura.mobileconfig.AuraMobileConfigParams$provider$1
        public static void A00(InputStream inputStream) throws IOException {
            if (inputStream != null) {
                try {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        BzX.A00("Closeables", "Failed to close Closeable", e);
                    }
                } catch (IOException e2) {
                    throw BV4.A0N(e2);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:184:0x0324, code lost:
        
            r19.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:185:0x0327, code lost:
        
            if (r0 != false) goto L245;
         */
        /* JADX WARN: Code restructure failed: missing block: B:187:0x032f, code lost:
        
            throw X.BV4.A0c("Invalid paramsMapContent: no END marker found");
         */
        /* JADX WARN: Code restructure failed: missing block: B:192:0x0348, code lost:
        
            throw X.BV5.A0h("could not find configName in configs ", r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:198:0x0353, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:200:0x0358, code lost:
        
            throw X.BV4.A0e(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:292:?, code lost:
        
            throw X.BV5.A0h("could not find key in configs ", r9);
         */
        /* JADX WARN: Removed duplicated region for block: B:145:0x025b  */
        /* JADX WARN: Removed duplicated region for block: B:154:0x027a A[Catch: all -> 0x0349, TryCatch #3 {all -> 0x0349, blocks: (B:52:0x00fd, B:57:0x010a, B:60:0x0114, B:62:0x0125, B:64:0x012d, B:66:0x0136, B:68:0x013e, B:70:0x0146, B:74:0x0151, B:76:0x0159, B:79:0x0164, B:81:0x016c, B:87:0x017a, B:89:0x0184, B:91:0x018c, B:93:0x0192, B:189:0x0334, B:192:0x0348, B:94:0x019c, B:96:0x01a2, B:98:0x01aa, B:100:0x01b0, B:191:0x0342, B:101:0x01ba, B:104:0x01bf, B:105:0x01d9, B:107:0x01df, B:109:0x01e7, B:114:0x01f0, B:117:0x01fa, B:122:0x020f, B:124:0x0212, B:126:0x0220, B:129:0x022f, B:131:0x0235, B:139:0x0246, B:127:0x0227, B:142:0x024c, B:144:0x0254, B:146:0x025c, B:151:0x026b, B:153:0x0273, B:155:0x0280, B:158:0x0292, B:161:0x029a, B:163:0x029f, B:166:0x02b6, B:167:0x02ba, B:169:0x02c2, B:170:0x02c6, B:154:0x027a, B:120:0x0207, B:190:0x033b, B:172:0x02ce, B:175:0x02e3, B:177:0x02e6, B:179:0x02ee, B:180:0x02f4, B:181:0x031a), top: B:221:0x00fd, outer: #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:181:0x031a A[Catch: all -> 0x0349, TryCatch #3 {all -> 0x0349, blocks: (B:52:0x00fd, B:57:0x010a, B:60:0x0114, B:62:0x0125, B:64:0x012d, B:66:0x0136, B:68:0x013e, B:70:0x0146, B:74:0x0151, B:76:0x0159, B:79:0x0164, B:81:0x016c, B:87:0x017a, B:89:0x0184, B:91:0x018c, B:93:0x0192, B:189:0x0334, B:192:0x0348, B:94:0x019c, B:96:0x01a2, B:98:0x01aa, B:100:0x01b0, B:191:0x0342, B:101:0x01ba, B:104:0x01bf, B:105:0x01d9, B:107:0x01df, B:109:0x01e7, B:114:0x01f0, B:117:0x01fa, B:122:0x020f, B:124:0x0212, B:126:0x0220, B:129:0x022f, B:131:0x0235, B:139:0x0246, B:127:0x0227, B:142:0x024c, B:144:0x0254, B:146:0x025c, B:151:0x026b, B:153:0x0273, B:155:0x0280, B:158:0x0292, B:161:0x029a, B:163:0x029f, B:166:0x02b6, B:167:0x02ba, B:169:0x02c2, B:170:0x02c6, B:154:0x027a, B:120:0x0207, B:190:0x033b, B:172:0x02ce, B:175:0x02e3, B:177:0x02e6, B:179:0x02ee, B:180:0x02f4, B:181:0x031a), top: B:221:0x00fd, outer: #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:259:0x01d9 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0160  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x017a A[Catch: all -> 0x0349, TryCatch #3 {all -> 0x0349, blocks: (B:52:0x00fd, B:57:0x010a, B:60:0x0114, B:62:0x0125, B:64:0x012d, B:66:0x0136, B:68:0x013e, B:70:0x0146, B:74:0x0151, B:76:0x0159, B:79:0x0164, B:81:0x016c, B:87:0x017a, B:89:0x0184, B:91:0x018c, B:93:0x0192, B:189:0x0334, B:192:0x0348, B:94:0x019c, B:96:0x01a2, B:98:0x01aa, B:100:0x01b0, B:191:0x0342, B:101:0x01ba, B:104:0x01bf, B:105:0x01d9, B:107:0x01df, B:109:0x01e7, B:114:0x01f0, B:117:0x01fa, B:122:0x020f, B:124:0x0212, B:126:0x0220, B:129:0x022f, B:131:0x0235, B:139:0x0246, B:127:0x0227, B:142:0x024c, B:144:0x0254, B:146:0x025c, B:151:0x026b, B:153:0x0273, B:155:0x0280, B:158:0x0292, B:161:0x029a, B:163:0x029f, B:166:0x02b6, B:167:0x02ba, B:169:0x02c2, B:170:0x02c6, B:154:0x027a, B:120:0x0207, B:190:0x033b, B:172:0x02ce, B:175:0x02e3, B:177:0x02e6, B:179:0x02ee, B:180:0x02f4, B:181:0x031a), top: B:221:0x00fd, outer: #2 }] */
        @Override // X.F18
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final X.C3143BzU get() throws java.lang.IllegalAccessException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
            /*
                Method dump skipped, instructions count: 945
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.mobileconfig.AuraMobileConfigParams$provider$1.get():X.BzU");
        }
    };

    public final F18<C3143BzU> getProvider() {
        return this.provider;
    }
}
