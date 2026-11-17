package X;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class BHQ implements Iterable<String>, BOA {
    public final /* synthetic */ C9iZ A00;

    public BHQ(C9iZ c9iZ) {
        this.A00 = c9iZ;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new BT4(this.A00);
    }
}
