package X;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.Fic, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8676Fic implements InterfaceC8790FkU, InterfaceC8789FkT {
    public final C8683Fij A04;
    public final Path A00 = AbstractC7607F5u.A0V();
    public final Path A02 = AbstractC7607F5u.A0V();
    public final Path A01 = AbstractC7607F5u.A0V();
    public final List<InterfaceC8790FkU> A03 = C3cG.A0h();

    @Override // X.InterfaceC8698Fiy
    public final void AdB(List<InterfaceC8698Fiy> list, List<InterfaceC8698Fiy> list2) {
        int i = 0;
        while (true) {
            List<InterfaceC8790FkU> list3 = this.A03;
            if (i >= list3.size()) {
                return;
            }
            list3.get(i).AdB(list, list2);
            i++;
        }
    }

    @Override // X.InterfaceC8790FkU
    public final Path AId() {
        Path.Op op;
        Matrix matrixA00;
        Matrix matrixA002;
        Path path = this.A01;
        path.reset();
        C8683Fij c8683Fij = this.A04;
        if (!c8683Fij.A01) {
            int iIntValue = c8683Fij.A00.intValue();
            if (iIntValue != 0) {
                if (iIntValue == 1) {
                    op = Path.Op.UNION;
                } else if (iIntValue == 2) {
                    op = Path.Op.REVERSE_DIFFERENCE;
                } else if (iIntValue == 3) {
                    op = Path.Op.INTERSECT;
                } else if (iIntValue == 4) {
                    op = Path.Op.XOR;
                }
                Path path2 = this.A02;
                path2.reset();
                Path path3 = this.A00;
                path3.reset();
                List<InterfaceC8790FkU> list = this.A03;
                for (int size = list.size() - 1; size >= 1; size--) {
                    InterfaceC8790FkU interfaceC8790FkU = list.get(size);
                    if (interfaceC8790FkU instanceof C8673FiZ) {
                        C8673FiZ c8673FiZ = (C8673FiZ) interfaceC8790FkU;
                        List<InterfaceC8790FkU> listA00 = c8673FiZ.A00();
                        for (int iA0J = AbstractC7607F5u.A0J(listA00, 1); iA0J >= 0; iA0J--) {
                            Path pathAId = listA00.get(iA0J).AId();
                            C8701Fj1 c8701Fj1 = c8673FiZ.A00;
                            if (c8701Fj1 != null) {
                                matrixA002 = c8701Fj1.A00();
                            } else {
                                matrixA002 = c8673FiZ.A02;
                                matrixA002.reset();
                            }
                            pathAId.transform(matrixA002);
                            path2.addPath(pathAId);
                        }
                    } else {
                        path2.addPath(interfaceC8790FkU.AId());
                    }
                }
                InterfaceC8790FkU interfaceC8790FkU2 = list.get(0);
                if (interfaceC8790FkU2 instanceof C8673FiZ) {
                    C8673FiZ c8673FiZ2 = (C8673FiZ) interfaceC8790FkU2;
                    List<InterfaceC8790FkU> listA002 = c8673FiZ2.A00();
                    for (int i = 0; i < listA002.size(); i++) {
                        Path pathAId2 = listA002.get(i).AId();
                        C8701Fj1 c8701Fj12 = c8673FiZ2.A00;
                        if (c8701Fj12 != null) {
                            matrixA00 = c8701Fj12.A00();
                        } else {
                            matrixA00 = c8673FiZ2.A02;
                            matrixA00.reset();
                        }
                        pathAId2.transform(matrixA00);
                        path3.addPath(pathAId2);
                    }
                } else {
                    path3.set(interfaceC8790FkU2.AId());
                }
                path.op(path3, path2, op);
                return path;
            }
            int i2 = 0;
            while (true) {
                List<InterfaceC8790FkU> list2 = this.A03;
                if (i2 >= list2.size()) {
                    break;
                }
                path.addPath(list2.get(i2).AId());
                i2++;
            }
        }
        return path;
    }

    public C8676Fic(C8683Fij c8683Fij) {
        this.A04 = c8683Fij;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC8789FkT
    public final void A2r(ListIterator<InterfaceC8698Fiy> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            InterfaceC8698Fiy interfaceC8698FiyPrevious = listIterator.previous();
            if (interfaceC8698FiyPrevious instanceof InterfaceC8790FkU) {
                this.A03.add(interfaceC8698FiyPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // X.InterfaceC8698Fiy
    public final String getName() {
        throw F60.createAndThrow();
    }
}
