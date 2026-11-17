package X;

import android.os.Build;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* loaded from: classes5.dex */
public final class DMZ {
    public static final DMZ A02;
    public final int A00;
    public final ImmutableSet<Integer> A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DMZ) {
                DMZ dmz = (DMZ) obj;
                if (this.A00 != dmz.A00 || !C6xC.A00(this.A01, dmz.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        DMZ dmz;
        if (Build.VERSION.SDK_INT >= 33) {
            DOG dog = new DOG();
            int i = 1;
            do {
                dog.A02(Integer.valueOf(Util.A00(i)));
                i++;
            } while (i <= 10);
            dmz = new DMZ(dog.build());
        } else {
            dmz = new DMZ();
        }
        A02 = dmz;
    }

    public final int hashCode() {
        return ((this.A00 + 62) * 31) + AnonymousClass006.A0D(this.A01);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AudioProfile[format=");
        sbA0x.append(2);
        sbA0x.append(", maxChannelCount=");
        sbA0x.append(this.A00);
        sbA0x.append(", channelMasks=");
        return BV8.A0u(this.A01, sbA0x);
    }

    public DMZ(Set set) {
        ImmutableSet<Integer> immutableSetA01 = ImmutableSet.A01(set);
        this.A01 = immutableSetA01;
        AbstractC7489Ext<Integer> it = immutableSetA01.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(C60Q.A03(it)));
        }
        this.A00 = iMax;
    }

    public DMZ() {
        this.A00 = 10;
        this.A01 = null;
    }
}
