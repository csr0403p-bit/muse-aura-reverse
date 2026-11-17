package X;

import androidx.media3.common.Timeline;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.MultimapBuilder$ArrayListSupplier;
import com.google.common.collect.Multimaps$CustomListMultimap;
import com.google.common.collect.NaturalOrdering;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.TreeMap;

/* renamed from: X.DhU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5377DhU implements InterfaceC5380DhX {
    public final E7C A00 = E7C.A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC5380DhX
    public final InterfaceC5441Dic[] A83(Timeline timeline, Dy6 dy6, InterfaceC5047DQt interfaceC5047DQt, C5378DhV[] c5378DhVArr) {
        int length;
        ImmutableList.Builder builder;
        ArrayList arrayListA0h = C3cG.A0h();
        int i = 0;
        while (true) {
            length = c5378DhVArr.length;
            if (i >= length) {
                break;
            }
            C5378DhV c5378DhV = c5378DhVArr[i];
            if (c5378DhV == null || c5378DhV.A01.length <= 1) {
                builder = null;
            } else {
                builder = ImmutableList.builder();
                builder.add((ImmutableList.Builder) new C5379DhW(0L, 0L));
            }
            arrayListA0h.add(builder);
            i++;
        }
        long[][] jArr = new long[length][];
        for (int i2 = 0; i2 < length; i2++) {
            C5378DhV c5378DhV2 = c5378DhVArr[i2];
            if (c5378DhV2 == null) {
                jArr[i2] = new long[0];
            } else {
                jArr[i2] = new long[c5378DhV2.A01.length];
                int i3 = 0;
                while (true) {
                    int[] iArr = c5378DhV2.A01;
                    if (i3 >= iArr.length) {
                        break;
                    }
                    long j = c5378DhV2.A00.A04[iArr[i3]].A05;
                    long[] jArr2 = jArr[i2];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i3] = j;
                    i3++;
                }
                Arrays.sort(jArr[i2]);
            }
        }
        int[] iArr2 = new int[length];
        long[] jArr3 = new long[length];
        for (int i4 = 0; i4 < length; i4++) {
            long[] jArr4 = jArr[i4];
            jArr3[i4] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        C5409Di4.A01(arrayListA0h, jArr3);
        TreeMap treeMap = new TreeMap(NaturalOrdering.A00);
        MultimapBuilder$ArrayListSupplier multimapBuilder$ArrayListSupplier = new MultimapBuilder$ArrayListSupplier();
        Multimaps$CustomListMultimap multimaps$CustomListMultimap = new Multimaps$CustomListMultimap();
        Preconditions.checkArgument(treeMap.isEmpty());
        ((AbstractMapBasedMultimap) multimaps$CustomListMultimap).A01 = treeMap;
        multimaps$CustomListMultimap.A00 = multimapBuilder$ArrayListSupplier;
        for (int i5 = 0; i5 < length; i5++) {
            long[] jArr5 = jArr[i5];
            if (jArr5.length > 1) {
                int length2 = jArr5.length;
                double[] dArr = new double[length2];
                int i6 = 0;
                while (true) {
                    long[] jArr6 = jArr[i5];
                    double dLog = 0.0d;
                    if (i6 >= jArr6.length) {
                        break;
                    }
                    long j2 = jArr6[i6];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i6] = dLog;
                    i6++;
                }
                int i7 = length2 - 1;
                double d = dArr[i7] - dArr[0];
                int i8 = 0;
                while (i8 < i7) {
                    double d2 = dArr[i8];
                    i8++;
                    multimaps$CustomListMultimap.AYl(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i8]) * 0.5d) - dArr[0]) / d), Integer.valueOf(i5));
                }
            }
        }
        Collection dOt = ((AbstractC5024DOu) multimaps$CustomListMultimap).A00;
        if (dOt == null) {
            dOt = new DOt(multimaps$CustomListMultimap);
            ((AbstractC5024DOu) multimaps$CustomListMultimap).A00 = dOt;
        }
        ImmutableList immutableListCopyOf = ImmutableList.copyOf(dOt);
        for (int i9 = 0; i9 < immutableListCopyOf.size(); i9++) {
            int iA0H = C8j4.A0H(immutableListCopyOf, i9);
            int i10 = iArr2[iA0H] + 1;
            iArr2[iA0H] = i10;
            jArr3[iA0H] = jArr[iA0H][i10];
            C5409Di4.A01(arrayListA0h, jArr3);
        }
        for (int i11 = 0; i11 < length; i11++) {
            if (arrayListA0h.get(i11) != null) {
                jArr3[i11] = jArr3[i11] * 2;
            }
        }
        C5409Di4.A01(arrayListA0h, jArr3);
        ImmutableList.Builder builder2 = ImmutableList.builder();
        for (int i12 = 0; i12 < arrayListA0h.size(); i12++) {
            ImmutableList.Builder builder3 = (ImmutableList.Builder) arrayListA0h.get(i12);
            builder2.add((ImmutableList.Builder) (builder3 == null ? ImmutableList.of() : builder3.build()));
        }
        ImmutableList immutableListBuild = builder2.build();
        InterfaceC5441Dic[] interfaceC5441DicArr = new InterfaceC5441Dic[length];
        for (int i13 = 0; i13 < length; i13++) {
            C5378DhV c5378DhV3 = c5378DhVArr[i13];
            if (c5378DhV3 != null && c5378DhV3.A01.length != 0) {
                interfaceC5441DicArr[i13] = c5378DhV3.A01.length == 1 ? new Di7(c5378DhV3.A00, new int[]{c5378DhV3.A01[0]}) : new C5409Di4(c5378DhV3.A00, this.A00, interfaceC5047DQt, (ImmutableList) immutableListBuild.get(i13), c5378DhV3.A01);
            }
        }
        return interfaceC5441DicArr;
    }
}
