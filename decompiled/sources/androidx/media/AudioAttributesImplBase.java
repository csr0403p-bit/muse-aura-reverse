package androidx.media;

import X.AnonymousClass001;
import X.BV6;
import X.C60O;
import X.FGI;
import android.util.SparseIntArray;

/* loaded from: classes5.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {
    public int A03 = 0;
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = -1;

    @Override // androidx.media.AudioAttributesImpl
    public final Object ACW() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.media.AudioAttributesImplBase
            r5 = 0
            if (r0 == 0) goto L2d
            androidx.media.AudioAttributesImplBase r7 = (androidx.media.AudioAttributesImplBase) r7
            int r1 = r6.A00
            int r0 = r7.A00
            if (r1 != r0) goto L2d
            int r4 = r6.A01
            int r3 = r7.A01
            int r2 = r7.A02
            r0 = -1
            if (r2 == r0) goto L2e
            r0 = 6
            if (r2 == r0) goto L3a
            r0 = 7
            if (r2 != r0) goto L1e
        L1c:
            r3 = r3 | 1
        L1e:
            r0 = r3 & 273(0x111, float:3.83E-43)
            if (r4 != r0) goto L2d
            int r1 = r6.A03
            int r0 = r7.A03
            if (r1 != r0) goto L2d
            int r0 = r6.A02
            if (r0 != r2) goto L2d
            r5 = 1
        L2d:
            return r5
        L2e:
            android.util.SparseIntArray r0 = androidx.media.AudioAttributesCompat.A01
            r1 = r3 & 1
            r0 = 1
            if (r1 == r0) goto L1c
            r1 = 4
            r0 = r3 & 4
            if (r0 != r1) goto L1e
        L3a:
            r3 = r3 | 4
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media.AudioAttributesImplBase.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return BV6.A0A(Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A03), Integer.valueOf(this.A02));
    }

    public final String toString() {
        String strA0H;
        StringBuilder sbA0x = C60O.A0x("AudioAttributesCompat:");
        int i = this.A02;
        if (i != -1) {
            sbA0x.append(" stream=");
            sbA0x.append(i);
            sbA0x.append(" derived");
        }
        sbA0x.append(" usage=");
        int i2 = this.A03;
        SparseIntArray sparseIntArray = AudioAttributesCompat.A01;
        switch (i2) {
            case 0:
                strA0H = "USAGE_UNKNOWN";
                break;
            case 1:
                strA0H = "USAGE_MEDIA";
                break;
            case 2:
                strA0H = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strA0H = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strA0H = "USAGE_ALARM";
                break;
            case 5:
                strA0H = "USAGE_NOTIFICATION";
                break;
            case 6:
                strA0H = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strA0H = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strA0H = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strA0H = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strA0H = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strA0H = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strA0H = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strA0H = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strA0H = "USAGE_GAME";
                break;
            case 15:
            default:
                strA0H = FGI.A0H("unknown usage ", i2);
                break;
            case 16:
                strA0H = "USAGE_ASSISTANT";
                break;
        }
        sbA0x.append(strA0H);
        sbA0x.append(" content=");
        sbA0x.append(this.A00);
        sbA0x.append(" flags=0x");
        return AnonymousClass001.A0v(Integer.toHexString(this.A01).toUpperCase(), sbA0x);
    }
}
