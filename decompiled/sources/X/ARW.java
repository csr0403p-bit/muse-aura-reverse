package X;

/* loaded from: classes4.dex */
public final class ARW extends Ab8<ARa> {
    public static final ARW A00 = new ARW();

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        return new ARa();
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "minimumInteractiveComponentSize";
        asf.A02.A01("README", "Reserves at least 48.dp in size to disambiguate touch interactions if the element would measure smaller");
    }

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        return AnonymousClass002.A1Z(obj, this);
    }

    @Override // X.Ab8
    public final int hashCode() {
        return System.identityHashCode(this);
    }
}
