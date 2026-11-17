package X;

import java.util.Map;

/* loaded from: classes5.dex */
public final class EfL implements C2eL {
    public final int A00;
    public final int A01;
    public final InterfaceC7034Eeg A02;
    public final Map<String, Object> A03;

    @Override // X.InterfaceC7071EfS
    public final Map<String, Object> getExtras() {
        return this.A03;
    }

    @Override // X.C2eL
    public final int getHeight() {
        return this.A00;
    }

    @Override // X.C2eL
    public final int getWidth() {
        return this.A01;
    }

    public EfL(InterfaceC7034Eeg interfaceC7034Eeg, Map map, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = interfaceC7034Eeg;
        this.A03 = map;
    }
}
