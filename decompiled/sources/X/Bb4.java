package X;

import android.util.Size;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Bb4 extends Bb5 {
    public final Size A00;
    public final Size A01;
    public final Size A02;
    public final Map<Integer, Size> A03;
    public final Map<Integer, Size> A04;
    public final Map<Integer, Size> A05;
    public final Map<Integer, Size> A06;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Bb5) {
                Bb4 bb4 = (Bb4) ((Bb5) obj);
                if (!this.A00.equals(bb4.A00) || !this.A05.equals(bb4.A05) || !this.A01.equals(bb4.A01) || !this.A04.equals(bb4.A04) || !this.A02.equals(bb4.A02) || !this.A03.equals(bb4.A03) || !this.A06.equals(bb4.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((BV6.A08(this.A02, (BV6.A08(this.A01, (((this.A00.hashCode() ^ 1000003) * 1000003) ^ this.A05.hashCode()) * 1000003) ^ this.A04.hashCode()) * 1000003) ^ this.A03.hashCode()) * 1000003) ^ this.A06.hashCode();
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("SurfaceSizeDefinition{analysisSize=");
        sbA0x.append(this.A00);
        sbA0x.append(", s720pSizeMap=");
        sbA0x.append(this.A05);
        sbA0x.append(", previewSize=");
        sbA0x.append(this.A01);
        sbA0x.append(", s1440pSizeMap=");
        sbA0x.append(this.A04);
        sbA0x.append(", recordSize=");
        sbA0x.append(this.A02);
        sbA0x.append(", maximumSizeMap=");
        sbA0x.append(this.A03);
        sbA0x.append(", ultraMaximumSizeMap=");
        return BV8.A0v(this.A06, sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/util/Size;Ljava/util/Map<Ljava/lang/Integer;Landroid/util/Size;>;Landroid/util/Size;Ljava/util/Map<Ljava/lang/Integer;Landroid/util/Size;>;Landroid/util/Size;Ljava/util/Map<Ljava/lang/Integer;Landroid/util/Size;>;Ljava/util/Map<Ljava/lang/Integer;Landroid/util/Size;>;)V */
    public Bb4(Size size, Size size2, Size size3, Map map, Map map2, Map map3, Map map4) {
        if (size == null) {
            throw BV4.A0a("Null analysisSize");
        }
        this.A00 = size;
        if (map == null) {
            throw BV4.A0a("Null s720pSizeMap");
        }
        this.A05 = map;
        if (size2 == null) {
            throw BV4.A0a("Null previewSize");
        }
        this.A01 = size2;
        if (map2 == null) {
            throw BV4.A0a("Null s1440pSizeMap");
        }
        this.A04 = map2;
        if (size3 == null) {
            throw BV4.A0a("Null recordSize");
        }
        this.A02 = size3;
        if (map3 == null) {
            throw BV4.A0a("Null maximumSizeMap");
        }
        this.A03 = map3;
        if (map4 == null) {
            throw BV4.A0a("Null ultraMaximumSizeMap");
        }
        this.A06 = map4;
    }
}
