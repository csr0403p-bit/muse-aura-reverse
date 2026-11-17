package X;

/* loaded from: classes5.dex */
public final class BZR extends AH7<String> {
    public final /* synthetic */ C06847l8 A00;

    public BZR(C06847l8 c06847l8) {
        this.A00 = c06847l8;
    }

    @Override // X.AbstractC0890AGr
    public final int A0D() {
        return this.A00.A01.groupCount() + 1;
    }

    @Override // X.AbstractC0890AGr, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains(obj);
        }
        return false;
    }

    @Override // X.AH7, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        String strGroup = this.A00.A01.group(i);
        return strGroup == null ? "" : strGroup;
    }

    @Override // X.AH7, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf(obj);
        }
        return -1;
    }

    @Override // X.AH7, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf(obj);
        }
        return -1;
    }
}
