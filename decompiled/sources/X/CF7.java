package X;

import com.facebook.aura.activation.view.InviteCodeScratcherKt;

/* loaded from: classes5.dex */
public final class CF7 {
    public int A00;
    public long[] A01;

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("<LongStack vector:[");
        long[] jArr = this.A01;
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sbA0x.append(InviteCodeScratcherKt.CODE_SEPARATOR);
            }
            int i2 = this.A00;
            if (i == i2) {
                sbA0x.append(">>");
            }
            sbA0x.append(jArr[i]);
            if (i == i2) {
                sbA0x.append("<<");
            }
        }
        return AnonymousClass001.A0v("]>", sbA0x);
    }
}
