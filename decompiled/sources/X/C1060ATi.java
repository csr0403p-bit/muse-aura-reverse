package X;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;

/* renamed from: X.ATi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1060ATi<T> {
    public SnapshotStateList<T> A00;
    public SnapshotStateList<T> A01;

    public C1060ATi(List list, List list2) {
        if (C8j3.A0L(list, list2.size()) > 100) {
            AbstractC1061ATk.A00("Initial list of undo and redo operations have a size greater than the given capacity.");
            throw F60.createAndThrow();
        }
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList();
        snapshotStateList.addAll(list);
        this.A01 = snapshotStateList;
        SnapshotStateList<T> snapshotStateList2 = new SnapshotStateList();
        snapshotStateList2.addAll(list2);
        this.A00 = snapshotStateList2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1060ATi() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(c0881AGi, c0881AGi);
    }
}
