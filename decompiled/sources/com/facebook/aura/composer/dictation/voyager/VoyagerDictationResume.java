package com.facebook.aura.composer.dictation.voyager;

import X.AIG;
import X.AIW;
import X.ATD;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC0903AHf;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BV4;
import X.C06827l3;
import X.C06H;
import X.C0924AIa;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.F60;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class VoyagerDictationResume {

    @Deprecated
    public static final int BYTES_PER_SAMPLE = 2;

    @Deprecated
    public static final long FALLBACK_MS = 3000;

    @Deprecated
    public static final int MAX_OVERLAP_WORDS = 12;

    @Deprecated
    public static final int MAX_REPLACED_WORDS = 2;
    public static final Map<String, Integer> NUMBER_WORDS;

    @Deprecated
    public static final long OVERLAP_MS = 2000;

    @Deprecated
    public static final long WINDOW_SECONDS = 120;
    public final long bytesPerSecond;
    public long capturedBytes;
    public long sessionStart;
    public long windowStart;
    public static final Companion Companion = new Companion();
    public static final C06827l3 WHITESPACE = C06827l3.A02("\\s+");
    public String committed = "";
    public final AIG<byte[]> window = new AIG<>();

    public final class Companion {
        public final Map<String, Integer> getNUMBER_WORDS() {
            return VoyagerDictationResume.NUMBER_WORDS;
        }

        public final C06827l3 getWHITESPACE() {
            return VoyagerDictationResume.WHITESPACE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final AIG<byte[]> begin(String str, long j) {
        C7384Etj.A0Y(str, 0);
        if (j != this.sessionStart) {
            this.committed = str;
            this.sessionStart = j;
        }
        AIG<byte[]> aig = new AIG<>();
        long j2 = this.windowStart;
        Iterator<byte[]> it = this.window.iterator();
        while (it.hasNext()) {
            byte[] next = it.next();
            int length = next.length;
            long j3 = length + j2;
            if (j3 > j) {
                if (j2 >= j) {
                    aig.addLast(next);
                } else {
                    aig.addLast(AbstractC0903AHf.A06(next, (int) (j - j2), length));
                }
            }
            j2 = j3;
        }
        return aig;
    }

    public final String joined(String str) {
        ArrayList arrayListA0P;
        C7384Etj.A0Y(str, 0);
        String str2 = this.committed;
        if (str2.length() == 0) {
            return str;
        }
        List<String> listWords = words(str2);
        List<String> listWords2 = words(str);
        if (listWords.isEmpty()) {
            return str;
        }
        if (listWords2.isEmpty()) {
            return this.committed;
        }
        List listA0a = AbstractC0878AGe.A0a(listWords2, 24);
        ArrayList arrayListA0m = AnonymousClass002.A0m(listA0a);
        Iterator it = listA0a.iterator();
        while (it.hasNext()) {
            arrayListA0m.add(normalized(AnonymousClass005.A0j(it)));
        }
        int i = 0;
        while (true) {
            if (i >= 3) {
                arrayListA0P = AbstractC0878AGe.A0P(listWords2, listWords);
                break;
            }
            List listA0d = AbstractC0878AGe.A0d(listWords, i);
            List listA0e = AbstractC0878AGe.A0e(listA0d, 12);
            ArrayList arrayListA0m2 = AnonymousClass002.A0m(listA0e);
            Iterator it2 = listA0e.iterator();
            while (it2.hasNext()) {
                arrayListA0m2.add(normalized(AnonymousClass005.A0j(it2)));
            }
            Integer numEndOfOverlap = endOfOverlap(arrayListA0m2, arrayListA0m, i == 0 ? 1 : 2);
            if (numEndOfOverlap != null) {
                arrayListA0P = AbstractC0878AGe.A0P(AbstractC0878AGe.A0Z(listWords2, numEndOfOverlap.intValue()), listA0d);
                break;
            }
            i++;
        }
        return C3cH.A0e(InviteCodeScratcherKt.CODE_SEPARATOR, arrayListA0P);
    }

    public final void remember(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        int length = bArr.length;
        if (length != 0) {
            this.window.addLast(bArr);
            long j = this.capturedBytes + length;
            this.capturedBytes = j;
            long j2 = j - (this.bytesPerSecond * 120);
            while (!this.window.isEmpty() && this.windowStart + this.window.A0T().length <= j2) {
                this.windowStart += this.window.removeFirst().length;
            }
        }
    }

    static {
        C0924AIa c0924AIa = new C0924AIa();
        int i = 0;
        int i2 = 0;
        List listA0i = C7BY.A0i("zero one two three four five six seven eight nine ten eleven twelve thirteen fourteen fifteen sixteen seventeen eighteen nineteen", new String[]{InviteCodeScratcherKt.CODE_SEPARATOR}, 0);
        List listA0e = C7BY.A0e("twenty thirty forty fifty sixty seventy eighty ninety", InviteCodeScratcherKt.CODE_SEPARATOR);
        Iterator it = listA0i.iterator();
        while (true) {
            if (!it.hasNext()) {
                for (Object obj : listA0e) {
                    int i3 = i + 1;
                    if (i >= 0) {
                        String str = (String) obj;
                        int i4 = (i + 2) * 10;
                        c0924AIa.put(str, Integer.valueOf(i4));
                        int i5 = 1;
                        do {
                            c0924AIa.put(AnonymousClass006.A0y(listA0i.get(i5), str, C60O.A0w()), Integer.valueOf(i4 + i5));
                            i5++;
                        } while (i5 < 10);
                        i = i3;
                    }
                }
                NUMBER_WORDS = AIW.A0K(c0924AIa);
                return;
            }
            Object next = it.next();
            int i6 = i2 + 1;
            if (i2 < 0) {
                break;
            }
            c0924AIa.put(next, Integer.valueOf(i2));
            i2 = i6;
        }
        AbstractC0885AGm.A14();
        throw F60.createAndThrow();
    }

    private final List<String> words(String str) {
        List listA05 = WHITESPACE.A05(str);
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = listA05.iterator();
        while (it.hasNext()) {
            AnonymousClass007.A19(arrayListA0h, it);
        }
        return arrayListA0h;
    }

    public final void forgetAudio() {
        this.window.clear();
        this.windowStart = this.capturedBytes;
    }

    public final long getSessionStart() {
        return this.sessionStart;
    }

    public final long replayStart(Long l, boolean z) {
        long jLongValue;
        long j;
        long j2 = this.sessionStart;
        long j3 = this.windowStart;
        if (j2 >= j3) {
            return j2;
        }
        if (l == null) {
            if (z) {
                jLongValue = this.capturedBytes;
                j = 3000;
            }
            long jA07 = ATD.A07(j2, 0L, this.capturedBytes);
            return Math.max(jA07 - (jA07 % 2), j3);
        }
        jLongValue = l.longValue();
        j = 2000;
        j2 = jLongValue - ((this.bytesPerSecond * j) / 1000);
        long jA072 = ATD.A07(j2, 0L, this.capturedBytes);
        return Math.max(jA072 - (jA072 % 2), j3);
    }

    public VoyagerDictationResume(long j) {
        this.bytesPerSecond = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r4 = r4 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r4 >= r9.size()) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (X.C7384Etj.areEqual(r9.get(r4), X.AbstractC0878AGe.A0H(r5)) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        return java.lang.Integer.valueOf(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Integer endOfOverlap(java.util.List<java.lang.String> r8, java.util.List<java.lang.String> r9, int r10) {
        /*
            r7 = this;
            int r1 = r8.size()
            int r0 = r9.size()
            int r7 = java.lang.Math.min(r1, r0)
            if (r10 > r7) goto L82
        Le:
            java.util.List r5 = X.AbstractC0878AGe.A0e(r8, r7)
            r4 = 0
            r0 = 1
            r1 = 0
            if (r7 <= r0) goto L19
            r1 = 12
        L19:
            int r0 = r9.size()
            int r6 = X.C8j3.A0F(r0, r7, r1)
            if (r6 < 0) goto L78
        L23:
            X.ADq r1 = X.AbstractC0885AGm.A12(r5)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L4c
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4c
        L34:
            int r4 = r4 + r7
        L35:
            int r0 = r9.size()
            if (r4 >= r0) goto L7d
            java.lang.Object r1 = r9.get(r4)
            java.lang.Object r0 = X.AbstractC0878AGe.A0H(r5)
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L7d
            int r4 = r4 + 1
            goto L35
        L4c:
            java.util.Iterator r3 = r1.iterator()
        L50:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L34
            r0 = r3
            X.BNt r0 = (X.BNt) r0
            int r2 = r0.A00()
            java.lang.Object r0 = r5.get(r2)
            if (r0 == 0) goto L73
            java.lang.Object r1 = r5.get(r2)
            int r2 = r2 + r4
            java.lang.Object r0 = r9.get(r2)
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L73
            goto L50
        L73:
            if (r4 == r6) goto L78
            int r4 = r4 + 1
            goto L23
        L78:
            if (r7 == r10) goto L82
            int r7 = r7 + (-1)
            goto Le
        L7d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            return r0
        L82:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.dictation.voyager.VoyagerDictationResume.endOfOverlap(java.util.List, java.util.List, int):java.lang.Integer");
    }

    private final String normalized(String str) {
        String strA0u = AnonymousClass001.A0u(str);
        StringBuilder sbA0w = C60O.A0w();
        int length = strA0u.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = strA0u.charAt(i);
            if (Character.isLetterOrDigit(cCharAt)) {
                sbA0w.append(cCharAt);
            }
        }
        String string = sbA0w.toString();
        if (string.length() == 0) {
            return null;
        }
        Number numberA0b = BV4.A0b(string, NUMBER_WORDS);
        return numberA0b != null ? String.valueOf(numberA0b.intValue()) : string;
    }
}
