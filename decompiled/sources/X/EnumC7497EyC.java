package X;

/* renamed from: X.EyC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC7497EyC implements InterfaceC2571Be0<String> {
    /* JADX INFO: Fake field, exist only in values array */
    FAILED("failed"),
    /* JADX INFO: Fake field, exist only in values array */
    SUCCEEDED("succeeded"),
    /* JADX INFO: Fake field, exist only in values array */
    TRIGGERED("triggered"),
    UNKNOWN("unknown");

    public final String mValue;

    @Override // X.InterfaceC2571Be0
    public final /* bridge */ /* synthetic */ String getValue() {
        return this.mValue;
    }

    EnumC7497EyC(String str) {
        this.mValue = str;
    }
}
