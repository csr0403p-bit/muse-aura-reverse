package X;

/* loaded from: classes5.dex */
public abstract class CAH<DataType> implements DHp<DataType, DataType> {
    public DataType snapshot() {
        return null;
    }

    public static EtT A01(EtT etT, COt cOt, String str, int i) {
        EtT.A01(etT, Integer.valueOf(i), str);
        return cOt.AHg();
    }

    @Override // X.DHp
    public Class<DataType> getStartType() {
        return getSnapshotType();
    }

    public DataType start() {
        return snapshot();
    }

    public void stop(DataType datatype) {
    }

    @Override // X.DHp
    public DataType snapshot(int i, int i2) {
        return snapshot();
    }

    @Override // X.DHp
    public DataType start(int i, int i2) {
        return snapshot();
    }
}
