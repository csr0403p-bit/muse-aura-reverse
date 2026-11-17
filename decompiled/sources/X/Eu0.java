package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;

/* loaded from: classes5.dex */
public enum Eu0 implements InterfaceC2571Be0<String> {
    ATTEMPT(HatchCcvLoggingKt.EVENT_TYPE_ATTEMPT),
    FAILURE("failure"),
    SUCCESS("success");

    public final String mValue;

    @Override // X.InterfaceC2571Be0
    public final /* bridge */ /* synthetic */ String getValue() {
        return this.mValue;
    }

    Eu0(String str) {
        this.mValue = str;
    }
}
