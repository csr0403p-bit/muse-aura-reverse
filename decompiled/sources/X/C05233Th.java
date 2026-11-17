package X;

import java.util.List;
import kotlin.Unit;

/* renamed from: X.3Th, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05233Th extends AbstractC7559F3s implements G0U<AYU, Unit> {
    public final /* synthetic */ List<Integer> $crossAxisPositions;
    public final /* synthetic */ int $mainAxisLayoutSize;
    public final /* synthetic */ float $mainAxisSpacing;
    public final /* synthetic */ List<List<AZE>> $sequences;
    public final /* synthetic */ AXY $this_Layout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<Ljava/util/List<LX/AZE;>;>;LX/AXY;FILjava/util/List<Ljava/lang/Integer;>;)V */
    public C05233Th(AXY axy, List list, List list2, float f, int i) {
        super(1);
        this.$sequences = list;
        this.$this_Layout = axy;
        this.$mainAxisSpacing = f;
        this.$mainAxisLayoutSize = i;
        this.$crossAxisPositions = list2;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
        AYU ayu2 = ayu;
        List<List<AZE>> list = this.$sequences;
        AXY axy = this.$this_Layout;
        float f = this.$mainAxisSpacing;
        int i = this.$mainAxisLayoutSize;
        List<Integer> list2 = this.$crossAxisPositions;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List<AZE> list3 = list.get(i2);
            int size2 = list3.size();
            int[] iArr = new int[size2];
            int i3 = 0;
            while (i3 < size2) {
                iArr[i3] = list3.get(i3).A01 + (i3 < list3.size() + (-1) ? axy.Abr(f) : 0);
                i3++;
            }
            InterfaceC04981Yd interfaceC04981Yd = AcQ.A00;
            int[] iArr2 = new int[size2];
            for (int i4 = 0; i4 < size2; i4++) {
                iArr2[i4] = 0;
            }
            interfaceC04981Yd.A4l(axy, axy.getLayoutDirection(), iArr, iArr2, i);
            int size3 = list3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                ayu2.A0A(list3.get(i5), 0.0f, iArr2[i5], AnonymousClass001.A0F(list2.get(i2)));
            }
        }
        return Unit.INSTANCE;
    }
}
