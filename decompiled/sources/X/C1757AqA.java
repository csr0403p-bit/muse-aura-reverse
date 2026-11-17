package X;

/* renamed from: X.AqA, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1757AqA extends Ab8<C1756Aq9> {
    public final /* synthetic */ ViewOnDragListenerC1755Aq8 A00;

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
    }

    public C1757AqA(ViewOnDragListenerC1755Aq8 viewOnDragListenerC1755Aq8) {
        this.A00 = viewOnDragListenerC1755Aq8;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        return this.A00.A02;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return this.A00.A02.hashCode();
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "RootDragAndDropNode";
    }

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        return AnonymousClass002.A1Z(obj, this);
    }
}
