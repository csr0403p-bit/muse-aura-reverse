package X;

import androidx.media3.common.Timeline;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.E5g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6428E5g extends AbstractC6427E5f {
    public final int A00;
    public final int A01;
    public final HashMap<Object, Integer> A02;
    public final int[] A03;
    public final int[] A04;
    public final Timeline[] A05;
    public final Object[] A06;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Collection<+LX/E5n;>;LX/E5p;)V */
    public C6428E5g(InterfaceC6437E5p interfaceC6437E5p, Collection collection) {
        Timeline[] timelineArr = new Timeline[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            timelineArr[i] = ((InterfaceC6435E5n) it.next()).ALh();
            i++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            objArr[i2] = ((InterfaceC6435E5n) it2.next()).AMD();
            i2++;
        }
        this(interfaceC6437E5p, timelineArr, objArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6428E5g(InterfaceC6437E5p interfaceC6437E5p, Timeline[] timelineArr, Object[] objArr) {
        super(interfaceC6437E5p);
        int i = 0;
        int length = timelineArr.length;
        this.A05 = timelineArr;
        this.A03 = new int[length];
        this.A04 = new int[length];
        this.A06 = objArr;
        this.A02 = BV4.A0u();
        int iA02 = 0;
        int iA01 = 0;
        int i2 = 0;
        while (i < length) {
            Timeline timeline = timelineArr[i];
            Timeline[] timelineArr2 = this.A05;
            timelineArr2[i2] = timeline;
            this.A04[i2] = iA02;
            this.A03[i2] = iA01;
            iA02 += timeline.A02();
            iA01 += timelineArr2[i2].A01();
            C8j4.A1O(objArr[i2], this.A02, i2);
            i++;
            i2++;
        }
        this.A01 = iA02;
        this.A00 = iA01;
    }
}
